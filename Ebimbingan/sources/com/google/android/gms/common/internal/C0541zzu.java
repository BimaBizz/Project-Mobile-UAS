package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.C1107zza;
import com.google.android.gms.internal.common.C1109zzc;

/* renamed from: com.google.android.gms.common.internal.zzu */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0541zzu extends C1107zza implements C0437IAccountAccessor {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0541zzu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    public final Account zzb() throws RemoteException {
        Parcel zzB = zzB(2, zza());
        Account account = (Account) C1109zzc.zzc(zzB, Account.CREATOR);
        zzB.recycle();
        return account;
    }
}
