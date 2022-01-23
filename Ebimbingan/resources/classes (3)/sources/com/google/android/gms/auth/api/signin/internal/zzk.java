package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
final class zzk extends zzc {
    private final /* synthetic */ zzh zzcn;

    zzk(zzh zzh) {
        this.zzcn = zzh;
    }

    public final void zzc(GoogleSignInAccount googleSignInAccount, Status status) throws RemoteException {
        Result result;
        GoogleSignInAccount googleSignInAccount2 = googleSignInAccount;
        Status status2 = status;
        if (googleSignInAccount2 != null) {
            zzq.zzd(this.zzcn.val$context).zzc(this.zzcn.zzcm, googleSignInAccount2);
        }
        new GoogleSignInResult(googleSignInAccount2, status2);
        this.zzcn.setResult(result);
    }
}
