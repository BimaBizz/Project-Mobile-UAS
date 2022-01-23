package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.C0121GoogleSignIn;
import com.google.android.gms.auth.api.signin.C0122GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.C0124GoogleSignInClient;
import com.google.android.gms.auth.api.signin.C0125GoogleSignInOptions;
import com.google.android.gms.common.util.C0616UidVerifier;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.android.gms.auth.api.signin.internal.zzv */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C0156zzv extends C0153zzs {
    private final Context mContext;

    public C0156zzv(Context context) {
        this.mContext = context;
    }

    public final void zzp() {
        zzt();
        C0135Storage instance = C0135Storage.getInstance(this.mContext);
        C0135Storage storage = instance;
        C0122GoogleSignInAccount savedDefaultGoogleSignInAccount = instance.getSavedDefaultGoogleSignInAccount();
        C0125GoogleSignInOptions googleSignInOptions = C0125GoogleSignInOptions.DEFAULT_SIGN_IN;
        if (savedDefaultGoogleSignInAccount != null) {
            googleSignInOptions = storage.getSavedDefaultGoogleSignInOptions();
        }
        C0124GoogleSignInClient client = C0121GoogleSignIn.getClient(this.mContext, googleSignInOptions);
        if (savedDefaultGoogleSignInAccount != null) {
            Task<Void> revokeAccess = client.revokeAccess();
        } else {
            Task<Void> signOut = client.signOut();
        }
    }

    public final void zzq() {
        zzt();
        C0151zzq.zzd(this.mContext).clear();
    }

    private final void zzt() {
        Throwable th;
        StringBuilder sb;
        if (!C0616UidVerifier.isGooglePlayServicesUid(this.mContext, Binder.getCallingUid())) {
            Throwable th2 = th;
            int callingUid = Binder.getCallingUid();
            new StringBuilder(52);
            new SecurityException(sb.append("Calling UID ").append(callingUid).append(" is not Google Play services.").toString());
            throw th2;
        }
    }
}
