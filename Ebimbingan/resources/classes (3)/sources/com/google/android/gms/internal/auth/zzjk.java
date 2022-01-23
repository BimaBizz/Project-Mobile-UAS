package com.google.android.gms.internal.auth;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzjk {
    private static final Class<?> zza = zzd();
    private static final zzka<?, ?> zzb = zza(false);
    private static final zzka<?, ?> zzc = zza(true);
    private static final zzka<?, ?> zzd;

    public static void zza(Class<?> cls) {
        Throwable th;
        Class<?> cls2 = cls;
        if (!zzhm.class.isAssignableFrom(cls2) && zza != null && !zza.isAssignableFrom(cls2)) {
            Throwable th2 = th;
            new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            throw th2;
        }
    }

    public static void zza(int i, List<Double> list, zzkx zzkx, boolean z) throws IOException {
        int i2 = i;
        List<Double> list2 = list;
        zzkx zzkx2 = zzkx;
        boolean z2 = z;
        if (list2 != null && !list2.isEmpty()) {
            zzkx2.zzg(i2, list2, z2);
        }
    }

    public static void zzb(int i, List<Float> list, zzkx zzkx, boolean z) throws IOException {
        int i2 = i;
        List<Float> list2 = list;
        zzkx zzkx2 = zzkx;
        boolean z2 = z;
        if (list2 != null && !list2.isEmpty()) {
            zzkx2.zzf(i2, list2, z2);
        }
    }

    public static void zzc(int i, List<Long> list, zzkx zzkx, boolean z) throws IOException {
        int i2 = i;
        List<Long> list2 = list;
        zzkx zzkx2 = zzkx;
        boolean z2 = z;
        if (list2 != null && !list2.isEmpty()) {
            zzkx2.zzc(i2, list2, z2);
        }
    }

    public static void zzd(int i, List<Long> list, zzkx zzkx, boolean z) throws IOException {
        int i2 = i;
        List<Long> list2 = list;
        zzkx zzkx2 = zzkx;
        boolean z2 = z;
        if (list2 != null && !list2.isEmpty()) {
            zzkx2.zzd(i2, list2, z2);
        }
    }

    public static void zze(int i, List<Long> list, zzkx zzkx, boolean z) throws IOException {
        int i2 = i;
        List<Long> list2 = list;
        zzkx zzkx2 = zzkx;
        boolean z2 = z;
        if (list2 != null && !list2.isEmpty()) {
            zzkx2.zzn(i2, list2, z2);
        }
    }

    public static void zzf(int i, List<Long> list, zzkx zzkx, boolean z) throws IOException {
        int i2 = i;
        List<Long> list2 = list;
        zzkx zzkx2 = zzkx;
        boolean z2 = z;
        if (list2 != null && !list2.isEmpty()) {
            zzkx2.zze(i2, list2, z2);
        }
    }

    public static void zzg(int i, List<Long> list, zzkx zzkx, boolean z) throws IOException {
        int i2 = i;
        List<Long> list2 = list;
        zzkx zzkx2 = zzkx;
        boolean z2 = z;
        if (list2 != null && !list2.isEmpty()) {
            zzkx2.zzl(i2, list2, z2);
        }
    }

    public static void zzh(int i, List<Integer> list, zzkx zzkx, boolean z) throws IOException {
        int i2 = i;
        List<Integer> list2 = list;
        zzkx zzkx2 = zzkx;
        boolean z2 = z;
        if (list2 != null && !list2.isEmpty()) {
            zzkx2.zza(i2, list2, z2);
        }
    }

    public static void zzi(int i, List<Integer> list, zzkx zzkx, boolean z) throws IOException {
        int i2 = i;
        List<Integer> list2 = list;
        zzkx zzkx2 = zzkx;
        boolean z2 = z;
        if (list2 != null && !list2.isEmpty()) {
            zzkx2.zzj(i2, list2, z2);
        }
    }

    public static void zzj(int i, List<Integer> list, zzkx zzkx, boolean z) throws IOException {
        int i2 = i;
        List<Integer> list2 = list;
        zzkx zzkx2 = zzkx;
        boolean z2 = z;
        if (list2 != null && !list2.isEmpty()) {
            zzkx2.zzm(i2, list2, z2);
        }
    }

    public static void zzk(int i, List<Integer> list, zzkx zzkx, boolean z) throws IOException {
        int i2 = i;
        List<Integer> list2 = list;
        zzkx zzkx2 = zzkx;
        boolean z2 = z;
        if (list2 != null && !list2.isEmpty()) {
            zzkx2.zzb(i2, list2, z2);
        }
    }

    public static void zzl(int i, List<Integer> list, zzkx zzkx, boolean z) throws IOException {
        int i2 = i;
        List<Integer> list2 = list;
        zzkx zzkx2 = zzkx;
        boolean z2 = z;
        if (list2 != null && !list2.isEmpty()) {
            zzkx2.zzk(i2, list2, z2);
        }
    }

    public static void zzm(int i, List<Integer> list, zzkx zzkx, boolean z) throws IOException {
        int i2 = i;
        List<Integer> list2 = list;
        zzkx zzkx2 = zzkx;
        boolean z2 = z;
        if (list2 != null && !list2.isEmpty()) {
            zzkx2.zzh(i2, list2, z2);
        }
    }

    public static void zzn(int i, List<Boolean> list, zzkx zzkx, boolean z) throws IOException {
        int i2 = i;
        List<Boolean> list2 = list;
        zzkx zzkx2 = zzkx;
        boolean z2 = z;
        if (list2 != null && !list2.isEmpty()) {
            zzkx2.zzi(i2, list2, z2);
        }
    }

    public static void zza(int i, List<String> list, zzkx zzkx) throws IOException {
        int i2 = i;
        List<String> list2 = list;
        zzkx zzkx2 = zzkx;
        if (list2 != null && !list2.isEmpty()) {
            zzkx2.zza(i2, list2);
        }
    }

    public static void zzb(int i, List<zzgi> list, zzkx zzkx) throws IOException {
        int i2 = i;
        List<zzgi> list2 = list;
        zzkx zzkx2 = zzkx;
        if (list2 != null && !list2.isEmpty()) {
            zzkx2.zzb(i2, list2);
        }
    }

    public static void zza(int i, List<?> list, zzkx zzkx, zzji zzji) throws IOException {
        int i2 = i;
        List<?> list2 = list;
        zzkx zzkx2 = zzkx;
        zzji zzji2 = zzji;
        if (list2 != null && !list2.isEmpty()) {
            zzkx2.zza(i2, list2, zzji2);
        }
    }

    public static void zzb(int i, List<?> list, zzkx zzkx, zzji zzji) throws IOException {
        int i2 = i;
        List<?> list2 = list;
        zzkx zzkx2 = zzkx;
        zzji zzji2 = zzji;
        if (list2 != null && !list2.isEmpty()) {
            zzkx2.zzb(i2, list2, zzji2);
        }
    }

    static int zza(List<Long> list) {
        List<Long> list2 = list;
        int size = list2.size();
        int i = size;
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        if (list2 instanceof zzig) {
            zzig zzig = (zzig) list2;
            for (int i3 = 0; i3 < i; i3++) {
                i2 += zzgv.zzd(zzig.zzb(i3));
            }
        } else {
            for (int i4 = 0; i4 < i; i4++) {
                i2 += zzgv.zzd(list2.get(i4).longValue());
            }
        }
        return i2;
    }

    static int zza(int i, List<Long> list, boolean z) {
        int i2 = i;
        List<Long> list2 = list;
        boolean z2 = z;
        if (list2.size() == 0) {
            return 0;
        }
        return zza(list2) + (list2.size() * zzgv.zze(i2));
    }

    static int zzb(List<Long> list) {
        List<Long> list2 = list;
        int size = list2.size();
        int i = size;
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        if (list2 instanceof zzig) {
            zzig zzig = (zzig) list2;
            for (int i3 = 0; i3 < i; i3++) {
                i2 += zzgv.zze(zzig.zzb(i3));
            }
        } else {
            for (int i4 = 0; i4 < i; i4++) {
                i2 += zzgv.zze(list2.get(i4).longValue());
            }
        }
        return i2;
    }

    static int zzb(int i, List<Long> list, boolean z) {
        int i2 = i;
        List<Long> list2 = list;
        boolean z2 = z;
        int size = list2.size();
        int i3 = size;
        if (size == 0) {
            return 0;
        }
        return zzb(list2) + (i3 * zzgv.zze(i2));
    }

    static int zzc(List<Long> list) {
        List<Long> list2 = list;
        int size = list2.size();
        int i = size;
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        if (list2 instanceof zzig) {
            zzig zzig = (zzig) list2;
            for (int i3 = 0; i3 < i; i3++) {
                i2 += zzgv.zzf(zzig.zzb(i3));
            }
        } else {
            for (int i4 = 0; i4 < i; i4++) {
                i2 += zzgv.zzf(list2.get(i4).longValue());
            }
        }
        return i2;
    }

    static int zzc(int i, List<Long> list, boolean z) {
        int i2 = i;
        List<Long> list2 = list;
        boolean z2 = z;
        int size = list2.size();
        int i3 = size;
        if (size == 0) {
            return 0;
        }
        return zzc(list2) + (i3 * zzgv.zze(i2));
    }

    static int zzd(List<Integer> list) {
        List<Integer> list2 = list;
        int size = list2.size();
        int i = size;
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        if (list2 instanceof zzhp) {
            zzhp zzhp = (zzhp) list2;
            for (int i3 = 0; i3 < i; i3++) {
                i2 += zzgv.zzk(zzhp.zzb(i3));
            }
        } else {
            for (int i4 = 0; i4 < i; i4++) {
                i2 += zzgv.zzk(list2.get(i4).intValue());
            }
        }
        return i2;
    }

    static int zzd(int i, List<Integer> list, boolean z) {
        int i2 = i;
        List<Integer> list2 = list;
        boolean z2 = z;
        int size = list2.size();
        int i3 = size;
        if (size == 0) {
            return 0;
        }
        return zzd(list2) + (i3 * zzgv.zze(i2));
    }

    static int zze(List<Integer> list) {
        List<Integer> list2 = list;
        int size = list2.size();
        int i = size;
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        if (list2 instanceof zzhp) {
            zzhp zzhp = (zzhp) list2;
            for (int i3 = 0; i3 < i; i3++) {
                i2 += zzgv.zzf(zzhp.zzb(i3));
            }
        } else {
            for (int i4 = 0; i4 < i; i4++) {
                i2 += zzgv.zzf(list2.get(i4).intValue());
            }
        }
        return i2;
    }

    static int zze(int i, List<Integer> list, boolean z) {
        int i2 = i;
        List<Integer> list2 = list;
        boolean z2 = z;
        int size = list2.size();
        int i3 = size;
        if (size == 0) {
            return 0;
        }
        return zze(list2) + (i3 * zzgv.zze(i2));
    }

    static int zzf(List<Integer> list) {
        List<Integer> list2 = list;
        int size = list2.size();
        int i = size;
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        if (list2 instanceof zzhp) {
            zzhp zzhp = (zzhp) list2;
            for (int i3 = 0; i3 < i; i3++) {
                i2 += zzgv.zzg(zzhp.zzb(i3));
            }
        } else {
            for (int i4 = 0; i4 < i; i4++) {
                i2 += zzgv.zzg(list2.get(i4).intValue());
            }
        }
        return i2;
    }

    static int zzf(int i, List<Integer> list, boolean z) {
        int i2 = i;
        List<Integer> list2 = list;
        boolean z2 = z;
        int size = list2.size();
        int i3 = size;
        if (size == 0) {
            return 0;
        }
        return zzf(list2) + (i3 * zzgv.zze(i2));
    }

    static int zzg(List<Integer> list) {
        List<Integer> list2 = list;
        int size = list2.size();
        int i = size;
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        if (list2 instanceof zzhp) {
            zzhp zzhp = (zzhp) list2;
            for (int i3 = 0; i3 < i; i3++) {
                i2 += zzgv.zzh(zzhp.zzb(i3));
            }
        } else {
            for (int i4 = 0; i4 < i; i4++) {
                i2 += zzgv.zzh(list2.get(i4).intValue());
            }
        }
        return i2;
    }

    static int zzg(int i, List<Integer> list, boolean z) {
        int i2 = i;
        List<Integer> list2 = list;
        boolean z2 = z;
        int size = list2.size();
        int i3 = size;
        if (size == 0) {
            return 0;
        }
        return zzg(list2) + (i3 * zzgv.zze(i2));
    }

    static int zzh(List<?> list) {
        return list.size() << 2;
    }

    static int zzh(int i, List<?> list, boolean z) {
        int i2 = i;
        boolean z2 = z;
        int size = list.size();
        int i3 = size;
        if (size == 0) {
            return 0;
        }
        return i3 * zzgv.zzi(i2, 0);
    }

    static int zzi(List<?> list) {
        return list.size() << 3;
    }

    static int zzi(int i, List<?> list, boolean z) {
        int i2 = i;
        boolean z2 = z;
        int size = list.size();
        int i3 = size;
        if (size == 0) {
            return 0;
        }
        return i3 * zzgv.zzg(i2, 0);
    }

    static int zzj(List<?> list) {
        return list.size();
    }

    static int zzj(int i, List<?> list, boolean z) {
        int i2 = i;
        boolean z2 = z;
        int size = list.size();
        int i3 = size;
        if (size == 0) {
            return 0;
        }
        return i3 * zzgv.zzb(i2, true);
    }

    static int zza(int i, List<?> list) {
        int i2;
        int zzb2;
        int i3;
        int zzb3;
        int i4 = i;
        List<?> list2 = list;
        int size = list2.size();
        int i5 = size;
        if (size == 0) {
            return 0;
        }
        int zze = i5 * zzgv.zze(i4);
        if (list2 instanceof zzid) {
            zzid zzid = (zzid) list2;
            for (int i6 = 0; i6 < i5; i6++) {
                Object zzb4 = zzid.zzb(i6);
                Object obj = zzb4;
                if (zzb4 instanceof zzgi) {
                    i3 = zze;
                    zzb3 = zzgv.zzb((zzgi) obj);
                } else {
                    i3 = zze;
                    zzb3 = zzgv.zzb((String) obj);
                }
                zze = i3 + zzb3;
            }
        } else {
            for (int i7 = 0; i7 < i5; i7++) {
                Object obj2 = list2.get(i7);
                Object obj3 = obj2;
                if (obj2 instanceof zzgi) {
                    i2 = zze;
                    zzb2 = zzgv.zzb((zzgi) obj3);
                } else {
                    i2 = zze;
                    zzb2 = zzgv.zzb((String) obj3);
                }
                zze = i2 + zzb2;
            }
        }
        return zze;
    }

    static int zza(int i, Object obj, zzji zzji) {
        int i2 = i;
        Object obj2 = obj;
        zzji zzji2 = zzji;
        if (obj2 instanceof zzib) {
            return zzgv.zza(i2, (zzib) obj2);
        }
        return zzgv.zzb(i2, (zzis) obj2, zzji2);
    }

    static int zza(int i, List<?> list, zzji zzji) {
        int i2;
        int zza2;
        int i3 = i;
        List<?> list2 = list;
        zzji zzji2 = zzji;
        int size = list2.size();
        int i4 = size;
        if (size == 0) {
            return 0;
        }
        int zze = i4 * zzgv.zze(i3);
        for (int i5 = 0; i5 < i4; i5++) {
            Object obj = list2.get(i5);
            Object obj2 = obj;
            if (obj instanceof zzib) {
                i2 = zze;
                zza2 = zzgv.zza((zzib) obj2);
            } else {
                i2 = zze;
                zza2 = zzgv.zza((zzis) obj2, zzji2);
            }
            zze = i2 + zza2;
        }
        return zze;
    }

    static int zzb(int i, List<zzgi> list) {
        int i2 = i;
        List<zzgi> list2 = list;
        int size = list2.size();
        int i3 = size;
        if (size == 0) {
            return 0;
        }
        int zze = i3 * zzgv.zze(i2);
        for (int i4 = 0; i4 < list2.size(); i4++) {
            zze += zzgv.zzb(list2.get(i4));
        }
        return zze;
    }

    static int zzb(int i, List<zzis> list, zzji zzji) {
        int i2 = i;
        List<zzis> list2 = list;
        zzji zzji2 = zzji;
        int size = list2.size();
        int i3 = size;
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            i4 += zzgv.zzc(i2, list2.get(i5), zzji2);
        }
        return i4;
    }

    public static zzka<?, ?> zza() {
        return zzb;
    }

    public static zzka<?, ?> zzb() {
        return zzc;
    }

    public static zzka<?, ?> zzc() {
        return zzd;
    }

    private static zzka<?, ?> zza(boolean z) {
        boolean z2 = z;
        try {
            Class<?> zze = zze();
            Class<?> cls = zze;
            if (zze == null) {
                return null;
            }
            return (zzka) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z2)});
        } catch (Throwable th) {
            return null;
        }
    }

    private static Class<?> zzd() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable th) {
            return null;
        }
    }

    private static Class<?> zze() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable th) {
            return null;
        }
    }

    static boolean zza(Object obj, Object obj2) {
        Object obj3 = obj;
        Object obj4 = obj2;
        return obj3 == obj4 || (obj3 != null && obj3.equals(obj4));
    }

    static <T> void zza(zzip zzip, T t, T t2, long j) {
        T t3 = t;
        long j2 = j;
        zzkg.zza((Object) t3, j2, zzip.zza(zzkg.zzf(t3, j2), zzkg.zzf(t2, j2)));
    }

    static <T, FT extends zzhg<FT>> void zza(zzhd<FT> zzhd, T t, T t2) {
        zzhd<FT> zzhd2 = zzhd;
        T t3 = t;
        zzhe<FT> zza2 = zzhd2.zza((Object) t2);
        zzhe<FT> zzhe = zza2;
        if (!zza2.zza.isEmpty()) {
            zzhd2.zzb(t3).zza(zzhe);
        }
    }

    static <T, UT, UB> void zza(zzka<UT, UB> zzka, T t, T t2) {
        zzka<UT, UB> zzka2 = zzka;
        T t3 = t;
        zzka2.zza((Object) t3, zzka2.zzc(zzka2.zza(t3), zzka2.zza(t2)));
    }

    static <UT, UB> UB zza(int i, List<Integer> list, zzhq zzhq, UB ub, zzka<UT, UB> zzka) {
        int i2 = i;
        List<Integer> list2 = list;
        zzhq zzhq2 = zzhq;
        UB ub2 = ub;
        zzka<UT, UB> zzka2 = zzka;
        if (zzhq2 == null) {
            return ub2;
        }
        if (list2 instanceof RandomAccess) {
            int i3 = 0;
            int size = list2.size();
            for (int i4 = 0; i4 < size; i4++) {
                int intValue = list2.get(i4).intValue();
                if (zzhq2.zza(intValue)) {
                    if (i4 != i3) {
                        Integer num = list2.set(i3, Integer.valueOf(intValue));
                    }
                    i3++;
                } else {
                    ub2 = zza(i2, intValue, ub2, zzka2);
                }
            }
            if (i3 != size) {
                list2.subList(i3, size).clear();
            }
        } else {
            Iterator<Integer> it = list2.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzhq2.zza(intValue2)) {
                    ub2 = zza(i2, intValue2, ub2, zzka2);
                    it.remove();
                }
            }
        }
        return ub2;
    }

    private static <UT, UB> UB zza(int i, int i2, UB ub, zzka<UT, UB> zzka) {
        int i3 = i;
        int i4 = i2;
        UB ub2 = ub;
        zzka<UT, UB> zzka2 = zzka;
        if (ub2 == null) {
            ub2 = zzka2.zza();
        }
        zzka2.zza(ub2, i3, (long) i4);
        return ub2;
    }

    static {
        zzka<?, ?> zzka;
        new zzkc();
        zzd = zzka;
    }
}
