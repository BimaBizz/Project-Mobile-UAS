package com.onesignal.shortcutbadger.impl;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.onesignal.OneSignalDbContract;
import com.onesignal.shortcutbadger.Badger;
import com.onesignal.shortcutbadger.ShortcutBadgeException;
import com.onesignal.shortcutbadger.util.BroadcastHelper;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

@Deprecated
public class XiaomiHomeBadger implements Badger {
    public static final String EXTRA_UPDATE_APP_COMPONENT_NAME = "android.intent.extra.update_application_component_name";
    public static final String EXTRA_UPDATE_APP_MSG_TEXT = "android.intent.extra.update_application_message_text";
    public static final String INTENT_ACTION = "android.intent.action.APPLICATION_MESSAGE_UPDATE";
    private ResolveInfo resolveInfo;

    public XiaomiHomeBadger() {
    }

    public void executeBadge(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        Intent intent;
        StringBuilder sb;
        Context context2 = context;
        ComponentName componentName2 = componentName;
        int badgeCount = i;
        try {
            Object miuiNotification = Class.forName("android.app.MiuiNotification").newInstance();
            Field field = miuiNotification.getClass().getDeclaredField("messageCount");
            field.setAccessible(true);
            try {
                field.set(miuiNotification, String.valueOf(badgeCount == 0 ? "" : Integer.valueOf(badgeCount)));
            } catch (Exception e) {
                Exception exc = e;
                field.set(miuiNotification, Integer.valueOf(badgeCount));
            }
        } catch (Exception e2) {
            Exception exc2 = e2;
            new Intent(INTENT_ACTION);
            Intent localIntent = intent;
            new StringBuilder();
            Intent putExtra = localIntent.putExtra(EXTRA_UPDATE_APP_COMPONENT_NAME, sb.append(componentName2.getPackageName()).append("/").append(componentName2.getClassName()).toString());
            Intent putExtra2 = localIntent.putExtra(EXTRA_UPDATE_APP_MSG_TEXT, String.valueOf(badgeCount == 0 ? "" : Integer.valueOf(badgeCount)));
            if (BroadcastHelper.canResolveBroadcast(context2, localIntent)) {
                context2.sendBroadcast(localIntent);
            }
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
            tryNewMiuiBadge(context2, badgeCount);
        }
    }

    @TargetApi(16)
    private void tryNewMiuiBadge(Context context, int i) throws ShortcutBadgeException {
        Notification.Builder builder;
        Throwable th;
        Intent intent;
        Context context2 = context;
        int badgeCount = i;
        if (this.resolveInfo == null) {
            new Intent("android.intent.action.MAIN");
            Intent intent2 = intent;
            Intent addCategory = intent2.addCategory("android.intent.category.HOME");
            this.resolveInfo = context2.getPackageManager().resolveActivity(intent2, 65536);
        }
        if (this.resolveInfo != null) {
            NotificationManager mNotificationManager = (NotificationManager) context2.getSystemService(OneSignalDbContract.NotificationTable.TABLE_NAME);
            new Notification.Builder(context2);
            Notification notification = builder.setContentTitle("").setContentText("").setSmallIcon(this.resolveInfo.getIconResource()).build();
            try {
                Object extraNotification = notification.getClass().getDeclaredField("extraNotification").get(notification);
                Class[] clsArr = {Integer.TYPE};
                Object invoke = extraNotification.getClass().getDeclaredMethod("setMessageCount", clsArr).invoke(extraNotification, new Object[]{Integer.valueOf(badgeCount)});
                mNotificationManager.notify(0, notification);
            } catch (Exception e) {
                Exception e2 = e;
                Throwable th2 = th;
                new ShortcutBadgeException("not able to set badge", e2);
                throw th2;
            }
        }
    }

    public List<String> getSupportLaunchers() {
        String[] strArr = new String[7];
        strArr[0] = "com.miui.miuilite";
        String[] strArr2 = strArr;
        strArr2[1] = "com.miui.home";
        String[] strArr3 = strArr2;
        strArr3[2] = "com.miui.miuihome";
        String[] strArr4 = strArr3;
        strArr4[3] = "com.miui.miuihome2";
        String[] strArr5 = strArr4;
        strArr5[4] = "com.miui.mihome";
        String[] strArr6 = strArr5;
        strArr6[5] = "com.miui.mihome2";
        String[] strArr7 = strArr6;
        strArr7[6] = "com.i.miui.launcher";
        return Arrays.asList(strArr7);
    }
}
