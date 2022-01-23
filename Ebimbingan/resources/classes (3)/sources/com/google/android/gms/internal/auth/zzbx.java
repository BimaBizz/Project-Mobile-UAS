package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzbx extends zzbm {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzbx(zzbs zzbs, GoogleApiClient googleApiClient) {
        super(googleApiClient);
        zzbs zzbs2 = zzbs;
    }

    /* access modifiers changed from: protected */
    public final void zza(Context context, zzbl zzbl) throws RemoteException {
        zzbj zzbj;
        Context context2 = context;
        new zzbw(this);
        zzbl.zza(zzbj);
    }
}
