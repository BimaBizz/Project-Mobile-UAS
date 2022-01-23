package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzan implements Result {
    private final Status zza;

    public zzan(Status status) {
        this.zza = status;
    }

    public final Status getStatus() {
        return this.zza;
    }
}
