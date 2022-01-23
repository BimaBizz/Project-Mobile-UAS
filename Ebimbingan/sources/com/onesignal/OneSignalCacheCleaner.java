package com.onesignal;

import android.content.Context;
import androidx.annotation.WorkerThread;
import com.onesignal.influence.model.OSInfluenceChannel;
import com.onesignal.outcomes.OSOutcomeTableProvider;

class OneSignalCacheCleaner {
    private static final long NOTIFICATION_CACHE_DATA_LIFETIME = 604800;
    private static final String OS_DELETE_CACHED_NOTIFICATIONS_THREAD = "OS_DELETE_CACHED_NOTIFICATIONS_THREAD";
    private static final String OS_DELETE_CACHED_REDISPLAYED_IAMS_THREAD = "OS_DELETE_CACHED_REDISPLAYED_IAMS_THREAD";

    OneSignalCacheCleaner() {
    }

    static void cleanOldCachedData(Context context) {
        OneSignalDbHelper dbHelper = OneSignalDbHelper.getInstance(context);
        cleanNotificationCache(dbHelper);
        cleanCachedInAppMessages(dbHelper);
    }

    static synchronized void cleanNotificationCache(OneSignalDbHelper oneSignalDbHelper) {
        Thread thread;
        Runnable runnable;
        OneSignalDbHelper writableDb = oneSignalDbHelper;
        synchronized (OneSignalCacheCleaner.class) {
            final OneSignalDbHelper oneSignalDbHelper2 = writableDb;
            new Runnable() {
                public void run() {
                    Thread.currentThread().setPriority(10);
                    OneSignalCacheCleaner.cleanCachedNotifications(oneSignalDbHelper2);
                    OneSignalCacheCleaner.cleanCachedUniqueOutcomeEventNotifications(oneSignalDbHelper2);
                }
            };
            new Thread(runnable, OS_DELETE_CACHED_NOTIFICATIONS_THREAD);
            thread.start();
        }
    }

    @WorkerThread
    static synchronized void cleanCachedInAppMessages(OneSignalDbHelper oneSignalDbHelper) {
        Thread thread;
        Runnable runnable;
        OneSignalDbHelper dbHelper = oneSignalDbHelper;
        synchronized (OneSignalCacheCleaner.class) {
            final OneSignalDbHelper oneSignalDbHelper2 = dbHelper;
            new Runnable() {
                public void run() {
                    Thread.currentThread().setPriority(10);
                    OneSignal.getInAppMessageController().getInAppMessageRepository(oneSignalDbHelper2).cleanCachedInAppMessages();
                }
            };
            new Thread(runnable, OS_DELETE_CACHED_REDISPLAYED_IAMS_THREAD);
            thread.start();
        }
    }

    /* access modifiers changed from: private */
    /*  JADX ERROR: NullPointerException in pass: CodeShrinkVisitor
        java.lang.NullPointerException
        */
    public static void cleanCachedNotifications(com.onesignal.OneSignalDbHelper r9) {
        /*
            r0 = r9
            java.lang.String r4 = "created_time < ?"
            r1 = r4
            long r4 = java.lang.System.currentTimeMillis()
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r6
            r6 = 604800(0x93a80, double:2.98811E-318)
            long r4 = r4 - r6
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r2 = r4
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]
            r8 = r4
            r4 = r8
            r5 = r8
            r6 = 0
            r7 = r2
            r5[r6] = r7
            r3 = r4
            r4 = r0
            java.lang.String r5 = "notification"
            r6 = r1
            r7 = r3
            r4.delete(r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.OneSignalCacheCleaner.cleanCachedNotifications(com.onesignal.OneSignalDbHelper):void");
    }

    /* access modifiers changed from: private */
    public static void cleanCachedUniqueOutcomeEventNotifications(OneSignalDbHelper writableDb) {
        StringBuilder sb;
        new StringBuilder();
        writableDb.delete(OSOutcomeTableProvider.CACHE_UNIQUE_OUTCOME_TABLE, sb.append("NOT EXISTS(SELECT NULL FROM notification n WHERE n.notification_id = channel_influence_id AND channel_type = \"").append(OSInfluenceChannel.NOTIFICATION.toString().toLowerCase()).append("\")").toString(), (String[]) null);
    }
}
