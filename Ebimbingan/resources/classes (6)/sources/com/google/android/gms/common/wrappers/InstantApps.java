package com.google.android.gms.common.wrappers;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class InstantApps {
    private static Context zza;
    @Nullable
    private static Boolean zzb;

    public InstantApps() {
    }

    @KeepForSdk
    public static synchronized boolean isInstantApp(@RecentlyNonNull Context context) {
        boolean z;
        Context context2 = context;
        synchronized (InstantApps.class) {
            Context applicationContext = context2.getApplicationContext();
            if (zza == null || zzb == null || zza != applicationContext) {
                zzb = null;
                if (PlatformVersion.isAtLeastO()) {
                    zzb = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
                } else {
                    try {
                        Class<?> loadClass = context2.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                        zzb = true;
                    } catch (ClassNotFoundException e) {
                        zzb = false;
                    }
                }
                zza = applicationContext;
                z = zzb.booleanValue();
            } else {
                z = zzb.booleanValue();
            }
        }
        return z;
    }
}
