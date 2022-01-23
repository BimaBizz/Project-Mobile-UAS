package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.auth.zze */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public abstract class C0884zze extends C0776zza implements C0911zzf {
    public static C0911zzf zza(IBinder iBinder) {
        C0911zzf zzf;
        IBinder iBinder2 = iBinder;
        if (iBinder2 == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.auth.IAuthManagerService");
        IInterface iInterface = queryLocalInterface;
        if (queryLocalInterface instanceof C0911zzf) {
            return (C0911zzf) iInterface;
        }
        new C0938zzg(iBinder2);
        return zzf;
    }
}
