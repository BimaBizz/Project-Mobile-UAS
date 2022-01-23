package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class zzu extends zza implements IAccountAccessor {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    public final Account zzb() throws RemoteException {
        Parcel zzB = zzB(2, zza());
        Account account = (Account) zzc.zzc(zzB, Account.CREATOR);
        zzB.recycle();
        return account;
    }
}
