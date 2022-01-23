package com.onesignal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import com.onesignal.AndroidSupportV4Compat;
import com.onesignal.LocationController;
import com.onesignal.OneSignal;
import gnu.expr.Declaration;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class OneSignalSyncServiceUtils {
    private static final long SYNC_AFTER_BG_DELAY_MS = 30000;
    private static final int SYNC_TASK_ID = 2071862118;
    /* access modifiers changed from: private */
    public static boolean needsJobReschedule = false;
    private static Long nextScheduledSyncTimeMs = 0L;
    private static Thread syncBgThread;

    OneSignalSyncServiceUtils() {
    }

    static /* synthetic */ Long access$002(Long x0) {
        Long x02 = x0;
        nextScheduledSyncTimeMs = x02;
        return x02;
    }

    static /* synthetic */ boolean access$102(boolean x0) {
        boolean x02 = x0;
        needsJobReschedule = x02;
        return x02;
    }

    static void scheduleLocationUpdateTask(Context context, long j) {
        StringBuilder sb;
        long delayMs = j;
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.VERBOSE;
        new StringBuilder();
        OneSignal.Log(log_level, sb.append("scheduleLocationUpdateTask:delayMs: ").append(delayMs).toString());
        scheduleSyncTask(context, delayMs);
    }

    static void scheduleSyncTask(Context context) {
        OneSignal.Log(OneSignal.LOG_LEVEL.VERBOSE, "scheduleSyncTask:SYNC_AFTER_BG_DELAY_MS: 30000");
        scheduleSyncTask(context, SYNC_AFTER_BG_DELAY_MS);
    }

    static synchronized void cancelSyncTask(Context context) {
        Context context2 = context;
        synchronized (OneSignalSyncServiceUtils.class) {
            nextScheduledSyncTimeMs = 0L;
            if (!LocationController.scheduleUpdate(context2)) {
                if (useJob()) {
                    ((JobScheduler) context2.getSystemService("jobscheduler")).cancel(SYNC_TASK_ID);
                } else {
                    ((AlarmManager) context2.getSystemService(NotificationCompat.CATEGORY_ALARM)).cancel(syncServicePendingIntent(context2));
                }
            }
        }
    }

    private static PendingIntent syncServicePendingIntent(Context context) {
        Intent intent;
        Context context2 = context;
        new Intent(context2, SyncService.class);
        return PendingIntent.getService(context2, SYNC_TASK_ID, intent, Declaration.PACKAGE_ACCESS);
    }

    private static boolean useJob() {
        return Build.VERSION.SDK_INT >= 21;
    }

    private static synchronized void scheduleSyncTask(Context context, long j) {
        Context context2 = context;
        long delayMs = j;
        synchronized (OneSignalSyncServiceUtils.class) {
            if (nextScheduledSyncTimeMs.longValue() == 0 || System.currentTimeMillis() + delayMs <= nextScheduledSyncTimeMs.longValue()) {
                if (delayMs < 5000) {
                    delayMs = 5000;
                }
                if (useJob()) {
                    scheduleSyncServiceAsJob(context2, delayMs);
                } else {
                    scheduleSyncServiceAsAlarm(context2, delayMs);
                }
                nextScheduledSyncTimeMs = Long.valueOf(System.currentTimeMillis() + delayMs);
            }
        }
    }

    private static boolean hasBootPermission(Context context) {
        return AndroidSupportV4Compat.ContextCompat.checkSelfPermission(context, "android.permission.RECEIVE_BOOT_COMPLETED") == 0;
    }

    @RequiresApi(api = 21)
    private static boolean isJobIdRunning(Context context) {
        for (JobInfo jobInfo : ((JobScheduler) context.getSystemService("jobscheduler")).getAllPendingJobs()) {
            if (jobInfo.getId() == SYNC_TASK_ID && syncBgThread != null && syncBgThread.isAlive()) {
                return true;
            }
        }
        return false;
    }

    @RequiresApi(21)
    private static void scheduleSyncServiceAsJob(Context context, long j) {
        StringBuilder sb;
        JobInfo.Builder builder;
        ComponentName componentName;
        StringBuilder sb2;
        Context context2 = context;
        long delayMs = j;
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.VERBOSE;
        new StringBuilder();
        OneSignal.Log(log_level, sb.append("scheduleSyncServiceAsJob:atTime: ").append(delayMs).toString());
        if (isJobIdRunning(context2)) {
            OneSignal.Log(OneSignal.LOG_LEVEL.VERBOSE, "scheduleSyncServiceAsJob Scheduler already running!");
            needsJobReschedule = true;
            return;
        }
        new ComponentName(context2, SyncJobService.class);
        new JobInfo.Builder(SYNC_TASK_ID, componentName);
        JobInfo.Builder jobBuilder = builder;
        JobInfo.Builder requiredNetworkType = jobBuilder.setMinimumLatency(delayMs).setRequiredNetworkType(1);
        if (hasBootPermission(context2)) {
            JobInfo.Builder persisted = jobBuilder.setPersisted(true);
        }
        try {
            int result = ((JobScheduler) context2.getSystemService("jobscheduler")).schedule(jobBuilder.build());
            OneSignal.LOG_LEVEL log_level2 = OneSignal.LOG_LEVEL.INFO;
            new StringBuilder();
            OneSignal.Log(log_level2, sb2.append("scheduleSyncServiceAsJob:result: ").append(result).toString());
        } catch (NullPointerException e) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "scheduleSyncServiceAsJob called JobScheduler.jobScheduler which triggered an internal null Android error. Skipping job.", e);
        }
    }

    private static void scheduleSyncServiceAsAlarm(Context context, long j) {
        StringBuilder sb;
        Context context2 = context;
        long delayMs = j;
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.VERBOSE;
        new StringBuilder();
        OneSignal.Log(log_level, sb.append("scheduleServiceSyncTask:atTime: ").append(delayMs).toString());
        PendingIntent pendingIntent = syncServicePendingIntent(context2);
        ((AlarmManager) context2.getSystemService(NotificationCompat.CATEGORY_ALARM)).set(0, System.currentTimeMillis() + delayMs + delayMs, pendingIntent);
    }

    static void doBackgroundSync(Context context, SyncRunnable runnable) {
        Thread thread;
        OneSignal.setAppContext(context);
        new Thread(runnable, "OS_SYNCSRV_BG_SYNC");
        syncBgThread = thread;
        syncBgThread.start();
    }

    static boolean stopSyncBgThread() {
        if (syncBgThread == null || !syncBgThread.isAlive()) {
            return false;
        }
        syncBgThread.interrupt();
        return true;
    }

    static abstract class SyncRunnable implements Runnable {
        /* access modifiers changed from: protected */
        public abstract void stopSync();

        SyncRunnable() {
        }

        /* JADX INFO: finally extract failed */
        public final void run() {
            BlockingQueue blockingQueue;
            LocationController.LocationHandler locationHandler;
            Class<OneSignalSyncServiceUtils> cls = OneSignalSyncServiceUtils.class;
            Class<OneSignalSyncServiceUtils> cls2 = cls;
            synchronized (cls) {
                try {
                    Long access$002 = OneSignalSyncServiceUtils.access$002(0L);
                    if (OneSignal.getUserId() == null) {
                        stopSync();
                        return;
                    }
                    OneSignal.appId = OneSignal.getSavedAppId();
                    OneSignalStateSynchronizer.initUserState();
                    try {
                        new ArrayBlockingQueue(1);
                        BlockingQueue blockingQueue2 = blockingQueue;
                        final BlockingQueue blockingQueue3 = blockingQueue2;
                        new LocationController.LocationHandler(this) {
                            final /* synthetic */ SyncRunnable this$0;

                            {
                                this.this$0 = this$0;
                            }

                            public LocationController.PermissionType getType() {
                                return LocationController.PermissionType.SYNC_SERVICE;
                            }

                            public void onComplete(LocationController.LocationPoint locationPoint) {
                                Object obj;
                                Object object;
                                Object point = locationPoint;
                                if (point != null) {
                                    object = point;
                                } else {
                                    object = obj;
                                    new Object();
                                }
                                boolean offer = blockingQueue3.offer(object);
                            }
                        };
                        LocationController.getLocation(OneSignal.appContext, false, false, locationHandler);
                        Object point = blockingQueue2.take();
                        if (point instanceof LocationController.LocationPoint) {
                            OneSignalStateSynchronizer.updateLocation((LocationController.LocationPoint) point);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    OneSignalStateSynchronizer.syncUserState(true);
                    FocusTimeController.getInstance().doBlockingBackgroundSyncOfUnsentTime();
                    stopSync();
                } catch (Throwable th) {
                    while (true) {
                        Throwable th2 = th;
                        Class<OneSignalSyncServiceUtils> cls3 = cls2;
                        throw th2;
                    }
                }
            }
        }
    }

    @RequiresApi(api = 21)
    static class LollipopSyncRunnable extends SyncRunnable {
        private JobParameters jobParameters;
        private JobService jobService;

        LollipopSyncRunnable(JobService caller, JobParameters jobParameters2) {
            this.jobService = caller;
            this.jobParameters = jobParameters2;
        }

        /* access modifiers changed from: protected */
        public void stopSync() {
            StringBuilder sb;
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            new StringBuilder();
            OneSignal.Log(log_level, sb.append("LollipopSyncRunnable:JobFinished needsJobReschedule: ").append(OneSignalSyncServiceUtils.needsJobReschedule).toString());
            boolean reschedule = OneSignalSyncServiceUtils.needsJobReschedule;
            boolean access$102 = OneSignalSyncServiceUtils.access$102(false);
            this.jobService.jobFinished(this.jobParameters, reschedule);
        }
    }

    static class LegacySyncRunnable extends SyncRunnable {
        Service callerService;

        LegacySyncRunnable(Service caller) {
            this.callerService = caller;
        }

        /* access modifiers changed from: protected */
        public void stopSync() {
            OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, "LegacySyncRunnable:Stopped");
            this.callerService.stopSelf();
        }
    }
}
