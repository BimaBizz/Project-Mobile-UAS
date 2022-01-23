package com.google.android.gms.internal.auth;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzdw<T> implements zzdv<T> {
    private volatile zzdv<T> zza;
    private volatile boolean zzb;
    @NullableDecl
    private T zzc;

    zzdw(zzdv<T> zzdv) {
        this.zza = (zzdv) zzdq.zza(zzdv);
    }

    public final T zza() {
        if (!this.zzb) {
            synchronized (this) {
                try {
                    if (!this.zzb) {
                        T zza2 = this.zza.zza();
                        this.zzc = zza2;
                        this.zzb = true;
                        this.zza = null;
                        T t = zza2;
                        return t;
                    }
                } catch (Throwable th) {
                    while (true) {
                        Throwable th2 = th;
                        throw th2;
                    }
                }
            }
        }
        return this.zzc;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb;
        StringBuilder sb2;
        zzdv<T> zzdv = this.zza;
        zzdv<T> zzdv2 = zzdv;
        if (zzdv == null) {
            String valueOf = String.valueOf(this.zzc);
            new StringBuilder(25 + String.valueOf(valueOf).length());
            obj = sb2.append("<supplier that returned ").append(valueOf).append(">").toString();
        } else {
            obj = zzdv2;
        }
        String valueOf2 = String.valueOf(obj);
        new StringBuilder(19 + String.valueOf(valueOf2).length());
        return sb.append("Suppliers.memoize(").append(valueOf2).append(")").toString();
    }
}
