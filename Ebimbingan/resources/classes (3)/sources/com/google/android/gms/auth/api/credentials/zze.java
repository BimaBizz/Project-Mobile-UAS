package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zze implements Parcelable.Creator<CredentialPickerConfig> {
    public zze() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CredentialPickerConfig[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel3);
            int i3 = readHeader;
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    z = SafeParcelReader.readBoolean(parcel3, i3);
                    break;
                case 2:
                    z2 = SafeParcelReader.readBoolean(parcel3, i3);
                    break;
                case 3:
                    z3 = SafeParcelReader.readBoolean(parcel3, i3);
                    break;
                case 4:
                    i2 = SafeParcelReader.readInt(parcel3, i3);
                    break;
                case 1000:
                    i = SafeParcelReader.readInt(parcel3, i3);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel3, i3);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new CredentialPickerConfig(i, z, z2, z3, i2);
        return obj;
    }
}
