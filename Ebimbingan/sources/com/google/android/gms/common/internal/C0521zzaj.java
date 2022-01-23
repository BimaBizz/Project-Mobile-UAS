package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

/* renamed from: com.google.android.gms.common.internal.zzaj */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0521zzaj implements Parcelable.Creator<C0520zzai> {
    public C0521zzaj() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        int i = 0;
        while (parcel2.dataPosition() < validateObjectHeader) {
            int readHeader = C0461SafeParcelReader.readHeader(parcel2);
            switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i = C0461SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                default:
                    C0461SafeParcelReader.skipUnknownField(parcel2, readHeader);
                    break;
            }
        }
        C0461SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
        new C0520zzai(i);
        return obj;
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C0520zzai[i];
    }
}
