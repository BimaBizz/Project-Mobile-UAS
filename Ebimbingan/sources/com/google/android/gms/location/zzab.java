package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

public final class zzab implements Parcelable.Creator<LocationRequest> {
    public zzab() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        int i = 102;
        long j = 3600000;
        long j2 = 600000;
        boolean z = false;
        long j3 = Long.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        float f = 0.0f;
        long j4 = 0;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = C0461SafeParcelReader.readHeader(parcel3);
            int i3 = readHeader;
            switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i = C0461SafeParcelReader.readInt(parcel3, i3);
                    break;
                case 2:
                    j = C0461SafeParcelReader.readLong(parcel3, i3);
                    break;
                case 3:
                    j2 = C0461SafeParcelReader.readLong(parcel3, i3);
                    break;
                case 4:
                    z = C0461SafeParcelReader.readBoolean(parcel3, i3);
                    break;
                case 5:
                    j3 = C0461SafeParcelReader.readLong(parcel3, i3);
                    break;
                case 6:
                    i2 = C0461SafeParcelReader.readInt(parcel3, i3);
                    break;
                case 7:
                    f = C0461SafeParcelReader.readFloat(parcel3, i3);
                    break;
                case 8:
                    j4 = C0461SafeParcelReader.readLong(parcel3, i3);
                    break;
                default:
                    C0461SafeParcelReader.skipUnknownField(parcel3, i3);
                    break;
            }
        }
        C0461SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new LocationRequest(i, j, j2, z, j3, i2, f, j4);
        return obj;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationRequest[i];
    }
}
