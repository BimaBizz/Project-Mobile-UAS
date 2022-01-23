package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

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
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        zzm zzm = null;
        zze zze = null;
        com.google.firebase.auth.zzf zzf = null;
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel3);
            int i = readHeader;
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    zzm = (zzm) SafeParcelReader.createParcelable(parcel3, i, zzm.CREATOR);
                    break;
                case 2:
                    zze = (zze) SafeParcelReader.createParcelable(parcel3, i, zze.CREATOR);
                    break;
                case 3:
                    zzf = (com.google.firebase.auth.zzf) SafeParcelReader.createParcelable(parcel3, i, com.google.firebase.auth.zzf.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel3, i);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new zzg(zzm, zze, zzf);
        return obj;
    }
}
