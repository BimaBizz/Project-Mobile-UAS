package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zao implements Parcelable.Creator<zan> {
    public zao() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        ArrayList<zal> arrayList;
        String str;
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        int i = 0;
        ArrayList<zal> arrayList2 = null;
        String str2 = null;
        while (true) {
            String str3 = str2;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = SafeParcelReader.readHeader(parcel2);
                switch (SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        i = SafeParcelReader.readInt(parcel2, readHeader);
                        arrayList = arrayList2;
                        str = str3;
                        break;
                    case 2:
                        arrayList = SafeParcelReader.createTypedList(parcel2, readHeader, zal.CREATOR);
                        str = str3;
                        break;
                    case 3:
                        str = SafeParcelReader.createString(parcel2, readHeader);
                        arrayList = arrayList2;
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        arrayList = arrayList2;
                        str = str3;
                        break;
                }
                arrayList2 = arrayList;
                str2 = str;
            } else {
                SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new zan(i, arrayList2, str3);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zan[i];
    }
}
