package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import org.shaded.apache.commons.logging.impl.SimpleLog;

public final class zzef implements Parcelable.Creator<zzec> {
    public zzef() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzec[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        String str = null;
        boolean z = false;
        String str2 = null;
        boolean z2 = false;
        zzfk zzfk = null;
        ArrayList arrayList = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel3);
            int i = readHeader;
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    str = SafeParcelReader.createString(parcel3, i);
                    break;
                case 3:
                    z = SafeParcelReader.readBoolean(parcel3, i);
                    break;
                case 4:
                    str2 = SafeParcelReader.createString(parcel3, i);
                    break;
                case 5:
                    z2 = SafeParcelReader.readBoolean(parcel3, i);
                    break;
                case SimpleLog.LOG_LEVEL_FATAL /*6*/:
                    zzfk = (zzfk) SafeParcelReader.createParcelable(parcel3, i, zzfk.CREATOR);
                    break;
                case SimpleLog.LOG_LEVEL_OFF /*7*/:
                    arrayList = SafeParcelReader.createStringList(parcel3, i);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel3, i);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new zzec(str, z, str2, z2, zzfk, arrayList);
        return obj;
    }
}
