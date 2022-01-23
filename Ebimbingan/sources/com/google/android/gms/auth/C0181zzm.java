package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.auth.zzm */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class C0181zzm implements Parcelable.Creator<C0018TokenData> {
    public C0181zzm() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C0018TokenData[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        int i = 0;
        String str = null;
        Long l = null;
        boolean z = false;
        boolean z2 = false;
        ArrayList<String> arrayList = null;
        String str2 = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = C0461SafeParcelReader.readHeader(parcel3);
            int i2 = readHeader;
            switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i = C0461SafeParcelReader.readInt(parcel3, i2);
                    break;
                case 2:
                    str = C0461SafeParcelReader.createString(parcel3, i2);
                    break;
                case 3:
                    l = C0461SafeParcelReader.readLongObject(parcel3, i2);
                    break;
                case 4:
                    z = C0461SafeParcelReader.readBoolean(parcel3, i2);
                    break;
                case 5:
                    z2 = C0461SafeParcelReader.readBoolean(parcel3, i2);
                    break;
                case 6:
                    arrayList = C0461SafeParcelReader.createStringList(parcel3, i2);
                    break;
                case 7:
                    str2 = C0461SafeParcelReader.createString(parcel3, i2);
                    break;
                default:
                    C0461SafeParcelReader.skipUnknownField(parcel3, i2);
                    break;
            }
        }
        C0461SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new C0018TokenData(i, str, l, z, z2, arrayList, str2);
        return obj;
    }
}
