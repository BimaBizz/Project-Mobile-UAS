package com.google.firebase.auth.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.firebase_auth.zzcn;
import com.google.android.gms.internal.firebase_auth.zze;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.internal.zza;

@VisibleForTesting
final class zzdf extends zzen<Void, zza> {
    private final PhoneAuthCredential zzkj;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdf(PhoneAuthCredential phoneAuthCredential) {
        super(2);
        this.zzkj = (PhoneAuthCredential) Preconditions.checkNotNull(phoneAuthCredential);
    }

    public final String zzdu() {
        return "updatePhoneNumber";
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
        new zzde(this);
        return autoResolveMissingFeatures.setFeatures(featureArr).run(remoteCall).build();
    }

    public final void zzdx() {
        ((zza) this.zzps).zza(this.zzpy, zzap.zza(this.zzik, this.zzpz));
        zzc(null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzad(zzdp zzdp, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzel<ResultT> zzel;
        zzcn zzcn;
        zzdp zzdp2 = zzdp;
        new zzeu(this, taskCompletionSource);
        zzel<ResultT> zzel2 = zzel;
        zzel<ResultT> zzel3 = zzel2;
        this.zzpu = zzel2;
        if (this.zzqh) {
            zzdp2.zzeb().zza(this.zzpr.zzcz(), this.zzkj, (zzdu) this.zzpq);
            return;
        }
        new zzcn(this.zzpr.zzcz(), this.zzkj);
        zzdp2.zzeb().zza(zzcn, (zzdu) this.zzpq);
    }
}
