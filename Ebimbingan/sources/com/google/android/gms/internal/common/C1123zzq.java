package com.google.android.gms.internal.common;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.common.zzq */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public abstract class C1123zzq<E> extends AbstractCollection<E> implements Serializable {
    private static final Object[] zza = new Object[0];

    C1123zzq() {
    }

    @Deprecated
    public final boolean add(E e) {
        Throwable th;
        E e2 = e;
        new UnsupportedOperationException();
        throw th;
    }

    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        Throwable th;
        Collection<? extends E> collection2 = collection;
        new UnsupportedOperationException();
        throw th;
    }

    @Deprecated
    public final void clear() {
        Throwable th;
        new UnsupportedOperationException();
        throw th;
    }

    @Deprecated
    public final boolean remove(Object obj) {
        Throwable th;
        Object obj2 = obj;
        new UnsupportedOperationException();
        throw th;
    }

    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        Throwable th;
        Collection<?> collection2 = collection;
        new UnsupportedOperationException();
        throw th;
    }

    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        Throwable th;
        Collection<?> collection2 = collection;
        new UnsupportedOperationException();
        throw th;
    }

    public final Object[] toArray() {
        return toArray(zza);
    }

    /* renamed from: zza */
    public abstract C1130zzx<E> iterator();

    /* access modifiers changed from: package-private */
    @NullableDecl
    public Object[] zzb() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public int zzc() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public int zzd() {
        throw null;
    }

    public C1127zzu<E> zze() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public abstract boolean zzf();

    /* access modifiers changed from: package-private */
    public int zzg(Object[] objArr, int i) {
        Object[] objArr2 = objArr;
        int i2 = i;
        throw null;
    }

    public final <T> T[] toArray(T[] tArr) {
        T[] tArr2 = tArr;
        if (tArr2 != null) {
            int size = size();
            int length = tArr2.length;
            if (length < size) {
                Object[] zzb = zzb();
                if (zzb != null) {
                    return Arrays.copyOfRange(zzb, zzc(), zzd(), tArr2.getClass());
                }
                tArr2 = (Object[]) Array.newInstance(tArr2.getClass().getComponentType(), size);
            } else if (length > size) {
                tArr2[size] = null;
            }
            int zzg = zzg(tArr2, 0);
            return tArr2;
        }
        throw null;
    }
}
