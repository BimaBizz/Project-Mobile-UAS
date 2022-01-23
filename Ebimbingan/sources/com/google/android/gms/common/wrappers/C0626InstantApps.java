package com.google.android.gms.common.wrappers;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.util.C0609PlatformVersion;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.wrappers.InstantApps */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C0626InstantApps {
    private static Context zza;
    @Nullable
    private static Boolean zzb;

    public C0626InstantApps() {
    }

    @C0206KeepForSdk
    public static synchronized boolean isInstantApp(@RecentlyNonNull Context context) {
        boolean z;
        Context context2 = context;
        synchronized (C0626InstantApps.class) {
            Context applicationContext = context2.getApplicationContext();
            if (zza == null || zzb == null || zza != applicationContext) {
                zzb = null;
                if (C0609PlatformVersion.isAtLeastO()) {
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
