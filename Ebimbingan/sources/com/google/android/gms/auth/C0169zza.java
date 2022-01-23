package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

/* renamed from: com.google.android.gms.auth.zza */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class C0169zza implements Parcelable.Creator<C0011AccountChangeEvent> {
    public C0169zza() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C0011AccountChangeEvent[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        int i = 0;
        long j = 0;
        String str = null;
        int i2 = 0;
        int i3 = 0;
        String str2 = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = C0461SafeParcelReader.readHeader(parcel3);
            int i4 = readHeader;
            switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i = C0461SafeParcelReader.readInt(parcel3, i4);
                    break;
                case 2:
                    j = C0461SafeParcelReader.readLong(parcel3, i4);
                    break;
                case 3:
                    str = C0461SafeParcelReader.createString(parcel3, i4);
                    break;
                case 4:
                    i2 = C0461SafeParcelReader.readInt(parcel3, i4);
                    break;
                case 5:
                    i3 = C0461SafeParcelReader.readInt(parcel3, i4);
                    break;
                case 6:
                    str2 = C0461SafeParcelReader.createString(parcel3, i4);
                    break;
                default:
                    C0461SafeParcelReader.skipUnknownField(parcel3, i4);
                    break;
            }
        }
        C0461SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new C0011AccountChangeEvent(i, j, str, i2, i3, str2);
        return obj;
    }
}
