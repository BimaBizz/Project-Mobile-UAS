package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0426ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

public final class zzbe implements Parcelable.Creator<zzbd> {
    public zzbe() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        LocationRequest locationRequest = null;
        ArrayList<C0426ClientIdentity> arrayList = zzbd.zzcd;
        String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        String str2 = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = C0461SafeParcelReader.readHeader(parcel3);
            int i = readHeader;
            switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    locationRequest = (LocationRequest) C0461SafeParcelReader.createParcelable(parcel3, i, LocationRequest.CREATOR);
                    break;
                case 5:
                    arrayList = C0461SafeParcelReader.createTypedList(parcel3, i, C0426ClientIdentity.CREATOR);
                    break;
                case 6:
                    str = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                case 7:
                    z = C0461SafeParcelReader.readBoolean(parcel3, i);
                    break;
                case 8:
                    z2 = C0461SafeParcelReader.readBoolean(parcel3, i);
                    break;
                case 9:
                    z3 = C0461SafeParcelReader.readBoolean(parcel3, i);
                    break;
                case 10:
                    str2 = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                default:
                    C0461SafeParcelReader.skipUnknownField(parcel3, i);
                    break;
            }
        }
        C0461SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new zzbd(locationRequest, arrayList, str, z, z2, z3, str2);
        return obj;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbd[i];
    }
}
