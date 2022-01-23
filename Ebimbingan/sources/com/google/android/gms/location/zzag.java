package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;
import java.util.ArrayList;

public final class zzag implements Parcelable.Creator<LocationSettingsRequest> {
    public zzag() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        ArrayList<LocationRequest> arrayList = null;
        boolean z = false;
        boolean z2 = false;
        zzae zzae = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = C0461SafeParcelReader.readHeader(parcel3);
            int i = readHeader;
            switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    arrayList = C0461SafeParcelReader.createTypedList(parcel3, i, LocationRequest.CREATOR);
                    break;
                case 2:
                    z = C0461SafeParcelReader.readBoolean(parcel3, i);
                    break;
                case 3:
                    z2 = C0461SafeParcelReader.readBoolean(parcel3, i);
                    break;
                case 5:
                    zzae = (zzae) C0461SafeParcelReader.createParcelable(parcel3, i, zzae.CREATOR);
                    break;
                default:
                    C0461SafeParcelReader.skipUnknownField(parcel3, i);
                    break;
            }
        }
        C0461SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new LocationSettingsRequest(arrayList, z, z2, zzae);
        return obj;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsRequest[i];
    }
}
