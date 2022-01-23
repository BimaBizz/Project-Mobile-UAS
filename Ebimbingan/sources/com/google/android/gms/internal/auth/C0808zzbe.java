package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

/* renamed from: com.google.android.gms.internal.auth.zzbe */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class C0808zzbe implements Parcelable.Creator<C0809zzbf> {
    public C0808zzbe() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C0809zzbf[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        int i = 0;
        String str = null;
        PendingIntent pendingIntent = null;
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
                    pendingIntent = (PendingIntent) C0461SafeParcelReader.createParcelable(parcel3, i2, PendingIntent.CREATOR);
                    break;
                default:
                    C0461SafeParcelReader.skipUnknownField(parcel3, i2);
                    break;
            }
        }
        C0461SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new C0809zzbf(i, str, pendingIntent);
        return obj;
    }
}
