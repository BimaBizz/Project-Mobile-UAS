package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;
import com.google.android.gms.common.server.response.C0557FastJsonResponse;

/* renamed from: com.google.android.gms.common.server.response.zak */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0571zak implements Parcelable.Creator<C0573zam> {
    public C0571zak() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        String str;
        C0557FastJsonResponse.Field field;
        Parcel parcel2 = parcel;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        int i = 0;
        String str2 = null;
        C0557FastJsonResponse.Field field2 = null;
        while (true) {
            C0557FastJsonResponse.Field field3 = field2;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = C0461SafeParcelReader.readHeader(parcel2);
                switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        i = C0461SafeParcelReader.readInt(parcel2, readHeader);
                        str = str2;
                        field = field3;
                        break;
                    case 2:
                        str = C0461SafeParcelReader.createString(parcel2, readHeader);
                        field = field3;
                        break;
                    case 3:
                        field = (C0557FastJsonResponse.Field) C0461SafeParcelReader.createParcelable(parcel2, readHeader, C0557FastJsonResponse.Field.CREATOR);
                        str = str2;
                        break;
                    default:
                        C0461SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        str = str2;
                        field = field3;
                        break;
                }
                str2 = str;
                field2 = field;
            } else {
                C0461SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new C0573zam(i, str2, field3);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C0573zam[i];
    }
}
