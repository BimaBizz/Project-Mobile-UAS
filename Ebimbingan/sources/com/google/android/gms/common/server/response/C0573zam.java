package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0452ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.android.gms.common.server.response.C0557FastJsonResponse;

@C0452ShowFirstParty
@C0463SafeParcelable.Class(creator = "FieldMapPairCreator")
/* renamed from: com.google.android.gms.common.server.response.zam */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0573zam extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<C0573zam> CREATOR;
    @C0463SafeParcelable.VersionField(id = 1)
    final int zaa;
    @C0463SafeParcelable.Field(id = 2)
    final String zab;
    @C0463SafeParcelable.Field(id = 3)
    final C0557FastJsonResponse.Field<?, ?> zac;

    static {
        Parcelable.Creator<C0573zam> creator;
        new C0571zak();
        CREATOR = creator;
    }

    @C0463SafeParcelable.Constructor
    C0573zam(@C0463SafeParcelable.Param(id = 1) int i, @C0463SafeParcelable.Param(id = 2) String str, @C0463SafeParcelable.Param(id = 3) C0557FastJsonResponse.Field<?, ?> field) {
        this.zaa = i;
        this.zab = str;
        this.zac = field;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeInt(parcel2, 1, this.zaa);
        C0462SafeParcelWriter.writeString(parcel2, 2, this.zab, false);
        C0462SafeParcelWriter.writeParcelable(parcel2, 3, this.zac, i, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    C0573zam(String str, C0557FastJsonResponse.Field<?, ?> field) {
        this.zaa = 1;
        this.zab = str;
        this.zac = field;
    }
}
