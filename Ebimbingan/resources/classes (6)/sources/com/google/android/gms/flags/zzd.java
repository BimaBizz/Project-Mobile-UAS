package com.google.android.gms.flags;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.flags.zzb;
import com.google.android.gms.internal.flags.zzc;

public abstract class zzd extends zzb implements zzc {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzd() {
        super("com.google.android.gms.flags.IFlagProvider");
    }

    public static zzc asInterface(IBinder iBinder) {
        zzc zzc;
        IBinder iBinder2 = iBinder;
        if (iBinder2 == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
        IInterface iInterface = queryLocalInterface;
        if (queryLocalInterface instanceof zzc) {
            return (zzc) iInterface;
        }
        new zze(iBinder2);
        return zzc;
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        Parcel parcel3 = parcel;
        Parcel parcel4 = parcel2;
        int i3 = i2;
        switch (i) {
            case 1:
                init(IObjectWrapper.Stub.asInterface(parcel3.readStrongBinder()));
                parcel4.writeNoException();
                break;
            case 2:
                boolean booleanFlagValue = getBooleanFlagValue(parcel3.readString(), zzc.zza(parcel3), parcel3.readInt());
                parcel4.writeNoException();
                zzc.writeBoolean(parcel4, booleanFlagValue);
                break;
            case 3:
                int intFlagValue = getIntFlagValue(parcel3.readString(), parcel3.readInt(), parcel3.readInt());
                parcel4.writeNoException();
                parcel4.writeInt(intFlagValue);
                break;
            case 4:
                long longFlagValue = getLongFlagValue(parcel3.readString(), parcel3.readLong(), parcel3.readInt());
                parcel4.writeNoException();
                parcel4.writeLong(longFlagValue);
                break;
            case 5:
                String stringFlagValue = getStringFlagValue(parcel3.readString(), parcel3.readString(), parcel3.readInt());
                parcel4.writeNoException();
                parcel4.writeString(stringFlagValue);
                break;
            default:
                return false;
        }
        return true;
    }
}
