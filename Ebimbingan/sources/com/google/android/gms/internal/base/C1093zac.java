package com.google.android.gms.internal.base;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.base.zac */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C1093zac {
    private static final ClassLoader zaa = C1093zac.class.getClassLoader();

    private C1093zac() {
    }

    public static void zaa(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static <T extends Parcelable> T zab(Parcel parcel, Parcelable.Creator<T> creator) {
        Parcel parcel2 = parcel;
        Parcelable.Creator<T> creator2 = creator;
        if (parcel2.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator2.createFromParcel(parcel2);
    }

    public static void zac(Parcel parcel, Parcelable parcelable) {
        Parcel parcel2 = parcel;
        Parcelable parcelable2 = parcelable;
        if (parcelable2 == null) {
            parcel2.writeInt(0);
            return;
        }
        parcel2.writeInt(1);
        parcelable2.writeToParcel(parcel2, 0);
    }

    public static void zad(Parcel parcel, IInterface iInterface) {
        Parcel parcel2 = parcel;
        IInterface iInterface2 = iInterface;
        if (iInterface2 == null) {
            parcel2.writeStrongBinder((IBinder) null);
        } else {
            parcel2.writeStrongBinder(iInterface2.asBinder());
        }
    }
}
