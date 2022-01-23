package com.google.firebase.auth.api.internal;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0186Feature;
import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.common.api.internal.C0267TaskApiCall;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.util.C0617VisibleForTesting;
import com.google.android.gms.internal.firebase_auth.zzbv;
import com.google.android.gms.internal.firebase_auth.zze;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.zza;

@C0617VisibleForTesting
final class zzav extends zzen<Void, zza> {
    private final zzbv zzmt;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzav(String str, String str2, @Nullable String str3) {
        super(4);
        zzbv zzbv;
        String str4 = str;
        String str5 = str2;
        String checkNotEmpty = C0446Preconditions.checkNotEmpty(str4, "code cannot be null or empty");
        String checkNotEmpty2 = C0446Preconditions.checkNotEmpty(str5, "new password cannot be null or empty");
        new zzbv(str4, str5, str3);
        this.zzmt = zzbv;
    }

    public final String zzdu() {
        return "confirmPasswordReset";
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
