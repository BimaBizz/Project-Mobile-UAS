package com.google.firebase.auth.api.internal;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0186Feature;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.common.api.internal.C0267TaskApiCall;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.util.C0617VisibleForTesting;
import com.google.android.gms.internal.firebase_auth.zzbt;
import com.google.android.gms.internal.firebase_auth.zze;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.internal.zza;
import com.google.firebase.auth.internal.zzb;

@C0617VisibleForTesting
final class zzdj extends zzen<String, zza> {
    private final zzbt zzmr;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdj(String str, @Nullable String str2) {
        super(4);
        zzbt zzbt;
        String str3 = str;
        String checkNotEmpty = C0446Preconditions.checkNotEmpty(str3, "code cannot be null or empty");
        new zzbt(str3, str2);
        this.zzmr = zzbt;
    }

    public final String zzdu() {
        return "verifyPasswordResetCode";
    }

    public final C0267TaskApiCall<zzdp, String> zzdv() {
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
        new zzdi(this);
        return autoResolveMissingFeatures.setFeatures(featureArr).run(remoteCall).build();
    }

    public final void zzdx() {
        zzb zzb;
        C0236Status status;
        new zzb(this.zzqb);
        if (0 != zzb.getOperation()) {
            new C0236Status(FirebaseError.ERROR_INTERNAL_ERROR);
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
