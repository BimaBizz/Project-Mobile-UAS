package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zak implements Parcelable.Creator<zam> {
    public zak() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        String str;
        FastJsonResponse.Field field;
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        int i = 0;
        String str2 = null;
        FastJsonResponse.Field field2 = null;
        while (true) {
            FastJsonResponse.Field field3 = field2;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = SafeParcelReader.readHeader(parcel2);
                switch (SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        i = SafeParcelReader.readInt(parcel2, readHeader);
                        str = str2;
                        field = field3;
                        break;
                    case 2:
                        str = SafeParcelReader.createString(parcel2, readHeader);
                        field = field3;
                        break;
                    case 3:
                        field = (FastJsonResponse.Field) SafeParcelReader.createParcelable(parcel2, readHeader, FastJsonResponse.Field.CREATOR);
                        str = str2;
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        str = str2;
                        field = field3;
                        break;
                }
                str2 = str;
                field2 = field;
            } else {
                SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new zam(i, str2, field3);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zam[i];
    }
}
