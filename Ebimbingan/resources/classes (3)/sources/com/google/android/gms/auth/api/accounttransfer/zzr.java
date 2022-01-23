package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class zzr implements Parcelable.Creator<zzs> {
    public zzr() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzs[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Set set;
        Object obj;
        Throwable th;
        StringBuilder sb;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        new HashSet();
        Set set2 = set;
        int i = 0;
        zzt zzt = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel3);
            int i2 = readHeader;
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i = SafeParcelReader.readInt(parcel3, i2);
                    boolean add = set2.add(1);
                    break;
                case 2:
                    zzt = (zzt) SafeParcelReader.createParcelable(parcel3, i2, zzt.CREATOR);
                    boolean add2 = set2.add(2);
                    break;
                case 3:
                    str = SafeParcelReader.createString(parcel3, i2);
                    boolean add3 = set2.add(3);
                    break;
                case 4:
                    str2 = SafeParcelReader.createString(parcel3, i2);
                    boolean add4 = set2.add(4);
                    break;
                case 5:
                    str3 = SafeParcelReader.createString(parcel3, i2);
                    boolean add5 = set2.add(5);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel3, i2);
                    break;
            }
        }
        if (parcel3.dataPosition() != validateObjectHeader) {
            Throwable th2 = th;
            new StringBuilder(37);
            new SafeParcelReader.ParseException(sb.append("Overread allowed size end=").append(validateObjectHeader).toString(), parcel3);
            throw th2;
        }
        new zzs(set2, i, zzt, str, str2, str3);
        return obj;
    }
}
