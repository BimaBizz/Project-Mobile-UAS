package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zab implements Parcelable.Creator<zaa> {
    public zab() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        int i;
        Intent intent;
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        int i2 = 0;
        int i3 = 0;
        Intent intent2 = null;
        while (true) {
            Intent intent3 = intent2;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = SafeParcelReader.readHeader(parcel2);
                switch (SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        i2 = SafeParcelReader.readInt(parcel2, readHeader);
                        i = i3;
                        intent = intent3;
                        break;
                    case 2:
                        i = SafeParcelReader.readInt(parcel2, readHeader);
                        intent = intent3;
                        break;
                    case 3:
                        intent = (Intent) SafeParcelReader.createParcelable(parcel2, readHeader, Intent.CREATOR);
                        i = i3;
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        i = i3;
                        intent = intent3;
                        break;
                }
                i3 = i;
                intent2 = intent;
            } else {
                SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new zaa(i2, i3, intent3);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zaa[i];
    }
}
