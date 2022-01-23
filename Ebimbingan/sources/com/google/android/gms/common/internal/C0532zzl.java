package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C0186Feature;
import com.google.android.gms.common.api.C0235Scope;
import com.google.android.gms.common.internal.safeparcel.C0461SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.C0462SafeParcelWriter;

/* renamed from: com.google.android.gms.common.internal.zzl */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0532zzl implements Parcelable.Creator<C0432GetServiceRequest> {
    public C0532zzl() {
    }

    static void zza(C0432GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        C0432GetServiceRequest getServiceRequest2 = getServiceRequest;
        Parcel parcel2 = parcel;
        int i2 = i;
        int beginObjectHeader = C0462SafeParcelWriter.beginObjectHeader(parcel2);
        C0462SafeParcelWriter.writeInt(parcel2, 1, getServiceRequest2.zza);
        C0462SafeParcelWriter.writeInt(parcel2, 2, getServiceRequest2.zzb);
        C0462SafeParcelWriter.writeInt(parcel2, 3, getServiceRequest2.zzc);
        C0462SafeParcelWriter.writeString(parcel2, 4, getServiceRequest2.zzd, false);
        C0462SafeParcelWriter.writeIBinder(parcel2, 5, getServiceRequest2.zze, false);
        C0462SafeParcelWriter.writeTypedArray(parcel2, 6, getServiceRequest2.zzf, i2, false);
        C0462SafeParcelWriter.writeBundle(parcel2, 7, getServiceRequest2.zzg, false);
        C0462SafeParcelWriter.writeParcelable(parcel2, 8, getServiceRequest2.zzh, i2, false);
        C0462SafeParcelWriter.writeTypedArray(parcel2, 10, getServiceRequest2.zzi, i2, false);
        C0462SafeParcelWriter.writeTypedArray(parcel2, 11, getServiceRequest2.zzj, i2, false);
        C0462SafeParcelWriter.writeBoolean(parcel2, 12, getServiceRequest2.zzk);
        C0462SafeParcelWriter.writeInt(parcel2, 13, getServiceRequest2.zzl);
        C0462SafeParcelWriter.writeBoolean(parcel2, 14, getServiceRequest2.zzm);
        C0462SafeParcelWriter.writeString(parcel2, 15, getServiceRequest2.zza(), false);
        C0462SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        int i;
        int i2;
        String str;
        IBinder iBinder;
        C0235Scope[] scopeArr;
        Bundle bundle;
        Account account;
        C0186Feature[] featureArr;
        C0186Feature[] featureArr2;
        boolean z;
        int i3;
        boolean z2;
        String str2;
        Parcel parcel2 = parcel;
        int validateObjectHeader = C0461SafeParcelReader.validateObjectHeader(parcel2);
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        String str3 = null;
        IBinder iBinder2 = null;
        C0235Scope[] scopeArr2 = null;
        Bundle bundle2 = null;
        Account account2 = null;
        C0186Feature[] featureArr3 = null;
        C0186Feature[] featureArr4 = null;
        boolean z3 = false;
        int i7 = 0;
        boolean z4 = false;
        String str4 = null;
        while (true) {
            String str5 = str4;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = C0461SafeParcelReader.readHeader(parcel2);
                switch (C0461SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        i4 = C0461SafeParcelReader.readInt(parcel2, readHeader);
                        i = i5;
                        i2 = i6;
                        str = str3;
                        iBinder = iBinder2;
                        scopeArr = scopeArr2;
                        bundle = bundle2;
                        account = account2;
                        featureArr = featureArr3;
                        featureArr2 = featureArr4;
                        z = z3;
                        i3 = i7;
                        z2 = z4;
                        str2 = str5;
                        break;
                    case 2:
                        i = C0461SafeParcelReader.readInt(parcel2, readHeader);
                        i2 = i6;
                        str = str3;
                        iBinder = iBinder2;
                        scopeArr = scopeArr2;
                        bundle = bundle2;
                        account = account2;
                        featureArr = featureArr3;
                        featureArr2 = featureArr4;
                        z = z3;
                        i3 = i7;
                        z2 = z4;
                        str2 = str5;
                        break;
                    case 3:
                        i2 = C0461SafeParcelReader.readInt(parcel2, readHeader);
                        i = i5;
                        str = str3;
                        iBinder = iBinder2;
                        scopeArr = scopeArr2;
                        bundle = bundle2;
                        account = account2;
                        featureArr = featureArr3;
                        featureArr2 = featureArr4;
                        z = z3;
                        i3 = i7;
                        z2 = z4;
                        str2 = str5;
                        break;
                    case 4:
                        str = C0461SafeParcelReader.createString(parcel2, readHeader);
                        i = i5;
                        i2 = i6;
                        iBinder = iBinder2;
                        scopeArr = scopeArr2;
                        bundle = bundle2;
                        account = account2;
                        featureArr = featureArr3;
                        featureArr2 = featureArr4;
                        z = z3;
                        i3 = i7;
                        z2 = z4;
                        str2 = str5;
                        break;
                    case 5:
                        iBinder = C0461SafeParcelReader.readIBinder(parcel2, readHeader);
                        i = i5;
                        i2 = i6;
                        str = str3;
                        scopeArr = scopeArr2;
                        bundle = bundle2;
                        account = account2;
                        featureArr = featureArr3;
                        featureArr2 = featureArr4;
                        z = z3;
                        i3 = i7;
                        z2 = z4;
                        str2 = str5;
                        break;
                    case 6:
                        scopeArr = (C0235Scope[]) C0461SafeParcelReader.createTypedArray(parcel2, readHeader, C0235Scope.CREATOR);
                        i = i5;
                        i2 = i6;
                        str = str3;
                        iBinder = iBinder2;
                        bundle = bundle2;
                        account = account2;
                        featureArr = featureArr3;
                        featureArr2 = featureArr4;
                        z = z3;
                        i3 = i7;
                        z2 = z4;
                        str2 = str5;
                        break;
                    case 7:
                        bundle = C0461SafeParcelReader.createBundle(parcel2, readHeader);
                        i = i5;
                        i2 = i6;
                        str = str3;
                        iBinder = iBinder2;
                        scopeArr = scopeArr2;
                        account = account2;
                        featureArr = featureArr3;
                        featureArr2 = featureArr4;
                        z = z3;
                        i3 = i7;
                        z2 = z4;
                        str2 = str5;
                        break;
                    case 8:
                        account = (Account) C0461SafeParcelReader.createParcelable(parcel2, readHeader, Account.CREATOR);
                        i = i5;
                        i2 = i6;
                        str = str3;
                        iBinder = iBinder2;
                        scopeArr = scopeArr2;
                        bundle = bundle2;
                        featureArr = featureArr3;
                        featureArr2 = featureArr4;
                        z = z3;
                        i3 = i7;
                        z2 = z4;
                        str2 = str5;
                        break;
                    case 10:
                        featureArr = (C0186Feature[]) C0461SafeParcelReader.createTypedArray(parcel2, readHeader, C0186Feature.CREATOR);
                        i = i5;
                        i2 = i6;
                        str = str3;
                        iBinder = iBinder2;
                        scopeArr = scopeArr2;
                        bundle = bundle2;
                        account = account2;
                        featureArr2 = featureArr4;
                        z = z3;
                        i3 = i7;
                        z2 = z4;
                        str2 = str5;
                        break;
                    case 11:
                        featureArr2 = (C0186Feature[]) C0461SafeParcelReader.createTypedArray(parcel2, readHeader, C0186Feature.CREATOR);
                        i = i5;
                        i2 = i6;
                        str = str3;
                        iBinder = iBinder2;
                        scopeArr = scopeArr2;
                        bundle = bundle2;
                        account = account2;
                        featureArr = featureArr3;
                        z = z3;
                        i3 = i7;
                        z2 = z4;
                        str2 = str5;
                        break;
                    case 12:
                        z = C0461SafeParcelReader.readBoolean(parcel2, readHeader);
                        i = i5;
                        i2 = i6;
                        str = str3;
                        iBinder = iBinder2;
                        scopeArr = scopeArr2;
                        bundle = bundle2;
                        account = account2;
                        featureArr = featureArr3;
                        featureArr2 = featureArr4;
                        i3 = i7;
                        z2 = z4;
                        str2 = str5;
                        break;
                    case 13:
                        i3 = C0461SafeParcelReader.readInt(parcel2, readHeader);
                        i = i5;
                        i2 = i6;
                        str = str3;
                        iBinder = iBinder2;
                        scopeArr = scopeArr2;
                        bundle = bundle2;
                        account = account2;
                        featureArr = featureArr3;
                        featureArr2 = featureArr4;
                        z = z3;
                        z2 = z4;
                        str2 = str5;
                        break;
                    case 14:
                        z2 = C0461SafeParcelReader.readBoolean(parcel2, readHeader);
                        i = i5;
                        i2 = i6;
                        str = str3;
                        iBinder = iBinder2;
                        scopeArr = scopeArr2;
                        bundle = bundle2;
                        account = account2;
                        featureArr = featureArr3;
                        featureArr2 = featureArr4;
                        z = z3;
                        i3 = i7;
                        str2 = str5;
                        break;
                    case 15:
                        str2 = C0461SafeParcelReader.createString(parcel2, readHeader);
                        i = i5;
                        i2 = i6;
                        str = str3;
                        iBinder = iBinder2;
                        scopeArr = scopeArr2;
                        bundle = bundle2;
                        account = account2;
                        featureArr = featureArr3;
                        featureArr2 = featureArr4;
                        z = z3;
                        i3 = i7;
                        z2 = z4;
                        break;
                    default:
                        C0461SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        i = i5;
                        i2 = i6;
                        str = str3;
                        iBinder = iBinder2;
                        scopeArr = scopeArr2;
                        bundle = bundle2;
                        account = account2;
                        featureArr = featureArr3;
                        featureArr2 = featureArr4;
                        z = z3;
                        i3 = i7;
                        z2 = z4;
                        str2 = str5;
                        break;
                }
                i5 = i;
                i6 = i2;
                str3 = str;
                iBinder2 = iBinder;
                scopeArr2 = scopeArr;
                bundle2 = bundle;
                account2 = account;
                featureArr3 = featureArr;
                featureArr4 = featureArr2;
                z3 = z;
                i7 = i3;
                z4 = z2;
                str4 = str2;
            } else {
                C0461SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new C0432GetServiceRequest(i4, i5, i6, str3, iBinder2, scopeArr2, bundle2, account2, featureArr3, featureArr4, z3, i7, z4, str5);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C0432GetServiceRequest[i];
    }
}
