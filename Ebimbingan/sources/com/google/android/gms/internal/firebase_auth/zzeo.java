package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.safeparcel.C0460AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.android.gms.common.util.C0615Strings;
import com.google.android.gms.internal.firebase_auth.zzp;
import com.google.firebase.auth.zzf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@C0463SafeParcelable.Class(creator = "GetAccountInfoUserListCreator")
@C0463SafeParcelable.Reserved({1})
public final class zzeo extends C0460AbstractSafeParcelable {
    public static final Parcelable.Creator<zzeo> CREATOR;
    @C0463SafeParcelable.Field(getter = "getUsers", id = 2)
    private List<zzem> zzrt;

    public zzeo() {
        List<zzem> list;
        new ArrayList();
        this.zzrt = list;
    }

    @C0463SafeParcelable.Constructor
    zzeo(@C0463SafeParcelable.Param(id = 2) List<zzem> list) {
        List<zzem> unmodifiableList;
        List<zzem> list2 = list;
        if (list2 == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list2);
        }
        this.zzrt = unmodifiableList;
    }

    public final List<zzem> zzer() {
        return this.zzrt;
    }

    public static zzeo zza(zzeo zzeo) {
        zzeo zzeo2;
        zzeo zzeo3 = zzeo;
        Object checkNotNull = C0446Preconditions.checkNotNull(zzeo3);
        List<zzem> list = zzeo3.zzrt;
        new zzeo();
        zzeo zzeo4 = zzeo2;
        if (list != null && !list.isEmpty()) {
            boolean addAll = zzeo4.zzrt.addAll(list);
        }
        return zzeo4;
    }

    public static zzeo zza(zzp.zzg zzg) {
        List list;
        zzeo zzeo;
        Object obj;
        zzp.zzg zzg2 = zzg;
        new ArrayList(zzg2.zzy());
        List list2 = list;
        for (int i = 0; i < zzg2.zzy(); i++) {
            zzz zzb = zzg2.zzb(i);
            new zzem(C0615Strings.emptyToNull(zzb.getLocalId()), C0615Strings.emptyToNull(zzb.getEmail()), zzb.zzao(), C0615Strings.emptyToNull(zzb.getDisplayName()), C0615Strings.emptyToNull(zzb.zzam()), zzey.zze(zzb.zzal()), C0615Strings.emptyToNull(zzb.zzbu()), C0615Strings.emptyToNull(zzb.getPhoneNumber()), zzb.zzbt(), zzb.zzbs(), false, (zzf) null, zzeu.zzd(zzb.zzbc()));
            boolean add = list2.add(obj);
        }
        new zzeo(list2);
        return zzeo;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeTypedList(parcel2, 2, this.zzrt, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzeo> creator;
        new zzer();
        CREATOR = creator;
    }
}
