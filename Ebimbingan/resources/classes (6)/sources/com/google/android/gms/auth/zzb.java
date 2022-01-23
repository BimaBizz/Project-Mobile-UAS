package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class zzb implements Parcelable.Creator<AccountChangeEventsRequest> {
    public zzb() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AccountChangeEventsRequest[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        int i = 0;
        int i2 = 0;
        String str = null;
        Account account = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel3);
            int i3 = readHeader;
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i = SafeParcelReader.readInt(parcel3, i3);
                    break;
                case 2:
                    i2 = SafeParcelReader.readInt(parcel3, i3);
                    break;
                case 3:
                    str = SafeParcelReader.createString(parcel3, i3);
                    break;
                case 4:
                    account = (Account) SafeParcelReader.createParcelable(parcel3, i3, Account.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel3, i3);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new AccountChangeEventsRequest(i, i2, str, account);
        return obj;
    }
}
