package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.C0122GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

/* renamed from: com.google.android.gms.common.internal.zau */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0505zau implements Parcelable.Creator<C0504zat> {
    public C0505zau() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Account account;
        int i;
        C0122GoogleSignInAccount googleSignInAccount;
        Parcel parcel2 = parcel;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        int i2 = 0;
        Account account2 = null;
        int i3 = 0;
        C0122GoogleSignInAccount googleSignInAccount2 = null;
        while (true) {
            C0122GoogleSignInAccount googleSignInAccount3 = googleSignInAccount2;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = C0461SafeParcelReader.readHeader(parcel2);
                switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        i2 = C0461SafeParcelReader.readInt(parcel2, readHeader);
                        account = account2;
                        i = i3;
                        googleSignInAccount = googleSignInAccount3;
                        break;
                    case 2:
                        account = (Account) C0461SafeParcelReader.createParcelable(parcel2, readHeader, Account.CREATOR);
                        i = i3;
                        googleSignInAccount = googleSignInAccount3;
                        break;
                    case 3:
                        i = C0461SafeParcelReader.readInt(parcel2, readHeader);
                        account = account2;
                        googleSignInAccount = googleSignInAccount3;
                        break;
                    case 4:
                        googleSignInAccount = (C0122GoogleSignInAccount) C0461SafeParcelReader.createParcelable(parcel2, readHeader, C0122GoogleSignInAccount.CREATOR);
                        account = account2;
                        i = i3;
                        break;
                    default:
                        C0461SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        account = account2;
                        i = i3;
                        googleSignInAccount = googleSignInAccount3;
                        break;
                }
                account2 = account;
                i3 = i;
                googleSignInAccount2 = googleSignInAccount;
            } else {
                C0461SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new C0504zat(i2, account2, i3, googleSignInAccount3);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C0504zat[i];
    }
}
