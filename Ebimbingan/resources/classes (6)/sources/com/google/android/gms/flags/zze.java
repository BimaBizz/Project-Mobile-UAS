package com.google.android.gms.flags;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.flags.zza;
import com.google.android.gms.internal.flags.zzc;

public final class zze extends zza implements zzc {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zze(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.flags.IFlagProvider");
    }

    public final void init(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzc.zza(zza, iObjectWrapper);
        zzb(1, zza);
    }

    public final boolean getBooleanFlagValue(String str, boolean z, int i) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zza.writeString(str);
        zzc.writeBoolean(parcel, z);
        parcel.writeInt(i);
        Parcel zza2 = zza(2, parcel);
        boolean zza3 = zzc.zza(zza2);
        zza2.recycle();
        return zza3;
    }

    public final int getIntFlagValue(String str, int i, int i2) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zza.writeString(str);
        parcel.writeInt(i);
        parcel.writeInt(i2);
        Parcel zza2 = zza(3, parcel);
        int readInt = zza2.readInt();
        zza2.recycle();
        return readInt;
    }

    public final long getLongFlagValue(String str, long j, int i) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zza.writeString(str);
        parcel.writeLong(j);
        parcel.writeInt(i);
        Parcel zza2 = zza(4, parcel);
        long readLong = zza2.readLong();
        zza2.recycle();
        return readLong;
    }

    public final String getStringFlagValue(String str, String str2, int i) throws RemoteException {
        Parcel zza = zza();
        Parcel parcel = zza;
        zza.writeString(str);
        parcel.writeString(str2);
        parcel.writeInt(i);
        Parcel zza2 = zza(5, parcel);
        String readString = zza2.readString();
        zza2.recycle();
        return readString;
    }
}
