package com.google.firebase.auth.api.internal;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.firebase_auth.zzbt;
import com.google.android.gms.internal.firebase_auth.zze;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.internal.zza;
import com.google.firebase.auth.internal.zzb;

@VisibleForTesting
final class zzdj extends zzen<String, zza> {
    private final zzbt zzmr;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdj(String str, @Nullable String str2) {
        super(4);
        zzbt zzbt;
        String str3 = str;
        String checkNotEmpty = Preconditions.checkNotEmpty(str3, "code cannot be null or empty");
        new zzbt(str3, str2);
        this.zzmr = zzbt;
    }

    public final String zzdu() {
        return "verifyPasswordResetCode";
    }

    public final TaskApiCall<zzdp, String> zzdv() {
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
        new zzdi(this);
        return autoResolveMissingFeatures.setFeatures(featureArr).run(remoteCall).build();
    }

    public final void zzdx() {
        zzb zzb;
        Status status;
        new zzb(this.zzqb);
        if (0 != zzb.getOperation()) {
            new Status(FirebaseError.ERROR_INTERNAL_ERROR);
            zzc(status);
            return;
        }
        zzc(this.zzqb.getEmail());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzaf(zzdp zzdp, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzel<ResultT> zzel;
        zzdp zzdp2 = zzdp;
        new zzeu(this, taskCompletionSource);
        zzel<ResultT> zzel2 = zzel;
        zzel<ResultT> zzel3 = zzel2;
        this.zzpu = zzel2;
        if (this.zzqh) {
            zzdp2.zzeb().zzi(this.zzmr.zzcn(), this.zzpq);
        } else {
            zzdp2.zzeb().zza(this.zzmr, (zzdu) this.zzpq);
        }
    }
}
