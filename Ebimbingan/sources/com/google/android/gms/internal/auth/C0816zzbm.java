package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.C0032AuthProxy;
import com.google.android.gms.auth.api.proxy.C0115ProxyApi;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.api.internal.C0243BaseImplementation;

/* renamed from: com.google.android.gms.internal.auth.zzbm */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
abstract class C0816zzbm extends C0243BaseImplementation.ApiMethodImpl<C0115ProxyApi.SpatulaHeaderResult, C0810zzbg> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0816zzbm(C0222GoogleApiClient googleApiClient) {
        super((C0211Api<?>) C0032AuthProxy.API, googleApiClient);
    }

    /* access modifiers changed from: protected */
    public abstract void zza(Context context, C0815zzbl zzbl) throws RemoteException;

    protected static C0115ProxyApi.SpatulaHeaderResult zza(C0236Status status) {
        C0115ProxyApi.SpatulaHeaderResult spatulaHeaderResult;
        new C0828zzby(status);
        return spatulaHeaderResult;
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ void doExecute(C0211Api.AnyClient anyClient) throws RemoteException {
        C0810zzbg zzbg = (C0810zzbg) anyClient;
        zza(zzbg.getContext(), (C0815zzbl) zzbg.getService());
    }

    @C0206KeepForSdk
    public /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((C0231Result) obj);
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ C0231Result createFailedResult(C0236Status status) {
        return zza(status);
    }
}
