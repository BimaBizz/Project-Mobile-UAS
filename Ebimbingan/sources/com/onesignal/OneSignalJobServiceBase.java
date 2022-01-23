package com.onesignal;

import android.app.job.JobParameters;
import android.app.job.JobService;
import androidx.annotation.RequiresApi;

@RequiresApi(api = 21)
abstract class OneSignalJobServiceBase extends JobService {
    /* access modifiers changed from: package-private */
    public abstract void startProcessing(JobService jobService, JobParameters jobParameters);

    OneSignalJobServiceBase() {
    }

    public boolean onStartJob(JobParameters jobParameters) {
        Thread thread;
        Runnable runnable;
        JobParameters jobParameters2 = jobParameters;
        if (jobParameters2.getExtras() == null) {
            return false;
        }
        final JobParameters jobParameters3 = jobParameters2;
        new Runnable(this) {
            final /* synthetic */ OneSignalJobServiceBase this$0;

            {
                this.this$0 = this$0;
            }

            public void run() {
                this.this$0.startProcessing(this, jobParameters3);
                this.this$0.jobFinished(jobParameters3, false);
            }
        };
        new Thread(runnable, "OS_JOBSERVICE_BASE");
        thread.start();
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        JobParameters jobParameters2 = jobParameters;
        return true;
    }
}
