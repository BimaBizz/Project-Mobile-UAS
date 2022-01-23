package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;
import com.google.firebase.auth.zzf;
import java.util.ArrayList;

public final class zzep implements Parcelable.Creator<zzem> {
    public zzep() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzem[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        String str = null;
        String str2 = null;
        boolean z = false;
        String str3 = null;
        String str4 = null;
        zzey zzey = null;
        String str5 = null;
        String str6 = null;
        long j = 0;
        long j2 = 0;
        boolean z2 = false;
        zzf zzf = null;
        ArrayList<zzeu> arrayList = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = C0461SafeParcelReader.readHeader(parcel3);
            int i = readHeader;
            switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    str = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                case 3:
                    str2 = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                case 4:
                    z = C0461SafeParcelReader.readBoolean(parcel3, i);
                    break;
                case 5:
                    str3 = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                case 6:
                    str4 = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                case 7:
                    zzey = (zzey) C0461SafeParcelReader.createParcelable(parcel3, i, zzey.CREATOR);
                    break;
                case 8:
                    str5 = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                case 9:
                    str6 = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                case 10:
                    j = C0461SafeParcelReader.readLong(parcel3, i);
                    break;
                case 11:
                    j2 = C0461SafeParcelReader.readLong(parcel3, i);
                    break;
                case 12:
                    z2 = C0461SafeParcelReader.readBoolean(parcel3, i);
                    break;
                case 13:
                    zzf = (zzf) C0461SafeParcelReader.createParcelable(parcel3, i, zzf.CREATOR);
                    break;
                case 14:
                    arrayList = C0461SafeParcelReader.createTypedList(parcel3, i, zzeu.CREATOR);
                    break;
                default:
                    C0461SafeParcelReader.skipUnknownField(parcel3, i);
                    break;
            }
        }
        C0461SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new zzem(str, str2, z, str3, str4, zzey, str5, str6, j, j2, z2, zzf, arrayList);
        return obj;
    }
}
