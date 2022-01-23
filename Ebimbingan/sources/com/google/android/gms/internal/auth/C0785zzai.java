package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.C0236Status;

/* renamed from: com.google.android.gms.internal.auth.zzai */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0785zzai extends C0788zzal {
    private final /* synthetic */ C0786zzaj zza;

    C0785zzai(C0786zzaj zzaj) {
        this.zza = zzaj;
    }

    public final void zza(boolean z) {
        C0786zzaj zzaj = this.zza;
        C0789zzam zzam = r6;
        C0789zzam zzam2 = new C0789zzam(z ? C0236Status.RESULT_SUCCESS : C0782zzaf.zza);
        zzaj.setResult(zzam);
    }
}
