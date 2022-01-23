package com.google.android.gms.common.providers;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import java.util.concurrent.ScheduledExecutorService;

@C0206KeepForSdk
@Deprecated
/* renamed from: com.google.android.gms.common.providers.PooledExecutorsProvider */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C0548PooledExecutorsProvider {
    private static PooledExecutorFactory zza;

    /* renamed from: com.google.android.gms.common.providers.PooledExecutorsProvider$PooledExecutorFactory */
    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public interface PooledExecutorFactory {
        @RecentlyNonNull
        @C0206KeepForSdk
        @Deprecated
        ScheduledExecutorService newSingleThreadScheduledExecutor();
    }

    private C0548PooledExecutorsProvider() {
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    @Deprecated
    public static synchronized PooledExecutorFactory getInstance() {
        PooledExecutorFactory pooledExecutorFactory;
        PooledExecutorFactory pooledExecutorFactory2;
        synchronized (C0548PooledExecutorsProvider.class) {
            if (zza == null) {
                new C0549zza();
                zza = pooledExecutorFactory2;
            }
            pooledExecutorFactory = zza;
        }
        return pooledExecutorFactory;
    }
}
