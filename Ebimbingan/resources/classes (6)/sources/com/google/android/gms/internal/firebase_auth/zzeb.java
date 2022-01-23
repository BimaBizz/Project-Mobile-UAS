package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.internal.zzap;
import com.google.firebase.auth.zzf;
import com.google.firebase.auth.zzx;
import java.util.List;

@SafeParcelable.Class(creator = "OnFailedMfaSignInAidlResponseCreator")
public final class zzeb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzeb> CREATOR;
    @SafeParcelable.Field(getter = "getDefaultOAuthCredential", id = 3)
    private zzf zzkw;
    @SafeParcelable.Field(getter = "getMfaPendingCredential", id = 1)
    private String zzkx;
    @SafeParcelable.Field(getter = "getMfaInfoList", id = 2)
    private List<zzeu> zzky;

    @SafeParcelable.Constructor
    public zzeb(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) List<zzeu> list, @SafeParcelable.Param(id = 3) @Nullable zzf zzf) {
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

    /* JADX WARNING: type inference failed for: r8v5, types: [android.os.Parcelable, com.google.firebase.auth.zzf] */
    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeString(parcel2, 1, this.zzkx, false);
        SafeParcelWriter.writeTypedList(parcel2, 2, this.zzky, false);
        SafeParcelWriter.writeParcelable(parcel2, 3, this.zzkw, i, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzeb> creator;
        new zzea();
        CREATOR = creator;
    }
}
