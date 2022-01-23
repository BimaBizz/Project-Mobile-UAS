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
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.internal.C0436HideFirstParty;
import com.google.android.gms.common.internal.C0491zag;
import com.google.android.gms.common.util.C0617VisibleForTesting;

/* renamed from: com.google.android.gms.common.GooglePlayServicesUtil */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0196GooglePlayServicesUtil extends C0197GooglePlayServicesUtilLight {
    @RecentlyNonNull
    public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";
    @RecentlyNonNull
    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = C0197GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    @RecentlyNonNull
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    private C0196GooglePlayServicesUtil() {
    }

    @Deprecated
    @RecentlyNullable
    public static Dialog getErrorDialog(int i, @RecentlyNonNull Activity activity, int i2) {
        return getErrorDialog(i, activity, i2, (DialogInterface.OnCancelListener) null);
    }

    @RecentlyNonNull
    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i, @RecentlyNonNull Context context, int i2) {
        return C0197GooglePlayServicesUtilLight.getErrorPendingIntent(i, context, i2);
    }

    @RecentlyNonNull
    @Deprecated
    @C0617VisibleForTesting
    public static String getErrorString(int i) {
        return C0197GooglePlayServicesUtilLight.getErrorString(i);
    }

    @RecentlyNonNull
    public static Context getRemoteContext(@RecentlyNonNull Context context) {
        return C0197GooglePlayServicesUtilLight.getRemoteContext(context);
    }

    @RecentlyNonNull
    public static Resources getRemoteResource(@RecentlyNonNull Context context) {
        return C0197GooglePlayServicesUtilLight.getRemoteResource(context);
    }

    @Deprecated
    @C0436HideFirstParty
    public static int isGooglePlayServicesAvailable(@RecentlyNonNull Context context) {
        return C0197GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context);
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i) {
        return C0197GooglePlayServicesUtilLight.isUserRecoverableError(i);
    }

    @Deprecated
    public static boolean showErrorDialogFragment(int i, @RecentlyNonNull Activity activity, int i2) {
        return showErrorDialogFragment(i, activity, i2, (DialogInterface.OnCancelListener) null);
    }

    @Deprecated
    public static void showErrorNotification(int i, @RecentlyNonNull Context context) {
        int i2 = i;
        Context context2 = context;
        C0189GoogleApiAvailability instance = C0189GoogleApiAvailability.getInstance();
        if (C0197GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context2, i2) || C0197GooglePlayServicesUtilLight.isPlayStorePossiblyUpdating(context2, i2)) {
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
        if (true == C0197GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(activity2, i3)) {
            i3 = 18;
        }
        return C0189GoogleApiAvailability.getInstance().getErrorDialog(activity2, i3, i4, onCancelListener2);
    }

    @C0206KeepForSdk
    @Deprecated
    public static int isGooglePlayServicesAvailable(@RecentlyNonNull Context context, int i) {
        return C0197GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context, i);
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
        if (true == C0197GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(activity2, i3)) {
            i3 = 18;
        }
        C0189GoogleApiAvailability instance = C0189GoogleApiAvailability.getInstance();
        if (fragment2 == null) {
            return instance.showErrorDialogFragment(activity2, i3, i4, onCancelListener2);
        }
        Dialog zaf = instance.zaf(activity2, i3, C0491zag.zac(fragment2, C0189GoogleApiAvailability.getInstance().getErrorResolutionIntent(activity2, i3, "d"), i4), onCancelListener2);
        if (zaf == null) {
            return false;
        }
        instance.zag(activity2, zaf, "GooglePlayServicesErrorDialog", onCancelListener2);
        return true;
    }
}
