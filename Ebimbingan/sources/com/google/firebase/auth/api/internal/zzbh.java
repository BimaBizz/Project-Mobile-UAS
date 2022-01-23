package com.google.firebase.auth.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.C0186Feature;
import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.common.api.internal.C0267TaskApiCall;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.util.C0617VisibleForTesting;
import com.google.android.gms.internal.firebase_auth.zzcl;
import com.google.android.gms.internal.firebase_auth.zze;
import com.google.android.gms.internal.firebase_auth.zzfm;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.internal.zza;
import com.google.firebase.auth.internal.zzc;
import com.google.firebase.auth.internal.zzg;
import com.google.firebase.auth.internal.zzm;

@C0617VisibleForTesting
final class zzbh extends zzen<AuthResult, zza> {
    private final zzfm zznd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbh(AuthCredential authCredential) {
        super(2);
        AuthCredential authCredential2 = authCredential;
        Object checkNotNull = C0446Preconditions.checkNotNull(authCredential2, "credential cannot be null");
        this.zznd = zzc.zza(authCredential2, (String) null);
    }

    public final String zzdu() {
        return "linkFederatedCredential";
    }

    public final C0267TaskApiCall<zzdp, AuthResult> zzdv() {
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
        new zzbg(this);
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
    public final /* synthetic */ void zzg(zzdp zzdp, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzel<ResultT> zzel;
        zzcl zzcl;
        zzdp zzdp2 = zzdp;
        new zzeu(this, taskCompletionSource);
        zzel<ResultT> zzel2 = zzel;
        zzel<ResultT> zzel3 = zzel2;
        this.zzpu = zzel2;
        if (this.zzqh) {
            zzdp2.zzeb().zza(this.zzpr.zzcz(), this.zznd, (zzdu) this.zzpq);
            return;
        }
        new zzcl(this.zzpr.zzcz(), this.zznd);
        zzdp2.zzeb().zza(zzcl, (zzdu) this.zzpq);
    }
}
