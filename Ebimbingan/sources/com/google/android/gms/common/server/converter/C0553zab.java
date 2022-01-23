package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

/* renamed from: com.google.android.gms.common.server.converter.zab */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0553zab implements Parcelable.Creator<C0552zaa> {
    public C0553zab() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        C0551StringToIntConverter stringToIntConverter;
        Parcel parcel2 = parcel;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        int i = 0;
        C0551StringToIntConverter stringToIntConverter2 = null;
        while (true) {
            C0551StringToIntConverter stringToIntConverter3 = stringToIntConverter2;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = C0461SafeParcelReader.readHeader(parcel2);
                switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        i = C0461SafeParcelReader.readInt(parcel2, readHeader);
                        stringToIntConverter = stringToIntConverter3;
                        break;
                    case 2:
                        stringToIntConverter = (C0551StringToIntConverter) C0461SafeParcelReader.createParcelable(parcel2, readHeader, C0551StringToIntConverter.CREATOR);
                        break;
                    default:
                        C0461SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        stringToIntConverter = stringToIntConverter3;
                        break;
                }
                stringToIntConverter2 = stringToIntConverter;
            } else {
                C0461SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new C0552zaa(i, stringToIntConverter3);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C0552zaa[i];
    }
}
