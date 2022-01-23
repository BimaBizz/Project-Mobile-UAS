package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.internal.C0436HideFirstParty;
import com.google.android.gms.common.internal.C0452ShowFirstParty;
import com.google.android.gms.common.internal.C0539zzs;
import com.google.android.gms.common.util.C0598DeviceProperties;
import com.google.android.gms.common.wrappers.C0628Wrappers;
import gnu.expr.Declaration;

@C0452ShowFirstParty
@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.GoogleApiAvailabilityLight */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C0190GoogleApiAvailabilityLight {
    @RecentlyNonNull
    @C0206KeepForSdk
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    @C0206KeepForSdk
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = C0197GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    @RecentlyNonNull
    @C0206KeepForSdk
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    @C0206KeepForSdk
    static final String TRACKING_SOURCE_DIALOG = "d";
    @C0206KeepForSdk
    static final String TRACKING_SOURCE_NOTIFICATION = "n";
    private static final C0190GoogleApiAvailabilityLight zza;

    static {
        C0190GoogleApiAvailabilityLight googleApiAvailabilityLight;
        new C0190GoogleApiAvailabilityLight();
        zza = googleApiAvailabilityLight;
    }

    @C0206KeepForSdk
    C0190GoogleApiAvailabilityLight() {
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static C0190GoogleApiAvailabilityLight getInstance() {
        return zza;
    }

    @C0206KeepForSdk
    public void cancelAvailabilityErrorNotifications(@RecentlyNonNull Context context) {
        C0197GooglePlayServicesUtilLight.cancelAvailabilityErrorNotifications(context);
    }

    @C0452ShowFirstParty
    @C0206KeepForSdk
    public int getApkVersion(@RecentlyNonNull Context context) {
        return C0197GooglePlayServicesUtilLight.getApkVersion(context);
    }

    @C0452ShowFirstParty
    @C0206KeepForSdk
    public int getClientVersion(@RecentlyNonNull Context context) {
        return C0197GooglePlayServicesUtilLight.getClientVersion(context);
    }

    @C0452ShowFirstParty
    @RecentlyNullable
    @C0206KeepForSdk
    @Deprecated
    public Intent getErrorResolutionIntent(int i) {
        return getErrorResolutionIntent((Context) null, i, (String) null);
    }

    @C0206KeepForSdk
    @RecentlyNullable
    public PendingIntent getErrorResolutionPendingIntent(@RecentlyNonNull Context context, int i, int i2) {
        return getErrorResolutionPendingIntent(context, i, i2, (String) null);
    }

    @NonNull
    @C0206KeepForSdk
    public String getErrorString(int i) {
        return C0197GooglePlayServicesUtilLight.getErrorString(i);
    }

    @C0206KeepForSdk
    @C0436HideFirstParty
    public int isGooglePlayServicesAvailable(@RecentlyNonNull Context context) {
        return isGooglePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    @C0452ShowFirstParty
    @C0206KeepForSdk
    public boolean isPlayServicesPossiblyUpdating(@RecentlyNonNull Context context, int i) {
        return C0197GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context, i);
    }

    @C0452ShowFirstParty
    @C0206KeepForSdk
    public boolean isPlayStorePossiblyUpdating(@RecentlyNonNull Context context, int i) {
        return C0197GooglePlayServicesUtilLight.isPlayStorePossiblyUpdating(context, i);
    }

    @C0206KeepForSdk
    public boolean isUninstalledAppPossiblyUpdating(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        return C0197GooglePlayServicesUtilLight.zza(context, str);
    }

    @C0206KeepForSdk
    public boolean isUserResolvableError(int i) {
        return C0197GooglePlayServicesUtilLight.isUserRecoverableError(i);
    }

    @C0206KeepForSdk
    public void verifyGooglePlayServicesIsAvailable(@RecentlyNonNull Context context, int i) throws C0195GooglePlayServicesRepairableException, C0194GooglePlayServicesNotAvailableException {
        C0197GooglePlayServicesUtilLight.ensurePlayServicesAvailable(context, i);
    }

    @C0452ShowFirstParty
    @C0206KeepForSdk
    @RecentlyNullable
    public PendingIntent getErrorResolutionPendingIntent(@RecentlyNonNull Context context, int i, int i2, @Nullable String str) {
        Context context2 = context;
        int i3 = i2;
        Intent errorResolutionIntent = getErrorResolutionIntent(context2, i, str);
        if (errorResolutionIntent == null) {
            return null;
        }
        return PendingIntent.getActivity(context2, i3, errorResolutionIntent, Declaration.PACKAGE_ACCESS);
    }

    @C0206KeepForSdk
    public int isGooglePlayServicesAvailable(@RecentlyNonNull Context context, int i) {
        Context context2 = context;
        int isGooglePlayServicesAvailable = C0197GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context2, i);
        if (C0197GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context2, isGooglePlayServicesAvailable)) {
            return 18;
        }
        return isGooglePlayServicesAvailable;
    }

    @C0452ShowFirstParty
    @C0206KeepForSdk
    @RecentlyNullable
    public Intent getErrorResolutionIntent(@Nullable Context context, int i, @Nullable String str) {
        StringBuilder sb;
        Context context2 = context;
        String str2 = str;
        switch (i) {
            case 1:
            case 2:
                if (context2 != null && C0598DeviceProperties.isWearableWithoutPlayStore(context2)) {
                    return C0539zzs.zzc();
                }
                new StringBuilder();
                StringBuilder append = sb.append("gcore_");
                StringBuilder append2 = sb.append(GOOGLE_PLAY_SERVICES_VERSION_CODE);
                StringBuilder append3 = sb.append("-");
                if (!TextUtils.isEmpty(str2)) {
                    StringBuilder append4 = sb.append(str2);
                }
                StringBuilder append5 = sb.append("-");
                if (context2 != null) {
                    StringBuilder append6 = sb.append(context2.getPackageName());
                }
                StringBuilder append7 = sb.append("-");
                if (context2 != null) {
                    try {
                        StringBuilder append8 = sb.append(C0628Wrappers.packageManager(context2).getPackageInfo(context2.getPackageName(), 0).versionCode);
                    } catch (PackageManager.NameNotFoundException e) {
                    }
                }
                return C0539zzs.zzb("com.google.android.gms", sb.toString());
            case 3:
                return C0539zzs.zza("com.google.android.gms");
            default:
                return null;
        }
    }
}
