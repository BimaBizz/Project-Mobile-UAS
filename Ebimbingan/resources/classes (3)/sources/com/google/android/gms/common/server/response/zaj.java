package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zaj implements Parcelable.Creator<FastJsonResponse.Field> {
    public zaj() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        int i;
        boolean z;
        int i2;
        boolean z2;
        String str;
        int i3;
        String str2;
        zaa zaa;
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        int i4 = 0;
        int i5 = 0;
        boolean z3 = false;
        int i6 = 0;
        boolean z4 = false;
        String str3 = null;
        int i7 = 0;
        String str4 = null;
        zaa zaa2 = null;
        while (true) {
            zaa zaa3 = zaa2;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = SafeParcelReader.readHeader(parcel2);
                switch (SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        i4 = SafeParcelReader.readInt(parcel2, readHeader);
                        i = i5;
                        z = z3;
                        i2 = i6;
                        z2 = z4;
                        str = str3;
                        i3 = i7;
                        str2 = str4;
                        zaa = zaa3;
                        break;
                    case 2:
                        i = SafeParcelReader.readInt(parcel2, readHeader);
                        z = z3;
                        i2 = i6;
                        z2 = z4;
                        str = str3;
                        i3 = i7;
                        str2 = str4;
                        zaa = zaa3;
                        break;
                    case 3:
                        z = SafeParcelReader.readBoolean(parcel2, readHeader);
                        i = i5;
                        i2 = i6;
                        z2 = z4;
                        str = str3;
                        i3 = i7;
                        str2 = str4;
                        zaa = zaa3;
                        break;
                    case 4:
                        i2 = SafeParcelReader.readInt(parcel2, readHeader);
                        i = i5;
                        z = z3;
                        z2 = z4;
                        str = str3;
                        i3 = i7;
                        str2 = str4;
                        zaa = zaa3;
                        break;
                    case 5:
                        z2 = SafeParcelReader.readBoolean(parcel2, readHeader);
                        i = i5;
                        z = z3;
                        i2 = i6;
                        str = str3;
                        i3 = i7;
                        str2 = str4;
                        zaa = zaa3;
                        break;
                    case 6:
                        str = SafeParcelReader.createString(parcel2, readHeader);
                        i = i5;
                        z = z3;
                        i2 = i6;
                        z2 = z4;
                        i3 = i7;
                        str2 = str4;
                        zaa = zaa3;
                        break;
                    case 7:
                        i3 = SafeParcelReader.readInt(parcel2, readHeader);
                        i = i5;
                        z = z3;
                        i2 = i6;
                        z2 = z4;
                        str = str3;
                        str2 = str4;
                        zaa = zaa3;
                        break;
                    case 8:
                        str2 = SafeParcelReader.createString(parcel2, readHeader);
                        i = i5;
                        z = z3;
                        i2 = i6;
                        z2 = z4;
                        str = str3;
                        i3 = i7;
                        zaa = zaa3;
                        break;
                    case ConnectionResult.SERVICE_INVALID:
                        zaa = (zaa) SafeParcelReader.createParcelable(parcel2, readHeader, zaa.CREATOR);
                        i = i5;
                        z = z3;
                        i2 = i6;
                        z2 = z4;
                        str = str3;
                        i3 = i7;
                        str2 = str4;
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        i = i5;
                        z = z3;
                        i2 = i6;
                        z2 = z4;
                        str = str3;
                        i3 = i7;
                        str2 = str4;
                        zaa = zaa3;
                        break;
                }
                i5 = i;
                z3 = z;
                i6 = i2;
                z4 = z2;
                str3 = str;
                i7 = i3;
                str4 = str2;
                zaa2 = zaa;
            } else {
                SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new FastJsonResponse.Field(i4, i5, z3, i6, z4, str3, i7, str4, zaa3);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FastJsonResponse.Field[i];
    }
}
