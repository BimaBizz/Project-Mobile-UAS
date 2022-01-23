package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zaa implements Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> {
    public zaa() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        int i;
        Bundle bundle;
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        int i2 = 0;
        int i3 = 0;
        Bundle bundle2 = null;
        while (true) {
            Bundle bundle3 = bundle2;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = SafeParcelReader.readHeader(parcel2);
                switch (SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        i2 = SafeParcelReader.readInt(parcel2, readHeader);
                        i = i3;
                        bundle = bundle3;
                        break;
                    case 2:
                        i = SafeParcelReader.readInt(parcel2, readHeader);
                        bundle = bundle3;
                        break;
                    case 3:
                        bundle = SafeParcelReader.createBundle(parcel2, readHeader);
                        i = i3;
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        i = i3;
                        bundle = bundle3;
                        break;
                }
                i3 = i;
                bundle2 = bundle;
            } else {
                SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new GoogleSignInOptionsExtensionParcelable(i2, i3, bundle3);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInOptionsExtensionParcelable[i];
    }
}
