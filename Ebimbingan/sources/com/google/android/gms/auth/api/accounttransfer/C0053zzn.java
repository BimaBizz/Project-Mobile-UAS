package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.zzn */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class C0053zzn implements Parcelable.Creator<C0051zzl> {
    public C0053zzn() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C0051zzl[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Set set;
        Object obj;
        Throwable th;
        StringBuilder sb;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        new HashSet();
        Set set2 = set;
        int i = 0;
        ArrayList<C0058zzs> arrayList = null;
        int i2 = 0;
        C0055zzp zzp = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = C0461SafeParcelReader.readHeader(parcel3);
            int i3 = readHeader;
            switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i = C0461SafeParcelReader.readInt(parcel3, i3);
                    boolean add = set2.add(1);
                    break;
                case 2:
                    arrayList = C0461SafeParcelReader.createTypedList(parcel3, i3, C0058zzs.CREATOR);
                    boolean add2 = set2.add(2);
                    break;
                case 3:
                    i2 = C0461SafeParcelReader.readInt(parcel3, i3);
                    boolean add3 = set2.add(3);
                    break;
                case 4:
                    zzp = (C0055zzp) C0461SafeParcelReader.createParcelable(parcel3, i3, C0055zzp.CREATOR);
                    boolean add4 = set2.add(4);
                    break;
                default:
                    C0461SafeParcelReader.skipUnknownField(parcel3, i3);
                    break;
            }
        }
        if (parcel3.dataPosition() != validateObjectHeader) {
            Throwable th2 = th;
            new StringBuilder(37);
            new C0461SafeParcelReader.ParseException(sb.append("Overread allowed size end=").append(validateObjectHeader).toString(), parcel3);
            throw th2;
        }
        new C0051zzl(set2, i, arrayList, i2, zzp);
        return obj;
    }
}
