package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class zzah implements Parcelable.Creator<RootTelemetryConfiguration> {
    public zzah() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        boolean z;
        boolean z2;
        int i;
        int i2;
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        int i3 = 0;
        boolean z3 = false;
        boolean z4 = false;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = i5;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = SafeParcelReader.readHeader(parcel2);
                switch (SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        i3 = SafeParcelReader.readInt(parcel2, readHeader);
                        z = z3;
                        z2 = z4;
                        i = i4;
                        i2 = i6;
                        break;
                    case 2:
                        z = SafeParcelReader.readBoolean(parcel2, readHeader);
                        z2 = z4;
                        i = i4;
                        i2 = i6;
                        break;
                    case 3:
                        z2 = SafeParcelReader.readBoolean(parcel2, readHeader);
                        z = z3;
                        i = i4;
                        i2 = i6;
                        break;
                    case 4:
                        i = SafeParcelReader.readInt(parcel2, readHeader);
                        z = z3;
                        z2 = z4;
                        i2 = i6;
                        break;
                    case 5:
                        i2 = SafeParcelReader.readInt(parcel2, readHeader);
                        z = z3;
                        z2 = z4;
                        i = i4;
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        z = z3;
                        z2 = z4;
                        i = i4;
                        i2 = i6;
                        break;
                }
                z3 = z;
                z4 = z2;
                i4 = i;
                i5 = i2;
            } else {
                SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new RootTelemetryConfiguration(i3, z3, z4, i4, i6);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new RootTelemetryConfiguration[i];
    }
}
