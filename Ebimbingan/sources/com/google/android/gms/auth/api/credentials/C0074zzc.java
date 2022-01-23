package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.auth.api.credentials.zzc */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C0074zzc implements Parcelable.Creator<C0062Credential> {
    public C0074zzc() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C0062Credential[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        String str = null;
        String str2 = null;
        Uri uri = null;
        ArrayList<C0072IdToken> arrayList = null;
        String str3 = null;
        String str4 = null;
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
                    uri = (Uri) C0461SafeParcelReader.createParcelable(parcel3, i, Uri.CREATOR);
                    break;
                case 4:
                    arrayList = C0461SafeParcelReader.createTypedList(parcel3, i, C0072IdToken.CREATOR);
                    break;
                case 5:
                    str3 = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                case 6:
                    str4 = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                case 9:
                    str5 = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                case 10:
                    str6 = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                default:
                    C0461SafeParcelReader.skipUnknownField(parcel3, i);
                    break;
            }
        }
        C0461SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new C0062Credential(str, str2, uri, arrayList, str3, str4, str5, str6);
        return obj;
    }
}
