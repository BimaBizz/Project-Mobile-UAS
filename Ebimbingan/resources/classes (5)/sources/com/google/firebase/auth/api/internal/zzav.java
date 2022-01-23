package com.google.firebase.auth.api.internal;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.firebase_auth.zzbv;
import com.google.android.gms.internal.firebase_auth.zze;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.zza;

@VisibleForTesting
final class zzav extends zzen<Void, zza> {
    private final zzbv zzmt;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzav(String str, String str2, @Nullable String str3) {
        super(4);
        zzbv zzbv;
        String str4 = str;
        String str5 = str2;
        String checkNotEmpty = Preconditions.checkNotEmpty(str4, "code cannot be null or empty");
        String checkNotEmpty2 = Preconditions.checkNotEmpty(str5, "new password cannot be null or empty");
        new zzbv(str4, str5, str3);
        this.zzmt = zzbv;
    }

    public final String zzdu() {
        return "confirmPasswordReset";
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
        new zzau(this);
        return autoResolveMissingFeatures.setFeatures(featureArr).run(remoteCall).build();
    }

    public final void zzdx() {
        zzc(null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzdp zzdp, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzel<ResultT> zzel;
        zzdp zzdp2 = zzdp;
        new zzeu(this, taskCompletionSource);
        zzel<ResultT> zzel2 = zzel;
        zzel<ResultT> zzel3 = zzel2;
        this.zzpu = zzel2;
        if (this.zzqh) {
            zzdp2.zzeb().zzf(this.zzmt.zzcn(), this.zzmt.zzdg(), this.zzpq);
        } else {
            zzdp2.zzeb().zza(this.zzmt, (zzdu) this.zzpq);
        }
    }
}
