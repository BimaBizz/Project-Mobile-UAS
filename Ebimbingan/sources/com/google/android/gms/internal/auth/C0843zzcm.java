package com.google.android.gms.internal.auth;

import android.os.Binder;

/* renamed from: com.google.android.gms.internal.auth.zzcm */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final /* synthetic */ class C0843zzcm {
    public static <V> V zza(C0846zzcp<V> zzcp) {
        long clearCallingIdentity;
        V zza;
        C0846zzcp<V> zzcp2 = zzcp;
        try {
            zza = zzcp2.zza();
        } catch (SecurityException e) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            zza = zzcp2.zza();
            Binder.restoreCallingIdentity(clearCallingIdentity);
        } catch (Throwable th) {
            Throwable th2 = th;
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th2;
        }
        return zza;
    }
}
