package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.auth.api.credentials.C0062Credential;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.C0236Status;

/* renamed from: com.google.android.gms.internal.auth-api.zzl  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
final class C0761zzl extends C0757zzh {
    private final /* synthetic */ C0758zzi zzap;

    C0761zzl(C0758zzi zzi) {
        this.zzap = zzi;
    }

    public final void zzc(C0236Status status, C0062Credential credential) {
        C0231Result result;
        new C0756zzg(status, credential);
        this.zzap.setResult(result);
    }

    public final void zzd(C0236Status status) {
        this.zzap.setResult(C0756zzg.zzc(status));
    }
}
