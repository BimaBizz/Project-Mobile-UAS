package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.C0776zza;
import com.google.android.gms.internal.auth.C0857zzd;

/* renamed from: com.google.android.gms.auth.account.zza */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public abstract class C0024zza extends C0776zza implements C0025zzb {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0024zza() {
        super("com.google.android.gms.auth.account.IWorkAccountCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        Parcel parcel3 = parcel;
        Parcel parcel4 = parcel2;
        int i3 = i2;
        switch (i) {
            case 1:
                zza((Account) C0857zzd.zza(parcel3, Account.CREATOR));
                break;
            case 2:
                zza(C0857zzd.zza(parcel3));
                break;
            default:
                return false;
        }
        return true;
    }
}
