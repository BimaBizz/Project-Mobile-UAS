package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class zza implements Parcelable.Creator<Scope> {
    public zza() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        String str;
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        int i = 0;
        String str2 = null;
        while (true) {
            String str3 = str2;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = SafeParcelReader.readHeader(parcel2);
                switch (SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        i = SafeParcelReader.readInt(parcel2, readHeader);
                        str = str3;
                        break;
                    case 2:
                        str = SafeParcelReader.createString(parcel2, readHeader);
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        str = str3;
                        break;
                }
                str2 = str;
            } else {
                SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new Scope(i, str3);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Scope[i];
    }
}
