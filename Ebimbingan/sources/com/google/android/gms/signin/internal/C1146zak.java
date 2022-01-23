package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0184ConnectionResult;
import com.google.android.gms.common.internal.C0506zav;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0463SafeParcelable.Class(creator = "SignInResponseCreator")
/* renamed from: com.google.android.gms.signin.internal.zak */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C1146zak extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<C1146zak> CREATOR;
    @C0463SafeParcelable.VersionField(id = 1)
    final int zaa;
    @C0463SafeParcelable.Field(getter = "getConnectionResult", id = 2)
    private final C0184ConnectionResult zab;
    @C0463SafeParcelable.Field(getter = "getResolveAccountResponse", id = 3)
    @Nullable
    private final C0506zav zac;

    static {
        Parcelable.Creator<C1146zak> creator;
        new C1147zal();
        CREATOR = creator;
    }

    @C0463SafeParcelable.Constructor
    C1146zak(@C0463SafeParcelable.Param(id = 1) int i, @C0463SafeParcelable.Param(id = 2) C0184ConnectionResult connectionResult, @C0463SafeParcelable.Param(id = 3) @Nullable C0506zav zav) {
        this.zaa = i;
        this.zab = connectionResult;
        this.zac = zav;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int i2 = i;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeInt(parcel2, 1, this.zaa);
        C0462SafeParcelWriter.writeParcelable(parcel2, 2, this.zab, i2, false);
        C0462SafeParcelWriter.writeParcelable(parcel2, 3, this.zac, i2, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    public final C0184ConnectionResult zaa() {
        return this.zab;
    }

    @Nullable
    public final C0506zav zab() {
        return this.zac;
    }
}
