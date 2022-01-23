package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "SignInButtonConfigCreator")
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zax> CREATOR;
    @SafeParcelable.VersionField(id = 1)
    final int zaa;
    @SafeParcelable.Field(getter = "getButtonSize", id = 2)
    private final int zab;
    @SafeParcelable.Field(getter = "getColorScheme", id = 3)
    private final int zac;
    @SafeParcelable.Field(getter = "getScopes", id = 4)
    @Deprecated
    @Nullable
    private final Scope[] zad;

    static {
        Parcelable.Creator<zax> creator;
        new zay();
        CREATOR = creator;
    }

    @SafeParcelable.Constructor
    zax(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) @Nullable Scope[] scopeArr) {
        this.zaa = i;
        this.zab = i2;
        this.zac = i3;
        this.zad = scopeArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeInt(parcel2, 1, this.zaa);
        SafeParcelWriter.writeInt(parcel2, 2, this.zab);
        SafeParcelWriter.writeInt(parcel2, 3, this.zac);
        SafeParcelWriter.writeTypedArray(parcel2, 4, this.zad, i, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }
}
