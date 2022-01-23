package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0504zat;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

/* renamed from: com.google.android.gms.signin.internal.zaj */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C1145zaj implements Parcelable.Creator<C1144zai> {
    public C1145zaj() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        C0504zat zat;
        Parcel parcel2 = parcel;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        int i = 0;
        C0504zat zat2 = null;
        while (true) {
            C0504zat zat3 = zat2;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = C0461SafeParcelReader.readHeader(parcel2);
                switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        i = C0461SafeParcelReader.readInt(parcel2, readHeader);
                        zat = zat3;
                        break;
                    case 2:
                        zat = (C0504zat) C0461SafeParcelReader.createParcelable(parcel2, readHeader, C0504zat.CREATOR);
                        break;
                    default:
                        C0461SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        zat = zat3;
                        break;
                }
                zat2 = zat;
            } else {
                C0461SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new C1144zai(i, zat3);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C1144zai[i];
    }
}
