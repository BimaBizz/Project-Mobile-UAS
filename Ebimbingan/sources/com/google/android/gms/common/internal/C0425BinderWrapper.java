package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.annotation.C0209KeepName;

@C0209KeepName
@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.internal.BinderWrapper */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0425BinderWrapper implements Parcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<C0425BinderWrapper> CREATOR;
    private IBinder zza;

    static {
        Parcelable.Creator<C0425BinderWrapper> creator;
        new C0528zzh();
        CREATOR = creator;
    }

    @C0206KeepForSdk
    public C0425BinderWrapper(@RecentlyNonNull IBinder iBinder) {
        this.zza = iBinder;
    }

    /* synthetic */ C0425BinderWrapper(Parcel parcel, C0528zzh zzh) {
        C0528zzh zzh2 = zzh;
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
