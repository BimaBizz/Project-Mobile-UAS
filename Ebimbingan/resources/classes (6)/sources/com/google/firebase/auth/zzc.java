package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.firebase.client.utilities.Base64;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import org.shaded.apache.commons.logging.impl.SimpleLog;
import org.shaded.apache.http.protocol.HTTP;

public final class zzc implements Parcelable.Creator<ActionCodeSettings> {
    public zzc() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ActionCodeSettings[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z = false;
        String str5 = null;
        boolean z2 = false;
        String str6 = null;
        int i = 0;
        String str7 = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel3);
            int i2 = readHeader;
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    str = SafeParcelReader.createString(parcel3, i2);
                    break;
                case 2:
                    str2 = SafeParcelReader.createString(parcel3, i2);
                    break;
                case 3:
                    str3 = SafeParcelReader.createString(parcel3, i2);
                    break;
                case 4:
                    str4 = SafeParcelReader.createString(parcel3, i2);
                    break;
                case 5:
                    z = SafeParcelReader.readBoolean(parcel3, i2);
                    break;
                case SimpleLog.LOG_LEVEL_FATAL /*6*/:
                    str5 = SafeParcelReader.createString(parcel3, i2);
                    break;
                case SimpleLog.LOG_LEVEL_OFF /*7*/:
                    z2 = SafeParcelReader.readBoolean(parcel3, i2);
                    break;
                case Base64.DO_BREAK_LINES:
                    str6 = SafeParcelReader.createString(parcel3, i2);
                    break;
                case HTTP.HT /*9*/:
                    i = SafeParcelReader.readInt(parcel3, i2);
                    break;
                case HTTP.LF /*10*/:
                    str7 = SafeParcelReader.createString(parcel3, i2);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel3, i2);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new ActionCodeSettings(str, str2, str3, str4, z, str5, z2, str6, i, str7);
        return obj;
    }
}
