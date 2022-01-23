package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zaa implements Parcelable.Creator<BitmapTeleporter> {
    public zaa() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        ParcelFileDescriptor parcelFileDescriptor;
        int i;
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        int i2 = 0;
        ParcelFileDescriptor parcelFileDescriptor2 = null;
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = SafeParcelReader.readHeader(parcel2);
                switch (SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        i2 = SafeParcelReader.readInt(parcel2, readHeader);
                        parcelFileDescriptor = parcelFileDescriptor2;
                        i = i4;
                        break;
                    case 2:
                        parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.createParcelable(parcel2, readHeader, ParcelFileDescriptor.CREATOR);
                        i = i4;
                        break;
                    case 3:
                        i = SafeParcelReader.readInt(parcel2, readHeader);
                        parcelFileDescriptor = parcelFileDescriptor2;
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        parcelFileDescriptor = parcelFileDescriptor2;
                        i = i4;
                        break;
                }
                parcelFileDescriptor2 = parcelFileDescriptor;
                i3 = i;
            } else {
                SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new BitmapTeleporter(i2, parcelFileDescriptor2, i4);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BitmapTeleporter[i];
    }
}
