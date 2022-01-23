package com.google.firebase.auth.api.internal;

import com.google.firebase.auth.PhoneAuthProvider;

final class zzeo implements zzev {
    private final /* synthetic */ String zzqm;

    zzeo(zzep zzep, String str) {
        zzep zzep2 = zzep;
        this.zzqm = str;
    }

    public final void zza(PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Object... objArr) {
        Object[] objArr2 = objArr;
        onVerificationStateChangedCallbacks.onCodeSent(this.zzqm, PhoneAuthProvider.ForceResendingToken.zzdd());
    }
}
