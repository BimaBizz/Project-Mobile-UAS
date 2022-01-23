package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.common.api.GoogleApiClient;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzbv extends zzbn {
    private final /* synthetic */ ProxyRequest zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzbv(zzbs zzbs, GoogleApiClient googleApiClient, ProxyRequest proxyRequest) {
        super(googleApiClient);
        zzbs zzbs2 = zzbs;
        this.zza = proxyRequest;
    }

    /* access modifiers changed from: protected */
    public final void zza(Context context, zzbl zzbl) throws RemoteException {
        zzbj zzbj;
        Context context2 = context;
        new zzbu(this);
        zzbl.zza(zzbj, this.zza);
    }
}
