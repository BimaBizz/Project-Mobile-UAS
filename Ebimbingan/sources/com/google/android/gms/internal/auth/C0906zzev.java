package com.google.android.gms.internal.auth;

import com.google.appinventor.components.common.PropertyTypeConstants;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.auth.zzev */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public abstract class C0906zzev<K, V> implements Serializable, Map<K, V> {
    private static final Map.Entry<?, ?>[] zza = new Map.Entry[0];
    private transient C0910zzez<Map.Entry<K, V>> zzb;
    private transient C0910zzez<K> zzc;
    private transient C0902zzer<V> zzd;

    C0906zzev() {
    }

    public abstract V get(@NullableDecl Object obj);

    /* access modifiers changed from: package-private */
    public abstract C0910zzez<Map.Entry<K, V>> zza();

    /* access modifiers changed from: package-private */
    public abstract C0910zzez<K> zzb();

    /* access modifiers changed from: package-private */
    public abstract C0902zzer<V> zzc();

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
        return ((C0902zzer) values()).contains(obj);
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.C0906zzev.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return C0922zzfk.zza((C0910zzez) entrySet());
    }

    public String toString() {
        StringBuilder sb;
        Throwable th;
        StringBuilder sb2;
        int size = size();
        int i = size;
        int i2 = size;
        String str = PropertyTypeConstants.PROPERTY_TYPE_FAB_SIZE;
        if (i < 0) {
            Throwable th2 = th;
            new StringBuilder(40 + String.valueOf(str).length());
            new IllegalArgumentException(sb2.append(str).append(" cannot be negative but was: ").append(i2).toString());
            throw th2;
        }
        new StringBuilder((int) Math.min(((long) i2) << 3, 1073741824));
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
        C0910zzez<Map.Entry<K, V>> zzez = this.zzb;
        C0910zzez<Map.Entry<K, V>> zzez2 = zzez;
        if (zzez != null) {
            return zzez2;
        }
        C0910zzez<Map.Entry<K, V>> zza2 = zza();
        C0910zzez<Map.Entry<K, V>> zzez3 = zza2;
        this.zzb = zzez3;
        return zza2;
    }

    public /* synthetic */ Collection values() {
        C0902zzer<V> zzer = this.zzd;
        C0902zzer<V> zzer2 = zzer;
        if (zzer != null) {
            return zzer2;
        }
        C0902zzer<V> zzc2 = zzc();
        C0902zzer<V> zzer3 = zzc2;
        this.zzd = zzer3;
        return zzc2;
    }

    public /* synthetic */ Set keySet() {
        C0910zzez<K> zzez = this.zzc;
        C0910zzez<K> zzez2 = zzez;
        if (zzez != null) {
            return zzez2;
        }
        C0910zzez<K> zzb2 = zzb();
        C0910zzez<K> zzez3 = zzb2;
        this.zzc = zzez3;
        return zzb2;
    }
}
