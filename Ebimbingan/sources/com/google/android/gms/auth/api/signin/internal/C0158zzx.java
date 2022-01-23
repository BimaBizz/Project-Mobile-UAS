package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.C0125GoogleSignInOptions;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

/* renamed from: com.google.android.gms.auth.api.signin.internal.zzx */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C0158zzx implements Parcelable.Creator<C0133SignInConfiguration> {
    public C0158zzx() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C0133SignInConfiguration[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        String str = null;
        C0125GoogleSignInOptions googleSignInOptions = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = C0461SafeParcelReader.readHeader(parcel3);
            int i = readHeader;
            switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    str = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                case 5:
                    googleSignInOptions = (C0125GoogleSignInOptions) C0461SafeParcelReader.createParcelable(parcel3, i, C0125GoogleSignInOptions.CREATOR);
                    break;
                default:
                    C0461SafeParcelReader.skipUnknownField(parcel3, i);
                    break;
            }
        }
        C0461SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new C0133SignInConfiguration(str, googleSignInOptions);
        return obj;
    }
}
