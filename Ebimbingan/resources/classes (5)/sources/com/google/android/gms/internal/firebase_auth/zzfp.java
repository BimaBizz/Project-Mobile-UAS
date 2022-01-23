package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.firebase.client.utilities.Base64;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import org.shaded.apache.commons.logging.impl.SimpleLog;
import org.shaded.apache.http.protocol.HTTP;
import org.shaded.apache.http.util.LangUtils;

public final class zzfp implements Parcelable.Creator<zzfm> {
    public zzfp() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzfm[i];
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
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        boolean z = false;
        boolean z2 = false;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        boolean z3 = false;
        String str13 = null;
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
                    str3 = SafeParcelReader.createString(parcel3, i);
                    break;
                case 5:
                    str4 = SafeParcelReader.createString(parcel3, i);
                    break;
                case SimpleLog.LOG_LEVEL_FATAL /*6*/:
                    str5 = SafeParcelReader.createString(parcel3, i);
                    break;
                case SimpleLog.LOG_LEVEL_OFF /*7*/:
                    str6 = SafeParcelReader.createString(parcel3, i);
                    break;
                case Base64.DO_BREAK_LINES:
                    str7 = SafeParcelReader.createString(parcel3, i);
                    break;
                case HTTP.HT /*9*/:
                    str8 = SafeParcelReader.createString(parcel3, i);
                    break;
                case HTTP.LF /*10*/:
                    z = SafeParcelReader.readBoolean(parcel3, i);
                    break;
                case 11:
                    z2 = SafeParcelReader.readBoolean(parcel3, i);
                    break;
                case 12:
                    str9 = SafeParcelReader.createString(parcel3, i);
                    break;
                case HTTP.CR /*13*/:
                    str10 = SafeParcelReader.createString(parcel3, i);
                    break;
                case 14:
                    str11 = SafeParcelReader.createString(parcel3, i);
                    break;
                case 15:
                    str12 = SafeParcelReader.createString(parcel3, i);
                    break;
                case 16:
                    z3 = SafeParcelReader.readBoolean(parcel3, i);
                    break;
                case LangUtils.HASH_SEED /*17*/:
                    str13 = SafeParcelReader.createString(parcel3, i);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel3, i);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new zzfm(str, str2, str3, str4, str5, str6, str7, str8, z, z2, str9, str10, str11, str12, z3, str13);
        return obj;
    }
}
