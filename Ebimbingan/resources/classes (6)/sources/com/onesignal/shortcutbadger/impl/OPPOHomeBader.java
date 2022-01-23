package com.onesignal.shortcutbadger.impl;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.onesignal.shortcutbadger.Badger;
import com.onesignal.shortcutbadger.ShortcutBadgeException;
import com.onesignal.shortcutbadger.util.BroadcastHelper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

public class OPPOHomeBader implements Badger {
    private static final String INTENT_ACTION = "com.oppo.unsettledevent";
    private static final String INTENT_EXTRA_BADGEUPGRADE_COUNT = "app_badge_count";
    private static final String INTENT_EXTRA_BADGE_COUNT = "number";
    private static final String INTENT_EXTRA_BADGE_UPGRADENUMBER = "upgradeNumber";
    private static final String INTENT_EXTRA_PACKAGENAME = "pakeageName";
    private static final String PROVIDER_CONTENT_URI = "content://com.android.badge/badge";
    private static int ROMVERSION = -1;

    public OPPOHomeBader() {
    }

    @TargetApi(11)
    public void executeBadge(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        Intent intent;
        Throwable th;
        StringBuilder sb;
        Bundle bundle;
        Context context2 = context;
        ComponentName componentName2 = componentName;
        int badgeCount = i;
        if (badgeCount == 0) {
            badgeCount = -1;
        }
        new Intent(INTENT_ACTION);
        Intent intent2 = intent;
        Intent putExtra = intent2.putExtra(INTENT_EXTRA_PACKAGENAME, componentName2.getPackageName());
        Intent putExtra2 = intent2.putExtra(INTENT_EXTRA_BADGE_COUNT, badgeCount);
        Intent putExtra3 = intent2.putExtra(INTENT_EXTRA_BADGE_UPGRADENUMBER, badgeCount);
        if (BroadcastHelper.canResolveBroadcast(context2, intent2)) {
            context2.sendBroadcast(intent2);
        } else if (getSupportVersion() == 6) {
            try {
                new Bundle();
                Bundle extras = bundle;
                extras.putInt(INTENT_EXTRA_BADGEUPGRADE_COUNT, badgeCount);
                Bundle call = context2.getContentResolver().call(Uri.parse(PROVIDER_CONTENT_URI), "setAppBadgeCount", (String) null, extras);
            } catch (Throwable th2) {
                Throwable th3 = th2;
                Throwable th4 = th;
                new StringBuilder();
                new ShortcutBadgeException(sb.append("unable to resolve intent: ").append(intent2.toString()).toString());
                throw th4;
            }
        }
    }

    public List<String> getSupportLaunchers() {
        return Collections.singletonList("com.oppo.launcher");
    }

    private int getSupportVersion() {
        int i = ROMVERSION;
        if (i >= 0) {
            return ROMVERSION;
        }
        try {
            i = ((Integer) executeClassLoad(getClass("com.color.os.ColorBuild"), "getColorOSVERSION", (Class[]) null, (Object[]) null)).intValue();
        } catch (Exception e) {
            Exception exc = e;
            i = 0;
        }
        if (i == 0) {
            try {
                String str = getSystemProperty("ro.build.version.opporom");
                if (str.startsWith("V1.4")) {
                    return 3;
                }
                if (str.startsWith("V2.0")) {
                    return 4;
                }
                if (str.startsWith("V2.1")) {
                    return 5;
                }
            } catch (Exception e2) {
                Exception exc2 = e2;
            }
        }
        ROMVERSION = i;
        return ROMVERSION;
    }

