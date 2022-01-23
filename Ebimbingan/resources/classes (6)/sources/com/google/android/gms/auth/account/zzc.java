package com.google.android.gms.auth.account;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.auth.zza;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public abstract class zzc extends zza implements zzd {
    public static zzd zza(IBinder iBinder) {
        zzd zzd;
        IBinder iBinder2 = iBinder;
        if (iBinder2 == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
        IInterface iInterface = queryLocalInterface;
        if (queryLocalInterface instanceof zzd) {
            return (zzd) iInterface;
        }
        new zze(iBinder2);
        return zzd;
    }
}
