package com.google.firebase.auth.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.firebase_auth.zzcv;
import com.google.android.gms.internal.firebase_auth.zze;
import com.google.android.gms.internal.firebase_auth.zzfe;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.PhoneAuthProvider;

@VisibleForTesting
final class zzdl extends zzen<Void, PhoneAuthProvider.OnVerificationStateChangedCallbacks> {
    private final zzcv zzoq;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdl(zzfe zzfe) {
        super(8);
        zzcv zzcv;
        zzfe zzfe2 = zzfe;
        Object checkNotNull = Preconditions.checkNotNull(zzfe2);
        new zzcv(zzfe2);
        this.zzoq = zzcv;
    }

    public final String zzdu() {
        return "verifyPhoneNumber";
    }

    public final TaskApiCall<zzdp, Void> zzdv() {
        Feature[] featureArr;
        RemoteCall remoteCall;
        TaskApiCall.Builder autoResolveMissingFeatures = TaskApiCall.builder().setAutoResolveMissingFeatures(false);
        if (this.zzqh) {
            featureArr = null;
        } else {
            Feature[] featureArr2 = new Feature[1];
            featureArr = featureArr2;
            featureArr2[0] = zze.zzf;
        }
        new zzdk(this);
        return autoResolveMissingFeatures.setFeatures(featureArr).run(remoteCall).build();
    }

    public final void zzdx() {
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzag(zzdp zzdp, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzel<ResultT> zzel;
        zzdp zzdp2 = zzdp;
        new zzeu(this, taskCompletionSource);
        zzel<ResultT> zzel2 = zzel;
        zzel<ResultT> zzel3 = zzel2;
        this.zzpu = zzel2;
        if (this.zzqh) {
            zzdp2.zzeb().zza(this.zzoq.zzdk(), (zzdu) this.zzpq);
        } else {
            zzdp2.zzeb().zza(this.zzoq, (zzdu) this.zzpq);
        }
    }
}
