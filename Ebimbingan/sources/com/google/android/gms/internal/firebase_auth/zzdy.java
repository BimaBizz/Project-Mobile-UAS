package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;
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
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        C0236Status status = null;
        zzf zzf = null;
        String str = null;
        String str2 = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = C0461SafeParcelReader.readHeader(parcel3);
            int i = readHeader;
            switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    status = (C0236Status) C0461SafeParcelReader.createParcelable(parcel3, i, C0236Status.CREATOR);
                    break;
                case 2:
                    zzf = (zzf) C0461SafeParcelReader.createParcelable(parcel3, i, zzf.CREATOR);
                    break;
                case 3:
                    str = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                case 4:
                    str2 = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                default:
                    C0461SafeParcelReader.skipUnknownField(parcel3, i);
                    break;
            }
        }
        C0461SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new zzdz(status, zzf, str, str2);
        return obj;
    }
}
