package com.onesignal;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.onesignal.NotificationBundleProcessor;
import com.onesignal.NotificationExtenderService;

public class GcmBroadcastReceiver extends WakefulBroadcastReceiver {
    private static final String GCM_RECEIVE_ACTION = "com.google.android.c2dm.intent.RECEIVE";
    private static final String GCM_TYPE = "gcm";
    private static final String MESSAGE_TYPE_EXTRA_KEY = "message_type";

    public GcmBroadcastReceiver() {
    }

    private static boolean isGcmMessage(Intent intent) {
        Intent intent2 = intent;
        if (!GCM_RECEIVE_ACTION.equals(intent2.getAction())) {
            return false;
        }
        String messageType = intent2.getStringExtra(MESSAGE_TYPE_EXTRA_KEY);
        return messageType == null || GCM_TYPE.equals(messageType);
    }

    public void onReceive(Context context, Intent intent) {
        Context context2 = context;
        Intent intent2 = intent;
        Bundle bundle = intent2.getExtras();
        if (bundle != null && !"google.com/iid".equals(bundle.getString("from"))) {
            OneSignal.setAppContext(context2);
            NotificationBundleProcessor.ProcessedBundleResult processedResult = processOrderBroadcast(context2, intent2, bundle);
            if (processedResult == null) {
                setSuccessfulResultCode();
            } else if (processedResult.isDup || processedResult.hasExtenderService) {
                setAbort();
            } else if (!processedResult.isOneSignalPayload || !OneSignal.getFilterOtherGCMReceivers(context2)) {
                setSuccessfulResultCode();
            } else {
                setAbort();
            }
        }
    }

    private void setSuccessfulResultCode() {
        if (isOrderedBroadcast()) {
            setResultCode(-1);
        }
    }

    private void setAbort() {
        if (isOrderedBroadcast()) {
            abortBroadcast();
            setResultCode(-1);
        }
    }

    @Nullable
    private static NotificationBundleProcessor.ProcessedBundleResult processOrderBroadcast(Context context, Intent intent, Bundle bundle) {
        Context context2 = context;
        Bundle bundle2 = bundle;
        if (!isGcmMessage(intent)) {
            return null;
        }
        NotificationBundleProcessor.ProcessedBundleResult processedResult = NotificationBundleProcessor.processBundleFromReceiver(context2, bundle2);
        if (processedResult.processed()) {
            return processedResult;
        }
        startGCMService(context2, bundle2);
        return processedResult;
    }

    static void startGCMService(Context context, Bundle bundle) {
        Context context2 = context;
        Bundle bundle2 = bundle;
        if (!NotificationBundleProcessor.hasRemoteResource(bundle2)) {
            NotificationBundleProcessor.ProcessFromGCMIntentService(context2, setCompatBundleForServer(bundle2, BundleCompatFactory.getInstance()), (NotificationExtenderService.OverrideSettings) null);
            return;
        }
        if ((Integer.parseInt(bundle2.getString("pri", "0")) > 9) || Build.VERSION.SDK_INT < 26) {
            try {
                startGCMServiceWithWakefulService(context2, bundle2);
            } catch (IllegalStateException e) {
                IllegalStateException e2 = e;
                if (Build.VERSION.SDK_INT >= 21) {
                    startGCMServiceWithJobIntentService(context2, bundle2);
                    return;
                }
                throw e2;
            }
        } else {
            startGCMServiceWithJobIntentService(context2, bundle2);
        }
    }

    @TargetApi(21)
    private static void startGCMServiceWithJobIntentService(Context context, Bundle bundle) {
        Intent intent;
        Context context2 = context;
        BundleCompat taskExtras = setCompatBundleForServer(bundle, BundleCompatFactory.getInstance());
        new Intent(context2, GcmIntentJobService.class);
        Intent intent2 = intent;
        Intent putExtra = intent2.putExtra(GcmIntentJobService.BUNDLE_EXTRA, (Parcelable) taskExtras.getBundle());
        GcmIntentJobService.enqueueWork(context2, intent2);
    }

    private static void startGCMServiceWithWakefulService(Context context, Bundle bundle) {
        ComponentName componentName;
        BundleCompat bundleCompat;
        Intent intent;
        Context context2 = context;
        new ComponentName(context2.getPackageName(), GcmIntentService.class.getName());
        new BundleCompatBundle();
        BundleCompat taskExtras = setCompatBundleForServer(bundle, bundleCompat);
        new Intent();
        ComponentName startWakefulService = startWakefulService(context2, intent.replaceExtras((Bundle) taskExtras.getBundle()).setComponent(componentName));
    }

    private static BundleCompat setCompatBundleForServer(Bundle bundle, BundleCompat bundleCompat) {
        BundleCompat taskExtras = bundleCompat;
        taskExtras.putString("json_payload", NotificationBundleProcessor.bundleAsJSONObject(bundle).toString());
        taskExtras.putLong("timestamp", Long.valueOf(System.currentTimeMillis() / 1000));
        return taskExtras;
    }
}
