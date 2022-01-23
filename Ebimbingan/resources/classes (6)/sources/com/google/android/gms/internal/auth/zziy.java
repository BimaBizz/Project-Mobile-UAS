package com.google.android.gms.internal.auth;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zziy<T> implements zzji<T> {
    private final zzis zza;
    private final zzka<?, ?> zzb;
    private final boolean zzc;
    private final zzhd<?> zzd;

    private zziy(zzka<?, ?> zzka, zzhd<?> zzhd, zzis zzis) {
        zzhd<?> zzhd2 = zzhd;
        zzis zzis2 = zzis;
        this.zzb = zzka;
        this.zzc = zzhd2.zza(zzis2);
        this.zzd = zzhd2;
        this.zza = zzis2;
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> com.google.android.gms.internal.auth.zziy<T> zza(com.google.android.gms.internal.auth.zzka<?, ?> r9, com.google.android.gms.internal.auth.zzhd<?> r10, com.google.android.gms.internal.auth.zzis r11) {
        /*
            r0 = r9
            r1 = r10
            r2 = r11
            com.google.android.gms.internal.auth.zziy r3 = new com.google.android.gms.internal.auth.zziy
            r8 = r3
            r3 = r8
            r4 = r8
            r5 = r0
            r6 = r1
            r7 = r2
            r4.<init>(r5, r6, r7)
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zziy.zza(com.google.android.gms.internal.auth.zzka, com.google.android.gms.internal.auth.zzhd, com.google.android.gms.internal.auth.zzis):com.google.android.gms.internal.auth.zziy");
    }

    public final T zza() {
        return this.zza.zzg().zzf();
    }

    public final boolean zza(T t, T t2) {
        T t3 = t;
        T t4 = t2;
        if (!this.zzb.zza(t3).equals(this.zzb.zza(t4))) {
            return false;
        }
        if (!this.zzc) {
            return true;
        }
        return this.zzd.zza((Object) t3).equals(this.zzd.zza((Object) t4));
    }

    public final int zza(T t) {
        T t2 = t;
        int hashCode = this.zzb.zza(t2).hashCode();
        if (this.zzc) {
            hashCode = (hashCode * 53) + this.zzd.zza((Object) t2).hashCode();
        }
        return hashCode;
    }

    public final void zzb(T t, T t2) {
        T t3 = t;
        T t4 = t2;
        zzjk.zza(this.zzb, t3, t4);
        if (this.zzc) {
            zzjk.zza(this.zzd, t3, t4);
        }
    }

    public final void zza(T t, zzkx zzkx) throws IOException {
        Throwable th;
        T t2 = t;
        zzkx zzkx2 = zzkx;
        Iterator<Map.Entry<?, Object>> zzd2 = this.zzd.zza((Object) t2).zzd();
        while (zzd2.hasNext()) {
            Map.Entry next = zzd2.next();
            Map.Entry entry = next;
            zzhg zzhg = (zzhg) next.getKey();
            zzhg zzhg2 = zzhg;
            if (zzhg.zzc() != zzku.zzi || zzhg2.zzd() || zzhg2.zze()) {
                Throwable th2 = th;
                new IllegalStateException("Found invalid MessageSet item.");
                throw th2;
            } else if (entry instanceof zzhz) {
                zzkx2.zza(zzhg2.zza(), (Object) ((zzhz) entry).zza().zzc());
            } else {
                zzkx2.zza(zzhg2.zza(), entry.getValue());
            }
        }
        zzka<?, ?> zzka = this.zzb;
        zzka.zzb(zzka.zza(t2), zzkx2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(T r23, byte[] r24, int r25, int r26, com.google.android.gms.internal.auth.zzgd r27) throws java.io.IOException {
        /*
            r22 = this;
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r27
            r15 = r2
            com.google.android.gms.internal.auth.zzhm r15 = (com.google.android.gms.internal.auth.zzhm) r15
            com.google.android.gms.internal.auth.zzkd r15 = r15.zzb
            r21 = r15
            r15 = r21
            r16 = r21
            r7 = r16
            com.google.android.gms.internal.auth.zzkd r16 = com.google.android.gms.internal.auth.zzkd.zza()
            r0 = r16
            if (r15 != r0) goto L_0x002f
            com.google.android.gms.internal.auth.zzkd r15 = com.google.android.gms.internal.auth.zzkd.zzb()
            r7 = r15
            r15 = r2
            com.google.android.gms.internal.auth.zzhm r15 = (com.google.android.gms.internal.auth.zzhm) r15
            r16 = r7
            r0 = r16
            r15.zzb = r0
        L_0x002f:
            r15 = r2
            com.google.android.gms.internal.auth.zzhm$zzd r15 = (com.google.android.gms.internal.auth.zzhm.zzd) r15
            com.google.android.gms.internal.auth.zzhe r15 = r15.zzi()
            r15 = 0
            r8 = r15
        L_0x0038:
            r15 = r4
            r16 = r5
            r0 = r16
            if (r15 >= r0) goto L_0x0173
            r15 = r3
            r16 = r4
            r17 = r6
            int r15 = com.google.android.gms.internal.auth.zzge.zza(r15, r16, r17)
            r4 = r15
            r15 = r6
            int r15 = r15.zza
            r21 = r15
            r15 = r21
            r16 = r21
            r9 = r16
            r16 = 11
            r0 = r16
            if (r15 == r0) goto L_0x00bf
            r15 = r9
            r16 = 7
            r15 = r15 & 7
            r16 = 2
            r0 = r16
            if (r15 != r0) goto L_0x00af
            r15 = r1
            com.google.android.gms.internal.auth.zzhd<?> r15 = r15.zzd
            r16 = r6
            r0 = r16
            com.google.android.gms.internal.auth.zzhb r0 = r0.zzd
            r16 = r0
            r17 = r1
            r0 = r17
            com.google.android.gms.internal.auth.zzis r0 = r0.zza
            r17 = r0
            r18 = r9
            r19 = 3
            int r18 = r18 >>> 3
            java.lang.Object r15 = r15.zza(r16, r17, r18)
            com.google.android.gms.internal.auth.zzhm$zzf r15 = (com.google.android.gms.internal.auth.zzhm.zzf) r15
            r21 = r15
            r15 = r21
            r16 = r21
            r8 = r16
            if (r15 == 0) goto L_0x009e
            com.google.android.gms.internal.auth.zzjh r15 = com.google.android.gms.internal.auth.zzjh.zza()
            java.lang.NoSuchMethodError r15 = new java.lang.NoSuchMethodError
            r21 = r15
            r15 = r21
            r16 = r21
            r16.<init>()
            throw r15
        L_0x009e:
            r15 = r9
            r16 = r3
            r17 = r4
            r18 = r5
            r19 = r7
            r20 = r6
            int r15 = com.google.android.gms.internal.auth.zzge.zza((int) r15, (byte[]) r16, (int) r17, (int) r18, (com.google.android.gms.internal.auth.zzkd) r19, (com.google.android.gms.internal.auth.zzgd) r20)
            r4 = r15
            goto L_0x0038
        L_0x00af:
            r15 = r9
            r16 = r3
            r17 = r4
            r18 = r5
            r19 = r6
            int r15 = com.google.android.gms.internal.auth.zzge.zza((int) r15, (byte[]) r16, (int) r17, (int) r18, (com.google.android.gms.internal.auth.zzgd) r19)
            r4 = r15
            goto L_0x0038
        L_0x00bf:
            r15 = 0
            r10 = r15
            r15 = 0
            r11 = r15
        L_0x00c3:
            r15 = r4
            r16 = r5
            r0 = r16
            if (r15 >= r0) goto L_0x015e
            r15 = r3
            r16 = r4
            r17 = r6
            int r15 = com.google.android.gms.internal.auth.zzge.zza(r15, r16, r17)
            r4 = r15
            r15 = r6
            int r15 = r15.zza
            r21 = r15
            r15 = r21
            r16 = r21
            r12 = r16
            r16 = 3
            int r15 = r15 >>> 3
            r13 = r15
            r15 = r12
            r16 = 7
            r15 = r15 & 7
            r14 = r15
            r15 = r13
            switch(r15) {
                case 2: goto L_0x0104;
                case 3: goto L_0x0132;
                default: goto L_0x00ee;
            }
        L_0x00ee:
            r15 = r12
            r16 = 12
            r0 = r16
            if (r15 == r0) goto L_0x015e
            r15 = r12
            r16 = r3
            r17 = r4
            r18 = r5
            r19 = r6
            int r15 = com.google.android.gms.internal.auth.zzge.zza((int) r15, (byte[]) r16, (int) r17, (int) r18, (com.google.android.gms.internal.auth.zzgd) r19)
            r4 = r15
            goto L_0x00c3
        L_0x0104:
            r15 = r14
            if (r15 != 0) goto L_0x00ee
            r15 = r3
            r16 = r4
            r17 = r6
            int r15 = com.google.android.gms.internal.auth.zzge.zza(r15, r16, r17)
            r4 = r15
            r15 = r6
            int r15 = r15.zza
            r10 = r15
            r15 = r1
            com.google.android.gms.internal.auth.zzhd<?> r15 = r15.zzd
            r16 = r6
            r0 = r16
            com.google.android.gms.internal.auth.zzhb r0 = r0.zzd
            r16 = r0
            r17 = r1
            r0 = r17
            com.google.android.gms.internal.auth.zzis r0 = r0.zza
            r17 = r0
            r18 = r10
            java.lang.Object r15 = r15.zza(r16, r17, r18)
            com.google.android.gms.internal.auth.zzhm$zzf r15 = (com.google.android.gms.internal.auth.zzhm.zzf) r15
            r8 = r15
            goto L_0x00c3
        L_0x0132:
            r15 = r8
            if (r15 == 0) goto L_0x0145
            com.google.android.gms.internal.auth.zzjh r15 = com.google.android.gms.internal.auth.zzjh.zza()
            java.lang.NoSuchMethodError r15 = new java.lang.NoSuchMethodError
            r21 = r15
            r15 = r21
            r16 = r21
            r16.<init>()
            throw r15
        L_0x0145:
            r15 = r14
            r16 = 2
            r0 = r16
            if (r15 != r0) goto L_0x00ee
            r15 = r3
            r16 = r4
            r17 = r6
            int r15 = com.google.android.gms.internal.auth.zzge.zze(r15, r16, r17)
            r4 = r15
            r15 = r6
            java.lang.Object r15 = r15.zzc
            com.google.android.gms.internal.auth.zzgi r15 = (com.google.android.gms.internal.auth.zzgi) r15
            r11 = r15
            goto L_0x00c3
        L_0x015e:
            r15 = r11
            if (r15 == 0) goto L_0x0171
            r15 = r7
            r16 = r10
            r17 = 3
            int r16 = r16 << 3
            r17 = 2
            r16 = r16 | 2
            r17 = r11
            r15.zza((int) r16, (java.lang.Object) r17)
        L_0x0171:
            goto L_0x0038
        L_0x0173:
            r15 = r4
            r16 = r5
            r0 = r16
            if (r15 == r0) goto L_0x017f
            com.google.android.gms.internal.auth.zzhs r15 = com.google.android.gms.internal.auth.zzhs.zze()
            throw r15
        L_0x017f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zziy.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.auth.zzgd):void");
    }

    public final void zzc(T t) {
        T t2 = t;
        this.zzb.zzb(t2);
        this.zzd.zzc(t2);
    }

    public final boolean zzd(T t) {
        return this.zzd.zza((Object) t).zzf();
    }

    public final int zzb(T t) {
        T t2 = t;
        zzka<?, ?> zzka = this.zzb;
        int zzc2 = 0 + zzka.zzc(zzka.zza(t2));
        if (this.zzc) {
            zzc2 += this.zzd.zza((Object) t2).zzg();
        }
        return zzc2;
    }
}
