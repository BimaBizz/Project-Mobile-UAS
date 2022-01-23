package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class(creator = "FavaDiagnosticsEntityCreator")
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {
    @RecentlyNonNull
    @KeepForSdk
    public static final Parcelable.Creator<FavaDiagnosticsEntity> CREATOR;
    @SafeParcelable.VersionField(id = 1)
    final int zaa;
    @RecentlyNonNull
    @SafeParcelable.Field(id = 2)
    public final String zab;
    @SafeParcelable.Field(id = 3)
    public final int zac;

    static {
        Parcelable.Creator<FavaDiagnosticsEntity> creator;
        new zaa();
        CREATOR = creator;
    }

    @SafeParcelable.Constructor
    public FavaDiagnosticsEntity(@SafeParcelable.Param(id = 1) int i, @RecentlyNonNull @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i2) {
        this.zaa = i;
        this.zab = str;
        this.zac = i2;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int i2 = i;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeInt(parcel2, 1, this.zaa);
        SafeParcelWriter.writeString(parcel2, 2, this.zab, false);
        SafeParcelWriter.writeInt(parcel2, 3, this.zac);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    @KeepForSdk
    public FavaDiagnosticsEntity(@RecentlyNonNull String str, int i) {
        this.zaa = 1;
        this.zab = str;
        this.zac = i;
    }
}
