package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

/* renamed from: com.google.android.gms.common.server.response.zaq */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0577zaq implements Parcelable.Creator<C0560SafeParcelResponse> {
    public C0577zaq() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2;
        C0574zan zan;
        Parcel parcel3 = parcel;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel3);
        int i = 0;
        Parcel parcel4 = null;
        C0574zan zan2 = null;
        while (true) {
            C0574zan zan3 = zan2;
            if (parcel3.dataPosition() < validateObjectHeader) {
                int readHeader = C0461SafeParcelReader.readHeader(parcel3);
                switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        i = C0461SafeParcelReader.readInt(parcel3, readHeader);
                        parcel2 = parcel4;
                        zan = zan3;
                        break;
                    case 2:
                        parcel2 = C0461SafeParcelReader.createParcel(parcel3, readHeader);
                        zan = zan3;
                        break;
                    case 3:
                        zan = (C0574zan) C0461SafeParcelReader.createParcelable(parcel3, readHeader, C0574zan.CREATOR);
                        parcel2 = parcel4;
                        break;
                    default:
                        C0461SafeParcelReader.skipUnknownField(parcel3, readHeader);
                        parcel2 = parcel4;
                        zan = zan3;
                        break;
                }
                parcel4 = parcel2;
                zan2 = zan;
            } else {
                C0461SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
                new C0560SafeParcelResponse(i, parcel4, zan3);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C0560SafeParcelResponse[i];
    }
}
