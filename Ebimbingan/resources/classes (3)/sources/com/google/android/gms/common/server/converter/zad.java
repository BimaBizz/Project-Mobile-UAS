package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zad implements Parcelable.Creator<StringToIntConverter> {
    public zad() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        ArrayList<zac> arrayList;
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        int i = 0;
        ArrayList<zac> arrayList2 = null;
        while (true) {
            ArrayList<zac> arrayList3 = arrayList2;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = SafeParcelReader.readHeader(parcel2);
                switch (SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        i = SafeParcelReader.readInt(parcel2, readHeader);
                        arrayList = arrayList3;
                        break;
                    case 2:
                        arrayList = SafeParcelReader.createTypedList(parcel2, readHeader, zac.CREATOR);
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        arrayList = arrayList3;
                        break;
                }
                arrayList2 = arrayList;
            } else {
                SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new StringToIntConverter(i, arrayList3);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new StringToIntConverter[i];
    }
}
