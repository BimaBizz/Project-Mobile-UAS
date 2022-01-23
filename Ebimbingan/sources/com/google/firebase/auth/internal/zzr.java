package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.firebase.auth.zzac;
import com.google.firebase.auth.zzx;
import com.google.firebase.auth.zzy;
import java.util.ArrayList;
import java.util.List;

@C0463SafeParcelable.Class(creator = "DefaultMultiFactorSessionCreator")
public final class zzr extends zzy {
    public static final Parcelable.Creator<zzr> CREATOR;
    @C0463SafeParcelable.Field(getter = "getIdToken", id = 1)
    @Nullable
    private String zzib;
    @C0463SafeParcelable.Field(getter = "getPendingCredential", id = 2)
    @Nullable
    private String zzkg;
    @C0463SafeParcelable.Field(getter = "getPhoneMultiFactorInfoList", id = 3)
    @Nullable
    private List<zzac> zzts;

    private zzr() {
    }

    @C0463SafeParcelable.Constructor
    zzr(@C0463SafeParcelable.Param(id = 1) String str, @C0463SafeParcelable.Param(id = 2) String str2, @C0463SafeParcelable.Param(id = 3) List<zzac> list) {
        this.zzib = str;
        this.zzkg = str2;
        this.zzts = list;
    }

    public static zzr zza(List<zzx> list, String str) {
        zzr zzr;
        List<zzac> list2;
        List<zzx> list3 = list;
        String str2 = str;
        Object checkNotNull = C0446Preconditions.checkNotNull(list3);
        String checkNotEmpty = C0446Preconditions.checkNotEmpty(str2);
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
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeString(parcel2, 1, this.zzib, false);
        C0462SafeParcelWriter.writeString(parcel2, 2, this.zzkg, false);
        C0462SafeParcelWriter.writeTypedList(parcel2, 3, this.zzts, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzr> creator;
        new zzu();
        CREATOR = creator;
    }
}
