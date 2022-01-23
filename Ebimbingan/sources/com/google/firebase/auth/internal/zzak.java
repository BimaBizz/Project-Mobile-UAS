package com.google.firebase.auth.internal;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public final class zzak {
    private static final zzak zzuo;
    private final zzaq zzum;
    private final zzac zzun;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private zzak() {
        this(zzaq.zzfp(), zzac.zzfk());
    }

    @VisibleForTesting
    private zzak(zzaq zzaq, zzac zzac) {
        this.zzum = zzaq;
        this.zzun = zzac;
    }

    public static zzak zzfn() {
        return zzuo;
    }

    public final Task<AuthResult> zzfo() {
        return this.zzum.zzfo();
    }

    public final void zzf(FirebaseAuth firebaseAuth) {
        this.zzum.zzg(firebaseAuth);
    }

    public final void zza(Context context) {
        this.zzum.zza(context);
    }

    public final boolean zza(Activity activity, TaskCompletionSource<AuthResult> taskCompletionSource, FirebaseAuth firebaseAuth) {
        return this.zzun.zza(activity, taskCompletionSource, firebaseAuth);
    }

    public final boolean zza(Activity activity, TaskCompletionSource<AuthResult> taskCompletionSource, FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        return this.zzun.zza(activity, taskCompletionSource, firebaseAuth, firebaseUser);
    }

    static {
        zzak zzak;
        new zzak();
        zzuo = zzak;
    }
}
