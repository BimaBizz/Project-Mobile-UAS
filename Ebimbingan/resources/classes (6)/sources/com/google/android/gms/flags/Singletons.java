package com.google.android.gms.flags;

import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public final class Singletons {
    private static Singletons zzl;
    private final FlagRegistry zzm;
    private final zzb zzn;

    private Singletons() {
        FlagRegistry flagRegistry;
        zzb zzb;
        new FlagRegistry();
        this.zzm = flagRegistry;
        new zzb();
        this.zzn = zzb;
    }

    private static Singletons zzc() {
        Class<Singletons> cls = Singletons.class;
        Class<Singletons> cls2 = cls;
        synchronized (cls) {
            try {
                Singletons singletons = zzl;
                return singletons;
            } catch (Throwable th) {
                Throwable th2 = th;
                Class<Singletons> cls3 = cls2;
                throw th2;
            }
        }
    }

    @KeepForSdk
    public static FlagRegistry flagRegistry() {
        return zzc().zzm;
    }

    public static zzb zzd() {
        return zzc().zzn;
    }

    static {
        Singletons singletons;
        new Singletons();
        Singletons singletons2 = singletons;
        Class<Singletons> cls = Singletons.class;
        Class<Singletons> cls2 = cls;
        synchronized (cls) {
            try {
                zzl = singletons2;
            } catch (Throwable th) {
                Throwable th2 = th;
                Class<Singletons> cls3 = cls2;
                throw th2;
            }
        }
    }
}
