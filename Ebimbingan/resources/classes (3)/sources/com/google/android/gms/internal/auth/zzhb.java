package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzhm;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public class zzhb {
    private static volatile boolean zza = false;
    private static boolean zzb = true;
    private static volatile zzhb zzc;
    private static final zzhb zzd;
    private final Map<zza, zzhm.zzf<?, ?>> zze;

    /* JADX INFO: finally extract failed */
    public static zzhb zza() {
        zzhb zzhb = zzc;
        zzhb zzhb2 = zzhb;
        if (zzhb == null) {
            Class<zzhb> cls = zzhb.class;
            Class<zzhb> cls2 = cls;
            synchronized (cls) {
                try {
                    zzhb zzhb3 = zzc;
                    zzhb2 = zzhb3;
                    if (zzhb3 == null) {
                        zzhb zzhb4 = zzd;
                        zzc = zzhb4;
                        zzhb2 = zzhb4;
                    }
                } catch (Throwable th) {
                    Throwable th2 = th;
                    Class<zzhb> cls3 = cls2;
                    throw th2;
                }
            }
        }
        return zzhb2;
    }

    /* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
    static final class zza {
        private final Object zza;
        private final int zzb;

        zza(Object obj, int i) {
            this.zza = obj;
            this.zzb = i;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.zza) * 65535) + this.zzb;
        }

        public final boolean equals(Object obj) {
            Object obj2 = obj;
            if (!(obj2 instanceof zza)) {
                return false;
            }
            zza zza2 = (zza) obj2;
            return this.zza == zza2.zza && this.zzb == zza2.zzb;
        }
    }

    public final <ContainingType extends zzis> zzhm.zzf<ContainingType, ?> zza(ContainingType containingtype, int i) {
        Object obj;
        new zza(containingtype, i);
        return this.zze.get(obj);
    }

    zzhb() {
        Map<zza, zzhm.zzf<?, ?>> map;
        new HashMap();
        this.zze = map;
    }

    private zzhb(boolean z) {
        boolean z2 = z;
        this.zze = Collections.emptyMap();
    }

    static {
        zzhb zzhb;
        new zzhb(true);
        zzd = zzhb;
    }
}
