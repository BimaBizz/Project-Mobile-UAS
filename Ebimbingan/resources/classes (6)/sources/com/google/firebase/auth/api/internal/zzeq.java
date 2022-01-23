package com.google.firebase.auth.api.internal;

import com.google.firebase.auth.PhoneAuthProvider;

final class zzeq implements zzev {
    private final /* synthetic */ String zzqm;

    zzeq(zzep zzep, String str) {
        zzep zzep2 = zzep;
        this.zzqm = str;
    }

    public final void zza(PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Object... objArr) {
        Object[] objArr2 = objArr;
        onVerificationStateChangedCallbacks.onCodeAutoRetrievalTimeOut(this.zzqm);
    }
}
