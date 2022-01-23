package com.google.android.gms.internal.gcm;

import androidx.annotation.NonNull;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class zzi implements zzf {
    private zzi() {
    }

    @NonNull
    public final ExecutorService zzd(int i, ThreadFactory threadFactory, int i2) {
        ThreadPoolExecutor threadPoolExecutor;
        BlockingQueue blockingQueue;
        int i3 = i;
        int i4 = i2;
        new LinkedBlockingQueue();
        new ThreadPoolExecutor(i3, i3, 60, TimeUnit.SECONDS, blockingQueue, threadFactory);
        ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor2);
    }

    @NonNull
    public final ExecutorService zzd(ThreadFactory threadFactory, int i) {
        int i2 = i;
        return zzd(1, threadFactory, 9);
    }

    @NonNull
    public final ScheduledExecutorService zze(int i, ThreadFactory threadFactory, int i2) {
        int i3 = i;
        int i4 = i2;
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, threadFactory));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ zzi(zzh zzh) {
        this();
        zzh zzh2 = zzh;
    }
}
