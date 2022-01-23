package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzq {
    @Nullable
    private static zzq zzcq = null;
    @VisibleForTesting
    private Storage zzcr;
    @Nullable
    @VisibleForTesting
    private GoogleSignInAccount zzcs = this.zzcr.getSavedDefaultGoogleSignInAccount();
    @Nullable
    @VisibleForTesting
    private GoogleSignInOptions zzct = this.zzcr.getSavedDefaultGoogleSignInOptions();

    private zzq(Context context) {
        this.zzcr = Storage.getInstance(context);
    }

    public static synchronized zzq zzd(@NonNull Context context) {
        zzq zze;
        Context context2 = context;
        synchronized (zzq.class) {
            zze = zze(context2.getApplicationContext());
        }
        return zze;
    }

    private static synchronized zzq zze(Context context) {
        zzq zzq;
        zzq zzq2;
        Context context2 = context;
        synchronized (zzq.class) {
            if (zzcq != null) {
                zzq2 = zzcq;
            } else {
                new zzq(context2);
                zzq zzq3 = zzq;
                zzq zzq4 = zzq3;
                zzcq = zzq3;
                zzq2 = zzq4;
            }
        }
        return zzq2;
    }

    public final synchronized void clear() {
        synchronized (this) {
            this.zzcr.clear();
            this.zzcs = null;
            this.zzct = null;
        }
    }

    public final synchronized void zzc(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        GoogleSignInOptions googleSignInOptions2 = googleSignInOptions;
        GoogleSignInAccount googleSignInAccount2 = googleSignInAccount;
        synchronized (this) {
            this.zzcr.saveDefaultGoogleSignInAccount(googleSignInAccount2, googleSignInOptions2);
            this.zzcs = googleSignInAccount2;
            this.zzct = googleSignInOptions2;
        }
    }

    @Nullable
    public final synchronized GoogleSignInAccount zzr() {
        GoogleSignInAccount googleSignInAccount;
        synchronized (this) {
            googleSignInAccount = this.zzcs;
        }
        return googleSignInAccount;
    }

    @Nullable
    public final synchronized GoogleSignInOptions zzs() {
        GoogleSignInOptions googleSignInOptions;
        synchronized (this) {
            googleSignInOptions = this.zzct;
        }
        return googleSignInOptions;
    }
}
