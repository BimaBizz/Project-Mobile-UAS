package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.zzf;
import java.util.ArrayList;

public final class zzea implements Parcelable.Creator<zzeb> {
    public zzea() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzeb[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        String str = null;
        ArrayList arrayList = null;
        zzf zzf = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel3);
            int i = readHeader;
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    str = SafeParcelReader.createString(parcel3, i);
                    break;
                case 2:
                    arrayList = SafeParcelReader.createTypedList(parcel3, i, zzeu.CREATOR);
                    break;
                case 3:
                    zzf = (zzf) SafeParcelReader.createParcelable(parcel3, i, zzf.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel3, i);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new zzeb(str, arrayList, zzf);
        return obj;
    }
}
