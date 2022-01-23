package com.onesignal;

import android.app.job.JobParameters;
import android.app.job.JobService;
import androidx.annotation.RequiresApi;

@RequiresApi(api = 21)
public class RestoreKickoffJobService extends OneSignalJobServiceBase {
    public /* bridge */ /* synthetic */ boolean onStartJob(JobParameters jobParameters) {
        return super.onStartJob(jobParameters);
    }

    public /* bridge */ /* synthetic */ boolean onStopJob(JobParameters jobParameters) {
        return super.onStopJob(jobParameters);
    }

    public RestoreKickoffJobService() {
    }

    /* access modifiers changed from: package-private */
    public void startProcessing(JobService jobService, JobParameters jobParameters) {
        JobService jobService2 = jobService;
        JobParameters jobParameters2 = jobParameters;
        Thread.currentThread().setPriority(10);
        OneSignal.setAppContext(this);
        NotificationRestorer.restore(getApplicationContext());
    }
}
