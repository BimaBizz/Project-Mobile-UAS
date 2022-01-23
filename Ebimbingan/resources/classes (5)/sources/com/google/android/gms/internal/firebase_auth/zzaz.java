package com.google.android.gms.internal.firebase_auth;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class zzaz<K, V> implements Serializable, Map<K, V> {
    private static final Map.Entry<?, ?>[] zzgw = new Map.Entry[0];
    private transient zzbc<Map.Entry<K, V>> zzgx;
    private transient zzbc<K> zzgy;
    private transient zzav<V> zzgz;

    public static <K, V> zzaz<K, V> zzb(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        K k5 = k;
        V v5 = v;
        K k6 = k2;
        V v6 = v2;
        K k7 = k3;
        V v7 = v3;
        K k8 = k4;
        V v8 = v4;
        zzat.zza(k5, v5);
        zzat.zza(k6, v6);
        zzat.zza(k7, v7);
        zzat.zza(k8, v8);
        Object[] objArr = new Object[8];
        objArr[0] = k5;
        Object[] objArr2 = objArr;
        objArr2[1] = v5;
        Object[] objArr3 = objArr2;
        objArr3[2] = k6;
        Object[] objArr4 = objArr3;
        objArr4[3] = v6;
        Object[] objArr5 = objArr4;
        objArr5[4] = k7;
        Object[] objArr6 = objArr5;
        objArr6[5] = v7;
        Object[] objArr7 = objArr6;
        objArr7[6] = k8;
        Object[] objArr8 = objArr7;
        objArr8[7] = v8;
        return zzbe.zza(4, objArr8);
    }

    public abstract V get(@NullableDecl Object obj);

    /* access modifiers changed from: package-private */
    public abstract zzbc<Map.Entry<K, V>> zzcf();

    /* access modifiers changed from: package-private */
    public abstract zzbc<K> zzcg();

    /* access modifiers changed from: package-private */
    public abstract zzav<V> zzch();

    zzaz() {
    }

    @Deprecated
    public final V put(K k, V v) {
        Throwable th;
        K k2 = k;
        V v2 = v;
        Throwable th2 = th;
        new UnsupportedOperationException();
        throw th2;
    }

    @Deprecated
    public final V remove(Object obj) {
        Throwable th;
        Object obj2 = obj;
        Throwable th2 = th;
        new UnsupportedOperationException();
        throw th2;
    }

    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        Throwable th;
        Map<? extends K, ? extends V> map2 = map;
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

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean containsKey(@NullableDecl Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(@NullableDecl Object obj) {
        return ((zzav) values()).contains(obj);
    }

    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v) {
        V v2 = v;
        V v3 = get(obj);
        return v3 != null ? v3 : v2;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r9) {
        /*
            r8 = this;
            r0 = r8
            r1 = r9
            r5 = r0
            r6 = r1
            r3 = r6
            r7 = r5
            r5 = r7
            r6 = r7
            r2 = r6
            r6 = r3
            if (r5 != r6) goto L_0x000f
            r5 = 1
            r0 = r5
        L_0x000e:
            return r0
        L_0x000f:
            r5 = r3
            boolean r5 = r5 instanceof java.util.Map
            if (r5 == 0) goto L_0x0028
            r5 = r3
            java.util.Map r5 = (java.util.Map) r5
            r4 = r5
            r5 = r2
            java.util.Set r5 = r5.entrySet()
            r6 = r4
            java.util.Set r6 = r6.entrySet()
            boolean r5 = r5.equals(r6)
            r0 = r5
            goto L_0x000e
        L_0x0028:
            r5 = 0
            r0 = r5
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_auth.zzaz.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return zzbh.zza((zzbc) entrySet());
    }

    public String toString() {
        StringBuilder sb;
        Throwable th;
        StringBuilder sb2;
        int size = size();
        int i = size;
        String str = "size";
        if (size < 0) {
            Throwable th2 = th;
            new StringBuilder(40 + String.valueOf(str).length());
            new IllegalArgumentException(sb2.append(str).append(" cannot be negative but was: ").append(i).toString());
            throw th2;
        }
        new StringBuilder((int) Math.min(((long) i) << 3, 1073741824));
        StringBuilder append = sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                StringBuilder append2 = append.append(", ");
            }
            z = false;
            StringBuilder append3 = append.append(entry.getKey()).append('=').append(entry.getValue());
        }
        return append.append('}').toString();
    }

    public /* synthetic */ Set entrySet() {
        zzbc<Map.Entry<K, V>> zzbc = this.zzgx;
        zzbc<Map.Entry<K, V>> zzbc2 = zzbc;
        if (zzbc != null) {
            return zzbc2;
        }
        zzbc<Map.Entry<K, V>> zzcf = zzcf();
        zzbc<Map.Entry<K, V>> zzbc3 = zzcf;
        this.zzgx = zzbc3;
        return zzcf;
    }

    public /* synthetic */ Collection values() {
        zzav<V> zzav = this.zzgz;
        zzav<V> zzav2 = zzav;
        if (zzav != null) {
            return zzav2;
        }
        zzav<V> zzch = zzch();
        zzav<V> zzav3 = zzch;
        this.zzgz = zzav3;
        return zzch;
    }

    public /* synthetic */ Set keySet() {
        zzbc<K> zzbc = this.zzgy;
        zzbc<K> zzbc2 = zzbc;
        if (zzbc != null) {
            return zzbc2;
        }
        zzbc<K> zzcg = zzcg();
        zzbc<K> zzbc3 = zzcg;
        this.zzgy = zzbc3;
        return zzcg;
    }
}
