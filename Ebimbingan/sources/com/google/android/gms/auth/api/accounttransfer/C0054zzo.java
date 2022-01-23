package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.zzo */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class C0054zzo implements Parcelable.Creator<C0055zzp> {
    public C0054zzo() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C0055zzp[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        int i = 0;
        ArrayList<String> arrayList = null;
        ArrayList<String> arrayList2 = null;
        ArrayList<String> arrayList3 = null;
        ArrayList<String> arrayList4 = null;
        ArrayList<String> arrayList5 = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = C0461SafeParcelReader.readHeader(parcel3);
            int i2 = readHeader;
            switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i = C0461SafeParcelReader.readInt(parcel3, i2);
                    break;
                case 2:
                    arrayList = C0461SafeParcelReader.createStringList(parcel3, i2);
                    break;
                case 3:
                    arrayList2 = C0461SafeParcelReader.createStringList(parcel3, i2);
                    break;
                case 4:
                    arrayList3 = C0461SafeParcelReader.createStringList(parcel3, i2);
                    break;
                case 5:
                    arrayList4 = C0461SafeParcelReader.createStringList(parcel3, i2);
                    break;
                case 6:
                    arrayList5 = C0461SafeParcelReader.createStringList(parcel3, i2);
                    break;
                default:
                    C0461SafeParcelReader.skipUnknownField(parcel3, i2);
                    break;
            }
        }
        C0461SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new C0055zzp(i, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
        return obj;
    }
}
