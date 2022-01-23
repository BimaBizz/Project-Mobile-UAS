package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

public final class zzft implements Parcelable.Creator<zzfq> {
    public zzft() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzfq[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        String str = null;
        String str2 = null;
        long j = 0;
        boolean z = false;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = C0461SafeParcelReader.readHeader(parcel3);
            int i = readHeader;
            switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    str = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                case 3:
                    str2 = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                case 4:
                    j = C0461SafeParcelReader.readLong(parcel3, i);
                    break;
                case 5:
                    z = C0461SafeParcelReader.readBoolean(parcel3, i);
                    break;
                default:
                    C0461SafeParcelReader.skipUnknownField(parcel3, i);
                    break;
            }
        }
        C0461SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new zzfq(str, str2, j, z);
        return obj;
    }
}
