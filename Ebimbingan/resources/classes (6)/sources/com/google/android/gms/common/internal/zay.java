package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zay implements Parcelable.Creator<zax> {
    public zay() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        int i;
        int i2;
        Scope[] scopeArr;
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        Scope[] scopeArr2 = null;
        while (true) {
            Scope[] scopeArr3 = scopeArr2;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = SafeParcelReader.readHeader(parcel2);
                switch (SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        i3 = SafeParcelReader.readInt(parcel2, readHeader);
                        i = i4;
                        i2 = i5;
                        scopeArr = scopeArr3;
                        break;
                    case 2:
                        i = SafeParcelReader.readInt(parcel2, readHeader);
                        i2 = i5;
                        scopeArr = scopeArr3;
                        break;
                    case 3:
                        i2 = SafeParcelReader.readInt(parcel2, readHeader);
                        i = i4;
                        scopeArr = scopeArr3;
                        break;
                    case 4:
                        scopeArr = (Scope[]) SafeParcelReader.createTypedArray(parcel2, readHeader, Scope.CREATOR);
                        i = i4;
                        i2 = i5;
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        i = i4;
                        i2 = i5;
                        scopeArr = scopeArr3;
                        break;
                }
                i4 = i;
                i5 = i2;
                scopeArr2 = scopeArr;
            } else {
                SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new zax(i3, i4, i5, scopeArr3);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zax[i];
    }
}
