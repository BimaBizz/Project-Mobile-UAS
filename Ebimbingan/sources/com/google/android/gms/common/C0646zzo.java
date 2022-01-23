package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;

/* renamed from: com.google.android.gms.common.zzo */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0646zzo implements Parcelable.Creator<C0645zzn> {
    public C0646zzo() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        boolean z;
        boolean z2;
        IBinder iBinder;
        boolean z3;
        Parcel parcel2 = parcel;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        String str = null;
        boolean z4 = false;
        boolean z5 = false;
        IBinder iBinder2 = null;
        boolean z6 = false;
        while (true) {
            boolean z7 = z6;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = C0461SafeParcelReader.readHeader(parcel2);
                switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        str = C0461SafeParcelReader.createString(parcel2, readHeader);
                        z = z4;
                        z2 = z5;
                        iBinder = iBinder2;
                        z3 = z7;
                        break;
                    case 2:
                        z = C0461SafeParcelReader.readBoolean(parcel2, readHeader);
                        z2 = z5;
                        iBinder = iBinder2;
                        z3 = z7;
                        break;
                    case 3:
                        z2 = C0461SafeParcelReader.readBoolean(parcel2, readHeader);
                        z = z4;
                        iBinder = iBinder2;
                        z3 = z7;
                        break;
                    case 4:
                        iBinder = C0461SafeParcelReader.readIBinder(parcel2, readHeader);
                        z = z4;
                        z2 = z5;
                        z3 = z7;
                        break;
                    case 5:
                        z3 = C0461SafeParcelReader.readBoolean(parcel2, readHeader);
                        z = z4;
                        z2 = z5;
                        iBinder = iBinder2;
                        break;
                    default:
                        C0461SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        z = z4;
                        z2 = z5;
                        iBinder = iBinder2;
                        z3 = z7;
                        break;
                }
                z4 = z;
                z5 = z2;
                iBinder2 = iBinder;
                z6 = z3;
            } else {
                C0461SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new C0645zzn(str, z4, z5, iBinder2, z7);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C0645zzn[i];
    }
}
