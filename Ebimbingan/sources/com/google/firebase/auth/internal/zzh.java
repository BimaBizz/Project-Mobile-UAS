package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

public final class zzh implements Parcelable.Creator<zzi> {
    public zzh() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzi[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        boolean z = false;
        String str7 = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = C0461SafeParcelReader.readHeader(parcel3);
            int i = readHeader;
            switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    str = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                case 2:
                    str2 = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                case 3:
                    str5 = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                case 4:
                    str4 = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                case 5:
                    str3 = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                case 6:
                    str6 = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                case 7:
                    z = C0461SafeParcelReader.readBoolean(parcel3, i);
                    break;
                case 8:
                    str7 = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                default:
                    C0461SafeParcelReader.skipUnknownField(parcel3, i);
                    break;
            }
        }
        C0461SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new zzi(str, str2, str3, str4, str5, str6, z, str7);
        return obj;
    }
}
