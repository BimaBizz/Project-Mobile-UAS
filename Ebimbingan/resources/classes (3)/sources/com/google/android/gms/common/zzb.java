package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class zzb implements Parcelable.Creator<ConnectionResult> {
    public zzb() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        int i;
        PendingIntent pendingIntent;
        String str;
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        int i2 = 0;
        int i3 = 0;
        PendingIntent pendingIntent2 = null;
        String str2 = null;
        while (true) {
            String str3 = str2;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = SafeParcelReader.readHeader(parcel2);
                switch (SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        i2 = SafeParcelReader.readInt(parcel2, readHeader);
                        i = i3;
                        pendingIntent = pendingIntent2;
                        str = str3;
                        break;
                    case 2:
                        i = SafeParcelReader.readInt(parcel2, readHeader);
                        pendingIntent = pendingIntent2;
                        str = str3;
                        break;
                    case 3:
                        pendingIntent = (PendingIntent) SafeParcelReader.createParcelable(parcel2, readHeader, PendingIntent.CREATOR);
                        i = i3;
                        str = str3;
                        break;
                    case 4:
                        str = SafeParcelReader.createString(parcel2, readHeader);
                        i = i3;
                        pendingIntent = pendingIntent2;
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        i = i3;
                        pendingIntent = pendingIntent2;
                        str = str3;
                        break;
                }
                i3 = i;
                pendingIntent2 = pendingIntent;
                str2 = str;
            } else {
                SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new ConnectionResult(i2, i3, pendingIntent2, str3);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ConnectionResult[i];
    }
}
