package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzhm;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzgy implements zzkx {
    private final zzgv zza;

    public static zzgy zza(zzgv zzgv) {
        zzgy zzgy;
        zzgv zzgv2 = zzgv;
        if (zzgv2.zza != null) {
            return zzgv2.zza;
        }
        new zzgy(zzgv2);
        return zzgy;
    }

    private zzgy(zzgv zzgv) {
        this.zza = (zzgv) zzho.zza(zzgv, "output");
        this.zza.zza = this;
    }

    public final int zza() {
        return zzhm.zze.zzj;
    }

    public final void zza(int i, int i2) throws IOException {
        int i3 = i2;
        int i4 = i3;
        this.zza.zze(i, i3);
    }

    public final void zza(int i, long j) throws IOException {
        long j2 = j;
        long j3 = j2;
        this.zza.zza(i, j2);
    }

    public final void zzb(int i, long j) throws IOException {
        long j2 = j;
        long j3 = j2;
        this.zza.zzc(i, j2);
    }

    public final void zza(int i, float f) throws IOException {
        this.zza.zza(i, f);
    }

    public final void zza(int i, double d) throws IOException {
        this.zza.zza(i, d);
    }

    public final void zzb(int i, int i2) throws IOException {
        int i3 = i2;
        int i4 = i3;
        this.zza.zzb(i, i3);
    }

    public final void zzc(int i, long j) throws IOException {
        this.zza.zza(i, j);
    }

    public final void zzc(int i, int i2) throws IOException {
        this.zza.zzb(i, i2);
    }

    public final void zzd(int i, long j) throws IOException {
        this.zza.zzc(i, j);
    }

    public final void zzd(int i, int i2) throws IOException {
        this.zza.zze(i, i2);
    }

    public final void zza(int i, boolean z) throws IOException {
        this.zza.zza(i, z);
    }

    public final void zza(int i, String str) throws IOException {
        this.zza.zza(i, str);
    }

    public final void zza(int i, zzgi zzgi) throws IOException {
        this.zza.zza(i, zzgi);
    }

    public final void zze(int i, int i2) throws IOException {
        this.zza.zzc(i, i2);
    }

    public final void zzf(int i, int i2) throws IOException {
        this.zza.zzd(i, i2);
    }

    public final void zze(int i, long j) throws IOException {
        this.zza.zzb(i, j);
    }

    public final void zza(int i, Object obj, zzji zzji) throws IOException {
        this.zza.zza(i, (zzis) obj, zzji);
    }

    public final void zzb(int i, Object obj, zzji zzji) throws IOException {
        int i2 = i;
        zzgv zzgv = this.zza;
        zzgv zzgv2 = zzgv;
        zzgv.zza(i2, 3);
        zzji.zza((zzis) obj, (zzkx) zzgv2.zza);
        zzgv2.zza(i2, 4);
    }

    public final void zza(int i) throws IOException {
        this.zza.zza(i, 3);
    }

    public final void zzb(int i) throws IOException {
        this.zza.zza(i, 4);
    }

    public final void zza(int i, Object obj) throws IOException {
        int i2 = i;
        Object obj2 = obj;
        if (obj2 instanceof zzgi) {
            this.zza.zzb(i2, (zzgi) obj2);
        } else {
            this.zza.zza(i2, (zzis) obj2);
        }
    }

    public final void zza(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = i;
        List<Integer> list2 = list;
        if (z) {
            this.zza.zza(i2, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list2.size(); i4++) {
                i3 += zzgv.zzf(list2.get(i4).intValue());
            }
            this.zza.zzb(i3);
            for (int i5 = 0; i5 < list2.size(); i5++) {
                this.zza.zza(list2.get(i5).intValue());
            }
            return;
        }
        for (int i6 = 0; i6 < list2.size(); i6++) {
            this.zza.zzb(i2, list2.get(i6).intValue());
        }
    }

    public final void zzb(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = i;
        List<Integer> list2 = list;
        if (z) {
            this.zza.zza(i2, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list2.size(); i4++) {
                i3 += zzgv.zzi(list2.get(i4).intValue());
            }
            this.zza.zzb(i3);
            for (int i5 = 0; i5 < list2.size(); i5++) {
                this.zza.zzd(list2.get(i5).intValue());
            }
            return;
        }
        for (int i6 = 0; i6 < list2.size(); i6++) {
            this.zza.zze(i2, list2.get(i6).intValue());
        }
    }

    public final void zzc(int i, List<Long> list, boolean z) throws IOException {
        int i2 = i;
        List<Long> list2 = list;
        if (z) {
            this.zza.zza(i2, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list2.size(); i4++) {
                i3 += zzgv.zzd(list2.get(i4).longValue());
            }
            this.zza.zzb(i3);
            for (int i5 = 0; i5 < list2.size(); i5++) {
                this.zza.zza(list2.get(i5).longValue());
            }
            return;
        }
        for (int i6 = 0; i6 < list2.size(); i6++) {
            long longValue = list2.get(i6).longValue();
            long j = longValue;
            this.zza.zza(i2, longValue);
        }
    }

    public final void zzd(int i, List<Long> list, boolean z) throws IOException {
        int i2 = i;
        List<Long> list2 = list;
        if (z) {
            this.zza.zza(i2, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list2.size(); i4++) {
                i3 += zzgv.zze(list2.get(i4).longValue());
            }
            this.zza.zzb(i3);
            for (int i5 = 0; i5 < list2.size(); i5++) {
                this.zza.zza(list2.get(i5).longValue());
            }
            return;
        }
        for (int i6 = 0; i6 < list2.size(); i6++) {
            this.zza.zza(i2, list2.get(i6).longValue());
        }
    }

    public final void zze(int i, List<Long> list, boolean z) throws IOException {
        int i2 = i;
        List<Long> list2 = list;
        if (z) {
            this.zza.zza(i2, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list2.size(); i4++) {
                i3 += zzgv.zzg(list2.get(i4).longValue());
            }
            this.zza.zzb(i3);
            for (int i5 = 0; i5 < list2.size(); i5++) {
                this.zza.zzc(list2.get(i5).longValue());
            }
            return;
        }
        for (int i6 = 0; i6 < list2.size(); i6++) {
            this.zza.zzc(i2, list2.get(i6).longValue());
        }
    }

    public final void zzf(int i, List<Float> list, boolean z) throws IOException {
        int i2 = i;
        List<Float> list2 = list;
        if (z) {
            this.zza.zza(i2, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list2.size(); i4++) {
                i3 += zzgv.zzb(list2.get(i4).floatValue());
            }
            this.zza.zzb(i3);
            for (int i5 = 0; i5 < list2.size(); i5++) {
                this.zza.zza(list2.get(i5).floatValue());
            }
            return;
        }
        for (int i6 = 0; i6 < list2.size(); i6++) {
            this.zza.zza(i2, list2.get(i6).floatValue());
        }
    }

    public final void zzg(int i, List<Double> list, boolean z) throws IOException {
        int i2 = i;
        List<Double> list2 = list;
        if (z) {
            this.zza.zza(i2, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list2.size(); i4++) {
                i3 += zzgv.zzb(list2.get(i4).doubleValue());
            }
            this.zza.zzb(i3);
            for (int i5 = 0; i5 < list2.size(); i5++) {
                this.zza.zza(list2.get(i5).doubleValue());
            }
            return;
        }
        for (int i6 = 0; i6 < list2.size(); i6++) {
            this.zza.zza(i2, list2.get(i6).doubleValue());
        }
    }

    public final void zzh(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = i;
        List<Integer> list2 = list;
        if (z) {
            this.zza.zza(i2, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list2.size(); i4++) {
                i3 += zzgv.zzk(list2.get(i4).intValue());
            }
            this.zza.zzb(i3);
            for (int i5 = 0; i5 < list2.size(); i5++) {
                this.zza.zza(list2.get(i5).intValue());
            }
            return;
        }
        for (int i6 = 0; i6 < list2.size(); i6++) {
            int intValue = list2.get(i6).intValue();
            int i7 = intValue;
            this.zza.zzb(i2, intValue);
        }
    }

    public final void zzi(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = i;
        List<Boolean> list2 = list;
        if (z) {
            this.zza.zza(i2, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list2.size(); i4++) {
                i3 += zzgv.zzb(list2.get(i4).booleanValue());
            }
            this.zza.zzb(i3);
            for (int i5 = 0; i5 < list2.size(); i5++) {
                this.zza.zza(list2.get(i5).booleanValue());
            }
            return;
        }
        for (int i6 = 0; i6 < list2.size(); i6++) {
            this.zza.zza(i2, list2.get(i6).booleanValue());
        }
    }

    public final void zza(int i, List<String> list) throws IOException {
        int i2 = i;
        List<String> list2 = list;
        if (list2 instanceof zzid) {
            zzid zzid = (zzid) list2;
            for (int i3 = 0; i3 < list2.size(); i3++) {
                Object zzb = zzid.zzb(i3);
                int i4 = i2;
                if (zzb instanceof String) {
                    this.zza.zza(i4, (String) zzb);
                } else {
                    this.zza.zza(i4, (zzgi) zzb);
                }
            }
            return;
        }
        for (int i5 = 0; i5 < list2.size(); i5++) {
            this.zza.zza(i2, list2.get(i5));
        }
    }

    public final void zzb(int i, List<zzgi> list) throws IOException {
        int i2 = i;
        List<zzgi> list2 = list;
        for (int i3 = 0; i3 < list2.size(); i3++) {
            this.zza.zza(i2, list2.get(i3));
        }
    }

    public final void zzj(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = i;
        List<Integer> list2 = list;
        if (z) {
            this.zza.zza(i2, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list2.size(); i4++) {
                i3 += zzgv.zzg(list2.get(i4).intValue());
            }
            this.zza.zzb(i3);
            for (int i5 = 0; i5 < list2.size(); i5++) {
                this.zza.zzb(list2.get(i5).intValue());
            }
            return;
        }
        for (int i6 = 0; i6 < list2.size(); i6++) {
            this.zza.zzc(i2, list2.get(i6).intValue());
        }
    }

    public final void zzk(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = i;
        List<Integer> list2 = list;
        if (z) {
            this.zza.zza(i2, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list2.size(); i4++) {
                i3 += zzgv.zzj(list2.get(i4).intValue());
            }
            this.zza.zzb(i3);
            for (int i5 = 0; i5 < list2.size(); i5++) {
                this.zza.zzd(list2.get(i5).intValue());
            }
            return;
        }
        for (int i6 = 0; i6 < list2.size(); i6++) {
            int intValue = list2.get(i6).intValue();
            int i7 = intValue;
            this.zza.zze(i2, intValue);
        }
    }

    public final void zzl(int i, List<Long> list, boolean z) throws IOException {
        int i2 = i;
        List<Long> list2 = list;
        if (z) {
            this.zza.zza(i2, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list2.size(); i4++) {
                i3 += zzgv.zzh(list2.get(i4).longValue());
            }
            this.zza.zzb(i3);
            for (int i5 = 0; i5 < list2.size(); i5++) {
                this.zza.zzc(list2.get(i5).longValue());
            }
            return;
        }
        for (int i6 = 0; i6 < list2.size(); i6++) {
            long longValue = list2.get(i6).longValue();
            long j = longValue;
            this.zza.zzc(i2, longValue);
        }
    }

    public final void zzm(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = i;
        List<Integer> list2 = list;
        if (z) {
            this.zza.zza(i2, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list2.size(); i4++) {
                i3 += zzgv.zzh(list2.get(i4).intValue());
            }
            this.zza.zzb(i3);
            for (int i5 = 0; i5 < list2.size(); i5++) {
                this.zza.zzc(list2.get(i5).intValue());
            }
            return;
        }
        for (int i6 = 0; i6 < list2.size(); i6++) {
            this.zza.zzd(i2, list2.get(i6).intValue());
        }
    }

    public final void zzn(int i, List<Long> list, boolean z) throws IOException {
        int i2 = i;
        List<Long> list2 = list;
        if (z) {
            this.zza.zza(i2, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list2.size(); i4++) {
                i3 += zzgv.zzf(list2.get(i4).longValue());
            }
            this.zza.zzb(i3);
            for (int i5 = 0; i5 < list2.size(); i5++) {
                this.zza.zzb(list2.get(i5).longValue());
            }
            return;
        }
        for (int i6 = 0; i6 < list2.size(); i6++) {
            this.zza.zzb(i2, list2.get(i6).longValue());
        }
    }

    public final void zza(int i, List<?> list, zzji zzji) throws IOException {
        int i2 = i;
        List<?> list2 = list;
        zzji zzji2 = zzji;
        for (int i3 = 0; i3 < list2.size(); i3++) {
            zza(i2, (Object) list2.get(i3), zzji2);
        }
    }

    public final void zzb(int i, List<?> list, zzji zzji) throws IOException {
        int i2 = i;
        List<?> list2 = list;
        zzji zzji2 = zzji;
        for (int i3 = 0; i3 < list2.size(); i3++) {
            zzb(i2, (Object) list2.get(i3), zzji2);
        }
    }

    public final <K, V> void zza(int i, zzin<K, V> zzin, Map<K, V> map) throws IOException {
        int i2 = i;
        zzin<K, V> zzin2 = zzin;
        for (Map.Entry next : map.entrySet()) {
            this.zza.zza(i2, 2);
            this.zza.zzb(zzik.zza(zzin2, next.getKey(), next.getValue()));
            zzik.zza(this.zza, zzin2, next.getKey(), next.getValue());
        }
    }
}
