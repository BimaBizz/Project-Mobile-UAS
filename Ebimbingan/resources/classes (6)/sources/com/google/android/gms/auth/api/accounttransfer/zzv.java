package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class zzv implements Parcelable.Creator<DeviceMetaData> {
    public zzv() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DeviceMetaData[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        int i = 0;
        boolean z = false;
        long j = 0;
        boolean z2 = false;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel3);
            int i2 = readHeader;
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i = SafeParcelReader.readInt(parcel3, i2);
                    break;
                case 2:
                    z = SafeParcelReader.readBoolean(parcel3, i2);
                    break;
                case 3:
                    j = SafeParcelReader.readLong(parcel3, i2);
                    break;
                case 4:
                    z2 = SafeParcelReader.readBoolean(parcel3, i2);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel3, i2);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new DeviceMetaData(i, z, j, z2);
        return obj;
    }
}
