package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.C0083BeginSignInRequest;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.auth.api.identity.zzh */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C0098zzh implements Parcelable.Creator<C0083BeginSignInRequest.GoogleIdTokenRequestOptions> {
    public C0098zzh() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C0083BeginSignInRequest.GoogleIdTokenRequestOptions[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        boolean z = false;
        String str = null;
        String str2 = null;
        boolean z2 = false;
        String str3 = null;
        ArrayList<String> arrayList = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = C0461SafeParcelReader.readHeader(parcel3);
            int i = readHeader;
            switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    z = C0461SafeParcelReader.readBoolean(parcel3, i);
                    break;
                case 2:
                    str = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                case 3:
                    str2 = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                case 4:
                    z2 = C0461SafeParcelReader.readBoolean(parcel3, i);
                    break;
                case 5:
                    str3 = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                case 6:
                    arrayList = C0461SafeParcelReader.createStringList(parcel3, i);
                    break;
                default:
                    C0461SafeParcelReader.skipUnknownField(parcel3, i);
                    break;
            }
        }
        C0461SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new C0083BeginSignInRequest.GoogleIdTokenRequestOptions(z, str, str2, z2, str3, arrayList);
        return obj;
    }
}
