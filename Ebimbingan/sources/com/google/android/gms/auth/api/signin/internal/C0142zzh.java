package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.C0122GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.C0125GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.C0127GoogleSignInResult;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.C0236Status;

/* renamed from: com.google.android.gms.auth.api.signin.internal.zzh */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
final class C0142zzh extends C0148zzn<C0127GoogleSignInResult> {
    final /* synthetic */ Context val$context;
    final /* synthetic */ C0125GoogleSignInOptions zzcm;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0142zzh(C0222GoogleApiClient googleApiClient, Context context, C0125GoogleSignInOptions googleSignInOptions) {
        super(googleApiClient);
        this.val$context = context;
        this.zzcm = googleSignInOptions;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void doExecute(C0211Api.AnyClient anyClient) throws RemoteException {
        C0152zzr zzr;
        new C0145zzk(this);
        ((C0154zzt) ((C0140zzf) anyClient).getService()).zzc(zzr, this.zzcm);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ C0231Result createFailedResult(C0236Status status) {
        C0231Result result;
        new C0127GoogleSignInResult((C0122GoogleSignInAccount) null, status);
        return result;
    }
}
