package com.google.android.gms.internal.p001authapi;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.C0064CredentialRequest;
import com.google.android.gms.auth.api.credentials.C0066CredentialRequestResult;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.C0236Status;

/* renamed from: com.google.android.gms.internal.auth-api.zzi  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
final class C0758zzi extends C0764zzo<C0066CredentialRequestResult> {
    private final /* synthetic */ C0064CredentialRequest zzan;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0758zzi(C0759zzj zzj, C0222GoogleApiClient googleApiClient, C0064CredentialRequest credentialRequest) {
        super(googleApiClient);
        C0759zzj zzj2 = zzj;
        this.zzan = credentialRequest;
    }

    /* access modifiers changed from: protected */
    public final void zzc(Context context, C0773zzx zzx) throws RemoteException {
        C0771zzv zzv;
        Context context2 = context;
        new C0761zzl(this);
        zzx.zzc(zzv, this.zzan);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ C0231Result createFailedResult(C0236Status status) {
        return C0756zzg.zzc(status);
    }
}
