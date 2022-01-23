package com.google.android.gms.internal.common;

import android.os.Build;

/* renamed from: com.google.android.gms.internal.common.zzi */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C1115zzi {
    private static volatile boolean zza = (!zza());

    public static boolean zza() {
        return Build.VERSION.SDK_INT >= 24;
    }
}
