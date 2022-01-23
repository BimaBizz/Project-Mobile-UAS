package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.C0463SafeParcelable;
import com.google.firebase.auth.zzac;
import com.google.firebase.auth.zzf;
import com.google.firebase.auth.zzw;
import com.google.firebase.auth.zzx;
import java.util.ArrayList;
import java.util.List;

@C0463SafeParcelable.Class(creator = "DefaultMultiFactorResolverCreator")
public final class zzp extends zzw {
    public static final Parcelable.Creator<zzp> CREATOR;
    @C0463SafeParcelable.Field(getter = "getDefaultOAuthCredential", id = 4)
    private final zzf zzkw;
    @C0463SafeParcelable.Field(getter = "getFirebaseAppName", id = 3)
    private final String zztj;
    @C0463SafeParcelable.Field(getter = "getPhoneMultiFactorInfoList", id = 1)
    private final List<zzac> zzts;
    @C0463SafeParcelable.Field(getter = "getSession", id = 2)
    private final zzr zztt;

    @C0463SafeParcelable.Constructor
    public zzp(@C0463SafeParcelable.Param(id = 1) List<zzac> list, @C0463SafeParcelable.Param(id = 2) zzr zzr, @C0463SafeParcelable.Param(id = 3) String str, @C0463SafeParcelable.Param(id = 4) @Nullable zzf zzf) {
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
        this.zztt = (zzr) C0446Preconditions.checkNotNull(zzr2);
        this.zztj = C0446Preconditions.checkNotEmpty(str2);
        this.zzkw = zzf2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = i;
        Parcel parcel2 = parcel;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeTypedList(parcel2, 1, this.zzts, false);
        C0462SafeParcelWriter.writeParcelable(parcel2, 2, this.zztt, i2, false);
        C0462SafeParcelWriter.writeString(parcel2, 3, this.zztj, false);
        C0462SafeParcelWriter.writeParcelable(parcel2, 4, this.zzkw, i2, false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    static {
        Parcelable.Creator<zzp> creator;
        new zzs();
        CREATOR = creator;
    }
}
