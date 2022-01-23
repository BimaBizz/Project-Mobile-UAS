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
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.zzs;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;

@ShowFirstParty
@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class GoogleApiAvailabilityLight {
    @RecentlyNonNull
    @KeepForSdk
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    @KeepForSdk
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    @RecentlyNonNull
    @KeepForSdk
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    @KeepForSdk
    static final String TRACKING_SOURCE_DIALOG = "d";
    @KeepForSdk
    static final String TRACKING_SOURCE_NOTIFICATION = "n";
    private static final GoogleApiAvailabilityLight zza;

    static {
        GoogleApiAvailabilityLight googleApiAvailabilityLight;
        new GoogleApiAvailabilityLight();
        zza = googleApiAvailabilityLight;
    }

    @KeepForSdk
    GoogleApiAvailabilityLight() {
    }

    @RecentlyNonNull
    @KeepForSdk
    public static GoogleApiAvailabilityLight getInstance() {
        return zza;
    }

    @KeepForSdk
    public void cancelAvailabilityErrorNotifications(@RecentlyNonNull Context context) {
        GooglePlayServicesUtilLight.cancelAvailabilityErrorNotifications(context);
    }

    @ShowFirstParty
    @KeepForSdk
    public int getApkVersion(@RecentlyNonNull Context context) {
        return GooglePlayServicesUtilLight.getApkVersion(context);
    }

    @ShowFirstParty
    @KeepForSdk
    public int getClientVersion(@RecentlyNonNull Context context) {
        return GooglePlayServicesUtilLight.getClientVersion(context);
    }

    @ShowFirstParty
    @RecentlyNullable
    @KeepForSdk
    @Deprecated
    public Intent getErrorResolutionIntent(int i) {
        return getErrorResolutionIntent((Context) null, i, (String) null);
    }

    @KeepForSdk
    @RecentlyNullable
    public PendingIntent getErrorResolutionPendingIntent(@RecentlyNonNull Context context, int i, int i2) {
        return getErrorResolutionPendingIntent(context, i, i2, (String) null);
    }

    @NonNull
    @KeepForSdk
    public String getErrorString(int i) {
        return GooglePlayServicesUtilLight.getErrorString(i);
    }

    @KeepForSdk
    @HideFirstParty
    public int isGooglePlayServicesAvailable(@RecentlyNonNull Context context) {
        return isGooglePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isPlayServicesPossiblyUpdating(@RecentlyNonNull Context context, int i) {
        return GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context, i);
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isPlayStorePossiblyUpdating(@RecentlyNonNull Context context, int i) {
        return GooglePlayServicesUtilLight.isPlayStorePossiblyUpdating(context, i);
    }

    @KeepForSdk
    public boolean isUninstalledAppPossiblyUpdating(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        return GooglePlayServicesUtilLight.zza(context, str);
    }

    @KeepForSdk
    public boolean isUserResolvableError(int i) {
        return GooglePlayServicesUtilLight.isUserRecoverableError(i);
    }

    @KeepForSdk
    public void verifyGooglePlayServicesIsAvailable(@RecentlyNonNull Context context, int i) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        GooglePlayServicesUtilLight.ensurePlayServicesAvailable(context, i);
    }

    @ShowFirstParty
    @KeepForSdk
    @RecentlyNullable
    public PendingIntent getErrorResolutionPendingIntent(@RecentlyNonNull Context context, int i, int i2, @Nullable String str) {
        Context context2 = context;
        int i3 = i2;
        Intent errorResolutionIntent = getErrorResolutionIntent(context2, i, str);
        if (errorResolutionIntent == null) {
            return null;
        }
        return PendingIntent.getActivity(context2, i3, errorResolutionIntent, 134217728);
    }

    @KeepForSdk
    public int isGooglePlayServicesAvailable(@RecentlyNonNull Context context, int i) {
        Context context2 = context;
        int isGooglePlayServicesAvailable = GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context2, i);
        if (GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context2, isGooglePlayServicesAvailable)) {
            return 18;
        }
        return isGooglePlayServicesAvailable;
    }

    @ShowFirstParty
    @KeepForSdk
    @RecentlyNullable
    public Intent getErrorResolutionIntent(@Nullable Context context, int i, @Nullable String str) {
        StringBuilder sb;
        Context context2 = context;
        String str2 = str;
        switch (i) {
            case 1:
            case 2:
                if (context2 != null && DeviceProperties.isWearableWithoutPlayStore(context2)) {
                    return zzs.zzc();
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
                        StringBuilder append8 = sb.append(Wrappers.packageManager(context2).getPackageInfo(context2.getPackageName(), 0).versionCode);
                    } catch (PackageManager.NameNotFoundException e) {
                    }
                }
                return zzs.zzb("com.google.android.gms", sb.toString());
            case 3:
                return zzs.zza("com.google.android.gms");
            default:
                return null;
        }
    }
}
