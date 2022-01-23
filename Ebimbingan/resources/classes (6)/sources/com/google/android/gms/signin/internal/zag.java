package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class(creator = "RecordConsentByConsentResultResponseCreator")
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zag extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<zag> CREATOR;
    @SafeParcelable.Field(getter = "getGrantedScopes", id = 1)
    private final List<String> zaa;
    @SafeParcelable.Field(getter = "getToken", id = 2)
    @Nullable
    private final String zab;

    static {
        Parcelable.Creator<zag> creator;
        new zah();
        CREATOR = creator;
    }

    @SafeParcelable.Constructor
    public zag(@SafeParcelable.Param(id = 1) List<String> list, @SafeParcelable.Param(id = 2) @Nullable String str) {
        this.zaa = list;
        this.zab = str;
    }

    public final Status getStatus() {
        if (this.zab != null) {
            return Status.RESULT_SUCCESS;
        }
        return Status.RESULT_CANCELED;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int i2 = i;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeStringList(parcel2, 1, this.zaa, false);
        SafeParcelWriter.writeString(parcel2, 2, this.zab, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }
}
