package com.google.android.gms.internal.firebase_auth;

import com.google.android.gms.internal.firebase_auth.zzhs;
import java.io.IOException;
import java.util.List;
import java.util.Map;

final class zzhc implements zzlh {
    private final zzha zzwc;

    public static zzhc zza(zzha zzha) {
        zzhc zzhc;
        zzha zzha2 = zzha;
        if (zzha2.zzwx != null) {
            return zzha2.zzwx;
        }
        new zzhc(zzha2);
        return zzhc;
    }

    private zzhc(zzha zzha) {
        this.zzwc = (zzha) zzht.zza(zzha, "output");
        this.zzwc.zzwx = this;
    }

    public final int zzhl() {
        return zzhs.zzd.zzaay;
    }

    public final void zzp(int i, int i2) throws IOException {
        int i3 = i2;
        int i4 = i;
        int i5 = i4;
        this.zzwc.zzi(i4, i3);
    }

    public final void zzi(int i, long j) throws IOException {
        long j2 = j;
        int i2 = i;
        int i3 = i2;
        this.zzwc.zza(i2, j2);
    }

    public final void zzj(int i, long j) throws IOException {
        long j2 = j;
        int i2 = i;
        int i3 = i2;
        this.zzwc.zzc(i2, j2);
    }

    public final void zza(int i, float f) throws IOException {
        this.zzwc.zza(i, f);
    }

    public final void zza(int i, double d) throws IOException {
        this.zzwc.zza(i, d);
    }

    public final void zzq(int i, int i2) throws IOException {
        int i3 = i2;
        int i4 = i;
        int i5 = i4;
        this.zzwc.zzf(i4, i3);
    }

    public final void zza(int i, long j) throws IOException {
        this.zzwc.zza(i, j);
    }

    public final void zzf(int i, int i2) throws IOException {
        this.zzwc.zzf(i, i2);
    }

    public final void zzc(int i, long j) throws IOException {
        this.zzwc.zzc(i, j);
    }

    public final void zzi(int i, int i2) throws IOException {
        this.zzwc.zzi(i, i2);
    }

    public final void zzc(int i, boolean z) throws IOException {
        this.zzwc.zzc(i, z);
    }

    public final void zza(int i, String str) throws IOException {
        this.zzwc.zza(i, str);
    }

    public final void zza(int i, zzgf zzgf) throws IOException {
        this.zzwc.zza(i, zzgf);
    }

    public final void zzg(int i, int i2) throws IOException {
        this.zzwc.zzg(i, i2);
    }

    public final void zzh(int i, int i2) throws IOException {
        this.zzwc.zzh(i, i2);
    }

    public final void zzb(int i, long j) throws IOException {
        this.zzwc.zzb(i, j);
    }

    public final void zza(int i, Object obj, zzjs zzjs) throws IOException {
        this.zzwc.zza(i, (zzjc) obj, zzjs);
    }

    public final void zzb(int i, Object obj, zzjs zzjs) throws IOException {
        int i2 = i;
        zzha zzha = this.zzwc;
        zzha zzha2 = zzha;
        zzha.zze(i2, 3);
        zzjs.zza((zzjc) obj, zzha2.zzwx);
        zzha2.zze(i2, 4);
    }

    public final void zzat(int i) throws IOException {
        this.zzwc.zze(i, 3);
    }

    public final void zzau(int i) throws IOException {
        this.zzwc.zze(i, 4);
    }

    public final void zza(int i, Object obj) throws IOException {
        int i2 = i;
        Object obj2 = obj;
        if (obj2 instanceof zzgf) {
            this.zzwc.zzb(i2, (zzgf) obj2);
        } else {
            this.zzwc.zza(i2, (zzjc) obj2);
        }
    }

    public final void zza(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = i;
        List<Integer> list2 = list;
        if (z) {
            this.zzwc.zze(i2, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list2.size(); i4++) {
                i3 += zzha.zzal(list2.get(i4).intValue());
            }
            this.zzwc.zzah(i3);
            for (int i5 = 0; i5 < list2.size(); i5++) {
                this.zzwc.zzag(list2.get(i5).intValue());
            }
            return;
        }
        for (int i6 = 0; i6 < list2.size(); i6++) {
            this.zzwc.zzf(i2, list2.get(i6).intValue());
        }
    }

    public final void zzb(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = i;
        List<Integer> list2 = list;
        if (z) {
            this.zzwc.zze(i2, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list2.size(); i4++) {
                i3 += zzha.zzao(list2.get(i4).intValue());
            }
            this.zzwc.zzah(i3);
            for (int i5 = 0; i5 < list2.size(); i5++) {
                this.zzwc.zzaj(list2.get(i5).intValue());
            }
            return;
        }
        for (int i6 = 0; i6 < list2.size(); i6++) {
            this.zzwc.zzi(i2, list2.get(i6).intValue());
        }
    }

