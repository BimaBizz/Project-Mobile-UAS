package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.AuthProxy;
import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
abstract class zzbn extends BaseImplementation.ApiMethodImpl<ProxyApi.ProxyResult, zzbg> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbn(GoogleApiClient googleApiClient) {
        super((Api<?>) AuthProxy.API, googleApiClient);
    }

    /* access modifiers changed from: protected */
    public abstract void zza(Context context, zzbl zzbl) throws RemoteException;

    /* access modifiers changed from: protected */
    public /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        zzbg zzbg = (zzbg) anyClient;
        zza(zzbg.getContext(), (zzbl) zzbg.getService());
    }

    @KeepForSdk
    public /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((Result) obj);
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ Result createFailedResult(Status status) {
        Result result;
        new zzbz(status);
        return result;
    }
}
