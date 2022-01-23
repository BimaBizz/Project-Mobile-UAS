package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.server.response.zao */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0575zao implements Parcelable.Creator<C0574zan> {
    public C0575zao() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        ArrayList<C0572zal> arrayList;
        String str;
        Parcel parcel2 = parcel;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        int i = 0;
        ArrayList<C0572zal> arrayList2 = null;
        String str2 = null;
        while (true) {
            String str3 = str2;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = C0461SafeParcelReader.readHeader(parcel2);
                switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        i = C0461SafeParcelReader.readInt(parcel2, readHeader);
                        arrayList = arrayList2;
                        str = str3;
                        break;
                    case 2:
                        arrayList = C0461SafeParcelReader.createTypedList(parcel2, readHeader, C0572zal.CREATOR);
                        str = str3;
                        break;
                    case 3:
                        str = C0461SafeParcelReader.createString(parcel2, readHeader);
                        arrayList = arrayList2;
                        break;
                    default:
                        C0461SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        arrayList = arrayList2;
                        str = str3;
                        break;
                }
                arrayList2 = arrayList;
                str2 = str;
            } else {
                C0461SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new C0574zan(i, arrayList2, str3);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C0574zan[i];
    }
}