    public final void zzc(int i, List<Long> list, boolean z) throws IOException {
        int i2 = i;
        List<Long> list2 = list;
        if (z) {
            this.zzwc.zze(i2, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list2.size(); i4++) {
                i3 += zzha.zze(list2.get(i4).longValue());
            }
            this.zzwc.zzah(i3);
            for (int i5 = 0; i5 < list2.size(); i5++) {
                zzha zzha = this.zzwc;
                long longValue = list2.get(i5).longValue();
                long j = longValue;
                zzha.zzb(longValue);
            }
            return;
        }
        for (int i6 = 0; i6 < list2.size(); i6++) {
            int i7 = i2;
            int i8 = i7;
            this.zzwc.zza(i7, list2.get(i6).longValue());
        }
    }

    public final void zzd(int i, List<Long> list, boolean z) throws IOException {
        int i2 = i;
        List<Long> list2 = list;
        if (z) {
            this.zzwc.zze(i2, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list2.size(); i4++) {
                i3 += zzha.zzf(list2.get(i4).longValue());
            }
            this.zzwc.zzah(i3);
            for (int i5 = 0; i5 < list2.size(); i5++) {
                this.zzwc.zzb(list2.get(i5).longValue());
            }
            return;
        }
        for (int i6 = 0; i6 < list2.size(); i6++) {
            this.zzwc.zza(i2, list2.get(i6).longValue());
        }
    }

    public final void zze(int i, List<Long> list, boolean z) throws IOException {
        int i2 = i;
        List<Long> list2 = list;
        if (z) {
            this.zzwc.zze(i2, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list2.size(); i4++) {
                i3 += zzha.zzh(list2.get(i4).longValue());
            }
            this.zzwc.zzah(i3);
            for (int i5 = 0; i5 < list2.size(); i5++) {
                this.zzwc.zzd(list2.get(i5).longValue());
            }
            return;
        }
        for (int i6 = 0; i6 < list2.size(); i6++) {
            this.zzwc.zzc(i2, list2.get(i6).longValue());
        }
    }

    public final void zzf(int i, List<Float> list, boolean z) throws IOException {
        int i2 = i;
        List<Float> list2 = list;
        if (z) {
            this.zzwc.zze(i2, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list2.size(); i4++) {
                i3 += zzha.zzb(list2.get(i4).floatValue());
            }
            this.zzwc.zzah(i3);
            for (int i5 = 0; i5 < list2.size(); i5++) {
                this.zzwc.zza(list2.get(i5).floatValue());
            }
            return;
        }
        for (int i6 = 0; i6 < list2.size(); i6++) {
            this.zzwc.zza(i2, list2.get(i6).floatValue());
        }
    }

    public final void zzg(int i, List<Double> list, boolean z) throws IOException {
        int i2 = i;
        List<Double> list2 = list;
        if (z) {
            this.zzwc.zze(i2, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list2.size(); i4++) {
                i3 += zzha.zzb(list2.get(i4).doubleValue());
            }
            this.zzwc.zzah(i3);
            for (int i5 = 0; i5 < list2.size(); i5++) {
                this.zzwc.zza(list2.get(i5).doubleValue());
            }
            return;
        }
        for (int i6 = 0; i6 < list2.size(); i6++) {
            this.zzwc.zza(i2, list2.get(i6).doubleValue());
        }
    }

    public final void zzh(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = i;
        List<Integer> list2 = list;
        if (z) {
            this.zzwc.zze(i2, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list2.size(); i4++) {
                i3 += zzha.zzaq(list2.get(i4).intValue());
            }
            this.zzwc.zzah(i3);
            for (int i5 = 0; i5 < list2.size(); i5++) {
                zzha zzha = this.zzwc;
                int intValue = list2.get(i5).intValue();
                int i6 = intValue;
                zzha.zzag(intValue);
            }
            return;
        }
        for (int i7 = 0; i7 < list2.size(); i7++) {
            int i8 = i2;
            int i9 = i8;
            this.zzwc.zzf(i8, list2.get(i7).intValue());
        }
    }

    public final void zzi(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = i;
        List<Boolean> list2 = list;
        if (z) {
            this.zzwc.zze(i2, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list2.size(); i4++) {
                i3 += zzha.zzu(list2.get(i4).booleanValue());
            }
            this.zzwc.zzah(i3);
            for (int i5 = 0; i5 < list2.size(); i5++) {
                this.zzwc.zzt(list2.get(i5).booleanValue());
            }
            return;
        }
        for (int i6 = 0; i6 < list2.size(); i6++) {
            this.zzwc.zzc(i2, list2.get(i6).booleanValue());
        }
    }

    public final void zza(int i, List<String> list) throws IOException {
        int i2 = i;
        List<String> list2 = list;
        if (list2 instanceof zzij) {
            zzij zzij = (zzij) list2;
            for (int i3 = 0; i3 < list2.size(); i3++) {
                Object zzax = zzij.zzax(i3);
                int i4 = i2;
                if (zzax instanceof String) {
                    this.zzwc.zza(i4, (String) zzax);
                } else {
                    this.zzwc.zza(i4, (zzgf) zzax);
                }
            }
            return;
        }
        for (int i5 = 0; i5 < list2.size(); i5++) {
            this.zzwc.zza(i2, list2.get(i5));
        }
    }

