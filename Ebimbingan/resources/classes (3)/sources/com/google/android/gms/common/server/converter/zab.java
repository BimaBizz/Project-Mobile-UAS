package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zab implements Parcelable.Creator<zaa> {
    public zab() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        StringToIntConverter stringToIntConverter;
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        int i = 0;
        StringToIntConverter stringToIntConverter2 = null;
        while (true) {
            StringToIntConverter stringToIntConverter3 = stringToIntConverter2;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = SafeParcelReader.readHeader(parcel2);
                switch (SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        i = SafeParcelReader.readInt(parcel2, readHeader);
                        stringToIntConverter = stringToIntConverter3;
                        break;
                    case 2:
                        stringToIntConverter = (StringToIntConverter) SafeParcelReader.createParcelable(parcel2, readHeader, StringToIntConverter.CREATOR);
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        stringToIntConverter = stringToIntConverter3;
                        break;
                }
                stringToIntConverter2 = stringToIntConverter;
            } else {
                SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new zaa(i, stringToIntConverter3);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zaa[i];
    }
}
