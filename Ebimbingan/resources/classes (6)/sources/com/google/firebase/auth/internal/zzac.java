package com.google.firebase.auth.internal;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.VisibleForTesting;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.internal.firebase_auth.zzfm;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.zzf;

public final class zzac {
    private static zzac zzue;
    private boolean zzud = false;

    private zzac() {
    }

    public static zzac zzfk() {
        zzac zzac;
        if (zzue == null) {
            new zzac();
            zzue = zzac;
        }
        return zzue;
    }

    public final boolean zza(Activity activity, TaskCompletionSource<AuthResult> taskCompletionSource, FirebaseAuth firebaseAuth) {
        return zza(activity, taskCompletionSource, firebaseAuth, (FirebaseUser) null);
    }

    public final boolean zza(Activity activity, TaskCompletionSource<AuthResult> taskCompletionSource, FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        BroadcastReceiver broadcastReceiver;
        IntentFilter intentFilter;
        Activity activity2 = activity;
        TaskCompletionSource<AuthResult> taskCompletionSource2 = taskCompletionSource;
        FirebaseAuth firebaseAuth2 = firebaseAuth;
        FirebaseUser firebaseUser2 = firebaseUser;
        if (this.zzud) {
            return false;
        }
        FirebaseAuth firebaseAuth3 = firebaseAuth2;
        Activity activity3 = activity2;
        new zzah(this, activity3, taskCompletionSource2, firebaseAuth3, firebaseUser2);
        new IntentFilter("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        LocalBroadcastManager.getInstance(activity3).registerReceiver(broadcastReceiver, intentFilter);
        this.zzud = true;
        return true;
    }

    /* access modifiers changed from: private */
    public final void zza(Intent intent, TaskCompletionSource<AuthResult> taskCompletionSource, FirebaseAuth firebaseAuth) {
        OnSuccessListener onSuccessListener;
        OnFailureListener onFailureListener;
        TaskCompletionSource<AuthResult> taskCompletionSource2 = taskCompletionSource;
        AuthCredential zza = zza(intent);
        new zzae(this, taskCompletionSource2);
        new zzab(this, taskCompletionSource2);
        Task addOnFailureListener = firebaseAuth.signInWithCredential(zza).addOnSuccessListener(onSuccessListener).addOnFailureListener(onFailureListener);
    }

    /* access modifiers changed from: private */
    public final void zza(Intent intent, TaskCompletionSource<AuthResult> taskCompletionSource, FirebaseUser firebaseUser) {
        OnSuccessListener onSuccessListener;
        OnFailureListener onFailureListener;
        TaskCompletionSource<AuthResult> taskCompletionSource2 = taskCompletionSource;
        AuthCredential zza = zza(intent);
        new zzag(this, taskCompletionSource2);
        new zzad(this, taskCompletionSource2);
        Task addOnFailureListener = firebaseUser.linkWithCredential(zza).addOnSuccessListener(onSuccessListener).addOnFailureListener(onFailureListener);
    }

    /* access modifiers changed from: private */
    public final void zzb(Intent intent, TaskCompletionSource<AuthResult> taskCompletionSource, FirebaseUser firebaseUser) {
        OnSuccessListener onSuccessListener;
        OnFailureListener onFailureListener;
        TaskCompletionSource<AuthResult> taskCompletionSource2 = taskCompletionSource;
        AuthCredential zza = zza(intent);
        new zzai(this, taskCompletionSource2);
        new zzaf(this, taskCompletionSource2);
        Task addOnFailureListener = firebaseUser.reauthenticateAndRetrieveData(zza).addOnSuccessListener(onSuccessListener).addOnFailureListener(onFailureListener);
    }

    private static AuthCredential zza(Intent intent) {
        Intent intent2 = intent;
        Object checkNotNull = Preconditions.checkNotNull(intent2);
        return zzf.zza(SafeParcelableSerializer.deserializeFromIntentExtra(intent2, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", zzfm.CREATOR).zzq(true));
    }

    @VisibleForTesting
    static void zzfl() {
        zzue.zzud = false;
    }
}
