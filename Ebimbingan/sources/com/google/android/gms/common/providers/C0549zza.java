package com.google.android.gms.common.providers;

import com.google.android.gms.common.providers.C0548PooledExecutorsProvider;
import com.google.android.gms.internal.common.C1110zzd;
import com.google.android.gms.internal.common.C1113zzg;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.common.providers.zza */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
final class C0549zza implements C0548PooledExecutorsProvider.PooledExecutorFactory {
    C0549zza() {
    }

    public final ScheduledExecutorService newSingleThreadScheduledExecutor() {
        C1110zzd zza = C1113zzg.zza();
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
    }
}
