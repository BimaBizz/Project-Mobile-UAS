package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

/* renamed from: com.google.android.gms.auth.api.signin.internal.zaa */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0136zaa implements Parcelable.Creator<C0131GoogleSignInOptionsExtensionParcelable> {
    public C0136zaa() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        int i;
        Bundle bundle;
        Parcel parcel2 = parcel;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        int i2 = 0;
        int i3 = 0;
        Bundle bundle2 = null;
        while (true) {
            Bundle bundle3 = bundle2;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = C0461SafeParcelReader.readHeader(parcel2);
                switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        i2 = C0461SafeParcelReader.readInt(parcel2, readHeader);
                        i = i3;
                        bundle = bundle3;
                        break;
                    case 2:
                        i = C0461SafeParcelReader.readInt(parcel2, readHeader);
                        bundle = bundle3;
                        break;
                    case 3:
                        bundle = C0461SafeParcelReader.createBundle(parcel2, readHeader);
                        i = i3;
                        break;
                    default:
                        C0461SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        i = i3;
                        bundle = bundle3;
                        break;
                }
                i3 = i;
                bundle2 = bundle;
            } else {
                C0461SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new C0131GoogleSignInOptionsExtensionParcelable(i2, i3, bundle3);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C0131GoogleSignInOptionsExtensionParcelable[i];
    }
}
