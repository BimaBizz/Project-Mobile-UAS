package com.google.android.gms.internal.auth;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzdx<T> implements zzdv<T>, Serializable {
    private final zzdv<T> zza;
    private volatile transient boolean zzb;
    @NullableDecl
    private transient T zzc;

    zzdx(zzdv<T> zzdv) {
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
        if (this.zzb) {
            String valueOf = String.valueOf(this.zzc);
            new StringBuilder(25 + String.valueOf(valueOf).length());
            obj = sb2.append("<supplier that returned ").append(valueOf).append(">").toString();
        } else {
            obj = this.zza;
        }
        String valueOf2 = String.valueOf(obj);
        new StringBuilder(19 + String.valueOf(valueOf2).length());
        return sb.append("Suppliers.memoize(").append(valueOf2).append(")").toString();
    }
}
