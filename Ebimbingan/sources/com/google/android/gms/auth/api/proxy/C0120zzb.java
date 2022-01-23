package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

/* renamed from: com.google.android.gms.auth.api.proxy.zzb */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class C0120zzb implements Parcelable.Creator<C0118ProxyResponse> {
    public C0120zzb() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C0118ProxyResponse[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        int i = 0;
        int i2 = 0;
        PendingIntent pendingIntent = null;
        int i3 = 0;
        Bundle bundle = null;
        byte[] bArr = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = C0461SafeParcelReader.readHeader(parcel3);
            int i4 = readHeader;
            switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i2 = C0461SafeParcelReader.readInt(parcel3, i4);
                    break;
                case 2:
                    pendingIntent = (PendingIntent) C0461SafeParcelReader.createParcelable(parcel3, i4, PendingIntent.CREATOR);
                    break;
                case 3:
                    i3 = C0461SafeParcelReader.readInt(parcel3, i4);
                    break;
                case 4:
                    bundle = C0461SafeParcelReader.createBundle(parcel3, i4);
                    break;
                case 5:
                    bArr = C0461SafeParcelReader.createByteArray(parcel3, i4);
                    break;
                case 1000:
                    i = C0461SafeParcelReader.readInt(parcel3, i4);
                    break;
                default:
                    C0461SafeParcelReader.skipUnknownField(parcel3, i4);
                    break;
            }
        }
        C0461SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new C0118ProxyResponse(i, i2, pendingIntent, i3, bundle, bArr);
        return obj;
    }
}
