package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.auth.zzd */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class C0172zzd implements Parcelable.Creator<C0013AccountChangeEventsResponse> {
    public C0172zzd() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C0013AccountChangeEventsResponse[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        int i = 0;
        ArrayList<C0011AccountChangeEvent> arrayList = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = C0461SafeParcelReader.readHeader(parcel3);
            int i2 = readHeader;
            switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i = C0461SafeParcelReader.readInt(parcel3, i2);
                    break;
                case 2:
                    arrayList = C0461SafeParcelReader.createTypedList(parcel3, i2, C0011AccountChangeEvent.CREATOR);
                    break;
                default:
                    C0461SafeParcelReader.skipUnknownField(parcel3, i2);
                    break;
            }
        }
        C0461SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new C0013AccountChangeEventsResponse(i, arrayList);
        return obj;
    }
}
