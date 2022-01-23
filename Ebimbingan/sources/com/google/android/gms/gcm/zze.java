package com.google.android.gms.gcm;

import androidx.annotation.NonNull;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class zze implements ThreadFactory {
    private final AtomicInteger zzy;

    zze(GcmTaskService gcmTaskService) {
        AtomicInteger atomicInteger;
        GcmTaskService gcmTaskService2 = gcmTaskService;
        new AtomicInteger(1);
        this.zzy = atomicInteger;
    }

    public final Thread newThread(@NonNull Runnable runnable) {
        Thread thread;
        StringBuilder sb;
        int andIncrement = this.zzy.getAndIncrement();
        new StringBuilder(20);
        new Thread(runnable, sb.append("gcm-task#").append(andIncrement).toString());
        Thread thread2 = thread;
        thread2.setPriority(4);
        return thread2;
    }
}
