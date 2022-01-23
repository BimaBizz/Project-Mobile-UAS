package com.google.android.gms.internal.base;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zan implements zal {
    private zan() {
    }

    /* synthetic */ zan(zam zam) {
        zam zam2 = zam;
    }

    public final ExecutorService zaa(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        return zab(4, Executors.defaultThreadFactory(), 2);
    }

    public final ExecutorService zab(int i, ThreadFactory threadFactory, int i2) {
        ThreadPoolExecutor threadPoolExecutor;
        BlockingQueue blockingQueue;
        int i3 = i;
        int i4 = i2;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        new LinkedBlockingQueue();
        new ThreadPoolExecutor(i3, i3, 60, timeUnit, blockingQueue, threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public final ExecutorService zac(ThreadFactory threadFactory, int i) {
        int i2 = i;
        return zab(1, threadFactory, 1);
    }
}
