package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C0661IObjectWrapper;
import com.google.android.gms.internal.common.C1107zza;

/* renamed from: com.google.android.gms.common.internal.zzw */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0543zzw extends C1107zza implements C0545zzy {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0543zzw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    public final C0661IObjectWrapper zzd() throws RemoteException {
        Parcel zzB = zzB(1, zza());
        C0661IObjectWrapper asInterface = C0661IObjectWrapper.Stub.asInterface(zzB.readStrongBinder());
        zzB.recycle();
        return asInterface;
    }

    public final int zze() throws RemoteException {
        Parcel zzB = zzB(2, zza());
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }
}
