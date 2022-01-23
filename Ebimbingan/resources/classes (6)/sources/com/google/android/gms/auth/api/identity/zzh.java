package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzh implements Parcelable.Creator<BeginSignInRequest.GoogleIdTokenRequestOptions> {
    public zzh() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new BeginSignInRequest.GoogleIdTokenRequestOptions[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        boolean z = false;
        String str = null;
        String str2 = null;
        boolean z2 = false;
        String str3 = null;
        ArrayList<String> arrayList = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel3);
            int i = readHeader;
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    z = SafeParcelReader.readBoolean(parcel3, i);
                    break;
                case 2:
                    str = SafeParcelReader.createString(parcel3, i);
                    break;
                case 3:
                    str2 = SafeParcelReader.createString(parcel3, i);
                    break;
                case 4:
                    z2 = SafeParcelReader.readBoolean(parcel3, i);
                    break;
                case 5:
                    str3 = SafeParcelReader.createString(parcel3, i);
                    break;
                case 6:
                    arrayList = SafeParcelReader.createStringList(parcel3, i);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel3, i);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new BeginSignInRequest.GoogleIdTokenRequestOptions(z, str, str2, z2, str3, arrayList);
        return obj;
    }
}
