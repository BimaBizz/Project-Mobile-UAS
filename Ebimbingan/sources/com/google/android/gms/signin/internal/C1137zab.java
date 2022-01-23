package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

/* renamed from: com.google.android.gms.signin.internal.zab */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C1137zab implements Parcelable.Creator<C1136zaa> {
    public C1137zab() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        int i;
        Intent intent;
        Parcel parcel2 = parcel;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        int i2 = 0;
        int i3 = 0;
        Intent intent2 = null;
        while (true) {
            Intent intent3 = intent2;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = C0461SafeParcelReader.readHeader(parcel2);
                switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        i2 = C0461SafeParcelReader.readInt(parcel2, readHeader);
                        i = i3;
                        intent = intent3;
                        break;
                    case 2:
                        i = C0461SafeParcelReader.readInt(parcel2, readHeader);
                        intent = intent3;
                        break;
                    case 3:
                        intent = (Intent) C0461SafeParcelReader.createParcelable(parcel2, readHeader, Intent.CREATOR);
                        i = i3;
                        break;
                    default:
                        C0461SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        i = i3;
                        intent = intent3;
                        break;
                }
                i3 = i;
                intent2 = intent;
            } else {
                C0461SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new C1136zaa(i2, i3, intent3);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C1136zaa[i];
    }
}
