package com.google.android.gms.internal.p001authapi;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.C0062Credential;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.C0236Status;

/* renamed from: com.google.android.gms.internal.auth-api.zzk  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
final class C0760zzk extends C0764zzo<C0236Status> {
    private final /* synthetic */ C0062Credential zzao;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0760zzk(C0759zzj zzj, C0222GoogleApiClient googleApiClient, C0062Credential credential) {
        super(googleApiClient);
        C0759zzj zzj2 = zzj;
        this.zzao = credential;
    }

    /* access modifiers changed from: protected */
    public final void zzc(Context context, C0773zzx zzx) throws RemoteException {
        C0771zzv zzv;
        C0775zzz zzz;
        Context context2 = context;
        new C0765zzp(this);
        new C0775zzz(this.zzao);
        zzx.zzc(zzv, zzz);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ C0231Result createFailedResult(C0236Status status) {
        return status;
    }
}
