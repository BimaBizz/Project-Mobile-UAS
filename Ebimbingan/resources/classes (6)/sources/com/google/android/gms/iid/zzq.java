package com.google.android.gms.iid;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

final class zzq implements Parcelable.Creator<MessengerCompat> {
    zzq() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MessengerCompat[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        IBinder readStrongBinder = parcel.readStrongBinder();
        IBinder iBinder = readStrongBinder;
        if (readStrongBinder == null) {
            return null;
        }
        new MessengerCompat(iBinder);
        return obj;
    }
}
