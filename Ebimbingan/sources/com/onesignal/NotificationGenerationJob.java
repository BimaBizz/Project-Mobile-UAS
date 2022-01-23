package com.onesignal;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.onesignal.NotificationExtenderService;
import com.onesignal.OneSignalDbContract;
import java.security.SecureRandom;
import org.json.JSONObject;

class NotificationGenerationJob {
    Context context;
    boolean isInAppPreviewPush;
    JSONObject jsonPayload;
    Integer orgFlags;
    Uri orgSound;
    CharSequence overriddenBodyFromExtender;
    Integer overriddenFlags;
    Uri overriddenSound;
    CharSequence overriddenTitleFromExtender;
    NotificationExtenderService.OverrideSettings overrideSettings;
    boolean restoring;
    boolean showAsAlert;
    Long shownTimeStamp;

    NotificationGenerationJob(Context context2) {
        this.context = context2;
    }

    /* access modifiers changed from: package-private */
    public CharSequence getTitle() {
        if (this.overriddenTitleFromExtender != null) {
            return this.overriddenTitleFromExtender;
        }
        return this.jsonPayload.optString(OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE, (String) null);
    }

    /* access modifiers changed from: package-private */
    public CharSequence getBody() {
        if (this.overriddenBodyFromExtender != null) {
            return this.overriddenBodyFromExtender;
        }
        return this.jsonPayload.optString("alert", (String) null);
    }

    /* access modifiers changed from: package-private */
    public Integer getAndroidId() {
        SecureRandom secureRandom;
        NotificationExtenderService.OverrideSettings overrideSettings2;
        if (this.overrideSettings == null) {
            new NotificationExtenderService.OverrideSettings();
            this.overrideSettings = overrideSettings2;
        }
        if (this.overrideSettings.androidNotificationId == null) {
            NotificationExtenderService.OverrideSettings overrideSettings3 = this.overrideSettings;
            new SecureRandom();
            overrideSettings3.androidNotificationId = Integer.valueOf(secureRandom.nextInt());
        }
        return this.overrideSettings.androidNotificationId;
    }

    /* access modifiers changed from: package-private */
    public int getAndroidIdWithoutCreate() {
        if (this.overrideSettings == null || this.overrideSettings.androidNotificationId == null) {
            return -1;
        }
        return this.overrideSettings.androidNotificationId.intValue();
    }

    /* access modifiers changed from: package-private */
    public boolean isNotificationToDisplay() {
        return getAndroidIdWithoutCreate() != -1;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public String getApiNotificationId() {
        return OSNotificationFormatHelper.getOSNotificationIdFromJson(this.jsonPayload);
    }

    /* access modifiers changed from: package-private */
    public void setAndroidIdWithOutOverriding(Integer num) {
        NotificationExtenderService.OverrideSettings overrideSettings2;
        Integer id = num;
        if (id != null) {
            if (this.overrideSettings == null || this.overrideSettings.androidNotificationId == null) {
                if (this.overrideSettings == null) {
                    new NotificationExtenderService.OverrideSettings();
                    this.overrideSettings = overrideSettings2;
                }
                this.overrideSettings.androidNotificationId = id;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean hasExtender() {
        return (this.overrideSettings == null || this.overrideSettings.extender == null) ? false : true;
    }
}
