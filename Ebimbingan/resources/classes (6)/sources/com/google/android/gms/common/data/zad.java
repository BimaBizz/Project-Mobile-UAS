package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zad implements Parcelable.Creator<DataHolder> {
    public zad() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        DataHolder dataHolder;
        CursorWindow[] cursorWindowArr;
        int i;
        Bundle bundle;
        int i2;
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        int i3 = 0;
        String[] strArr = null;
        CursorWindow[] cursorWindowArr2 = null;
        int i4 = 0;
        Bundle bundle2 = null;
        while (true) {
            Bundle bundle3 = bundle2;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = SafeParcelReader.readHeader(parcel2);
                switch (SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        strArr = SafeParcelReader.createStringArray(parcel2, readHeader);
                        cursorWindowArr = cursorWindowArr2;
                        i = i4;
                        bundle = bundle3;
                        i2 = i3;
                        break;
                    case 2:
                        cursorWindowArr = (CursorWindow[]) SafeParcelReader.createTypedArray(parcel2, readHeader, CursorWindow.CREATOR);
                        i = i4;
                        bundle = bundle3;
                        i2 = i3;
                        break;
                    case 3:
                        i = SafeParcelReader.readInt(parcel2, readHeader);
                        cursorWindowArr = cursorWindowArr2;
                        bundle = bundle3;
                        i2 = i3;
                        break;
                    case 4:
                        bundle = SafeParcelReader.createBundle(parcel2, readHeader);
                        cursorWindowArr = cursorWindowArr2;
                        i = i4;
                        i2 = i3;
                        break;
                    case CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT:
                        i2 = SafeParcelReader.readInt(parcel2, readHeader);
                        cursorWindowArr = cursorWindowArr2;
                        i = i4;
                        bundle = bundle3;
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel2, readHeader);
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
                SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new DataHolder(i3, strArr, cursorWindowArr2, i4, bundle3);
                dataHolder.zaa();
                return dataHolder;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DataHolder[i];
    }
}
