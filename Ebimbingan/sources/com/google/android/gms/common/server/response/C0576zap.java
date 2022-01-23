package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.server.response.zap */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0576zap implements Parcelable.Creator<C0572zal> {
    public C0576zap() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        String str;
        ArrayList<C0573zam> arrayList;
        Parcel parcel2 = parcel;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        int i = 0;
        String str2 = null;
        ArrayList<C0573zam> arrayList2 = null;
        while (true) {
            ArrayList<C0573zam> arrayList3 = arrayList2;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = C0461SafeParcelReader.readHeader(parcel2);
                switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        i = C0461SafeParcelReader.readInt(parcel2, readHeader);
                        str = str2;
                        arrayList = arrayList3;
                        break;
                    case 2:
                        str = C0461SafeParcelReader.createString(parcel2, readHeader);
                        arrayList = arrayList3;
                        break;
                    case 3:
                        arrayList = C0461SafeParcelReader.createTypedList(parcel2, readHeader, C0573zam.CREATOR);
                        str = str2;
                        break;
                    default:
                        C0461SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        str = str2;
                        arrayList = arrayList3;
                        break;
                }
                str2 = str;
                arrayList2 = arrayList;
            } else {
                C0461SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new C0572zal(i, str2, arrayList3);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C0572zal[i];
    }
}
