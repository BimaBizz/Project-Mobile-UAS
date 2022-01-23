package com.google.android.gms.internal.firebase_auth;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class zzay<E> extends zzav<E> implements List<E>, RandomAccess {
    private static final zzbj<Object> zzgv;

    public static <E> zzay<E> zzce() {
        return zzbb.zzhb;
    }

    public static <E> zzay<E> zza(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8) {
        zzay<E> zzay;
        Throwable th;
        StringBuilder sb;
        Object[] objArr = new Object[8];
        objArr[0] = e;
        Object[] objArr2 = objArr;
        objArr2[1] = e2;
        Object[] objArr3 = objArr2;
        objArr3[2] = e3;
        Object[] objArr4 = objArr3;
        objArr4[3] = e4;
        Object[] objArr5 = objArr4;
        objArr5[4] = e5;
        Object[] objArr6 = objArr5;
        objArr6[5] = e6;
        Object[] objArr7 = objArr6;
        objArr7[6] = e7;
        Object[] objArr8 = objArr7;
        objArr8[7] = e8;
        Object[] objArr9 = objArr8;
        for (int i = 0; i < 8; i++) {
            int i2 = i;
            if (objArr9[i] == null) {
                Throwable th2 = th;
                new StringBuilder(20);
                new NullPointerException(sb.append("at index ").append(i2).toString());
                throw th2;
            }
        }
        new zzbb(objArr9, 8);
        return zzay;
    }

    static <E> zzay<E> zza(Object[] objArr) {
        zzay<E> zzay;
        Object[] objArr2 = objArr;
        int length = objArr2.length;
        Object[] objArr3 = objArr2;
        if (length == 0) {
            return zzbb.zzhb;
        }
        new zzbb(objArr3, length);
        return zzay;
    }

    zzay() {
    }

    public final zzbk<E> zzbz() {
        return (zzbj) listIterator();
    }

    public int indexOf(@NullableDecl Object obj) {
        Object obj2 = obj;
        if (obj2 == null) {
            return -1;
        }
        Object obj3 = obj2;
        if (this instanceof RandomAccess) {
            Object obj4 = obj3;
            int size = size();
            if (obj4 == null) {
                for (int i = 0; i < size; i++) {
                    if (get(i) == null) {
                        return i;
                    }
                }
            } else {
                for (int i2 = 0; i2 < size; i2++) {
                    if (obj4.equals(get(i2))) {
                        return i2;
                    }
                }
            }
            return -1;
        }
        ListIterator listIterator = listIterator();
        while (listIterator.hasNext()) {
            if (zzak.equal(obj3, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    public int lastIndexOf(@NullableDecl Object obj) {
        Object obj2 = obj;
        if (obj2 == null) {
            return -1;
        }
        Object obj3 = obj2;
        if (this instanceof RandomAccess) {
            Object obj4 = obj3;
            if (obj4 == null) {
                for (int size = size() - 1; size >= 0; size--) {
                    if (get(size) == null) {
                        return size;
                    }
                }
            } else {
                for (int size2 = size() - 1; size2 >= 0; size2--) {
                    if (obj4.equals(get(size2))) {
                        return size2;
                    }
                }
            }
            return -1;
        }
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (zzak.equal(obj3, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public boolean contains(@NullableDecl Object obj) {
        return indexOf(obj) >= 0;
    }

    /* renamed from: zzc */
    public zzay<E> subList(int i, int i2) {
        zzay<E> zzay;
        int i3 = i;
        int i4 = i2;
        zzaj.zza(i3, i4, size());
        int i5 = i4 - i3;
        int i6 = i5;
        if (i5 == size()) {
            return this;
        } else if (i6 == 0) {
            return zzbb.zzhb;
        } else {
            int i7 = i3;
            new zzba(this, i7, i4 - i7);
            return zzay;
        }
    }

    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        Throwable th;
        int i2 = i;
        Collection<? extends E> collection2 = collection;
        Throwable th2 = th;
        new UnsupportedOperationException();
        throw th2;
    }

    @Deprecated
    public final E set(int i, E e) {
        Throwable th;
        int i2 = i;
        E e2 = e;
        Throwable th2 = th;
        new UnsupportedOperationException();
        throw th2;
    }

    @Deprecated
    public final void add(int i, E e) {
        Throwable th;
        int i2 = i;
        E e2 = e;
        Throwable th2 = th;
        new UnsupportedOperationException();
        throw th2;
    }

    @Deprecated
    public final E remove(int i) {
        Throwable th;
        int i2 = i;
        Throwable th2 = th;
        new UnsupportedOperationException();
        throw th2;
    }

    public final zzay<E> zzcd() {
        return this;
    }

    /* access modifiers changed from: package-private */
    public int zza(Object[] objArr, int i) {
        Object[] objArr2 = objArr;
        int i2 = i;
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr2[i2 + i3] = get(i3);
        }
        return i2 + size;
    }

    public boolean equals(@NullableDecl Object obj) {
        Object obj2 = obj;
        if (obj2 == zzaj.checkNotNull(this)) {
            return true;
        }
        if (obj2 instanceof List) {
            List list = (List) obj2;
            int size = size();
            int i = size;
            if (size == list.size()) {
                if (!(this instanceof RandomAccess) || !(list instanceof RandomAccess)) {
                    zzay zzay = this;
                    zzay zzay2 = zzay;
                    int size2 = zzay.size();
                    int i2 = 0;
                    Iterator it = list.iterator();
                    while (true) {
                        if (i2 < size2) {
                            if (!it.hasNext()) {
                                break;
                            }
                            i2++;
                            if (!zzak.equal(zzay2.get(i2), it.next())) {
                                break;
                            }
                        } else if (!it.hasNext()) {
                            return true;
                        }
                    }
                } else {
                    int i3 = 0;
                    while (i3 < i) {
                        if (zzak.equal(get(i3), list.get(i3))) {
                            i3++;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 1;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            i = (((i * 31) + get(i2).hashCode()) ^ -1) ^ -1;
        }
        return i;
    }

    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public /* synthetic */ ListIterator listIterator(int i) {
        ListIterator listIterator;
        int i2 = i;
        int zzb = zzaj.zzb(i2, size());
        if (isEmpty()) {
            return zzgv;
        }
        new zzax(this, i2);
        return listIterator;
    }

    public /* synthetic */ ListIterator listIterator() {
        return (zzbj) listIterator(0);
    }

    static {
        zzbj<Object> zzbj;
        new zzax(zzbb.zzhb, 0);
        zzgv = zzbj;
    }
}
