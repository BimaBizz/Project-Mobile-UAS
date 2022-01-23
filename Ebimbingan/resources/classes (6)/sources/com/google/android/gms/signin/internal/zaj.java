package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zat;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zaj implements Parcelable.Creator<zai> {
    public zaj() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        zat zat;
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        int i = 0;
        zat zat2 = null;
        while (true) {
            zat zat3 = zat2;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = SafeParcelReader.readHeader(parcel2);
                switch (SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        i = SafeParcelReader.readInt(parcel2, readHeader);
                        zat = zat3;
                        break;
                    case 2:
                        zat = (zat) SafeParcelReader.createParcelable(parcel2, readHeader, zat.CREATOR);
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        zat = zat3;
                        break;
                }
                zat2 = zat;
            } else {
                SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new zai(i, zat3);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zai[i];
    }
}
