package com.google.android.gms.common.internal.service;

import android.os.RemoteException;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0222GoogleApiClient;

/* renamed from: com.google.android.gms.common.internal.service.zac */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0468zac extends C0471zaf {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0468zac(C0470zae zae, C0222GoogleApiClient googleApiClient) {
        super(googleApiClient);
        C0470zae zae2 = zae;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void doExecute(C0211Api.AnyClient anyClient) throws RemoteException {
        C0476zak zak;
        C0477zal zal = (C0477zal) ((C0473zah) anyClient).getService();
        new C0469zad(this);
        zal.zae(zak);
    }
}
