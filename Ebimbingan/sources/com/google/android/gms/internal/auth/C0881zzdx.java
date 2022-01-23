package com.google.android.gms.internal.auth;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.auth.zzdx */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0881zzdx<T> implements C0879zzdv<T>, Serializable {
    private final C0879zzdv<T> zza;
    private volatile transient boolean zzb;
    @NullableDecl
    private transient T zzc;

    C0881zzdx(C0879zzdv<T> zzdv) {
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
