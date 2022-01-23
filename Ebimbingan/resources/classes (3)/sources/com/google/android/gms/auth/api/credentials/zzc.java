package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzc implements Parcelable.Creator<Credential> {
    public zzc() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Credential[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        String str = null;
        String str2 = null;
        Uri uri = null;
        ArrayList<IdToken> arrayList = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel3);
            int i = readHeader;
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    str = SafeParcelReader.createString(parcel3, i);
                    break;
                case 2:
                    str2 = SafeParcelReader.createString(parcel3, i);
                    break;
                case 3:
                    uri = (Uri) SafeParcelReader.createParcelable(parcel3, i, Uri.CREATOR);
                    break;
                case 4:
                    arrayList = SafeParcelReader.createTypedList(parcel3, i, IdToken.CREATOR);
                    break;
                case 5:
                    str3 = SafeParcelReader.createString(parcel3, i);
                    break;
                case 6:
                    str4 = SafeParcelReader.createString(parcel3, i);
                    break;
                case ConnectionResult.SERVICE_INVALID /*9*/:
                    str5 = SafeParcelReader.createString(parcel3, i);
                    break;
                case 10:
                    str6 = SafeParcelReader.createString(parcel3, i);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel3, i);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new Credential(str, str2, uri, arrayList, str3, str4, str5, str6);
        return obj;
    }
}
