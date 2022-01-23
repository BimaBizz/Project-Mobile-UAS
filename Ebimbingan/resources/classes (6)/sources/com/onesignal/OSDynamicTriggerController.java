package com.onesignal;

import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.resource.bitmap.TransformationUtils;
import com.onesignal.OSTrigger;
import com.onesignal.OneSignal;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimerTask;

class OSDynamicTriggerController {
    private static final long DEFAULT_LAST_IN_APP_TIME_AGO = 999999;
    private static final double REQUIRED_ACCURACY = 0.3d;
    private static Date sessionLaunchTime;
    /* access modifiers changed from: private */
    public final OSDynamicTriggerControllerObserver observer;
    /* access modifiers changed from: private */
    public final ArrayList<String> scheduledMessages;

    interface OSDynamicTriggerControllerObserver {
        void messageDynamicTriggerCompleted(String str);

        void messageTriggerConditionChanged();
    }

    static {
        Date date;
        new Date();
        sessionLaunchTime = date;
    }

    OSDynamicTriggerController(OSDynamicTriggerControllerObserver triggerObserver) {
        ArrayList<String> arrayList;
        new ArrayList<>();
        this.scheduledMessages = arrayList;
        this.observer = triggerObserver;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public boolean dynamicTriggerShouldFire(OSTrigger oSTrigger) {
        Date date;
        Date date2;
        TimerTask timerTask;
        OSTrigger trigger = oSTrigger;
        if (trigger.value == null) {
            return false;
        }
        ArrayList<String> arrayList = this.scheduledMessages;
        ArrayList<String> arrayList2 = arrayList;
        synchronized (arrayList) {
            try {
                if (!(trigger.value instanceof Number)) {
                    return false;
                }
                long currentTimeInterval = 0;
                switch (trigger.kind) {
                    case SESSION_TIME:
                        new Date();
                        currentTimeInterval = date2.getTime() - sessionLaunchTime.getTime();
                        break;
                    case TIME_SINCE_LAST_IN_APP:
                        if (!OneSignal.getInAppMessageController().isInAppMessageShowing()) {
                            Date lastTimeAppDismissed = OneSignal.getInAppMessageController().lastTimeInAppDismissed;
                            if (lastTimeAppDismissed != null) {
                                new Date();
                                currentTimeInterval = date.getTime() - lastTimeAppDismissed.getTime();
                                break;
                            } else {
                                currentTimeInterval = 999999;
                                break;
                            }
                        } else {
                            return false;
                        }
                }
                String triggerId = trigger.triggerId;
                long requiredTimeInterval = (long) (((Number) trigger.value).doubleValue() * 1000.0d);
                if (evaluateTimeIntervalWithOperator((double) requiredTimeInterval, (double) currentTimeInterval, trigger.operatorType)) {
                    this.observer.messageDynamicTriggerCompleted(triggerId);
                    return true;
                }
                long offset = requiredTimeInterval - currentTimeInterval;
                if (offset <= 0) {
                    return false;
                } else if (this.scheduledMessages.contains(triggerId)) {
                    return false;
                } else {
                    final String str = triggerId;
                    new TimerTask(this) {
                        final /* synthetic */ OSDynamicTriggerController this$0;

                        {
                            this.this$0 = this$0;
                        }

                        public void run() {
                            boolean remove = this.this$0.scheduledMessages.remove(str);
                            this.this$0.observer.messageTriggerConditionChanged();
                        }
                    };
                    OSDynamicTriggerTimer.scheduleTrigger(timerTask, triggerId, offset);
                    boolean add = this.scheduledMessages.add(triggerId);
                    return false;
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                ArrayList<String> arrayList3 = arrayList2;
                throw th2;
            }
        }
    }

    static void resetSessionLaunchTime() {
        Date date;
        new Date();
        sessionLaunchTime = date;
    }

    /* renamed from: com.onesignal.OSDynamicTriggerController$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$onesignal$OSTrigger$OSTriggerOperator = new int[OSTrigger.OSTriggerOperator.values().length];

        static {
            try {
                $SwitchMap$com$onesignal$OSTrigger$OSTriggerOperator[OSTrigger.OSTriggerOperator.LESS_THAN.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                NoSuchFieldError noSuchFieldError = e;
            }
            try {
                $SwitchMap$com$onesignal$OSTrigger$OSTriggerOperator[OSTrigger.OSTriggerOperator.LESS_THAN_OR_EQUAL_TO.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                NoSuchFieldError noSuchFieldError2 = e2;
            }
            try {
                $SwitchMap$com$onesignal$OSTrigger$OSTriggerOperator[OSTrigger.OSTriggerOperator.GREATER_THAN.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                NoSuchFieldError noSuchFieldError3 = e3;
            }
            try {
                $SwitchMap$com$onesignal$OSTrigger$OSTriggerOperator[OSTrigger.OSTriggerOperator.GREATER_THAN_OR_EQUAL_TO.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                NoSuchFieldError noSuchFieldError4 = e4;
            }
            try {
                $SwitchMap$com$onesignal$OSTrigger$OSTriggerOperator[OSTrigger.OSTriggerOperator.EQUAL_TO.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                NoSuchFieldError noSuchFieldError5 = e5;
            }
            try {
                $SwitchMap$com$onesignal$OSTrigger$OSTriggerOperator[OSTrigger.OSTriggerOperator.NOT_EQUAL_TO.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
                NoSuchFieldError noSuchFieldError6 = e6;
            }
            $SwitchMap$com$onesignal$OSTrigger$OSTriggerKind = new int[OSTrigger.OSTriggerKind.values().length];
            try {
                $SwitchMap$com$onesignal$OSTrigger$OSTriggerKind[OSTrigger.OSTriggerKind.SESSION_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
                NoSuchFieldError noSuchFieldError7 = e7;
            }
            try {
                $SwitchMap$com$onesignal$OSTrigger$OSTriggerKind[OSTrigger.OSTriggerKind.TIME_SINCE_LAST_IN_APP.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
                NoSuchFieldError noSuchFieldError8 = e8;
            }
        }
    }

    private static boolean evaluateTimeIntervalWithOperator(double d, double d2, OSTrigger.OSTriggerOperator oSTriggerOperator) {
        StringBuilder sb;
        double timeInterval = d;
        double currentTimeInterval = d2;
        OSTrigger.OSTriggerOperator operator = oSTriggerOperator;
        switch (AnonymousClass2.$SwitchMap$com$onesignal$OSTrigger$OSTriggerOperator[operator.ordinal()]) {
            case 1:
                return currentTimeInterval < timeInterval;
            case 2:
                return currentTimeInterval <= timeInterval || roughlyEqual(timeInterval, currentTimeInterval);
            case GifDecoder.STATUS_PARTIAL_DECODE:
                return currentTimeInterval > timeInterval;
            case 4:
                return currentTimeInterval >= timeInterval || roughlyEqual(timeInterval, currentTimeInterval);
            case 5:
                return roughlyEqual(timeInterval, currentTimeInterval);
            case TransformationUtils.PAINT_FLAGS:
                return !roughlyEqual(timeInterval, currentTimeInterval);
            default:
                OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.ERROR;
                new StringBuilder();
                OneSignal.onesignalLog(log_level, sb.append("Attempted to apply an invalid operator on a time-based in-app-message trigger: ").append(operator.toString()).toString());
                return false;
        }
    }

    private static boolean roughlyEqual(double left, double right) {
        return Math.abs(left - right) < REQUIRED_ACCURACY;
    }
}
