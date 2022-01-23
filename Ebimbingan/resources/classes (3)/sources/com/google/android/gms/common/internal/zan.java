package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zan implements Parcelable.Creator<MethodInvocation> {
    public zan() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        int i;
        int i2;
        long j;
        long j2;
        String str;
        String str2;
        int i3;
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        long j3 = 0;
        long j4 = 0;
        String str3 = null;
        String str4 = null;
        int i7 = 0;
        while (true) {
            int i8 = i7;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = SafeParcelReader.readHeader(parcel2);
                switch (SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        i4 = SafeParcelReader.readInt(parcel2, readHeader);
                        i = i5;
                        i2 = i6;
                        j = j3;
                        j2 = j4;
                        str = str3;
                        str2 = str4;
                        i3 = i8;
                        break;
                    case 2:
                        i = SafeParcelReader.readInt(parcel2, readHeader);
                        i2 = i6;
                        j = j3;
                        j2 = j4;
                        str = str3;
                        str2 = str4;
                        i3 = i8;
                        break;
                    case 3:
                        i2 = SafeParcelReader.readInt(parcel2, readHeader);
                        i = i5;
                        j = j3;
                        j2 = j4;
                        str = str3;
                        str2 = str4;
                        i3 = i8;
                        break;
                    case 4:
                        j = SafeParcelReader.readLong(parcel2, readHeader);
                        i = i5;
                        i2 = i6;
                        j2 = j4;
                        str = str3;
                        str2 = str4;
                        i3 = i8;
                        break;
                    case 5:
                        j2 = SafeParcelReader.readLong(parcel2, readHeader);
                        i = i5;
                        i2 = i6;
                        j = j3;
                        str = str3;
                        str2 = str4;
                        i3 = i8;
                        break;
                    case 6:
                        str = SafeParcelReader.createString(parcel2, readHeader);
                        i = i5;
                        i2 = i6;
                        j = j3;
                        j2 = j4;
                        str2 = str4;
                        i3 = i8;
                        break;
                    case 7:
                        str2 = SafeParcelReader.createString(parcel2, readHeader);
                        i = i5;
                        i2 = i6;
                        j = j3;
                        j2 = j4;
                        str = str3;
                        i3 = i8;
                        break;
                    case 8:
                        i3 = SafeParcelReader.readInt(parcel2, readHeader);
                        i = i5;
                        i2 = i6;
                        j = j3;
                        j2 = j4;
                        str = str3;
                        str2 = str4;
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        i = i5;
                        i2 = i6;
                        j = j3;
                        j2 = j4;
                        str = str3;
                        str2 = str4;
                        i3 = i8;
                        break;
                }
                i5 = i;
                i6 = i2;
                j3 = j;
                j4 = j2;
                str3 = str;
                str4 = str2;
                i7 = i3;
            } else {
                SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new MethodInvocation(i4, i5, i6, j3, j4, str3, str4, i8);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MethodInvocation[i];
    }
}
