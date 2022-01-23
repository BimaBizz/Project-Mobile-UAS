package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

public final class zzaf implements Parcelable.Creator<zzae> {
    public zzaf() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        String str = "";
        String str2 = "";
        String str3 = "";
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = C0461SafeParcelReader.readHeader(parcel3);
            int i = readHeader;
            switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    str2 = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                case 2:
                    str3 = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                case 5:
                    str = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                default:
                    C0461SafeParcelReader.skipUnknownField(parcel3, i);
                    break;
            }
        }
        C0461SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new zzae(str, str2, str3);
        return obj;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzae[i];
    }
}
