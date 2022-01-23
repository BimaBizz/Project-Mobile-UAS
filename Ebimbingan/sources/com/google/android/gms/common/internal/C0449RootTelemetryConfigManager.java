package com.google.android.gms.common.internal;

import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.util.C0617VisibleForTesting;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.internal.RootTelemetryConfigManager */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0449RootTelemetryConfigManager {
    @Nullable
    private static C0449RootTelemetryConfigManager zza = null;
    private static final C0450RootTelemetryConfiguration zzb;
    @Nullable
    private C0450RootTelemetryConfiguration zzc;

    static {
        C0450RootTelemetryConfiguration rootTelemetryConfiguration;
        new C0450RootTelemetryConfiguration(0, false, false, 0, 0);
        zzb = rootTelemetryConfiguration;
    }

    private C0449RootTelemetryConfigManager() {
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static synchronized C0449RootTelemetryConfigManager getInstance() {
        C0449RootTelemetryConfigManager rootTelemetryConfigManager;
        C0449RootTelemetryConfigManager rootTelemetryConfigManager2;
        synchronized (C0449RootTelemetryConfigManager.class) {
            if (zza == null) {
                new C0449RootTelemetryConfigManager();
                zza = rootTelemetryConfigManager2;
            }
            rootTelemetryConfigManager = zza;
        }
        return rootTelemetryConfigManager;
    }

    @C0206KeepForSdk
    @RecentlyNullable
    public C0450RootTelemetryConfiguration getConfig() {
        return this.zzc;
    }

    @C0617VisibleForTesting
    public final synchronized void zza(@Nullable C0450RootTelemetryConfiguration rootTelemetryConfiguration) {
        C0450RootTelemetryConfiguration rootTelemetryConfiguration2 = rootTelemetryConfiguration;
        synchronized (this) {
            if (rootTelemetryConfiguration2 == null) {
                this.zzc = zzb;
            } else {
                C0450RootTelemetryConfiguration rootTelemetryConfiguration3 = this.zzc;
                if (rootTelemetryConfiguration3 == null || rootTelemetryConfiguration3.getVersion() < rootTelemetryConfiguration2.getVersion()) {
                    this.zzc = rootTelemetryConfiguration2;
                }
            }
        }
    }
}
