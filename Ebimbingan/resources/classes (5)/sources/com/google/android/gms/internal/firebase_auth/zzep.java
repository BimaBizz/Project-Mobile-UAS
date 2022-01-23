package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.firebase.client.utilities.Base64;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.zzf;
import java.util.ArrayList;
import org.shaded.apache.commons.logging.impl.SimpleLog;
import org.shaded.apache.http.protocol.HTTP;

public final class zzep implements Parcelable.Creator<zzem> {
    public zzep() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzem[i];
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
        String str4 = null;
        zzey zzey = null;
        String str5 = null;
        String str6 = null;
        long j = 0;
        long j2 = 0;
        boolean z2 = false;
        zzf zzf = null;
        ArrayList arrayList = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel3);
            int i = readHeader;
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    str = SafeParcelReader.createString(parcel3, i);
                    break;
                case 3:
                    str2 = SafeParcelReader.createString(parcel3, i);
                    break;
                case 4:
                    z = SafeParcelReader.readBoolean(parcel3, i);
                    break;
                case 5:
                    str3 = SafeParcelReader.createString(parcel3, i);
                    break;
                case SimpleLog.LOG_LEVEL_FATAL /*6*/:
                    str4 = SafeParcelReader.createString(parcel3, i);
                    break;
                case SimpleLog.LOG_LEVEL_OFF /*7*/:
                    zzey = (zzey) SafeParcelReader.createParcelable(parcel3, i, zzey.CREATOR);
                    break;
                case Base64.DO_BREAK_LINES:
                    str5 = SafeParcelReader.createString(parcel3, i);
                    break;
                case HTTP.HT /*9*/:
                    str6 = SafeParcelReader.createString(parcel3, i);
                    break;
                case HTTP.LF /*10*/:
                    j = SafeParcelReader.readLong(parcel3, i);
                    break;
                case 11:
                    j2 = SafeParcelReader.readLong(parcel3, i);
                    break;
                case 12:
                    z2 = SafeParcelReader.readBoolean(parcel3, i);
                    break;
                case HTTP.CR /*13*/:
                    zzf = (zzf) SafeParcelReader.createParcelable(parcel3, i, zzf.CREATOR);
                    break;
                case 14:
                    arrayList = SafeParcelReader.createTypedList(parcel3, i, zzeu.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel3, i);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new zzem(str, str2, z, str3, str4, zzey, str5, str6, j, j2, z2, zzf, arrayList);
        return obj;
    }
}
