package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

/* renamed from: com.google.android.gms.common.data.zad */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0408zad implements Parcelable.Creator<C0400DataHolder> {
    public C0408zad() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C0400DataHolder dataHolder;
        CursorWindow[] cursorWindowArr;
        int i;
        Bundle bundle;
        int i2;
        Parcel parcel2 = parcel;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        int i3 = 0;
        String[] strArr = null;
        CursorWindow[] cursorWindowArr2 = null;
        int i4 = 0;
        Bundle bundle2 = null;
        while (true) {
            Bundle bundle3 = bundle2;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = C0461SafeParcelReader.readHeader(parcel2);
                switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        strArr = C0461SafeParcelReader.createStringArray(parcel2, readHeader);
                        cursorWindowArr = cursorWindowArr2;
                        i = i4;
                        bundle = bundle3;
                        i2 = i3;
                        break;
                    case 2:
                        cursorWindowArr = (CursorWindow[]) C0461SafeParcelReader.createTypedArray(parcel2, readHeader, CursorWindow.CREATOR);
                        i = i4;
                        bundle = bundle3;
                        i2 = i3;
                        break;
                    case 3:
                        i = C0461SafeParcelReader.readInt(parcel2, readHeader);
                        cursorWindowArr = cursorWindowArr2;
                        bundle = bundle3;
                        i2 = i3;
                        break;
                    case 4:
                        bundle = C0461SafeParcelReader.createBundle(parcel2, readHeader);
                        cursorWindowArr = cursorWindowArr2;
                        i = i4;
                        i2 = i3;
                        break;
                    case 1000:
                        i2 = C0461SafeParcelReader.readInt(parcel2, readHeader);
                        cursorWindowArr = cursorWindowArr2;
                        i = i4;
                        bundle = bundle3;
                        break;
                    default:
                        C0461SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        cursorWindowArr = cursorWindowArr2;
                        i = i4;
                        bundle = bundle3;
                        i2 = i3;
                        break;
                }
                i3 = i2;
                cursorWindowArr2 = cursorWindowArr;
                i4 = i;
                bundle2 = bundle;
            } else {
                C0461SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new C0400DataHolder(i3, strArr, cursorWindowArr2, i4, bundle3);
                dataHolder.zaa();
                return dataHolder;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C0400DataHolder[i];
    }
}
