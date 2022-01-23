package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.zzaf;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.util.zza;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.concurrent.atomic.AtomicBoolean;

@ShowFirstParty
@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class GooglePlayServicesUtilLight {
    @KeepForSdk
    static final int GMS_AVAILABILITY_NOTIFICATION_ID = 10436;
    @KeepForSdk
    static final int GMS_GENERAL_ERROR_NOTIFICATION_ID = 39789;
    @RecentlyNonNull
    @KeepForSdk
    public static final String GOOGLE_PLAY_GAMES_PACKAGE = "com.google.android.play.games";
    @RecentlyNonNull
    @KeepForSdk
    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    @KeepForSdk
    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 12451000;
    @RecentlyNonNull
    @KeepForSdk
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    @KeepForSdk
    @VisibleForTesting
    static final AtomicBoolean sCanceledAvailabilityNotification;
    @VisibleForTesting
    static boolean zza = false;
    private static boolean zzb = false;
    private static final AtomicBoolean zzc;

    static {
        AtomicBoolean atomicBoolean;
        AtomicBoolean atomicBoolean2;
        new AtomicBoolean();
        sCanceledAvailabilityNotification = atomicBoolean;
        new AtomicBoolean();
        zzc = atomicBoolean2;
    }

    @KeepForSdk
    GooglePlayServicesUtilLight() {
    }

    @KeepForSdk
    @Deprecated
    public static void cancelAvailabilityErrorNotifications(@RecentlyNonNull Context context) {
        Context context2 = context;
        if (!sCanceledAvailabilityNotification.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context2.getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(GMS_AVAILABILITY_NOTIFICATION_ID);
                }
            } catch (SecurityException e) {
            }
        }
    }

    @ShowFirstParty
    @KeepForSdk
    public static void enableUsingApkIndependentContext() {
        zzc.set(true);
    }

    @KeepForSdk
    @Deprecated
    public static void ensurePlayServicesAvailable(@RecentlyNonNull Context context, int i) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        StringBuilder sb;
        Throwable th;
        Throwable th2;
        Context context2 = context;
        int isGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context2, i);
        if (isGooglePlayServicesAvailable != 0) {
            Intent errorResolutionIntent = GoogleApiAvailabilityLight.getInstance().getErrorResolutionIntent(context2, isGooglePlayServicesAvailable, "e");
            new StringBuilder(57);
            StringBuilder append = sb.append("GooglePlayServices not available due to error ");
            StringBuilder append2 = sb.append(isGooglePlayServicesAvailable);
            int e = Log.e("GooglePlayServicesUtil", sb.toString());
            if (errorResolutionIntent == null) {
                new GooglePlayServicesNotAvailableException(isGooglePlayServicesAvailable);
                throw th2;
            } else {
                new GooglePlayServicesRepairableException(isGooglePlayServicesAvailable, "Google Play Services not available", errorResolutionIntent);
                throw th;
            }
        }
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public static int getApkVersion(@RecentlyNonNull Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            int w = Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public static int getClientVersion(@RecentlyNonNull Context context) {
        Context context2 = context;
        Preconditions.checkState(true);
        return ClientLibraryUtils.getClientVersion(context2, context2.getPackageName());
    }

    @KeepForSdk
    @Deprecated
    @RecentlyNullable
    public static PendingIntent getErrorPendingIntent(int i, @RecentlyNonNull Context context, int i2) {
        return GoogleApiAvailabilityLight.getInstance().getErrorResolutionPendingIntent(context, i, i2);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    @VisibleForTesting
    public static String getErrorString(int i) {
        return ConnectionResult.zza(i);
    }

    @ShowFirstParty
    @RecentlyNullable
    @KeepForSdk
    @Deprecated
    public static Intent getGooglePlayServicesAvailabilityRecoveryIntent(int i) {
        return GoogleApiAvailabilityLight.getInstance().getErrorResolutionIntent((Context) null, i, (String) null);
    }

    @KeepForSdk
    @RecentlyNullable
    public static Context getRemoteContext(@RecentlyNonNull Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    @KeepForSdk
    @RecentlyNullable
    public static Resources getRemoteResource(@RecentlyNonNull Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    @ShowFirstParty
    @KeepForSdk
    public static boolean honorsDebugCertificates(@RecentlyNonNull Context context) {
        Context context2 = context;
        if (!zza) {
            try {
                PackageInfo packageInfo = Wrappers.packageManager(context2).getPackageInfo("com.google.android.gms", 64);
                GoogleSignatureVerifier instance = GoogleSignatureVerifier.getInstance(context2);
                if (packageInfo == null || GoogleSignatureVerifier.zzb(packageInfo, false) || !GoogleSignatureVerifier.zzb(packageInfo, true)) {
                    zzb = false;
                } else {
                    zzb = true;
                }
                zza = true;
            } catch (PackageManager.NameNotFoundException e) {
                int w = Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
                zza = true;
            } catch (Throwable th) {
                zza = true;
                throw th;
            }
        }
        return zzb || !DeviceProperties.isUserBuild();
    }

    @KeepForSdk
    @Deprecated
    @HideFirstParty
    public static int isGooglePlayServicesAvailable(@RecentlyNonNull Context context) {
        return isGooglePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    @KeepForSdk
    @Deprecated
    public static boolean isGooglePlayServicesUid(@RecentlyNonNull Context context, int i) {
        return UidVerifier.isGooglePlayServicesUid(context, i);
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public static boolean isPlayServicesPossiblyUpdating(@RecentlyNonNull Context context, int i) {
        Context context2 = context;
        int i2 = i;
        if (i2 == 18) {
            return true;
        }
        if (i2 == 1) {
            return zza(context2, "com.google.android.gms");
        }
        return false;
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public static boolean isPlayStorePossiblyUpdating(@RecentlyNonNull Context context, int i) {
        Context context2 = context;
        if (i == 9) {
            return zza(context2, "com.android.vending");
        }
        return false;
    }

    @TargetApi(18)
    @KeepForSdk
    public static boolean isRestrictedUserProfile(@RecentlyNonNull Context context) {
        Context context2 = context;
        if (PlatformVersion.isAtLeastJellyBeanMR2()) {
            Object systemService = context2.getSystemService("user");
            Object checkNotNull = Preconditions.checkNotNull(systemService);
            Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context2.getPackageName());
            if (applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"))) {
                return true;
            }
        }
        return false;
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    @VisibleForTesting
    public static boolean isSidewinderDevice(@RecentlyNonNull Context context) {
        return DeviceProperties.isSidewinder(context);
    }

    @KeepForSdk
    @Deprecated
    public static boolean isUserRecoverableError(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case ConnectionResult.SERVICE_INVALID:
                return true;
            default:
                return false;
        }
    }

    @TargetApi(19)
    @KeepForSdk
    @Deprecated
    public static boolean uidHasPackageName(@RecentlyNonNull Context context, int i, @RecentlyNonNull String str) {
        return UidVerifier.uidHasPackageName(context, i, str);
    }

    @TargetApi(21)
    static boolean zza(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        boolean equals = str2.equals("com.google.android.gms");
        if (PlatformVersion.isAtLeastLollipop()) {
            try {
                for (PackageInstaller.SessionInfo appPackageName : context2.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str2.equals(appPackageName.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception e) {
                return false;
            }
        }
        try {
            ApplicationInfo applicationInfo = context2.getPackageManager().getApplicationInfo(str2, 8192);
            if (equals) {
                return applicationInfo.enabled;
            }
            return applicationInfo.enabled && !isRestrictedUserProfile(context2);
        } catch (PackageManager.NameNotFoundException e2) {
            return false;
        }
    }

    @KeepForSdk
    @Deprecated
    public static int isGooglePlayServicesAvailable(@RecentlyNonNull Context context, int i) {
        boolean z;
        boolean z2;
        PackageInfo packageInfo;
        int i2;
        StringBuilder sb;
        Throwable th;
        Throwable th2;
        Context context2 = context;
        int i3 = i;
        try {
            String string = context2.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable th3) {
            int e = Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context2.getPackageName()) && !zzc.get()) {
            int zzb2 = zzaf.zzb(context2);
            if (zzb2 == 0) {
                new GooglePlayServicesMissingManifestValueException();
                throw th2;
            } else if (zzb2 != GOOGLE_PLAY_SERVICES_VERSION_CODE) {
                new GooglePlayServicesIncorrectManifestValueException(zzb2);
                throw th;
            }
        }
        if (!DeviceProperties.isWearableWithoutPlayStore(context2)) {
            z = !DeviceProperties.zzb(context2);
        } else {
            z = false;
        }
        if (i3 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2);
        String packageName = context2.getPackageName();
        PackageManager packageManager = context2.getPackageManager();
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException e2) {
                int w = Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
                i2 = 9;
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            GoogleSignatureVerifier instance = GoogleSignatureVerifier.getInstance(context2);
            if (!GoogleSignatureVerifier.zzb(packageInfo2, true)) {
                int w2 = Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
                i2 = 9;
            } else {
                if (z) {
                    Object checkNotNull = Preconditions.checkNotNull(packageInfo);
                    if (!GoogleSignatureVerifier.zzb(packageInfo, true)) {
                        int w3 = Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                        i2 = 9;
                    }
                }
                if (z && packageInfo != null && !packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    int w4 = Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                    i2 = 9;
                } else if (zza.zza(packageInfo2.versionCode) < zza.zza(i3)) {
                    int i4 = packageInfo2.versionCode;
                    new StringBuilder(String.valueOf(packageName).length() + 82);
                    StringBuilder append = sb.append("Google Play services out of date for ");
                    StringBuilder append2 = sb.append(packageName);
                    StringBuilder append3 = sb.append(".  Requires ");
                    StringBuilder append4 = sb.append(i3);
                    StringBuilder append5 = sb.append(" but found ");
                    StringBuilder append6 = sb.append(i4);
                    int w5 = Log.w("GooglePlayServicesUtil", sb.toString());
                    i2 = 2;
                } else {
                    ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        try {
                            applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                        } catch (PackageManager.NameNotFoundException e3) {
                            int wtf = Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e3);
                            i2 = 1;
                        }
                    }
                    if (applicationInfo.enabled) {
                        return 0;
                    }
                    i2 = 3;
                }
            }
        } catch (PackageManager.NameNotFoundException e4) {
            int w6 = Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
            i2 = 1;
        }
        return i2;
    }
}
