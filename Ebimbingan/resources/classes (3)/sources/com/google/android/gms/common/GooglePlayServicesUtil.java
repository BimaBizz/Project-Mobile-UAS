package com.google.android.gms.common;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.zag;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class GooglePlayServicesUtil extends GooglePlayServicesUtilLight {
    @RecentlyNonNull
    public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";
    @RecentlyNonNull
    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    @RecentlyNonNull
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    private GooglePlayServicesUtil() {
    }

    @Deprecated
    @RecentlyNullable
    public static Dialog getErrorDialog(int i, @RecentlyNonNull Activity activity, int i2) {
        return getErrorDialog(i, activity, i2, (DialogInterface.OnCancelListener) null);
    }

    @RecentlyNonNull
    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i, @RecentlyNonNull Context context, int i2) {
        return GooglePlayServicesUtilLight.getErrorPendingIntent(i, context, i2);
    }

    @RecentlyNonNull
    @Deprecated
    @VisibleForTesting
    public static String getErrorString(int i) {
        return GooglePlayServicesUtilLight.getErrorString(i);
    }

    @RecentlyNonNull
    public static Context getRemoteContext(@RecentlyNonNull Context context) {
        return GooglePlayServicesUtilLight.getRemoteContext(context);
    }

    @RecentlyNonNull
    public static Resources getRemoteResource(@RecentlyNonNull Context context) {
        return GooglePlayServicesUtilLight.getRemoteResource(context);
    }

    @Deprecated
    @HideFirstParty
    public static int isGooglePlayServicesAvailable(@RecentlyNonNull Context context) {
        return GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context);
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i) {
        return GooglePlayServicesUtilLight.isUserRecoverableError(i);
    }

    @Deprecated
    public static boolean showErrorDialogFragment(int i, @RecentlyNonNull Activity activity, int i2) {
        return showErrorDialogFragment(i, activity, i2, (DialogInterface.OnCancelListener) null);
    }

    @Deprecated
    public static void showErrorNotification(int i, @RecentlyNonNull Context context) {
        int i2 = i;
        Context context2 = context;
        GoogleApiAvailability instance = GoogleApiAvailability.getInstance();
        if (GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context2, i2) || GooglePlayServicesUtilLight.isPlayStorePossiblyUpdating(context2, i2)) {
            instance.zah(context2);
        } else {
            instance.showErrorNotification(context2, i2);
        }
    }

    @Deprecated
    @RecentlyNullable
    public static Dialog getErrorDialog(int i, @RecentlyNonNull Activity activity, int i2, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        int i3 = i;
        Activity activity2 = activity;
        int i4 = i2;
        DialogInterface.OnCancelListener onCancelListener2 = onCancelListener;
        if (true == GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(activity2, i3)) {
            i3 = 18;
        }
        return GoogleApiAvailability.getInstance().getErrorDialog(activity2, i3, i4, onCancelListener2);
    }

    @KeepForSdk
    @Deprecated
    public static int isGooglePlayServicesAvailable(@RecentlyNonNull Context context, int i) {
        return GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context, i);
    }

    @Deprecated
    public static boolean showErrorDialogFragment(int i, @RecentlyNonNull Activity activity, int i2, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        return showErrorDialogFragment(i, activity, (Fragment) null, i2, onCancelListener);
    }

    public static boolean showErrorDialogFragment(int i, @RecentlyNonNull Activity activity, @Nullable Fragment fragment, int i2, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        int i3 = i;
        Activity activity2 = activity;
        Fragment fragment2 = fragment;
        int i4 = i2;
        DialogInterface.OnCancelListener onCancelListener2 = onCancelListener;
        if (true == GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(activity2, i3)) {
            i3 = 18;
        }
        GoogleApiAvailability instance = GoogleApiAvailability.getInstance();
        if (fragment2 == null) {
            return instance.showErrorDialogFragment(activity2, i3, i4, onCancelListener2);
        }
        Dialog zaf = instance.zaf(activity2, i3, zag.zac(fragment2, GoogleApiAvailability.getInstance().getErrorResolutionIntent(activity2, i3, "d"), i4), onCancelListener2);
        if (zaf == null) {
            return false;
        }
        instance.zag(activity2, zaf, GMS_ERROR_DIALOG, onCancelListener2);
        return true;
    }
}
