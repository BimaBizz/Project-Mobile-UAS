package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C0184ConnectionResult;
import com.google.android.gms.common.internal.C0506zav;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

/* renamed from: com.google.android.gms.signin.internal.zal */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C1147zal implements Parcelable.Creator<C1146zak> {
    public C1147zal() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        C0184ConnectionResult connectionResult;
        C0506zav zav;
        Parcel parcel2 = parcel;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        int i = 0;
        C0184ConnectionResult connectionResult2 = null;
        C0506zav zav2 = null;
        while (true) {
            C0506zav zav3 = zav2;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = C0461SafeParcelReader.readHeader(parcel2);
                switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        i = C0461SafeParcelReader.readInt(parcel2, readHeader);
                        connectionResult = connectionResult2;
                        zav = zav3;
                        break;
                    case 2:
                        connectionResult = (C0184ConnectionResult) C0461SafeParcelReader.createParcelable(parcel2, readHeader, C0184ConnectionResult.CREATOR);
                        zav = zav3;
                        break;
                    case 3:
                        zav = (C0506zav) C0461SafeParcelReader.createParcelable(parcel2, readHeader, C0506zav.CREATOR);
                        connectionResult = connectionResult2;
                        break;
                    default:
                        C0461SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        connectionResult = connectionResult2;
                        zav = zav3;
                        break;
                }
                connectionResult2 = connectionResult;
                zav2 = zav;
            } else {
                C0461SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new C1146zak(i, connectionResult2, zav3);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C1146zak[i];
    }
}
