package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

/* renamed from: com.google.android.gms.auth.api.identity.zzm */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C0103zzm implements Parcelable.Creator<C0091SignInCredential> {
    public C0103zzm() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C0091SignInCredential[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = C0461SafeParcelReader.readHeader(parcel3);
            int i = readHeader;
            switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    str = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                case 2:
                    str2 = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                case 3:
                    str3 = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                case 4:
                    str4 = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                case 5:
                    uri = (Uri) C0461SafeParcelReader.createParcelable(parcel3, i, Uri.CREATOR);
                    break;
                case 6:
                    str5 = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                case 7:
                    str6 = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                default:
                    C0461SafeParcelReader.skipUnknownField(parcel3, i);
                    break;
            }
        }
        C0461SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new C0091SignInCredential(str, str2, str3, str4, uri, str5, str6);
        return obj;
    }
}
