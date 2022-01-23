package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.C0235Scope;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.auth.api.signin.zab */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0161zab implements Parcelable.Creator<C0122GoogleSignInAccount> {
    public C0161zab() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        String str;
        String str2;
        String str3;
        String str4;
        Uri uri;
        String str5;
        long j;
        String str6;
        ArrayList<C0235Scope> arrayList;
        String str7;
        String str8;
        Parcel parcel2 = parcel;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        int i = 0;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        Uri uri2 = null;
        String str13 = null;
        long j2 = 0;
        String str14 = null;
        ArrayList<C0235Scope> arrayList2 = null;
        String str15 = null;
        String str16 = null;
        while (true) {
            String str17 = str16;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = C0461SafeParcelReader.readHeader(parcel2);
                switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        i = C0461SafeParcelReader.readInt(parcel2, readHeader);
                        str = str9;
                        str2 = str10;
                        str3 = str11;
                        str4 = str12;
                        uri = uri2;
                        str5 = str13;
                        j = j2;
                        str6 = str14;
                        arrayList = arrayList2;
                        str7 = str15;
                        str8 = str17;
                        break;
                    case 2:
                        str = C0461SafeParcelReader.createString(parcel2, readHeader);
                        str2 = str10;
                        str3 = str11;
                        str4 = str12;
                        uri = uri2;
                        str5 = str13;
                        j = j2;
                        str6 = str14;
                        arrayList = arrayList2;
                        str7 = str15;
                        str8 = str17;
                        break;
                    case 3:
                        str2 = C0461SafeParcelReader.createString(parcel2, readHeader);
                        str = str9;
                        str3 = str11;
                        str4 = str12;
                        uri = uri2;
                        str5 = str13;
                        j = j2;
                        str6 = str14;
                        arrayList = arrayList2;
                        str7 = str15;
                        str8 = str17;
                        break;
                    case 4:
                        str3 = C0461SafeParcelReader.createString(parcel2, readHeader);
                        str = str9;
                        str2 = str10;
                        str4 = str12;
                        uri = uri2;
                        str5 = str13;
                        j = j2;
                        str6 = str14;
                        arrayList = arrayList2;
                        str7 = str15;
                        str8 = str17;
                        break;
                    case 5:
                        str4 = C0461SafeParcelReader.createString(parcel2, readHeader);
                        str = str9;
                        str2 = str10;
                        str3 = str11;
                        uri = uri2;
                        str5 = str13;
                        j = j2;
                        str6 = str14;
                        arrayList = arrayList2;
                        str7 = str15;
                        str8 = str17;
                        break;
                    case 6:
                        uri = (Uri) C0461SafeParcelReader.createParcelable(parcel2, readHeader, Uri.CREATOR);
                        str = str9;
                        str2 = str10;
                        str3 = str11;
                        str4 = str12;
                        str5 = str13;
                        j = j2;
                        str6 = str14;
                        arrayList = arrayList2;
                        str7 = str15;
                        str8 = str17;
                        break;
                    case 7:
                        str5 = C0461SafeParcelReader.createString(parcel2, readHeader);
                        str = str9;
                        str2 = str10;
                        str3 = str11;
                        str4 = str12;
                        uri = uri2;
                        j = j2;
                        str6 = str14;
                        arrayList = arrayList2;
                        str7 = str15;
                        str8 = str17;
                        break;
                    case 8:
                        j = C0461SafeParcelReader.readLong(parcel2, readHeader);
                        str = str9;
                        str2 = str10;
                        str3 = str11;
                        str4 = str12;
                        uri = uri2;
                        str5 = str13;
                        str6 = str14;
                        arrayList = arrayList2;
                        str7 = str15;
                        str8 = str17;
                        break;
                    case 9:
                        str6 = C0461SafeParcelReader.createString(parcel2, readHeader);
                        str = str9;
                        str2 = str10;
                        str3 = str11;
                        str4 = str12;
                        uri = uri2;
                        str5 = str13;
                        j = j2;
                        arrayList = arrayList2;
                        str7 = str15;
                        str8 = str17;
                        break;
                    case 10:
                        arrayList = C0461SafeParcelReader.createTypedList(parcel2, readHeader, C0235Scope.CREATOR);
                        str = str9;
                        str2 = str10;
                        str3 = str11;
                        str4 = str12;
                        uri = uri2;
                        str5 = str13;
                        j = j2;
                        str6 = str14;
                        str7 = str15;
                        str8 = str17;
                        break;
                    case 11:
                        str7 = C0461SafeParcelReader.createString(parcel2, readHeader);
                        str = str9;
                        str2 = str10;
                        str3 = str11;
                        str4 = str12;
                        uri = uri2;
                        str5 = str13;
                        j = j2;
                        str6 = str14;
                        arrayList = arrayList2;
                        str8 = str17;
                        break;
                    case 12:
                        str8 = C0461SafeParcelReader.createString(parcel2, readHeader);
                        str = str9;
                        str2 = str10;
                        str3 = str11;
                        str4 = str12;
                        uri = uri2;
                        str5 = str13;
                        j = j2;
                        str6 = str14;
                        arrayList = arrayList2;
                        str7 = str15;
                        break;
                    default:
                        C0461SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        str = str9;
                        str2 = str10;
                        str3 = str11;
                        str4 = str12;
                        uri = uri2;
                        str5 = str13;
                        j = j2;
                        str6 = str14;
                        arrayList = arrayList2;
                        str7 = str15;
                        str8 = str17;
                        break;
                }
                str9 = str;
                str10 = str2;
                str11 = str3;
                str12 = str4;
                uri2 = uri;
                str13 = str5;
                j2 = j;
                str14 = str6;
                arrayList2 = arrayList;
                str15 = str7;
                str16 = str8;
            } else {
                C0461SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new C0122GoogleSignInAccount(i, str9, str10, str11, str12, uri2, str13, j2, str14, arrayList2, str15, str17);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C0122GoogleSignInAccount[i];
    }
}
