package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class zzj implements Parcelable.Creator<zzi> {
    public zzj() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Feature[] featureArr;
        int i;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration;
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        Bundle bundle = null;
        Feature[] featureArr2 = null;
        int i2 = 0;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration2 = null;
        while (true) {
            ConnectionTelemetryConfiguration connectionTelemetryConfiguration3 = connectionTelemetryConfiguration2;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = SafeParcelReader.readHeader(parcel2);
                switch (SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        bundle = SafeParcelReader.createBundle(parcel2, readHeader);
                        featureArr = featureArr2;
                        i = i2;
                        connectionTelemetryConfiguration = connectionTelemetryConfiguration3;
                        break;
                    case 2:
                        featureArr = (Feature[]) SafeParcelReader.createTypedArray(parcel2, readHeader, Feature.CREATOR);
                        i = i2;
                        connectionTelemetryConfiguration = connectionTelemetryConfiguration3;
                        break;
                    case 3:
                        i = SafeParcelReader.readInt(parcel2, readHeader);
                        featureArr = featureArr2;
                        connectionTelemetryConfiguration = connectionTelemetryConfiguration3;
                        break;
                    case 4:
                        connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) SafeParcelReader.createParcelable(parcel2, readHeader, ConnectionTelemetryConfiguration.CREATOR);
                        featureArr = featureArr2;
                        i = i2;
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        featureArr = featureArr2;
                        i = i2;
                        connectionTelemetryConfiguration = connectionTelemetryConfiguration3;
                        break;
                }
                featureArr2 = featureArr;
                i2 = i;
                connectionTelemetryConfiguration2 = connectionTelemetryConfiguration;
            } else {
                SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new zzi(bundle, featureArr2, i2, connectionTelemetryConfiguration3);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzi[i];
    }
}
