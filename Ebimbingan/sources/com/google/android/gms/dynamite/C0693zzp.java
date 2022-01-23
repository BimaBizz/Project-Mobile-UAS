package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C0661IObjectWrapper;
import com.google.android.gms.internal.common.C1107zza;
import com.google.android.gms.internal.common.C1109zzc;

/* renamed from: com.google.android.gms.dynamite.zzp */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0693zzp extends C1107zza implements IInterface {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0693zzp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final C0661IObjectWrapper zze(C0661IObjectWrapper iObjectWrapper, String str, int i, C0661IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zza = zza();
        C1109zzc.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i);
        C1109zzc.zzf(zza, iObjectWrapper2);
        Parcel zzB = zzB(2, zza);
        C0661IObjectWrapper asInterface = C0661IObjectWrapper.Stub.asInterface(zzB.readStrongBinder());
        zzB.recycle();
        return asInterface;
    }

    public final C0661IObjectWrapper zzf(C0661IObjectWrapper iObjectWrapper, String str, int i, C0661IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zza = zza();
        C1109zzc.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i);
        C1109zzc.zzf(zza, iObjectWrapper2);
        Parcel zzB = zzB(3, zza);
        C0661IObjectWrapper asInterface = C0661IObjectWrapper.Stub.asInterface(zzB.readStrongBinder());
        zzB.recycle();
        return asInterface;
    }
}
