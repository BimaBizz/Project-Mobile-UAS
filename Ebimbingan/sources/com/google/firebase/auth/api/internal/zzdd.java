package com.google.firebase.auth.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.C0186Feature;
import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.common.api.internal.C0267TaskApiCall;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.util.C0617VisibleForTesting;
import com.google.android.gms.internal.firebase_auth.zzbr;
import com.google.android.gms.internal.firebase_auth.zze;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.zza;

@C0617VisibleForTesting
final class zzdd extends zzen<Void, zza> {
    private final String zzig;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdd(String str) {
        super(2);
        this.zzig = C0446Preconditions.checkNotEmpty(str, "password cannot be null or empty");
    }

    public final String zzdu() {
        return "updatePassword";
    }

    public final C0267TaskApiCall<zzdp, Void> zzdv() {
        C0186Feature[] featureArr;
        C0262RemoteCall remoteCall;
        C0267TaskApiCall.Builder autoResolveMissingFeatures = C0267TaskApiCall.builder().setAutoResolveMissingFeatures(false);
        if (this.zzqh) {
            featureArr = null;
        } else {
            C0186Feature[] featureArr2 = new C0186Feature[1];
            featureArr = featureArr2;
            featureArr2[0] = zze.zzf;
        }
        new zzdc(this);
        return autoResolveMissingFeatures.setFeatures(featureArr).run(remoteCall).build();
    }

    public final void zzdx() {
        ((zza) this.zzps).zza(this.zzpy, zzap.zza(this.zzik, this.zzpz));
        zzc(null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzac(zzdp zzdp, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzel<ResultT> zzel;
        zzbr zzbr;
        zzdp zzdp2 = zzdp;
        new zzeu(this, taskCompletionSource);
        zzel<ResultT> zzel2 = zzel;
        zzel<ResultT> zzel3 = zzel2;
        this.zzpu = zzel2;
        if (this.zzqh) {
            zzdp2.zzeb().zzb(this.zzpr.zzcz(), this.zzig, (zzdu) this.zzpq);
            return;
        }
        new zzbr(this.zzpr.zzcz(), this.zzig);
        zzdp2.zzeb().zza(zzbr, (zzdu) this.zzpq);
    }
}
