package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

/* renamed from: com.google.android.gms.auth.zzb */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class C0170zzb implements Parcelable.Creator<C0012AccountChangeEventsRequest> {
    public C0170zzb() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C0012AccountChangeEventsRequest[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        int i = 0;
        int i2 = 0;
        String str = null;
        Account account = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = C0461SafeParcelReader.readHeader(parcel3);
            int i3 = readHeader;
            switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i = C0461SafeParcelReader.readInt(parcel3, i3);
                    break;
                case 2:
                    i2 = C0461SafeParcelReader.readInt(parcel3, i3);
                    break;
                case 3:
                    str = C0461SafeParcelReader.createString(parcel3, i3);
                    break;
                case 4:
                    account = (Account) C0461SafeParcelReader.createParcelable(parcel3, i3, Account.CREATOR);
                    break;
                default:
                    C0461SafeParcelReader.skipUnknownField(parcel3, i3);
                    break;
            }
        }
        C0461SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new C0012AccountChangeEventsRequest(i, i2, str, account);
        return obj;
    }
}
