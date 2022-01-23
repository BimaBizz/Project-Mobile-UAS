package com.google.firebase.auth.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.firebase_auth.zze;
import com.google.firebase.auth.internal.zzaa;

@VisibleForTesting
final class zzaz extends zzen<Void, zzaa> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzaz() {
        super(5);
    }

    public final String zzdu() {
        return "delete";
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
        new zzay(this);
        return autoResolveMissingFeatures.setFeatures(featureArr).run(remoteCall).build();
    }

    public final void zzdx() {
        ((zzaa) this.zzps).zzcv();
        zzc(null);
    }
}
