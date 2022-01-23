package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;

final class zzj implements Runnable {
    private final /* synthetic */ FirebaseAuth zziy;
    private final /* synthetic */ FirebaseAuth.IdTokenListener zziz;

    zzj(FirebaseAuth firebaseAuth, FirebaseAuth.IdTokenListener idTokenListener) {
        this.zziy = firebaseAuth;
        this.zziz = idTokenListener;
    }

    public final void run() {
        this.zziz.onIdTokenChanged(this.zziy);
    }
}
