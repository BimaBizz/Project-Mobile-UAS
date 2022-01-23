package com.google.android.gms.common.util.concurrent;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class NumberedThreadFactory implements ThreadFactory {
    private final String zza;
    private final AtomicInteger zzb;
    private final ThreadFactory zzc = Executors.defaultThreadFactory();

    @KeepForSdk
    public NumberedThreadFactory(@RecentlyNonNull String str) {
        AtomicInteger atomicInteger;
        String str2 = str;
        new AtomicInteger();
        this.zzb = atomicInteger;
        Object checkNotNull = Preconditions.checkNotNull(str2, "Name must not be null");
        this.zza = str2;
    }

    @RecentlyNonNull
    public final Thread newThread(@RecentlyNonNull Runnable runnable) {
        Runnable runnable2;
        StringBuilder sb;
        ThreadFactory threadFactory = this.zzc;
        new zza(runnable, 0);
        Thread newThread = threadFactory.newThread(runnable2);
        String str = this.zza;
        int andIncrement = this.zzb.getAndIncrement();
        new StringBuilder(str.length() + 13);
        StringBuilder append = sb.append(str);
        StringBuilder append2 = sb.append("[");
        StringBuilder append3 = sb.append(andIncrement);
        StringBuilder append4 = sb.append("]");
        newThread.setName(sb.toString());
        return newThread;
    }
}
