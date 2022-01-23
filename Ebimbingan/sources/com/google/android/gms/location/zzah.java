package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

public final class zzah implements Parcelable.Creator<LocationSettingsResult> {
    public zzah() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        C0236Status status = null;
        LocationSettingsStates locationSettingsStates = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = C0461SafeParcelReader.readHeader(parcel3);
            int i = readHeader;
            switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    status = (C0236Status) C0461SafeParcelReader.createParcelable(parcel3, i, C0236Status.CREATOR);
                    break;
                case 2:
                    locationSettingsStates = (LocationSettingsStates) C0461SafeParcelReader.createParcelable(parcel3, i, LocationSettingsStates.CREATOR);
                    break;
                default:
                    C0461SafeParcelReader.skipUnknownField(parcel3, i);
                    break;
            }
        }
        C0461SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new LocationSettingsResult(status, locationSettingsStates);
        return obj;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsResult[i];
    }
}
