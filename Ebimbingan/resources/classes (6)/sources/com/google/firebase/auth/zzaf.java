package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzaf implements Parcelable.Creator<UserProfileChangeRequest> {
    public zzaf() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new UserProfileChangeRequest[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        String str = null;
        String str2 = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel3);
            int i = readHeader;
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    str = SafeParcelReader.createString(parcel3, i);
                    break;
                case 3:
                    str2 = SafeParcelReader.createString(parcel3, i);
                    break;
                case 4:
                    z = SafeParcelReader.readBoolean(parcel3, i);
                    break;
                case 5:
                    z2 = SafeParcelReader.readBoolean(parcel3, i);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel3, i);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new UserProfileChangeRequest(str, str2, z, z2);
        return obj;
    }
}
