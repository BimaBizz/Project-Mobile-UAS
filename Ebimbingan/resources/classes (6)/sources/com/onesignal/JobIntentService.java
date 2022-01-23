package com.onesignal;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.HashMap;

abstract class JobIntentService extends Service {
    static final boolean DEBUG = false;
    static final String TAG = "JobIntentService";
    static final HashMap<ComponentNameWithWakeful, WorkEnqueuer> sClassWorkEnqueuer;
    static final Object sLock;
    final ArrayList<CompatWorkItem> mCompatQueue;
    WorkEnqueuer mCompatWorkEnqueuer;
    CommandProcessor mCurProcessor;
    boolean mDestroyed = false;
    boolean mInterruptIfStopped = false;
    CompatJobEngine mJobImpl;
    boolean mStopped = false;

    interface CompatJobEngine {
        IBinder compatGetBinder();

        GenericWorkItem dequeueWork();
    }

    interface GenericWorkItem {
        void complete();

        Intent getIntent();
    }

    /* access modifiers changed from: protected */
    public abstract void onHandleWork(@NonNull Intent intent);

    static {
        Object obj;
        HashMap<ComponentNameWithWakeful, WorkEnqueuer> hashMap;
        new Object();
        sLock = obj;
        new HashMap<>();
        sClassWorkEnqueuer = hashMap;
    }

    private static class ComponentNameWithWakeful {
        private ComponentName componentName;
        private boolean useWakefulService;

        ComponentNameWithWakeful(ComponentName componentName2, boolean useWakefulService2) {
            this.componentName = componentName2;
            this.useWakefulService = useWakefulService2;
        }
    }

    static abstract class WorkEnqueuer {
        final ComponentName mComponentName;
        boolean mHasJobId;
        int mJobId;

        /* access modifiers changed from: package-private */
        public abstract void enqueueWork(Intent intent);

        WorkEnqueuer(ComponentName cn) {
            this.mComponentName = cn;
        }

        /* access modifiers changed from: package-private */
        public void ensureJobId(int i) {
            Throwable th;
            StringBuilder sb;
            int jobId = i;
            if (!this.mHasJobId) {
                this.mHasJobId = true;
                this.mJobId = jobId;
            } else if (this.mJobId != jobId) {
                Throwable th2 = th;
                new StringBuilder();
                new IllegalArgumentException(sb.append("Given job ID ").append(jobId).append(" is different than previous ").append(this.mJobId).toString());
                throw th2;
            }
        }

        public void serviceStartReceived() {
        }

        public void serviceProcessingStarted() {
        }

        public void serviceProcessingFinished() {
        }
    }

