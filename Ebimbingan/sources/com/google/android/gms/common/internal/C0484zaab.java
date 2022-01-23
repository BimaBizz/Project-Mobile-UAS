package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.internal.zaab */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0484zaab implements Parcelable.Creator<C0454TelemetryData> {
    public C0484zaab() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        ArrayList<C0443MethodInvocation> arrayList;
        Parcel parcel2 = parcel;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        int i = 0;
        ArrayList<C0443MethodInvocation> arrayList2 = null;
        while (true) {
            ArrayList<C0443MethodInvocation> arrayList3 = arrayList2;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = C0461SafeParcelReader.readHeader(parcel2);
                switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        i = C0461SafeParcelReader.readInt(parcel2, readHeader);
                        arrayList = arrayList3;
                        break;
                    case 2:
                        arrayList = C0461SafeParcelReader.createTypedList(parcel2, readHeader, C0443MethodInvocation.CREATOR);
                        break;
                    default:
                        C0461SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        arrayList = arrayList3;
                        break;
                }
                arrayList2 = arrayList;
            } else {
                C0461SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new C0454TelemetryData(i, arrayList3);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C0454TelemetryData[i];
    }
}
