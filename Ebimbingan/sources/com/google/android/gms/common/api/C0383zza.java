package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

/* renamed from: com.google.android.gms.common.api.zza */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0383zza implements Parcelable.Creator<C0235Scope> {
    public C0383zza() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        String str;
        Parcel parcel2 = parcel;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        int i = 0;
        String str2 = null;
        while (true) {
            String str3 = str2;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = C0461SafeParcelReader.readHeader(parcel2);
                switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        i = C0461SafeParcelReader.readInt(parcel2, readHeader);
                        str = str3;
                        break;
                    case 2:
                        str = C0461SafeParcelReader.createString(parcel2, readHeader);
                        break;
                    default:
                        C0461SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        str = str3;
                        break;
                }
                str2 = str;
            } else {
                C0461SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new C0235Scope(i, str3);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C0235Scope[i];
    }
}
