package com.google.firebase.auth.api.internal;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0186Feature;
import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.common.api.internal.C0267TaskApiCall;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.util.C0617VisibleForTesting;
import com.google.android.gms.internal.firebase_auth.zzbn;
import com.google.android.gms.internal.firebase_auth.zze;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.zza;

@C0617VisibleForTesting
final class zzar extends zzen<Void, zza> {
    private final zzbn zzmp;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzar(String str, @Nullable String str2) {
        super(7);
        zzbn zzbn;
        String str3 = str;
        String checkNotEmpty = C0446Preconditions.checkNotEmpty(str3, "code cannot be null or empty");
        new zzbn(str3, str2);
        this.zzmp = zzbn;
    }

    public final String zzdu() {
        return "applyActionCode";
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
        new zzaq(this);
        return autoResolveMissingFeatures.setFeatures(featureArr).run(remoteCall).build();
    }

    public final void zzdx() {
        zzc(null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzdp zzdp, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzel<ResultT> zzel;
        zzdp zzdp2 = zzdp;
        new zzeu(this, taskCompletionSource);
        zzel<ResultT> zzel2 = zzel;
        zzel<ResultT> zzel3 = zzel2;
        this.zzpu = zzel2;
        if (this.zzqh) {
            zzdp2.zzeb().zzj(this.zzmp.zzcn(), this.zzpq);
        } else {
            zzdp2.zzeb().zza(this.zzmp, (zzdu) this.zzpq);
        }
    }
}
