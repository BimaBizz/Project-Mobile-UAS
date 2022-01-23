package com.onesignal;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import com.google.android.gms.common.GoogleApiAvailability;

class GooglePlayServicesUpgradePrompt {
    private static final int PLAY_SERVICES_RESOLUTION_REQUEST = 9000;

    GooglePlayServicesUpgradePrompt() {
    }

    private static boolean isGooglePlayStoreInstalled() {
        try {
            PackageManager pm = OneSignal.appContext.getPackageManager();
            return !((String) pm.getPackageInfo("com.google.android.gms", 128).applicationInfo.loadLabel(pm)).equals("Market");
        } catch (PackageManager.NameNotFoundException e) {
            PackageManager.NameNotFoundException nameNotFoundException = e;
            return false;
        }
    }

    static void showUpdateGPSDialog() {
        Runnable runnable;
        if (OSUtils.isAndroidDeviceType() && isGooglePlayStoreInstalled() && !OneSignalPrefs.getBool(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_GT_DO_NOT_SHOW_MISSING_GPS, false)) {
            new Runnable() {
                public void run() {
                    AlertDialog.Builder builder;
                    DialogInterface.OnClickListener onClickListener;
                    DialogInterface.OnClickListener onClickListener2;
                    Activity activity = OneSignal.getCurrentActivity();
                    if (activity != null && !OneSignal.mInitBuilder.mDisableGmsMissingPrompt) {
                        String alertBodyText = OSUtils.getResourceString(activity, "onesignal_gms_missing_alert_text", "To receive push notifications please press 'Update' to enable 'Google Play services'.");
                        String alertButtonUpdate = OSUtils.getResourceString(activity, "onesignal_gms_missing_alert_button_update", "Update");
                        String alertButtonSkip = OSUtils.getResourceString(activity, "onesignal_gms_missing_alert_button_skip", "Skip");
                        String alertButtonClose = OSUtils.getResourceString(activity, "onesignal_gms_missing_alert_button_close", "Close");
                        new AlertDialog.Builder(activity);
                        final Activity activity2 = activity;
                        new DialogInterface.OnClickListener(this) {
                            final /* synthetic */ AnonymousClass1 this$0;

                            {
                                this.this$0 = this$0;
                            }

                            public void onClick(DialogInterface dialogInterface, int i) {
                                DialogInterface dialogInterface2 = dialogInterface;
                                int i2 = i;
                                GooglePlayServicesUpgradePrompt.OpenPlayStoreToApp(activity2);
                            }
                        };
                        new DialogInterface.OnClickListener(this) {
                            final /* synthetic */ AnonymousClass1 this$0;

                            {
                                this.this$0 = this$0;
                            }

                            public void onClick(DialogInterface dialogInterface, int i) {
                                DialogInterface dialogInterface2 = dialogInterface;
                                int i2 = i;
                                OneSignalPrefs.saveBool(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_GT_DO_NOT_SHOW_MISSING_GPS, true);
                            }
                        };
                        builder.setMessage(alertBodyText).setPositiveButton(alertButtonUpdate, onClickListener).setNegativeButton(alertButtonSkip, onClickListener2).setNeutralButton(alertButtonClose, (DialogInterface.OnClickListener) null).create().show();
                    }
                }
            };
            OSUtils.runOnMainUIThread(runnable);
        }
    }

    /* access modifiers changed from: private */
    public static void OpenPlayStoreToApp(Activity activity) {
        Activity activity2 = activity;
        try {
            GoogleApiAvailability apiAvailability = GoogleApiAvailability.getInstance();
            PendingIntent pendingIntent = apiAvailability.getErrorResolutionPendingIntent(activity2, apiAvailability.isGooglePlayServicesAvailable(OneSignal.appContext), PLAY_SERVICES_RESOLUTION_REQUEST);
            if (pendingIntent != null) {
                pendingIntent.send();
            }
        } catch (PendingIntent.CanceledException e) {
            e.printStackTrace();
        }
    }
}
