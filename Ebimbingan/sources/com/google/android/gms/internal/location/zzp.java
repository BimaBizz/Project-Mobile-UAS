package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

public final class zzp implements Parcelable.Creator<zzo> {
    public zzp() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        int i = 1;
        zzm zzm = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = C0461SafeParcelReader.readHeader(parcel3);
            int i2 = readHeader;
            switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i = C0461SafeParcelReader.readInt(parcel3, i2);
                    break;
                case 2:
                    zzm = (zzm) C0461SafeParcelReader.createParcelable(parcel3, i2, zzm.CREATOR);
                    break;
                case 3:
                    iBinder = C0461SafeParcelReader.readIBinder(parcel3, i2);
                    break;
                case 4:
                    iBinder2 = C0461SafeParcelReader.readIBinder(parcel3, i2);
                    break;
                default:
                    C0461SafeParcelReader.skipUnknownField(parcel3, i2);
                    break;
            }
        }
        C0461SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new zzo(i, zzm, iBinder, iBinder2);
        return obj;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzo[i];
    }
}
