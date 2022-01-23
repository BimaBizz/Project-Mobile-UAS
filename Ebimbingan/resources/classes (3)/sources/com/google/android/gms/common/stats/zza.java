package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class zza implements Parcelable.Creator<WakeLockEvent> {
    public zza() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        long j;
        String str;
        int i;
        ArrayList<String> arrayList;
        long j2;
        String str2;
        int i2;
        String str3;
        String str4;
        int i3;
        float f;
        long j3;
        String str5;
        boolean z;
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        int i4 = 0;
        long j4 = 0;
        int i5 = 0;
        String str6 = null;
        int i6 = 0;
        ArrayList<String> arrayList2 = null;
        String str7 = null;
        long j5 = 0;
        int i7 = 0;
        String str8 = null;
        String str9 = null;
        float f2 = 0.0f;
        long j6 = 0;
        String str10 = null;
        boolean z2 = false;
        while (true) {
            boolean z3 = z2;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = SafeParcelReader.readHeader(parcel2);
                switch (SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        i4 = SafeParcelReader.readInt(parcel2, readHeader);
                        j = j4;
                        str = str6;
                        i = i6;
                        arrayList = arrayList2;
                        j2 = j5;
                        str2 = str8;
                        i2 = i5;
                        str3 = str7;
                        str4 = str9;
                        i3 = i7;
                        f = f2;
                        j3 = j6;
                        str5 = str10;
                        z = z3;
                        break;
                    case 2:
                        j = SafeParcelReader.readLong(parcel2, readHeader);
                        str = str6;
                        i = i6;
                        arrayList = arrayList2;
                        j2 = j5;
                        str2 = str8;
                        i2 = i5;
                        str3 = str7;
                        str4 = str9;
                        i3 = i7;
                        f = f2;
                        j3 = j6;
                        str5 = str10;
                        z = z3;
                        break;
                    case 4:
                        str = SafeParcelReader.createString(parcel2, readHeader);
                        j = j4;
                        i = i6;
                        arrayList = arrayList2;
                        j2 = j5;
                        str2 = str8;
                        i2 = i5;
                        str3 = str7;
                        str4 = str9;
                        i3 = i7;
                        f = f2;
                        j3 = j6;
                        str5 = str10;
                        z = z3;
                        break;
                    case 5:
                        i = SafeParcelReader.readInt(parcel2, readHeader);
                        j = j4;
                        str = str6;
                        arrayList = arrayList2;
                        j2 = j5;
                        str2 = str8;
                        i2 = i5;
                        str3 = str7;
                        str4 = str9;
                        i3 = i7;
                        f = f2;
                        j3 = j6;
                        str5 = str10;
                        z = z3;
                        break;
                    case 6:
                        arrayList = SafeParcelReader.createStringList(parcel2, readHeader);
                        j = j4;
                        str = str6;
                        i = i6;
                        j2 = j5;
                        str2 = str8;
                        i2 = i5;
                        str3 = str7;
                        str4 = str9;
                        i3 = i7;
                        f = f2;
                        j3 = j6;
                        str5 = str10;
                        z = z3;
                        break;
                    case 8:
                        j2 = SafeParcelReader.readLong(parcel2, readHeader);
                        j = j4;
                        str = str6;
                        i = i6;
                        arrayList = arrayList2;
                        str2 = str8;
                        i2 = i5;
                        str3 = str7;
                        str4 = str9;
                        i3 = i7;
                        f = f2;
                        j3 = j6;
                        str5 = str10;
                        z = z3;
                        break;
                    case 10:
                        str2 = SafeParcelReader.createString(parcel2, readHeader);
                        j = j4;
                        str = str6;
                        i = i6;
                        arrayList = arrayList2;
                        j2 = j5;
                        i2 = i5;
                        str3 = str7;
                        str4 = str9;
                        i3 = i7;
                        f = f2;
                        j3 = j6;
                        str5 = str10;
                        z = z3;
                        break;
                    case ConnectionResult.LICENSE_CHECK_FAILED:
                        i2 = SafeParcelReader.readInt(parcel2, readHeader);
                        j = j4;
                        str = str6;
                        i = i6;
                        arrayList = arrayList2;
                        j2 = j5;
                        str2 = str8;
                        str3 = str7;
                        str4 = str9;
                        i3 = i7;
                        f = f2;
                        j3 = j6;
                        str5 = str10;
                        z = z3;
                        break;
                    case 12:
                        str3 = SafeParcelReader.createString(parcel2, readHeader);
                        j = j4;
                        str = str6;
                        i = i6;
                        arrayList = arrayList2;
                        j2 = j5;
                        str2 = str8;
                        i2 = i5;
                        str4 = str9;
                        i3 = i7;
                        f = f2;
                        j3 = j6;
                        str5 = str10;
                        z = z3;
                        break;
                    case 13:
                        str4 = SafeParcelReader.createString(parcel2, readHeader);
                        j = j4;
                        str = str6;
                        i = i6;
                        arrayList = arrayList2;
                        j2 = j5;
                        str2 = str8;
                        i2 = i5;
                        str3 = str7;
                        i3 = i7;
                        f = f2;
                        j3 = j6;
                        str5 = str10;
                        z = z3;
                        break;
                    case 14:
                        i3 = SafeParcelReader.readInt(parcel2, readHeader);
                        j = j4;
                        str = str6;
                        i = i6;
                        arrayList = arrayList2;
                        j2 = j5;
                        str2 = str8;
                        i2 = i5;
                        str3 = str7;
                        str4 = str9;
                        f = f2;
                        j3 = j6;
                        str5 = str10;
                        z = z3;
                        break;
                    case 15:
                        f = SafeParcelReader.readFloat(parcel2, readHeader);
                        j = j4;
                        str = str6;
                        i = i6;
                        arrayList = arrayList2;
                        j2 = j5;
                        str2 = str8;
                        i2 = i5;
                        str3 = str7;
                        str4 = str9;
                        i3 = i7;
                        j3 = j6;
                        str5 = str10;
                        z = z3;
                        break;
                    case 16:
                        j3 = SafeParcelReader.readLong(parcel2, readHeader);
                        j = j4;
                        str = str6;
                        i = i6;
                        arrayList = arrayList2;
                        j2 = j5;
                        str2 = str8;
                        i2 = i5;
                        str3 = str7;
                        str4 = str9;
                        i3 = i7;
                        f = f2;
                        str5 = str10;
                        z = z3;
                        break;
                    case 17:
                        str5 = SafeParcelReader.createString(parcel2, readHeader);
                        j = j4;
                        str = str6;
                        i = i6;
                        arrayList = arrayList2;
                        j2 = j5;
                        str2 = str8;
                        i2 = i5;
                        str3 = str7;
                        str4 = str9;
                        i3 = i7;
                        f = f2;
                        j3 = j6;
                        z = z3;
                        break;
                    case ConnectionResult.SERVICE_UPDATING:
                        z = SafeParcelReader.readBoolean(parcel2, readHeader);
                        j = j4;
                        str = str6;
                        i = i6;
                        arrayList = arrayList2;
                        j2 = j5;
                        str2 = str8;
                        i2 = i5;
                        str3 = str7;
                        str4 = str9;
                        i3 = i7;
                        f = f2;
                        j3 = j6;
                        str5 = str10;
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        j = j4;
                        str = str6;
                        i = i6;
                        arrayList = arrayList2;
                        j2 = j5;
                        str2 = str8;
                        i2 = i5;
                        str3 = str7;
                        str4 = str9;
                        i3 = i7;
                        f = f2;
                        j3 = j6;
                        str5 = str10;
                        z = z3;
                        break;
                }
                j4 = j;
                i5 = i2;
                str6 = str;
                i6 = i;
                arrayList2 = arrayList;
                str7 = str3;
                j5 = j2;
                i7 = i3;
                str8 = str2;
                str9 = str4;
                f2 = f;
                j6 = j3;
                str10 = str5;
                z2 = z;
            } else {
                SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new WakeLockEvent(i4, j4, i5, str6, i6, arrayList2, str7, j5, i7, str8, str9, f2, j6, str10, z3);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new WakeLockEvent[i];
    }
}
