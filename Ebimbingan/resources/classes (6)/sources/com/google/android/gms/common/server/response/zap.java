package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zap implements Parcelable.Creator<zal> {
    public zap() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        String str;
        ArrayList<zam> arrayList;
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        int i = 0;
        String str2 = null;
        ArrayList<zam> arrayList2 = null;
        while (true) {
            ArrayList<zam> arrayList3 = arrayList2;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = SafeParcelReader.readHeader(parcel2);
                switch (SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        i = SafeParcelReader.readInt(parcel2, readHeader);
                        str = str2;
                        arrayList = arrayList3;
                        break;
                    case 2:
                        str = SafeParcelReader.createString(parcel2, readHeader);
                        arrayList = arrayList3;
                        break;
                    case 3:
                        arrayList = SafeParcelReader.createTypedList(parcel2, readHeader, zam.CREATOR);
                        str = str2;
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        str = str2;
                        arrayList = arrayList3;
                        break;
                }
                str2 = str;
                arrayList2 = arrayList;
            } else {
                SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new zal(i, str2, arrayList3);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zal[i];
    }
}
