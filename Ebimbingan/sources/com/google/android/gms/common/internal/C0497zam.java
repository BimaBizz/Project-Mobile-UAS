package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C0661IObjectWrapper;
import com.google.android.gms.internal.base.C1091zaa;
import com.google.android.gms.internal.base.C1093zac;

/* renamed from: com.google.android.gms.common.internal.zam */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0497zam extends C1091zaa implements IInterface {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0497zam(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    public final C0661IObjectWrapper zae(C0661IObjectWrapper iObjectWrapper, C0508zax zax) throws RemoteException {
        Parcel zaa = zaa();
        C1093zac.zad(zaa, iObjectWrapper);
        C1093zac.zac(zaa, zax);
        Parcel zab = zab(2, zaa);
        C0661IObjectWrapper asInterface = C0661IObjectWrapper.Stub.asInterface(zab.readStrongBinder());
        zab.recycle();
        return asInterface;
    }
}
