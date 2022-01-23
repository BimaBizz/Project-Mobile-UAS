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
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.internal.C0436HideFirstParty;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.C0452ShowFirstParty;
import com.google.android.gms.common.internal.C0517zzaf;
import com.google.android.gms.common.util.C0591ClientLibraryUtils;
import com.google.android.gms.common.util.C0598DeviceProperties;
import com.google.android.gms.common.util.C0609PlatformVersion;
import com.google.android.gms.common.util.C0616UidVerifier;
import com.google.android.gms.common.util.C0617VisibleForTesting;
import com.google.android.gms.common.util.C0623zza;
import com.google.android.gms.common.wrappers.C0628Wrappers;
import com.onesignal.OneSignalDbContract;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jose4j.jwk.RsaJsonWebKey;

@C0452ShowFirstParty
@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.GooglePlayServicesUtilLight */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C0197GooglePlayServicesUtilLight {
    @C0206KeepForSdk
    static final int GMS_AVAILABILITY_NOTIFICATION_ID = 10436;
    @C0206KeepForSdk
    static final int GMS_GENERAL_ERROR_NOTIFICATION_ID = 39789;
    @RecentlyNonNull
    @C0206KeepForSdk
    public static final String GOOGLE_PLAY_GAMES_PACKAGE = "com.google.android.play.games";
    @RecentlyNonNull
    @C0206KeepForSdk
    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    @C0206KeepForSdk
    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 12451000;
    @RecentlyNonNull
    @C0206KeepForSdk
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    @C0206KeepForSdk
    @C0617VisibleForTesting
    static final AtomicBoolean sCanceledAvailabilityNotification;
    @C0617VisibleForTesting
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

    @C0206KeepForSdk
    C0197GooglePlayServicesUtilLight() {
    }

    @C0206KeepForSdk
    @Deprecated
    public static void cancelAvailabilityErrorNotifications(@RecentlyNonNull Context context) {
        Context context2 = context;
        if (!sCanceledAvailabilityNotification.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context2.getSystemService(OneSignalDbContract.NotificationTable.TABLE_NAME);
                if (notificationManager != null) {
                    notificationManager.cancel(10436);
                }
            } catch (SecurityException e) {
            }
        }
    }

    @C0452ShowFirstParty
    @C0206KeepForSdk
    public static void enableUsingApkIndependentContext() {
        zzc.set(true);
    }

    @C0206KeepForSdk
    @Deprecated
    public static void ensurePlayServicesAvailable(@RecentlyNonNull Context context, int i) throws C0195GooglePlayServicesRepairableException, C0194GooglePlayServicesNotAvailableException {
        StringBuilder sb;
        Throwable th;
        Throwable th2;
        Context context2 = context;
        int isGooglePlayServicesAvailable = C0190GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context2, i);
        if (isGooglePlayServicesAvailable != 0) {
            Intent errorResolutionIntent = C0190GoogleApiAvailabilityLight.getInstance().getErrorResolutionIntent(context2, isGooglePlayServicesAvailable, RsaJsonWebKey.EXPONENT_MEMBER_NAME);
            new StringBuilder(57);
            StringBuilder append = sb.append("GooglePlayServices not available due to error ");
            StringBuilder append2 = sb.append(isGooglePlayServicesAvailable);
            int e = Log.e("GooglePlayServicesUtil", sb.toString());
            if (errorResolutionIntent == null) {
                new C0194GooglePlayServicesNotAvailableException(isGooglePlayServicesAvailable);
                throw th2;
            } else {
                new C0195GooglePlayServicesRepairableException(isGooglePlayServicesAvailable, "Google Play Services not available", errorResolutionIntent);
                throw th;
            }
        }
    }

    @C0452ShowFirstParty
    @C0206KeepForSdk
    @Deprecated
    public static int getApkVersion(@RecentlyNonNull Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            int w = Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @C0452ShowFirstParty
    @C0206KeepForSdk
    @Deprecated
    public static int getClientVersion(@RecentlyNonNull Context context) {
        Context context2 = context;
        C0446Preconditions.checkState(true);
        return C0591ClientLibraryUtils.getClientVersion(context2, context2.getPackageName());
    }

    @C0206KeepForSdk
    @Deprecated
    @RecentlyNullable
    public static PendingIntent getErrorPendingIntent(int i, @RecentlyNonNull Context context, int i2) {
        return C0190GoogleApiAvailabilityLight.getInstance().getErrorResolutionPendingIntent(context, i, i2);
    }

    @NonNull
    @C0206KeepForSdk
    @Deprecated
    @C0617VisibleForTesting
    public static String getErrorString(int i) {
        return C0184ConnectionResult.zza(i);
    }

    @C0452ShowFirstParty
    @RecentlyNullable
    @C0206KeepForSdk
    @Deprecated
    public static Intent getGooglePlayServicesAvailabilityRecoveryIntent(int i) {
        return C0190GoogleApiAvailabilityLight.getInstance().getErrorResolutionIntent((Context) null, i, (String) null);
    }

    @C0206KeepForSdk
    @RecentlyNullable
    public static Context getRemoteContext(@RecentlyNonNull Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    @C0206KeepForSdk
    @RecentlyNullable
    public static Resources getRemoteResource(@RecentlyNonNull Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    @C0452ShowFirstParty
    @C0206KeepForSdk
    public static boolean honorsDebugCertificates(@RecentlyNonNull Context context) {
        Context context2 = context;
        if (!zza) {
            try {
                PackageInfo packageInfo = C0628Wrappers.packageManager(context2).getPackageInfo("com.google.android.gms", 64);
                C0198GoogleSignatureVerifier instance = C0198GoogleSignatureVerifier.getInstance(context2);
                if (packageInfo == null || C0198GoogleSignatureVerifier.zzb(packageInfo, false) || !C0198GoogleSignatureVerifier.zzb(packageInfo, true)) {
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
        return zzb || !C0598DeviceProperties.isUserBuild();
    }

    @C0206KeepForSdk
    @Deprecated
    @C0436HideFirstParty
    public static int isGooglePlayServicesAvailable(@RecentlyNonNull Context context) {
        return isGooglePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    @C0206KeepForSdk
    @Deprecated
    public static boolean isGooglePlayServicesUid(@RecentlyNonNull Context context, int i) {
        return C0616UidVerifier.isGooglePlayServicesUid(context, i);
    }

    @C0452ShowFirstParty
    @C0206KeepForSdk
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

    @C0452ShowFirstParty
    @C0206KeepForSdk
    @Deprecated
    public static boolean isPlayStorePossiblyUpdating(@RecentlyNonNull Context context, int i) {
        Context context2 = context;
        if (i == 9) {
            return zza(context2, "com.android.vending");
        }
        return false;
    }

    @TargetApi(18)
    @C0206KeepForSdk
    public static boolean isRestrictedUserProfile(@RecentlyNonNull Context context) {
        Context context2 = context;
        if (C0609PlatformVersion.isAtLeastJellyBeanMR2()) {
            Object systemService = context2.getSystemService("user");
            Object checkNotNull = C0446Preconditions.checkNotNull(systemService);
            Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context2.getPackageName());
            if (applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"))) {
                return true;
            }
        }
        return false;
    }

    @C0452ShowFirstParty
    @C0206KeepForSdk
    @Deprecated
    @C0617VisibleForTesting
    public static boolean isSidewinderDevice(@RecentlyNonNull Context context) {
        return C0598DeviceProperties.isSidewinder(context);
    }

    @C0206KeepForSdk
    @Deprecated
    public static boolean isUserRecoverableError(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 9:
                return true;
            default:
                return false;
        }
    }

    @TargetApi(19)
    @C0206KeepForSdk
    @Deprecated
    public static boolean uidHasPackageName(@RecentlyNonNull Context context, int i, @RecentlyNonNull String str) {
        return C0616UidVerifier.uidHasPackageName(context, i, str);
    }

    @TargetApi(21)
    static boolean zza(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        boolean equals = str2.equals("com.google.android.gms");
        if (C0609PlatformVersion.isAtLeastLollipop()) {
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

    @C0206KeepForSdk
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
            int zzb2 = C0517zzaf.zzb(context2);
            if (zzb2 == 0) {
                new C0193GooglePlayServicesMissingManifestValueException();
                throw th2;
            } else if (zzb2 != GOOGLE_PLAY_SERVICES_VERSION_CODE) {
                new C0191GooglePlayServicesIncorrectManifestValueException(zzb2);
                throw th;
            }
        }
        if (!C0598DeviceProperties.isWearableWithoutPlayStore(context2)) {
            z = !C0598DeviceProperties.zzb(context2);
        } else {
            z = false;
        }
        if (i3 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0446Preconditions.checkArgument(z2);
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
            C0198GoogleSignatureVerifier instance = C0198GoogleSignatureVerifier.getInstance(context2);
            if (!C0198GoogleSignatureVerifier.zzb(packageInfo2, true)) {
                int w2 = Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
                i2 = 9;
            } else {
                if (z) {
                    Object checkNotNull = C0446Preconditions.checkNotNull(packageInfo);
                    if (!C0198GoogleSignatureVerifier.zzb(packageInfo, true)) {
                        int w3 = Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                        i2 = 9;
                    }
                }
                if (z && packageInfo != null && !packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    int w4 = Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                    i2 = 9;
                } else if (C0623zza.zza(packageInfo2.versionCode) < C0623zza.zza(i3)) {
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
