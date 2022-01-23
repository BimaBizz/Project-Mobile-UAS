package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.zzf;

public final class zzdy implements Parcelable.Creator<zzdz> {
    public zzdy() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzdz[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        Status status = null;
        zzf zzf = null;
        String str = null;
        String str2 = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel3);
            int i = readHeader;
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    status = (Status) SafeParcelReader.createParcelable(parcel3, i, Status.CREATOR);
                    break;
                case 2:
                    zzf = (zzf) SafeParcelReader.createParcelable(parcel3, i, zzf.CREATOR);
                    break;
                case 3:
                    str = SafeParcelReader.createString(parcel3, i);
                    break;
                case 4:
                    str2 = SafeParcelReader.createString(parcel3, i);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel3, i);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new zzdz(status, zzf, str, str2);
        return obj;
    }
}