    private Object executeClassLoad(Class cls, String str, Class[] clsArr, Object[] objArr) {
        Method method;
        Class cls2 = cls;
        String str2 = str;
        Class[] clsArr2 = clsArr;
        Object[] objArr2 = objArr;
        Object obj = null;
        if (!(cls2 == null || checkObjExists(str2) || (method = getMethod(cls2, str2, clsArr2)) == null)) {
            method.setAccessible(true);
            try {
                obj = method.invoke((Object) null, objArr2);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }
        return obj;
    }

    private Method getMethod(Class cls, String str, Class[] clsArr) {
        Class cls2 = cls;
        String str2 = str;
        Class[] clsArr2 = clsArr;
        if (cls2 == null || checkObjExists(str2)) {
            return null;
        }
        try {
            Method[] methods = cls2.getMethods();
            Method[] declaredMethods = cls2.getDeclaredMethods();
            return cls2.getDeclaredMethod(str2, clsArr2);
        } catch (Exception e) {
            Exception exc = e;
            try {
                return cls2.getMethod(str2, clsArr2);
            } catch (Exception e2) {
                Exception exc2 = e2;
                return cls2.getSuperclass() != null ? getMethod(cls2.getSuperclass(), str2, clsArr2) : null;
            }
        }
    }

    private Class getClass(String str) {
        Class cls = null;
        try {
            cls = Class.forName(str);
        } catch (ClassNotFoundException e) {
            ClassNotFoundException classNotFoundException = e;
        }
        return cls;
    }

    private boolean checkObjExists(Object obj) {
        Object obj2 = obj;
        return obj2 == null || obj2.toString().equals("") || obj2.toString().trim().equals("null");
    }

    /* JADX WARNING: type inference failed for: r7v12, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r7v14, types: [java.io.BufferedReader] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String getSystemProperty(java.lang.String r14) {
        /*
            r13 = this;
            r0 = r13
            r1 = r14
            r7 = 0
            r3 = r7
            java.lang.Runtime r7 = java.lang.Runtime.getRuntime()     // Catch:{ IOException -> 0x004e, all -> 0x0059 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x004e, all -> 0x0059 }
            r12 = r8
            r8 = r12
            r9 = r12
            r9.<init>()     // Catch:{ IOException -> 0x004e, all -> 0x0059 }
            java.lang.String r9 = "getprop "
            java.lang.StringBuilder r8 = r8.append(r9)     // Catch:{ IOException -> 0x004e, all -> 0x0059 }
            r9 = r1
            java.lang.StringBuilder r8 = r8.append(r9)     // Catch:{ IOException -> 0x004e, all -> 0x0059 }
            java.lang.String r8 = r8.toString()     // Catch:{ IOException -> 0x004e, all -> 0x0059 }
            java.lang.Process r7 = r7.exec(r8)     // Catch:{ IOException -> 0x004e, all -> 0x0059 }
            r4 = r7
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ IOException -> 0x004e, all -> 0x0059 }
            r12 = r7
            r7 = r12
            r8 = r12
            java.io.InputStreamReader r9 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x004e, all -> 0x0059 }
            r12 = r9
            r9 = r12
            r10 = r12
            r11 = r4
            java.io.InputStream r11 = r11.getInputStream()     // Catch:{ IOException -> 0x004e, all -> 0x0059 }
            r10.<init>(r11)     // Catch:{ IOException -> 0x004e, all -> 0x0059 }
            r10 = 1024(0x400, float:1.435E-42)
            r8.<init>(r9, r10)     // Catch:{ IOException -> 0x004e, all -> 0x0059 }
            r3 = r7
            r7 = r3
            java.lang.String r7 = r7.readLine()     // Catch:{ IOException -> 0x004e, all -> 0x0059 }
            r2 = r7
            r7 = r3
            r7.close()     // Catch:{ IOException -> 0x004e, all -> 0x0059 }
            r7 = r3
            com.onesignal.shortcutbadger.util.CloseHelper.closeQuietly(r7)
            r7 = r2
            r0 = r7
        L_0x004d:
            return r0
        L_0x004e:
            r7 = move-exception
            r4 = r7
            r7 = 0
            r5 = r7
            r7 = r3
            com.onesignal.shortcutbadger.util.CloseHelper.closeQuietly(r7)
            r7 = r5
            r0 = r7
            goto L_0x004d
        L_0x0059:
            r7 = move-exception
            r6 = r7
            r7 = r3
            com.onesignal.shortcutbadger.util.CloseHelper.closeQuietly(r7)
            r7 = r6
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.shortcutbadger.impl.OPPOHomeBader.getSystemProperty(java.lang.String):java.lang.String");
    }
}
