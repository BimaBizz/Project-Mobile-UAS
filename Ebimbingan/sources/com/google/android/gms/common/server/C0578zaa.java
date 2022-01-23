package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

/* renamed from: com.google.android.gms.common.server.zaa */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0578zaa implements Parcelable.Creator<C0550FavaDiagnosticsEntity> {
    public C0578zaa() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        String str;
        int i;
        Parcel parcel2 = parcel;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        int i2 = 0;
        String str2 = null;
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = C0461SafeParcelReader.readHeader(parcel2);
                switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        i2 = C0461SafeParcelReader.readInt(parcel2, readHeader);
                        str = str2;
                        i = i4;
                        break;
                    case 2:
                        str = C0461SafeParcelReader.createString(parcel2, readHeader);
                        i = i4;
                        break;
                    case 3:
                        i = C0461SafeParcelReader.readInt(parcel2, readHeader);
                        str = str2;
                        break;
                    default:
                        C0461SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        str = str2;
                        i = i4;
                        break;
                }
                str2 = str;
                i3 = i;
            } else {
                C0461SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new C0550FavaDiagnosticsEntity(i2, str2, i4);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C0550FavaDiagnosticsEntity[i];
    }
}
