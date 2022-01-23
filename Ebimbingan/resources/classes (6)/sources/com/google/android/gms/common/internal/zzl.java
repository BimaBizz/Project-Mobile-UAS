package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class zzl implements Parcelable.Creator<GetServiceRequest> {
    public zzl() {
    }

    static void zza(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        GetServiceRequest getServiceRequest2 = getServiceRequest;
        Parcel parcel2 = parcel;
        int i2 = i;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel2);
        SafeParcelWriter.writeInt(parcel2, 1, getServiceRequest2.zza);
        SafeParcelWriter.writeInt(parcel2, 2, getServiceRequest2.zzb);
        SafeParcelWriter.writeInt(parcel2, 3, getServiceRequest2.zzc);
        SafeParcelWriter.writeString(parcel2, 4, getServiceRequest2.zzd, false);
        SafeParcelWriter.writeIBinder(parcel2, 5, getServiceRequest2.zze, false);
        SafeParcelWriter.writeTypedArray(parcel2, 6, getServiceRequest2.zzf, i2, false);
        SafeParcelWriter.writeBundle(parcel2, 7, getServiceRequest2.zzg, false);
        SafeParcelWriter.writeParcelable(parcel2, 8, getServiceRequest2.zzh, i2, false);
        SafeParcelWriter.writeTypedArray(parcel2, 10, getServiceRequest2.zzi, i2, false);
        SafeParcelWriter.writeTypedArray(parcel2, 11, getServiceRequest2.zzj, i2, false);
        SafeParcelWriter.writeBoolean(parcel2, 12, getServiceRequest2.zzk);
        SafeParcelWriter.writeInt(parcel2, 13, getServiceRequest2.zzl);
        SafeParcelWriter.writeBoolean(parcel2, 14, getServiceRequest2.zzm);
        SafeParcelWriter.writeString(parcel2, 15, getServiceRequest2.zza(), false);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        int i;
        int i2;
        String str;
        IBinder iBinder;
        Scope[] scopeArr;
        Bundle bundle;
        Account account;
        Feature[] featureArr;
        Feature[] featureArr2;
        boolean z;
        int i3;
        boolean z2;
        String str2;
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel2);
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        String str3 = null;
        IBinder iBinder2 = null;
        Scope[] scopeArr2 = null;
        Bundle bundle2 = null;
        Account account2 = null;
        Feature[] featureArr3 = null;
        Feature[] featureArr4 = null;
        boolean z3 = false;
        int i7 = 0;
        boolean z4 = false;
        String str4 = null;
        while (true) {
            String str5 = str4;
            if (parcel2.dataPosition() < validateObjectHeader) {
                int readHeader = SafeParcelReader.readHeader(parcel2);
                switch (SafeParcelReader.getFieldId(readHeader)) {
                    case 1:
                        i4 = SafeParcelReader.readInt(parcel2, readHeader);
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
                        i = SafeParcelReader.readInt(parcel2, readHeader);
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
                        i2 = SafeParcelReader.readInt(parcel2, readHeader);
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
                        str = SafeParcelReader.createString(parcel2, readHeader);
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
                        iBinder = SafeParcelReader.readIBinder(parcel2, readHeader);
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
                        scopeArr = (Scope[]) SafeParcelReader.createTypedArray(parcel2, readHeader, Scope.CREATOR);
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
                        bundle = SafeParcelReader.createBundle(parcel2, readHeader);
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
                        account = (Account) SafeParcelReader.createParcelable(parcel2, readHeader, Account.CREATOR);
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
                        featureArr = (Feature[]) SafeParcelReader.createTypedArray(parcel2, readHeader, Feature.CREATOR);
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
                    case ConnectionResult.LICENSE_CHECK_FAILED:
                        featureArr2 = (Feature[]) SafeParcelReader.createTypedArray(parcel2, readHeader, Feature.CREATOR);
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
                        z = SafeParcelReader.readBoolean(parcel2, readHeader);
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
                        i3 = SafeParcelReader.readInt(parcel2, readHeader);
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
                        z2 = SafeParcelReader.readBoolean(parcel2, readHeader);
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
                        str2 = SafeParcelReader.createString(parcel2, readHeader);
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
                        SafeParcelReader.skipUnknownField(parcel2, readHeader);
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
                SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
                new GetServiceRequest(i4, i5, i6, str3, iBinder2, scopeArr2, bundle2, account2, featureArr3, featureArr4, z3, i7, z4, str5);
                return obj;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetServiceRequest[i];
    }
}
