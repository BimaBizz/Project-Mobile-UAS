package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.zzv */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class C0061zzv implements Parcelable.Creator<C0039DeviceMetaData> {
    public C0061zzv() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C0039DeviceMetaData[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        int i = 0;
        boolean z = false;
        long j = 0;
        boolean z2 = false;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = C0461SafeParcelReader.readHeader(parcel3);
            int i2 = readHeader;
            switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i = C0461SafeParcelReader.readInt(parcel3, i2);
                    break;
                case 2:
                    z = C0461SafeParcelReader.readBoolean(parcel3, i2);
                    break;
                case 3:
                    j = C0461SafeParcelReader.readLong(parcel3, i2);
                    break;
                case 4:
                    z2 = C0461SafeParcelReader.readBoolean(parcel3, i2);
                    break;
                default:
                    C0461SafeParcelReader.skipUnknownField(parcel3, i2);
                    break;
            }
        }
        C0461SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new C0039DeviceMetaData(i, z, j, z2);
        return obj;
    }
}
