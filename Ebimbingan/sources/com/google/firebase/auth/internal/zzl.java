package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;
import com.google.android.gms.internal.firebase_auth.zzes;
import com.google.firebase.auth.zzf;
import java.util.ArrayList;

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
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        zzes zzes = null;
        zzi zzi = null;
        String str = null;
        String str2 = null;
        ArrayList<zzi> arrayList = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        Boolean bool = null;
        zzo zzo = null;
        boolean z = false;
        zzf zzf = null;
        zzao zzao = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = C0461SafeParcelReader.readHeader(parcel3);
            int i = readHeader;
            switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    zzes = (zzes) C0461SafeParcelReader.createParcelable(parcel3, i, zzes.CREATOR);
                    break;
                case 2:
                    zzi = (zzi) C0461SafeParcelReader.createParcelable(parcel3, i, zzi.CREATOR);
                    break;
                case 3:
                    str = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                case 4:
                    str2 = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                case 5:
                    arrayList = C0461SafeParcelReader.createTypedList(parcel3, i, zzi.CREATOR);
                    break;
                case 6:
                    arrayList2 = C0461SafeParcelReader.createStringList(parcel3, i);
                    break;
                case 7:
                    str3 = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                case 8:
                    bool = C0461SafeParcelReader.readBooleanObject(parcel3, i);
                    break;
                case 9:
                    zzo = (zzo) C0461SafeParcelReader.createParcelable(parcel3, i, zzo.CREATOR);
                    break;
                case 10:
                    z = C0461SafeParcelReader.readBoolean(parcel3, i);
                    break;
                case 11:
                    zzf = (zzf) C0461SafeParcelReader.createParcelable(parcel3, i, zzf.CREATOR);
                    break;
                case 12:
                    zzao = (zzao) C0461SafeParcelReader.createParcelable(parcel3, i, zzao.CREATOR);
                    break;
                default:
                    C0461SafeParcelReader.skipUnknownField(parcel3, i);
                    break;
            }
        }
        C0461SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new zzm(zzes, zzi, str, str2, arrayList, arrayList2, str3, bool, zzo, z, zzf, zzao);
        return obj;
    }
}
