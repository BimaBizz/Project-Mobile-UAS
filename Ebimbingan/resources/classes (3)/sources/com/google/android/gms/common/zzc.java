package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class zzc implements Parcelable.Creator<Feature> {
    public zzc() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        int i;
        long j;
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        String str = null;
        int i2 = 0;
        long j2 = -1;
        while (true) {
            long j3 = j2;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = SafeParcelReader.readHeader(parcel2);
                switch (SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        str = SafeParcelReader.createString(parcel2, readHeader);
                        i = i2;
                        j = j3;
                        break;
                    case 2:
                        i = SafeParcelReader.readInt(parcel2, readHeader);
                        j = j3;
                        break;
                    case 3:
                        j = SafeParcelReader.readLong(parcel2, readHeader);
                        i = i2;
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        i = i2;
                        j = j3;
                        break;
                }
                i2 = i;
                j2 = j;
            } else {
                SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new Feature(str, i2, j3);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Feature[i];
    }
}
