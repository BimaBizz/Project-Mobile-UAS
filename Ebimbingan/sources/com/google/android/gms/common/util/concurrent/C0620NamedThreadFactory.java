package com.google.android.gms.common.util.concurrent;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.internal.C0446Preconditions;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.util.concurrent.NamedThreadFactory */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C0620NamedThreadFactory implements ThreadFactory {
    private final String zza;
    private final ThreadFactory zzb = Executors.defaultThreadFactory();

    @C0206KeepForSdk
    public C0620NamedThreadFactory(@RecentlyNonNull String str) {
        String str2 = str;
        Object checkNotNull = C0446Preconditions.checkNotNull(str2, "Name must not be null");
        this.zza = str2;
    }

    @RecentlyNonNull
    public final Thread newThread(@RecentlyNonNull Runnable runnable) {
        Runnable runnable2;
        ThreadFactory threadFactory = this.zzb;
        new C0622zza(runnable, 0);
        Thread newThread = threadFactory.newThread(runnable2);
        newThread.setName(this.zza);
        return newThread;
    }
}
