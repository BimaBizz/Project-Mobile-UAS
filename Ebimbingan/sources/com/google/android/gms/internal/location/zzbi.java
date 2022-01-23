package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

public final class zzbi implements Parcelable.Creator<zzbh> {
    public zzbi() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        String str = null;
        int i = 0;
        short s = 0;
        double d = 0.0d;
        double d2 = 0.0d;
        float f = 0.0f;
        long j = 0;
        int i2 = 0;
        int i3 = -1;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = C0461SafeParcelReader.readHeader(parcel3);
            int i4 = readHeader;
            switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    str = C0461SafeParcelReader.createString(parcel3, i4);
                    break;
                case 2:
                    j = C0461SafeParcelReader.readLong(parcel3, i4);
                    break;
                case 3:
                    s = C0461SafeParcelReader.readShort(parcel3, i4);
                    break;
                case 4:
                    d = C0461SafeParcelReader.readDouble(parcel3, i4);
                    break;
                case 5:
                    d2 = C0461SafeParcelReader.readDouble(parcel3, i4);
                    break;
                case 6:
                    f = C0461SafeParcelReader.readFloat(parcel3, i4);
                    break;
                case 7:
                    i = C0461SafeParcelReader.readInt(parcel3, i4);
                    break;
                case 8:
                    i2 = C0461SafeParcelReader.readInt(parcel3, i4);
                    break;
                case 9:
                    i3 = C0461SafeParcelReader.readInt(parcel3, i4);
                    break;
                default:
                    C0461SafeParcelReader.skipUnknownField(parcel3, i4);
                    break;
            }
        }
        C0461SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new zzbh(str, i, s, d, d2, f, j, i2, i3);
        return obj;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbh[i];
    }
}
