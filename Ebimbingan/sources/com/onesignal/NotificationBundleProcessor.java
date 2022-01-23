package com.onesignal;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.microsoft.appcenter.ingestion.models.CommonProperties;
import com.onesignal.NotificationExtenderService;
import com.onesignal.OSNotificationPayload;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalDbContract;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class NotificationBundleProcessor {
    static final String DEFAULT_ACTION = "__DEFAULT__";
    private static final String IAM_PREVIEW_KEY = "os_in_app_message_preview_id";
    public static final String PUSH_ADDITIONAL_DATA_KEY = "a";
    public static final String PUSH_MINIFIED_BUTTONS_LIST = "o";
    public static final String PUSH_MINIFIED_BUTTON_ICON = "p";
    public static final String PUSH_MINIFIED_BUTTON_ID = "i";
    public static final String PUSH_MINIFIED_BUTTON_TEXT = "n";

    NotificationBundleProcessor() {
    }

    static void ProcessFromGCMIntentService(Context context, BundleCompat bundleCompat, NotificationExtenderService.OverrideSettings overrideSettings) {
        NotificationGenerationJob notificationGenerationJob;
        JSONObject jSONObject;
        NotificationExtenderService.OverrideSettings overrideSettings2;
        StringBuilder sb;
        Context context2 = context;
        BundleCompat bundle = bundleCompat;
        NotificationExtenderService.OverrideSettings overrideSettings3 = overrideSettings;
        OneSignal.setAppContext(context2);
        try {
            String jsonStrPayload = bundle.getString("json_payload");
            if (jsonStrPayload == null) {
                OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.ERROR;
                new StringBuilder();
                OneSignal.Log(log_level, sb.append("json_payload key is nonexistent from mBundle passed to ProcessFromGCMIntentService: ").append(bundle).toString());
                return;
            }
            new NotificationGenerationJob(context2);
            NotificationGenerationJob notifJob = notificationGenerationJob;
            notifJob.restoring = bundle.getBoolean("restoring", false);
            notifJob.shownTimeStamp = bundle.getLong("timestamp");
            new JSONObject(jsonStrPayload);
            notifJob.jsonPayload = jSONObject;
            notifJob.isInAppPreviewPush = inAppPreviewPushUUID(notifJob.jsonPayload) != null;
            if (notifJob.restoring || notifJob.isInAppPreviewPush || !OneSignal.notValidOrDuplicated(context2, notifJob.jsonPayload)) {
                if (bundle.containsKey("android_notif_id")) {
                    if (overrideSettings3 == null) {
                        new NotificationExtenderService.OverrideSettings();
                        overrideSettings3 = overrideSettings2;
                    }
                    overrideSettings3.androidNotificationId = bundle.getInt("android_notif_id");
                }
                notifJob.overrideSettings = overrideSettings3;
                int ProcessJobForDisplay = ProcessJobForDisplay(notifJob);
                if (notifJob.restoring) {
                    OSUtils.sleep(100);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    static int ProcessJobForDisplay(NotificationGenerationJob notificationGenerationJob) {
        JSONObject jSONObject;
        NotificationGenerationJob notifJob = notificationGenerationJob;
        notifJob.showAsAlert = OneSignal.getInAppAlertNotificationEnabled() && OneSignal.isAppActive();
        processCollapseKey(notifJob);
        if (shouldDisplayNotif(notifJob)) {
            GenerateNotification.fromJsonPayload(notifJob);
        }
        if (!notifJob.restoring && !notifJob.isInAppPreviewPush) {
            processNotification(notifJob, false);
            try {
                new JSONObject(notifJob.jsonPayload.toString());
                JSONObject jsonObject = jSONObject;
                JSONObject put = jsonObject.put(GenerateNotification.BUNDLE_KEY_ANDROID_NOTIFICATION_ID, notifJob.getAndroidId());
                OneSignal.handleNotificationReceived(newJsonArray(jsonObject), true, notifJob.showAsAlert);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return notifJob.getAndroidId().intValue();
    }

    private static boolean shouldDisplayNotif(NotificationGenerationJob notificationGenerationJob) {
        NotificationGenerationJob notifJob = notificationGenerationJob;
        if (notifJob.isInAppPreviewPush && Build.VERSION.SDK_INT <= 18) {
            return false;
        }
        return notifJob.hasExtender() || shouldDisplay(notifJob.jsonPayload.optString("alert"));
    }

    /* access modifiers changed from: private */
    public static JSONArray bundleAsJsonArray(Bundle bundle) {
        JSONArray jSONArray;
        new JSONArray();
        JSONArray jsonArray = jSONArray;
        JSONArray put = jsonArray.put(bundleAsJSONObject(bundle));
        return jsonArray;
    }

    private static void saveAndProcessNotification(Context context, Bundle bundle, boolean opened, int notificationId) {
        NotificationGenerationJob notificationGenerationJob;
        NotificationExtenderService.OverrideSettings overrideSettings;
        new NotificationGenerationJob(context);
        NotificationGenerationJob notifJob = notificationGenerationJob;
        notifJob.jsonPayload = bundleAsJSONObject(bundle);
        new NotificationExtenderService.OverrideSettings();
        notifJob.overrideSettings = overrideSettings;
        notifJob.overrideSettings.androidNotificationId = Integer.valueOf(notificationId);
        processNotification(notifJob, opened);
    }

    static void processNotification(NotificationGenerationJob notificationGenerationJob, boolean opened) {
        NotificationGenerationJob notifiJob = notificationGenerationJob;
        saveNotification(notifiJob, opened);
        if (notifiJob.isNotificationToDisplay()) {
            String notificationId = notifiJob.getApiNotificationId();
            OneSignal.getSessionManager().onNotificationReceived(notificationId);
            OSReceiveReceiptController.getInstance().sendReceiveReceipt(notificationId);
        }
    }

    private static void saveNotification(NotificationGenerationJob notificationGenerationJob, boolean z) {
        ContentValues contentValues;
        StringBuilder sb;
        ContentValues contentValues2;
        NotificationGenerationJob notifiJob = notificationGenerationJob;
        boolean opened = z;
        Context context = notifiJob.context;
        JSONObject jsonPayload = notifiJob.jsonPayload;
        try {
            JSONObject customJSON = getCustomJSONObject(notifiJob.jsonPayload);
            OneSignalDbHelper dbHelper = OneSignalDbHelper.getInstance(notifiJob.context);
            if (notifiJob.isNotificationToDisplay()) {
                new StringBuilder();
                String whereStr = sb.append("android_notification_id = ").append(notifiJob.getAndroidIdWithoutCreate()).toString();
                new ContentValues();
                ContentValues values = contentValues2;
                values.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_DISMISSED, 1);
                int update = dbHelper.update(OneSignalDbContract.NotificationTable.TABLE_NAME, values, whereStr, (String[]) null);
                BadgeCountUpdater.update(dbHelper, context);
            }
            new ContentValues();
            ContentValues values2 = contentValues;
            values2.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_NOTIFICATION_ID, customJSON.optString("i"));
            if (jsonPayload.has("grp")) {
                values2.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_GROUP_ID, jsonPayload.optString("grp"));
            }
            if (jsonPayload.has("collapse_key") && !"do_not_collapse".equals(jsonPayload.optString("collapse_key"))) {
                values2.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_COLLAPSE_ID, jsonPayload.optString("collapse_key"));
            }
            values2.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_OPENED, Integer.valueOf(opened ? 1 : 0));
            if (!opened) {
                values2.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID, Integer.valueOf(notifiJob.getAndroidIdWithoutCreate()));
            }
            if (notifiJob.getTitle() != null) {
                values2.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE, notifiJob.getTitle().toString());
            }
            if (notifiJob.getBody() != null) {
                values2.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE, notifiJob.getBody().toString());
            }
            values2.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_EXPIRE_TIME, Long.valueOf((jsonPayload.optLong("google.sent_time", SystemClock.currentThreadTimeMillis()) / 1000) + ((long) jsonPayload.optInt("google.ttl", 259200))));
            values2.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_FULL_DATA, jsonPayload.toString());
            dbHelper.insertOrThrow(OneSignalDbContract.NotificationTable.TABLE_NAME, (String) null, values2);
            if (!opened) {
                BadgeCountUpdater.update(dbHelper, context);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    static void markRestoredNotificationAsDismissed(NotificationGenerationJob notificationGenerationJob) {
        StringBuilder sb;
        ContentValues contentValues;
        NotificationGenerationJob notifiJob = notificationGenerationJob;
        if (notifiJob.getAndroidIdWithoutCreate() != -1) {
            new StringBuilder();
            String whereStr = sb.append("android_notification_id = ").append(notifiJob.getAndroidIdWithoutCreate()).toString();
            OneSignalDbHelper dbHelper = OneSignalDbHelper.getInstance(notifiJob.context);
            new ContentValues();
            ContentValues values = contentValues;
            values.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_DISMISSED, 1);
            int update = dbHelper.update(OneSignalDbContract.NotificationTable.TABLE_NAME, values, whereStr, (String[]) null);
            BadgeCountUpdater.update(dbHelper, notifiJob.context);
        }
    }

    @NonNull
    static JSONObject bundleAsJSONObject(Bundle bundle) {
        JSONObject jSONObject;
        StringBuilder sb;
        Bundle bundle2 = bundle;
        new JSONObject();
        JSONObject json = jSONObject;
        for (String key : bundle2.keySet()) {
            try {
                JSONObject put = json.put(key, bundle2.get(key));
            } catch (JSONException e) {
                JSONException e2 = e;
                OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.ERROR;
                new StringBuilder();
                OneSignal.Log(log_level, sb.append("bundleAsJSONObject error for key: ").append(key).toString(), e2);
            }
        }
        return json;
    }

    private static void unMinifyButtonsFromBundle(Bundle bundle) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject additionalDataJSON;
        JSONArray jSONArray;
        String buttonId;
        Bundle gcmBundle = bundle;
        if (gcmBundle.containsKey(PUSH_MINIFIED_BUTTONS_LIST)) {
            try {
                new JSONObject(gcmBundle.getString("custom"));
                JSONObject customJSON = jSONObject;
                if (customJSON.has(PUSH_ADDITIONAL_DATA_KEY)) {
                    additionalDataJSON = customJSON.getJSONObject(PUSH_ADDITIONAL_DATA_KEY);
                } else {
                    new JSONObject();
                    additionalDataJSON = jSONObject2;
                }
                new JSONArray(gcmBundle.getString(PUSH_MINIFIED_BUTTONS_LIST));
                JSONArray buttons = jSONArray;
                gcmBundle.remove(PUSH_MINIFIED_BUTTONS_LIST);
                for (int i = 0; i < buttons.length(); i++) {
                    JSONObject button = buttons.getJSONObject(i);
                    String buttonText = button.getString("n");
                    Object remove = button.remove("n");
                    if (button.has("i")) {
                        buttonId = button.getString("i");
                        Object remove2 = button.remove("i");
                    } else {
                        buttonId = buttonText;
                    }
                    JSONObject put = button.put(CommonProperties.ID, buttonId);
                    JSONObject put2 = button.put(PropertyTypeConstants.PROPERTY_TYPE_TEXT, buttonText);
                    if (button.has("p")) {
                        JSONObject put3 = button.put("icon", button.getString("p"));
                        Object remove3 = button.remove("p");
                    }
                }
                JSONObject put4 = additionalDataJSON.put("actionButtons", buttons);
                JSONObject put5 = additionalDataJSON.put(GenerateNotification.BUNDLE_KEY_ACTION_ID, DEFAULT_ACTION);
                if (!customJSON.has(PUSH_ADDITIONAL_DATA_KEY)) {
                    JSONObject put6 = customJSON.put(PUSH_ADDITIONAL_DATA_KEY, additionalDataJSON);
                }
                gcmBundle.putString("custom", customJSON.toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    static OSNotificationPayload OSNotificationPayloadFrom(JSONObject jSONObject) {
        OSNotificationPayload oSNotificationPayload;
        JSONObject currentJsonPayload = jSONObject;
        new OSNotificationPayload();
        OSNotificationPayload notification = oSNotificationPayload;
        try {
            JSONObject customJson = getCustomJSONObject(currentJsonPayload);
            notification.notificationID = customJson.optString("i");
            notification.templateId = customJson.optString("ti");
            notification.templateName = customJson.optString("tn");
            notification.rawPayload = currentJsonPayload.toString();
            notification.additionalData = customJson.optJSONObject(PUSH_ADDITIONAL_DATA_KEY);
            notification.launchURL = customJson.optString("u", (String) null);
            notification.body = currentJsonPayload.optString("alert", (String) null);
            notification.title = currentJsonPayload.optString(OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE, (String) null);
            notification.smallIcon = currentJsonPayload.optString("sicon", (String) null);
            notification.bigPicture = currentJsonPayload.optString("bicon", (String) null);
            notification.largeIcon = currentJsonPayload.optString("licon", (String) null);
            notification.sound = currentJsonPayload.optString("sound", (String) null);
            notification.groupKey = currentJsonPayload.optString("grp", (String) null);
            notification.groupMessage = currentJsonPayload.optString("grp_msg", (String) null);
            notification.smallIconAccentColor = currentJsonPayload.optString("bgac", (String) null);
            notification.ledColor = currentJsonPayload.optString("ledc", (String) null);
            String visibility = currentJsonPayload.optString("vis", (String) null);
            if (visibility != null) {
                notification.lockScreenVisibility = Integer.parseInt(visibility);
            }
            notification.fromProjectNumber = currentJsonPayload.optString("from", (String) null);
            notification.priority = currentJsonPayload.optInt("pri", 0);
            String collapseKey = currentJsonPayload.optString("collapse_key", (String) null);
            if (!"do_not_collapse".equals(collapseKey)) {
                notification.collapseId = collapseKey;
            }
            try {
                setActionButtons(notification);
            } catch (Throwable th) {
                OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Error assigning OSNotificationPayload.actionButtons values!", th);
            }
            try {
                setBackgroundImageLayout(notification, currentJsonPayload);
            } catch (Throwable th2) {
                OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Error assigning OSNotificationPayload.backgroundImageLayout values!", th2);
            }
        } catch (JSONException e) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Error assigning OSNotificationPayload values!", e);
        }
        return notification;
    }

    private static void setActionButtons(OSNotificationPayload oSNotificationPayload) throws Throwable {
        List<OSNotificationPayload.ActionButton> list;
        OSNotificationPayload.ActionButton actionButton;
        OSNotificationPayload notification = oSNotificationPayload;
        if (notification.additionalData != null && notification.additionalData.has("actionButtons")) {
            JSONArray jsonActionButtons = notification.additionalData.getJSONArray("actionButtons");
            new ArrayList();
            notification.actionButtons = list;
            for (int i = 0; i < jsonActionButtons.length(); i++) {
                JSONObject jsonActionButton = jsonActionButtons.getJSONObject(i);
                new OSNotificationPayload.ActionButton();
                OSNotificationPayload.ActionButton actionButton2 = actionButton;
                actionButton2.id = jsonActionButton.optString(CommonProperties.ID, (String) null);
                actionButton2.text = jsonActionButton.optString(PropertyTypeConstants.PROPERTY_TYPE_TEXT, (String) null);
                actionButton2.icon = jsonActionButton.optString("icon", (String) null);
                boolean add = notification.actionButtons.add(actionButton2);
            }
            Object remove = notification.additionalData.remove(GenerateNotification.BUNDLE_KEY_ACTION_ID);
            Object remove2 = notification.additionalData.remove("actionButtons");
        }
    }

    private static void setBackgroundImageLayout(OSNotificationPayload oSNotificationPayload, JSONObject currentJsonPayload) throws Throwable {
        JSONObject jSONObject;
        OSNotificationPayload.BackgroundImageLayout backgroundImageLayout;
        OSNotificationPayload notification = oSNotificationPayload;
        String jsonStrBgImage = currentJsonPayload.optString("bg_img", (String) null);
        if (jsonStrBgImage != null) {
            new JSONObject(jsonStrBgImage);
            JSONObject jsonBgImage = jSONObject;
            new OSNotificationPayload.BackgroundImageLayout();
            notification.backgroundImageLayout = backgroundImageLayout;
            notification.backgroundImageLayout.image = jsonBgImage.optString("img");
            notification.backgroundImageLayout.titleTextColor = jsonBgImage.optString("tc");
            notification.backgroundImageLayout.bodyTextColor = jsonBgImage.optString("bc");
        }
    }

    private static void processCollapseKey(NotificationGenerationJob notificationGenerationJob) {
        NotificationGenerationJob notifJob = notificationGenerationJob;
        if (!notifJob.restoring && notifJob.jsonPayload.has("collapse_key") && !"do_not_collapse".equals(notifJob.jsonPayload.optString("collapse_key"))) {
            String collapse_id = notifJob.jsonPayload.optString("collapse_key");
            String[] strArr = new String[1];
            strArr[0] = OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID;
            Cursor cursor = OneSignalDbHelper.getInstance(notifJob.context).query(OneSignalDbContract.NotificationTable.TABLE_NAME, strArr, "collapse_id = ? AND dismissed = 0 AND opened = 0 ", new String[]{collapse_id}, (String) null, (String) null, (String) null);
            if (cursor.moveToFirst()) {
                notifJob.setAndroidIdWithOutOverriding(Integer.valueOf(cursor.getInt(cursor.getColumnIndex(OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID))));
            }
            cursor.close();
        }
    }

    @NonNull
    static ProcessedBundleResult processBundleFromReceiver(Context context, Bundle bundle) {
        ProcessedBundleResult processedBundleResult;
        Thread thread;
        Runnable runnable;
        Context context2 = context;
        Bundle bundle2 = bundle;
        new ProcessedBundleResult();
        ProcessedBundleResult result = processedBundleResult;
        if (!OSNotificationFormatHelper.isOneSignalBundle(bundle2)) {
            return result;
        }
        result.isOneSignalPayload = true;
        unMinifyButtonsFromBundle(bundle2);
        JSONObject pushPayloadJson = bundleAsJSONObject(bundle2);
        String previewUUID = inAppPreviewPushUUID(pushPayloadJson);
        if (previewUUID != null) {
            if (OneSignal.isAppActive()) {
                result.inAppPreviewShown = true;
                OneSignal.getInAppMessageController().displayPreviewMessage(previewUUID);
            }
            return result;
        } else if (startExtenderService(context2, bundle2, result)) {
            return result;
        } else {
            result.isDup = OneSignal.notValidOrDuplicated(context2, pushPayloadJson);
            if (result.isDup) {
                return result;
            }
            if (!shouldDisplay(bundle2.getString("alert"))) {
                saveAndProcessNotification(context2, bundle2, true, -1);
                final Bundle bundle3 = bundle2;
                new Runnable() {
                    public void run() {
                        OneSignal.handleNotificationReceived(NotificationBundleProcessor.bundleAsJsonArray(bundle3), false, false);
                    }
                };
                new Thread(runnable, "OS_PROC_BUNDLE");
                thread.start();
            }
            return result;
        }
    }

    @Nullable
    static String inAppPreviewPushUUID(JSONObject payload) {
        try {
            JSONObject osCustom = getCustomJSONObject(payload);
            if (!osCustom.has(PUSH_ADDITIONAL_DATA_KEY)) {
                return null;
            }
            JSONObject additionalData = osCustom.optJSONObject(PUSH_ADDITIONAL_DATA_KEY);
            if (additionalData.has(IAM_PREVIEW_KEY)) {
                return additionalData.optString(IAM_PREVIEW_KEY);
            }
            return null;
        } catch (JSONException e) {
            JSONException jSONException = e;
            return null;
        }
    }

    private static boolean startExtenderService(Context context, Bundle bundle, ProcessedBundleResult processedBundleResult) {
        Context context2 = context;
        Bundle bundle2 = bundle;
        ProcessedBundleResult result = processedBundleResult;
        Intent intent = NotificationExtenderService.getIntent(context2);
        if (intent == null) {
            return false;
        }
        Intent putExtra = intent.putExtra("json_payload", bundleAsJSONObject(bundle2).toString());
        Intent putExtra2 = intent.putExtra("timestamp", System.currentTimeMillis() / 1000);
        boolean isHighPriority = Integer.parseInt(bundle2.getString("pri", "0")) > 9;
        if (Build.VERSION.SDK_INT >= 21) {
            NotificationExtenderService.enqueueWork(context2, intent.getComponent(), 2071862121, intent, isHighPriority);
        } else {
            ComponentName startService = context2.startService(intent);
        }
        result.hasExtenderService = true;
        return true;
    }

    static boolean shouldDisplay(String str) {
        String body = str;
        return (body != null && !"".equals(body)) && (OneSignal.getNotificationsWhenActiveEnabled() || OneSignal.getInAppAlertNotificationEnabled() || !OneSignal.isAppActive());
    }

    @NonNull
    static JSONArray newJsonArray(JSONObject jsonObject) {
        JSONArray jSONArray;
        new JSONArray();
        return jSONArray.put(jsonObject);
    }

    static JSONObject getCustomJSONObject(JSONObject jsonObject) throws JSONException {
        JSONObject jsonObject2;
        new JSONObject(jsonObject.optString("custom"));
        return jsonObject2;
    }

    static boolean hasRemoteResource(Bundle bundle) {
        Bundle bundle2 = bundle;
        return isBuildKeyRemote(bundle2, "licon") || isBuildKeyRemote(bundle2, "bicon") || bundle2.getString("bg_img", (String) null) != null;
    }

    private static boolean isBuildKeyRemote(Bundle bundle, String key) {
        String value = bundle.getString(key, "").trim();
        return value.startsWith("http://") || value.startsWith("https://");
    }

    static class ProcessedBundleResult {
        boolean hasExtenderService;
        boolean inAppPreviewShown;
        boolean isDup;
        boolean isOneSignalPayload;

        ProcessedBundleResult() {
        }

        /* access modifiers changed from: package-private */
        public boolean processed() {
            return !this.isOneSignalPayload || this.hasExtenderService || this.isDup || this.inAppPreviewShown;
        }
    }
}
