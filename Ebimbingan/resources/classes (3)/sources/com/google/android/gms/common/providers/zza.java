package com.google.android.gms.common.providers;

import com.google.android.gms.common.providers.PooledExecutorsProvider;
import com.google.android.gms.internal.common.zzd;
import com.google.android.gms.internal.common.zzg;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
final class zza implements PooledExecutorsProvider.PooledExecutorFactory {
    zza() {
    }

    public final ScheduledExecutorService newSingleThreadScheduledExecutor() {
        zzd zza = zzg.zza();
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
    }
}
