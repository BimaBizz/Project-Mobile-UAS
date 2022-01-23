package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

/* renamed from: com.google.android.gms.auth.api.signin.zzd */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C0165zzd implements Parcelable.Creator<C0130SignInAccount> {
    public C0165zzd() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C0130SignInAccount[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        String str = "";
        C0122GoogleSignInAccount googleSignInAccount = null;
        String str2 = "";
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = C0461SafeParcelReader.readHeader(parcel3);
            int i = readHeader;
            switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                case 4:
                    str = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                case 7:
                    googleSignInAccount = (C0122GoogleSignInAccount) C0461SafeParcelReader.createParcelable(parcel3, i, C0122GoogleSignInAccount.CREATOR);
                    break;
                case 8:
                    str2 = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                default:
                    C0461SafeParcelReader.skipUnknownField(parcel3, i);
                    break;
            }
        }
        C0461SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new C0130SignInAccount(str, googleSignInAccount, str2);
        return obj;
    }
}
