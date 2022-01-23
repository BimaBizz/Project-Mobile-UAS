package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzhm;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzij implements zzjl {
    private static final zzit zzb;
    private final zzit zza;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzij() {
        /*
            r9 = this;
            r0 = r9
            r1 = r0
            com.google.android.gms.internal.auth.zzil r2 = new com.google.android.gms.internal.auth.zzil
            r8 = r2
            r2 = r8
            r3 = r8
            r4 = 2
            com.google.android.gms.internal.auth.zzit[] r4 = new com.google.android.gms.internal.auth.zzit[r4]
            r8 = r4
            r4 = r8
            r5 = r8
            r6 = 0
            com.google.android.gms.internal.auth.zzhn r7 = com.google.android.gms.internal.auth.zzhn.zza()
            r5[r6] = r7
            r8 = r4
            r4 = r8
            r5 = r8
            r6 = 1
            com.google.android.gms.internal.auth.zzit r7 = zza()
            r5[r6] = r7
            r3.<init>(r4)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzij.<init>():void");
    }

    private zzij(zzit zzit) {
        this.zza = (zzit) zzho.zza(zzit, "messageInfoFactory");
    }

    public final <T> zzji<T> zza(Class<T> cls) {
        Class<T> cls2 = cls;
        zzjk.zza((Class<?>) cls2);
        zziq zzb2 = this.zza.zzb(cls2);
        zziq zziq = zzb2;
        if (!zzb2.zzb()) {
            zziq zziq2 = zziq;
            Class<T> cls3 = cls2;
            if (zzhm.class.isAssignableFrom(cls3)) {
                if (zza(zziq2)) {
                    return zziw.zza(cls3, zziq2, zzjc.zzb(), zzic.zzb(), zzjk.zzc(), zzhf.zza(), zzir.zzb());
                }
                return zziw.zza(cls3, zziq2, zzjc.zzb(), zzic.zzb(), zzjk.zzc(), (zzhd<?>) null, zzir.zzb());
            } else if (zza(zziq2)) {
                return zziw.zza(cls3, zziq2, zzjc.zza(), zzic.zza(), zzjk.zza(), zzhf.zzb(), zzir.zza());
            } else {
                return zziw.zza(cls3, zziq2, zzjc.zza(), zzic.zza(), zzjk.zzb(), (zzhd<?>) null, zzir.zza());
            }
        } else if (zzhm.class.isAssignableFrom(cls2)) {
            return zziy.zza(zzjk.zzc(), zzhf.zza(), zziq.zzc());
        } else {
            return zziy.zza(zzjk.zza(), zzhf.zzb(), zziq.zzc());
        }
    }

    private static boolean zza(zziq zziq) {
        return zziq.zza() == zzhm.zze.zzh;
    }

    private static zzit zza() {
        try {
            return (zzit) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception e) {
            return zzb;
        }
    }

    static {
        zzit zzit;
        new zzii();
        zzb = zzit;
    }
}
