package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.C0978zzhm;

/* renamed from: com.google.android.gms.internal.auth.zzij */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C1002zzij implements C1031zzjl {
    private static final C1012zzit zzb;
    private final C1012zzit zza;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1002zzij() {
        /*
            r9 = this;
            r0 = r9
            r1 = r0
            com.google.android.gms.internal.auth.zzil r2 = new com.google.android.gms.internal.auth.zzil
            r8 = r2
            r2 = r8
            r3 = r8
            r4 = 2
            com.google.android.gms.internal.auth.zzit[] r4 = new com.google.android.gms.internal.auth.C1012zzit[r4]
            r8 = r4
            r4 = r8
            r5 = r8
            r6 = 0
            com.google.android.gms.internal.auth.zzhn r7 = com.google.android.gms.internal.auth.C0979zzhn.zza()
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.C1002zzij.<init>():void");
    }

    private C1002zzij(C1012zzit zzit) {
        this.zza = (C1012zzit) C0980zzho.zza(zzit, "messageInfoFactory");
    }

    public final <T> C1028zzji<T> zza(Class<T> cls) {
        Class<T> cls2 = cls;
        C1030zzjk.zza((Class<?>) cls2);
        C1009zziq zzb2 = this.zza.zzb(cls2);
        C1009zziq zziq = zzb2;
        if (!zzb2.zzb()) {
            C1009zziq zziq2 = zziq;
            Class<T> cls3 = cls2;
            if (C0978zzhm.class.isAssignableFrom(cls3)) {
                if (zza(zziq2)) {
                    return C1015zziw.zza(cls3, zziq2, C1022zzjc.zzb(), C0995zzic.zzb(), C1030zzjk.zzc(), C0971zzhf.zza(), C1010zzir.zzb());
                }
                return C1015zziw.zza(cls3, zziq2, C1022zzjc.zzb(), C0995zzic.zzb(), C1030zzjk.zzc(), (C0969zzhd<?>) null, C1010zzir.zzb());
            } else if (zza(zziq2)) {
                return C1015zziw.zza(cls3, zziq2, C1022zzjc.zza(), C0995zzic.zza(), C1030zzjk.zza(), C0971zzhf.zzb(), C1010zzir.zza());
            } else {
                return C1015zziw.zza(cls3, zziq2, C1022zzjc.zza(), C0995zzic.zza(), C1030zzjk.zzb(), (C0969zzhd<?>) null, C1010zzir.zza());
            }
        } else if (C0978zzhm.class.isAssignableFrom(cls2)) {
            return C1017zziy.zza(C1030zzjk.zzc(), C0971zzhf.zza(), zziq.zzc());
        } else {
            return C1017zziy.zza(C1030zzjk.zza(), C0971zzhf.zzb(), zziq.zzc());
        }
    }

    private static boolean zza(C1009zziq zziq) {
        return zziq.zza() == C0978zzhm.zze.zzh;
    }

    private static C1012zzit zza() {
        try {
            return (C1012zzit) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception e) {
            return zzb;
        }
    }

    static {
        C1012zzit zzit;
        new C1001zzii();
        zzb = zzit;
    }
}
