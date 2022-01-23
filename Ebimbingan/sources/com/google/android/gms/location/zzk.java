package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

public final class zzk implements Parcelable.Creator<zzj> {
    public zzk() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        boolean z = true;
        long j = 50;
        float f = 0.0f;
        long j2 = Long.MAX_VALUE;
        int i = Integer.MAX_VALUE;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = C0461SafeParcelReader.readHeader(parcel3);
            int i2 = readHeader;
            switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    z = C0461SafeParcelReader.readBoolean(parcel3, i2);
                    break;
                case 2:
                    j = C0461SafeParcelReader.readLong(parcel3, i2);
                    break;
                case 3:
                    f = C0461SafeParcelReader.readFloat(parcel3, i2);
                    break;
                case 4:
                    j2 = C0461SafeParcelReader.readLong(parcel3, i2);
                    break;
                case 5:
                    i = C0461SafeParcelReader.readInt(parcel3, i2);
                    break;
                default:
                    C0461SafeParcelReader.skipUnknownField(parcel3, i2);
                    break;
            }
        }
        C0461SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new zzj(z, j, f, j2, i);
        return obj;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzj[i];
    }
}
