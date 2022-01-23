package com.google.firebase.auth.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.firebase_auth.zzdt;
import com.google.android.gms.internal.firebase_auth.zze;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.internal.zza;
import com.google.firebase.auth.internal.zzg;
import com.google.firebase.auth.internal.zzm;

@VisibleForTesting
final class zzcz extends zzen<AuthResult, zza> {
    private String zzks;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzcz(String str) {
        super(2);
        this.zzks = Preconditions.checkNotEmpty(str, "provider cannot be null or empty");
    }

    public final String zzdu() {
        return "unlinkFederatedCredential";
    }

    public final TaskApiCall<zzdp, AuthResult> zzdv() {
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
        new zzcy(this);
        return autoResolveMissingFeatures.setFeatures(featureArr).run(remoteCall).build();
    }

    public final void zzdx() {
        Object obj;
        zzm zza = zzap.zza(this.zzik, this.zzpz);
        ((zza) this.zzps).zza(this.zzpy, zza);
        new zzg(zza);
        zzc(obj);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzaa(zzdp zzdp, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzel<ResultT> zzel;
        zzdt zzdt;
        zzdp zzdp2 = zzdp;
        new zzeu(this, taskCompletionSource);
        zzel<ResultT> zzel2 = zzel;
        zzel<ResultT> zzel3 = zzel2;
        this.zzpu = zzel2;
        if (this.zzqh) {
            zzdp2.zzeb().zze(this.zzks, this.zzpr.zzcz(), this.zzpq);
            return;
        }
        new zzdt(this.zzks, this.zzpr.zzcz());
        zzdp2.zzeb().zza(zzdt, (zzdu) this.zzpq);
    }
}
