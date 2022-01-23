package com.onesignal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.resource.bitmap.TransformationUtils;
import com.microsoft.appcenter.utils.AppCenterLog;
import com.onesignal.OSDynamicTriggerController;
import com.onesignal.OSTrigger;
import com.onesignal.OneSignal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class OSTriggerController {
    OSDynamicTriggerController dynamicTriggerController;
    private final ConcurrentHashMap<String, Object> triggers;

    OSTriggerController(OSDynamicTriggerController.OSDynamicTriggerControllerObserver dynamicTriggerObserver) {
        ConcurrentHashMap<String, Object> concurrentHashMap;
        OSDynamicTriggerController oSDynamicTriggerController;
        new ConcurrentHashMap<>();
        this.triggers = concurrentHashMap;
        new OSDynamicTriggerController(dynamicTriggerObserver);
        this.dynamicTriggerController = oSDynamicTriggerController;
    }

    /* access modifiers changed from: package-private */
    public boolean evaluateMessageTriggers(@NonNull OSInAppMessage oSInAppMessage) {
        OSInAppMessage message = oSInAppMessage;
        if (message.triggers.size() == 0) {
            return true;
        }
        Iterator<ArrayList<OSTrigger>> it = message.triggers.iterator();
        while (it.hasNext()) {
            if (evaluateAndTriggers(it.next())) {
                return true;
            }
        }
        return false;
    }

    private boolean evaluateAndTriggers(@NonNull ArrayList<OSTrigger> andConditions) {
        Iterator<OSTrigger> it = andConditions.iterator();
        while (it.hasNext()) {
            if (!evaluateTrigger(it.next())) {
                return false;
            }
        }
        return true;
    }

    private boolean evaluateTrigger(@NonNull OSTrigger oSTrigger) {
        OSTrigger trigger = oSTrigger;
        if (trigger.kind == OSTrigger.OSTriggerKind.UNKNOWN) {
            return false;
        }
        if (trigger.kind != OSTrigger.OSTriggerKind.CUSTOM) {
            return this.dynamicTriggerController.dynamicTriggerShouldFire(trigger);
        }
        OSTrigger.OSTriggerOperator operatorType = trigger.operatorType;
        Object deviceValue = this.triggers.get(trigger.property);
        if (deviceValue == null) {
            if (operatorType == OSTrigger.OSTriggerOperator.NOT_EXISTS) {
                return true;
            }
            return operatorType == OSTrigger.OSTriggerOperator.NOT_EQUAL_TO && trigger.value != null;
        } else if (operatorType == OSTrigger.OSTriggerOperator.EXISTS) {
            return true;
        } else {
            if (operatorType == OSTrigger.OSTriggerOperator.NOT_EXISTS) {
                return false;
            }
            if (operatorType == OSTrigger.OSTriggerOperator.CONTAINS) {
                return (deviceValue instanceof Collection) && ((Collection) deviceValue).contains(trigger.value);
            } else if ((deviceValue instanceof String) && (trigger.value instanceof String) && triggerMatchesStringValue((String) trigger.value, (String) deviceValue, operatorType)) {
                return true;
            } else {
                if ((trigger.value instanceof Number) && (deviceValue instanceof Number) && triggerMatchesNumericValue((Number) trigger.value, (Number) deviceValue, operatorType)) {
                    return true;
                }
                if (triggerMatchesFlex(trigger.value, deviceValue, operatorType)) {
                    return true;
                }
                return false;
            }
        }
    }

    private boolean triggerMatchesStringValue(@NonNull String str, @NonNull String str2, @NonNull OSTrigger.OSTriggerOperator oSTriggerOperator) {
        StringBuilder sb;
        String triggerValue = str;
        String deviceValue = str2;
        OSTrigger.OSTriggerOperator operator = oSTriggerOperator;
        switch (operator) {
            case EQUAL_TO:
                return triggerValue.equals(deviceValue);
            case NOT_EQUAL_TO:
                return !triggerValue.equals(deviceValue);
            default:
                OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.ERROR;
                new StringBuilder();
                OneSignal.onesignalLog(log_level, sb.append("Attempted to use an invalid operator for a string trigger comparison: ").append(operator.toString()).toString());
                return false;
        }
    }

    private boolean triggerMatchesFlex(@Nullable Object obj, @NonNull Object obj2, @NonNull OSTrigger.OSTriggerOperator oSTriggerOperator) {
        Object triggerValue = obj;
        Object deviceValue = obj2;
        OSTrigger.OSTriggerOperator operator = oSTriggerOperator;
        if (triggerValue == null) {
            return false;
        }
        if (operator.checksEquality()) {
            return triggerMatchesStringValue(triggerValue.toString(), deviceValue.toString(), operator);
        }
        if (!(deviceValue instanceof String) || !(triggerValue instanceof Number)) {
            return false;
        }
        return triggerMatchesNumericValueFlex((Number) triggerValue, (String) deviceValue, operator);
    }

    private boolean triggerMatchesNumericValueFlex(@NonNull Number triggerValue, @NonNull String deviceValue, @NonNull OSTrigger.OSTriggerOperator operator) {
        try {
            return triggerMatchesNumericValue(Double.valueOf(triggerValue.doubleValue()), Double.valueOf(Double.parseDouble(deviceValue)), operator);
        } catch (NumberFormatException e) {
            NumberFormatException numberFormatException = e;
            return false;
        }
    }

    private boolean triggerMatchesNumericValue(@NonNull Number triggerValue, @NonNull Number deviceValue, @NonNull OSTrigger.OSTriggerOperator oSTriggerOperator) {
        StringBuilder sb;
        OSTrigger.OSTriggerOperator operator = oSTriggerOperator;
        double triggerDoubleValue = triggerValue.doubleValue();
        double deviceDoubleValue = deviceValue.doubleValue();
        switch (AnonymousClass1.$SwitchMap$com$onesignal$OSTrigger$OSTriggerOperator[operator.ordinal()]) {
            case 1:
                return deviceDoubleValue == triggerDoubleValue;
            case 2:
                return deviceDoubleValue != triggerDoubleValue;
            case GifDecoder.STATUS_PARTIAL_DECODE:
            case 4:
            case 5:
                OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.ERROR;
                new StringBuilder();
                OneSignal.onesignalLog(log_level, sb.append("Attempted to use an invalid operator with a numeric value: ").append(operator.toString()).toString());
                return false;
            case TransformationUtils.PAINT_FLAGS:
                return deviceDoubleValue < triggerDoubleValue;
            case 7:
                return deviceDoubleValue > triggerDoubleValue;
            case AppCenterLog.NONE:
                return deviceDoubleValue < triggerDoubleValue || deviceDoubleValue == triggerDoubleValue;
            case 9:
                return deviceDoubleValue > triggerDoubleValue || deviceDoubleValue == triggerDoubleValue;
            default:
                return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0028 A[LOOP:1: B:7:0x0028->B:22:0x0028, LOOP_END, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isTriggerOnMessage(com.onesignal.OSInAppMessage r12, java.util.Collection<java.lang.String> r13) {
        /*
            r11 = this;
            r0 = r11
            r1 = r12
            r2 = r13
            r9 = r1
            java.util.ArrayList<java.util.ArrayList<com.onesignal.OSTrigger>> r9 = r9.triggers
            if (r9 != 0) goto L_0x000b
            r9 = 0
            r0 = r9
        L_0x000a:
            return r0
        L_0x000b:
            r9 = r2
            java.util.Iterator r9 = r9.iterator()
            r3 = r9
        L_0x0011:
            r9 = r3
            boolean r9 = r9.hasNext()
            if (r9 == 0) goto L_0x0066
            r9 = r3
            java.lang.Object r9 = r9.next()
            java.lang.String r9 = (java.lang.String) r9
            r4 = r9
            r9 = r1
            java.util.ArrayList<java.util.ArrayList<com.onesignal.OSTrigger>> r9 = r9.triggers
            java.util.Iterator r9 = r9.iterator()
            r5 = r9
        L_0x0028:
            r9 = r5
            boolean r9 = r9.hasNext()
            if (r9 == 0) goto L_0x0065
            r9 = r5
            java.lang.Object r9 = r9.next()
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            r6 = r9
            r9 = r6
            java.util.Iterator r9 = r9.iterator()
            r7 = r9
        L_0x003d:
            r9 = r7
            boolean r9 = r9.hasNext()
            if (r9 == 0) goto L_0x0064
            r9 = r7
            java.lang.Object r9 = r9.next()
            com.onesignal.OSTrigger r9 = (com.onesignal.OSTrigger) r9
            r8 = r9
            r9 = r4
            r10 = r8
            java.lang.String r10 = r10.property
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0060
            r9 = r4
            r10 = r8
            java.lang.String r10 = r10.triggerId
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0063
        L_0x0060:
            r9 = 1
            r0 = r9
            goto L_0x000a
        L_0x0063:
            goto L_0x003d
        L_0x0064:
            goto L_0x0028
        L_0x0065:
            goto L_0x0011
        L_0x0066:
            r9 = 0
            r0 = r9
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.OSTriggerController.isTriggerOnMessage(com.onesignal.OSInAppMessage, java.util.Collection):boolean");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x001b A[LOOP:0: B:6:0x001b->B:20:0x001b, LOOP_END, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean messageHasOnlyDynamicTriggers(com.onesignal.OSInAppMessage r9) {
        /*
            r8 = this;
            r0 = r8
            r1 = r9
            r6 = r1
            java.util.ArrayList<java.util.ArrayList<com.onesignal.OSTrigger>> r6 = r6.triggers
            if (r6 == 0) goto L_0x0010
            r6 = r1
            java.util.ArrayList<java.util.ArrayList<com.onesignal.OSTrigger>> r6 = r6.triggers
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x0013
        L_0x0010:
            r6 = 0
            r0 = r6
        L_0x0012:
            return r0
        L_0x0013:
            r6 = r1
            java.util.ArrayList<java.util.ArrayList<com.onesignal.OSTrigger>> r6 = r6.triggers
            java.util.Iterator r6 = r6.iterator()
            r2 = r6
        L_0x001b:
            r6 = r2
            boolean r6 = r6.hasNext()
            if (r6 == 0) goto L_0x0052
            r6 = r2
            java.lang.Object r6 = r6.next()
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            r3 = r6
            r6 = r3
            java.util.Iterator r6 = r6.iterator()
            r4 = r6
        L_0x0030:
            r6 = r4
            boolean r6 = r6.hasNext()
            if (r6 == 0) goto L_0x0051
            r6 = r4
            java.lang.Object r6 = r6.next()
            com.onesignal.OSTrigger r6 = (com.onesignal.OSTrigger) r6
            r5 = r6
            r6 = r5
            com.onesignal.OSTrigger$OSTriggerKind r6 = r6.kind
            com.onesignal.OSTrigger$OSTriggerKind r7 = com.onesignal.OSTrigger.OSTriggerKind.CUSTOM
            if (r6 == r7) goto L_0x004d
            r6 = r5
            com.onesignal.OSTrigger$OSTriggerKind r6 = r6.kind
            com.onesignal.OSTrigger$OSTriggerKind r7 = com.onesignal.OSTrigger.OSTriggerKind.UNKNOWN
            if (r6 != r7) goto L_0x0050
        L_0x004d:
            r6 = 0
            r0 = r6
            goto L_0x0012
        L_0x0050:
            goto L_0x0030
        L_0x0051:
            goto L_0x001b
        L_0x0052:
            r6 = 1
            r0 = r6
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.OSTriggerController.messageHasOnlyDynamicTriggers(com.onesignal.OSInAppMessage):boolean");
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void addTriggers(Map<String, Object> map) {
        Map<String, Object> newTriggers = map;
        ConcurrentHashMap<String, Object> concurrentHashMap = this.triggers;
        ConcurrentHashMap<String, Object> concurrentHashMap2 = concurrentHashMap;
        synchronized (concurrentHashMap) {
            try {
                for (String key : newTriggers.keySet()) {
                    Object put = this.triggers.put(key, newTriggers.get(key));
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                ConcurrentHashMap<String, Object> concurrentHashMap3 = concurrentHashMap2;
                throw th2;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void removeTriggersForKeys(Collection<String> collection) {
        Collection<String> keys = collection;
        ConcurrentHashMap<String, Object> concurrentHashMap = this.triggers;
        ConcurrentHashMap<String, Object> concurrentHashMap2 = concurrentHashMap;
        synchronized (concurrentHashMap) {
            try {
                for (String key : keys) {
                    Object remove = this.triggers.remove(key);
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                ConcurrentHashMap<String, Object> concurrentHashMap3 = concurrentHashMap2;
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public Object getTriggerValue(String str) {
        String key = str;
        ConcurrentHashMap<String, Object> concurrentHashMap = this.triggers;
        ConcurrentHashMap<String, Object> concurrentHashMap2 = concurrentHashMap;
        synchronized (concurrentHashMap) {
            try {
                if (this.triggers.containsKey(key)) {
                    Object obj = this.triggers.get(key);
                    return obj;
                }
                return null;
            } catch (Throwable th) {
                Throwable th2 = th;
                ConcurrentHashMap<String, Object> concurrentHashMap3 = concurrentHashMap2;
                throw th2;
            }
        }
    }
}
