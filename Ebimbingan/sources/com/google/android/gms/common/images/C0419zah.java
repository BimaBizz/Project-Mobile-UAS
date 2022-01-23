package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

/* renamed from: com.google.android.gms.common.images.zah */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0419zah implements Parcelable.Creator<C0411WebImage> {
    public C0419zah() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Uri uri;
        int i;
        int i2;
        Parcel parcel2 = parcel;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        int i3 = 0;
        Uri uri2 = null;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = i5;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = C0461SafeParcelReader.readHeader(parcel2);
                switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        i3 = C0461SafeParcelReader.readInt(parcel2, readHeader);
                        uri = uri2;
                        i = i4;
                        i2 = i6;
                        break;
                    case 2:
                        uri = (Uri) C0461SafeParcelReader.createParcelable(parcel2, readHeader, Uri.CREATOR);
                        i = i4;
                        i2 = i6;
                        break;
                    case 3:
                        i = C0461SafeParcelReader.readInt(parcel2, readHeader);
                        uri = uri2;
                        i2 = i6;
                        break;
                    case 4:
                        i2 = C0461SafeParcelReader.readInt(parcel2, readHeader);
                        uri = uri2;
                        i = i4;
                        break;
                    default:
                        C0461SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        uri = uri2;
                        i = i4;
                        i2 = i6;
                        break;
                }
                uri2 = uri;
                i4 = i;
                i5 = i2;
            } else {
                C0461SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new C0411WebImage(i3, uri2, i4, i6);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C0411WebImage[i];
    }
}
