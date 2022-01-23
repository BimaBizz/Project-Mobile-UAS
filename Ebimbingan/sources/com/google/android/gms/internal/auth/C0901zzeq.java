package com.google.android.gms.internal.auth;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.auth.zzeq */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public abstract class C0901zzeq<E> extends C0902zzer<E> implements List<E>, RandomAccess {
    private static final C0927zzfp<Object> zza;

    public static <E> C0901zzeq<E> zza() {
        return C0917zzff.zza;
    }

    public static <E> C0901zzeq<E> zza(E e) {
        Object[] objArr = {e};
        for (int i = 0; i <= 0; i++) {
            Object zza2 = C0914zzfc.zza(objArr[0], 0);
        }
        return zza(objArr, 1);
    }

    static <E> C0901zzeq<E> zza(Object[] objArr) {
        Object[] objArr2 = objArr;
        return zza(objArr2, objArr2.length);
    }

    static <E> C0901zzeq<E> zza(Object[] objArr, int i) {
        C0901zzeq<E> zzeq;
        Object[] objArr2 = objArr;
        int i2 = i;
        if (i2 == 0) {
            return C0917zzff.zza;
        }
        new C0917zzff(objArr2, i2);
        return zzeq;
    }

    C0901zzeq() {
    }

    public final C0924zzfm<E> zzb() {
        return (C0927zzfp) listIterator();
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
            if (C0872zzdo.zza(obj3, listIterator.next())) {
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
            if (C0872zzdo.zza(obj3, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public boolean contains(@NullableDecl Object obj) {
        return indexOf(obj) >= 0;
    }

    /* renamed from: zza */
    public C0901zzeq<E> subList(int i, int i2) {
        C0901zzeq<E> zzeq;
        int i3 = i;
        int i4 = i2;
        C0874zzdq.zza(i3, i4, size());
        int i5 = i4 - i3;
        int i6 = i5;
        if (i5 == size()) {
            return this;
        } else if (i6 == 0) {
            return C0917zzff.zza;
        } else {
            int i7 = i3;
            new C0903zzes(this, i7, i4 - i7);
            return zzeq;
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

    public final C0901zzeq<E> zzc() {
        return this;
    }

    /* access modifiers changed from: package-private */
    public int zzb(Object[] objArr, int i) {
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
        if (obj2 == C0874zzdq.zza(this)) {
            return true;
        }
        if (obj2 instanceof List) {
            List list = (List) obj2;
            int size = size();
            int i = size;
            if (size == list.size()) {
                if (!(this instanceof RandomAccess) || !(list instanceof RandomAccess)) {
                    C0901zzeq zzeq = this;
                    C0901zzeq zzeq2 = zzeq;
                    int size2 = zzeq.size();
                    int i2 = 0;
                    Iterator it = list.iterator();
                    while (true) {
                        if (i2 < size2) {
                            if (!it.hasNext()) {
                                break;
                            }
                            i2++;
                            if (!C0872zzdo.zza(zzeq2.get(i2), it.next())) {
                                break;
                            }
                        } else if (!it.hasNext()) {
                            return true;
                        }
                    }
                } else {
                    int i3 = 0;
                    while (i3 < i) {
                        if (C0872zzdo.zza(get(i3), list.get(i3))) {
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
        int zzb = C0874zzdq.zzb(i2, size());
        if (isEmpty()) {
            return zza;
        }
        new C0904zzet(this, i2);
        return listIterator;
    }

    public /* synthetic */ ListIterator listIterator() {
        return (C0927zzfp) listIterator(0);
    }

    static {
        C0927zzfp<Object> zzfp;
        new C0904zzet(C0917zzff.zza, 0);
        zza = zzfp;
    }
}
