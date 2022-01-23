package com.onesignal;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.NonNull;
import com.onesignal.ActivityLifecycleHandler;
import com.onesignal.AndroidSupportV4Compat;
import com.onesignal.OneSignal;

public class PermissionsActivity extends Activity {
    private static final int DELAY_TIME_CALLBACK_CALL = 500;
    private static final int REQUEST_LOCATION = 2;
    private static final int REQUEST_SETTINGS = 3;
    private static final String TAG = PermissionsActivity.class.getCanonicalName();
    private static ActivityLifecycleHandler.ActivityAvailableListener activityAvailableListener;
    static boolean answered;
    static boolean fallbackToSettings;
    static boolean neverAskAgainClicked;
    static boolean waiting;

    public PermissionsActivity() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        Bundle savedInstanceState = bundle;
        super.onCreate(savedInstanceState);
        OneSignal.setAppContext(this);
        if (savedInstanceState == null || !savedInstanceState.getBoolean("android:hasCurrentPermissionsRequest", false)) {
            requestPermission();
        } else {
            waiting = true;
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (OneSignal.isInitDone()) {
            requestPermission();
        }
    }

    private void requestPermission() {
        if (Build.VERSION.SDK_INT < 23) {
            finish();
            overridePendingTransition(R.anim.onesignal_fade_in, R.anim.onesignal_fade_out);
        } else if (!waiting) {
            waiting = true;
            neverAskAgainClicked = !AndroidSupportV4Compat.ActivityCompat.shouldShowRequestPermissionRationale(this, LocationController.requestPermission);
            AndroidSupportV4Compat.ActivityCompat.requestPermissions(this, new String[]{LocationController.requestPermission}, 2);
        }
    }

    public void onRequestPermissionsResult(int requestCode, @NonNull String[] strArr, @NonNull int[] iArr) {
        Handler handler;
        Runnable runnable;
        String[] strArr2 = strArr;
        int[] grantResults = iArr;
        answered = true;
        waiting = false;
        if (requestCode == 2) {
            new Handler();
            final int[] iArr2 = grantResults;
            new Runnable(this) {
                final /* synthetic */ PermissionsActivity this$0;

                {
                    this.this$0 = this$0;
                }

                public void run() {
                    boolean granted = iArr2.length > 0 && iArr2[0] == 0;
                    LocationController.sendAndClearPromptHandlers(true, granted ? OneSignal.PromptActionResult.PERMISSION_GRANTED : OneSignal.PromptActionResult.PERMISSION_DENIED);
                    if (granted) {
                        LocationController.startGetLocation();
                        return;
                    }
                    this.this$0.attemptToShowLocationPermissionSettings();
                    LocationController.fireFailedComplete();
                }
            };
            boolean postDelayed = handler.postDelayed(runnable, 500);
        }
        ActivityLifecycleHandler handler2 = ActivityLifecycleListener.getActivityLifecycleHandler();
        if (handler2 != null) {
            handler2.removeActivityAvailableListener(TAG);
        }
        finish();
        overridePendingTransition(R.anim.onesignal_fade_in, R.anim.onesignal_fade_out);
    }

    /* access modifiers changed from: private */
    public void attemptToShowLocationPermissionSettings() {
        if (fallbackToSettings && neverAskAgainClicked && !AndroidSupportV4Compat.ActivityCompat.shouldShowRequestPermissionRationale(this, LocationController.requestPermission)) {
            showLocationPermissionSettings();
        }
    }

    private void showLocationPermissionSettings() {
        AlertDialog.Builder builder;
        DialogInterface.OnClickListener onClickListener;
        DialogInterface.OnClickListener onClickListener2;
        new AlertDialog.Builder(OneSignal.getCurrentActivity());
        new DialogInterface.OnClickListener(this) {
            final /* synthetic */ PermissionsActivity this$0;

            {
                this.this$0 = this$0;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent;
                StringBuilder sb;
                DialogInterface dialogInterface2 = dialogInterface;
                int i2 = i;
                new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                Intent intent2 = intent;
                new StringBuilder();
                Intent data = intent2.setData(Uri.parse(sb.append("package:").append(this.this$0.getPackageName()).toString()));
                this.this$0.startActivity(intent2);
                LocationController.sendAndClearPromptHandlers(true, OneSignal.PromptActionResult.PERMISSION_DENIED);
            }
        };
        new DialogInterface.OnClickListener(this) {
            final /* synthetic */ PermissionsActivity this$0;

            {
                this.this$0 = this$0;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                DialogInterface dialogInterface2 = dialogInterface;
                int i2 = i;
                LocationController.sendAndClearPromptHandlers(true, OneSignal.PromptActionResult.PERMISSION_DENIED);
            }
        };
        AlertDialog show = builder.setTitle(R.string.location_not_available_title).setMessage(R.string.location_not_available_open_settings_message).setPositiveButton(R.string.location_not_available_open_settings_option, onClickListener).setNegativeButton(17039369, onClickListener2).show();
    }

    static void startPrompt(boolean z) {
        ActivityLifecycleHandler.ActivityAvailableListener activityAvailableListener2;
        boolean fallbackCondition = z;
        if (!waiting && !answered) {
            fallbackToSettings = fallbackCondition;
            new ActivityLifecycleHandler.ActivityAvailableListener() {
                public void available(@NonNull Activity activity) {
                    Intent intent;
                    Activity activity2 = activity;
                    if (!activity2.getClass().equals(PermissionsActivity.class)) {
                        new Intent(activity2, PermissionsActivity.class);
                        Intent intent2 = intent;
                        Intent flags = intent2.setFlags(131072);
                        activity2.startActivity(intent2);
                        activity2.overridePendingTransition(R.anim.onesignal_fade_in, R.anim.onesignal_fade_out);
                    }
                }
            };
            activityAvailableListener = activityAvailableListener2;
            ActivityLifecycleHandler handler = ActivityLifecycleListener.getActivityLifecycleHandler();
            if (handler != null) {
                handler.addActivityAvailableListener(TAG, activityAvailableListener);
            }
        }
    }
}
