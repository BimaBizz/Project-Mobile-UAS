package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zaq implements Parcelable.Creator<SafeParcelResponse> {
    public zaq() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2;
        zan zan;
        Parcel parcel3 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel3);
        int i = 0;
        Parcel parcel4 = null;
        zan zan2 = null;
        while (true) {
            zan zan3 = zan2;
            if (parcel3.dataPosition() < validateObjectHeader) {
                int readHeader = SafeParcelReader.readHeader(parcel3);
                switch (SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        i = SafeParcelReader.readInt(parcel3, readHeader);
                        parcel2 = parcel4;
                        zan = zan3;
                        break;
                    case 2:
                        parcel2 = SafeParcelReader.createParcel(parcel3, readHeader);
                        zan = zan3;
                        break;
                    case 3:
                        zan = (zan) SafeParcelReader.createParcelable(parcel3, readHeader, zan.CREATOR);
                        parcel2 = parcel4;
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel3, readHeader);
                        parcel2 = parcel4;
                        zan = zan3;
                        break;
                }
                parcel4 = parcel2;
                zan2 = zan;
            } else {
                SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
                new SafeParcelResponse(i, parcel4, zan3);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SafeParcelResponse[i];
    }
}
