package com.google.firebase.auth.api.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.firebase_auth.zzbx;
import com.google.android.gms.internal.firebase_auth.zze;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.internal.zza;
import com.google.firebase.auth.internal.zzg;
import com.google.firebase.auth.internal.zzm;

@VisibleForTesting
final class zzax extends zzen<AuthResult, zza> {
    @NonNull
    final zzbx zzmv;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzax(String str, String str2, @Nullable String str3) {
        super(2);
        zzbx zzbx;
        String str4 = str;
        String str5 = str2;
        String checkNotEmpty = Preconditions.checkNotEmpty(str4, "email cannot be null or empty");
        String checkNotEmpty2 = Preconditions.checkNotEmpty(str5, "password cannot be null or empty");
        new zzbx(str4, str5, str3);
        this.zzmv = zzbx;
    }

    public final String zzdu() {
        return "createUserWithEmailAndPassword";
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
        new zzaw(this);
        return autoResolveMissingFeatures.setFeatures(featureArr).run(remoteCall).build();
    }

    public final void zzdx() {
        Object obj;
        zzm zza = zzap.zza(this.zzik, this.zzpz);
        ((zza) this.zzps).zza(this.zzpy, zza);
        new zzg(zza);
        zzc(obj);
    }
}
