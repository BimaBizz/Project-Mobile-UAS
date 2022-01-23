package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class zzo implements Parcelable.Creator<zzp> {
    public zzo() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzp[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        int i = 0;
        ArrayList<String> arrayList = null;
        ArrayList<String> arrayList2 = null;
        ArrayList<String> arrayList3 = null;
        ArrayList<String> arrayList4 = null;
        ArrayList<String> arrayList5 = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel3);
            int i2 = readHeader;
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i = SafeParcelReader.readInt(parcel3, i2);
                    break;
                case 2:
                    arrayList = SafeParcelReader.createStringList(parcel3, i2);
                    break;
                case 3:
                    arrayList2 = SafeParcelReader.createStringList(parcel3, i2);
                    break;
                case 4:
                    arrayList3 = SafeParcelReader.createStringList(parcel3, i2);
                    break;
                case 5:
                    arrayList4 = SafeParcelReader.createStringList(parcel3, i2);
                    break;
                case 6:
                    arrayList5 = SafeParcelReader.createStringList(parcel3, i2);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel3, i2);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new zzp(i, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
        return obj;
    }
}
