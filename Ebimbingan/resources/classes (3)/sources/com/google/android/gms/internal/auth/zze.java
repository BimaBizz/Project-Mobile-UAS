package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public abstract class zze extends zza implements zzf {
    public static zzf zza(IBinder iBinder) {
        zzf zzf;
        IBinder iBinder2 = iBinder;
        if (iBinder2 == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.auth.IAuthManagerService");
        IInterface iInterface = queryLocalInterface;
        if (queryLocalInterface instanceof zzf) {
            return (zzf) iInterface;
        }
        new zzg(iBinder2);
        return zzf;
    }
}
