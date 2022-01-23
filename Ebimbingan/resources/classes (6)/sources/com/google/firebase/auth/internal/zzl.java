package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.firebase.client.utilities.Base64;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.firebase_auth.zzes;
import com.google.firebase.auth.zzf;
import java.util.ArrayList;
import org.shaded.apache.commons.logging.impl.SimpleLog;
import org.shaded.apache.http.protocol.HTTP;

public final class zzl implements Parcelable.Creator<zzm> {
    public zzl() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzm[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        zzes zzes = null;
        zzi zzi = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        Boolean bool = null;
        zzo zzo = null;
        boolean z = false;
        zzf zzf = null;
        zzao zzao = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel3);
            int i = readHeader;
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    zzes = (zzes) SafeParcelReader.createParcelable(parcel3, i, zzes.CREATOR);
                    break;
                case 2:
                    zzi = (zzi) SafeParcelReader.createParcelable(parcel3, i, zzi.CREATOR);
                    break;
                case 3:
                    str = SafeParcelReader.createString(parcel3, i);
                    break;
                case 4:
                    str2 = SafeParcelReader.createString(parcel3, i);
                    break;
                case 5:
                    arrayList = SafeParcelReader.createTypedList(parcel3, i, zzi.CREATOR);
                    break;
                case SimpleLog.LOG_LEVEL_FATAL /*6*/:
                    arrayList2 = SafeParcelReader.createStringList(parcel3, i);
                    break;
                case SimpleLog.LOG_LEVEL_OFF /*7*/:
                    str3 = SafeParcelReader.createString(parcel3, i);
                    break;
                case Base64.DO_BREAK_LINES:
                    bool = SafeParcelReader.readBooleanObject(parcel3, i);
                    break;
                case HTTP.HT /*9*/:
                    zzo = (zzo) SafeParcelReader.createParcelable(parcel3, i, zzo.CREATOR);
                    break;
                case HTTP.LF /*10*/:
                    z = SafeParcelReader.readBoolean(parcel3, i);
                    break;
                case 11:
                    zzf = (zzf) SafeParcelReader.createParcelable(parcel3, i, zzf.CREATOR);
                    break;
                case 12:
                    zzao = (zzao) SafeParcelReader.createParcelable(parcel3, i, zzao.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel3, i);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new zzm(zzes, zzi, str, str2, arrayList, arrayList2, str3, bool, zzo, z, zzf, zzao);
        return obj;
    }
}
