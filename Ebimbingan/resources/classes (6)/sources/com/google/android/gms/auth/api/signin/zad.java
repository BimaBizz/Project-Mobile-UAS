package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zad implements Parcelable.Creator<GoogleSignInOptions> {
    public zad() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        ArrayList<Scope> arrayList;
        Account account;
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        String str2;
        ArrayList<GoogleSignInOptionsExtensionParcelable> arrayList2;
        String str3;
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        int i = 0;
        ArrayList<Scope> arrayList3 = null;
        Account account2 = null;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        String str4 = null;
        String str5 = null;
        ArrayList<GoogleSignInOptionsExtensionParcelable> arrayList4 = null;
        String str6 = null;
        while (true) {
            String str7 = str6;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = SafeParcelReader.readHeader(parcel2);
                switch (SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        i = SafeParcelReader.readInt(parcel2, readHeader);
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
                        arrayList = SafeParcelReader.createTypedList(parcel2, readHeader, Scope.CREATOR);
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
                        account = (Account) SafeParcelReader.createParcelable(parcel2, readHeader, Account.CREATOR);
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
                        z = SafeParcelReader.readBoolean(parcel2, readHeader);
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
                        z2 = SafeParcelReader.readBoolean(parcel2, readHeader);
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
                        z3 = SafeParcelReader.readBoolean(parcel2, readHeader);
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
                        str = SafeParcelReader.createString(parcel2, readHeader);
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
                        str2 = SafeParcelReader.createString(parcel2, readHeader);
                        arrayList = arrayList3;
                        account = account2;
                        z = z4;
                        z2 = z5;
                        z3 = z6;
                        str = str4;
                        arrayList2 = arrayList4;
                        str3 = str7;
                        break;
                    case ConnectionResult.SERVICE_INVALID /*9*/:
                        arrayList2 = SafeParcelReader.createTypedList(parcel2, readHeader, GoogleSignInOptionsExtensionParcelable.CREATOR);
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
                        str3 = SafeParcelReader.createString(parcel2, readHeader);
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
                        SafeParcelReader.skipUnknownField(parcel2, readHeader);
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
                SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new GoogleSignInOptions(i, arrayList3, account2, z4, z5, z6, str4, str5, arrayList4, str7);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}
