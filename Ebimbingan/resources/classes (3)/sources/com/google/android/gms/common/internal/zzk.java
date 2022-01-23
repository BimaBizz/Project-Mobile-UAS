package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class zzk implements Parcelable.Creator<ConnectionTelemetryConfiguration> {
    public zzk() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        boolean z;
        boolean z2;
        int[] iArr;
        int i;
        int[] iArr2;
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        RootTelemetryConfiguration rootTelemetryConfiguration = null;
        boolean z3 = false;
        boolean z4 = false;
        int[] iArr3 = null;
        int i2 = 0;
        int[] iArr4 = null;
        while (true) {
            int[] iArr5 = iArr4;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = SafeParcelReader.readHeader(parcel2);
                switch (SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        rootTelemetryConfiguration = (RootTelemetryConfiguration) SafeParcelReader.createParcelable(parcel2, readHeader, RootTelemetryConfiguration.CREATOR);
                        z = z3;
                        z2 = z4;
                        iArr = iArr3;
                        i = i2;
                        iArr2 = iArr5;
                        break;
                    case 2:
                        z = SafeParcelReader.readBoolean(parcel2, readHeader);
                        z2 = z4;
                        iArr = iArr3;
                        i = i2;
                        iArr2 = iArr5;
                        break;
                    case 3:
                        z2 = SafeParcelReader.readBoolean(parcel2, readHeader);
                        z = z3;
                        iArr = iArr3;
                        i = i2;
                        iArr2 = iArr5;
                        break;
                    case 4:
                        iArr = SafeParcelReader.createIntArray(parcel2, readHeader);
                        z = z3;
                        z2 = z4;
                        i = i2;
                        iArr2 = iArr5;
                        break;
                    case 5:
                        i = SafeParcelReader.readInt(parcel2, readHeader);
                        z = z3;
                        z2 = z4;
                        iArr = iArr3;
                        iArr2 = iArr5;
                        break;
                    case 6:
                        iArr2 = SafeParcelReader.createIntArray(parcel2, readHeader);
                        z = z3;
                        z2 = z4;
                        iArr = iArr3;
                        i = i2;
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        z = z3;
                        z2 = z4;
                        iArr = iArr3;
                        i = i2;
                        iArr2 = iArr5;
                        break;
                }
                z3 = z;
                z4 = z2;
                iArr3 = iArr;
                i2 = i;
                iArr4 = iArr2;
            } else {
                SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, z3, z4, iArr3, i2, iArr5);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ConnectionTelemetryConfiguration[i];
    }
}
