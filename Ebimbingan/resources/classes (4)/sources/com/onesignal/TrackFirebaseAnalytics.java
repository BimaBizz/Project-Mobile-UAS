package com.onesignal;

import android.content.Context;
import android.os.Bundle;
import com.onesignal.OneSignalDbContract;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicLong;

class TrackFirebaseAnalytics {
    private static final String EVENT_NOTIFICATION_INFLUENCE_OPEN = "os_notification_influence_open";
    private static final String EVENT_NOTIFICATION_OPENED = "os_notification_opened";
    private static final String EVENT_NOTIFICATION_RECEIVED = "os_notification_received";
    private static Class<?> FirebaseAnalyticsClass;
    private static AtomicLong lastOpenedTime;
    private static OSNotificationPayload lastReceivedPayload;
    private static AtomicLong lastReceivedTime;
    private Context appContext;
    private Object mFirebaseAnalyticsInstance;

    TrackFirebaseAnalytics(Context activity) {
        this.appContext = activity;
    }

    static boolean CanTrack() {
        try {
            FirebaseAnalyticsClass = Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException e) {
            ClassNotFoundException classNotFoundException = e;
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public void trackInfluenceOpenEvent() {
        Bundle bundle;
        if (lastReceivedTime != null && lastReceivedPayload != null) {
            long now = System.currentTimeMillis();
            if (now - lastReceivedTime.get() <= 120000) {
                if (lastOpenedTime == null || now - lastOpenedTime.get() >= 30000) {
                    try {
                        Object firebaseAnalyticsInstance = getFirebaseAnalyticsInstance(this.appContext);
                        Method trackMethod = getTrackMethod(FirebaseAnalyticsClass);
                        String event = EVENT_NOTIFICATION_INFLUENCE_OPEN;
                        new Bundle();
                        Bundle bundle2 = bundle;
                        bundle2.putString("source", "OneSignal");
                        bundle2.putString("medium", OneSignalDbContract.NotificationTable.TABLE_NAME);
                        bundle2.putString(OneSignalDbContract.NotificationTable.COLUMN_NAME_NOTIFICATION_ID, lastReceivedPayload.notificationID);
                        bundle2.putString("campaign", getCampaignNameFromPayload(lastReceivedPayload));
                        Object[] objArr = new Object[2];
                        objArr[0] = event;
                        Object[] objArr2 = objArr;
                        objArr2[1] = bundle2;
                        Object invoke = trackMethod.invoke(firebaseAnalyticsInstance, objArr2);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void trackOpenedEvent(OSNotificationOpenResult oSNotificationOpenResult) {
        Bundle bundle;
        AtomicLong atomicLong;
        OSNotificationOpenResult openResult = oSNotificationOpenResult;
        if (lastOpenedTime == null) {
            new AtomicLong();
            lastOpenedTime = atomicLong;
        }
        lastOpenedTime.set(System.currentTimeMillis());
        try {
            Object firebaseAnalyticsInstance = getFirebaseAnalyticsInstance(this.appContext);
            Method trackMethod = getTrackMethod(FirebaseAnalyticsClass);
            new Bundle();
            Bundle bundle2 = bundle;
            bundle2.putString("source", "OneSignal");
            bundle2.putString("medium", OneSignalDbContract.NotificationTable.TABLE_NAME);
            bundle2.putString(OneSignalDbContract.NotificationTable.COLUMN_NAME_NOTIFICATION_ID, openResult.notification.payload.notificationID);
            bundle2.putString("campaign", getCampaignNameFromPayload(openResult.notification.payload));
            Object[] objArr = new Object[2];
            objArr[0] = EVENT_NOTIFICATION_OPENED;
            Object[] objArr2 = objArr;
            objArr2[1] = bundle2;
            Object invoke = trackMethod.invoke(firebaseAnalyticsInstance, objArr2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    public void trackReceivedEvent(OSNotificationOpenResult oSNotificationOpenResult) {
        Bundle bundle;
        AtomicLong atomicLong;
        OSNotificationOpenResult receivedResult = oSNotificationOpenResult;
        try {
            Object firebaseAnalyticsInstance = getFirebaseAnalyticsInstance(this.appContext);
            Method trackMethod = getTrackMethod(FirebaseAnalyticsClass);
            new Bundle();
            Bundle bundle2 = bundle;
            bundle2.putString("source", "OneSignal");
            bundle2.putString("medium", OneSignalDbContract.NotificationTable.TABLE_NAME);
            bundle2.putString(OneSignalDbContract.NotificationTable.COLUMN_NAME_NOTIFICATION_ID, receivedResult.notification.payload.notificationID);
            bundle2.putString("campaign", getCampaignNameFromPayload(receivedResult.notification.payload));
            Object[] objArr = new Object[2];
            objArr[0] = EVENT_NOTIFICATION_RECEIVED;
            Object[] objArr2 = objArr;
            objArr2[1] = bundle2;
            Object invoke = trackMethod.invoke(firebaseAnalyticsInstance, objArr2);
            if (lastReceivedTime == null) {
                new AtomicLong();
                lastReceivedTime = atomicLong;
            }
            lastReceivedTime.set(System.currentTimeMillis());
            lastReceivedPayload = receivedResult.notification.payload;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private String getCampaignNameFromPayload(OSNotificationPayload oSNotificationPayload) {
        StringBuilder sb;
        OSNotificationPayload payload = oSNotificationPayload;
        if (!payload.templateName.isEmpty() && !payload.templateId.isEmpty()) {
            new StringBuilder();
            return sb.append(payload.templateName).append(" - ").append(payload.templateId).toString();
        } else if (payload.title != null) {
            return payload.title.substring(0, Math.min(10, payload.title.length()));
        } else {
            return "";
        }
    }

    private Object getFirebaseAnalyticsInstance(Context context) {
        Context context2 = context;
        if (this.mFirebaseAnalyticsInstance == null) {
            try {
                this.mFirebaseAnalyticsInstance = getInstanceMethod(FirebaseAnalyticsClass).invoke((Object) null, new Object[]{context2});
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
        return this.mFirebaseAnalyticsInstance;
    }

    private static Method getTrackMethod(Class clazz) {
        Class cls = clazz;
        try {
            Class[] clsArr = new Class[2];
            clsArr[0] = String.class;
            Class[] clsArr2 = clsArr;
            clsArr2[1] = Bundle.class;
            return cls.getMethod("logEvent", clsArr2);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static Method getInstanceMethod(Class clazz) {
        try {
            return clazz.getMethod("getInstance", new Class[]{Context.class});
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            return null;
        }
    }
}
