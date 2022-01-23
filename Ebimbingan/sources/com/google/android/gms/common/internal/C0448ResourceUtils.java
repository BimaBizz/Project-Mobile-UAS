package com.google.android.gms.common.internal;

import android.net.Uri;
import com.google.android.gms.common.annotation.C0206KeepForSdk;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.internal.ResourceUtils */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0448ResourceUtils {
    private static final Uri zza;

    static {
        Uri.Builder builder;
        new Uri.Builder();
        zza = builder.scheme("android.resource").authority("com.google.android.gms").appendPath("drawable").build();
    }

    private C0448ResourceUtils() {
    }
}
