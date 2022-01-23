package com.google.android.gms.internal.common;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.common.zzu */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public abstract class C1127zzu<E> extends C1123zzq<E> implements List<E>, RandomAccess {
    private static final C1131zzy<Object> zza;

    static {
        C1131zzy<Object> zzy;
        new C1125zzs(C1129zzw.zza, 0);
        zza = zzy;
    }

    C1127zzu() {
    }

    public static <E> C1127zzu<E> zzi() {
        return C1129zzw.zza;
    }

    public static <E> C1127zzu<E> zzj(E e) {
        Object[] objArr = {e};
        Object[] zza2 = C1128zzv.zza(objArr, 1);
        return zzn(objArr, 1);
    }

    public static <E> C1127zzu<E> zzk(E e, E e2) {
        Object[] objArr = {e, e2};
        Object[] zza2 = C1128zzv.zza(objArr, 2);
        return zzn(objArr, 2);
    }

    public static <E> C1127zzu<E> zzl(Iterable<? extends E> iterable) {
        C1124zzr zzr;
        C1127zzu<Object> zzn;
        Iterable<? extends E> iterable2 = iterable;
        if (iterable2 != null) {
            if (iterable2 instanceof Collection) {
                zzn = zzm((Collection) iterable2);
            } else {
                Iterator<? extends E> it = iterable2.iterator();
                if (!it.hasNext()) {
                    zzn = C1129zzw.zza;
                } else {
                    Object next = it.next();
                    if (!it.hasNext()) {
                        zzn = zzj(next);
                    } else {
                        new C1124zzr(4);
                        C1124zzr zzb = zzr.zzb(next);
                        C1124zzr<? extends E> zzc = zzr.zzc(it);
                        zzr.zzc = true;
                        zzn = zzn(zzr.zza, zzr.zzb);
                    }
                }
            }
            return zzn;
        }
        throw null;
    }

    public static <E> C1127zzu<E> zzm(Collection<? extends E> collection) {
        Collection<? extends E> collection2 = collection;
        if (collection2 instanceof C1123zzq) {
            C1127zzu<E> zze = ((C1123zzq) collection2).zze();
            if (!zze.zzf()) {
                return zze;
            }
            Object[] array = zze.toArray();
            return zzn(array, array.length);
        }
        Object[] array2 = collection2.toArray();
        int length = array2.length;
        Object[] zza2 = C1128zzv.zza(array2, length);
        return zzn(array2, length);
    }

    static <E> C1127zzu<E> zzn(Object[] objArr, int i) {
        C1127zzu<E> zzu;
        Object[] objArr2 = objArr;
        int i2 = i;
        if (i2 == 0) {
            return C1129zzw.zza;
        }
        new C1129zzw(objArr2, i2);
        return zzu;
    }

    @Deprecated
    public final void add(int i, E e) {
        Throwable th;
        int i2 = i;
        E e2 = e;
        new UnsupportedOperationException();
        throw th;
    }

    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        Throwable th;
        int i2 = i;
        Collection<? extends E> collection2 = collection;
        new UnsupportedOperationException();
        throw th;
    }

    public final boolean contains(@NullableDecl Object obj) {
        return indexOf(obj) >= 0;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r8) {
        /*
            r7 = this;
            r0 = r7
            r1 = r8
            r4 = r1
            r5 = r0
            if (r4 != r5) goto L_0x000b
            r4 = 1
            r0 = r4
        L_0x0008:
            r4 = r0
            r0 = r4
            return r0
        L_0x000b:
            r4 = r1
            boolean r4 = r4 instanceof java.util.List
            if (r4 != 0) goto L_0x0013
            r4 = 0
            r0 = r4
            goto L_0x0008
        L_0x0013:
            r4 = r1
            java.util.List r4 = (java.util.List) r4
            r2 = r4
            r4 = r0
            int r4 = r4.size()
            r3 = r4
            r4 = r3
            r5 = r2
            int r5 = r5.size()
            if (r4 == r5) goto L_0x0028
            r4 = 0
            r0 = r4
            goto L_0x0008
        L_0x0028:
            r4 = r2
            boolean r4 = r4 instanceof java.util.RandomAccess
            if (r4 == 0) goto L_0x004e
            r4 = 0
            r1 = r4
        L_0x002f:
            r4 = r1
            r5 = r3
            if (r4 >= r5) goto L_0x004b
            r4 = r0
            r5 = r1
            java.lang.Object r4 = r4.get(r5)
            r5 = r2
            r6 = r1
            java.lang.Object r5 = r5.get(r6)
            boolean r4 = com.google.android.gms.internal.common.C1117zzk.zza(r4, r5)
            if (r4 != 0) goto L_0x0048
            r4 = 0
            r0 = r4
            goto L_0x0008
        L_0x0048:
            int r1 = r1 + 1
            goto L_0x002f
        L_0x004b:
            r4 = 1
            r0 = r4
            goto L_0x0008
        L_0x004e:
            r4 = r0
            java.util.Iterator r4 = r4.iterator()
            r0 = r4
            r4 = r2
            java.util.Iterator r4 = r4.iterator()
            r1 = r4
        L_0x005a:
            r4 = r0
            boolean r4 = r4.hasNext()
            if (r4 == 0) goto L_0x007e
            r4 = r1
            boolean r4 = r4.hasNext()
            if (r4 != 0) goto L_0x006b
            r4 = 0
            r0 = r4
            goto L_0x0008
        L_0x006b:
            r4 = r0
            java.lang.Object r4 = r4.next()
            r5 = r1
            java.lang.Object r5 = r5.next()
            boolean r4 = com.google.android.gms.internal.common.C1117zzk.zza(r4, r5)
            if (r4 != 0) goto L_0x005a
            r4 = 0
            r0 = r4
            goto L_0x0008
        L_0x007e:
            r4 = r1
            boolean r4 = r4.hasNext()
            if (r4 != 0) goto L_0x0088
            r4 = 1
            r0 = r4
            goto L_0x0008
        L_0x0088:
            r4 = 0
            r0 = r4
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.common.C1127zzu.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public final int indexOf(@NullableDecl Object obj) {
        int i;
        Object obj2 = obj;
        if (obj2 == null) {
            return -1;
        }
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i = -1;
                break;
            } else if (obj2.equals(get(i2))) {
                i = i2;
                break;
            } else {
                i2++;
            }
        }
        return i;
    }

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public final int lastIndexOf(@NullableDecl Object obj) {
        int i;
        Object obj2 = obj;
        if (obj2 == null) {
            return -1;
        }
        int size = size() - 1;
        while (true) {
            if (size < 0) {
                i = -1;
                break;
            } else if (obj2.equals(get(size))) {
                i = size;
                break;
            } else {
                size--;
            }
        }
        return i;
    }

    public final /* bridge */ /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Deprecated
    public final E remove(int i) {
        Throwable th;
        int i2 = i;
        new UnsupportedOperationException();
        throw th;
    }

    @Deprecated
    public final E set(int i, E e) {
        Throwable th;
        int i2 = i;
        E e2 = e;
        new UnsupportedOperationException();
        throw th;
    }

    public final C1130zzx<E> zza() {
        return listIterator(0);
    }

    public final C1127zzu<E> zze() {
        return this;
    }

    /* access modifiers changed from: package-private */
    public int zzg(Object[] objArr, int i) {
        Object[] objArr2 = objArr;
        int i2 = i;
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr2[i3] = get(i3);
        }
        return size;
    }

    /* renamed from: zzh */
    public C1127zzu<E> subList(int i, int i2) {
        C1127zzu<E> zzu;
        int i3 = i;
        int i4 = i2;
        C1118zzl.zzc(i3, i4, size());
        int i5 = i4 - i3;
        if (i5 == size()) {
            return this;
        } else if (i5 == 0) {
            return C1129zzw.zza;
        } else {
            new C1126zzt(this, i3, i5);
            return zzu;
        }
    }

    /* renamed from: zzo */
    public final C1131zzy<E> listIterator(int i) {
        C1131zzy<E> zzy;
        int i2 = i;
        int zzb = C1118zzl.zzb(i2, size(), "index");
        if (isEmpty()) {
            return zza;
        }
        new C1125zzs(this, i2);
        return zzy;
    }
}
