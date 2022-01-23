package com.google.firebase.auth.api.internal;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.firebase_auth.zzch;
import com.google.android.gms.internal.firebase_auth.zze;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.SignInMethodQueryResult;
import com.google.firebase.auth.internal.zza;
import com.google.firebase.auth.internal.zzw;

@VisibleForTesting
final class zzbb extends zzen<SignInMethodQueryResult, zza> {
    private final zzch zzmy;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbb(String str, @Nullable String str2) {
        super(3);
        zzch zzch;
        String str3 = str;
        String checkNotEmpty = Preconditions.checkNotEmpty(str3, "email cannot be null or empty");
        new zzch(str3, str2);
        this.zzmy = zzch;
    }

    public final String zzdu() {
        return "fetchSignInMethodsForEmail";
    }

    public final TaskApiCall<zzdp, SignInMethodQueryResult> zzdv() {
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
        new zzba(this);
        return autoResolveMissingFeatures.setFeatures(featureArr).run(remoteCall).build();
    }

    public final void zzdx() {
        Object obj;
        new zzw(this.zzqa.getSignInMethods());
        zzc(obj);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zzdp zzdp, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzel<ResultT> zzel;
        zzdp zzdp2 = zzdp;
        new zzeu(this, taskCompletionSource);
        zzel<ResultT> zzel2 = zzel;
        zzel<ResultT> zzel3 = zzel2;
        this.zzpu = zzel2;
        if (this.zzqh) {
            zzdp2.zzeb().zzc(this.zzmy.getEmail(), this.zzpq);
        } else {
            zzdp2.zzeb().zza(this.zzmy, (zzdu) this.zzpq);
        }
    }
}
