package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zaa implements Parcelable.Creator<FavaDiagnosticsEntity> {
    public zaa() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        String str;
        int i;
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        int i2 = 0;
        String str2 = null;
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = SafeParcelReader.readHeader(parcel2);
                switch (SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        i2 = SafeParcelReader.readInt(parcel2, readHeader);
                        str = str2;
                        i = i4;
                        break;
                    case 2:
                        str = SafeParcelReader.createString(parcel2, readHeader);
                        i = i4;
                        break;
                    case 3:
                        i = SafeParcelReader.readInt(parcel2, readHeader);
                        str = str2;
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        str = str2;
                        i = i4;
                        break;
                }
                str2 = str;
                i3 = i;
            } else {
                SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new FavaDiagnosticsEntity(i2, str2, i4);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FavaDiagnosticsEntity[i];
    }
}
