package com.google.firebase.auth.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.PhoneAuthProvider;

final class zzet implements zzev {
    private final /* synthetic */ Status zzqr;

    zzet(zzep zzep, Status status) {
        zzep zzep2 = zzep;
        this.zzqr = status;
    }

    public final void zza(PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Object... objArr) {
        Object[] objArr2 = objArr;
        onVerificationStateChangedCallbacks.onVerificationFailed(zzdr.zzb(this.zzqr));
    }
}
