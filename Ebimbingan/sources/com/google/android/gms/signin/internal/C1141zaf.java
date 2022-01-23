package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C0437IAccountAccessor;
import com.google.android.gms.internal.base.C1091zaa;
import com.google.android.gms.internal.base.C1093zac;

/* renamed from: com.google.android.gms.signin.internal.zaf */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C1141zaf extends C1091zaa implements IInterface {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1141zaf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void zae(int i) throws RemoteException {
        Parcel zaa = zaa();
        zaa.writeInt(i);
        zac(7, zaa);
    }

    public final void zaf(C0437IAccountAccessor iAccountAccessor, int i, boolean z) throws RemoteException {
        Parcel zaa = zaa();
        C1093zac.zad(zaa, iAccountAccessor);
        zaa.writeInt(i);
        C1093zac.zaa(zaa, z);
        zac(9, zaa);
    }

    public final void zag(C1144zai zai, C1140zae zae) throws RemoteException {
        Parcel zaa = zaa();
        C1093zac.zac(zaa, zai);
        C1093zac.zad(zaa, zae);
        zac(12, zaa);
    }
}
