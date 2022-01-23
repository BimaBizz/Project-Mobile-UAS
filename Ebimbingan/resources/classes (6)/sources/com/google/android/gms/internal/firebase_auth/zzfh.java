package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzfh implements Parcelable.Creator<zzfe> {
    public zzfh() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzfe[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        String str = null;
        long j = 0;
        boolean z = false;
        String str2 = null;
        String str3 = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel3);
            int i = readHeader;
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    str = SafeParcelReader.createString(parcel3, i);
                    break;
                case 2:
                    j = SafeParcelReader.readLong(parcel3, i);
                    break;
                case 3:
                    z = SafeParcelReader.readBoolean(parcel3, i);
                    break;
                case 4:
                    str2 = SafeParcelReader.createString(parcel3, i);
                    break;
                case 5:
                    str3 = SafeParcelReader.createString(parcel3, i);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel3, i);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new zzfe(str, j, z, str2, str3);
        return obj;
    }
}