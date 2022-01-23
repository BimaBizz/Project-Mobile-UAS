package com.google.firebase.auth.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.C0186Feature;
import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.common.api.internal.C0267TaskApiCall;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.util.C0617VisibleForTesting;
import com.google.android.gms.internal.firebase_auth.zzcj;
import com.google.android.gms.internal.firebase_auth.zze;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.internal.zza;
import com.google.firebase.auth.internal.zzg;
import com.google.firebase.auth.internal.zzm;

@C0617VisibleForTesting
final class zzbf extends zzen<AuthResult, zza> {
    private final EmailAuthCredential zzkn;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbf(EmailAuthCredential emailAuthCredential) {
        super(2);
        EmailAuthCredential emailAuthCredential2 = emailAuthCredential;
        this.zzkn = (EmailAuthCredential) C0446Preconditions.checkNotNull(emailAuthCredential2, "credential cannot be null");
        String checkNotEmpty = C0446Preconditions.checkNotEmpty(emailAuthCredential2.getEmail(), "email cannot be null");
        String checkNotEmpty2 = C0446Preconditions.checkNotEmpty(emailAuthCredential2.getPassword(), "password cannot be null");
    }

    public final String zzdu() {
        return "linkEmailAuthCredential";
    }

    public final C0267TaskApiCall<zzdp, AuthResult> zzdv() {
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
        new zzbe(this);
        return autoResolveMissingFeatures.setFeatures(featureArr).run(remoteCall).build();
    }

    public final void zzdx() {
        Object obj;
        zzm zza = zzap.zza(this.zzik, this.zzpz);
        ((zza) this.zzps).zza(this.zzpy, zza);
        new zzg(zza);
        zzc(obj);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(zzdp zzdp, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzel<ResultT> zzel;
        zzcj zzcj;
        zzdp zzdp2 = zzdp;
        new zzeu(this, taskCompletionSource);
        zzel<ResultT> zzel2 = zzel;
        zzel<ResultT> zzel3 = zzel2;
        this.zzpu = zzel2;
        if (this.zzqh) {
            zzdp2.zzeb().zza(this.zzkn.getEmail(), this.zzkn.getPassword(), this.zzpr.zzcz(), this.zzpq);
            return;
        }
        new zzcj(this.zzkn.getEmail(), this.zzkn.getPassword(), this.zzpr.zzcz());
        zzdp2.zzeb().zza(zzcj, (zzdu) this.zzpq);
    }
}
