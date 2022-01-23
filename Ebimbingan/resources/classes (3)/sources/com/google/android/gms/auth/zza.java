package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class zza implements Parcelable.Creator<AccountChangeEvent> {
    public zza() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AccountChangeEvent[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        int i = 0;
        long j = 0;
        String str = null;
        int i2 = 0;
        int i3 = 0;
        String str2 = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel3);
            int i4 = readHeader;
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i = SafeParcelReader.readInt(parcel3, i4);
                    break;
                case 2:
                    j = SafeParcelReader.readLong(parcel3, i4);
                    break;
                case 3:
                    str = SafeParcelReader.createString(parcel3, i4);
                    break;
                case 4:
                    i2 = SafeParcelReader.readInt(parcel3, i4);
                    break;
                case 5:
                    i3 = SafeParcelReader.readInt(parcel3, i4);
                    break;
                case 6:
                    str2 = SafeParcelReader.createString(parcel3, i4);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel3, i4);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new AccountChangeEvent(i, j, str, i2, i3, str2);
        return obj;
    }
}
