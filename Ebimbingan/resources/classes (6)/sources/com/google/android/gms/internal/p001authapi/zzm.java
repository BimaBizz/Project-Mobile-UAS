package com.google.android.gms.internal.p001authapi;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api.zzm  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
final class zzm extends zzo<Status> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzm(zzj zzj, GoogleApiClient googleApiClient) {
        super(googleApiClient);
        zzj zzj2 = zzj;
    }

    /* access modifiers changed from: protected */
    public final void zzc(Context context, zzx zzx) throws RemoteException {
        zzv zzv;
        Context context2 = context;
        new zzp(this);
        zzx.zzc(zzv);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Result createFailedResult(Status status) {
        return status;
    }
}
