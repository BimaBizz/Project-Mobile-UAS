package com.google.firebase.auth.api.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.firebase_auth.zzcf;
import com.google.android.gms.internal.firebase_auth.zze;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.auth.internal.zza;
import com.google.firebase.auth.internal.zzan;

@VisibleForTesting
final class zzbd extends zzen<GetTokenResult, zza> {
    private final zzcf zzna;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbd(String str) {
        super(1);
        zzcf zzcf;
        String str2 = str;
        String checkNotEmpty = Preconditions.checkNotEmpty(str2, "refresh token cannot be null");
        new zzcf(str2);
        this.zzna = zzcf;
    }

    public final String zzdu() {
        return "getAccessToken";
    }

    public final TaskApiCall<zzdp, GetTokenResult> zzdv() {
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
        new zzbc(this);
        return autoResolveMissingFeatures.setFeatures(featureArr).run(remoteCall).build();
    }

    public final void zzdx() {
        if (TextUtils.isEmpty(this.zzpy.zzs())) {
            this.zzpy.zzcm(this.zzna.zzs());
        }
        ((zza) this.zzps).zza(this.zzpy, this.zzpr);
        zzc(zzan.zzdf(this.zzpy.getAccessToken()));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zze(zzdp zzdp, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzel<ResultT> zzel;
        zzdp zzdp2 = zzdp;
        new zzeu(this, taskCompletionSource);
        zzel<ResultT> zzel2 = zzel;
        zzel<ResultT> zzel3 = zzel2;
        this.zzpu = zzel2;
        if (this.zzqh) {
            zzdp2.zzeb().zza(this.zzna.zzs(), (zzdu) this.zzpq);
        } else {
            zzdp2.zzeb().zza(this.zzna, (zzdu) this.zzpq);
        }
    }
}
