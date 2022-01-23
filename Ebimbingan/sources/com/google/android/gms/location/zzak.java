package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

public final class zzak implements Parcelable.Creator<zzaj> {
    public zzak() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        int i = 1;
        int i2 = 1;
        long j = -1;
        long j2 = -1;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = C0461SafeParcelReader.readHeader(parcel3);
            int i3 = readHeader;
            switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i = C0461SafeParcelReader.readInt(parcel3, i3);
                    break;
                case 2:
                    i2 = C0461SafeParcelReader.readInt(parcel3, i3);
                    break;
                case 3:
                    j = C0461SafeParcelReader.readLong(parcel3, i3);
                    break;
                case 4:
                    j2 = C0461SafeParcelReader.readLong(parcel3, i3);
                    break;
                default:
                    C0461SafeParcelReader.skipUnknownField(parcel3, i3);
                    break;
            }
        }
        C0461SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new zzaj(i, i2, j, j2);
        return obj;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaj[i];
    }
}
