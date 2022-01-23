package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class zzn implements Parcelable.Creator<zzl> {
    public zzn() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzl[i];
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
        ArrayList<zzs> arrayList = null;
        int i2 = 0;
        zzp zzp = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel3);
            int i3 = readHeader;
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i = SafeParcelReader.readInt(parcel3, i3);
                    boolean add = set2.add(1);
                    break;
                case 2:
                    arrayList = SafeParcelReader.createTypedList(parcel3, i3, zzs.CREATOR);
                    boolean add2 = set2.add(2);
                    break;
                case 3:
                    i2 = SafeParcelReader.readInt(parcel3, i3);
                    boolean add3 = set2.add(3);
                    break;
                case 4:
                    zzp = (zzp) SafeParcelReader.createParcelable(parcel3, i3, zzp.CREATOR);
                    boolean add4 = set2.add(4);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel3, i3);
                    break;
            }
        }
        if (parcel3.dataPosition() != validateObjectHeader) {
            Throwable th2 = th;
            new StringBuilder(37);
            new SafeParcelReader.ParseException(sb.append("Overread allowed size end=").append(validateObjectHeader).toString(), parcel3);
            throw th2;
        }
        new zzl(set2, i, arrayList, i2, zzp);
        return obj;
    }
}