    static final class CompatWorkEnqueuer extends WorkEnqueuer {
        private final Context mContext;
        private final PowerManager.WakeLock mLaunchWakeLock;
        boolean mLaunchingService;
        private final PowerManager.WakeLock mRunWakeLock;
        boolean mServiceProcessing;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        CompatWorkEnqueuer(android.content.Context r11, android.content.ComponentName r12) {
            /*
                r10 = this;
                r0 = r10
                r1 = r11
                r2 = r12
                r4 = r0
                r5 = r2
                r4.<init>(r5)
                r4 = r0
                r5 = r1
                android.content.Context r5 = r5.getApplicationContext()
                r4.mContext = r5
                r4 = r1
                java.lang.String r5 = "power"
                java.lang.Object r4 = r4.getSystemService(r5)
                android.os.PowerManager r4 = (android.os.PowerManager) r4
                r3 = r4
                r4 = r0
                r5 = r3
                r6 = 1
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r9 = r7
                r7 = r9
                r8 = r9
                r8.<init>()
                r8 = r2
                java.lang.String r8 = r8.getClassName()
                java.lang.StringBuilder r7 = r7.append(r8)
                java.lang.String r8 = ":launch"
                java.lang.StringBuilder r7 = r7.append(r8)
                java.lang.String r7 = r7.toString()
                android.os.PowerManager$WakeLock r5 = r5.newWakeLock(r6, r7)
                r4.mLaunchWakeLock = r5
                r4 = r0
                android.os.PowerManager$WakeLock r4 = r4.mLaunchWakeLock
                r5 = 0
                r4.setReferenceCounted(r5)
                r4 = r0
                r5 = r3
                r6 = 1
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r9 = r7
                r7 = r9
                r8 = r9
                r8.<init>()
                r8 = r2
                java.lang.String r8 = r8.getClassName()
                java.lang.StringBuilder r7 = r7.append(r8)
                java.lang.String r8 = ":run"
                java.lang.StringBuilder r7 = r7.append(r8)
                java.lang.String r7 = r7.toString()
                android.os.PowerManager$WakeLock r5 = r5.newWakeLock(r6, r7)
                r4.mRunWakeLock = r5
                r4 = r0
                android.os.PowerManager$WakeLock r4 = r4.mRunWakeLock
                r5 = 0
                r4.setReferenceCounted(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.JobIntentService.CompatWorkEnqueuer.<init>(android.content.Context, android.content.ComponentName):void");
        }

        /* access modifiers changed from: package-private */
        public void enqueueWork(Intent work) {
            Intent intent;
            new Intent(work);
            Intent intent2 = intent;
            Intent component = intent2.setComponent(this.mComponentName);
            if (this.mContext.startService(intent2) != null) {
                synchronized (this) {
                    try {
                        if (!this.mLaunchingService) {
                            this.mLaunchingService = true;
                            if (!this.mServiceProcessing) {
                                this.mLaunchWakeLock.acquire(60000);
                            }
                        }
                    } catch (Throwable th) {
                        Throwable th2 = th;
                        throw th2;
                    }
                }
            }
        }

        public void serviceStartReceived() {
            synchronized (this) {
                try {
                    this.mLaunchingService = false;
                } catch (Throwable th) {
                    Throwable th2 = th;
                    throw th2;
                }
            }
        }

        public void serviceProcessingStarted() {
            synchronized (this) {
                try {
                    if (!this.mServiceProcessing) {
                        this.mServiceProcessing = true;
                        this.mRunWakeLock.acquire(600000);
                        this.mLaunchWakeLock.release();
                    }
                } catch (Throwable th) {
                    Throwable th2 = th;
                    throw th2;
                }
            }
        }

        public void serviceProcessingFinished() {
            synchronized (this) {
                try {
                    if (this.mServiceProcessing) {
                        if (this.mLaunchingService) {
                            this.mLaunchWakeLock.acquire(60000);
                        }
                        this.mServiceProcessing = false;
                        this.mRunWakeLock.release();
                    }
                } catch (Throwable th) {
                    Throwable th2 = th;
                    throw th2;
                }
            }
        }
    }

    @RequiresApi(26)
    static final class JobServiceEngineImpl extends JobServiceEngine implements CompatJobEngine {
        static final boolean DEBUG = false;
        static final String TAG = "JobServiceEngineImpl";
        final Object mLock;
        JobParameters mParams;
        final JobIntentService mService;

        final class WrapperWorkItem implements GenericWorkItem {
            final JobWorkItem mJobWork;
            final /* synthetic */ JobServiceEngineImpl this$0;

            WrapperWorkItem(JobServiceEngineImpl this$02, JobWorkItem jobWork) {
                this.this$0 = this$02;
                this.mJobWork = jobWork;
            }

            public Intent getIntent() {
                return this.mJobWork.getIntent();
            }

