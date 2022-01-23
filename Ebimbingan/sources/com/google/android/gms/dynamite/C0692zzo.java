package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C0661IObjectWrapper;
import com.google.android.gms.internal.common.C1107zza;
import com.google.android.gms.internal.common.C1109zzc;

/* renamed from: com.google.android.gms.dynamite.zzo */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0692zzo extends C1107zza implements IInterface {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0692zzo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final C0661IObjectWrapper zze(C0661IObjectWrapper iObjectWrapper, String str, int i) throws RemoteException {
        Parcel zza = zza();
        C1109zzc.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i);
        Parcel zzB = zzB(2, zza);
        C0661IObjectWrapper asInterface = C0661IObjectWrapper.Stub.asInterface(zzB.readStrongBinder());
        zzB.recycle();
        return asInterface;
    }

    public final int zzf(C0661IObjectWrapper iObjectWrapper, String str, boolean z) throws RemoteException {
        Parcel zza = zza();
        C1109zzc.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        C1109zzc.zzb(zza, z);
        Parcel zzB = zzB(3, zza);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final C0661IObjectWrapper zzg(C0661IObjectWrapper iObjectWrapper, String str, int i) throws RemoteException {
        Parcel zza = zza();
        C1109zzc.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i);
        Parcel zzB = zzB(4, zza);
        C0661IObjectWrapper asInterface = C0661IObjectWrapper.Stub.asInterface(zzB.readStrongBinder());
        zzB.recycle();
        return asInterface;
    }

    public final int zzh(C0661IObjectWrapper iObjectWrapper, String str, boolean z) throws RemoteException {
        Parcel zza = zza();
        C1109zzc.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        C1109zzc.zzb(zza, z);
        Parcel zzB = zzB(5, zza);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final int zzi() throws RemoteException {
        Parcel zzB = zzB(6, zza());
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final C0661IObjectWrapper zzj(C0661IObjectWrapper iObjectWrapper, String str, boolean z, long j) throws RemoteException {
        Parcel zza = zza();
        C1109zzc.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        C1109zzc.zzb(zza, z);
        zza.writeLong(j);
        Parcel zzB = zzB(7, zza);
        C0661IObjectWrapper asInterface = C0661IObjectWrapper.Stub.asInterface(zzB.readStrongBinder());
        zzB.recycle();
        return asInterface;
    }

    public final C0661IObjectWrapper zzk(C0661IObjectWrapper iObjectWrapper, String str, int i, C0661IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zza = zza();
        C1109zzc.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i);
        C1109zzc.zzf(zza, iObjectWrapper2);
        Parcel zzB = zzB(8, zza);
        C0661IObjectWrapper asInterface = C0661IObjectWrapper.Stub.asInterface(zzB.readStrongBinder());
        zzB.recycle();
        return asInterface;
    }
}
