package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

public final class zzai implements Parcelable.Creator<LocationSettingsStates> {
    public zzai() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = C0461SafeParcelReader.readHeader(parcel3);
            int i = readHeader;
            switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    z = C0461SafeParcelReader.readBoolean(parcel3, i);
                    break;
                case 2:
                    z2 = C0461SafeParcelReader.readBoolean(parcel3, i);
                    break;
                case 3:
                    z3 = C0461SafeParcelReader.readBoolean(parcel3, i);
                    break;
                case 4:
                    z4 = C0461SafeParcelReader.readBoolean(parcel3, i);
                    break;
                case 5:
                    z5 = C0461SafeParcelReader.readBoolean(parcel3, i);
                    break;
                case 6:
                    z6 = C0461SafeParcelReader.readBoolean(parcel3, i);
                    break;
                default:
                    C0461SafeParcelReader.skipUnknownField(parcel3, i);
                    break;
            }
        }
        C0461SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new LocationSettingsStates(z, z2, z3, z4, z5, z6);
        return obj;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsStates[i];
    }
}
