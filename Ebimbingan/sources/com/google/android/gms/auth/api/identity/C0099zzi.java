package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.C0083BeginSignInRequest;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

/* renamed from: com.google.android.gms.auth.api.identity.zzi */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C0099zzi implements Parcelable.Creator<C0083BeginSignInRequest.PasswordRequestOptions> {
    public C0099zzi() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C0083BeginSignInRequest.PasswordRequestOptions[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        boolean z = false;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = C0461SafeParcelReader.readHeader(parcel3);
            int i = readHeader;
            switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    z = C0461SafeParcelReader.readBoolean(parcel3, i);
                    break;
                default:
                    C0461SafeParcelReader.skipUnknownField(parcel3, i);
                    break;
            }
        }
        C0461SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new C0083BeginSignInRequest.PasswordRequestOptions(z);
        return obj;
    }
}
