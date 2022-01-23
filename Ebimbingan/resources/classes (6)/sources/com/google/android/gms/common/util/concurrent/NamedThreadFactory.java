package com.google.android.gms.common.util.concurrent;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class NamedThreadFactory implements ThreadFactory {
    private final String zza;
    private final ThreadFactory zzb = Executors.defaultThreadFactory();

    @KeepForSdk
    public NamedThreadFactory(@RecentlyNonNull String str) {
        String str2 = str;
        Object checkNotNull = Preconditions.checkNotNull(str2, "Name must not be null");
        this.zza = str2;
    }

    @RecentlyNonNull
    public final Thread newThread(@RecentlyNonNull Runnable runnable) {
        Runnable runnable2;
        ThreadFactory threadFactory = this.zzb;
        new zza(runnable, 0);
        Thread newThread = threadFactory.newThread(runnable2);
        newThread.setName(this.zza);
        return newThread;
    }
}
