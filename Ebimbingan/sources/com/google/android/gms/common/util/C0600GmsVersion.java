package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.C0206KeepForSdk;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.util.GmsVersion */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0600GmsVersion {
    @C0206KeepForSdk
    public static final int VERSION_HALLOUMI = 4100000;
    @C0206KeepForSdk
    public static final int VERSION_JARLSBERG = 4300000;
    @C0206KeepForSdk
    public static final int VERSION_KENAFA = 4400000;
    @C0206KeepForSdk
    public static final int VERSION_LONGHORN = 5000000;
    @C0206KeepForSdk
    public static final int VERSION_MANCHEGO = 6000000;
    @C0206KeepForSdk
    public static final int VERSION_ORLA = 7000000;
    @C0206KeepForSdk
    public static final int VERSION_PARMESAN = 7200000;
    @C0206KeepForSdk
    public static final int VERSION_QUESO = 7500000;
    @C0206KeepForSdk
    public static final int VERSION_REBLOCHON = 7800000;
    @C0206KeepForSdk
    public static final int VERSION_SAGA = 8000000;

    private C0600GmsVersion() {
    }

    @C0206KeepForSdk
    public static boolean isAtLeastFenacho(int i) {
        return i >= 3200000;
    }
}
