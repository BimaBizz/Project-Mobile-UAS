package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.C0235Scope;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

/* renamed from: com.google.android.gms.common.internal.zay */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0509zay implements Parcelable.Creator<C0508zax> {
    public C0509zay() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        int i;
        int i2;
        C0235Scope[] scopeArr;
        Parcel parcel2 = parcel;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        C0235Scope[] scopeArr2 = null;
        while (true) {
            C0235Scope[] scopeArr3 = scopeArr2;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = C0461SafeParcelReader.readHeader(parcel2);
                switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        i3 = C0461SafeParcelReader.readInt(parcel2, readHeader);
                        i = i4;
                        i2 = i5;
                        scopeArr = scopeArr3;
                        break;
                    case 2:
                        i = C0461SafeParcelReader.readInt(parcel2, readHeader);
                        i2 = i5;
                        scopeArr = scopeArr3;
                        break;
                    case 3:
                        i2 = C0461SafeParcelReader.readInt(parcel2, readHeader);
                        i = i4;
                        scopeArr = scopeArr3;
                        break;
                    case 4:
                        scopeArr = (C0235Scope[]) C0461SafeParcelReader.createTypedArray(parcel2, readHeader, C0235Scope.CREATOR);
                        i = i4;
                        i2 = i5;
                        break;
                    default:
                        C0461SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        i = i4;
                        i2 = i5;
                        scopeArr = scopeArr3;
                        break;
                }
                i4 = i;
                i5 = i2;
                scopeArr2 = scopeArr;
            } else {
                C0461SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new C0508zax(i3, i4, i5, scopeArr3);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C0508zax[i];
    }
}
