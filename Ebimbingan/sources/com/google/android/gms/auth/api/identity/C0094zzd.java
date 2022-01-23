package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

/* renamed from: com.google.android.gms.auth.api.identity.zzd */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C0094zzd implements Parcelable.Creator<C0084BeginSignInResult> {
    public C0094zzd() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C0084BeginSignInResult[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        PendingIntent pendingIntent = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = C0461SafeParcelReader.readHeader(parcel3);
            int i = readHeader;
            switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    pendingIntent = (PendingIntent) C0461SafeParcelReader.createParcelable(parcel3, i, PendingIntent.CREATOR);
                    break;
                default:
                    C0461SafeParcelReader.skipUnknownField(parcel3, i);
                    break;
            }
        }
        C0461SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new C0084BeginSignInResult(pendingIntent);
        return obj;
    }
}
