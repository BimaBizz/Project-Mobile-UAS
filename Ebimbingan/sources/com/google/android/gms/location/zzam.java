package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;
import java.util.ArrayList;

public final class zzam implements Parcelable.Creator<zzal> {
    public zzam() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        Parcel parcel2 = parcel;
        Parcel parcel3 = parcel2;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        ArrayList<String> arrayList = null;
        PendingIntent pendingIntent = null;
        String str = "";
        while (parcel3.dataPosition() < validateObjectHeader) {
            int readHeader = C0461SafeParcelReader.readHeader(parcel3);
            int i = readHeader;
            switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    arrayList = C0461SafeParcelReader.createStringList(parcel3, i);
                    break;
                case 2:
                    pendingIntent = (PendingIntent) C0461SafeParcelReader.createParcelable(parcel3, i, PendingIntent.CREATOR);
                    break;
                case 3:
                    str = C0461SafeParcelReader.createString(parcel3, i);
                    break;
                default:
                    C0461SafeParcelReader.skipUnknownField(parcel3, i);
                    break;
            }
        }
        C0461SafeParcelReader.ensureAtEnd(parcel3, validateObjectHeader);
        new zzal(arrayList, pendingIntent, str);
        return obj;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzal[i];
    }
}
