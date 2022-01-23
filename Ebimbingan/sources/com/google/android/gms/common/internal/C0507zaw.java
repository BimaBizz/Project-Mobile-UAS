package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C0184ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

/* renamed from: com.google.android.gms.common.internal.zaw */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0507zaw implements Parcelable.Creator<C0506zav> {
    public C0507zaw() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        IBinder iBinder;
        C0184ConnectionResult connectionResult;
        boolean z;
        boolean z2;
        Parcel parcel2 = parcel;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        int i = 0;
        IBinder iBinder2 = null;
        C0184ConnectionResult connectionResult2 = null;
        boolean z3 = false;
        boolean z4 = false;
        while (true) {
            boolean z5 = z4;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = C0461SafeParcelReader.readHeader(parcel2);
                switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        i = C0461SafeParcelReader.readInt(parcel2, readHeader);
                        iBinder = iBinder2;
                        connectionResult = connectionResult2;
                        z = z3;
                        z2 = z5;
                        break;
                    case 2:
                        iBinder = C0461SafeParcelReader.readIBinder(parcel2, readHeader);
                        connectionResult = connectionResult2;
                        z = z3;
                        z2 = z5;
                        break;
                    case 3:
                        connectionResult = (C0184ConnectionResult) C0461SafeParcelReader.createParcelable(parcel2, readHeader, C0184ConnectionResult.CREATOR);
                        iBinder = iBinder2;
                        z = z3;
                        z2 = z5;
                        break;
                    case 4:
                        z = C0461SafeParcelReader.readBoolean(parcel2, readHeader);
                        iBinder = iBinder2;
                        connectionResult = connectionResult2;
                        z2 = z5;
                        break;
                    case 5:
                        z2 = C0461SafeParcelReader.readBoolean(parcel2, readHeader);
                        iBinder = iBinder2;
                        connectionResult = connectionResult2;
                        z = z3;
                        break;
                    default:
                        C0461SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        iBinder = iBinder2;
                        connectionResult = connectionResult2;
                        z = z3;
                        z2 = z5;
                        break;
                }
                iBinder2 = iBinder;
                connectionResult2 = connectionResult;
                z3 = z;
                z4 = z2;
            } else {
                C0461SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new C0506zav(i, iBinder2, connectionResult2, z3, z5);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C0506zav[i];
    }
}
