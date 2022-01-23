package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zaab implements Parcelable.Creator<TelemetryData> {
    public zaab() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        ArrayList<MethodInvocation> arrayList;
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        int i = 0;
        ArrayList<MethodInvocation> arrayList2 = null;
        while (true) {
            ArrayList<MethodInvocation> arrayList3 = arrayList2;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = SafeParcelReader.readHeader(parcel2);
                switch (SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        i = SafeParcelReader.readInt(parcel2, readHeader);
                        arrayList = arrayList3;
                        break;
                    case 2:
                        arrayList = SafeParcelReader.createTypedList(parcel2, readHeader, MethodInvocation.CREATOR);
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        arrayList = arrayList3;
                        break;
                }
                arrayList2 = arrayList;
            } else {
                SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new TelemetryData(i, arrayList3);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TelemetryData[i];
    }
}
