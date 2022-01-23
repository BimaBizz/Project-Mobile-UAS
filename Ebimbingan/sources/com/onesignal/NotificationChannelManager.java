package com.onesignal;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.microsoft.appcenter.ingestion.models.CommonProperties;
import com.onesignal.OneSignal;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class NotificationChannelManager {
    private static final String DEFAULT_CHANNEL_ID = "fcm_fallback_notification_channel";
    private static final String RESTORE_CHANNEL_ID = "restored_OS_notifications";
    private static final Pattern hexPattern = Pattern.compile("^([A-Fa-f0-9]{8})$");

    NotificationChannelManager() {
    }

    static String createNotificationChannel(NotificationGenerationJob notificationGenerationJob) {
        NotificationGenerationJob notifJob = notificationGenerationJob;
        if (Build.VERSION.SDK_INT < 26) {
            return DEFAULT_CHANNEL_ID;
        }
        Context context = notifJob.context;
        JSONObject jsonPayload = notifJob.jsonPayload;
        NotificationManager notificationManager = OneSignalNotificationManager.getNotificationManager(context);
        if (notifJob.restoring) {
            return createRestoreChannel(notificationManager);
        }
        if (jsonPayload.has("oth_chnl")) {
            String otherChannel = jsonPayload.optString("oth_chnl");
            if (notificationManager.getNotificationChannel(otherChannel) != null) {
                return otherChannel;
            }
        }
        if (!jsonPayload.has("chnl")) {
            return createDefaultChannel(notificationManager);
        }
        try {
            return createChannel(context, notificationManager, jsonPayload);
        } catch (JSONException e) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Could not create notification channel due to JSON payload error!", e);
            return DEFAULT_CHANNEL_ID;
        }
    }

    @RequiresApi(api = 26)
    private static String createChannel(Context context, NotificationManager notificationManager, JSONObject jSONObject) throws JSONException {
        JSONObject channelPayload;
        NotificationChannel notificationChannel;
        StringBuilder sb;
        long[] vibrationPattern;
        BigInteger ledColor;
        NotificationChannelGroup notificationChannelGroup;
        JSONObject jSONObject2;
        Context context2 = context;
        NotificationManager notificationManager2 = notificationManager;
        JSONObject payload = jSONObject;
        Object objChannelPayload = payload.opt("chnl");
        if (objChannelPayload instanceof String) {
            new JSONObject((String) objChannelPayload);
            channelPayload = jSONObject2;
        } else {
            channelPayload = (JSONObject) objChannelPayload;
        }
        String channel_id = channelPayload.optString(CommonProperties.ID, DEFAULT_CHANNEL_ID);
        if (channel_id.equals("miscellaneous")) {
            channel_id = DEFAULT_CHANNEL_ID;
        }
        JSONObject payloadWithText = channelPayload;
        if (channelPayload.has("langs")) {
            JSONObject langList = channelPayload.getJSONObject("langs");
            String deviceLanguage = OSUtils.getCorrectedLanguage();
            if (langList.has(deviceLanguage)) {
                payloadWithText = langList.optJSONObject(deviceLanguage);
            }
        }
        new NotificationChannel(channel_id, payloadWithText.optString("nm", "Miscellaneous"), priorityToImportance(payload.optInt("pri", 6)));
        NotificationChannel channel = notificationChannel;
        channel.setDescription(payloadWithText.optString("dscr", (String) null));
        if (channelPayload.has("grp_id")) {
            String group_id = channelPayload.optString("grp_id");
            new NotificationChannelGroup(group_id, payloadWithText.optString("grp_nm"));
            notificationManager2.createNotificationChannelGroup(notificationChannelGroup);
            channel.setGroup(group_id);
        }
        if (payload.has("ledc")) {
            String ledc = payload.optString("ledc");
            if (!hexPattern.matcher(ledc).matches()) {
                OneSignal.Log(OneSignal.LOG_LEVEL.WARN, "OneSignal LED Color Settings: ARGB Hex value incorrect format (E.g: FF9900FF)");
                ledc = "FFFFFFFF";
            }
            try {
                new BigInteger(ledc, 16);
                channel.setLightColor(ledColor.intValue());
            } catch (Throwable th) {
                OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Couldn't convert ARGB Hex value to BigInteger:", th);
            }
        }
        channel.enableLights(payload.optInt("led", 1) == 1);
        if (payload.has("vib_pt") && (vibrationPattern = OSUtils.parseVibrationPattern(payload)) != null) {
            channel.setVibrationPattern(vibrationPattern);
        }
        channel.enableVibration(payload.optInt("vib", 1) == 1);
        if (payload.has("sound")) {
            String sound = payload.optString("sound", (String) null);
            Uri uri = OSUtils.getSoundUri(context2, sound);
            if (uri != null) {
                channel.setSound(uri, (AudioAttributes) null);
            } else if ("null".equals(sound) || "nil".equals(sound)) {
                channel.setSound((Uri) null, (AudioAttributes) null);
            }
        }
        channel.setLockscreenVisibility(payload.optInt("vis", 0));
        channel.setShowBadge(payload.optInt("bdg", 1) == 1);
        channel.setBypassDnd(payload.optInt("bdnd", 0) == 1);
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.VERBOSE;
        new StringBuilder();
        OneSignal.onesignalLog(log_level, sb.append("Creating notification channel with channel:\n").append(channel.toString()).toString());
        try {
            notificationManager2.createNotificationChannel(channel);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        return channel_id;
    }

    @RequiresApi(api = 26)
    private static String createDefaultChannel(NotificationManager notificationManager) {
        NotificationChannel notificationChannel;
        new NotificationChannel(DEFAULT_CHANNEL_ID, "Miscellaneous", 3);
        NotificationChannel channel = notificationChannel;
        channel.enableLights(true);
        channel.enableVibration(true);
        notificationManager.createNotificationChannel(channel);
        return DEFAULT_CHANNEL_ID;
    }

    @RequiresApi(api = 26)
    private static String createRestoreChannel(NotificationManager notificationManager) {
        NotificationChannel channel;
        new NotificationChannel(RESTORE_CHANNEL_ID, "Restored", 2);
        notificationManager.createNotificationChannel(channel);
        return RESTORE_CHANNEL_ID;
    }

    static void processChannelList(@NonNull Context context, @Nullable JSONArray jSONArray) {
        Set<String> set;
        Context context2 = context;
        JSONArray list = jSONArray;
        if (Build.VERSION.SDK_INT >= 26 && list != null) {
            NotificationManager notificationManager = OneSignalNotificationManager.getNotificationManager(context2);
            new HashSet<>();
            Set<String> syncedChannelSet = set;
            int jsonArraySize = list.length();
            for (int i = 0; i < jsonArraySize; i++) {
                try {
                    boolean add = syncedChannelSet.add(createChannel(context2, notificationManager, list.getJSONObject(i)));
                } catch (JSONException e) {
                    OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Could not create notification channel due to JSON payload error!", e);
                }
            }
            for (NotificationChannel existingChannel : notificationManager.getNotificationChannels()) {
                String id = existingChannel.getId();
                if (id.startsWith("OS_") && !syncedChannelSet.contains(id)) {
                    notificationManager.deleteNotificationChannel(id);
                }
            }
        }
    }

    private static int priorityToImportance(int i) {
        int priority = i;
        if (priority > 9) {
            return 5;
        }
        if (priority > 7) {
            return 4;
        }
        if (priority > 5) {
            return 3;
        }
        if (priority > 3) {
            return 2;
        }
        if (priority > 1) {
            return 1;
        }
        return 0;
    }
}
