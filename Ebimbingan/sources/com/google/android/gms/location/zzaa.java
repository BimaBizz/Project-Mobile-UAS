package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

public final class zzaa implements Parcelable.Creator<LocationAvailability> {
    public zzaa() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        int i = 1000;
        int i2 = 1;
        int i3 = 1;
        long j = 0;
        zzaj[] zzajArr = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = C0461SafeParcelReader.readHeader(parcel3);
            int i4 = readHeader;
            switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i2 = C0461SafeParcelReader.readInt(parcel3, i4);
                    break;
                case 2:
                    i3 = C0461SafeParcelReader.readInt(parcel3, i4);
                    break;
                case 3:
                    j = C0461SafeParcelReader.readLong(parcel3, i4);
                    break;
                case 4:
                    i = C0461SafeParcelReader.readInt(parcel3, i4);
                    break;
                case 5:
                    zzajArr = (zzaj[]) C0461SafeParcelReader.createTypedArray(parcel3, i4, zzaj.CREATOR);
                    break;
                default:
                    C0461SafeParcelReader.skipUnknownField(parcel3, i4);
                    break;
            }
        }
        C0461SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new LocationAvailability(i, i2, i3, j, zzajArr);
        return obj;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationAvailability[i];
    }
}
