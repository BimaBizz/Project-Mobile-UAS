package com.google.android.gms.internal.p001authapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.C0062Credential;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

/* renamed from: com.google.android.gms.internal.auth-api.zzy  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C0774zzy implements Parcelable.Creator<C0775zzz> {
    public C0774zzy() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C0775zzz[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        C0062Credential credential = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = C0461SafeParcelReader.readHeader(parcel3);
            int i = readHeader;
            switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    credential = (C0062Credential) C0461SafeParcelReader.createParcelable(parcel3, i, C0062Credential.CREATOR);
                    break;
                default:
                    C0461SafeParcelReader.skipUnknownField(parcel3, i);
                    break;
            }
        }
        C0461SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new C0775zzz(credential);
        return obj;
    }
}
