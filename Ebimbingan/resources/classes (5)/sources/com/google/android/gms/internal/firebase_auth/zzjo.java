package com.google.android.gms.internal.firebase_auth;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class zzjo {
    private static final zzjo zzadn;
    private final zzjr zzado;
    private final ConcurrentMap<Class<?>, zzjs<?>> zzadp;

    public static zzjo zzjv() {
        return zzadn;
    }

    public final <T> zzjs<T> zzf(Class<T> cls) {
        Class<T> cls2 = cls;
        T zza = zzht.zza(cls2, "messageType");
        zzjs<T> zzjs = (zzjs) this.zzadp.get(cls2);
        zzjs<T> zzjs2 = zzjs;
        if (zzjs == null) {
            zzjs2 = this.zzado.zze(cls2);
            zzjs<T> zzjs3 = zzjs2;
            Class<T> cls3 = cls2;
            T zza2 = zzht.zza(cls3, "messageType");
            T zza3 = zzht.zza(zzjs3, "schema");
            zzjs<T> putIfAbsent = this.zzadp.putIfAbsent(cls3, zzjs3);
            zzjs<T> zzjs4 = putIfAbsent;
            if (putIfAbsent != null) {
                zzjs2 = zzjs4;
            }
        }
        return zzjs2;
    }

    public final <T> zzjs<T> zzr(T t) {
        return zzf(t.getClass());
    }

    private zzjo() {
        ConcurrentMap<Class<?>, zzjs<?>> concurrentMap;
        zzjr zzjr;
        new ConcurrentHashMap();
        this.zzadp = concurrentMap;
        new zzip();
        this.zzado = zzjr;
    }

    static {
        zzjo zzjo;
        new zzjo();
        zzadn = zzjo;
    }
}