    public final void zzb(int i, List<zzgf> list) throws IOException {
        int i2 = i;
        List<zzgf> list2 = list;
        for (int i3 = 0; i3 < list2.size(); i3++) {
            this.zzwc.zza(i2, list2.get(i3));
        }
    }

    public final void zzj(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = i;
        List<Integer> list2 = list;
        if (z) {
            this.zzwc.zze(i2, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list2.size(); i4++) {
                i3 += zzha.zzam(list2.get(i4).intValue());
            }
            this.zzwc.zzah(i3);
            for (int i5 = 0; i5 < list2.size(); i5++) {
                this.zzwc.zzah(list2.get(i5).intValue());
            }
            return;
        }
        for (int i6 = 0; i6 < list2.size(); i6++) {
            this.zzwc.zzg(i2, list2.get(i6).intValue());
        }
    }

    public final void zzk(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = i;
        List<Integer> list2 = list;
        if (z) {
            this.zzwc.zze(i2, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list2.size(); i4++) {
                i3 += zzha.zzap(list2.get(i4).intValue());
            }
            this.zzwc.zzah(i3);
            for (int i5 = 0; i5 < list2.size(); i5++) {
                zzha zzha = this.zzwc;
                int intValue = list2.get(i5).intValue();
                int i6 = intValue;
                zzha.zzaj(intValue);
            }
            return;
        }
        for (int i7 = 0; i7 < list2.size(); i7++) {
            int i8 = i2;
            int i9 = i8;
            this.zzwc.zzi(i8, list2.get(i7).intValue());
        }
    }

    public final void zzl(int i, List<Long> list, boolean z) throws IOException {
        int i2 = i;
        List<Long> list2 = list;
        if (z) {
            this.zzwc.zze(i2, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list2.size(); i4++) {
                i3 += zzha.zzi(list2.get(i4).longValue());
            }
            this.zzwc.zzah(i3);
            for (int i5 = 0; i5 < list2.size(); i5++) {
                zzha zzha = this.zzwc;
                long longValue = list2.get(i5).longValue();
                long j = longValue;
                zzha.zzd(longValue);
            }
            return;
        }
        for (int i6 = 0; i6 < list2.size(); i6++) {
            int i7 = i2;
            int i8 = i7;
            this.zzwc.zzc(i7, list2.get(i6).longValue());
        }
    }

    public final void zzm(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = i;
        List<Integer> list2 = list;
        if (z) {
            this.zzwc.zze(i2, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list2.size(); i4++) {
                i3 += zzha.zzan(list2.get(i4).intValue());
            }
            this.zzwc.zzah(i3);
            for (int i5 = 0; i5 < list2.size(); i5++) {
                this.zzwc.zzai(list2.get(i5).intValue());
            }
            return;
        }
        for (int i6 = 0; i6 < list2.size(); i6++) {
            this.zzwc.zzh(i2, list2.get(i6).intValue());
        }
    }

    public final void zzn(int i, List<Long> list, boolean z) throws IOException {
        int i2 = i;
        List<Long> list2 = list;
        if (z) {
            this.zzwc.zze(i2, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list2.size(); i4++) {
                i3 += zzha.zzg(list2.get(i4).longValue());
            }
            this.zzwc.zzah(i3);
            for (int i5 = 0; i5 < list2.size(); i5++) {
                this.zzwc.zzc(list2.get(i5).longValue());
            }
            return;
        }
        for (int i6 = 0; i6 < list2.size(); i6++) {
            this.zzwc.zzb(i2, list2.get(i6).longValue());
        }
    }

    public final void zza(int i, List<?> list, zzjs zzjs) throws IOException {
        int i2 = i;
        List<?> list2 = list;
        zzjs zzjs2 = zzjs;
        for (int i3 = 0; i3 < list2.size(); i3++) {
            zza(i2, (Object) list2.get(i3), zzjs2);
        }
    }

    public final void zzb(int i, List<?> list, zzjs zzjs) throws IOException {
        int i2 = i;
        List<?> list2 = list;
        zzjs zzjs2 = zzjs;
        for (int i3 = 0; i3 < list2.size(); i3++) {
            zzb(i2, (Object) list2.get(i3), zzjs2);
        }
    }

    public final <K, V> void zza(int i, zzit<K, V> zzit, Map<K, V> map) throws IOException {
        int i2 = i;
        zzit<K, V> zzit2 = zzit;
        for (Map.Entry next : map.entrySet()) {
            this.zzwc.zze(i2, 2);
            this.zzwc.zzah(zziu.zza(zzit2, next.getKey(), next.getValue()));
            zziu.zza(this.zzwc, zzit2, next.getKey(), next.getValue());
        }
    }
}
