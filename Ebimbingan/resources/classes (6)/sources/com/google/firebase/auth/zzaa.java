package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import org.shaded.apache.commons.logging.impl.SimpleLog;

public final class zzaa implements Parcelable.Creator<PhoneAuthCredential> {
    public zzaa() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PhoneAuthCredential[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        String str = null;
        String str2 = null;
        boolean z = false;
        String str3 = null;
        boolean z2 = false;
        String str4 = null;
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
                    z = SafeParcelReader.readBoolean(parcel3, i);
                    break;
                case 4:
                    str3 = SafeParcelReader.createString(parcel3, i);
                    break;
                case 5:
                    z2 = SafeParcelReader.readBoolean(parcel3, i);
                    break;
                case SimpleLog.LOG_LEVEL_FATAL /*6*/:
                    str4 = SafeParcelReader.createString(parcel3, i);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel3, i);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new PhoneAuthCredential(str, str2, z, str3, z2, str4);
        return obj;
    }
}
