package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;
import com.google.android.gms.internal.location.zzbh;
import java.util.ArrayList;

public final class zzq implements Parcelable.Creator<GeofencingRequest> {
    public zzq() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        ArrayList<zzbh> arrayList = null;
        int i = 0;
        String str = "";
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = C0461SafeParcelReader.readHeader(parcel3);
            int i2 = readHeader;
            switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    arrayList = C0461SafeParcelReader.createTypedList(parcel3, i2, zzbh.CREATOR);
                    break;
                case 2:
                    i = C0461SafeParcelReader.readInt(parcel3, i2);
                    break;
                case 3:
                    str = C0461SafeParcelReader.createString(parcel3, i2);
                    break;
                default:
                    C0461SafeParcelReader.skipUnknownField(parcel3, i2);
                    break;
            }
        }
        C0461SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new GeofencingRequest(arrayList, i, str);
        return obj;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GeofencingRequest[i];
    }
}
