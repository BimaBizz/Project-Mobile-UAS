package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.android.gms.common.util.C0615Strings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@C0463SafeParcelable.Class(creator = "ProviderUserInfoListCreator")
@C0463SafeParcelable.Reserved({1})
public final class zzey extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<zzey> CREATOR;
    @C0463SafeParcelable.Field(getter = "getProviderUserInfos", id = 2)
    private List<zzew> zzse;

    public zzey() {
        List<zzew> list;
        new ArrayList();
        this.zzse = list;
    }

    @C0463SafeParcelable.Constructor
    zzey(@C0463SafeParcelable.Param(id = 2) List<zzew> list) {
        List<zzew> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            this.zzse = Collections.emptyList();
            return;
        }
        this.zzse = Collections.unmodifiableList(list2);
    }

    public final List<zzew> zzes() {
        return this.zzse;
    }

    public static zzey zza(zzey zzey) {
        zzey zzey2;
        List<zzew> list = zzey.zzse;
        new zzey();
        zzey zzey3 = zzey2;
        if (list != null) {
            boolean addAll = zzey3.zzse.addAll(list);
        }
        return zzey3;
    }

    public static zzey zze(List<zzu> list) {
        List list2;
        zzey zzey;
        Object obj;
        List<zzu> list3 = list;
        new ArrayList();
        List list4 = list2;
        for (int i = 0; i < list3.size(); i++) {
            zzu zzu = list3.get(i);
            new zzew(C0615Strings.emptyToNull(zzu.zzbo()), C0615Strings.emptyToNull(zzu.getDisplayName()), C0615Strings.emptyToNull(zzu.zzam()), C0615Strings.emptyToNull(zzu.getProviderId()), (String) null, C0615Strings.emptyToNull(zzu.getPhoneNumber()), C0615Strings.emptyToNull(zzu.getEmail()));
            boolean add = list4.add(obj);
        }
        new zzey(list4);
        return zzey;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeTypedList(parcel2, 2, this.zzse, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzey> creator;
        new zzfb();
        CREATOR = creator;
    }
}
