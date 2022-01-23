package com.google.firebase.auth.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.GetTokenResult;

final class zzy implements Runnable {
    private final String zztj;
    final /* synthetic */ zzv zzub;

    zzy(zzv zzv, String str) {
        this.zzub = zzv;
        this.zztj = Preconditions.checkNotEmpty(str);
    }

    public final void run() {
        OnFailureListener onFailureListener;
        FirebaseApp instance = FirebaseApp.getInstance(this.zztj);
        FirebaseAuth instance2 = FirebaseAuth.getInstance(instance);
        zzal.initialize(instance.getApplicationContext());
        boolean z = true;
        try {
            z = ((Boolean) zzal.zzup.get()).booleanValue();
        } catch (SecurityException e) {
        }
        if (instance2.getCurrentUser() != null && z) {
            Task<GetTokenResult> accessToken = instance2.getAccessToken(true);
            zzv.zzjt.v("Token refreshing started", new Object[0]);
            new zzx(this);
            Task addOnFailureListener = accessToken.addOnFailureListener(onFailureListener);
        }
    }
}
