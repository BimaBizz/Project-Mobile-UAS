package com.google.android.gms.internal.auth;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.auth.zzdw */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0880zzdw<T> implements C0879zzdv<T> {
    private volatile C0879zzdv<T> zza;
    private volatile boolean zzb;
    @NullableDecl
    private T zzc;

    C0880zzdw(C0879zzdv<T> zzdv) {
        this.zza = (C0879zzdv) C0874zzdq.zza(zzdv);
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
        C0879zzdv<T> zzdv = this.zza;
        C0879zzdv<T> zzdv2 = zzdv;
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
