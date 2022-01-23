package com.google.android.gms.internal.firebase_auth;

import com.google.android.gms.internal.firebase_auth.zzhs;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class zzhf {
    private static volatile boolean zzxb = false;
    private static final Class<?> zzxc = zzhp();
    private static volatile zzhf zzxd;
    private static volatile zzhf zzxe;
    static final zzhf zzxf;
    private final Map<zza, zzhs.zze<?, ?>> zzxg;

    private static Class<?> zzhp() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

    static final class zza {
        private final int number;
        private final Object object;

        zza(Object obj, int i) {
            this.object = obj;
            this.number = i;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.object) * 65535) + this.number;
        }

        public final boolean equals(Object obj) {
            Object obj2 = obj;
            if (!(obj2 instanceof zza)) {
                return false;
            }
            zza zza = (zza) obj2;
            return this.object == zza.object && this.number == zza.number;
        }
    }

    /* JADX INFO: finally extract failed */
    public static zzhf zzhq() {
        zzhf zzhf = zzxd;
        zzhf zzhf2 = zzhf;
        if (zzhf == null) {
            Class<zzhf> cls = zzhf.class;
            Class<zzhf> cls2 = cls;
            synchronized (cls) {
                try {
                    zzhf zzhf3 = zzxd;
                    zzhf2 = zzhf3;
                    if (zzhf3 == null) {
                        zzhf zzhn = zzhd.zzhn();
                        zzxd = zzhn;
                        zzhf2 = zzhn;
                    }
                } catch (Throwable th) {
                    Throwable th2 = th;
                    Class<zzhf> cls3 = cls2;
                    throw th2;
                }
            }
        }
        return zzhf2;
    }

    /* JADX INFO: finally extract failed */
    public static zzhf zzhr() {
        zzhf zzhf = zzxe;
        zzhf zzhf2 = zzhf;
        if (zzhf == null) {
            Class<zzhf> cls = zzhf.class;
            Class<zzhf> cls2 = cls;
            synchronized (cls) {
                try {
                    zzhf zzhf3 = zzxe;
                    zzhf2 = zzhf3;
                    if (zzhf3 == null) {
                        zzhf zzho = zzhd.zzho();
                        zzxe = zzho;
                        zzhf2 = zzho;
                    }
                } catch (Throwable th) {
                    Throwable th2 = th;
                    Class<zzhf> cls3 = cls2;
                    throw th2;
                }
            }
        }
        return zzhf2;
    }

    static zzhf zzho() {
        return zzhr.zzc(zzhf.class);
    }

    public final <ContainingType extends zzjc> zzhs.zze<ContainingType, ?> zza(ContainingType containingtype, int i) {
        Object obj;
        new zza(containingtype, i);
        return this.zzxg.get(obj);
    }

    zzhf() {
        Map<zza, zzhs.zze<?, ?>> map;
        new HashMap();
        this.zzxg = map;
    }

    private zzhf(boolean z) {
        boolean z2 = z;
        this.zzxg = Collections.emptyMap();
    }

    static {
        zzhf zzhf;
        new zzhf(true);
        zzxf = zzhf;
    }
}
