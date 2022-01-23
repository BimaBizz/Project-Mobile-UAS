package com.google.android.gms.common.util;

import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class CollectionUtils {
    private CollectionUtils() {
    }

    @KeepForSdk
    public static boolean isEmpty(@Nullable Collection<?> collection) {
        Collection<?> collection2 = collection;
        if (collection2 == null) {
            return true;
        }
        return collection2.isEmpty();
    }

    @RecentlyNonNull
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf() {
        return Collections.emptyList();
    }

    @RecentlyNonNull
    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(@RecentlyNonNull K k, @RecentlyNonNull V v, @RecentlyNonNull K k2, @RecentlyNonNull V v2, @RecentlyNonNull K k3, @RecentlyNonNull V v3) {
        Map zzb = zzb(3, false);
        Object put = zzb.put(k, v);
        Object put2 = zzb.put(k2, v2);
        Object put3 = zzb.put(k3, v3);
        return Collections.unmodifiableMap(zzb);
    }

    @RecentlyNonNull
    @KeepForSdk
    public static <K, V> Map<K, V> mapOfKeyValueArrays(@RecentlyNonNull K[] kArr, @RecentlyNonNull V[] vArr) {
        Throwable th;
        StringBuilder sb;
        K[] kArr2 = kArr;
        V[] vArr2 = vArr;
        int length = kArr2.length;
        int length2 = vArr2.length;
        if (length == length2) {
            switch (length) {
                case 0:
                    return Collections.emptyMap();
                case 1:
                    return Collections.singletonMap(kArr2[0], vArr2[0]);
                default:
                    Map zzb = zzb(length, false);
                    for (int i = 0; i < kArr2.length; i++) {
                        Object put = zzb.put(kArr2[i], vArr2[i]);
                    }
                    return Collections.unmodifiableMap(zzb);
            }
        } else {
            new StringBuilder(66);
            StringBuilder append = sb.append("Key and values array lengths not equal: ");
            StringBuilder append2 = sb.append(length);
            StringBuilder append3 = sb.append(" != ");
            StringBuilder append4 = sb.append(length2);
            new IllegalArgumentException(sb.toString());
            throw th;
        }
    }

    @RecentlyNonNull
    @KeepForSdk
    public static <T> Set<T> mutableSetOfWithSize(int i) {
        Set<T> zza;
        int i2 = i;
        if (i2 == 0) {
            new ArraySet();
        } else {
            zza = zza(i2, true);
        }
        return zza;
    }

    @RecentlyNonNull
    @KeepForSdk
    @Deprecated
    public static <T> Set<T> setOf(@RecentlyNonNull T t, @RecentlyNonNull T t2, @RecentlyNonNull T t3) {
        Set zza = zza(3, false);
        boolean add = zza.add(t);
        boolean add2 = zza.add(t2);
        boolean add3 = zza.add(t3);
        return Collections.unmodifiableSet(zza);
    }

    private static <T> Set<T> zza(int i, boolean z) {
        float f;
        int i2;
        Set<T> set;
        Set<T> set2;
        Set<T> set3;
        int i3 = i;
        boolean z2 = z;
        if (true != z2) {
            f = 1.0f;
        } else {
            f = 0.75f;
        }
        if (true != z2) {
            i2 = 256;
        } else {
            i2 = 128;
        }
        if (i3 <= i2) {
            new ArraySet(i3);
            set2 = set3;
        } else {
            new HashSet(i3, f);
            set2 = set;
        }
        return set2;
    }

    private static <K, V> Map<K, V> zzb(int i, boolean z) {
        Map<K, V> map;
        Map<K, V> map2;
        Map<K, V> map3;
        int i2 = i;
        boolean z2 = z;
        if (i2 <= 256) {
            new ArrayMap(i2);
            map2 = map3;
        } else {
            new HashMap(i2, 1.0f);
            map2 = map;
        }
        return map2;
    }

    @RecentlyNonNull
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf(@RecentlyNonNull T t) {
        return Collections.singletonList(t);
    }

    @RecentlyNonNull
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf(@RecentlyNonNull T... tArr) {
        T[] tArr2 = tArr;
        switch (tArr2.length) {
            case 0:
                return listOf();
            case 1:
                return listOf(tArr2[0]);
            default:
                return Collections.unmodifiableList(Arrays.asList(tArr2));
        }
    }

    @RecentlyNonNull
    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(@RecentlyNonNull K k, @RecentlyNonNull V v, @RecentlyNonNull K k2, @RecentlyNonNull V v2, @RecentlyNonNull K k3, @RecentlyNonNull V v3, @RecentlyNonNull K k4, @RecentlyNonNull V v4, @RecentlyNonNull K k5, @RecentlyNonNull V v5, @RecentlyNonNull K k6, @RecentlyNonNull V v6) {
        Map zzb = zzb(6, false);
        Object put = zzb.put(k, v);
        Object put2 = zzb.put(k2, v2);
        Object put3 = zzb.put(k3, v3);
        Object put4 = zzb.put(k4, v4);
        Object put5 = zzb.put(k5, v5);
        Object put6 = zzb.put(k6, v6);
        return Collections.unmodifiableMap(zzb);
    }

    @RecentlyNonNull
    @KeepForSdk
    @Deprecated
    public static <T> Set<T> setOf(@RecentlyNonNull T... tArr) {
        T[] tArr2 = tArr;
        int length = tArr2.length;
        switch (length) {
            case 0:
                return Collections.emptySet();
            case 1:
                return Collections.singleton(tArr2[0]);
            case 2:
                T t = tArr2[0];
                T t2 = tArr2[1];
                Set zza = zza(2, false);
                boolean add = zza.add(t);
                boolean add2 = zza.add(t2);
                return Collections.unmodifiableSet(zza);
            case 3:
                return setOf(tArr2[0], tArr2[1], tArr2[2]);
            case 4:
                T t3 = tArr2[0];
                T t4 = tArr2[1];
                T t5 = tArr2[2];
                T t6 = tArr2[3];
                Set zza2 = zza(4, false);
                boolean add3 = zza2.add(t3);
                boolean add4 = zza2.add(t4);
                boolean add5 = zza2.add(t5);
                boolean add6 = zza2.add(t6);
                return Collections.unmodifiableSet(zza2);
            default:
                Set zza3 = zza(length, false);
                boolean addAll = Collections.addAll(zza3, tArr2);
                return Collections.unmodifiableSet(zza3);
        }
    }
}