            public void complete() {
                Object obj = this.this$0.mLock;
                Object obj2 = obj;
                synchronized (obj) {
                    try {
                        if (this.this$0.mParams != null) {
                            this.this$0.mParams.completeWork(this.mJobWork);
                        }
                    } catch (SecurityException e) {
                        int e2 = Log.e(JobServiceEngineImpl.TAG, "SecurityException: Failed to run mParams.completeWork(mJobWork)!", e);
                    } catch (IllegalArgumentException e3) {
                        int e4 = Log.e(JobServiceEngineImpl.TAG, "IllegalArgumentException: Failed to run mParams.completeWork(mJobWork)!", e3);
                    } catch (Throwable th) {
                        Throwable th2 = th;
                        Object obj3 = obj2;
                        throw th2;
                    }
                }
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        JobServiceEngineImpl(com.onesignal.JobIntentService r7) {
            /*
                r6 = this;
                r0 = r6
                r1 = r7
                r2 = r0
                r3 = r1
                r2.<init>(r3)
                r2 = r0
                java.lang.Object r3 = new java.lang.Object
                r5 = r3
                r3 = r5
                r4 = r5
                r4.<init>()
                r2.mLock = r3
                r2 = r0
                r3 = r1
                r2.mService = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.JobIntentService.JobServiceEngineImpl.<init>(com.onesignal.JobIntentService):void");
        }

        public IBinder compatGetBinder() {
            return getBinder();
        }

        public boolean onStartJob(JobParameters params) {
            this.mParams = params;
            this.mService.ensureProcessorRunningLocked(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            JobParameters jobParameters2 = jobParameters;
            boolean result = this.mService.doStopCurrentWork();
            Object obj = this.mLock;
            Object obj2 = obj;
            synchronized (obj) {
                try {
                    this.mParams = null;
                    return result;
                } catch (Throwable th) {
                    Throwable th2 = th;
                    Object obj3 = obj2;
                    throw th2;
                }
            }
        }

        public GenericWorkItem dequeueWork() {
            GenericWorkItem genericWorkItem;
            Object obj = this.mLock;
            Object obj2 = obj;
            synchronized (obj) {
                try {
                    if (this.mParams == null) {
                        return null;
                    }
                    JobWorkItem work = this.mParams.dequeueWork();
                    if (work == null) {
                        return null;
                    }
                    work.getIntent().setExtrasClassLoader(this.mService.getClassLoader());
                    new WrapperWorkItem(this, work);
                    return genericWorkItem;
                } catch (SecurityException e) {
                    int e2 = Log.e(TAG, "Failed to run mParams.dequeueWork()!", e);
                    Object obj3 = obj2;
                    return null;
                } catch (Throwable th) {
                    Throwable th2 = th;
                    Object obj4 = obj2;
                    throw th2;
                }
            }
        }
    }

    @RequiresApi(26)
    static final class JobWorkEnqueuer extends WorkEnqueuer {
        private final JobInfo mJobInfo;
        private final JobScheduler mJobScheduler;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        JobWorkEnqueuer(Context context, ComponentName cn, int i) {
            super(cn);
            JobInfo.Builder b;
            int jobId = i;
            ensureJobId(jobId);
            new JobInfo.Builder(jobId, this.mComponentName);
            this.mJobInfo = b.setOverrideDeadline(0).build();
            this.mJobScheduler = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        /* access modifiers changed from: package-private */
        public void enqueueWork(Intent work) {
            JobWorkItem jobWorkItem;
            new JobWorkItem(work);
            int enqueue = this.mJobScheduler.enqueue(this.mJobInfo, jobWorkItem);
        }
    }

    final class CompatWorkItem implements GenericWorkItem {
        final Intent mIntent;
        final int mStartId;
        final /* synthetic */ JobIntentService this$0;

        CompatWorkItem(JobIntentService this$02, Intent intent, int startId) {
            this.this$0 = this$02;
            this.mIntent = intent;
            this.mStartId = startId;
        }

        public Intent getIntent() {
            return this.mIntent;
        }

        public void complete() {
            this.this$0.stopSelf(this.mStartId);
        }
    }

    final class CommandProcessor extends AsyncTask<Void, Void, Void> {
        final /* synthetic */ JobIntentService this$0;

        CommandProcessor(JobIntentService this$02) {
            this.this$0 = this$02;
        }

        /* access modifiers changed from: protected */
        public Void doInBackground(Void... voidArr) {
            Void[] voidArr2 = voidArr;
            while (true) {
                GenericWorkItem dequeueWork = this.this$0.dequeueWork();
                GenericWorkItem work = dequeueWork;
                if (dequeueWork == null) {
                    return null;
                }
                this.this$0.onHandleWork(work.getIntent());
                work.complete();
            }
        }

        /* access modifiers changed from: protected */
        public void onCancelled(Void voidR) {
            Void voidR2 = voidR;
            this.this$0.processorFinished();
        }

        /* access modifiers changed from: protected */
        public void onPostExecute(Void voidR) {
            Void voidR2 = voidR;
            this.this$0.processorFinished();
        }
    }

    public JobIntentService() {
        ArrayList<CompatWorkItem> arrayList;
        new ArrayList<>();
        this.mCompatQueue = arrayList;
    }

    public void onCreate() {
        ComponentName cn;
        CompatJobEngine compatJobEngine;
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            new JobServiceEngineImpl(this);
            this.mJobImpl = compatJobEngine;
            this.mCompatWorkEnqueuer = null;
        }
        new ComponentName(this, getClass());
        this.mCompatWorkEnqueuer = getWorkEnqueuer(this, cn, false, 0, true);
    }

