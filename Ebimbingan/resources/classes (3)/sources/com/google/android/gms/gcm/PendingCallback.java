package com.google.android.gms.gcm;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;

@ShowFirstParty
@VisibleForTesting
public class PendingCallback implements Parcelable, ReflectedParcelable {
    public static final Parcelable.Creator<PendingCallback> CREATOR;
    final IBinder zzan;

    public PendingCallback(Parcel parcel) {
        this.zzan = parcel.readStrongBinder();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        parcel.writeStrongBinder(this.zzan);
    }

    static {
        Parcelable.Creator<PendingCallback> creator;
        new zzj();
        CREATOR = creator;
    }
}
