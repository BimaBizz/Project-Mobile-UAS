package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

public final class zzc implements Parcelable.Creator<ActionCodeSettings> {
    public zzc() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ActionCodeSettings[i];
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
        boolean z = false;
        String str5 = null;
        boolean z2 = false;
        String str6 = null;
        int i = 0;
        String str7 = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = C0461SafeParcelReader.readHeader(parcel3);
            int i2 = readHeader;
            switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    str = C0461SafeParcelReader.createString(parcel3, i2);
                    break;
                case 2:
                    str2 = C0461SafeParcelReader.createString(parcel3, i2);
                    break;
                case 3:
                    str3 = C0461SafeParcelReader.createString(parcel3, i2);
                    break;
                case 4:
                    str4 = C0461SafeParcelReader.createString(parcel3, i2);
                    break;
                case 5:
                    z = C0461SafeParcelReader.readBoolean(parcel3, i2);
                    break;
                case 6:
                    str5 = C0461SafeParcelReader.createString(parcel3, i2);
                    break;
                case 7:
                    z2 = C0461SafeParcelReader.readBoolean(parcel3, i2);
                    break;
                case 8:
                    str6 = C0461SafeParcelReader.createString(parcel3, i2);
                    break;
                case 9:
                    i = C0461SafeParcelReader.readInt(parcel3, i2);
                    break;
                case 10:
                    str7 = C0461SafeParcelReader.createString(parcel3, i2);
                    break;
                default:
                    C0461SafeParcelReader.skipUnknownField(parcel3, i2);
                    break;
            }
        }
        C0461SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new ActionCodeSettings(str, str2, str3, str4, z, str5, z2, str6, i, str7);
        return obj;
    }
}
