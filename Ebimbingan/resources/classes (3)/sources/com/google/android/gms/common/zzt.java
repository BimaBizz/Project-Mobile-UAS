package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class zzt implements Parcelable.Creator<zzs> {
    public zzt() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        IBinder iBinder;
        boolean z;
        boolean z2;
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        String str = null;
        IBinder iBinder2 = null;
        boolean z3 = false;
        boolean z4 = false;
        while (true) {
            boolean z5 = z4;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = SafeParcelReader.readHeader(parcel2);
                switch (SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        str = SafeParcelReader.createString(parcel2, readHeader);
                        iBinder = iBinder2;
                        z = z3;
                        z2 = z5;
                        break;
                    case 2:
                        iBinder = SafeParcelReader.readIBinder(parcel2, readHeader);
                        z = z3;
                        z2 = z5;
                        break;
                    case 3:
                        z = SafeParcelReader.readBoolean(parcel2, readHeader);
                        iBinder = iBinder2;
                        z2 = z5;
                        break;
                    case 4:
                        z2 = SafeParcelReader.readBoolean(parcel2, readHeader);
                        iBinder = iBinder2;
                        z = z3;
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        iBinder = iBinder2;
                        z = z3;
                        z2 = z5;
                        break;
                }
                iBinder2 = iBinder;
                z3 = z;
                z4 = z2;
            } else {
                SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new zzs(str, iBinder2, z3, z5);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzs[i];
    }
}
