package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

/* renamed from: com.google.android.gms.auth.api.credentials.zze */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C0076zze implements Parcelable.Creator<C0063CredentialPickerConfig> {
    public C0076zze() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C0063CredentialPickerConfig[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = C0461SafeParcelReader.readHeader(parcel3);
            int i3 = readHeader;
            switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    z = C0461SafeParcelReader.readBoolean(parcel3, i3);
                    break;
                case 2:
                    z2 = C0461SafeParcelReader.readBoolean(parcel3, i3);
                    break;
                case 3:
                    z3 = C0461SafeParcelReader.readBoolean(parcel3, i3);
                    break;
                case 4:
                    i2 = C0461SafeParcelReader.readInt(parcel3, i3);
                    break;
                case 1000:
                    i = C0461SafeParcelReader.readInt(parcel3, i3);
                    break;
                default:
                    C0461SafeParcelReader.skipUnknownField(parcel3, i3);
                    break;
            }
        }
        C0461SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new C0063CredentialPickerConfig(i, z, z2, z3, i2);
        return obj;
    }
}
