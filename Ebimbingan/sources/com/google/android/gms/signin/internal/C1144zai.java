package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0504zat;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0463SafeParcelable.Class(creator = "SignInRequestCreator")
/* renamed from: com.google.android.gms.signin.internal.zai */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C1144zai extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<C1144zai> CREATOR;
    @C0463SafeParcelable.VersionField(id = 1)
    final int zaa;
    @C0463SafeParcelable.Field(getter = "getResolveAccountRequest", id = 2)
    final C0504zat zab;

    static {
        Parcelable.Creator<C1144zai> creator;
        new C1145zaj();
        CREATOR = creator;
    }

    @C0463SafeParcelable.Constructor
    C1144zai(@C0463SafeParcelable.Param(id = 1) int i, @C0463SafeParcelable.Param(id = 2) C0504zat zat) {
        this.zaa = i;
        this.zab = zat;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeInt(parcel2, 1, this.zaa);
        C0462SafeParcelWriter.writeParcelable(parcel2, 2, this.zab, i, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }
}
