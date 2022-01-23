package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zav;

@SafeParcelable.Class(creator = "SignInResponseCreator")
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR;
    @SafeParcelable.VersionField(id = 1)
    final int zaa;
    @SafeParcelable.Field(getter = "getConnectionResult", id = 2)
    private final ConnectionResult zab;
    @SafeParcelable.Field(getter = "getResolveAccountResponse", id = 3)
    @Nullable
    private final zav zac;

    static {
        Parcelable.Creator<zak> creator;
        new zal();
        CREATOR = creator;
    }

    @SafeParcelable.Constructor
    zak(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) ConnectionResult connectionResult, @SafeParcelable.Param(id = 3) @Nullable zav zav) {
        this.zaa = i;
        this.zab = connectionResult;
        this.zac = zav;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int i2 = i;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeInt(parcel2, 1, this.zaa);
        SafeParcelWriter.writeParcelable(parcel2, 2, this.zab, i2, false);
        SafeParcelWriter.writeParcelable(parcel2, 3, this.zac, i2, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    public final ConnectionResult zaa() {
        return this.zab;
    }

    @Nullable
    public final zav zab() {
        return this.zac;
    }
}
