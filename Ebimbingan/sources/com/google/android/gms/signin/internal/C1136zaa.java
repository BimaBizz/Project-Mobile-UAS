package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;

@C0463SafeParcelable.Class(creator = "AuthAccountResultCreator")
/* renamed from: com.google.android.gms.signin.internal.zaa */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C1136zaa extends C0460AbstractSafeParcelable implements C0231Result {
    public static final Parcelable.Creator<C1136zaa> CREATOR;
    @C0463SafeParcelable.VersionField(id = 1)
    final int zaa;
    @C0463SafeParcelable.Field(getter = "getConnectionResultCode", id = 2)
    private int zab;
    @C0463SafeParcelable.Field(getter = "getRawAuthResolutionIntent", id = 3)
    @Nullable
    private Intent zac;

    static {
        Parcelable.Creator<C1136zaa> creator;
        new C1137zab();
        CREATOR = creator;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C1136zaa() {
        this(2, 0, (Intent) null);
    }

    public final C0236Status getStatus() {
        if (this.zab == 0) {
            return C0236Status.RESULT_SUCCESS;
        }
        return C0236Status.RESULT_CANCELED;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeInt(parcel2, 1, this.zaa);
        C0462SafeParcelWriter.writeInt(parcel2, 2, this.zab);
        C0462SafeParcelWriter.writeParcelable(parcel2, 3, this.zac, i, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    @C0463SafeParcelable.Constructor
    C1136zaa(@C0463SafeParcelable.Param(id = 1) int i, @C0463SafeParcelable.Param(id = 2) int i2, @C0463SafeParcelable.Param(id = 3) @Nullable Intent intent) {
        this.zaa = i;
        this.zab = i2;
        this.zac = intent;
    }
}
