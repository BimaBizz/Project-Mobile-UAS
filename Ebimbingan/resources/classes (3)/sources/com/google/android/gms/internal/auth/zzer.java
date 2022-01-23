package com.google.android.gms.internal.auth;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public abstract class zzer<E> extends AbstractCollection<E> implements Serializable {
    private static final Object[] zza = new Object[0];

    zzer() {
    }

    public abstract boolean contains(@NullableDecl Object obj);

    /* renamed from: zzb */
    public abstract zzfm<E> iterator();

    /* access modifiers changed from: package-private */
    public abstract boolean zzg();

    public final Object[] toArray() {
        return toArray(zza);
    }

    public final <T> T[] toArray(T[] tArr) {
        T[] tArr2 = tArr;
        Object zza2 = zzdq.zza(tArr2);
        int size = size();
        if (tArr2.length < size) {
            Object[] zzd = zzd();
            Object[] objArr = zzd;
            if (zzd != null) {
                int zze = zze();
                T[] tArr3 = tArr2;
                int zzf = zzf();
                int i = zzf;
                return Arrays.copyOfRange(objArr, zze, zzf, tArr3.getClass());
            }
            tArr2 = (Object[]) Array.newInstance(tArr2.getClass().getComponentType(), size);
        } else if (tArr2.length > size) {
            tArr2[size] = null;
        }
        int zzb = zzb(tArr2, 0);
        return tArr2;
    }

    /* access modifiers changed from: package-private */
    @NullableDecl
    public Object[] zzd() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public int zze() {
        Throwable th;
        Throwable th2 = th;
        new UnsupportedOperationException();
        throw th2;
    }

    /* access modifiers changed from: package-private */
    public int zzf() {
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

    public zzeq<E> zzc() {
        return isEmpty() ? zzeq.zza() : zzeq.zza(toArray());
    }

    /* access modifiers changed from: package-private */
    public int zzb(Object[] objArr, int i) {
        Object[] objArr2 = objArr;
        int i2 = i;
        zzfm zzfm = (zzfm) iterator();
        while (zzfm.hasNext()) {
            int i3 = i2;
            i2++;
            objArr2[i3] = zzfm.next();
        }
        return i2;
    }
}
