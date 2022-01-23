package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.zzac;
import com.google.firebase.auth.zzf;
import java.util.ArrayList;

public final class zzs implements Parcelable.Creator<zzp> {
    public zzs() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzp[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        ArrayList arrayList = null;
        zzr zzr = null;
        String str = null;
        zzf zzf = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel3);
            int i = readHeader;
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    arrayList = SafeParcelReader.createTypedList(parcel3, i, zzac.CREATOR);
                    break;
                case 2:
                    zzr = (zzr) SafeParcelReader.createParcelable(parcel3, i, zzr.CREATOR);
                    break;
                case 3:
                    str = SafeParcelReader.createString(parcel3, i);
                    break;
                case 4:
                    zzf = (zzf) SafeParcelReader.createParcelable(parcel3, i, zzf.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel3, i);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new zzp(arrayList, zzr, str, zzf);
        return obj;
    }
}
