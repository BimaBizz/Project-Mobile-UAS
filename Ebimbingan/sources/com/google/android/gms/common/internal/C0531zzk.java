package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

/* renamed from: com.google.android.gms.common.internal.zzk */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0531zzk implements Parcelable.Creator<C0428ConnectionTelemetryConfiguration> {
    public C0531zzk() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        boolean z;
        boolean z2;
        int[] iArr;
        int i;
        int[] iArr2;
        Parcel parcel2 = parcel;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        C0450RootTelemetryConfiguration rootTelemetryConfiguration = null;
        boolean z3 = false;
        boolean z4 = false;
        int[] iArr3 = null;
        int i2 = 0;
        int[] iArr4 = null;
        while (true) {
            int[] iArr5 = iArr4;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = C0461SafeParcelReader.readHeader(parcel2);
                switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        rootTelemetryConfiguration = (C0450RootTelemetryConfiguration) C0461SafeParcelReader.createParcelable(parcel2, readHeader, C0450RootTelemetryConfiguration.CREATOR);
                        z = z3;
                        z2 = z4;
                        iArr = iArr3;
                        i = i2;
                        iArr2 = iArr5;
                        break;
                    case 2:
                        z = C0461SafeParcelReader.readBoolean(parcel2, readHeader);
                        z2 = z4;
                        iArr = iArr3;
                        i = i2;
                        iArr2 = iArr5;
                        break;
                    case 3:
                        z2 = C0461SafeParcelReader.readBoolean(parcel2, readHeader);
                        z = z3;
                        iArr = iArr3;
                        i = i2;
                        iArr2 = iArr5;
                        break;
                    case 4:
                        iArr = C0461SafeParcelReader.createIntArray(parcel2, readHeader);
                        z = z3;
                        z2 = z4;
                        i = i2;
                        iArr2 = iArr5;
                        break;
                    case 5:
                        i = C0461SafeParcelReader.readInt(parcel2, readHeader);
                        z = z3;
                        z2 = z4;
                        iArr = iArr3;
                        iArr2 = iArr5;
                        break;
                    case 6:
                        iArr2 = C0461SafeParcelReader.createIntArray(parcel2, readHeader);
                        z = z3;
                        z2 = z4;
                        iArr = iArr3;
                        i = i2;
                        break;
                    default:
                        C0461SafeParcelReader.skipUnknownField(parcel2, readHeader);
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
                C0461SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new C0428ConnectionTelemetryConfiguration(rootTelemetryConfiguration, z3, z4, iArr3, i2, iArr5);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C0428ConnectionTelemetryConfiguration[i];
    }
}
