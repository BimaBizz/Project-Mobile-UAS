package com.google.android.gms.auth.account;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.auth.C0776zza;

/* renamed from: com.google.android.gms.auth.account.zzc */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public abstract class C0026zzc extends C0776zza implements C0027zzd {
    public static C0027zzd zza(IBinder iBinder) {
        C0027zzd zzd;
        IBinder iBinder2 = iBinder;
        if (iBinder2 == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
        IInterface iInterface = queryLocalInterface;
        if (queryLocalInterface instanceof C0027zzd) {
            return (C0027zzd) iInterface;
        }
        new C0028zze(iBinder2);
        return zzd;
    }
}
