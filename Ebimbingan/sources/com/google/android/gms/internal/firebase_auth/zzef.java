package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;
import java.util.ArrayList;

public final class zzef implements Parcelable.Creator<zzec> {
    public zzef() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzec[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        String str = null;
        boolean z = false;
        String str2 = null;
        boolean z2 = false;
        zzfk zzfk = null;
        ArrayList<String> arrayList = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = C0461SafeParcelReader.readHeader(parcel3);
            int i = readHeader;
            switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    str = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                case 3:
                    z = C0461SafeParcelReader.readBoolean(parcel3, i);
                    break;
                case 4:
                    str2 = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                case 5:
                    z2 = C0461SafeParcelReader.readBoolean(parcel3, i);
                    break;
                case 6:
                    zzfk = (zzfk) C0461SafeParcelReader.createParcelable(parcel3, i, zzfk.CREATOR);
                    break;
                case 7:
                    arrayList = C0461SafeParcelReader.createStringList(parcel3, i);
                    break;
                default:
                    C0461SafeParcelReader.skipUnknownField(parcel3, i);
                    break;
            }
        }
        C0461SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new zzec(str, z, str2, z2, zzfk, arrayList);
        return obj;
    }
}
