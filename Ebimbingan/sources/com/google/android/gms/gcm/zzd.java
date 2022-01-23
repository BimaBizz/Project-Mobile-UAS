package com.google.android.gms.gcm;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;

final class zzd {
    static zzd zzk;
    private final Context zzl;
    private String zzm;
    private final AtomicInteger zzn;

    static synchronized zzd zzd(Context context) {
        zzd zzd;
        zzd zzd2;
        Context context2 = context;
        synchronized (zzd.class) {
            if (zzk == null) {
                new zzd(context2);
                zzk = zzd2;
            }
            zzd = zzk;
        }
        return zzd;
    }

    static String zzd(Bundle bundle, String str) {
        Bundle bundle2 = bundle;
        String str2 = str;
        String string = bundle2.getString(str2);
        String str3 = string;
        if (string == null) {
            str3 = bundle2.getString(str2.replace("gcm.n.", "gcm.notification."));
        }
        return str3;
    }

    private zzd(Context context) {
        AtomicInteger atomicInteger;
        new AtomicInteger((int) SystemClock.elapsedRealtime());
        this.zzn = atomicInteger;
        this.zzl = context.getApplicationContext();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x034b  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x035b  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0382  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0392  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x039e  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x03d8  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x03fd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zze(android.os.Bundle r35) {
        /*
            r34 = this;
            r3 = r34
            r4 = r35
            r24 = r3
            r25 = r4
            r7 = r25
            r32 = r24
            r24 = r32
            r25 = r32
            r6 = r25
            r25 = r7
            java.lang.String r26 = "gcm.n.title"
            java.lang.String r24 = r24.zze(r25, r26)
            r32 = r24
            r24 = r32
            r25 = r32
            r8 = r25
            boolean r24 = android.text.TextUtils.isEmpty(r24)
            if (r24 == 0) goto L_0x0047
            r24 = r6
            r0 = r24
            android.content.Context r0 = r0.zzl
            r24 = r0
            android.content.pm.ApplicationInfo r24 = r24.getApplicationInfo()
            r25 = r6
            r0 = r25
            android.content.Context r0 = r0.zzl
            r25 = r0
            android.content.pm.PackageManager r25 = r25.getPackageManager()
            java.lang.CharSequence r24 = r24.loadLabel(r25)
            r8 = r24
        L_0x0047:
            r24 = r6
            r25 = r7
            java.lang.String r26 = "gcm.n.body"
            java.lang.String r24 = r24.zze(r25, r26)
            r9 = r24
            r24 = r6
            r25 = r7
            java.lang.String r26 = "gcm.n.icon"
            java.lang.String r25 = zzd(r25, r26)
            r16 = r25
            r15 = r24
            r24 = r16
            boolean r24 = android.text.TextUtils.isEmpty(r24)
            if (r24 != 0) goto L_0x01dd
            r24 = r15
            r0 = r24
            android.content.Context r0 = r0.zzl
            r24 = r0
            android.content.res.Resources r24 = r24.getResources()
            r32 = r24
            r24 = r32
            r25 = r32
            r17 = r25
            r25 = r16
            java.lang.String r26 = "drawable"
            r27 = r15
            r0 = r27
            android.content.Context r0 = r0.zzl
            r27 = r0
            java.lang.String r27 = r27.getPackageName()
            int r24 = r24.getIdentifier(r25, r26, r27)
            r32 = r24
            r24 = r32
            r25 = r32
            r18 = r25
            if (r24 == 0) goto L_0x0174
            r24 = r18
        L_0x00a0:
            r10 = r24
            r24 = r7
            java.lang.String r25 = "gcm.n.color"
            java.lang.String r24 = zzd(r24, r25)
            r11 = r24
            r24 = r6
            r25 = r7
            java.lang.String r26 = "gcm.n.sound2"
            java.lang.String r25 = zzd(r25, r26)
            r16 = r25
            r15 = r24
            r24 = r16
            boolean r24 = android.text.TextUtils.isEmpty(r24)
            if (r24 == 0) goto L_0x0202
            r24 = 0
        L_0x00c6:
            r12 = r24
            r24 = r6
            r25 = r7
            r16 = r25
            r15 = r24
            r24 = r16
            java.lang.String r25 = "gcm.n.click_action"
            java.lang.String r24 = zzd(r24, r25)
            r32 = r24
            r24 = r32
            r25 = r32
            r18 = r25
            boolean r24 = android.text.TextUtils.isEmpty(r24)
            if (r24 != 0) goto L_0x029b
            android.content.Intent r24 = new android.content.Intent
            r32 = r24
            r24 = r32
            r25 = r32
            r26 = r18
            r25.<init>(r26)
            r32 = r24
            r24 = r32
            r25 = r32
            r17 = r25
            r25 = r15
            r0 = r25
            android.content.Context r0 = r0.zzl
            r25 = r0
            java.lang.String r25 = r25.getPackageName()
            android.content.Intent r24 = r24.setPackage(r25)
            r24 = r17
            r25 = 268435456(0x10000000, float:2.5243549E-29)
            android.content.Intent r24 = r24.setFlags(r25)
        L_0x0114:
            android.os.Bundle r24 = new android.os.Bundle
            r32 = r24
            r24 = r32
            r25 = r32
            r26 = r16
            r25.<init>(r26)
            r32 = r24
            r24 = r32
            r25 = r32
            r16 = r25
            com.google.android.gms.gcm.GcmListenerService.zzd(r24)
            r24 = r17
            r25 = r16
            android.content.Intent r24 = r24.putExtras(r25)
            r24 = r16
            java.util.Set r24 = r24.keySet()
            java.util.Iterator r24 = r24.iterator()
            r19 = r24
        L_0x0140:
            r24 = r19
            boolean r24 = r24.hasNext()
            if (r24 == 0) goto L_0x043f
            r24 = r19
            java.lang.Object r24 = r24.next()
            java.lang.String r24 = (java.lang.String) r24
            r32 = r24
            r24 = r32
            r25 = r32
            r20 = r25
            java.lang.String r25 = "gcm.n."
            boolean r24 = r24.startsWith(r25)
            if (r24 != 0) goto L_0x016c
            r24 = r20
            java.lang.String r25 = "gcm.notification."
            boolean r24 = r24.startsWith(r25)
            if (r24 == 0) goto L_0x0173
        L_0x016c:
            r24 = r17
            r25 = r20
            r24.removeExtra(r25)
        L_0x0173:
            goto L_0x0140
        L_0x0174:
            r24 = r17
            r25 = r16
            java.lang.String r26 = "mipmap"
            r27 = r15
            r0 = r27
            android.content.Context r0 = r0.zzl
            r27 = r0
            java.lang.String r27 = r27.getPackageName()
            int r24 = r24.getIdentifier(r25, r26, r27)
            r32 = r24
            r24 = r32
            r25 = r32
            r18 = r25
            if (r24 == 0) goto L_0x0199
            r24 = r18
            goto L_0x00a0
        L_0x0199:
            java.lang.String r24 = "GcmNotification"
            r25 = 57
            r26 = r16
            java.lang.String r26 = java.lang.String.valueOf(r26)
            int r26 = r26.length()
            int r25 = r25 + r26
            java.lang.StringBuilder r26 = new java.lang.StringBuilder
            r32 = r25
            r33 = r26
            r25 = r33
            r26 = r32
            r27 = r33
            r32 = r26
            r33 = r27
            r26 = r33
            r27 = r32
            r26.<init>(r27)
            java.lang.String r26 = "Icon resource "
            java.lang.StringBuilder r25 = r25.append(r26)
            r26 = r16
            java.lang.StringBuilder r25 = r25.append(r26)
            java.lang.String r26 = " not found. Notification will use app icon."
            java.lang.StringBuilder r25 = r25.append(r26)
            java.lang.String r25 = r25.toString()
            int r24 = android.util.Log.w(r24, r25)
        L_0x01dd:
            r24 = r15
            r0 = r24
            android.content.Context r0 = r0.zzl
            r24 = r0
            android.content.pm.ApplicationInfo r24 = r24.getApplicationInfo()
            r0 = r24
            int r0 = r0.icon
            r24 = r0
            r32 = r24
            r24 = r32
            r25 = r32
            r17 = r25
            if (r24 != 0) goto L_0x01fe
            r24 = 17301651(0x1080093, float:2.4979667E-38)
            r17 = r24
        L_0x01fe:
            r24 = r17
            goto L_0x00a0
        L_0x0202:
            java.lang.String r24 = "default"
            r25 = r16
            boolean r24 = r24.equals(r25)
            if (r24 != 0) goto L_0x0293
            r24 = r15
            r0 = r24
            android.content.Context r0 = r0.zzl
            r24 = r0
            android.content.res.Resources r24 = r24.getResources()
            r25 = r16
            java.lang.String r26 = "raw"
            r27 = r15
            r0 = r27
            android.content.Context r0 = r0.zzl
            r27 = r0
            java.lang.String r27 = r27.getPackageName()
            int r24 = r24.getIdentifier(r25, r26, r27)
            if (r24 == 0) goto L_0x0293
            r24 = r15
            r0 = r24
            android.content.Context r0 = r0.zzl
            r24 = r0
            java.lang.String r24 = r24.getPackageName()
            r19 = r24
            r24 = 24
            r25 = r19
            java.lang.String r25 = java.lang.String.valueOf(r25)
            int r25 = r25.length()
            int r24 = r24 + r25
            r25 = r16
            java.lang.String r25 = java.lang.String.valueOf(r25)
            int r25 = r25.length()
            int r24 = r24 + r25
            java.lang.StringBuilder r25 = new java.lang.StringBuilder
            r32 = r24
            r33 = r25
            r24 = r33
            r25 = r32
            r26 = r33
            r32 = r25
            r33 = r26
            r25 = r33
            r26 = r32
            r25.<init>(r26)
            java.lang.String r25 = "android.resource://"
            java.lang.StringBuilder r24 = r24.append(r25)
            r25 = r19
            java.lang.StringBuilder r24 = r24.append(r25)
            java.lang.String r25 = "/raw/"
            java.lang.StringBuilder r24 = r24.append(r25)
            r25 = r16
            java.lang.StringBuilder r24 = r24.append(r25)
            java.lang.String r24 = r24.toString()
            android.net.Uri r24 = android.net.Uri.parse(r24)
            goto L_0x00c6
        L_0x0293:
            r24 = 2
            android.net.Uri r24 = android.media.RingtoneManager.getDefaultUri(r24)
            goto L_0x00c6
        L_0x029b:
            r24 = r15
            r0 = r24
            android.content.Context r0 = r0.zzl
            r24 = r0
            android.content.pm.PackageManager r24 = r24.getPackageManager()
            r25 = r15
            r0 = r25
            android.content.Context r0 = r0.zzl
            r25 = r0
            java.lang.String r25 = r25.getPackageName()
            android.content.Intent r24 = r24.getLaunchIntentForPackage(r25)
            r32 = r24
            r24 = r32
            r25 = r32
            r17 = r25
            if (r24 != 0) goto L_0x0114
            java.lang.String r24 = "GcmNotification"
            java.lang.String r25 = "No activity found to launch app"
            int r24 = android.util.Log.w(r24, r25)
            r24 = 0
        L_0x02cd:
            r13 = r24
            r24 = r6
            r25 = r7
            java.lang.String r26 = "gcm.n.android_channel_id"
            java.lang.String r25 = zzd(r25, r26)
            r16 = r25
            r15 = r24
            boolean r24 = com.google.android.gms.common.util.C0609PlatformVersion.isAtLeastO()
            if (r24 == 0) goto L_0x02fe
            r24 = r15
            r0 = r24
            android.content.Context r0 = r0.zzl
            r24 = r0
            android.content.pm.ApplicationInfo r24 = r24.getApplicationInfo()
            r0 = r24
            int r0 = r0.targetSdkVersion
            r24 = r0
            r25 = 26
            r0 = r24
            r1 = r25
            if (r0 >= r1) goto L_0x045d
        L_0x02fe:
            r24 = 0
        L_0x0300:
            r14 = r24
            r24 = r6
            r25 = r8
            r26 = r9
            r27 = r10
            r28 = r11
            r29 = r12
            r30 = r13
            r31 = r14
            r22 = r31
            r21 = r30
            r20 = r29
            r19 = r28
            r18 = r27
            r17 = r26
            r16 = r25
            r15 = r24
            androidx.core.app.NotificationCompat$Builder r24 = new androidx.core.app.NotificationCompat$Builder
            r32 = r24
            r24 = r32
            r25 = r32
            r26 = r15
            r0 = r26
            android.content.Context r0 = r0.zzl
            r26 = r0
            r25.<init>(r26)
            r25 = 1
            androidx.core.app.NotificationCompat$Builder r24 = r24.setAutoCancel(r25)
            r25 = r18
            androidx.core.app.NotificationCompat$Builder r24 = r24.setSmallIcon(r25)
            r23 = r24
            r24 = r16
            boolean r24 = android.text.TextUtils.isEmpty(r24)
            if (r24 != 0) goto L_0x0353
            r24 = r23
            r25 = r16
            androidx.core.app.NotificationCompat$Builder r24 = r24.setContentTitle(r25)
        L_0x0353:
            r24 = r17
            boolean r24 = android.text.TextUtils.isEmpty(r24)
            if (r24 != 0) goto L_0x037a
            r24 = r23
            r25 = r17
            androidx.core.app.NotificationCompat$Builder r24 = r24.setContentText(r25)
            r24 = r23
            androidx.core.app.NotificationCompat$BigTextStyle r25 = new androidx.core.app.NotificationCompat$BigTextStyle
            r32 = r25
            r25 = r32
            r26 = r32
            r26.<init>()
            r26 = r17
            androidx.core.app.NotificationCompat$BigTextStyle r25 = r25.bigText(r26)
            androidx.core.app.NotificationCompat$Builder r24 = r24.setStyle(r25)
        L_0x037a:
            r24 = r19
            boolean r24 = android.text.TextUtils.isEmpty(r24)
            if (r24 != 0) goto L_0x038e
            r24 = r23
            r25 = r19
            int r25 = android.graphics.Color.parseColor(r25)
            androidx.core.app.NotificationCompat$Builder r24 = r24.setColor(r25)
        L_0x038e:
            r24 = r20
            if (r24 == 0) goto L_0x039a
            r24 = r23
            r25 = r20
            androidx.core.app.NotificationCompat$Builder r24 = r24.setSound(r25)
        L_0x039a:
            r24 = r21
            if (r24 == 0) goto L_0x03a6
            r24 = r23
            r25 = r21
            androidx.core.app.NotificationCompat$Builder r24 = r24.setContentIntent(r25)
        L_0x03a6:
            r24 = r22
            if (r24 == 0) goto L_0x03b2
            r24 = r23
            r25 = r22
            androidx.core.app.NotificationCompat$Builder r24 = r24.setChannelId(r25)
        L_0x03b2:
            r24 = r23
            android.app.Notification r24 = r24.build()
            r5 = r24
            r24 = r3
            r25 = r4
            java.lang.String r26 = "gcm.n.tag"
            java.lang.String r25 = zzd(r25, r26)
            r26 = r5
            r8 = r26
            r7 = r25
            r6 = r24
            java.lang.String r24 = "GcmNotification"
            r25 = 3
            boolean r24 = android.util.Log.isLoggable(r24, r25)
            if (r24 == 0) goto L_0x03e2
            java.lang.String r24 = "GcmNotification"
            java.lang.String r25 = "Showing notification"
            int r24 = android.util.Log.d(r24, r25)
        L_0x03e2:
            r24 = r6
            r0 = r24
            android.content.Context r0 = r0.zzl
            r24 = r0
            java.lang.String r25 = "notification"
            java.lang.Object r24 = r24.getSystemService(r25)
            android.app.NotificationManager r24 = (android.app.NotificationManager) r24
            r9 = r24
            r24 = r7
            boolean r24 = android.text.TextUtils.isEmpty(r24)
            if (r24 == 0) goto L_0x042f
            long r24 = android.os.SystemClock.uptimeMillis()
            r10 = r24
            r24 = 37
            java.lang.StringBuilder r25 = new java.lang.StringBuilder
            r32 = r24
            r33 = r25
            r24 = r33
            r25 = r32
            r26 = r33
            r32 = r25
            r33 = r26
            r25 = r33
            r26 = r32
            r25.<init>(r26)
            java.lang.String r25 = "GCM-Notification:"
            java.lang.StringBuilder r24 = r24.append(r25)
            r25 = r10
            java.lang.StringBuilder r24 = r24.append(r25)
            java.lang.String r24 = r24.toString()
            r7 = r24
        L_0x042f:
            r24 = r9
            r25 = r7
            r26 = 0
            r27 = r8
            r24.notify(r25, r26, r27)
            r24 = 1
            r3 = r24
            return r3
        L_0x043f:
            r24 = r15
            r0 = r24
            android.content.Context r0 = r0.zzl
            r24 = r0
            r25 = r15
            r0 = r25
            java.util.concurrent.atomic.AtomicInteger r0 = r0.zzn
            r25 = r0
            int r25 = r25.getAndIncrement()
            r26 = r17
            r27 = 1073741824(0x40000000, float:2.0)
            android.app.PendingIntent r24 = android.app.PendingIntent.getActivity(r24, r25, r26, r27)
            goto L_0x02cd
        L_0x045d:
            r24 = r15
            r0 = r24
            android.content.Context r0 = r0.zzl
            r24 = r0
            java.lang.Class<android.app.NotificationManager> r25 = android.app.NotificationManager.class
            java.lang.Object r24 = r24.getSystemService(r25)
            android.app.NotificationManager r24 = (android.app.NotificationManager) r24
            r17 = r24
            r24 = r16
            boolean r24 = android.text.TextUtils.isEmpty(r24)
            if (r24 != 0) goto L_0x04c9
            r24 = r17
            r25 = r16
            android.app.NotificationChannel r24 = r24.getNotificationChannel(r25)
            if (r24 == 0) goto L_0x0485
            r24 = r16
            goto L_0x0300
        L_0x0485:
            java.lang.String r24 = "GcmNotification"
            r25 = 122(0x7a, float:1.71E-43)
            r26 = r16
            java.lang.String r26 = java.lang.String.valueOf(r26)
            int r26 = r26.length()
            int r25 = r25 + r26
            java.lang.StringBuilder r26 = new java.lang.StringBuilder
            r32 = r25
            r33 = r26
            r25 = r33
            r26 = r32
            r27 = r33
            r32 = r26
            r33 = r27
            r26 = r33
            r27 = r32
            r26.<init>(r27)
            java.lang.String r26 = "Notification Channel requested ("
            java.lang.StringBuilder r25 = r25.append(r26)
            r26 = r16
            java.lang.StringBuilder r25 = r25.append(r26)
            java.lang.String r26 = ") has not been created by the app. Manifest configuration, or default, value will be used."
            java.lang.StringBuilder r25 = r25.append(r26)
            java.lang.String r25 = r25.toString()
            int r24 = android.util.Log.w(r24, r25)
        L_0x04c9:
            r24 = r15
            r0 = r24
            java.lang.String r0 = r0.zzm
            r24 = r0
            if (r24 == 0) goto L_0x04dd
            r24 = r15
            r0 = r24
            java.lang.String r0 = r0.zzm
            r24 = r0
            goto L_0x0300
        L_0x04dd:
            r24 = r15
            r25 = r15
            android.os.Bundle r25 = r25.zzf()
            java.lang.String r26 = "com.google.android.gms.gcm.default_notification_channel_id"
            java.lang.String r25 = r25.getString(r26)
            r0 = r25
            r1 = r24
            r1.zzm = r0
            r24 = r15
            r0 = r24
            java.lang.String r0 = r0.zzm
            r24 = r0
            boolean r24 = android.text.TextUtils.isEmpty(r24)
            if (r24 != 0) goto L_0x0567
            r24 = r17
            r25 = r15
            r0 = r25
            java.lang.String r0 = r0.zzm
            r25 = r0
            android.app.NotificationChannel r24 = r24.getNotificationChannel(r25)
            if (r24 == 0) goto L_0x051a
            r24 = r15
            r0 = r24
            java.lang.String r0 = r0.zzm
            r24 = r0
            goto L_0x0300
        L_0x051a:
            java.lang.String r24 = "GcmNotification"
            java.lang.String r25 = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used."
            int r24 = android.util.Log.w(r24, r25)
        L_0x0524:
            r24 = r17
            java.lang.String r25 = "fcm_fallback_notification_channel"
            android.app.NotificationChannel r24 = r24.getNotificationChannel(r25)
            if (r24 != 0) goto L_0x0552
            r24 = r17
            android.app.NotificationChannel r25 = new android.app.NotificationChannel
            r32 = r25
            r25 = r32
            r26 = r32
            java.lang.String r27 = "fcm_fallback_notification_channel"
            r28 = r15
            r0 = r28
            android.content.Context r0 = r0.zzl
            r28 = r0
            int r29 = com.google.android.gms.gcm.R.string.gcm_fallback_notification_channel_label
            java.lang.String r28 = r28.getString(r29)
            r29 = 3
            r26.<init>(r27, r28, r29)
            r24.createNotificationChannel(r25)
        L_0x0552:
            r24 = r15
            java.lang.String r25 = "fcm_fallback_notification_channel"
            r0 = r25
            r1 = r24
            r1.zzm = r0
            r24 = r15
            r0 = r24
            java.lang.String r0 = r0.zzm
            r24 = r0
            goto L_0x0300
        L_0x0567:
            java.lang.String r24 = "GcmNotification"
            java.lang.String r25 = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used."
            int r24 = android.util.Log.w(r24, r25)
            goto L_0x0524
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.gcm.zzd.zze(android.os.Bundle):boolean");
    }

    private final String zze(Bundle bundle, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        StringBuilder sb;
        String str6;
        String str7;
        StringBuilder sb2;
        JSONArray jSONArray;
        String str8;
        String str9;
        StringBuilder sb3;
        Bundle bundle2 = bundle;
        String str10 = str;
        String zzd = zzd(bundle2, str10);
        String str11 = zzd;
        if (!TextUtils.isEmpty(zzd)) {
            return str11;
        }
        Bundle bundle3 = bundle2;
        String valueOf = String.valueOf(str10);
        String valueOf2 = String.valueOf("_loc_key");
        String str12 = valueOf2;
        if (valueOf2.length() != 0) {
            str3 = valueOf.concat(str12);
        } else {
            String str13 = valueOf;
            str3 = str2;
            new String(str13);
        }
        String zzd2 = zzd(bundle3, str3);
        String str14 = zzd2;
        if (TextUtils.isEmpty(zzd2)) {
            return null;
        }
        Resources resources = this.zzl.getResources();
        Resources resources2 = resources;
        int identifier = resources.getIdentifier(str14, "string", this.zzl.getPackageName());
        int i = identifier;
        if (identifier == 0) {
            String valueOf3 = String.valueOf(str10);
            String valueOf4 = String.valueOf("_loc_key");
            String str15 = valueOf4;
            if (valueOf4.length() != 0) {
                str9 = valueOf3.concat(str15);
            } else {
                String str16 = valueOf3;
                str9 = str8;
                new String(str16);
            }
            String str17 = str9;
            String str18 = str17;
            String substring = str17.substring(6);
            new StringBuilder(49 + String.valueOf(substring).length() + String.valueOf(str14).length());
            int w = Log.w("GcmNotification", sb3.append(substring).append(" resource not found: ").append(str14).append(" Default value will be used.").toString());
            return null;
        }
        Bundle bundle4 = bundle2;
        String valueOf5 = String.valueOf(str10);
        String valueOf6 = String.valueOf("_loc_args");
        String str19 = valueOf6;
        if (valueOf6.length() != 0) {
            str5 = valueOf5.concat(str19);
        } else {
            String str20 = valueOf5;
            str5 = str4;
            new String(str20);
        }
        String zzd3 = zzd(bundle4, str5);
        String str21 = zzd3;
        if (TextUtils.isEmpty(zzd3)) {
            return resources2.getString(i);
        }
        try {
            new JSONArray(str21);
            JSONArray jSONArray2 = jSONArray;
            JSONArray jSONArray3 = jSONArray2;
            String[] strArr = new String[jSONArray2.length()];
            for (int i2 = 0; i2 < strArr.length; i2++) {
                strArr[i2] = jSONArray3.opt(i2);
            }
            return resources2.getString(i, strArr);
        } catch (JSONException e) {
            String valueOf7 = String.valueOf(str10);
            String valueOf8 = String.valueOf("_loc_args");
            String str22 = valueOf8;
            if (valueOf8.length() != 0) {
                str7 = valueOf7.concat(str22);
            } else {
                String str23 = valueOf7;
                str7 = str6;
                new String(str23);
            }
            String str24 = str7;
            String str25 = str24;
            String substring2 = str24.substring(6);
            new StringBuilder(41 + String.valueOf(substring2).length() + String.valueOf(str21).length());
            int w2 = Log.w("GcmNotification", sb2.append("Malformed ").append(substring2).append(": ").append(str21).append("  Default value will be used.").toString());
            return null;
        } catch (MissingFormatArgumentException e2) {
            new StringBuilder(58 + String.valueOf(str14).length() + String.valueOf(str21).length());
            int w3 = Log.w("GcmNotification", sb.append("Missing format argument for ").append(str14).append(": ").append(str21).append(" Default value will be used.").toString(), e2);
            return null;
        }
    }

    private final Bundle zzf() {
        ApplicationInfo applicationInfo = null;
        try {
            applicationInfo = this.zzl.getPackageManager().getApplicationInfo(this.zzl.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e) {
        }
        if (applicationInfo == null || applicationInfo.metaData == null) {
            return Bundle.EMPTY;
        }
        return applicationInfo.metaData;
    }
}
