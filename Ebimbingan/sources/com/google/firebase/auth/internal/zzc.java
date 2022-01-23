package com.google.firebase.auth.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.internal.firebase_auth.zzfm;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FacebookAuthCredential;
import com.google.firebase.auth.GithubAuthCredential;
import com.google.firebase.auth.GoogleAuthCredential;
import com.google.firebase.auth.PlayGamesAuthCredential;
import com.google.firebase.auth.TwitterAuthCredential;
import com.google.firebase.auth.zzf;

public final class zzc {
    @NonNull
    public static zzfm zza(AuthCredential authCredential, @Nullable String str) {
        Throwable th;
        AuthCredential authCredential2 = authCredential;
        String str2 = str;
        Object checkNotNull = C0446Preconditions.checkNotNull(authCredential2);
        if (GoogleAuthCredential.class.isAssignableFrom(authCredential2.getClass())) {
            return GoogleAuthCredential.zza((GoogleAuthCredential) authCredential2, str2);
        }
        if (FacebookAuthCredential.class.isAssignableFrom(authCredential2.getClass())) {
            return FacebookAuthCredential.zza((FacebookAuthCredential) authCredential2, str2);
        }
        if (TwitterAuthCredential.class.isAssignableFrom(authCredential2.getClass())) {
            return TwitterAuthCredential.zza((TwitterAuthCredential) authCredential2, str2);
        }
        if (GithubAuthCredential.class.isAssignableFrom(authCredential2.getClass())) {
            return GithubAuthCredential.zza((GithubAuthCredential) authCredential2, str2);
        }
        if (PlayGamesAuthCredential.class.isAssignableFrom(authCredential2.getClass())) {
            return PlayGamesAuthCredential.zza((PlayGamesAuthCredential) authCredential2, str2);
        }
        if (zzf.class.isAssignableFrom(authCredential2.getClass())) {
            return zzf.zza((zzf) authCredential2, str2);
        }
        Throwable th2 = th;
        new IllegalArgumentException("Unsupported credential type.");
        throw th2;
    }
}
