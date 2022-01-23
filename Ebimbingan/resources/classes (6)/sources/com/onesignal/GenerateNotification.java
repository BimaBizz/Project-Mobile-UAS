package com.onesignal;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.widget.RemoteViews;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.microsoft.appcenter.ingestion.models.CommonProperties;
import com.microsoft.appcenter.ingestion.models.properties.StringTypedProperty;
import com.onesignal.AndroidSupportV4Compat;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalDbContract;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.net.URL;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class GenerateNotification {
    public static final String BUNDLE_KEY_ACTION_ID = "actionId";
    public static final String BUNDLE_KEY_ANDROID_NOTIFICATION_ID = "androidNotificationId";
    public static final String BUNDLE_KEY_ONESIGNAL_DATA = "onesignalData";
    private static Resources contextResources = null;
    private static Context currentContext = null;
    private static Class<?> notificationOpenedClass;
    private static boolean openerIsBroadcast;
    private static String packageName = null;

    GenerateNotification() {
    }

    private static class OneSignalNotificationBuilder {
        NotificationCompat.Builder compatBuilder;
        boolean hasLargeIcon;

        private OneSignalNotificationBuilder() {
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ OneSignalNotificationBuilder(AnonymousClass1 r4) {
            this();
            AnonymousClass1 r1 = r4;
        }
    }

    private static void setStatics(Context inContext) {
        Intent intent;
        currentContext = inContext;
        packageName = currentContext.getPackageName();
        contextResources = currentContext.getResources();
        PackageManager packageManager = currentContext.getPackageManager();
        new Intent(currentContext, NotificationOpenedReceiver.class);
        Intent intent2 = intent;
        Intent intent3 = intent2.setPackage(currentContext.getPackageName());
        if (packageManager.queryBroadcastReceivers(intent2, 0).size() > 0) {
            openerIsBroadcast = true;
            notificationOpenedClass = NotificationOpenedReceiver.class;
            return;
        }
        notificationOpenedClass = NotificationOpenedActivity.class;
    }

    static void fromJsonPayload(NotificationGenerationJob notificationGenerationJob) {
        NotificationGenerationJob notifJob = notificationGenerationJob;
        setStatics(notifJob.context);
        Activity currentActivity = OneSignal.getCurrentActivity();
        if (notifJob.restoring || !notifJob.showAsAlert || currentActivity == null) {
            showNotification(notifJob);
        } else {
            showNotificationAsAlert(notifJob.jsonPayload, currentActivity, notifJob.getAndroidId().intValue());
        }
    }

    private static void showNotificationAsAlert(JSONObject gcmJson, Activity activity, int notificationId) {
        Runnable runnable;
        Activity activity2 = activity;
        final Activity activity3 = activity2;
        final JSONObject jSONObject = gcmJson;
        final int i = notificationId;
        new Runnable() {
            public void run() {
                AlertDialog.Builder builder;
                List<String> list;
                List<String> list2;
                DialogInterface.OnClickListener onClickListener;
                DialogInterface.OnCancelListener onCancelListener;
                new AlertDialog.Builder(activity3);
                AlertDialog.Builder builder2 = builder;
                AlertDialog.Builder title = builder2.setTitle(GenerateNotification.getTitle(jSONObject));
                AlertDialog.Builder message = builder2.setMessage(jSONObject.optString("alert"));
                new ArrayList<>();
                List<String> buttonsLabels = list;
                new ArrayList<>();
                List<String> buttonIds = list2;
                GenerateNotification.addAlertButtons(activity3, jSONObject, buttonsLabels, buttonIds);
                List<String> finalButtonIds = buttonIds;
                Intent buttonIntent = GenerateNotification.getNewBaseIntent(i);
                Intent putExtra = buttonIntent.putExtra("action_button", true);
                Intent putExtra2 = buttonIntent.putExtra("from_alert", true);
                Intent putExtra3 = buttonIntent.putExtra(GenerateNotification.BUNDLE_KEY_ONESIGNAL_DATA, jSONObject.toString());
                if (jSONObject.has("grp")) {
                    Intent putExtra4 = buttonIntent.putExtra("grp", jSONObject.optString("grp"));
                }
                Intent finalButtonIntent = buttonIntent;
                final List<String> list3 = finalButtonIds;
                final Intent intent = finalButtonIntent;
                new DialogInterface.OnClickListener(this) {
                    final /* synthetic */ AnonymousClass1 this$0;

                    {
                        this.this$0 = this$0;
                    }

                    public void onClick(DialogInterface dialogInterface, int which) {
                        JSONObject jSONObject;
                        DialogInterface dialogInterface2 = dialogInterface;
                        int index = which + 3;
                        if (list3.size() > 1) {
                            try {
                                new JSONObject(jSONObject.toString());
                                JSONObject newJsonData = jSONObject;
                                JSONObject put = newJsonData.put(GenerateNotification.BUNDLE_KEY_ACTION_ID, list3.get(index));
                                Intent putExtra = intent.putExtra(GenerateNotification.BUNDLE_KEY_ONESIGNAL_DATA, newJsonData.toString());
                                NotificationOpenedProcessor.processIntent(activity3, intent);
                            } catch (Throwable th) {
                                Throwable th2 = th;
                            }
                        } else {
                            NotificationOpenedProcessor.processIntent(activity3, intent);
                        }
                    }
                };
                DialogInterface.OnClickListener buttonListener = onClickListener;
                final Intent intent2 = finalButtonIntent;
                new DialogInterface.OnCancelListener(this) {
                    final /* synthetic */ AnonymousClass1 this$0;

                    {
                        this.this$0 = this$0;
                    }

                    public void onCancel(DialogInterface dialogInterface) {
                        DialogInterface dialogInterface2 = dialogInterface;
                        NotificationOpenedProcessor.processIntent(activity3, intent2);
                    }
                };
                AlertDialog.Builder onCancelListener2 = builder2.setOnCancelListener(onCancelListener);
                for (int i = 0; i < buttonsLabels.size(); i++) {
                    if (i == 0) {
                        AlertDialog.Builder neutralButton = builder2.setNeutralButton(buttonsLabels.get(i), buttonListener);
                    } else if (i == 1) {
                        AlertDialog.Builder negativeButton = builder2.setNegativeButton(buttonsLabels.get(i), buttonListener);
                    } else if (i == 2) {
                        AlertDialog.Builder positiveButton = builder2.setPositiveButton(buttonsLabels.get(i), buttonListener);
                    }
                }
                AlertDialog alertDialog = builder2.create();
                alertDialog.setCanceledOnTouchOutside(false);
                alertDialog.show();
            }
        };
        activity2.runOnUiThread(runnable);
    }

    /* access modifiers changed from: private */
    public static CharSequence getTitle(JSONObject gcmBundle) {
        CharSequence title = gcmBundle.optString(OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE, (String) null);
        if (title != null) {
            return title;
        }
        return currentContext.getPackageManager().getApplicationLabel(currentContext.getApplicationInfo());
    }

    private static PendingIntent getNewActionPendingIntent(int i, Intent intent) {
        int requestCode = i;
        Intent intent2 = intent;
        if (openerIsBroadcast) {
            return PendingIntent.getBroadcast(currentContext, requestCode, intent2, 134217728);
        }
        return PendingIntent.getActivity(currentContext, requestCode, intent2, 134217728);
    }

    /* access modifiers changed from: private */
    public static Intent getNewBaseIntent(int notificationId) {
        Intent intent;
        new Intent(currentContext, notificationOpenedClass);
        Intent intent2 = intent.putExtra(BUNDLE_KEY_ANDROID_NOTIFICATION_ID, notificationId);
        if (openerIsBroadcast) {
            return intent2;
        }
        return intent2.addFlags(603979776);
    }

    private static Intent getNewBaseDeleteIntent(int notificationId) {
        Intent intent;
        new Intent(currentContext, notificationOpenedClass);
        Intent intent2 = intent.putExtra(BUNDLE_KEY_ANDROID_NOTIFICATION_ID, notificationId).putExtra(OneSignalDbContract.NotificationTable.COLUMN_NAME_DISMISSED, true);
        if (openerIsBroadcast) {
            return intent2;
        }
        return intent2.addFlags(402718720);
    }

    private static OneSignalNotificationBuilder getBaseOneSignalNotificationBuilder(NotificationGenerationJob notificationGenerationJob) {
        OneSignalNotificationBuilder oneSignalNotificationBuilder;
        NotificationCompat.Builder builder;
        NotificationCompat.Builder notifBuilder;
        NotificationCompat.BigTextStyle bigTextStyle;
        NotificationCompat.BigPictureStyle bigPictureStyle;
        NotificationCompat.Builder builder2;
        NotificationGenerationJob notifJob = notificationGenerationJob;
        JSONObject gcmBundle = notifJob.jsonPayload;
        new OneSignalNotificationBuilder((AnonymousClass1) null);
        OneSignalNotificationBuilder oneSignalNotificationBuilder2 = oneSignalNotificationBuilder;
        try {
            NotificationCompat.Builder builder3 = builder2;
            new NotificationCompat.Builder(currentContext, NotificationChannelManager.createNotificationChannel(notifJob));
            notifBuilder = builder3;
        } catch (Throwable th) {
            Throwable th2 = th;
            new NotificationCompat.Builder(currentContext);
            notifBuilder = builder;
        }
        String message = gcmBundle.optString("alert", (String) null);
        NotificationCompat.Builder smallIcon = notifBuilder.setAutoCancel(true).setSmallIcon(getSmallIconId(gcmBundle));
        new NotificationCompat.BigTextStyle();
        NotificationCompat.Builder ticker = smallIcon.setStyle(bigTextStyle.bigText(message)).setContentText(message).setTicker(message);
        if (Build.VERSION.SDK_INT < 24 || !gcmBundle.optString(OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE).equals("")) {
            NotificationCompat.Builder contentTitle = notifBuilder.setContentTitle(getTitle(gcmBundle));
        }
        try {
            BigInteger accentColor = getAccentColor(gcmBundle);
            if (accentColor != null) {
                NotificationCompat.Builder color = notifBuilder.setColor(accentColor.intValue());
            }
        } catch (Throwable th3) {
            Throwable th4 = th3;
        }
        int lockScreenVisibility = 1;
        try {
            if (gcmBundle.has("vis")) {
                lockScreenVisibility = Integer.parseInt(gcmBundle.optString("vis"));
            }
            NotificationCompat.Builder visibility = notifBuilder.setVisibility(lockScreenVisibility);
        } catch (Throwable th5) {
            Throwable th6 = th5;
        }
        Bitmap largeIcon = getLargeIcon(gcmBundle);
        if (largeIcon != null) {
            oneSignalNotificationBuilder2.hasLargeIcon = true;
            NotificationCompat.Builder largeIcon2 = notifBuilder.setLargeIcon(largeIcon);
        }
        Bitmap bigPictureIcon = getBitmap(gcmBundle.optString("bicon", (String) null));
        if (bigPictureIcon != null) {
            new NotificationCompat.BigPictureStyle();
            NotificationCompat.Builder style = notifBuilder.setStyle(bigPictureStyle.bigPicture(bigPictureIcon).setSummaryText(message));
        }
        if (notifJob.shownTimeStamp != null) {
            try {
                NotificationCompat.Builder when = notifBuilder.setWhen(notifJob.shownTimeStamp.longValue() * 1000);
            } catch (Throwable th7) {
                Throwable th8 = th7;
            }
        }
        setAlertnessOptions(gcmBundle, notifBuilder);
        oneSignalNotificationBuilder2.compatBuilder = notifBuilder;
        return oneSignalNotificationBuilder2;
    }

    private static void setAlertnessOptions(JSONObject jSONObject, NotificationCompat.Builder builder) {
        BigInteger ledColor;
        JSONObject gcmBundle = jSONObject;
        NotificationCompat.Builder notifBuilder = builder;
        int androidPriority = convertOSToAndroidPriority(gcmBundle.optInt("pri", 6));
        NotificationCompat.Builder priority = notifBuilder.setPriority(androidPriority);
        if (!(androidPriority < 0)) {
            int notificationDefaults = 0;
            if (!gcmBundle.has("ledc") || gcmBundle.optInt("led", 1) != 1) {
                notificationDefaults = 0 | 4;
            } else {
                try {
                    new BigInteger(gcmBundle.optString("ledc"), 16);
                    NotificationCompat.Builder lights = notifBuilder.setLights(ledColor.intValue(), 2000, 5000);
                } catch (Throwable th) {
                    Throwable th2 = th;
                    notificationDefaults = 0 | 4;
                }
            }
            if (OneSignal.getVibrate() && gcmBundle.optInt("vib", 1) == 1) {
                if (gcmBundle.has("vib_pt")) {
                    long[] vibrationPattern = OSUtils.parseVibrationPattern(gcmBundle);
                    if (vibrationPattern != null) {
                        NotificationCompat.Builder vibrate = notifBuilder.setVibrate(vibrationPattern);
                    }
                } else {
                    notificationDefaults |= 2;
                }
            }
            if (isSoundEnabled(gcmBundle)) {
                Uri soundUri = OSUtils.getSoundUri(currentContext, gcmBundle.optString("sound", (String) null));
                if (soundUri != null) {
                    NotificationCompat.Builder sound = notifBuilder.setSound(soundUri);
                } else {
                    notificationDefaults |= 1;
                }
            }
            NotificationCompat.Builder defaults = notifBuilder.setDefaults(notificationDefaults);
        }
    }

    private static void removeNotifyOptions(NotificationCompat.Builder builder) {
        NotificationCompat.Builder ticker = builder.setOnlyAlertOnce(true).setDefaults(0).setSound((Uri) null).setVibrate((long[]) null).setTicker((CharSequence) null);
    }

    private static void showNotification(NotificationGenerationJob notificationGenerationJob) {
        ArrayList arrayList;
        Notification notification;
        NotificationGenerationJob notifJob = notificationGenerationJob;
        int notificationId = notifJob.getAndroidId().intValue();
        JSONObject gcmBundle = notifJob.jsonPayload;
        String group = gcmBundle.optString("grp", (String) null);
        new ArrayList<>();
        ArrayList<StatusBarNotification> grouplessNotifs = arrayList;
        if (Build.VERSION.SDK_INT >= 24) {
            grouplessNotifs = OneSignalNotificationManager.getActiveGrouplessNotifications(currentContext);
            if (group == null && grouplessNotifs.size() >= 3) {
                group = OneSignalNotificationManager.getGrouplessSummaryKey();
                OneSignalNotificationManager.assignGrouplessNotifications(currentContext, grouplessNotifs);
            }
        }
        OneSignalNotificationBuilder oneSignalNotificationBuilder = getBaseOneSignalNotificationBuilder(notifJob);
        NotificationCompat.Builder notifBuilder = oneSignalNotificationBuilder.compatBuilder;
        addNotificationActionButtons(gcmBundle, notifBuilder, notificationId, (String) null);
        try {
            addBackgroundImage(gcmBundle, notifBuilder);
        } catch (Throwable th) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Could not set background notification image!", th);
        }
        applyNotificationExtender(notifJob, notifBuilder);
        if (notifJob.restoring) {
            removeNotifyOptions(notifBuilder);
        }
        int makeRoomFor = 1;
        if (group != null) {
            makeRoomFor = 2;
        }
        NotificationLimitManager.clearOldestOverLimit(currentContext, makeRoomFor);
        if (group != null) {
            createGenericPendingIntentsForGroup(notifBuilder, gcmBundle, group, notificationId);
            notification = createSingleNotificationBeforeSummaryBuilder(notifJob, notifBuilder);
            if (Build.VERSION.SDK_INT < 24 || !group.equals(OneSignalNotificationManager.getGrouplessSummaryKey())) {
                createSummaryNotification(notifJob, oneSignalNotificationBuilder);
            } else {
                createGrouplessSummaryNotification(notifJob, grouplessNotifs.size() + 1);
            }
        } else {
            notification = createGenericPendingIntentsForNotif(notifBuilder, gcmBundle, notificationId);
        }
        if (group == null || Build.VERSION.SDK_INT > 17) {
            addXiaomiSettings(oneSignalNotificationBuilder, notification);
            NotificationManagerCompat.from(currentContext).notify(notificationId, notification);
        }
    }

    private static Notification createGenericPendingIntentsForNotif(NotificationCompat.Builder builder, JSONObject gcmBundle, int i) {
        Random random;
        NotificationCompat.Builder notifBuilder = builder;
        int notificationId = i;
        new SecureRandom();
        Random random2 = random;
        NotificationCompat.Builder contentIntent = notifBuilder.setContentIntent(getNewActionPendingIntent(random2.nextInt(), getNewBaseIntent(notificationId).putExtra(BUNDLE_KEY_ONESIGNAL_DATA, gcmBundle.toString())));
        NotificationCompat.Builder deleteIntent = notifBuilder.setDeleteIntent(getNewActionPendingIntent(random2.nextInt(), getNewBaseDeleteIntent(notificationId)));
        return notifBuilder.build();
    }

    private static void createGenericPendingIntentsForGroup(NotificationCompat.Builder builder, JSONObject gcmBundle, String str, int i) {
        Random random;
        NotificationCompat.Builder notifBuilder = builder;
        String group = str;
        int notificationId = i;
        new SecureRandom();
        Random random2 = random;
        NotificationCompat.Builder contentIntent = notifBuilder.setContentIntent(getNewActionPendingIntent(random2.nextInt(), getNewBaseIntent(notificationId).putExtra(BUNDLE_KEY_ONESIGNAL_DATA, gcmBundle.toString()).putExtra("grp", group)));
        NotificationCompat.Builder deleteIntent = notifBuilder.setDeleteIntent(getNewActionPendingIntent(random2.nextInt(), getNewBaseDeleteIntent(notificationId).putExtra("grp", group)));
        NotificationCompat.Builder group2 = notifBuilder.setGroup(group);
        try {
            NotificationCompat.Builder groupAlertBehavior = notifBuilder.setGroupAlertBehavior(1);
        } catch (Throwable th) {
            Throwable th2 = th;
        }
    }

    private static void applyNotificationExtender(NotificationGenerationJob notificationGenerationJob, NotificationCompat.Builder builder) {
        NotificationGenerationJob notifJob = notificationGenerationJob;
        NotificationCompat.Builder notifBuilder = builder;
        if (notifJob.overrideSettings != null && notifJob.overrideSettings.extender != null) {
            try {
                Field mNotificationField = NotificationCompat.Builder.class.getDeclaredField("mNotification");
                mNotificationField.setAccessible(true);
                Notification mNotification = (Notification) mNotificationField.get(notifBuilder);
                notifJob.orgFlags = Integer.valueOf(mNotification.flags);
                notifJob.orgSound = mNotification.sound;
                NotificationCompat.Builder extend = notifBuilder.extend(notifJob.overrideSettings.extender);
                Notification mNotification2 = (Notification) mNotificationField.get(notifBuilder);
                Field mContentTextField = NotificationCompat.Builder.class.getDeclaredField("mContentText");
                mContentTextField.setAccessible(true);
                CharSequence mContentText = (CharSequence) mContentTextField.get(notifBuilder);
                Field mContentTitleField = NotificationCompat.Builder.class.getDeclaredField("mContentTitle");
                mContentTitleField.setAccessible(true);
                CharSequence mContentTitle = (CharSequence) mContentTitleField.get(notifBuilder);
                notifJob.overriddenBodyFromExtender = mContentText;
                notifJob.overriddenTitleFromExtender = mContentTitle;
                if (!notifJob.restoring) {
                    notifJob.overriddenFlags = Integer.valueOf(mNotification2.flags);
                    notifJob.overriddenSound = mNotification2.sound;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private static Notification createSingleNotificationBeforeSummaryBuilder(NotificationGenerationJob notificationGenerationJob, NotificationCompat.Builder builder) {
        NotificationGenerationJob notifJob = notificationGenerationJob;
        NotificationCompat.Builder notifBuilder = builder;
        boolean singleNotifWorkArounds = Build.VERSION.SDK_INT > 17 && Build.VERSION.SDK_INT < 24 && !notifJob.restoring;
        if (singleNotifWorkArounds && notifJob.overriddenSound != null && !notifJob.overriddenSound.equals(notifJob.orgSound)) {
            NotificationCompat.Builder sound = notifBuilder.setSound((Uri) null);
        }
        Notification notification = notifBuilder.build();
        if (singleNotifWorkArounds) {
            NotificationCompat.Builder sound2 = notifBuilder.setSound(notifJob.overriddenSound);
        }
        return notification;
    }

    private static void addXiaomiSettings(OneSignalNotificationBuilder oneSignalNotificationBuilder, Notification notification) {
        Notification notification2 = notification;
        if (oneSignalNotificationBuilder.hasLargeIcon) {
            try {
                Object miuiNotification = Class.forName("android.app.MiuiNotification").newInstance();
                Field customizedIconField = miuiNotification.getClass().getDeclaredField("customizedIcon");
                customizedIconField.setAccessible(true);
                customizedIconField.set(miuiNotification, true);
                Field extraNotificationField = notification2.getClass().getField("extraNotification");
                extraNotificationField.setAccessible(true);
                extraNotificationField.set(notification2, miuiNotification);
            } catch (Throwable th) {
                Throwable th2 = th;
            }
        }
    }

    static void updateSummaryNotification(NotificationGenerationJob notificationGenerationJob) {
        NotificationGenerationJob notifJob = notificationGenerationJob;
        setStatics(notifJob.context);
        createSummaryNotification(notifJob, (OneSignalNotificationBuilder) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v186, resolved type: android.text.SpannableString} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void createSummaryNotification(com.onesignal.NotificationGenerationJob r32, com.onesignal.GenerateNotification.OneSignalNotificationBuilder r33) {
        /*
            r2 = r32
            r3 = r33
            r23 = r2
            r0 = r23
            boolean r0 = r0.restoring
            r23 = r0
            r4 = r23
            r23 = r2
            r0 = r23
            org.json.JSONObject r0 = r0.jsonPayload
            r23 = r0
            r5 = r23
            r23 = r5
            java.lang.String r24 = "grp"
            r25 = 0
            java.lang.String r23 = r23.optString(r24, r25)
            r6 = r23
            java.security.SecureRandom r23 = new java.security.SecureRandom
            r31 = r23
            r23 = r31
            r24 = r31
            r24.<init>()
            r7 = r23
            r23 = r7
            int r23 = r23.nextInt()
            r24 = 0
            android.content.Intent r24 = getNewBaseDeleteIntent(r24)
            java.lang.String r25 = "summary"
            r26 = r6
            android.content.Intent r24 = r24.putExtra(r25, r26)
            android.app.PendingIntent r23 = getNewActionPendingIntent(r23, r24)
            r8 = r23
            r23 = 0
            r10 = r23
            r23 = 0
            r11 = r23
            r23 = 0
            r12 = r23
            android.content.Context r23 = currentContext
            com.onesignal.OneSignalDbHelper r23 = com.onesignal.OneSignalDbHelper.getInstance(r23)
            r13 = r23
            r23 = 0
            r14 = r23
            r23 = 5
            r0 = r23
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x0420 }
            r23 = r0
            r31 = r23
            r23 = r31
            r24 = r31
            r25 = 0
            java.lang.String r26 = "android_notification_id"
            r24[r25] = r26     // Catch:{ all -> 0x0420 }
            r31 = r23
            r23 = r31
            r24 = r31
            r25 = 1
            java.lang.String r26 = "full_data"
            r24[r25] = r26     // Catch:{ all -> 0x0420 }
            r31 = r23
            r23 = r31
            r24 = r31
            r25 = 2
            java.lang.String r26 = "is_summary"
            r24[r25] = r26     // Catch:{ all -> 0x0420 }
            r31 = r23
            r23 = r31
            r24 = r31
            r25 = 3
            java.lang.String r26 = "title"
            r24[r25] = r26     // Catch:{ all -> 0x0420 }
            r31 = r23
            r23 = r31
            r24 = r31
            r25 = 4
            java.lang.String r26 = "message"
            r24[r25] = r26     // Catch:{ all -> 0x0420 }
            r15 = r23
            java.lang.String r23 = "group_id = ? AND dismissed = 0 AND opened = 0"
            r16 = r23
            r23 = 1
            r0 = r23
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x0420 }
            r23 = r0
            r31 = r23
            r23 = r31
            r24 = r31
            r25 = 0
            r26 = r6
            r24[r25] = r26     // Catch:{ all -> 0x0420 }
            r17 = r23
            r23 = r4
            if (r23 != 0) goto L_0x0109
            r23 = r2
            java.lang.Integer r23 = r23.getAndroidId()     // Catch:{ all -> 0x0420 }
            int r23 = r23.intValue()     // Catch:{ all -> 0x0420 }
            r24 = -1
            r0 = r23
            r1 = r24
            if (r0 == r1) goto L_0x0109
            java.lang.StringBuilder r23 = new java.lang.StringBuilder     // Catch:{ all -> 0x0420 }
            r31 = r23
            r23 = r31
            r24 = r31
            r24.<init>()     // Catch:{ all -> 0x0420 }
            r24 = r16
            java.lang.StringBuilder r23 = r23.append(r24)     // Catch:{ all -> 0x0420 }
            java.lang.String r24 = " AND android_notification_id <> "
            java.lang.StringBuilder r23 = r23.append(r24)     // Catch:{ all -> 0x0420 }
            r24 = r2
            java.lang.Integer r24 = r24.getAndroidId()     // Catch:{ all -> 0x0420 }
            java.lang.StringBuilder r23 = r23.append(r24)     // Catch:{ all -> 0x0420 }
            java.lang.String r23 = r23.toString()     // Catch:{ all -> 0x0420 }
            r16 = r23
        L_0x0109:
            r23 = r13
            java.lang.String r24 = "notification"
            r25 = r15
            r26 = r16
            r27 = r17
            r28 = 0
            r29 = 0
            java.lang.String r30 = "_id DESC"
            android.database.Cursor r23 = r23.query(r24, r25, r26, r27, r28, r29, r30)     // Catch:{ all -> 0x0420 }
            r14 = r23
            r23 = r14
            boolean r23 = r23.moveToFirst()     // Catch:{ all -> 0x0420 }
            if (r23 == 0) goto L_0x0181
            java.util.ArrayList r23 = new java.util.ArrayList     // Catch:{ all -> 0x0420 }
            r31 = r23
            r23 = r31
            r24 = r31
            r24.<init>()     // Catch:{ all -> 0x0420 }
            r12 = r23
        L_0x0136:
            r23 = r14
            r24 = r14
            java.lang.String r25 = "is_summary"
            int r24 = r24.getColumnIndex(r25)     // Catch:{ all -> 0x0420 }
            int r23 = r23.getInt(r24)     // Catch:{ all -> 0x0420 }
            r24 = 1
            r0 = r23
            r1 = r24
            if (r0 != r1) goto L_0x0360
            r23 = r14
            r24 = r14
            java.lang.String r25 = "android_notification_id"
            int r24 = r24.getColumnIndex(r25)     // Catch:{ all -> 0x0420 }
            int r23 = r23.getInt(r24)     // Catch:{ all -> 0x0420 }
            java.lang.Integer r23 = java.lang.Integer.valueOf(r23)     // Catch:{ all -> 0x0420 }
            r10 = r23
        L_0x0162:
            r23 = r14
            boolean r23 = r23.moveToNext()     // Catch:{ all -> 0x0420 }
            if (r23 != 0) goto L_0x0136
            r23 = r4
            if (r23 == 0) goto L_0x0181
            r23 = r11
            if (r23 == 0) goto L_0x0181
            org.json.JSONObject r23 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0416 }
            r31 = r23
            r23 = r31
            r24 = r31
            r25 = r11
            r24.<init>(r25)     // Catch:{ JSONException -> 0x0416 }
            r5 = r23
        L_0x0181:
            r23 = r14
            if (r23 == 0) goto L_0x0192
            r23 = r14
            boolean r23 = r23.isClosed()
            if (r23 != 0) goto L_0x0192
            r23 = r14
            r23.close()
        L_0x0192:
            r23 = r10
            if (r23 != 0) goto L_0x01af
            r23 = r7
            int r23 = r23.nextInt()
            java.lang.Integer r23 = java.lang.Integer.valueOf(r23)
            r10 = r23
            r23 = r13
            r24 = r6
            r25 = r10
            int r25 = r25.intValue()
            createSummaryIdDatabaseEntry(r23, r24, r25)
        L_0x01af:
            r23 = r7
            int r23 = r23.nextInt()
            r24 = r10
            int r24 = r24.intValue()
            r25 = r5
            r26 = r6
            android.content.Intent r24 = createBaseSummaryIntent(r24, r25, r26)
            android.app.PendingIntent r23 = getNewActionPendingIntent(r23, r24)
            r15 = r23
            r23 = r12
            if (r23 == 0) goto L_0x04e9
            r23 = r4
            if (r23 == 0) goto L_0x01df
            r23 = r12
            int r23 = r23.size()
            r24 = 1
            r0 = r23
            r1 = r24
            if (r0 > r1) goto L_0x01eb
        L_0x01df:
            r23 = r4
            if (r23 != 0) goto L_0x04e9
            r23 = r12
            int r23 = r23.size()
            if (r23 <= 0) goto L_0x04e9
        L_0x01eb:
            r23 = r12
            int r23 = r23.size()
            r24 = r4
            if (r24 == 0) goto L_0x0437
            r24 = 0
        L_0x01f7:
            int r23 = r23 + r24
            r16 = r23
            r23 = r5
            java.lang.String r24 = "grp_msg"
            r25 = 0
            java.lang.String r23 = r23.optString(r24, r25)
            r17 = r23
            r23 = r17
            if (r23 != 0) goto L_0x043b
            java.lang.StringBuilder r23 = new java.lang.StringBuilder
            r31 = r23
            r23 = r31
            r24 = r31
            r24.<init>()
            r24 = r16
            java.lang.StringBuilder r23 = r23.append(r24)
            java.lang.String r24 = " new messages"
            java.lang.StringBuilder r23 = r23.append(r24)
            java.lang.String r23 = r23.toString()
            r17 = r23
        L_0x022a:
            r23 = r2
            com.onesignal.GenerateNotification$OneSignalNotificationBuilder r23 = getBaseOneSignalNotificationBuilder(r23)
            r0 = r23
            androidx.core.app.NotificationCompat$Builder r0 = r0.compatBuilder
            r23 = r0
            r18 = r23
            r23 = r4
            if (r23 == 0) goto L_0x0464
            r23 = r18
            removeNotifyOptions(r23)
        L_0x0241:
            r23 = r18
            r24 = r15
            androidx.core.app.NotificationCompat$Builder r23 = r23.setContentIntent(r24)
            r24 = r8
            androidx.core.app.NotificationCompat$Builder r23 = r23.setDeleteIntent(r24)
            android.content.Context r24 = currentContext
            android.content.pm.PackageManager r24 = r24.getPackageManager()
            android.content.Context r25 = currentContext
            android.content.pm.ApplicationInfo r25 = r25.getApplicationInfo()
            java.lang.CharSequence r24 = r24.getApplicationLabel(r25)
            androidx.core.app.NotificationCompat$Builder r23 = r23.setContentTitle(r24)
            r24 = r17
            androidx.core.app.NotificationCompat$Builder r23 = r23.setContentText(r24)
            r24 = r16
            androidx.core.app.NotificationCompat$Builder r23 = r23.setNumber(r24)
            int r24 = getDefaultSmallIconId()
            androidx.core.app.NotificationCompat$Builder r23 = r23.setSmallIcon(r24)
            android.graphics.Bitmap r24 = getDefaultLargeIcon()
            androidx.core.app.NotificationCompat$Builder r23 = r23.setLargeIcon(r24)
            r24 = r4
            androidx.core.app.NotificationCompat$Builder r23 = r23.setOnlyAlertOnce(r24)
            r24 = 0
            androidx.core.app.NotificationCompat$Builder r23 = r23.setAutoCancel(r24)
            r24 = r6
            androidx.core.app.NotificationCompat$Builder r23 = r23.setGroup(r24)
            r24 = 1
            androidx.core.app.NotificationCompat$Builder r23 = r23.setGroupSummary(r24)
            r23 = r18
            r24 = 1
            androidx.core.app.NotificationCompat$Builder r23 = r23.setGroupAlertBehavior(r24)     // Catch:{ Throwable -> 0x049a }
        L_0x029f:
            r23 = r4
            if (r23 != 0) goto L_0x02ab
            r23 = r18
            r24 = r17
            androidx.core.app.NotificationCompat$Builder r23 = r23.setTicker(r24)
        L_0x02ab:
            androidx.core.app.NotificationCompat$InboxStyle r23 = new androidx.core.app.NotificationCompat$InboxStyle
            r31 = r23
            r23 = r31
            r24 = r31
            r24.<init>()
            r19 = r23
            r23 = r4
            if (r23 != 0) goto L_0x033d
            r23 = 0
            r20 = r23
            r23 = r2
            java.lang.CharSequence r23 = r23.getTitle()
            if (r23 == 0) goto L_0x02d4
            r23 = r2
            java.lang.CharSequence r23 = r23.getTitle()
            java.lang.String r23 = r23.toString()
            r20 = r23
        L_0x02d4:
            r23 = r20
            if (r23 != 0) goto L_0x049f
            java.lang.String r23 = ""
            r20 = r23
        L_0x02dd:
            r23 = r2
            java.lang.CharSequence r23 = r23.getBody()
            java.lang.String r23 = r23.toString()
            r21 = r23
            android.text.SpannableString r23 = new android.text.SpannableString
            r31 = r23
            r23 = r31
            r24 = r31
            java.lang.StringBuilder r25 = new java.lang.StringBuilder
            r31 = r25
            r25 = r31
            r26 = r31
            r26.<init>()
            r26 = r20
            java.lang.StringBuilder r25 = r25.append(r26)
            r26 = r21
            java.lang.StringBuilder r25 = r25.append(r26)
            java.lang.String r25 = r25.toString()
            r24.<init>(r25)
            r22 = r23
            r23 = r20
            int r23 = r23.length()
            if (r23 <= 0) goto L_0x0335
            r23 = r22
            android.text.style.StyleSpan r24 = new android.text.style.StyleSpan
            r31 = r24
            r24 = r31
            r25 = r31
            r26 = 1
            r25.<init>(r26)
            r25 = 0
            r26 = r20
            int r26 = r26.length()
            r27 = 0
            r23.setSpan(r24, r25, r26, r27)
        L_0x0335:
            r23 = r19
            r24 = r22
            androidx.core.app.NotificationCompat$InboxStyle r23 = r23.addLine(r24)
        L_0x033d:
            r23 = r12
            java.util.Iterator r23 = r23.iterator()
            r20 = r23
        L_0x0345:
            r23 = r20
            boolean r23 = r23.hasNext()
            if (r23 == 0) goto L_0x04bf
            r23 = r20
            java.lang.Object r23 = r23.next()
            android.text.SpannableString r23 = (android.text.SpannableString) r23
            r21 = r23
            r23 = r19
            r24 = r21
            androidx.core.app.NotificationCompat$InboxStyle r23 = r23.addLine(r24)
            goto L_0x0345
        L_0x0360:
            r23 = r14
            r24 = r14
            java.lang.String r25 = "title"
            int r24 = r24.getColumnIndex(r25)     // Catch:{ all -> 0x0420 }
            java.lang.String r23 = r23.getString(r24)     // Catch:{ all -> 0x0420 }
            r19 = r23
            r23 = r19
            if (r23 != 0) goto L_0x03f6
            java.lang.String r23 = ""
            r19 = r23
        L_0x037a:
            r23 = r14
            r24 = r14
            java.lang.String r25 = "message"
            int r24 = r24.getColumnIndex(r25)     // Catch:{ all -> 0x0420 }
            java.lang.String r23 = r23.getString(r24)     // Catch:{ all -> 0x0420 }
            r20 = r23
            android.text.SpannableString r23 = new android.text.SpannableString     // Catch:{ all -> 0x0420 }
            r31 = r23
            r23 = r31
            r24 = r31
            java.lang.StringBuilder r25 = new java.lang.StringBuilder     // Catch:{ all -> 0x0420 }
            r31 = r25
            r25 = r31
            r26 = r31
            r26.<init>()     // Catch:{ all -> 0x0420 }
            r26 = r19
            java.lang.StringBuilder r25 = r25.append(r26)     // Catch:{ all -> 0x0420 }
            r26 = r20
            java.lang.StringBuilder r25 = r25.append(r26)     // Catch:{ all -> 0x0420 }
            java.lang.String r25 = r25.toString()     // Catch:{ all -> 0x0420 }
            r24.<init>(r25)     // Catch:{ all -> 0x0420 }
            r18 = r23
            r23 = r19
            int r23 = r23.length()     // Catch:{ all -> 0x0420 }
            if (r23 <= 0) goto L_0x03d7
            r23 = r18
            android.text.style.StyleSpan r24 = new android.text.style.StyleSpan     // Catch:{ all -> 0x0420 }
            r31 = r24
            r24 = r31
            r25 = r31
            r26 = 1
            r25.<init>(r26)     // Catch:{ all -> 0x0420 }
            r25 = 0
            r26 = r19
            int r26 = r26.length()     // Catch:{ all -> 0x0420 }
            r27 = 0
            r23.setSpan(r24, r25, r26, r27)     // Catch:{ all -> 0x0420 }
        L_0x03d7:
            r23 = r12
            r24 = r18
            boolean r23 = r23.add(r24)     // Catch:{ all -> 0x0420 }
            r23 = r11
            if (r23 != 0) goto L_0x0162
            r23 = r14
            r24 = r14
            java.lang.String r25 = "full_data"
            int r24 = r24.getColumnIndex(r25)     // Catch:{ all -> 0x0420 }
            java.lang.String r23 = r23.getString(r24)     // Catch:{ all -> 0x0420 }
            r11 = r23
            goto L_0x0162
        L_0x03f6:
            java.lang.StringBuilder r23 = new java.lang.StringBuilder     // Catch:{ all -> 0x0420 }
            r31 = r23
            r23 = r31
            r24 = r31
            r24.<init>()     // Catch:{ all -> 0x0420 }
            r24 = r19
            java.lang.StringBuilder r23 = r23.append(r24)     // Catch:{ all -> 0x0420 }
            java.lang.String r24 = " "
            java.lang.StringBuilder r23 = r23.append(r24)     // Catch:{ all -> 0x0420 }
            java.lang.String r23 = r23.toString()     // Catch:{ all -> 0x0420 }
            r19 = r23
            goto L_0x037a
        L_0x0416:
            r23 = move-exception
            r19 = r23
            r23 = r19
            r23.printStackTrace()     // Catch:{ all -> 0x0420 }
            goto L_0x0181
        L_0x0420:
            r23 = move-exception
            r21 = r23
            r23 = r14
            if (r23 == 0) goto L_0x0434
            r23 = r14
            boolean r23 = r23.isClosed()
            if (r23 != 0) goto L_0x0434
            r23 = r14
            r23.close()
        L_0x0434:
            r23 = r21
            throw r23
        L_0x0437:
            r24 = 1
            goto L_0x01f7
        L_0x043b:
            r23 = r17
            java.lang.String r24 = "$[notif_count]"
            java.lang.StringBuilder r25 = new java.lang.StringBuilder
            r31 = r25
            r25 = r31
            r26 = r31
            r26.<init>()
            java.lang.String r26 = ""
            java.lang.StringBuilder r25 = r25.append(r26)
            r26 = r16
            java.lang.StringBuilder r25 = r25.append(r26)
            java.lang.String r25 = r25.toString()
            java.lang.String r23 = r23.replace(r24, r25)
            r17 = r23
            goto L_0x022a
        L_0x0464:
            r23 = r2
            r0 = r23
            android.net.Uri r0 = r0.overriddenSound
            r23 = r0
            if (r23 == 0) goto L_0x047c
            r23 = r18
            r24 = r2
            r0 = r24
            android.net.Uri r0 = r0.overriddenSound
            r24 = r0
            androidx.core.app.NotificationCompat$Builder r23 = r23.setSound(r24)
        L_0x047c:
            r23 = r2
            r0 = r23
            java.lang.Integer r0 = r0.overriddenFlags
            r23 = r0
            if (r23 == 0) goto L_0x0241
            r23 = r18
            r24 = r2
            r0 = r24
            java.lang.Integer r0 = r0.overriddenFlags
            r24 = r0
            int r24 = r24.intValue()
            androidx.core.app.NotificationCompat$Builder r23 = r23.setDefaults(r24)
            goto L_0x0241
        L_0x049a:
            r23 = move-exception
            r19 = r23
            goto L_0x029f
        L_0x049f:
            java.lang.StringBuilder r23 = new java.lang.StringBuilder
            r31 = r23
            r23 = r31
            r24 = r31
            r24.<init>()
            r24 = r20
            java.lang.StringBuilder r23 = r23.append(r24)
            java.lang.String r24 = " "
            java.lang.StringBuilder r23 = r23.append(r24)
            java.lang.String r23 = r23.toString()
            r20 = r23
            goto L_0x02dd
        L_0x04bf:
            r23 = r19
            r24 = r17
            androidx.core.app.NotificationCompat$InboxStyle r23 = r23.setBigContentTitle(r24)
            r23 = r18
            r24 = r19
            androidx.core.app.NotificationCompat$Builder r23 = r23.setStyle(r24)
            r23 = r18
            android.app.Notification r23 = r23.build()
            r9 = r23
        L_0x04d7:
            android.content.Context r23 = currentContext
            androidx.core.app.NotificationManagerCompat r23 = androidx.core.app.NotificationManagerCompat.from(r23)
            r24 = r10
            int r24 = r24.intValue()
            r25 = r9
            r23.notify(r24, r25)
            return
        L_0x04e9:
            r23 = r3
            r0 = r23
            androidx.core.app.NotificationCompat$Builder r0 = r0.compatBuilder
            r23 = r0
            r16 = r23
            r23 = r16
            r0 = r23
            java.util.ArrayList r0 = r0.mActions
            r23 = r0
            r23.clear()
            r23 = r5
            r24 = r16
            r25 = r10
            int r25 = r25.intValue()
            r26 = r6
            addNotificationActionButtons(r23, r24, r25, r26)
            r23 = r16
            r24 = r15
            androidx.core.app.NotificationCompat$Builder r23 = r23.setContentIntent(r24)
            r24 = r8
            androidx.core.app.NotificationCompat$Builder r23 = r23.setDeleteIntent(r24)
            r24 = r4
            androidx.core.app.NotificationCompat$Builder r23 = r23.setOnlyAlertOnce(r24)
            r24 = 0
            androidx.core.app.NotificationCompat$Builder r23 = r23.setAutoCancel(r24)
            r24 = r6
            androidx.core.app.NotificationCompat$Builder r23 = r23.setGroup(r24)
            r24 = 1
            androidx.core.app.NotificationCompat$Builder r23 = r23.setGroupSummary(r24)
            r23 = r16
            r24 = 1
            androidx.core.app.NotificationCompat$Builder r23 = r23.setGroupAlertBehavior(r24)     // Catch:{ Throwable -> 0x054b }
        L_0x053b:
            r23 = r16
            android.app.Notification r23 = r23.build()
            r9 = r23
            r23 = r3
            r24 = r9
            addXiaomiSettings(r23, r24)
            goto L_0x04d7
        L_0x054b:
            r23 = move-exception
            r17 = r23
            goto L_0x053b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.GenerateNotification.createSummaryNotification(com.onesignal.NotificationGenerationJob, com.onesignal.GenerateNotification$OneSignalNotificationBuilder):void");
    }

    @RequiresApi(api = 23)
    private static void createGrouplessSummaryNotification(NotificationGenerationJob notificationGenerationJob, int i) {
        SecureRandom secureRandom;
        StringBuilder sb;
        NotificationCompat.InboxStyle inboxStyle;
        NotificationGenerationJob notifJob = notificationGenerationJob;
        int grouplessNotifCount = i;
        JSONObject gcmBundle = notifJob.jsonPayload;
        new SecureRandom();
        SecureRandom random = secureRandom;
        String group = OneSignalNotificationManager.getGrouplessSummaryKey();
        new StringBuilder();
        String summaryMessage = sb.append(grouplessNotifCount).append(" new messages").toString();
        int summaryNotificationId = OneSignalNotificationManager.getGrouplessSummaryId();
        PendingIntent summaryContentIntent = getNewActionPendingIntent(random.nextInt(), createBaseSummaryIntent(summaryNotificationId, gcmBundle, group));
        PendingIntent summaryDeleteIntent = getNewActionPendingIntent(random.nextInt(), getNewBaseDeleteIntent(0).putExtra("summary", group));
        NotificationCompat.Builder summaryBuilder = getBaseOneSignalNotificationBuilder(notifJob).compatBuilder;
        if (notifJob.overriddenSound != null) {
            NotificationCompat.Builder sound = summaryBuilder.setSound(notifJob.overriddenSound);
        }
        if (notifJob.overriddenFlags != null) {
            NotificationCompat.Builder defaults = summaryBuilder.setDefaults(notifJob.overriddenFlags.intValue());
        }
        NotificationCompat.Builder groupSummary = summaryBuilder.setContentIntent(summaryContentIntent).setDeleteIntent(summaryDeleteIntent).setContentTitle(currentContext.getPackageManager().getApplicationLabel(currentContext.getApplicationInfo())).setContentText(summaryMessage).setNumber(grouplessNotifCount).setSmallIcon(getDefaultSmallIconId()).setLargeIcon(getDefaultLargeIcon()).setOnlyAlertOnce(true).setAutoCancel(false).setGroup(group).setGroupSummary(true);
        try {
            NotificationCompat.Builder groupAlertBehavior = summaryBuilder.setGroupAlertBehavior(1);
        } catch (Throwable th) {
            Throwable th2 = th;
        }
        new NotificationCompat.InboxStyle();
        NotificationCompat.InboxStyle inboxStyle2 = inboxStyle;
        NotificationCompat.InboxStyle bigContentTitle = inboxStyle2.setBigContentTitle(summaryMessage);
        NotificationCompat.Builder style = summaryBuilder.setStyle(inboxStyle2);
        NotificationManagerCompat.from(currentContext).notify(summaryNotificationId, summaryBuilder.build());
    }

    private static Intent createBaseSummaryIntent(int summaryNotificationId, JSONObject gcmBundle, String group) {
        return getNewBaseIntent(summaryNotificationId).putExtra(BUNDLE_KEY_ONESIGNAL_DATA, gcmBundle.toString()).putExtra("summary", group);
    }

    private static void createSummaryIdDatabaseEntry(OneSignalDbHelper dbHelper, String group, int id) {
        ContentValues contentValues;
        new ContentValues();
        ContentValues values = contentValues;
        values.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID, Integer.valueOf(id));
        values.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_GROUP_ID, group);
        values.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_IS_SUMMARY, 1);
        dbHelper.insertOrThrow(OneSignalDbContract.NotificationTable.TABLE_NAME, (String) null, values);
    }

    private static void addBackgroundImage(JSONObject jSONObject, NotificationCompat.Builder builder) throws Throwable {
        RemoteViews remoteViews;
        JSONObject jSONObject2;
        JSONObject gcmBundle = jSONObject;
        NotificationCompat.Builder notifBuilder = builder;
        if (Build.VERSION.SDK_INT >= 16) {
            Bitmap bg_image = null;
            JSONObject jsonBgImage = null;
            String jsonStrBgImage = gcmBundle.optString("bg_img", (String) null);
            if (jsonStrBgImage != null) {
                new JSONObject(jsonStrBgImage);
                jsonBgImage = jSONObject2;
                bg_image = getBitmap(jsonBgImage.optString("img", (String) null));
            }
            if (bg_image == null) {
                bg_image = getBitmapFromAssetsOrResourceName("onesignal_bgimage_default_image");
            }
            if (bg_image != null) {
                new RemoteViews(currentContext.getPackageName(), R.layout.onesignal_bgimage_notif_layout);
                RemoteViews customView = remoteViews;
                customView.setTextViewText(R.id.os_bgimage_notif_title, getTitle(gcmBundle));
                customView.setTextViewText(R.id.os_bgimage_notif_body, gcmBundle.optString("alert"));
                setTextColor(customView, jsonBgImage, R.id.os_bgimage_notif_title, "tc", "onesignal_bgimage_notif_title_color");
                setTextColor(customView, jsonBgImage, R.id.os_bgimage_notif_body, "bc", "onesignal_bgimage_notif_body_color");
                String alignSetting = null;
                if (jsonBgImage == null || !jsonBgImage.has("img_align")) {
                    int iAlignSetting = contextResources.getIdentifier("onesignal_bgimage_notif_image_align", StringTypedProperty.TYPE, packageName);
                    if (iAlignSetting != 0) {
                        alignSetting = contextResources.getString(iAlignSetting);
                    }
                } else {
                    alignSetting = jsonBgImage.getString("img_align");
                }
                if ("right".equals(alignSetting)) {
                    customView.setViewPadding(R.id.os_bgimage_notif_bgimage_align_layout, -5000, 0, 0, 0);
                    customView.setImageViewBitmap(R.id.os_bgimage_notif_bgimage_right_aligned, bg_image);
                    customView.setViewVisibility(R.id.os_bgimage_notif_bgimage_right_aligned, 0);
                    customView.setViewVisibility(R.id.os_bgimage_notif_bgimage, 2);
                } else {
                    customView.setImageViewBitmap(R.id.os_bgimage_notif_bgimage, bg_image);
                }
                NotificationCompat.Builder content = notifBuilder.setContent(customView);
                NotificationCompat.Builder style = notifBuilder.setStyle((NotificationCompat.Style) null);
            }
        }
    }

    private static void setTextColor(RemoteViews remoteViews, JSONObject gcmBundle, int i, String colorPayloadKey, String str) {
        RemoteViews customView = remoteViews;
        int viewId = i;
        String colorDefaultResource = str;
        Integer color = safeGetColorFromHex(gcmBundle, colorPayloadKey);
        if (color != null) {
            customView.setTextColor(viewId, color.intValue());
            return;
        }
        int colorId = contextResources.getIdentifier(colorDefaultResource, "color", packageName);
        if (colorId != 0) {
            customView.setTextColor(viewId, AndroidSupportV4Compat.ContextCompat.getColor(currentContext, colorId));
        }
    }

    private static Integer safeGetColorFromHex(JSONObject jSONObject, String str) {
        BigInteger bigInteger;
        JSONObject gcmBundle = jSONObject;
        String colorKey = str;
        if (gcmBundle != null) {
            try {
                if (gcmBundle.has(colorKey)) {
                    new BigInteger(gcmBundle.optString(colorKey), 16);
                    return Integer.valueOf(bigInteger.intValue());
                }
            } catch (Throwable th) {
                Throwable th2 = th;
            }
        }
        return null;
    }

    private static Bitmap getLargeIcon(JSONObject gcmBundle) {
        Bitmap bitmap = getBitmap(gcmBundle.optString("licon"));
        if (bitmap == null) {
            bitmap = getBitmapFromAssetsOrResourceName("ic_onesignal_large_icon_default");
        }
        if (bitmap == null) {
            return null;
        }
        return resizeBitmapForLargeIconArea(bitmap);
    }

    private static Bitmap getDefaultLargeIcon() {
        return resizeBitmapForLargeIconArea(getBitmapFromAssetsOrResourceName("ic_onesignal_large_icon_default"));
    }

    private static Bitmap resizeBitmapForLargeIconArea(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        if (bitmap2 == null) {
            return null;
        }
        try {
            int systemLargeIconHeight = (int) contextResources.getDimension(17104902);
            int systemLargeIconWidth = (int) contextResources.getDimension(17104901);
            int bitmapHeight = bitmap2.getHeight();
            int bitmapWidth = bitmap2.getWidth();
            if (bitmapWidth > systemLargeIconWidth || bitmapHeight > systemLargeIconHeight) {
                int newWidth = systemLargeIconWidth;
                int newHeight = systemLargeIconHeight;
                if (bitmapHeight > bitmapWidth) {
                    newWidth = (int) (((float) newHeight) * (((float) bitmapWidth) / ((float) bitmapHeight)));
                } else if (bitmapWidth > bitmapHeight) {
                    newHeight = (int) (((float) newWidth) * (((float) bitmapHeight) / ((float) bitmapWidth)));
                }
                return Bitmap.createScaledBitmap(bitmap2, newWidth, newHeight, true);
            }
        } catch (Throwable th) {
            Throwable th2 = th;
        }
        return bitmap2;
    }

    private static Bitmap getBitmapFromAssetsOrResourceName(String str) {
        StringBuilder sb;
        String bitmapStr = str;
        Bitmap bitmap = null;
        try {
            bitmap = BitmapFactory.decodeStream(currentContext.getAssets().open(bitmapStr));
        } catch (Throwable th) {
            Throwable th2 = th;
        }
        if (bitmap != null) {
            return bitmap;
        }
        try {
            String[] strArr = new String[5];
            strArr[0] = ".png";
            String[] strArr2 = strArr;
            strArr2[1] = ".webp";
            String[] strArr3 = strArr2;
            strArr3[2] = ".jpg";
            String[] strArr4 = strArr3;
            strArr4[3] = ".gif";
            String[] strArr5 = strArr4;
            strArr5[4] = ".bmp";
            for (String extension : Arrays.asList(strArr5)) {
                try {
                    AssetManager assets = currentContext.getAssets();
                    new StringBuilder();
                    bitmap = BitmapFactory.decodeStream(assets.open(sb.append(bitmapStr).append(extension).toString()));
                } catch (Throwable th3) {
                    Throwable th4 = th3;
                }
                if (bitmap != null) {
                    return bitmap;
                }
            }
            int bitmapId = getResourceIcon(bitmapStr);
            if (bitmapId != 0) {
                return BitmapFactory.decodeResource(contextResources, bitmapId);
            }
        } catch (Throwable th5) {
            Throwable th6 = th5;
        }
        return null;
    }

    private static Bitmap getBitmapFromURL(String location) {
        URL url;
        try {
            new URL(location);
            return BitmapFactory.decodeStream(url.openConnection().getInputStream());
        } catch (Throwable th) {
            OneSignal.Log(OneSignal.LOG_LEVEL.WARN, "Could not download image!", th);
            return null;
        }
    }

    private static Bitmap getBitmap(String str) {
        String name = str;
        if (name == null) {
            return null;
        }
        String trimmedName = name.trim();
        if (trimmedName.startsWith("http://") || trimmedName.startsWith("https://")) {
            return getBitmapFromURL(trimmedName);
        }
        return getBitmapFromAssetsOrResourceName(name);
    }

    private static int getResourceIcon(String str) {
        String iconName = str;
        if (iconName == null) {
            return 0;
        }
        String trimmedIconName = iconName.trim();
        if (!OSUtils.isValidResourceName(trimmedIconName)) {
            return 0;
        }
        int notificationIcon = getDrawableId(trimmedIconName);
        if (notificationIcon != 0) {
            return notificationIcon;
        }
        try {
            return R.drawable.class.getField(iconName).getInt((Object) null);
        } catch (Throwable th) {
            Throwable th2 = th;
            return 0;
        }
    }

    private static int getSmallIconId(JSONObject gcmBundle) {
        int notificationIcon = getResourceIcon(gcmBundle.optString("sicon", (String) null));
        if (notificationIcon != 0) {
            return notificationIcon;
        }
        return getDefaultSmallIconId();
    }

    private static int getDefaultSmallIconId() {
        int notificationIcon = getDrawableId("ic_stat_onesignal_default");
        if (notificationIcon != 0) {
            return notificationIcon;
        }
        int notificationIcon2 = getDrawableId("corona_statusbar_icon_default");
        if (notificationIcon2 != 0) {
            return notificationIcon2;
        }
        int notificationIcon3 = getDrawableId("ic_os_notification_fallback_white_24dp");
        if (notificationIcon3 != 0) {
            return notificationIcon3;
        }
        return 17301598;
    }

    private static int getDrawableId(String name) {
        return contextResources.getIdentifier(name, "drawable", packageName);
    }

    private static boolean isSoundEnabled(JSONObject gcmBundle) {
        String sound = gcmBundle.optString("sound", (String) null);
        if ("null".equals(sound) || "nil".equals(sound)) {
            return false;
        }
        return OneSignal.getSoundEnabled();
    }

    private static BigInteger getAccentColor(JSONObject jSONObject) {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        JSONObject gcmBundle = jSONObject;
        try {
            if (gcmBundle.has("bgac")) {
                BigInteger bigInteger3 = bigInteger2;
                new BigInteger(gcmBundle.optString("bgac", (String) null), 16);
                return bigInteger3;
            }
        } catch (Throwable th) {
            Throwable th2 = th;
        }
        try {
            String defaultColor = OSUtils.getManifestMeta(currentContext, "com.onesignal.NotificationAccentColor.DEFAULT");
            if (defaultColor != null) {
                BigInteger bigInteger4 = bigInteger;
                new BigInteger(defaultColor, 16);
                return bigInteger4;
            }
        } catch (Throwable th3) {
            Throwable th4 = th3;
        }
        return null;
    }

    private static void addNotificationActionButtons(JSONObject jSONObject, NotificationCompat.Builder builder, int i, String str) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        StringBuilder sb;
        JSONObject gcmBundle = jSONObject;
        NotificationCompat.Builder mBuilder = builder;
        int notificationId = i;
        String groupSummary = str;
        try {
            new JSONObject(gcmBundle.optString(OSNotificationFormatHelper.PAYLOAD_OS_ROOT_CUSTOM));
            JSONObject customJson = jSONObject2;
            if (customJson.has(NotificationBundleProcessor.PUSH_ADDITIONAL_DATA_KEY)) {
                JSONObject additionalDataJSON = customJson.getJSONObject(NotificationBundleProcessor.PUSH_ADDITIONAL_DATA_KEY);
                if (additionalDataJSON.has("actionButtons")) {
                    JSONArray buttons = additionalDataJSON.getJSONArray("actionButtons");
                    for (int i2 = 0; i2 < buttons.length(); i2++) {
                        JSONObject button = buttons.optJSONObject(i2);
                        new JSONObject(gcmBundle.toString());
                        JSONObject bundle = jSONObject3;
                        Intent buttonIntent = getNewBaseIntent(notificationId);
                        new StringBuilder();
                        Intent action = buttonIntent.setAction(sb.append("").append(i2).toString());
                        Intent putExtra = buttonIntent.putExtra("action_button", true);
                        JSONObject put = bundle.put(BUNDLE_KEY_ACTION_ID, button.optString(CommonProperties.ID));
                        Intent putExtra2 = buttonIntent.putExtra(BUNDLE_KEY_ONESIGNAL_DATA, bundle.toString());
                        if (groupSummary != null) {
                            Intent putExtra3 = buttonIntent.putExtra("summary", groupSummary);
                        } else if (gcmBundle.has("grp")) {
                            Intent putExtra4 = buttonIntent.putExtra("grp", gcmBundle.optString("grp"));
                        }
                        PendingIntent buttonPIntent = getNewActionPendingIntent(notificationId, buttonIntent);
                        int buttonIcon = 0;
                        if (button.has("icon")) {
                            buttonIcon = getResourceIcon(button.optString("icon"));
                        }
                        NotificationCompat.Builder addAction = mBuilder.addAction(buttonIcon, button.optString("text"), buttonPIntent);
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static void addAlertButtons(Context context, JSONObject gcmBundle, List<String> list, List<String> list2) {
        Context context2 = context;
        List<String> buttonsLabels = list;
        List<String> buttonsIds = list2;
        try {
            addCustomAlertButtons(context2, gcmBundle, buttonsLabels, buttonsIds);
        } catch (Throwable th) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Failed to parse JSON for custom buttons for alert dialog.", th);
        }
        if (buttonsLabels.size() == 0 || buttonsLabels.size() < 3) {
            boolean add = buttonsLabels.add(OSUtils.getResourceString(context2, "onesignal_in_app_alert_ok_button_text", "Ok"));
            boolean add2 = buttonsIds.add("__DEFAULT__");
        }
    }

    private static void addCustomAlertButtons(Context context, JSONObject gcmBundle, List<String> list, List<String> list2) throws JSONException {
        JSONObject jSONObject;
        Context context2 = context;
        List<String> buttonsLabels = list;
        List<String> buttonsIds = list2;
        new JSONObject(gcmBundle.optString(OSNotificationFormatHelper.PAYLOAD_OS_ROOT_CUSTOM));
        JSONObject customJson = jSONObject;
        if (customJson.has(NotificationBundleProcessor.PUSH_ADDITIONAL_DATA_KEY)) {
            JSONObject additionalDataJSON = customJson.getJSONObject(NotificationBundleProcessor.PUSH_ADDITIONAL_DATA_KEY);
            if (additionalDataJSON.has("actionButtons")) {
                JSONArray buttons = additionalDataJSON.optJSONArray("actionButtons");
                for (int i = 0; i < buttons.length(); i++) {
                    JSONObject button = buttons.getJSONObject(i);
                    boolean add = buttonsLabels.add(button.optString("text"));
                    boolean add2 = buttonsIds.add(button.optString(CommonProperties.ID));
                }
            }
        }
    }

    private static int convertOSToAndroidPriority(int i) {
        int priority = i;
        if (priority > 9) {
            return 2;
        }
        if (priority > 7) {
            return 1;
        }
        if (priority > 4) {
            return 0;
        }
        if (priority > 2) {
            return -1;
        }
        return -2;
    }
}
