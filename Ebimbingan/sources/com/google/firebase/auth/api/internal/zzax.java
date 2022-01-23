package com.google.firebase.auth.api.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0186Feature;
import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.common.api.internal.C0267TaskApiCall;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.util.C0617VisibleForTesting;
import com.google.android.gms.internal.firebase_auth.zzbx;
import com.google.android.gms.internal.firebase_auth.zze;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.internal.zza;
import com.google.firebase.auth.internal.zzg;
import com.google.firebase.auth.internal.zzm;

@C0617VisibleForTesting
final class zzax extends zzen<AuthResult, zza> {
    @NonNull
    final zzbx zzmv;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzax(String str, String str2, @Nullable String str3) {
        super(2);
        zzbx zzbx;
        String str4 = str;
        String str5 = str2;
        String checkNotEmpty = C0446Preconditions.checkNotEmpty(str4, "email cannot be null or empty");
        String checkNotEmpty2 = C0446Preconditions.checkNotEmpty(str5, "password cannot be null or empty");
        new zzbx(str4, str5, str3);
        this.zzmv = zzbx;
    }

    public final String zzdu() {
        return "createUserWithEmailAndPassword";
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
