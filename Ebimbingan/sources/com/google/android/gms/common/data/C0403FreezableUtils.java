package com.google.android.gms.common.data;

import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.data.FreezableUtils */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C0403FreezableUtils {
    public C0403FreezableUtils() {
    }

    @RecentlyNonNull
    public static <T, E extends C0402Freezable<T>> ArrayList<T> freeze(@RecentlyNonNull ArrayList<E> arrayList) {
        ArrayList arrayList2;
        ArrayList<E> arrayList3 = arrayList;
        new ArrayList<>(arrayList3.size());
        int size = arrayList3.size();
        for (int i = 0; i < size; i++) {
            boolean add = arrayList2.add(((C0402Freezable) arrayList3.get(i)).freeze());
        }
        return arrayList2;
    }

    @RecentlyNonNull
    public static <T, E extends C0402Freezable<T>> ArrayList<T> freezeIterable(@RecentlyNonNull Iterable<E> iterable) {
        ArrayList arrayList;
        new ArrayList<>();
        for (E freeze : iterable) {
            boolean add = arrayList.add(freeze.freeze());
        }
        return arrayList;
    }

    @RecentlyNonNull
    public static <T, E extends C0402Freezable<T>> ArrayList<T> freeze(@RecentlyNonNull E[] eArr) {
        ArrayList arrayList;
        E[] eArr2 = eArr;
        new ArrayList<>(eArr2.length);
        for (int i = 0; i < eArr2.length; i++) {
            boolean add = arrayList.add(eArr2[i].freeze());
        }
        return arrayList;
    }
}
