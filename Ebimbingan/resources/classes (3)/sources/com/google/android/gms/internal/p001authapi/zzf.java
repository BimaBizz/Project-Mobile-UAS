package com.google.android.gms.internal.p001authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.auth-api.zzf  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class zzf {
    private static final ClassLoader zzf = zzf.class.getClassLoader();

    private zzf() {
    }

    public static <T extends Parcelable> T zzc(Parcel parcel, Parcelable.Creator<T> creator) {
        Parcel parcel2 = parcel;
        Parcelable.Creator<T> creator2 = creator;
        if (parcel2.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator2.createFromParcel(parcel2);
    }

    public static void zzc(Parcel parcel, Parcelable parcelable) {
        Parcel parcel2 = parcel;
        Parcelable parcelable2 = parcelable;
        if (parcelable2 == null) {
            parcel2.writeInt(0);
            return;
        }
        parcel2.writeInt(1);
        parcelable2.writeToParcel(parcel2, 0);
    }

    public static void zzc(Parcel parcel, IInterface iInterface) {
        Parcel parcel2 = parcel;
        IInterface iInterface2 = iInterface;
        if (iInterface2 == null) {
            parcel2.writeStrongBinder((IBinder) null);
        } else {
            parcel2.writeStrongBinder(iInterface2.asBinder());
        }
    }
}
