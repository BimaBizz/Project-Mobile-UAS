package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zau implements Parcelable.Creator<zat> {
    public zau() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Account account;
        int i;
        GoogleSignInAccount googleSignInAccount;
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        int i2 = 0;
        Account account2 = null;
        int i3 = 0;
        GoogleSignInAccount googleSignInAccount2 = null;
        while (true) {
            GoogleSignInAccount googleSignInAccount3 = googleSignInAccount2;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = SafeParcelReader.readHeader(parcel2);
                switch (SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        i2 = SafeParcelReader.readInt(parcel2, readHeader);
                        account = account2;
                        i = i3;
                        googleSignInAccount = googleSignInAccount3;
                        break;
                    case 2:
                        account = (Account) SafeParcelReader.createParcelable(parcel2, readHeader, Account.CREATOR);
                        i = i3;
                        googleSignInAccount = googleSignInAccount3;
                        break;
                    case 3:
                        i = SafeParcelReader.readInt(parcel2, readHeader);
                        account = account2;
                        googleSignInAccount = googleSignInAccount3;
                        break;
                    case 4:
                        googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.createParcelable(parcel2, readHeader, GoogleSignInAccount.CREATOR);
                        account = account2;
                        i = i3;
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        account = account2;
                        i = i3;
                        googleSignInAccount = googleSignInAccount3;
                        break;
                }
                account2 = account;
                i3 = i;
                googleSignInAccount2 = googleSignInAccount;
            } else {
                SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new zat(i2, account2, i3, googleSignInAccount3);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zat[i];
    }
}
