package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C0184ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

/* renamed from: com.google.android.gms.common.api.zzb */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0384zzb implements Parcelable.Creator<C0236Status> {
    public C0384zzb() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        String str;
        PendingIntent pendingIntent;
        C0184ConnectionResult connectionResult;
        int i;
        Parcel parcel2 = parcel;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        int i2 = 0;
        int i3 = 0;
        String str2 = null;
        PendingIntent pendingIntent2 = null;
        C0184ConnectionResult connectionResult2 = null;
        while (true) {
            C0184ConnectionResult connectionResult3 = connectionResult2;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = C0461SafeParcelReader.readHeader(parcel2);
                switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        i3 = C0461SafeParcelReader.readInt(parcel2, readHeader);
                        str = str2;
                        pendingIntent = pendingIntent2;
                        connectionResult = connectionResult3;
                        i = i2;
                        break;
                    case 2:
                        str = C0461SafeParcelReader.createString(parcel2, readHeader);
                        pendingIntent = pendingIntent2;
                        connectionResult = connectionResult3;
                        i = i2;
                        break;
                    case 3:
                        pendingIntent = (PendingIntent) C0461SafeParcelReader.createParcelable(parcel2, readHeader, PendingIntent.CREATOR);
                        str = str2;
                        connectionResult = connectionResult3;
                        i = i2;
                        break;
                    case 4:
                        connectionResult = (C0184ConnectionResult) C0461SafeParcelReader.createParcelable(parcel2, readHeader, C0184ConnectionResult.CREATOR);
                        str = str2;
                        pendingIntent = pendingIntent2;
                        i = i2;
                        break;
                    case 1000:
                        i = C0461SafeParcelReader.readInt(parcel2, readHeader);
                        str = str2;
                        pendingIntent = pendingIntent2;
                        connectionResult = connectionResult3;
                        break;
                    default:
                        C0461SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        str = str2;
                        pendingIntent = pendingIntent2;
                        connectionResult = connectionResult3;
                        i = i2;
                        break;
                }
                i2 = i;
                str2 = str;
                pendingIntent2 = pendingIntent;
                connectionResult2 = connectionResult;
            } else {
                C0461SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new C0236Status(i2, i3, str2, pendingIntent2, connectionResult3);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C0236Status[i];
    }
}
