package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import java.util.List;

@C0463SafeParcelable.Class(creator = "RecordConsentByConsentResultResponseCreator")
/* renamed from: com.google.android.gms.signin.internal.zag */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C1142zag extends C0460AbstractSafeParcelable implements C0231Result {
    public static final Parcelable.Creator<C1142zag> CREATOR;
    @C0463SafeParcelable.Field(getter = "getGrantedScopes", id = 1)
    private final List<String> zaa;
    @C0463SafeParcelable.Field(getter = "getToken", id = 2)
    @Nullable
    private final String zab;

    static {
        Parcelable.Creator<C1142zag> creator;
        new C1143zah();
        CREATOR = creator;
    }

    @C0463SafeParcelable.Constructor
    public C1142zag(@C0463SafeParcelable.Param(id = 1) List<String> list, @C0463SafeParcelable.Param(id = 2) @Nullable String str) {
        this.zaa = list;
        this.zab = str;
    }

    public final C0236Status getStatus() {
        if (this.zab != null) {
            return C0236Status.RESULT_SUCCESS;
        }
        return C0236Status.RESULT_CANCELED;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int i2 = i;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeStringList(parcel2, 1, this.zaa, false);
        C0462SafeParcelWriter.writeString(parcel2, 2, this.zab, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }
}
