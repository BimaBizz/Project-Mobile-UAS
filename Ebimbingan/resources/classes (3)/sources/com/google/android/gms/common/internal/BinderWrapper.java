package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class BinderWrapper implements Parcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<BinderWrapper> CREATOR;
    private IBinder zza;

    static {
        Parcelable.Creator<BinderWrapper> creator;
        new zzh();
        CREATOR = creator;
    }

    @KeepForSdk
    public BinderWrapper(@RecentlyNonNull IBinder iBinder) {
        this.zza = iBinder;
    }

    /* synthetic */ BinderWrapper(Parcel parcel, zzh zzh) {
        zzh zzh2 = zzh;
        this.zza = parcel.readStrongBinder();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int i2 = i;
        parcel.writeStrongBinder(this.zza);
    }
}
