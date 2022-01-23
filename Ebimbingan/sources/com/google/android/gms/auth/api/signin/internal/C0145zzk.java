package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.C0122GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.C0127GoogleSignInResult;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.C0236Status;

/* renamed from: com.google.android.gms.auth.api.signin.internal.zzk */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
final class C0145zzk extends C0137zzc {
    private final /* synthetic */ C0142zzh zzcn;

    C0145zzk(C0142zzh zzh) {
        this.zzcn = zzh;
    }

    public final void zzc(C0122GoogleSignInAccount googleSignInAccount, C0236Status status) throws RemoteException {
        C0231Result result;
        C0122GoogleSignInAccount googleSignInAccount2 = googleSignInAccount;
        C0236Status status2 = status;
        if (googleSignInAccount2 != null) {
            C0151zzq.zzd(this.zzcn.val$context).zzc(this.zzcn.zzcm, googleSignInAccount2);
        }
        new C0127GoogleSignInResult(googleSignInAccount2, status2);
        this.zzcn.setResult(result);
    }
}
