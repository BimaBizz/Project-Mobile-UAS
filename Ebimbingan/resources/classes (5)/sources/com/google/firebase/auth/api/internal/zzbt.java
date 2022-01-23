package com.google.firebase.auth.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.firebase_auth.zzdh;
import com.google.android.gms.internal.firebase_auth.zze;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.internal.zza;
import com.google.firebase.auth.internal.zzg;
import com.google.firebase.auth.internal.zzm;

@VisibleForTesting
final class zzbt extends zzen<AuthResult, zza> {
    private final zzdh zznk;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbt(EmailAuthCredential emailAuthCredential) {
        super(2);
        zzdh zzdh;
        EmailAuthCredential emailAuthCredential2 = emailAuthCredential;
        Object checkNotNull = Preconditions.checkNotNull(emailAuthCredential2, "credential cannot be null or empty");
        new zzdh(emailAuthCredential2);
        this.zznk = zzdh;
    }

    public final String zzdu() {
        return "reauthenticateWithEmailLinkWithData";
    }

    public final TaskApiCall<zzdp, AuthResult> zzdv() {
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
        new zzbs(this);
        return autoResolveMissingFeatures.setFeatures(featureArr).run(remoteCall).build();
    }

    public final void zzdx() {
        Status status;
        Object obj;
        zzm zza = zzap.zza(this.zzik, this.zzpz);
        if (this.zzpr.getUid().equalsIgnoreCase(zza.getUid())) {
            ((zza) this.zzps).zza(this.zzpy, zza);
            new zzg(zza);
            zzc(obj);
            return;
        }
        new Status(FirebaseError.ERROR_USER_MISMATCH);
        zzc(status);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzm(zzdp zzdp, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzel<ResultT> zzel;
        zzdp zzdp2 = zzdp;
        new zzeu(this, taskCompletionSource);
        zzel<ResultT> zzel2 = zzel;
        zzel<ResultT> zzel3 = zzel2;
        this.zzpu = zzel2;
        if (this.zzqh) {
            zzdp2.zzeb().zza(this.zznk.zzdm(), (zzdu) this.zzpq);
        } else {
            zzdp2.zzeb().zza(this.zznk, (zzdu) this.zzpq);
        }
    }
}
