package com.google.android.gms.internal.p001authapi;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.C0236Status;

/* renamed from: com.google.android.gms.internal.auth-api.zzm  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
final class C0762zzm extends C0764zzo<C0236Status> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0762zzm(C0759zzj zzj, C0222GoogleApiClient googleApiClient) {
        super(googleApiClient);
        C0759zzj zzj2 = zzj;
    }

    /* access modifiers changed from: protected */
    public final void zzc(Context context, C0773zzx zzx) throws RemoteException {
        C0771zzv zzv;
        Context context2 = context;
        new C0765zzp(this);
        zzx.zzc(zzv);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ C0231Result createFailedResult(C0236Status status) {
        return status;
    }
}
