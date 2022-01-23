package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

/* renamed from: com.google.android.gms.common.zzc */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0634zzc implements Parcelable.Creator<C0186Feature> {
    public C0634zzc() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        int i;
        long j;
        Parcel parcel2 = parcel;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        String str = null;
        int i2 = 0;
        long j2 = -1;
        while (true) {
            long j3 = j2;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = C0461SafeParcelReader.readHeader(parcel2);
                switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        str = C0461SafeParcelReader.createString(parcel2, readHeader);
                        i = i2;
                        j = j3;
                        break;
                    case 2:
                        i = C0461SafeParcelReader.readInt(parcel2, readHeader);
                        j = j3;
                        break;
                    case 3:
                        j = C0461SafeParcelReader.readLong(parcel2, readHeader);
                        i = i2;
                        break;
                    default:
                        C0461SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        i = i2;
                        j = j3;
                        break;
                }
                i2 = i;
                j2 = j;
            } else {
                C0461SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new C0186Feature(str, i2, j3);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C0186Feature[i];
    }
}
