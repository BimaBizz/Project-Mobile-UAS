package com.onesignal.shortcutbadger;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import com.onesignal.shortcutbadger.impl.AdwHomeBadger;
import com.onesignal.shortcutbadger.impl.ApexHomeBadger;
import com.onesignal.shortcutbadger.impl.AsusHomeBadger;
import com.onesignal.shortcutbadger.impl.DefaultBadger;
import com.onesignal.shortcutbadger.impl.EverythingMeHomeBadger;
import com.onesignal.shortcutbadger.impl.HuaweiHomeBadger;
import com.onesignal.shortcutbadger.impl.NewHtcHomeBadger;
import com.onesignal.shortcutbadger.impl.NovaHomeBadger;
import com.onesignal.shortcutbadger.impl.OPPOHomeBader;
import com.onesignal.shortcutbadger.impl.SamsungHomeBadger;
import com.onesignal.shortcutbadger.impl.SonyHomeBadger;
import com.onesignal.shortcutbadger.impl.VivoHomeBadger;
import com.onesignal.shortcutbadger.impl.ZukHomeBadger;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ShortcutBadger {
    private static final List<Class<? extends Badger>> BADGERS;
    private static final String LOG_TAG = "ShortcutBadger";
    private static final int SUPPORTED_CHECK_ATTEMPTS = 3;
    private static ComponentName sComponentName;
    private static final Object sCounterSupportedLock;
    private static volatile Boolean sIsBadgeCounterSupported;
    private static Badger sShortcutBadger;

    static {
        List<Class<? extends Badger>> list;
        Object obj;
        new LinkedList();
        BADGERS = list;
        new Object();
        sCounterSupportedLock = obj;
        boolean add = BADGERS.add(AdwHomeBadger.class);
        boolean add2 = BADGERS.add(ApexHomeBadger.class);
        boolean add3 = BADGERS.add(NewHtcHomeBadger.class);
        boolean add4 = BADGERS.add(NovaHomeBadger.class);
        boolean add5 = BADGERS.add(SonyHomeBadger.class);
        boolean add6 = BADGERS.add(AsusHomeBadger.class);
        boolean add7 = BADGERS.add(HuaweiHomeBadger.class);
        boolean add8 = BADGERS.add(OPPOHomeBader.class);
        boolean add9 = BADGERS.add(SamsungHomeBadger.class);
        boolean add10 = BADGERS.add(ZukHomeBadger.class);
        boolean add11 = BADGERS.add(VivoHomeBadger.class);
        boolean add12 = BADGERS.add(EverythingMeHomeBadger.class);
    }

    public static boolean applyCount(Context context, int badgeCount) {
        try {
            applyCountOrThrow(context, badgeCount);
            return true;
        } catch (ShortcutBadgeException e) {
            ShortcutBadgeException e2 = e;
            if (Log.isLoggable(LOG_TAG, 3)) {
                int d = Log.d(LOG_TAG, "Unable to execute badge", e2);
            }
            return false;
        }
    }

    public static void applyCountOrThrow(Context context, int i) throws ShortcutBadgeException {
        Throwable th;
        Throwable th2;
        Context context2 = context;
        int badgeCount = i;
        if (sShortcutBadger != null || initBadger(context2)) {
            try {
                sShortcutBadger.executeBadge(context2, sComponentName, badgeCount);
            } catch (Exception e) {
                Exception e2 = e;
                Throwable th3 = th;
                new ShortcutBadgeException("Unable to execute badge", e2);
                throw th3;
            }
        } else {
            Throwable th4 = th2;
            new ShortcutBadgeException("No default launcher available");
            throw th4;
        }
    }

    public static boolean removeCount(Context context) {
        return applyCount(context, 0);
    }

    public static void removeCountOrThrow(Context context) throws ShortcutBadgeException {
        applyCountOrThrow(context, 0);
    }

    public static boolean isBadgeCounterSupported(Context context) {
        String lastErrorMessage;
        StringBuilder sb;
        StringBuilder sb2;
        Context context2 = context;
        if (sIsBadgeCounterSupported == null) {
            Object obj = sCounterSupportedLock;
            Object obj2 = obj;
            synchronized (obj) {
                try {
                    if (sIsBadgeCounterSupported == null) {
                        lastErrorMessage = null;
                        int i = 0;
                        while (true) {
                            if (i < 3) {
                                new StringBuilder();
                                StringBuilder append = sb2.append("Checking if platform supports badge counters, attempt ");
                                Object[] objArr = new Object[2];
                                objArr[0] = Integer.valueOf(i + 1);
                                Object[] objArr2 = objArr;
                                objArr2[1] = 3;
                                int i2 = Log.i(LOG_TAG, append.append(String.format("%d/%d.", objArr2)).toString());
                                if (initBadger(context2)) {
                                    sShortcutBadger.executeBadge(context2, sComponentName, 0);
                                    sIsBadgeCounterSupported = true;
                                    int i3 = Log.i(LOG_TAG, "Badge counter is supported in this platform.");
                                    break;
                                }
                                lastErrorMessage = "Failed to initialize the badge counter.";
                                i++;
                            }
                        }
                        if (sIsBadgeCounterSupported == null) {
                            new StringBuilder();
                            int w = Log.w(LOG_TAG, sb.append("Badge counter seems not supported for this platform: ").append(lastErrorMessage).toString());
                            sIsBadgeCounterSupported = false;
                        }
                    }
                } catch (Exception e) {
                    lastErrorMessage = e.getMessage();
                } catch (Throwable th) {
                    Throwable th2 = th;
                    Object obj3 = obj2;
                    throw th2;
                }
            }
        }
        return sIsBadgeCounterSupported.booleanValue();
    }

    public static void applyNotification(Context context, Notification notification, int i) {
        Context context2 = context;
        Notification notification2 = notification;
        int badgeCount = i;
        if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
            try {
                Object extraNotification = notification2.getClass().getDeclaredField("extraNotification").get(notification2);
                Class[] clsArr = {Integer.TYPE};
                Object invoke = extraNotification.getClass().getDeclaredMethod("setMessageCount", clsArr).invoke(extraNotification, new Object[]{Integer.valueOf(badgeCount)});
            } catch (Exception e) {
                Exception e2 = e;
                if (Log.isLoggable(LOG_TAG, 3)) {
                    int d = Log.d(LOG_TAG, "Unable to execute badge", e2);
                }
            }
        }
    }

    private static boolean initBadger(Context context) {
        Intent intent;
        Badger badger;
        Badger badger2;
        Badger badger3;
        Badger badger4;
        StringBuilder sb;
        Context context2 = context;
        Intent launchIntent = context2.getPackageManager().getLaunchIntentForPackage(context2.getPackageName());
        if (launchIntent == null) {
            new StringBuilder();
            int e = Log.e(LOG_TAG, sb.append("Unable to find launch intent for package ").append(context2.getPackageName()).toString());
            return false;
        }
        sComponentName = launchIntent.getComponent();
        new Intent("android.intent.action.MAIN");
        Intent intent2 = intent;
        Intent addCategory = intent2.addCategory("android.intent.category.HOME");
        ResolveInfo resolveInfo = context2.getPackageManager().resolveActivity(intent2, 65536);
        if (resolveInfo == null || resolveInfo.activityInfo.name.toLowerCase().contains("resolver")) {
            return false;
        }
        String currentHomePackage = resolveInfo.activityInfo.packageName;
        Iterator<Class<? extends Badger>> it = BADGERS.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Badger shortcutBadger = null;
            try {
                shortcutBadger = (Badger) it.next().newInstance();
            } catch (Exception e2) {
                Exception exc = e2;
            }
            if (shortcutBadger != null && shortcutBadger.getSupportLaunchers().contains(currentHomePackage)) {
                sShortcutBadger = shortcutBadger;
                break;
            }
        }
        if (sShortcutBadger == null) {
            if (Build.MANUFACTURER.equalsIgnoreCase("ZUK")) {
                new ZukHomeBadger();
                sShortcutBadger = badger4;
            } else if (Build.MANUFACTURER.equalsIgnoreCase("OPPO")) {
                new OPPOHomeBader();
                sShortcutBadger = badger3;
            } else if (Build.MANUFACTURER.equalsIgnoreCase("VIVO")) {
                new VivoHomeBadger();
                sShortcutBadger = badger2;
            } else {
                new DefaultBadger();
                sShortcutBadger = badger;
            }
        }
        return true;
    }

    private ShortcutBadger() {
    }
}
