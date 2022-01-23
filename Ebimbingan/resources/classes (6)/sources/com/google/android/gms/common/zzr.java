package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class zzr implements Parcelable.Creator<zzq> {
    public zzr() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        String str;
        int i;
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        boolean z = false;
        String str2 = null;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = SafeParcelReader.readHeader(parcel2);
                switch (SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        z = SafeParcelReader.readBoolean(parcel2, readHeader);
                        str = str2;
                        i = i3;
                        break;
                    case 2:
                        str = SafeParcelReader.createString(parcel2, readHeader);
                        i = i3;
                        break;
                    case 3:
                        i = SafeParcelReader.readInt(parcel2, readHeader);
                        str = str2;
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        str = str2;
                        i = i3;
                        break;
                }
                str2 = str;
                i2 = i;
            } else {
                SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new zzq(z, str2, i3);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzq[i];
    }
}
