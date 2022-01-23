package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class zza implements Parcelable.Creator<ProxyRequest> {
    public zza() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ProxyRequest[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        int i = 0;
        String str = null;
        int i2 = 0;
        long j = 0;
        byte[] bArr = null;
        Bundle bundle = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel3);
            int i3 = readHeader;
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    str = SafeParcelReader.createString(parcel3, i3);
                    break;
                case 2:
                    i2 = SafeParcelReader.readInt(parcel3, i3);
                    break;
                case 3:
                    j = SafeParcelReader.readLong(parcel3, i3);
                    break;
                case 4:
                    bArr = SafeParcelReader.createByteArray(parcel3, i3);
                    break;
                case 5:
                    bundle = SafeParcelReader.createBundle(parcel3, i3);
                    break;
                case CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT:
                    i = SafeParcelReader.readInt(parcel3, i3);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel3, i3);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new ProxyRequest(i, str, i2, j, bArr, bundle);
        return obj;
    }
}
