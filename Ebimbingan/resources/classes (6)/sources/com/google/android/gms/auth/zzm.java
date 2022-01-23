package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class zzm implements Parcelable.Creator<TokenData> {
    public zzm() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TokenData[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        int i = 0;
        String str = null;
        Long l = null;
        boolean z = false;
        boolean z2 = false;
        ArrayList<String> arrayList = null;
        String str2 = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel3);
            int i2 = readHeader;
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i = SafeParcelReader.readInt(parcel3, i2);
                    break;
                case 2:
                    str = SafeParcelReader.createString(parcel3, i2);
                    break;
                case 3:
                    l = SafeParcelReader.readLongObject(parcel3, i2);
                    break;
                case 4:
                    z = SafeParcelReader.readBoolean(parcel3, i2);
                    break;
                case 5:
                    z2 = SafeParcelReader.readBoolean(parcel3, i2);
                    break;
                case 6:
                    arrayList = SafeParcelReader.createStringList(parcel3, i2);
                    break;
                case 7:
                    str2 = SafeParcelReader.createString(parcel3, i2);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel3, i2);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new TokenData(i, str, l, z, z2, arrayList, str2);
        return obj;
    }
}
