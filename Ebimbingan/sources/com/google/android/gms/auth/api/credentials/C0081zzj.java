package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

/* renamed from: com.google.android.gms.auth.api.credentials.zzj */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C0081zzj implements Parcelable.Creator<C0071HintRequest> {
    public C0081zzj() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C0071HintRequest[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        int i = 0;
        C0063CredentialPickerConfig credentialPickerConfig = null;
        boolean z = false;
        boolean z2 = false;
        String[] strArr = null;
        boolean z3 = false;
        String str = null;
        String str2 = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = C0461SafeParcelReader.readHeader(parcel3);
            int i2 = readHeader;
            switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    credentialPickerConfig = (C0063CredentialPickerConfig) C0461SafeParcelReader.createParcelable(parcel3, i2, C0063CredentialPickerConfig.CREATOR);
                    break;
                case 2:
                    z = C0461SafeParcelReader.readBoolean(parcel3, i2);
                    break;
                case 3:
                    z2 = C0461SafeParcelReader.readBoolean(parcel3, i2);
                    break;
                case 4:
                    strArr = C0461SafeParcelReader.createStringArray(parcel3, i2);
                    break;
                case 5:
                    z3 = C0461SafeParcelReader.readBoolean(parcel3, i2);
                    break;
                case 6:
                    str = C0461SafeParcelReader.createString(parcel3, i2);
                    break;
                case 7:
                    str2 = C0461SafeParcelReader.createString(parcel3, i2);
                    break;
                case 1000:
                    i = C0461SafeParcelReader.readInt(parcel3, i2);
                    break;
                default:
                    C0461SafeParcelReader.skipUnknownField(parcel3, i2);
                    break;
            }
        }
        C0461SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new C0071HintRequest(i, credentialPickerConfig, z, z2, strArr, z3, str, str2);
        return obj;
    }
}
