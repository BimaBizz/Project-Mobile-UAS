package com.google.android.gms.internal.flags;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class zzc {
    private static final ClassLoader zzd = zzc.class.getClassLoader();

    private zzc() {
    }

    public static boolean zza(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static void writeBoolean(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static void zza(Parcel parcel, IInterface iInterface) {
        Parcel parcel2 = parcel;
        IInterface iInterface2 = iInterface;
        if (iInterface2 == null) {
            parcel2.writeStrongBinder((IBinder) null);
        } else {
            parcel2.writeStrongBinder(iInterface2.asBinder());
        }
    }
}
