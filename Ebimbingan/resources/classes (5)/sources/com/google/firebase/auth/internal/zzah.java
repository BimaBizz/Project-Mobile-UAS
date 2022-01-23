package com.google.firebase.auth.internal;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.api.internal.zzdr;
import java.lang.ref.WeakReference;

final class zzah extends BroadcastReceiver {
    private final FirebaseAuth zzjr;
    private final FirebaseUser zzpr;
    private final WeakReference<Activity> zzuf;
    private final TaskCompletionSource<AuthResult> zzug;
    private final /* synthetic */ zzac zzuh;

    zzah(zzac zzac, Activity activity, TaskCompletionSource<AuthResult> taskCompletionSource, FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        WeakReference<Activity> weakReference;
        this.zzuh = zzac;
        new WeakReference<>(activity);
        this.zzuf = weakReference;
        this.zzug = taskCompletionSource;
        this.zzjr = firebaseAuth;
        this.zzpr = firebaseUser;
    }

    public final void onReceive(Context context, Intent intent) {
        StringBuilder sb;
        Status status;
        Context context2 = context;
        Intent intent2 = intent;
        Activity activity = (Activity) this.zzuf.get();
        Activity activity2 = activity;
        if (activity == null) {
            int e = Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
            TaskCompletionSource<AuthResult> taskCompletionSource = this.zzug;
            new Status(FirebaseError.ERROR_INTERNAL_ERROR, "Activity that started the web operation is no longer alive; see logcat for details");
            taskCompletionSource.setException(zzdr.zzb(status));
            zzac.zzfl();
            return;
        }
        LocalBroadcastManager.getInstance(activity2).unregisterReceiver(this);
        if (intent2.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
            String stringExtra = intent2.getStringExtra("com.google.firebase.auth.internal.OPERATION");
            if ("com.google.firebase.auth.internal.SIGN_IN".equals(stringExtra)) {
                this.zzuh.zza(intent2, this.zzug, this.zzjr);
            } else if ("com.google.firebase.auth.internal.LINK".equals(stringExtra)) {
                this.zzuh.zza(intent2, this.zzug, this.zzpr);
            } else if ("com.google.firebase.auth.internal.REAUTHENTICATE".equals(stringExtra)) {
                this.zzuh.zzb(intent2, this.zzug, this.zzpr);
            } else {
                TaskCompletionSource<AuthResult> taskCompletionSource2 = this.zzug;
                new StringBuilder(50 + String.valueOf(stringExtra).length());
                taskCompletionSource2.setException(zzdr.zzb(zzt.zzdc(sb.append("WEB_CONTEXT_CANCELED:Unknown operation received (").append(stringExtra).append(")").toString())));
            }
        } else if (zzaw.zzb(intent2)) {
            this.zzug.setException(zzdr.zzb(zzaw.zzc(intent2)));
            zzac.zzfl();
        } else if (intent2.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
            this.zzug.setException(zzdr.zzb(zzt.zzdc("WEB_CONTEXT_CANCELED")));
            zzac.zzfl();
        }
    }
}
