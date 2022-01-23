package com.google.android.gms.internal.firebase_auth;

import androidx.annotation.NonNull;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class zzh implements zzg {
    private zzh() {
    }

    @NonNull
    public final ExecutorService zza(int i) {
        ThreadPoolExecutor threadPoolExecutor;
        BlockingQueue blockingQueue;
        int i2 = i;
        ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        new LinkedBlockingQueue();
        new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, blockingQueue, defaultThreadFactory);
        ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ zzh(zzi zzi) {
        this();
        zzi zzi2 = zzi;
    }
}
