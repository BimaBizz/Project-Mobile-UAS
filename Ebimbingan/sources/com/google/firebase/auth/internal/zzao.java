package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.android.gms.internal.firebase_auth.zzay;
import com.google.firebase.auth.zzac;
import com.google.firebase.auth.zzx;
import java.util.ArrayList;
import java.util.List;

@C0463SafeParcelable.Class(creator = "MultiFactorInfoListCreator")
public final class zzao extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<zzao> CREATOR;
    @C0463SafeParcelable.Field(getter = "getPhoneMultiFactorInfoList", id = 1)
    private final List<zzac> zzts;

    @C0463SafeParcelable.Constructor
    zzao(@C0463SafeParcelable.Param(id = 1) List<zzac> list) {
        List<zzac> list2 = list;
        this.zzts = list2 == null ? zzay.zzce() : list2;
    }

    public static zzao zzf(List<zzx> list) {
        List list2;
        zzao zzao;
        List<zzx> list3 = list;
        if (list3 == null || list3.isEmpty()) {
            return null;
        }
        new ArrayList();
        List list4 = list2;
        for (zzx next : list3) {
            zzx zzx = next;
            if (next instanceof zzac) {
                boolean add = list4.add((zzac) zzx);
            }
        }
        new zzao(list4);
        return zzao;
    }

    public final List<zzx> zzdp() {
        List<zzx> list;
        new ArrayList();
        List<zzx> list2 = list;
        for (zzac add : this.zzts) {
            boolean add2 = list2.add(add);
        }
        return list2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeTypedList(parcel2, 1, this.zzts, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzao> creator;
        new zzar();
        CREATOR = creator;
    }
}
