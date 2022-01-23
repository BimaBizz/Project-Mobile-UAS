package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.C0222GoogleApiClient;

/* renamed from: com.google.android.gms.internal.auth.zzbx */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0827zzbx extends C0816zzbm {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0827zzbx(C0822zzbs zzbs, C0222GoogleApiClient googleApiClient) {
        super(googleApiClient);
        C0822zzbs zzbs2 = zzbs;
    }

    /* access modifiers changed from: protected */
    public final void zza(Context context, C0815zzbl zzbl) throws RemoteException {
        C0813zzbj zzbj;
        Context context2 = context;
        new C0826zzbw(this);
        zzbl.zza(zzbj);
    }
}
