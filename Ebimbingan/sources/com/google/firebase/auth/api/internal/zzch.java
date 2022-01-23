package com.google.firebase.auth.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0186Feature;
import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.common.api.internal.C0267TaskApiCall;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.util.C0617VisibleForTesting;
import com.google.android.gms.internal.firebase_auth.zzct;
import com.google.android.gms.internal.firebase_auth.zze;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.internal.zza;

@C0617VisibleForTesting
final class zzch extends zzen<Void, zza> {
    @NonNull
    private final zzct zznw;
    private final String zznx;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzch(String str, ActionCodeSettings actionCodeSettings, @Nullable String str2, String str3) {
        super(4);
        zzct zzct;
        String str4 = str;
        String checkNotEmpty = C0446Preconditions.checkNotEmpty(str4, "email cannot be null or empty");
        new zzct(str4, actionCodeSettings, str2);
        this.zznw = zzct;
        this.zznx = str3;
    }

    public final String zzdu() {
        return this.zznx;
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
        new zzcg(this);
        return autoResolveMissingFeatures.setFeatures(featureArr).run(remoteCall).build();
    }

    public final void zzdx() {
        zzc(null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzs(zzdp zzdp, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzel<ResultT> zzel;
        zzdp zzdp2 = zzdp;
        new zzeu(this, taskCompletionSource);
        zzel<ResultT> zzel2 = zzel;
        zzel<ResultT> zzel3 = zzel2;
        this.zzpu = zzel2;
        if (this.zzqh) {
            zzdp2.zzeb().zzc(this.zznw.getEmail(), this.zznw.zzdj(), (zzdu) this.zzpq);
        } else {
            zzdp2.zzeb().zza(this.zznw, (zzdu) this.zzpq);
        }
    }
}
