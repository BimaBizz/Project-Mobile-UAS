package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class zzb implements Parcelable.Creator<Status> {
    public zzb() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        String str;
        PendingIntent pendingIntent;
        ConnectionResult connectionResult;
        int i;
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        int i2 = 0;
        int i3 = 0;
        String str2 = null;
        PendingIntent pendingIntent2 = null;
        ConnectionResult connectionResult2 = null;
        while (true) {
            ConnectionResult connectionResult3 = connectionResult2;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = SafeParcelReader.readHeader(parcel2);
                switch (SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        i3 = SafeParcelReader.readInt(parcel2, readHeader);
                        str = str2;
                        pendingIntent = pendingIntent2;
                        connectionResult = connectionResult3;
                        i = i2;
                        break;
                    case 2:
                        str = SafeParcelReader.createString(parcel2, readHeader);
                        pendingIntent = pendingIntent2;
                        connectionResult = connectionResult3;
                        i = i2;
                        break;
                    case 3:
                        pendingIntent = (PendingIntent) SafeParcelReader.createParcelable(parcel2, readHeader, PendingIntent.CREATOR);
                        str = str2;
                        connectionResult = connectionResult3;
                        i = i2;
                        break;
                    case 4:
                        connectionResult = (ConnectionResult) SafeParcelReader.createParcelable(parcel2, readHeader, ConnectionResult.CREATOR);
                        str = str2;
                        pendingIntent = pendingIntent2;
                        i = i2;
                        break;
                    case CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT:
                        i = SafeParcelReader.readInt(parcel2, readHeader);
                        str = str2;
                        pendingIntent = pendingIntent2;
                        connectionResult = connectionResult3;
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel2, readHeader);
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
                SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new Status(i2, i3, str2, pendingIntent2, connectionResult3);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}
