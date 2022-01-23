package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.C0117ProxyRequest;
import com.google.android.gms.common.api.C0222GoogleApiClient;

/* renamed from: com.google.android.gms.internal.auth.zzbv */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0825zzbv extends C0817zzbn {
    private final /* synthetic */ C0117ProxyRequest zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0825zzbv(C0822zzbs zzbs, C0222GoogleApiClient googleApiClient, C0117ProxyRequest proxyRequest) {
        super(googleApiClient);
        C0822zzbs zzbs2 = zzbs;
        this.zza = proxyRequest;
    }

    /* access modifiers changed from: protected */
    public final void zza(Context context, C0815zzbl zzbl) throws RemoteException {
        C0813zzbj zzbj;
        Context context2 = context;
        new C0824zzbu(this);
        zzbl.zza(zzbj, this.zza);
    }
}
