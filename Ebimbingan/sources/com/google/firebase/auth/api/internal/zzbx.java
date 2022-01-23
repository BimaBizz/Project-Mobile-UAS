package com.google.firebase.auth.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0186Feature;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.common.api.internal.C0267TaskApiCall;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.util.C0617VisibleForTesting;
import com.google.android.gms.internal.firebase_auth.zzdf;
import com.google.android.gms.internal.firebase_auth.zze;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.internal.zza;
import com.google.firebase.auth.internal.zzg;
import com.google.firebase.auth.internal.zzm;

@C0617VisibleForTesting
final class zzbx extends zzen<AuthResult, zza> {
    @NonNull
    private final zzdf zznn;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbx(String str, String str2, @Nullable String str3) {
        super(2);
        zzdf zzdf;
        String str4 = str;
        String str5 = str2;
        String checkNotEmpty = C0446Preconditions.checkNotEmpty(str4, "email cannot be null or empty");
        String checkNotEmpty2 = C0446Preconditions.checkNotEmpty(str5, "password cannot be null or empty");
        new zzdf(str4, str5, str3);
        this.zznn = zzdf;
    }

    public final String zzdu() {
        return "reauthenticateWithEmailPasswordWithData";
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
        new zzbw(this);
        return autoResolveMissingFeatures.setFeatures(featureArr).run(remoteCall).build();
    }

    public final void zzdx() {
        C0236Status status;
        Object obj;
        zzm zza = zzap.zza(this.zzik, this.zzpz);
        if (this.zzpr.getUid().equalsIgnoreCase(zza.getUid())) {
            ((zza) this.zzps).zza(this.zzpy, zza);
            new zzg(zza);
            zzc(obj);
            return;
        }
        new C0236Status(FirebaseError.ERROR_USER_MISMATCH);
        zzc(status);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(zzdp zzdp, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzel<ResultT> zzel;
        zzdp zzdp2 = zzdp;
        new zzeu(this, taskCompletionSource);
        zzel<ResultT> zzel2 = zzel;
        zzel<ResultT> zzel3 = zzel2;
        this.zzpu = zzel2;
        if (this.zzqh) {
            zzdp2.zzeb().zzd(this.zznn.getEmail(), this.zznn.getPassword(), this.zzpq);
        } else {
            zzdp2.zzeb().zza(this.zznn, (zzdu) this.zzpq);
        }
    }
}
