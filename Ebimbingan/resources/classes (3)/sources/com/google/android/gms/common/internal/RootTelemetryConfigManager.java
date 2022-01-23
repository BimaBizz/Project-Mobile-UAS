package com.google.android.gms.common.internal;

import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class RootTelemetryConfigManager {
    @Nullable
    private static RootTelemetryConfigManager zza = null;
    private static final RootTelemetryConfiguration zzb;
    @Nullable
    private RootTelemetryConfiguration zzc;

    static {
        RootTelemetryConfiguration rootTelemetryConfiguration;
        new RootTelemetryConfiguration(0, false, false, 0, 0);
        zzb = rootTelemetryConfiguration;
    }

    private RootTelemetryConfigManager() {
    }

    @RecentlyNonNull
    @KeepForSdk
    public static synchronized RootTelemetryConfigManager getInstance() {
        RootTelemetryConfigManager rootTelemetryConfigManager;
        RootTelemetryConfigManager rootTelemetryConfigManager2;
        synchronized (RootTelemetryConfigManager.class) {
            if (zza == null) {
                new RootTelemetryConfigManager();
                zza = rootTelemetryConfigManager2;
            }
            rootTelemetryConfigManager = zza;
        }
        return rootTelemetryConfigManager;
    }

    @KeepForSdk
    @RecentlyNullable
    public RootTelemetryConfiguration getConfig() {
        return this.zzc;
    }

    @VisibleForTesting
    public final synchronized void zza(@Nullable RootTelemetryConfiguration rootTelemetryConfiguration) {
        RootTelemetryConfiguration rootTelemetryConfiguration2 = rootTelemetryConfiguration;
        synchronized (this) {
            if (rootTelemetryConfiguration2 == null) {
                this.zzc = zzb;
            } else {
                RootTelemetryConfiguration rootTelemetryConfiguration3 = this.zzc;
                if (rootTelemetryConfiguration3 == null || rootTelemetryConfiguration3.getVersion() < rootTelemetryConfiguration2.getVersion()) {
                    this.zzc = rootTelemetryConfiguration2;
                }
            }
        }
    }
}
