package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.C0236Status;

/* renamed from: com.google.android.gms.internal.auth.zzam */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0789zzam implements C0231Result {
    private final C0236Status zza;

    public C0789zzam(C0236Status status) {
        this.zza = status;
    }

    public final C0236Status getStatus() {
        return this.zza;
    }
}
