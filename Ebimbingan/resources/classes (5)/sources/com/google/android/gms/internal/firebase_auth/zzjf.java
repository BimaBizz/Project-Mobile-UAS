package com.google.android.gms.internal.firebase_auth;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

final class zzjf<T> implements zzjs<T> {
    private final zzjc zzacr;
    private final zzkk<?, ?> zzacs;
    private final boolean zzact;
    private final zzhh<?> zzacu;

    private zzjf(zzkk<?, ?> zzkk, zzhh<?> zzhh, zzjc zzjc) {
        zzhh<?> zzhh2 = zzhh;
        zzjc zzjc2 = zzjc;
        this.zzacs = zzkk;
        this.zzact = zzhh2.zzf(zzjc2);
        this.zzacu = zzhh2;
        this.zzacr = zzjc2;
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> com.google.android.gms.internal.firebase_auth.zzjf<T> zza(com.google.android.gms.internal.firebase_auth.zzkk<?, ?> r9, com.google.android.gms.internal.firebase_auth.zzhh<?> r10, com.google.android.gms.internal.firebase_auth.zzjc r11) {
        /*
            r0 = r9
            r1 = r10
            r2 = r11
            com.google.android.gms.internal.firebase_auth.zzjf r3 = new com.google.android.gms.internal.firebase_auth.zzjf
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_auth.zzjf.zza(com.google.android.gms.internal.firebase_auth.zzkk, com.google.android.gms.internal.firebase_auth.zzhh, com.google.android.gms.internal.firebase_auth.zzjc):com.google.android.gms.internal.firebase_auth.zzjf");
    }

    public final T newInstance() {
        return this.zzacr.zzio().zzig();
    }

    public final boolean equals(T t, T t2) {
        T t3 = t;
        T t4 = t2;
        if (!this.zzacs.zzs(t3).equals(this.zzacs.zzs(t4))) {
            return false;
        }
        if (!this.zzact) {
            return true;
        }
        return this.zzacu.zzd(t3).equals(this.zzacu.zzd(t4));
    }

    public final int hashCode(T t) {
        T t2 = t;
        int hashCode = this.zzacs.zzs(t2).hashCode();
        if (this.zzact) {
            hashCode = (hashCode * 53) + this.zzacu.zzd(t2).hashCode();
        }
        return hashCode;
    }

    public final void zzd(T t, T t2) {
        T t3 = t;
        T t4 = t2;
        zzju.zza(this.zzacs, t3, t4);
        if (this.zzact) {
            zzju.zza(this.zzacu, t3, t4);
        }
    }

    public final void zza(T t, zzlh zzlh) throws IOException {
        Throwable th;
        T t2 = t;
        zzlh zzlh2 = zzlh;
        Iterator<Map.Entry<?, Object>> it = this.zzacu.zzd(t2).iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            Map.Entry entry = next;
            zzhk zzhk = (zzhk) next.getKey();
            zzhk zzhk2 = zzhk;
            if (zzhk.zzhy() != zzle.zzagr || zzhk2.zzhz() || zzhk2.zzia()) {
                Throwable th2 = th;
                new IllegalStateException("Found invalid MessageSet item.");
                throw th2;
            } else if (entry instanceof zzif) {
                zzlh2.zza(zzhk2.zzbq(), (Object) ((zzif) entry).zzjc().zzft());
            } else {
                zzlh2.zza(zzhk2.zzbq(), entry.getValue());
            }
        }
        zzkk<?, ?> zzkk = this.zzacs;
        zzkk<?, ?> zzkk2 = zzkk;
        zzkk<?, ?> zzkk3 = zzkk;
        zzkk<?, ?> zzkk4 = zzkk3;
        zzkk2.zzc(zzkk3.zzs(t2), zzlh2);
    }

    public final void zza(T t, zzjp zzjp, zzhf zzhf) throws IOException {
        boolean z;
        zzkk<?, ?> zzkk = this.zzacs;
        zzhf zzhf2 = zzhf;
        zzjp zzjp2 = zzjp;
        T t2 = t;
        zzhh<?> zzhh = this.zzacu;
        zzkk<?, ?> zzkk2 = zzkk;
        Object zzt = zzkk2.zzt(t2);
        zzhi<?> zze = zzhh.zze(t2);
        do {
            try {
                if (zzjp2.zzhg() == Integer.MAX_VALUE) {
                    zzkk2.zzg(t2, zzt);
                    return;
                }
                Object obj = zzt;
                zzkk<?, ?> zzkk3 = zzkk2;
                zzhi<?> zzhi = zze;
                zzhh<?> zzhh2 = zzhh;
                zzhf zzhf3 = zzhf2;
                zzjp zzjp3 = zzjp2;
                int tag = zzjp3.getTag();
                int i = tag;
                if (tag == 11) {
                    int i2 = 0;
                    zzgf zzgf = null;
                    Object obj2 = null;
                    while (zzjp3.zzhg() != Integer.MAX_VALUE) {
                        int tag2 = zzjp3.getTag();
                        int i3 = tag2;
                        if (tag2 == 16) {
                            i2 = zzjp3.zzgr();
                            obj2 = zzhh2.zza(zzhf3, this.zzacr, i2);
                        } else if (i3 == 26) {
                            if (obj2 != null) {
                                zzhh2.zza(zzjp3, obj2, zzhf3, zzhi);
                            } else {
                                zzgf = zzjp3.zzgq();
                            }
                        } else if (!zzjp3.zzhh()) {
                            break;
                        }
                    }
                    if (zzjp3.getTag() != 12) {
                        throw zzic.zziv();
                    } else if (zzgf != null) {
                        if (obj2 != null) {
                            zzhh2.zza(zzgf, obj2, zzhf3, zzhi);
                        } else {
                            zzkk3.zza(obj, i2, zzgf);
                        }
                    }
                } else if ((i & 7) == 2) {
                    Object zza = zzhh2.zza(zzhf3, this.zzacr, i >>> 3);
                    Object obj3 = zza;
                    if (zza != null) {
                        zzhh2.zza(zzjp3, obj3, zzhf3, zzhi);
                    } else {
                        z = zzkk3.zza(obj, zzjp3);
                        continue;
                    }
                } else {
                    z = zzjp3.zzhh();
                    continue;
                }
                z = true;
                continue;
            } catch (Throwable th) {
                Throwable th2 = th;
                zzkk2.zzg(t2, zzt);
                throw th2;
            }
        } while (z);
        zzkk2.zzg(t2, zzt);
    }

    public final void zzf(T t) {
        T t2 = t;
        this.zzacs.zzf(t2);
        this.zzacu.zzf((Object) t2);
    }

    public final boolean zzp(T t) {
        return this.zzacu.zzd(t).isInitialized();
    }

    public final int zzq(T t) {
        T t2 = t;
        zzkk<?, ?> zzkk = this.zzacs;
        int zzu = 0 + zzkk.zzu(zzkk.zzs(t2));
        if (this.zzact) {
            zzu += this.zzacu.zzd(t2).zzht();
        }
        return zzu;
    }
}
