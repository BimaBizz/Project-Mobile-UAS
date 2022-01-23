package com.google.firebase.auth.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.C0186Feature;
import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.common.api.internal.C0267TaskApiCall;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.util.C0617VisibleForTesting;
import com.google.android.gms.internal.firebase_auth.zzdv;
import com.google.android.gms.internal.firebase_auth.zze;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.internal.zza;

@C0617VisibleForTesting
final class zzdh extends zzen<Void, zza> {
    private final UserProfileChangeRequest zzkt;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdh(UserProfileChangeRequest userProfileChangeRequest) {
        super(2);
        this.zzkt = (UserProfileChangeRequest) C0446Preconditions.checkNotNull(userProfileChangeRequest, "request cannot be null");
    }

    public final String zzdu() {
        return "updateProfile";
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
        new zzdg(this);
        return autoResolveMissingFeatures.setFeatures(featureArr).run(remoteCall).build();
    }

    public final void zzdx() {
        ((zza) this.zzps).zza(this.zzpy, zzap.zza(this.zzik, this.zzpz));
        zzc(null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzae(zzdp zzdp, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzel<ResultT> zzel;
        zzdv zzdv;
        zzdp zzdp2 = zzdp;
        new zzeu(this, taskCompletionSource);
        zzel<ResultT> zzel2 = zzel;
        zzel<ResultT> zzel3 = zzel2;
        this.zzpu = zzel2;
        if (this.zzqh) {
            zzdp2.zzeb().zza(this.zzpr.zzcz(), this.zzkt, (zzdu) this.zzpq);
            return;
        }
        new zzdv(this.zzkt, this.zzpr.zzcz());
        zzdp2.zzeb().zza(zzdv, (zzdu) this.zzpq);
    }
}
