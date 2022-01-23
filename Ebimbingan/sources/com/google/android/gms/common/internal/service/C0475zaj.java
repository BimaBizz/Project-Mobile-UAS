package com.google.android.gms.common.internal.service;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.base.C1092zab;

/* renamed from: com.google.android.gms.common.internal.service.zaj */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class C0475zaj extends C1092zab implements C0476zak {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0475zaj() {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        Parcel parcel3 = parcel;
        Parcel parcel4 = parcel2;
        int i3 = i2;
        if (i != 1) {
            return false;
        }
        zab(parcel3.readInt());
        parcel4.writeNoException();
        return true;
    }
}
