package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C0186Feature;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

/* renamed from: com.google.android.gms.common.internal.zzj */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0530zzj implements Parcelable.Creator<C0529zzi> {
    public C0530zzj() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        C0186Feature[] featureArr;
        int i;
        C0428ConnectionTelemetryConfiguration connectionTelemetryConfiguration;
        Parcel parcel2 = parcel;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        Bundle bundle = null;
        C0186Feature[] featureArr2 = null;
        int i2 = 0;
        C0428ConnectionTelemetryConfiguration connectionTelemetryConfiguration2 = null;
        while (true) {
            C0428ConnectionTelemetryConfiguration connectionTelemetryConfiguration3 = connectionTelemetryConfiguration2;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = C0461SafeParcelReader.readHeader(parcel2);
                switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        bundle = C0461SafeParcelReader.createBundle(parcel2, readHeader);
                        featureArr = featureArr2;
                        i = i2;
                        connectionTelemetryConfiguration = connectionTelemetryConfiguration3;
                        break;
                    case 2:
                        featureArr = (C0186Feature[]) C0461SafeParcelReader.createTypedArray(parcel2, readHeader, C0186Feature.CREATOR);
                        i = i2;
                        connectionTelemetryConfiguration = connectionTelemetryConfiguration3;
                        break;
                    case 3:
                        i = C0461SafeParcelReader.readInt(parcel2, readHeader);
                        featureArr = featureArr2;
                        connectionTelemetryConfiguration = connectionTelemetryConfiguration3;
                        break;
                    case 4:
                        connectionTelemetryConfiguration = (C0428ConnectionTelemetryConfiguration) C0461SafeParcelReader.createParcelable(parcel2, readHeader, C0428ConnectionTelemetryConfiguration.CREATOR);
                        featureArr = featureArr2;
                        i = i2;
                        break;
                    default:
                        C0461SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        featureArr = featureArr2;
                        i = i2;
                        connectionTelemetryConfiguration = connectionTelemetryConfiguration3;
                        break;
                }
                featureArr2 = featureArr;
                i2 = i;
                connectionTelemetryConfiguration2 = connectionTelemetryConfiguration;
            } else {
                C0461SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new C0529zzi(bundle, featureArr2, i2, connectionTelemetryConfiguration3);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C0529zzi[i];
    }
}
