package com.google.android.gms.internal.gcm;

import android.os.Parcel;
import android.os.Parcelable;

public class zze {
    private static final ClassLoader zzf = zze.class.getClassLoader();

    private zze() {
    }

    public static void zzd(Parcel parcel, Parcelable parcelable) {
        Parcel parcel2 = parcel;
        Parcelable parcelable2 = parcelable;
        if (parcelable2 == null) {
            parcel2.writeInt(0);
            return;
        }
        parcel2.writeInt(1);
        parcelable2.writeToParcel(parcel2, 0);
    }
}
