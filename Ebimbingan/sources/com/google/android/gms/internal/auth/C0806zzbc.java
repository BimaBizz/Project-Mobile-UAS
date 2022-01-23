package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

/* renamed from: com.google.android.gms.internal.auth.zzbc */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class C0806zzbc implements Parcelable.Creator<C0807zzbd> {
    public C0806zzbc() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C0807zzbd[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        int i = 0;
        String str = null;
        byte[] bArr = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = C0461SafeParcelReader.readHeader(parcel3);
            int i2 = readHeader;
            switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i = C0461SafeParcelReader.readInt(parcel3, i2);
                    break;
                case 2:
                    str = C0461SafeParcelReader.createString(parcel3, i2);
                    break;
                case 3:
                    bArr = C0461SafeParcelReader.createByteArray(parcel3, i2);
                    break;
                default:
                    C0461SafeParcelReader.skipUnknownField(parcel3, i2);
                    break;
            }
        }
        C0461SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new C0807zzbd(i, str, bArr);
        return obj;
    }
}
