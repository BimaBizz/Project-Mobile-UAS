package com.google.android.gms.common.internal.service;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zac extends zaf {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zac(zae zae, GoogleApiClient googleApiClient) {
        super(googleApiClient);
        zae zae2 = zae;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        zak zak;
        zal zal = (zal) ((zah) anyClient).getService();
        new zad(this);
        zal.zae(zak);
    }
}
