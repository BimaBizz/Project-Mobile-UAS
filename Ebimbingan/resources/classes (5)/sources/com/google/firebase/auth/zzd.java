package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.PhoneAuthProvider;

public final class zzd implements Parcelable.Creator<PhoneAuthProvider.ForceResendingToken> {
    public zzd() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PhoneAuthProvider.ForceResendingToken[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel3);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            SafeParcelReader.skipUnknownField(parcel3, readHeader);
        }
        SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new PhoneAuthProvider.ForceResendingToken();
        return obj;
    }
}
