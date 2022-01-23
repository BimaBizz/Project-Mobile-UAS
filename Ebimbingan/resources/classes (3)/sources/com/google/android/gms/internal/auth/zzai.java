package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzai extends zzal {
    private final /* synthetic */ zzaj zza;

    zzai(zzaj zzaj) {
        this.zza = zzaj;
    }

    public final void zza(boolean z) {
        zzaj zzaj = this.zza;
        zzam zzam = r6;
        zzam zzam2 = new zzam(z ? Status.RESULT_SUCCESS : zzaf.zza);
        zzaj.setResult(zzam);
    }
}
