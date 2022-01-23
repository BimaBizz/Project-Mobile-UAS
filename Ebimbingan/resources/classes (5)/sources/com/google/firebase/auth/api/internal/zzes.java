package com.google.firebase.auth.api.internal;

import com.google.firebase.auth.PhoneAuthProvider;
import java.util.List;

final class zzes implements Runnable {
    private final /* synthetic */ zzev zzqp;
    private final /* synthetic */ zzep zzqq;

    zzes(zzep zzep, zzev zzev) {
        this.zzqq = zzep;
        this.zzqp = zzev;
    }

    public final void run() {
        List<PhoneAuthProvider.OnVerificationStateChangedCallbacks> list = this.zzqq.zzqn.zzpv;
        List<PhoneAuthProvider.OnVerificationStateChangedCallbacks> list2 = list;
        synchronized (list) {
            try {
                if (!this.zzqq.zzqn.zzpv.isEmpty()) {
                    this.zzqp.zza(this.zzqq.zzqn.zzpv.get(0), new Object[0]);
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                List<PhoneAuthProvider.OnVerificationStateChangedCallbacks> list3 = list2;
                throw th2;
            }
        }
    }
}
