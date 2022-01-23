package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

/* renamed from: com.google.android.gms.common.data.zaa */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0405zaa implements Parcelable.Creator<C0392BitmapTeleporter> {
    public C0405zaa() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        ParcelFileDescriptor parcelFileDescriptor;
        int i;
        Parcel parcel2 = parcel;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        int i2 = 0;
        ParcelFileDescriptor parcelFileDescriptor2 = null;
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = C0461SafeParcelReader.readHeader(parcel2);
                switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        i2 = C0461SafeParcelReader.readInt(parcel2, readHeader);
                        parcelFileDescriptor = parcelFileDescriptor2;
                        i = i4;
                        break;
                    case 2:
                        parcelFileDescriptor = (ParcelFileDescriptor) C0461SafeParcelReader.createParcelable(parcel2, readHeader, ParcelFileDescriptor.CREATOR);
                        i = i4;
                        break;
                    case 3:
                        i = C0461SafeParcelReader.readInt(parcel2, readHeader);
                        parcelFileDescriptor = parcelFileDescriptor2;
                        break;
                    default:
                        C0461SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        parcelFileDescriptor = parcelFileDescriptor2;
                        i = i4;
                        break;
                }
                parcelFileDescriptor2 = parcelFileDescriptor;
                i3 = i;
            } else {
                C0461SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new C0392BitmapTeleporter(i2, parcelFileDescriptor2, i4);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C0392BitmapTeleporter[i];
    }
}
