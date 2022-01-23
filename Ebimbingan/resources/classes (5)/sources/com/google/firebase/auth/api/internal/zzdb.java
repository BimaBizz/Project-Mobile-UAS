package com.google.firebase.auth.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.firebase_auth.zzbp;
import com.google.android.gms.internal.firebase_auth.zze;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.zza;

@VisibleForTesting
final class zzdb extends zzen<Void, zza> {
    private final String zzif;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdb(String str) {
        super(2);
        this.zzif = Preconditions.checkNotEmpty(str, "email cannot be null or empty");
    }

    public final String zzdu() {
        return "updateEmail";
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
        new zzda(this);
        return autoResolveMissingFeatures.setFeatures(featureArr).run(remoteCall).build();
    }

    public final void zzdx() {
        ((zza) this.zzps).zza(this.zzpy, zzap.zza(this.zzik, this.zzpz));
        zzc(null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzab(zzdp zzdp, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzel<ResultT> zzel;
        zzbp zzbp;
        zzdp zzdp2 = zzdp;
        new zzeu(this, taskCompletionSource);
        zzel<ResultT> zzel2 = zzel;
        zzel<ResultT> zzel3 = zzel2;
        this.zzpu = zzel2;
        if (this.zzqh) {
            zzdp2.zzeb().zza(this.zzpr.zzcz(), this.zzif, (zzdu) this.zzpq);
            return;
        }
        new zzbp(this.zzpr.zzcz(), this.zzif);
        zzdp2.zzeb().zza(zzbp, (zzdu) this.zzpq);
    }
}