    public int onStartCommand(@Nullable Intent intent, int i, int i2) {
        Object obj;
        Intent intent2;
        Intent intent3;
        Intent intent4 = intent;
        int i3 = i;
        int startId = i2;
        this.mCompatWorkEnqueuer.serviceStartReceived();
        ArrayList<CompatWorkItem> arrayList = this.mCompatQueue;
        ArrayList<CompatWorkItem> arrayList2 = arrayList;
        synchronized (arrayList) {
            try {
                ArrayList<CompatWorkItem> arrayList3 = this.mCompatQueue;
                Object obj2 = obj;
                if (intent4 != null) {
                    intent3 = intent4;
                } else {
                    intent3 = intent2;
                    new Intent();
                }
                new CompatWorkItem(this, intent3, startId);
                boolean add = arrayList3.add(obj2);
                ensureProcessorRunningLocked(true);
                return 3;
            } catch (Throwable th) {
                Throwable th2 = th;
                ArrayList<CompatWorkItem> arrayList4 = arrayList2;
                throw th2;
            }
        }
    }

    public IBinder onBind(@NonNull Intent intent) {
        Intent intent2 = intent;
        if (this.mJobImpl != null) {
            return this.mJobImpl.compatGetBinder();
        }
        return null;
    }

    public void onDestroy() {
        super.onDestroy();
        boolean doStopCurrentWork = doStopCurrentWork();
        ArrayList<CompatWorkItem> arrayList = this.mCompatQueue;
        ArrayList<CompatWorkItem> arrayList2 = arrayList;
        synchronized (arrayList) {
            try {
                this.mDestroyed = true;
                this.mCompatWorkEnqueuer.serviceProcessingFinished();
            } catch (Throwable th) {
                Throwable th2 = th;
                ArrayList<CompatWorkItem> arrayList3 = arrayList2;
                throw th2;
            }
        }
    }

    public static void enqueueWork(@NonNull Context context, @NonNull Class cls, int jobId, @NonNull Intent work, boolean useWakefulService) {
        ComponentName componentName;
        Context context2 = context;
        new ComponentName(context2, cls);
        enqueueWork(context2, componentName, jobId, work, useWakefulService);
    }

    /* JADX INFO: finally extract failed */
    public static void enqueueWork(@NonNull Context context, @NonNull ComponentName componentName, int i, @NonNull Intent intent, boolean z) {
        Throwable th;
        Context context2 = context;
        ComponentName component = componentName;
        int jobId = i;
        Intent work = intent;
        boolean useWakefulService = z;
        if (work == null) {
            Throwable th2 = th;
            new IllegalArgumentException("work must not be null");
            throw th2;
        }
        Object obj = sLock;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                WorkEnqueuer we = getWorkEnqueuer(context2, component, true, jobId, useWakefulService);
                we.ensureJobId(jobId);
                we.enqueueWork(work);
            } catch (IllegalStateException e) {
                IllegalStateException e2 = e;
                if (useWakefulService) {
                    getWorkEnqueuer(context2, component, true, jobId, false).enqueueWork(work);
                } else {
                    throw e2;
                }
            } catch (Throwable th3) {
                Throwable th4 = th3;
                Object obj3 = obj2;
                throw th4;
            }
        }
    }

