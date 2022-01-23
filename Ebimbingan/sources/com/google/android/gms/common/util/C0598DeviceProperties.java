package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.C0197GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.C0206KeepForSdk;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.util.DeviceProperties */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0598DeviceProperties {
    @Nullable
    private static Boolean zza;
    @Nullable
    private static Boolean zzb;
    @Nullable
    private static Boolean zzc;
    @Nullable
    private static Boolean zzd;
    @Nullable
    private static Boolean zze;
    @Nullable
    private static Boolean zzf;
    @Nullable
    private static Boolean zzg;
    @Nullable
    private static Boolean zzh;

    private C0598DeviceProperties() {
    }

    @C0206KeepForSdk
    public static boolean isAuto(@RecentlyNonNull Context context) {
        return isAuto(context.getPackageManager());
    }

    @C0206KeepForSdk
    @Deprecated
    public static boolean isFeaturePhone(@RecentlyNonNull Context context) {
        Context context2 = context;
        return false;
    }

    @C0206KeepForSdk
    public static boolean isLatchsky(@RecentlyNonNull Context context) {
        boolean z;
        Context context2 = context;
        if (zze == null) {
            PackageManager packageManager = context2.getPackageManager();
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater")) {
                z = packageManager.hasSystemFeature("cn.google.services");
            } else {
                z = false;
            }
            zze = Boolean.valueOf(z);
        }
        return zze.booleanValue();
    }

    @TargetApi(21)
    @C0206KeepForSdk
    public static boolean isSidewinder(@RecentlyNonNull Context context) {
        return zza(context);
    }

    @C0206KeepForSdk
    public static boolean isTv(@RecentlyNonNull Context context) {
        return isTv(context.getPackageManager());
    }

    @C0206KeepForSdk
    public static boolean isUserBuild() {
        int i = C0197GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        return "user".equals(Build.TYPE);
    }

    @TargetApi(20)
    @C0206KeepForSdk
    public static boolean isWearable(@RecentlyNonNull Context context) {
        return isWearable(context.getPackageManager());
    }

    @TargetApi(26)
    @C0206KeepForSdk
    public static boolean isWearableWithoutPlayStore(@RecentlyNonNull Context context) {
        boolean z;
        Context context2 = context;
        if (!isWearable(context2)) {
            z = false;
        } else if (!C0609PlatformVersion.isAtLeastN()) {
            z = true;
        } else if (!zza(context2)) {
            z = false;
        } else if (!C0609PlatformVersion.isAtLeastO()) {
            return true;
        } else {
            z = false;
        }
        return z;
    }

    @TargetApi(21)
    public static boolean zza(@RecentlyNonNull Context context) {
        boolean z;
        Context context2 = context;
        if (zzd == null) {
            if (C0609PlatformVersion.isAtLeastLollipop()) {
                z = context2.getPackageManager().hasSystemFeature("cn.google");
            } else {
                z = false;
            }
            zzd = Boolean.valueOf(z);
        }
        return zzd.booleanValue();
    }

    public static boolean zzb(@RecentlyNonNull Context context) {
        boolean z;
        Context context2 = context;
        if (zzf == null) {
            if (!context2.getPackageManager().hasSystemFeature("android.hardware.type.iot")) {
                z = context2.getPackageManager().hasSystemFeature("android.hardware.type.embedded");
            } else {
                z = true;
            }
            zzf = Boolean.valueOf(z);
        }
        return zzf.booleanValue();
    }

    @C0206KeepForSdk
    public static boolean isAuto(@RecentlyNonNull PackageManager packageManager) {
        boolean z;
        PackageManager packageManager2 = packageManager;
        if (zzg == null) {
            if (C0609PlatformVersion.isAtLeastO()) {
                z = packageManager2.hasSystemFeature("android.hardware.type.automotive");
            } else {
                z = false;
            }
            zzg = Boolean.valueOf(z);
        }
        return zzg.booleanValue();
    }

    @C0206KeepForSdk
    public static boolean isTv(@RecentlyNonNull PackageManager packageManager) {
        boolean z;
        PackageManager packageManager2 = packageManager;
        if (zzh == null) {
            if (!packageManager2.hasSystemFeature("com.google.android.tv")) {
                z = !packageManager2.hasSystemFeature("android.hardware.type.television") ? packageManager2.hasSystemFeature("android.software.leanback") : true;
            } else {
                z = true;
            }
            zzh = Boolean.valueOf(z);
        }
        return zzh.booleanValue();
    }

    @TargetApi(20)
    @C0206KeepForSdk
    public static boolean isWearable(@RecentlyNonNull PackageManager packageManager) {
        boolean z;
        PackageManager packageManager2 = packageManager;
        if (zzc == null) {
            if (C0609PlatformVersion.isAtLeastKitKatWatch()) {
                z = packageManager2.hasSystemFeature("android.hardware.type.watch");
            } else {
                z = false;
            }
            zzc = Boolean.valueOf(z);
        }
        return zzc.booleanValue();
    }

    @C0206KeepForSdk
    public static boolean isTablet(@RecentlyNonNull Resources resources) {
        boolean z;
        boolean z2;
        Resources resources2 = resources;
        if (resources2 == null) {
            return false;
        }
        if (zza == null) {
            if ((resources2.getConfiguration().screenLayout & 15) > 3) {
                z = true;
            } else {
                if (zzb == null) {
                    Configuration configuration = resources2.getConfiguration();
                    if ((configuration.screenLayout & 15) <= 3) {
                        z2 = configuration.smallestScreenWidthDp >= 600;
                    } else {
                        z2 = false;
                    }
                    zzb = Boolean.valueOf(z2);
                }
                z = zzb.booleanValue();
            }
            zza = Boolean.valueOf(z);
        }
        return zza.booleanValue();
    }
}
