package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzj implements Parcelable.Creator<HintRequest> {
    public zzj() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new HintRequest[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        int i = 0;
        CredentialPickerConfig credentialPickerConfig = null;
        boolean z = false;
        boolean z2 = false;
        String[] strArr = null;
        boolean z3 = false;
        String str = null;
        String str2 = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel3);
            int i2 = readHeader;
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    credentialPickerConfig = (CredentialPickerConfig) SafeParcelReader.createParcelable(parcel3, i2, CredentialPickerConfig.CREATOR);
                    break;
                case 2:
                    z = SafeParcelReader.readBoolean(parcel3, i2);
                    break;
                case 3:
                    z2 = SafeParcelReader.readBoolean(parcel3, i2);
                    break;
                case 4:
                    strArr = SafeParcelReader.createStringArray(parcel3, i2);
                    break;
                case 5:
                    z3 = SafeParcelReader.readBoolean(parcel3, i2);
                    break;
                case 6:
                    str = SafeParcelReader.createString(parcel3, i2);
                    break;
                case 7:
                    str2 = SafeParcelReader.createString(parcel3, i2);
                    break;
                case CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT:
                    i = SafeParcelReader.readInt(parcel3, i2);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel3, i2);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new HintRequest(i, credentialPickerConfig, z, z2, strArr, z3, str, str2);
        return obj;
    }
}
