package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.C0122GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.C0125GoogleSignInOptions;
import com.google.android.gms.common.util.C0617VisibleForTesting;

/* renamed from: com.google.android.gms.auth.api.signin.internal.zzq */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C0151zzq {
    @Nullable
    private static C0151zzq zzcq = null;
    @C0617VisibleForTesting
    private C0135Storage zzcr;
    @Nullable
    @C0617VisibleForTesting
    private C0122GoogleSignInAccount zzcs = this.zzcr.getSavedDefaultGoogleSignInAccount();
    @Nullable
    @C0617VisibleForTesting
    private C0125GoogleSignInOptions zzct = this.zzcr.getSavedDefaultGoogleSignInOptions();

    private C0151zzq(Context context) {
        this.zzcr = C0135Storage.getInstance(context);
    }

    public static synchronized C0151zzq zzd(@NonNull Context context) {
        C0151zzq zze;
        Context context2 = context;
        synchronized (C0151zzq.class) {
            zze = zze(context2.getApplicationContext());
        }
        return zze;
    }

    private static synchronized C0151zzq zze(Context context) {
        C0151zzq zzq;
        C0151zzq zzq2;
        Context context2 = context;
        synchronized (C0151zzq.class) {
            if (zzcq != null) {
                zzq2 = zzcq;
            } else {
                new C0151zzq(context2);
                C0151zzq zzq3 = zzq;
                C0151zzq zzq4 = zzq3;
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

    public final synchronized void zzc(C0125GoogleSignInOptions googleSignInOptions, C0122GoogleSignInAccount googleSignInAccount) {
        C0125GoogleSignInOptions googleSignInOptions2 = googleSignInOptions;
        C0122GoogleSignInAccount googleSignInAccount2 = googleSignInAccount;
        synchronized (this) {
            this.zzcr.saveDefaultGoogleSignInAccount(googleSignInAccount2, googleSignInOptions2);
            this.zzcs = googleSignInAccount2;
            this.zzct = googleSignInOptions2;
        }
    }

    @Nullable
    public final synchronized C0122GoogleSignInAccount zzr() {
        C0122GoogleSignInAccount googleSignInAccount;
        synchronized (this) {
            googleSignInAccount = this.zzcs;
        }
        return googleSignInAccount;
    }

    @Nullable
    public final synchronized C0125GoogleSignInOptions zzs() {
        C0125GoogleSignInOptions googleSignInOptions;
        synchronized (this) {
            googleSignInOptions = this.zzct;
        }
        return googleSignInOptions;
    }
}
