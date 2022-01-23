package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.C0131GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.C0235Scope;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.auth.api.signin.zad */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0163zad implements Parcelable.Creator<C0125GoogleSignInOptions> {
    public C0163zad() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        ArrayList<C0235Scope> arrayList;
        Account account;
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        String str2;
        ArrayList<C0131GoogleSignInOptionsExtensionParcelable> arrayList2;
        String str3;
        Parcel parcel2 = parcel;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        int i = 0;
        ArrayList<C0235Scope> arrayList3 = null;
        Account account2 = null;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        String str4 = null;
        String str5 = null;
        ArrayList<C0131GoogleSignInOptionsExtensionParcelable> arrayList4 = null;
        String str6 = null;
        while (true) {
            String str7 = str6;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = C0461SafeParcelReader.readHeader(parcel2);
                switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        i = C0461SafeParcelReader.readInt(parcel2, readHeader);
                        arrayList = arrayList3;
                        account = account2;
                        z = z4;
                        z2 = z5;
                        z3 = z6;
                        str = str4;
                        str2 = str5;
                        arrayList2 = arrayList4;
                        str3 = str7;
                        break;
                    case 2:
                        arrayList = C0461SafeParcelReader.createTypedList(parcel2, readHeader, C0235Scope.CREATOR);
                        account = account2;
                        z = z4;
                        z2 = z5;
                        z3 = z6;
                        str = str4;
                        str2 = str5;
                        arrayList2 = arrayList4;
                        str3 = str7;
                        break;
                    case 3:
                        account = (Account) C0461SafeParcelReader.createParcelable(parcel2, readHeader, Account.CREATOR);
                        arrayList = arrayList3;
                        z = z4;
                        z2 = z5;
                        z3 = z6;
                        str = str4;
                        str2 = str5;
                        arrayList2 = arrayList4;
                        str3 = str7;
                        break;
                    case 4:
                        z = C0461SafeParcelReader.readBoolean(parcel2, readHeader);
                        arrayList = arrayList3;
                        account = account2;
                        z2 = z5;
                        z3 = z6;
                        str = str4;
                        str2 = str5;
                        arrayList2 = arrayList4;
                        str3 = str7;
                        break;
                    case 5:
                        z2 = C0461SafeParcelReader.readBoolean(parcel2, readHeader);
                        arrayList = arrayList3;
                        account = account2;
                        z = z4;
                        z3 = z6;
                        str = str4;
                        str2 = str5;
                        arrayList2 = arrayList4;
                        str3 = str7;
                        break;
                    case 6:
                        z3 = C0461SafeParcelReader.readBoolean(parcel2, readHeader);
                        arrayList = arrayList3;
                        account = account2;
                        z = z4;
                        z2 = z5;
                        str = str4;
                        str2 = str5;
                        arrayList2 = arrayList4;
                        str3 = str7;
                        break;
                    case 7:
                        str = C0461SafeParcelReader.createString(parcel2, readHeader);
                        arrayList = arrayList3;
                        account = account2;
                        z = z4;
                        z2 = z5;
                        z3 = z6;
                        str2 = str5;
                        arrayList2 = arrayList4;
                        str3 = str7;
                        break;
                    case 8:
                        str2 = C0461SafeParcelReader.createString(parcel2, readHeader);
                        arrayList = arrayList3;
                        account = account2;
                        z = z4;
                        z2 = z5;
                        z3 = z6;
                        str = str4;
                        arrayList2 = arrayList4;
                        str3 = str7;
                        break;
                    case 9:
                        arrayList2 = C0461SafeParcelReader.createTypedList(parcel2, readHeader, C0131GoogleSignInOptionsExtensionParcelable.CREATOR);
                        arrayList = arrayList3;
                        account = account2;
                        z = z4;
                        z2 = z5;
                        z3 = z6;
                        str = str4;
                        str2 = str5;
                        str3 = str7;
                        break;
                    case 10:
                        str3 = C0461SafeParcelReader.createString(parcel2, readHeader);
                        arrayList = arrayList3;
                        account = account2;
                        z = z4;
                        z2 = z5;
                        z3 = z6;
                        str = str4;
                        str2 = str5;
                        arrayList2 = arrayList4;
                        break;
                    default:
                        C0461SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        arrayList = arrayList3;
                        account = account2;
                        z = z4;
                        z2 = z5;
                        z3 = z6;
                        str = str4;
                        str2 = str5;
                        arrayList2 = arrayList4;
                        str3 = str7;
                        break;
                }
                arrayList3 = arrayList;
                account2 = account;
                z4 = z;
                z5 = z2;
                z6 = z3;
                str4 = str;
                str5 = str2;
                arrayList4 = arrayList2;
                str6 = str3;
            } else {
                C0461SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new C0125GoogleSignInOptions(i, arrayList3, account2, z4, z5, z6, str4, str5, arrayList4, str7);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C0125GoogleSignInOptions[i];
    }
}
