package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzv extends zzs {
    private final Context mContext;

    public zzv(Context context) {
        this.mContext = context;
    }

    public final void zzp() {
        zzt();
        Storage instance = Storage.getInstance(this.mContext);
        Storage storage = instance;
        GoogleSignInAccount savedDefaultGoogleSignInAccount = instance.getSavedDefaultGoogleSignInAccount();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.DEFAULT_SIGN_IN;
        if (savedDefaultGoogleSignInAccount != null) {
            googleSignInOptions = storage.getSavedDefaultGoogleSignInOptions();
        }
        GoogleSignInClient client = GoogleSignIn.getClient(this.mContext, googleSignInOptions);
        if (savedDefaultGoogleSignInAccount != null) {
            Task<Void> revokeAccess = client.revokeAccess();
        } else {
            Task<Void> signOut = client.signOut();
        }
    }

    public final void zzq() {
        zzt();
        zzq.zzd(this.mContext).clear();
    }

    private final void zzt() {
        Throwable th;
        StringBuilder sb;
        if (!UidVerifier.isGooglePlayServicesUid(this.mContext, Binder.getCallingUid())) {
            Throwable th2 = th;
            int callingUid = Binder.getCallingUid();
            new StringBuilder(52);
            new SecurityException(sb.append("Calling UID ").append(callingUid).append(" is not Google Play services.").toString());
            throw th2;
        }
    }
}
