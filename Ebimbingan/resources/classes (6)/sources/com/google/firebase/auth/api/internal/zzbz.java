package com.google.firebase.auth.api.internal;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.firebase_auth.zzdj;
import com.google.android.gms.internal.firebase_auth.zze;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.internal.zza;
import com.google.firebase.auth.internal.zzm;

@VisibleForTesting
final class zzbz extends zzen<Void, zza> {
    private final zzdj zznq;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbz(PhoneAuthCredential phoneAuthCredential, @Nullable String str) {
        super(2);
        zzdj zzdj;
        PhoneAuthCredential phoneAuthCredential2 = phoneAuthCredential;
        Object checkNotNull = Preconditions.checkNotNull(phoneAuthCredential2, "credential cannot be null");
        PhoneAuthCredential zzn = phoneAuthCredential2.zzn(false);
        new zzdj(phoneAuthCredential2, str);
        this.zznq = zzdj;
    }

    public final String zzdu() {
        return "reauthenticateWithPhoneCredential";
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
        new zzby(this);
        return autoResolveMissingFeatures.setFeatures(featureArr).run(remoteCall).build();
    }

    public final void zzdx() {
        Status status;
        zzm zza = zzap.zza(this.zzik, this.zzpz);
        if (this.zzpr.getUid().equalsIgnoreCase(zza.getUid())) {
            ((zza) this.zzps).zza(this.zzpy, zza);
            zzc(null);
            return;
        }
        new Status(FirebaseError.ERROR_USER_MISMATCH);
        zzc(status);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(zzdp zzdp, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzel<ResultT> zzel;
        zzdp zzdp2 = zzdp;
        new zzeu(this, taskCompletionSource);
        zzel<ResultT> zzel2 = zzel;
        zzel<ResultT> zzel3 = zzel2;
        this.zzpu = zzel2;
        if (this.zzqh) {
            zzdp2.zzeb().zza(this.zznq.zzdi(), (zzdu) this.zzpq);
        } else {
            zzdp2.zzeb().zza(this.zznq, (zzdu) this.zzpq);
        }
    }
}
