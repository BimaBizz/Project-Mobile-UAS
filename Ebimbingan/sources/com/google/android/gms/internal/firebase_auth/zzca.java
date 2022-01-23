package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;
import com.google.firebase.auth.PhoneAuthCredential;

public final class zzca implements Parcelable.Creator<zzcb> {
    public zzca() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcb[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        PhoneAuthCredential phoneAuthCredential = null;
        String str = null;
        String str2 = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = C0461SafeParcelReader.readHeader(parcel3);
            int i = readHeader;
            switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    phoneAuthCredential = (PhoneAuthCredential) C0461SafeParcelReader.createParcelable(parcel3, i, PhoneAuthCredential.CREATOR);
                    break;
                case 2:
                    str = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                case 3:
                    str2 = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                default:
                    C0461SafeParcelReader.skipUnknownField(parcel3, i);
                    break;
            }
        }
        C0461SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new zzcb(phoneAuthCredential, str, str2);
        return obj;
    }
}
