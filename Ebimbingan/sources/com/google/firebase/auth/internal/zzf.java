package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

public final class zzf implements Parcelable.Creator<zzg> {
    public zzf() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzg[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        zzm zzm = null;
        zze zze = null;
        com.google.firebase.auth.zzf zzf = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = C0461SafeParcelReader.readHeader(parcel3);
            int i = readHeader;
            switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    zzm = (zzm) C0461SafeParcelReader.createParcelable(parcel3, i, zzm.CREATOR);
                    break;
                case 2:
                    zze = (zze) C0461SafeParcelReader.createParcelable(parcel3, i, zze.CREATOR);
                    break;
                case 3:
                    zzf = (com.google.firebase.auth.zzf) C0461SafeParcelReader.createParcelable(parcel3, i, com.google.firebase.auth.zzf.CREATOR);
                    break;
                default:
                    C0461SafeParcelReader.skipUnknownField(parcel3, i);
                    break;
            }
        }
        C0461SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new zzg(zzm, zze, zzf);
        return obj;
    }
}
