package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.zzac;
import com.google.firebase.auth.zzx;
import com.google.firebase.auth.zzy;
import java.util.ArrayList;
import java.util.List;

@SafeParcelable.Class(creator = "DefaultMultiFactorSessionCreator")
public final class zzr extends zzy {
    public static final Parcelable.Creator<zzr> CREATOR;
    @SafeParcelable.Field(getter = "getIdToken", id = 1)
    @Nullable
    private String zzib;
    @SafeParcelable.Field(getter = "getPendingCredential", id = 2)
    @Nullable
    private String zzkg;
    @SafeParcelable.Field(getter = "getPhoneMultiFactorInfoList", id = 3)
    @Nullable
    private List<zzac> zzts;

    private zzr() {
    }

    @SafeParcelable.Constructor
    zzr(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) List<zzac> list) {
        this.zzib = str;
        this.zzkg = str2;
        this.zzts = list;
    }

    public static zzr zza(List<zzx> list, String str) {
        zzr zzr;
        List<zzac> list2;
        List<zzx> list3 = list;
        String str2 = str;
        Object checkNotNull = Preconditions.checkNotNull(list3);
        String checkNotEmpty = Preconditions.checkNotEmpty(str2);
        new zzr();
        zzr zzr2 = zzr;
        zzr zzr3 = zzr2;
        new ArrayList();
        zzr2.zzts = list2;
        for (zzx next : list3) {
            zzx zzx = next;
            if (next instanceof zzac) {
                boolean add = zzr3.zzts.add((zzac) zzx);
            }
        }
        zzr zzr4 = zzr3;
        zzr zzr5 = zzr4;
        zzr4.zzkg = str2;
        return zzr5;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeString(parcel2, 1, this.zzib, false);
        SafeParcelWriter.writeString(parcel2, 2, this.zzkg, false);
        SafeParcelWriter.writeTypedList(parcel2, 3, this.zzts, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzr> creator;
        new zzu();
        CREATOR = creator;
    }
}
