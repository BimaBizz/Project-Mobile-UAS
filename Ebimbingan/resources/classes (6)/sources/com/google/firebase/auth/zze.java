package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.firebase_auth.zzfm;

public final class zze implements Parcelable.Creator<zzf> {
    public zze() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzf[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        String str = null;
        String str2 = null;
        String str3 = null;
        zzfm zzfm = null;
        String str4 = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel3);
            int i = readHeader;
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    str = SafeParcelReader.createString(parcel3, i);
                    break;
                case 2:
                    str2 = SafeParcelReader.createString(parcel3, i);
                    break;
                case 3:
                    str3 = SafeParcelReader.createString(parcel3, i);
                    break;
                case 4:
                    zzfm = (zzfm) SafeParcelReader.createParcelable(parcel3, i, zzfm.CREATOR);
                    break;
                case 5:
                    str4 = SafeParcelReader.createString(parcel3, i);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel3, i);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new zzf(str, str2, str3, zzfm, str4);
        return obj;
    }
}
