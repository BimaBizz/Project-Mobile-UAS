package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.internal.C0452ShowFirstParty;

@C0452ShowFirstParty
@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.util.Clock */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public interface C0592Clock {
    @C0206KeepForSdk
    long currentThreadTimeMillis();

    @C0206KeepForSdk
    long currentTimeMillis();

    @C0206KeepForSdk
    long elapsedRealtime();

    @C0206KeepForSdk
    long nanoTime();
}
