package com.google.android.gms.internal.auth;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzjh {
    private static final zzjh zza;
    private final zzjl zzb;
    private final ConcurrentMap<Class<?>, zzji<?>> zzc;

    public static zzjh zza() {
        return zza;
    }

    public final <T> zzji<T> zza(Class<T> cls) {
        Class<T> cls2 = cls;
        T zza2 = zzho.zza(cls2, "messageType");
        zzji<T> zzji = (zzji) this.zzc.get(cls2);
        zzji<T> zzji2 = zzji;
        if (zzji == null) {
            zzji2 = this.zzb.zza(cls2);
            zzji<T> zzji3 = zzji2;
            Class<T> cls3 = cls2;
            T zza3 = zzho.zza(cls3, "messageType");
            T zza4 = zzho.zza(zzji3, "schema");
            zzji<T> putIfAbsent = this.zzc.putIfAbsent(cls3, zzji3);
            zzji<T> zzji4 = putIfAbsent;
            if (putIfAbsent != null) {
                zzji2 = zzji4;
            }
        }
        return zzji2;
    }

    public final <T> zzji<T> zza(T t) {
        return zza(t.getClass());
    }

    private zzjh() {
        ConcurrentMap<Class<?>, zzji<?>> concurrentMap;
        zzjl zzjl;
        new ConcurrentHashMap();
        this.zzc = concurrentMap;
        new zzij();
        this.zzb = zzjl;
    }

    static {
        zzjh zzjh;
        new zzjh();
        zza = zzjh;
    }
}
