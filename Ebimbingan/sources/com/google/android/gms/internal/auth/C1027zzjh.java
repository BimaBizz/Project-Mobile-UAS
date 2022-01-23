package com.google.android.gms.internal.auth;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.auth.zzjh */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C1027zzjh {
    private static final C1027zzjh zza;
    private final C1031zzjl zzb;
    private final ConcurrentMap<Class<?>, C1028zzji<?>> zzc;

    public static C1027zzjh zza() {
        return zza;
    }

    public final <T> C1028zzji<T> zza(Class<T> cls) {
        Class<T> cls2 = cls;
        T zza2 = C0980zzho.zza(cls2, "messageType");
        C1028zzji<T> zzji = (C1028zzji) this.zzc.get(cls2);
        C1028zzji<T> zzji2 = zzji;
        if (zzji == null) {
            zzji2 = this.zzb.zza(cls2);
            C1028zzji<T> zzji3 = zzji2;
            Class<T> cls3 = cls2;
            T zza3 = C0980zzho.zza(cls3, "messageType");
            T zza4 = C0980zzho.zza(zzji3, "schema");
            C1028zzji<T> putIfAbsent = this.zzc.putIfAbsent(cls3, zzji3);
            C1028zzji<T> zzji4 = putIfAbsent;
            if (putIfAbsent != null) {
                zzji2 = zzji4;
            }
        }
        return zzji2;
    }

    public final <T> C1028zzji<T> zza(T t) {
        return zza(t.getClass());
    }

    private C1027zzjh() {
        ConcurrentMap<Class<?>, C1028zzji<?>> concurrentMap;
        C1031zzjl zzjl;
        new ConcurrentHashMap();
        this.zzc = concurrentMap;
        new C1002zzij();
        this.zzb = zzjl;
    }

    static {
        C1027zzjh zzjh;
        new C1027zzjh();
        zza = zzjh;
    }
}