    static WorkEnqueuer getWorkEnqueuer(Context context, ComponentName componentName, boolean z, int i, boolean z2) {
        ComponentNameWithWakeful componentNameWithWakeful;
        WorkEnqueuer workEnqueuer;
        WorkEnqueuer workEnqueuer2;
        Throwable th;
        Context context2 = context;
        ComponentName cn = componentName;
        boolean hasJobId = z;
        int jobId = i;
        boolean useWakefulService = z2;
        new ComponentNameWithWakeful(cn, useWakefulService);
        ComponentNameWithWakeful key = componentNameWithWakeful;
        WorkEnqueuer we = sClassWorkEnqueuer.get(key);
        if (we == null) {
            if (Build.VERSION.SDK_INT < 26 || useWakefulService) {
                new CompatWorkEnqueuer(context2, cn);
                we = workEnqueuer;
            } else if (!hasJobId) {
                Throwable th2 = th;
                new IllegalArgumentException("Can't be here without a job id");
                throw th2;
            } else {
                new JobWorkEnqueuer(context2, cn, jobId);
                we = workEnqueuer2;
            }
            WorkEnqueuer put = sClassWorkEnqueuer.put(key, we);
        }
        return we;
    }

    public void setInterruptIfStopped(boolean interruptIfStopped) {
        boolean z = interruptIfStopped;
        this.mInterruptIfStopped = z;
    }

    public boolean isStopped() {
        return this.mStopped;
    }

    public boolean onStopCurrentWork() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean doStopCurrentWork() {
        if (this.mCurProcessor != null) {
            boolean cancel = this.mCurProcessor.cancel(this.mInterruptIfStopped);
        }
        this.mStopped = true;
        return onStopCurrentWork();
    }

    /* access modifiers changed from: package-private */
    public void ensureProcessorRunningLocked(boolean z) {
        CommandProcessor commandProcessor;
        boolean reportStarted = z;
        if (this.mCurProcessor == null) {
            new CommandProcessor(this);
            this.mCurProcessor = commandProcessor;
            if (this.mCompatWorkEnqueuer != null && reportStarted) {
                this.mCompatWorkEnqueuer.serviceProcessingStarted();
            }
            AsyncTask executeOnExecutor = this.mCurProcessor.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* access modifiers changed from: package-private */
    public void processorFinished() {
        if (this.mCompatQueue != null) {
            ArrayList<CompatWorkItem> arrayList = this.mCompatQueue;
            ArrayList<CompatWorkItem> arrayList2 = arrayList;
            synchronized (arrayList) {
                try {
                    this.mCurProcessor = null;
                    if (this.mCompatQueue != null && this.mCompatQueue.size() > 0) {
                        ensureProcessorRunningLocked(false);
                    } else if (!this.mDestroyed) {
                        this.mCompatWorkEnqueuer.serviceProcessingFinished();
                    }
                } catch (Throwable th) {
                    Throwable th2 = th;
                    ArrayList<CompatWorkItem> arrayList3 = arrayList2;
                    throw th2;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public GenericWorkItem dequeueWork() {
        GenericWorkItem jobWork;
        if (this.mJobImpl != null && (jobWork = this.mJobImpl.dequeueWork()) != null) {
            return jobWork;
        }
        ArrayList<CompatWorkItem> arrayList = this.mCompatQueue;
        ArrayList<CompatWorkItem> arrayList2 = arrayList;
        synchronized (arrayList) {
            try {
                if (this.mCompatQueue.size() > 0) {
                    GenericWorkItem remove = this.mCompatQueue.remove(0);
                    return remove;
                }
                return null;
            } catch (Throwable th) {
                Throwable th2 = th;
                ArrayList<CompatWorkItem> arrayList3 = arrayList2;
                throw th2;
            }
        }
    }
}
