package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.zzac;
import com.google.firebase.auth.zzf;
import com.google.firebase.auth.zzw;
import com.google.firebase.auth.zzx;
import java.util.ArrayList;
import java.util.List;

@SafeParcelable.Class(creator = "DefaultMultiFactorResolverCreator")
public final class zzp extends zzw {
    public static final Parcelable.Creator<zzp> CREATOR;
    @SafeParcelable.Field(getter = "getDefaultOAuthCredential", id = 4)
    private final zzf zzkw;
    @SafeParcelable.Field(getter = "getFirebaseAppName", id = 3)
    private final String zztj;
    @SafeParcelable.Field(getter = "getPhoneMultiFactorInfoList", id = 1)
    private final List<zzac> zzts;
    @SafeParcelable.Field(getter = "getSession", id = 2)
    private final zzr zztt;

    @SafeParcelable.Constructor
    public zzp(@SafeParcelable.Param(id = 1) List<zzac> list, @SafeParcelable.Param(id = 2) zzr zzr, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) @Nullable zzf zzf) {
        List<zzac> list2;
        zzr zzr2 = zzr;
        String str2 = str;
        zzf zzf2 = zzf;
        new ArrayList();
        this.zzts = list2;
        for (zzx next : list) {
            zzx zzx = next;
            if (next instanceof zzac) {
                boolean add = this.zzts.add((zzac) zzx);
            }
        }
        this.zztt = (zzr) Preconditions.checkNotNull(zzr2);
        this.zztj = Preconditions.checkNotEmpty(str2);
        this.zzkw = zzf2;
    }

    /* JADX WARNING: type inference failed for: r8v3, types: [android.os.Parcelable, com.google.firebase.auth.internal.zzr] */
    /* JADX WARNING: type inference failed for: r8v7, types: [android.os.Parcelable, com.google.firebase.auth.zzf] */
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeTypedList(parcel2, 1, this.zzts, false);
        SafeParcelWriter.writeParcelable(parcel2, 2, this.zztt, i2, false);
        SafeParcelWriter.writeString(parcel2, 3, this.zztj, false);
        SafeParcelWriter.writeParcelable(parcel2, 4, this.zzkw, i2, false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzp> creator;
        new zzs();
        CREATOR = creator;
    }
}
