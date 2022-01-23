package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0426ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;
import com.google.android.gms.location.zzj;
import java.util.ArrayList;

public final class zzn implements Parcelable.Creator<zzm> {
    public zzn() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        zzj zzj = zzm.zzce;
        ArrayList<C0426ClientIdentity> arrayList = zzm.zzcd;
        String str = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = C0461SafeParcelReader.readHeader(parcel3);
            int i = readHeader;
            switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    zzj = (zzj) C0461SafeParcelReader.createParcelable(parcel3, i, zzj.CREATOR);
                    break;
                case 2:
                    arrayList = C0461SafeParcelReader.createTypedList(parcel3, i, C0426ClientIdentity.CREATOR);
                    break;
                case 3:
                    str = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                default:
                    C0461SafeParcelReader.skipUnknownField(parcel3, i);
                    break;
            }
        }
        C0461SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new zzm(zzj, arrayList, str);
        return obj;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzm[i];
    }
}
