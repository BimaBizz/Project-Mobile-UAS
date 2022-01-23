package com.google.android.gms.gcm;

import android.os.Parcel;
import android.os.Parcelable;

final class zzi implements Parcelable.Creator<OneoffTask> {
    zzi() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new OneoffTask[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        new OneoffTask(parcel, (zzi) null);
        return obj;
    }
}
