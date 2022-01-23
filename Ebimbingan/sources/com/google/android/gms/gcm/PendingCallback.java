package com.google.android.gms.gcm;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0447ReflectedParcelable;
import com.google.android.gms.common.internal.C0452ShowFirstParty;
import com.google.android.gms.common.util.C0617VisibleForTesting;

@C0452ShowFirstParty
@C0617VisibleForTesting
public class PendingCallback implements Parcelable, C0447ReflectedParcelable {
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
