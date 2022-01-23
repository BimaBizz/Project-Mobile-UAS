package com.onesignal;

import android.app.job.JobParameters;
import android.app.job.JobService;
import androidx.annotation.RequiresApi;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalSyncServiceUtils;

@RequiresApi(api = 21)
public class SyncJobService extends JobService {
    public SyncJobService() {
    }

    public boolean onStartJob(JobParameters jobParameters) {
        OneSignalSyncServiceUtils.SyncRunnable syncRunnable;
        new OneSignalSyncServiceUtils.LollipopSyncRunnable(this, jobParameters);
        OneSignalSyncServiceUtils.doBackgroundSync(this, syncRunnable);
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        StringBuilder sb;
        JobParameters jobParameters2 = jobParameters;
        boolean reschedule = OneSignalSyncServiceUtils.stopSyncBgThread();
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        new StringBuilder();
        OneSignal.Log(log_level, sb.append("SyncJobService onStopJob called, system conditions not available reschedule: ").append(reschedule).toString());
        return reschedule;
    }
}
