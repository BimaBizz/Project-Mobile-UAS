package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.zzac;
import org.shaded.apache.commons.logging.impl.SimpleLog;

public final class zzdm implements Parcelable.Creator<zzdn> {
    public zzdm() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzdn[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        zzac zzac = null;
        String str = null;
        String str2 = null;
        long j = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel3);
            int i = readHeader;
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    zzac = (zzac) SafeParcelReader.createParcelable(parcel3, i, zzac.CREATOR);
                    break;
                case 2:
                    str = SafeParcelReader.createString(parcel3, i);
                    break;
                case 3:
                    str2 = SafeParcelReader.createString(parcel3, i);
                    break;
                case 4:
                    j = SafeParcelReader.readLong(parcel3, i);
                    break;
                case 5:
                    z = SafeParcelReader.readBoolean(parcel3, i);
                    break;
                case SimpleLog.LOG_LEVEL_FATAL /*6*/:
                    z2 = SafeParcelReader.readBoolean(parcel3, i);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel3, i);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new zzdn(zzac, str, str2, j, z, z2);
        return obj;
    }
}
