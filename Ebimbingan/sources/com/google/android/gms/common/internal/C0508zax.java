package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.C0235Scope;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0463SafeParcelable.Class(creator = "SignInButtonConfigCreator")
/* renamed from: com.google.android.gms.common.internal.zax */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0508zax extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<C0508zax> CREATOR;
    @C0463SafeParcelable.VersionField(id = 1)
    final int zaa;
    @C0463SafeParcelable.Field(getter = "getButtonSize", id = 2)
    private final int zab;
    @C0463SafeParcelable.Field(getter = "getColorScheme", id = 3)
    private final int zac;
    @C0463SafeParcelable.Field(getter = "getScopes", id = 4)
    @Deprecated
    @Nullable
    private final C0235Scope[] zad;

    static {
        Parcelable.Creator<C0508zax> creator;
        new C0509zay();
        CREATOR = creator;
    }

    @C0463SafeParcelable.Constructor
    C0508zax(@C0463SafeParcelable.Param(id = 1) int i, @C0463SafeParcelable.Param(id = 2) int i2, @C0463SafeParcelable.Param(id = 3) int i3, @C0463SafeParcelable.Param(id = 4) @Nullable C0235Scope[] scopeArr) {
        this.zaa = i;
        this.zab = i2;
        this.zac = i3;
        this.zad = scopeArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeInt(parcel2, 1, this.zaa);
        C0462SafeParcelWriter.writeInt(parcel2, 2, this.zab);
        C0462SafeParcelWriter.writeInt(parcel2, 3, this.zac);
        C0462SafeParcelWriter.writeTypedArray(parcel2, 4, this.zad, i, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }
}
