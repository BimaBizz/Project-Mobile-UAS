package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Strings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class(creator = "StringListCreator")
public final class zzfk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfk> CREATOR;
    @SafeParcelable.VersionField(id = 1)
    private final int versionCode;
    @SafeParcelable.Field(getter = "getValues", id = 2)
    private List<String> zzsm;

    public final List<String> zzez() {
        return this.zzsm;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public zzfk() {
        this((List<String>) null);
    }

    private zzfk(@Nullable List<String> list) {
        List<String> list2;
        List<String> list3 = list;
        this.versionCode = 1;
        new ArrayList();
        this.zzsm = list2;
        if (list3 != null && !list3.isEmpty()) {
            boolean addAll = this.zzsm.addAll(list3);
        }
    }

    @SafeParcelable.Constructor
    zzfk(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) List<String> list) {
        List<String> list2 = list;
        this.versionCode = i;
        if (list2 == null || list2.isEmpty()) {
            this.zzsm = Collections.emptyList();
            return;
        }
        for (int i2 = 0; i2 < list2.size(); i2++) {
            String str = list2.set(i2, Strings.emptyToNull(list2.get(i2)));
        }
        this.zzsm = Collections.unmodifiableList(list2);
    }

    public static zzfk zzfa() {
        zzfk zzfk;
        zzfk zzfk2 = zzfk;
        new zzfk((List<String>) null);
        return zzfk2;
    }

    public static zzfk zza(zzfk zzfk) {
        List<String> list;
        zzfk zzfk2;
        zzfk zzfk3 = zzfk;
        if (zzfk3 != null) {
            list = zzfk3.zzsm;
        } else {
            list = null;
        }
        new zzfk(list);
        return zzfk2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeInt(parcel2, 1, this.versionCode);
        SafeParcelWriter.writeStringList(parcel2, 2, this.zzsm, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzfk> creator;
        new zzfn();
        CREATOR = creator;
    }
}
