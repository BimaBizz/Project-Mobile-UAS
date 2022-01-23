package com.google.android.gms.internal.firebase_auth;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class zzav<E> extends AbstractCollection<E> implements Serializable {
    private static final Object[] zzgt = new Object[0];

    zzav() {
    }

    public abstract boolean contains(@NullableDecl Object obj);

    /* renamed from: zzbz */
    public abstract zzbk<E> iterator();

    public final Object[] toArray() {
        return toArray(zzgt);
    }

    public final <T> T[] toArray(T[] tArr) {
        T[] tArr2 = tArr;
        Object checkNotNull = zzaj.checkNotNull(tArr2);
        int size = size();
        if (tArr2.length < size) {
            Object[] zzca = zzca();
            Object[] objArr = zzca;
            if (zzca != null) {
                int zzcb = zzcb();
                int i = zzcb;
                int i2 = i;
                return Arrays.copyOfRange(objArr, i, zzcc(), tArr2.getClass());
            }
            tArr2 = (Object[]) Array.newInstance(tArr2.getClass().getComponentType(), size);
        } else if (tArr2.length > size) {
            tArr2[size] = null;
        }
        int zza = zza(tArr2, 0);
        return tArr2;
    }

    /* access modifiers changed from: package-private */
    public Object[] zzca() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public int zzcb() {
        Throwable th;
        Throwable th2 = th;
        new UnsupportedOperationException();
        throw th2;
    }

    /* access modifiers changed from: package-private */
    public int zzcc() {
        Throwable th;
        Throwable th2 = th;
        new UnsupportedOperationException();
        throw th2;
    }

    @Deprecated
    public final boolean add(E e) {
        Throwable th;
        E e2 = e;
        Throwable th2 = th;
        new UnsupportedOperationException();
        throw th2;
    }

    @Deprecated
    public final boolean remove(Object obj) {
        Throwable th;
        Object obj2 = obj;
        Throwable th2 = th;
        new UnsupportedOperationException();
        throw th2;
    }

    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        Throwable th;
        Collection<? extends E> collection2 = collection;
        Throwable th2 = th;
        new UnsupportedOperationException();
        throw th2;
    }

    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        Throwable th;
        Collection<?> collection2 = collection;
        Throwable th2 = th;
        new UnsupportedOperationException();
        throw th2;
    }

    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        Throwable th;
        Collection<?> collection2 = collection;
        Throwable th2 = th;
        new UnsupportedOperationException();
        throw th2;
    }

    @Deprecated
    public final void clear() {
        Throwable th;
        Throwable th2 = th;
        new UnsupportedOperationException();
        throw th2;
    }

    public zzay<E> zzcd() {
        return isEmpty() ? zzay.zzce() : zzay.zza(toArray());
    }

    /* access modifiers changed from: package-private */
    public int zza(Object[] objArr, int i) {
        Object[] objArr2 = objArr;
        int i2 = i;
        zzbk zzbk = (zzbk) iterator();
        while (zzbk.hasNext()) {
            int i3 = i2;
            i2++;
            objArr2[i3] = zzbk.next();
        }
        return i2;
    }
}
