package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.C0978zzhm;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.auth.zzhb */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public class C0967zzhb {
    private static volatile boolean zza = false;
    private static boolean zzb = true;
    private static volatile C0967zzhb zzc;
    private static final C0967zzhb zzd;
    private final Map<zza, C0978zzhm.zzf<?, ?>> zze;

    /* JADX INFO: finally extract failed */
    public static C0967zzhb zza() {
        C0967zzhb zzhb = zzc;
        C0967zzhb zzhb2 = zzhb;
        if (zzhb == null) {
            Class<C0967zzhb> cls = C0967zzhb.class;
            Class<C0967zzhb> cls2 = cls;
            synchronized (cls) {
                try {
                    C0967zzhb zzhb3 = zzc;
                    zzhb2 = zzhb3;
                    if (zzhb3 == null) {
                        C0967zzhb zzhb4 = zzd;
                        zzc = zzhb4;
                        zzhb2 = zzhb4;
                    }
                } catch (Throwable th) {
                    Throwable th2 = th;
                    Class<C0967zzhb> cls3 = cls2;
                    throw th2;
                }
            }
        }
        return zzhb2;
    }

    /* renamed from: com.google.android.gms.internal.auth.zzhb$zza */
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

    public final <ContainingType extends C1011zzis> C0978zzhm.zzf<ContainingType, ?> zza(ContainingType containingtype, int i) {
        Object obj;
        new zza(containingtype, i);
        return this.zze.get(obj);
    }

    C0967zzhb() {
        Map<zza, C0978zzhm.zzf<?, ?>> map;
        new HashMap();
        this.zze = map;
    }

    private C0967zzhb(boolean z) {
        boolean z2 = z;
        this.zze = Collections.emptyMap();
    }

    static {
        C0967zzhb zzhb;
        new C0967zzhb(true);
        zzd = zzhb;
    }
}
