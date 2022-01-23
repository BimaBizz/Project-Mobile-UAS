package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.firebase.auth.internal.zzap;
import com.google.firebase.auth.zzf;
import com.google.firebase.auth.zzx;
import java.util.List;

@C0463SafeParcelable.Class(creator = "OnFailedMfaSignInAidlResponseCreator")
public final class zzeb extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<zzeb> CREATOR;
    @C0463SafeParcelable.Field(getter = "getDefaultOAuthCredential", id = 3)
    private zzf zzkw;
    @C0463SafeParcelable.Field(getter = "getMfaPendingCredential", id = 1)
    private String zzkx;
    @C0463SafeParcelable.Field(getter = "getMfaInfoList", id = 2)
    private List<zzeu> zzky;

    @C0463SafeParcelable.Constructor
    public zzeb(@C0463SafeParcelable.Param(id = 1) String str, @C0463SafeParcelable.Param(id = 2) List<zzeu> list, @C0463SafeParcelable.Param(id = 3) @Nullable zzf zzf) {
        this.zzkx = str;
        this.zzky = list;
        this.zzkw = zzf;
    }

    public final String zzbb() {
        return this.zzkx;
    }

    public final zzf zzdo() {
        return this.zzkw;
    }

    public final List<zzx> zzdp() {
        return zzap.zzg(this.zzky);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeString(parcel2, 1, this.zzkx, false);
        C0462SafeParcelWriter.writeTypedList(parcel2, 2, this.zzky, false);
        C0462SafeParcelWriter.writeParcelable(parcel2, 3, this.zzkw, i, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzeb> creator;
        new zzea();
        CREATOR = creator;
    }
}
