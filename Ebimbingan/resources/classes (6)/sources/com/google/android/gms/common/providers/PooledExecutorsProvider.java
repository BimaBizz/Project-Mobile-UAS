package com.google.android.gms.common.providers;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.ScheduledExecutorService;

@KeepForSdk
@Deprecated
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class PooledExecutorsProvider {
    private static PooledExecutorFactory zza;

    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public interface PooledExecutorFactory {
        @RecentlyNonNull
        @KeepForSdk
        @Deprecated
        ScheduledExecutorService newSingleThreadScheduledExecutor();
    }

    private PooledExecutorsProvider() {
    }

    @RecentlyNonNull
    @KeepForSdk
    @Deprecated
    public static synchronized PooledExecutorFactory getInstance() {
        PooledExecutorFactory pooledExecutorFactory;
        PooledExecutorFactory pooledExecutorFactory2;
        synchronized (PooledExecutorsProvider.class) {
            if (zza == null) {
                new zza();
                zza = pooledExecutorFactory2;
            }
            pooledExecutorFactory = zza;
        }
        return pooledExecutorFactory;
    }
}
