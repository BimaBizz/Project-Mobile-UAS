package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.base.C1091zaa;
import com.google.android.gms.internal.base.C1093zac;

/* renamed from: com.google.android.gms.common.internal.service.zal */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0477zal extends C1091zaa implements IInterface {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0477zal(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    public final void zae(C0476zak zak) throws RemoteException {
        Parcel zaa = zaa();
        C1093zac.zad(zaa, zak);
        zad(1, zaa);
    }
}
