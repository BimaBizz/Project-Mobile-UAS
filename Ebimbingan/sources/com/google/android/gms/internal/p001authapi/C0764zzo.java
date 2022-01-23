package com.google.android.gms.internal.p001authapi;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.auth.api.C0031Auth;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.internal.C0243BaseImplementation;

/* renamed from: com.google.android.gms.internal.auth-api.zzo  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
abstract class C0764zzo<R extends C0231Result> extends C0243BaseImplementation.ApiMethodImpl<R, C0766zzq> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0764zzo(C0222GoogleApiClient googleApiClient) {
        super((C0211Api<?>) C0031Auth.CREDENTIALS_API, googleApiClient);
    }

    /* access modifiers changed from: protected */
    public abstract void zzc(Context context, C0773zzx zzx) throws DeadObjectException, RemoteException;

    /* access modifiers changed from: protected */
    public /* synthetic */ void doExecute(C0211Api.AnyClient anyClient) throws RemoteException {
        C0766zzq zzq = (C0766zzq) anyClient;
        zzc(zzq.getContext(), (C0773zzx) zzq.getService());
    }

    @C0206KeepForSdk
    public /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((C0231Result) obj);
    }
}
