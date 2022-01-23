package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.C0083BeginSignInRequest;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

/* renamed from: com.google.android.gms.auth.api.identity.zzc */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C0093zzc implements Parcelable.Creator<C0083BeginSignInRequest> {
    public C0093zzc() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C0083BeginSignInRequest[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        C0083BeginSignInRequest.PasswordRequestOptions passwordRequestOptions = null;
        C0083BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions = null;
        String str = null;
        boolean z = false;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = C0461SafeParcelReader.readHeader(parcel3);
            int i = readHeader;
            switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    passwordRequestOptions = (C0083BeginSignInRequest.PasswordRequestOptions) C0461SafeParcelReader.createParcelable(parcel3, i, C0083BeginSignInRequest.PasswordRequestOptions.CREATOR);
                    break;
                case 2:
                    googleIdTokenRequestOptions = (C0083BeginSignInRequest.GoogleIdTokenRequestOptions) C0461SafeParcelReader.createParcelable(parcel3, i, C0083BeginSignInRequest.GoogleIdTokenRequestOptions.CREATOR);
                    break;
                case 3:
                    str = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                case 4:
                    z = C0461SafeParcelReader.readBoolean(parcel3, i);
                    break;
                default:
                    C0461SafeParcelReader.skipUnknownField(parcel3, i);
                    break;
            }
        }
        C0461SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new C0083BeginSignInRequest(passwordRequestOptions, googleIdTokenRequestOptions, str, z);
        return obj;
    }
}
