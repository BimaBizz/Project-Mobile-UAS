package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import java.util.ArrayList;
import java.util.List;

@C0463SafeParcelable.Class(creator = "MfaInfoCreator")
public final class zzeu extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<zzeu> CREATOR;
    @C0463SafeParcelable.Field(getter = "getDisplayName", id = 3)
    private final String zzjv;
    @C0463SafeParcelable.Field(getter = "getPhoneInfo", id = 1)
    @Nullable
    private final String zzrz;
    @C0463SafeParcelable.Field(getter = "getMfaEnrollmentId", id = 2)
    @NonNull
    private final String zzsa;
    @C0463SafeParcelable.Field(getter = "getEnrolledAtTimestampInSeconds", id = 4)
    private final long zzsb;

    @C0463SafeParcelable.Constructor
    public zzeu(@C0463SafeParcelable.Param(id = 1) String str, @C0463SafeParcelable.Param(id = 2) String str2, @C0463SafeParcelable.Param(id = 3) String str3, @C0463SafeParcelable.Param(id = 4) long j) {
        this.zzrz = str;
        this.zzsa = C0446Preconditions.checkNotEmpty(str2);
        this.zzjv = str3;
        this.zzsb = j;
    }

    @Nullable
    public final String zzbk() {
        return this.zzrz;
    }

    public final String zzbl() {
        return this.zzsa;
    }

    public final String getDisplayName() {
        return this.zzjv;
    }

    public final long zzex() {
        return this.zzsb;
    }

    public static zzeu zza(zzr zzr) {
        zzeu zzeu;
        zzr zzr2 = zzr;
        new zzeu(zzr2.zzbk(), zzr2.zzbl(), zzr2.getDisplayName(), zzr2.zzbm().getSeconds());
        return zzeu;
    }

    public static List<zzeu> zzd(List<zzr> list) {
        List<zzeu> list2;
        List<zzr> list3 = list;
        if (list3 == null) {
            return zzay.zzce();
        }
        new ArrayList();
        List<zzeu> list4 = list2;
        for (zzr zza : list3) {
            boolean add = list4.add(zza(zza));
        }
        return list4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeString(parcel2, 1, this.zzrz, false);
        C0462SafeParcelWriter.writeString(parcel2, 2, this.zzsa, false);
        C0462SafeParcelWriter.writeString(parcel2, 3, this.zzjv, false);
        C0462SafeParcelWriter.writeLong(parcel2, 4, this.zzsb);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzeu> creator;
        new zzex();
        CREATOR = creator;
    }
}
