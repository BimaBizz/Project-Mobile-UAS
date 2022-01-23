package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.C0236Status;

/* renamed from: com.google.android.gms.internal.auth.zzbw */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0826zzbw extends C0811zzbh {
    private final /* synthetic */ C0827zzbx zza;

    C0826zzbw(C0827zzbx zzbx) {
        this.zza = zzbx;
    }

    public final void zza(String str) {
        C0236Status status;
        C0231Result result;
        String str2 = str;
        if (str2 != null) {
            new C0828zzby(str2);
            this.zza.setResult(result);
            return;
        }
        C0827zzbx zzbx = this.zza;
        new C0236Status(3006);
        zzbx.setResult(C0827zzbx.zza(status));
    }
}
