package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zav;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zal implements Parcelable.Creator<zak> {
    public zal() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        ConnectionResult connectionResult;
        zav zav;
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        int i = 0;
        ConnectionResult connectionResult2 = null;
        zav zav2 = null;
        while (true) {
            zav zav3 = zav2;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = SafeParcelReader.readHeader(parcel2);
                switch (SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        i = SafeParcelReader.readInt(parcel2, readHeader);
                        connectionResult = connectionResult2;
                        zav = zav3;
                        break;
                    case 2:
                        connectionResult = (ConnectionResult) SafeParcelReader.createParcelable(parcel2, readHeader, ConnectionResult.CREATOR);
                        zav = zav3;
                        break;
                    case 3:
                        zav = (zav) SafeParcelReader.createParcelable(parcel2, readHeader, zav.CREATOR);
                        connectionResult = connectionResult2;
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        connectionResult = connectionResult2;
                        zav = zav3;
                        break;
                }
                connectionResult2 = connectionResult;
                zav2 = zav;
            } else {
                SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new zak(i, connectionResult2, zav3);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zak[i];
    }
}
