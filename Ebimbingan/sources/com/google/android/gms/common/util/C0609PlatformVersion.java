package com.google.android.gms.common.util;

import android.os.Build;
import com.google.android.gms.common.annotation.C0206KeepForSdk;

@C0206KeepForSdk
@C0617VisibleForTesting
/* renamed from: com.google.android.gms.common.util.PlatformVersion */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0609PlatformVersion {
    private C0609PlatformVersion() {
    }

    @C0206KeepForSdk
    public static boolean isAtLeastHoneycomb() {
        return true;
    }

    @C0206KeepForSdk
    public static boolean isAtLeastHoneycombMR1() {
        return true;
    }

    @C0206KeepForSdk
    public static boolean isAtLeastIceCreamSandwich() {
        return true;
    }

    @C0206KeepForSdk
    public static boolean isAtLeastIceCreamSandwichMR1() {
        return Build.VERSION.SDK_INT >= 15;
    }

    @C0206KeepForSdk
    public static boolean isAtLeastJellyBean() {
        return Build.VERSION.SDK_INT >= 16;
    }

    @C0206KeepForSdk
    public static boolean isAtLeastJellyBeanMR1() {
        return Build.VERSION.SDK_INT >= 17;
    }

    @C0206KeepForSdk
    public static boolean isAtLeastJellyBeanMR2() {
        return Build.VERSION.SDK_INT >= 18;
    }

    @C0206KeepForSdk
    public static boolean isAtLeastKitKat() {
        return Build.VERSION.SDK_INT >= 19;
    }

    @C0206KeepForSdk
    public static boolean isAtLeastKitKatWatch() {
        return Build.VERSION.SDK_INT >= 20;
    }

    @C0206KeepForSdk
    public static boolean isAtLeastLollipop() {
        return Build.VERSION.SDK_INT >= 21;
    }

    @C0206KeepForSdk
    public static boolean isAtLeastLollipopMR1() {
        return Build.VERSION.SDK_INT >= 22;
    }

    @C0206KeepForSdk
    public static boolean isAtLeastM() {
        return Build.VERSION.SDK_INT >= 23;
    }

    @C0206KeepForSdk
    public static boolean isAtLeastN() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @C0206KeepForSdk
    public static boolean isAtLeastO() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @C0206KeepForSdk
    public static boolean isAtLeastP() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @C0206KeepForSdk
    public static boolean isAtLeastQ() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @C0206KeepForSdk
    public static boolean isAtLeastR() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @C0206KeepForSdk
    public static boolean isAtLeastS() {
        return isAtLeastR() && Build.VERSION.CODENAME.length() == 1 && Build.VERSION.CODENAME.charAt(0) >= 'S' && Build.VERSION.CODENAME.charAt(0) <= 'Z';
    }
}
