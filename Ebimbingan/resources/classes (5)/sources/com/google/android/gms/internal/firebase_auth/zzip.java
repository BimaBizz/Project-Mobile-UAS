package com.google.android.gms.internal.firebase_auth;

import com.google.android.gms.internal.firebase_auth.zzhs;

final class zzip implements zzjr {
    private static final zziz zzacg;
    private final zziz zzacf;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzip() {
        /*
            r9 = this;
            r0 = r9
            r1 = r0
            com.google.android.gms.internal.firebase_auth.zzir r2 = new com.google.android.gms.internal.firebase_auth.zzir
            r8 = r2
            r2 = r8
            r3 = r8
            r4 = 2
            com.google.android.gms.internal.firebase_auth.zziz[] r4 = new com.google.android.gms.internal.firebase_auth.zziz[r4]
            r8 = r4
            r4 = r8
            r5 = r8
            r6 = 0
            com.google.android.gms.internal.firebase_auth.zzhq r7 = com.google.android.gms.internal.firebase_auth.zzhq.zzib()
            r5[r6] = r7
            r8 = r4
            r4 = r8
            r5 = r8
            r6 = 1
            com.google.android.gms.internal.firebase_auth.zziz r7 = zzjh()
            r5[r6] = r7
            r3.<init>(r4)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_auth.zzip.<init>():void");
    }

    private zzip(zziz zziz) {
        this.zzacf = (zziz) zzht.zza(zziz, "messageInfoFactory");
    }

    public final <T> zzjs<T> zze(Class<T> cls) {
        Class<T> cls2 = cls;
        zzju.zzg(cls2);
        zzja zzb = this.zzacf.zzb(cls2);
        zzja zzja = zzb;
        if (!zzb.zzjp()) {
            zzja zzja2 = zzja;
            Class<T> cls3 = cls2;
            if (zzhs.class.isAssignableFrom(cls3)) {
                if (zza(zzja2)) {
                    return zzjg.zza(cls3, zzja2, zzjj.zzjs(), zzim.zzjg(), zzju.zzkf(), zzhj.zzhv(), zzix.zzjm());
                }
                return zzjg.zza(cls3, zzja2, zzjj.zzjs(), zzim.zzjg(), zzju.zzkf(), (zzhh<?>) null, zzix.zzjm());
            } else if (zza(zzja2)) {
                return zzjg.zza(cls3, zzja2, zzjj.zzjr(), zzim.zzjf(), zzju.zzkd(), zzhj.zzhw(), zzix.zzjl());
            } else {
                return zzjg.zza(cls3, zzja2, zzjj.zzjr(), zzim.zzjf(), zzju.zzke(), (zzhh<?>) null, zzix.zzjl());
            }
        } else if (zzhs.class.isAssignableFrom(cls2)) {
            return zzjf.zza(zzju.zzkf(), zzhj.zzhv(), zzja.zzjq());
        } else {
            return zzjf.zza(zzju.zzkd(), zzhj.zzhw(), zzja.zzjq());
        }
    }

    private static boolean zza(zzja zzja) {
        return zzja.zzjo() == zzhs.zzd.zzaav;
    }

    private static zziz zzjh() {
        try {
            return (zziz) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception e) {
            return zzacg;
        }
    }

    static {
        zziz zziz;
        new zzis();
        zzacg = zziz;
    }
}
