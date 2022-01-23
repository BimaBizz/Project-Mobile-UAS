package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;

final class zzi implements Runnable {
    private final /* synthetic */ FirebaseAuth.AuthStateListener zzix;
    private final /* synthetic */ FirebaseAuth zziy;

    zzi(FirebaseAuth firebaseAuth, FirebaseAuth.AuthStateListener authStateListener) {
        this.zziy = firebaseAuth;
        this.zzix = authStateListener;
    }

    public final void run() {
        this.zzix.onAuthStateChanged(this.zziy);
    }
}
