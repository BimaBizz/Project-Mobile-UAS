package com.google.android.gms.internal.firebase_auth;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class zziw<K, V> extends LinkedHashMap<K, V> {
    private static final zziw zzaco;
    private boolean zzvo = true;

    private zziw() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private zziw(Map<K, V> map) {
        super(map);
    }

    public static <K, V> zziw<K, V> zzji() {
        return zzaco;
    }

    public final void zza(zziw<K, V> zziw) {
        zziw<K, V> zziw2 = zziw;
        zzjk();
        if (!zziw2.isEmpty()) {
            putAll(zziw2);
        }
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public final void clear() {
        zzjk();
        super.clear();
    }

    public final V put(K k, V v) {
        K k2 = k;
        V v2 = v;
        zzjk();
        Object checkNotNull = zzht.checkNotNull(k2);
        Object checkNotNull2 = zzht.checkNotNull(v2);
        return super.put(k2, v2);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        Map<? extends K, ? extends V> map2 = map;
        zzjk();
        Map<? extends K, ? extends V> map3 = map2;
        Map<? extends K, ? extends V> map4 = map3;
        for (Object next : map3.keySet()) {
            Object checkNotNull = zzht.checkNotNull(next);
            Object checkNotNull2 = zzht.checkNotNull(map4.get(next));
        }
        super.putAll(map2);
    }

    public final V remove(Object obj) {
        zzjk();
        return super.remove(obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r13) {
        /*
            r12 = this;
            r0 = r12
            r1 = r13
            r8 = r1
            boolean r8 = r8 instanceof java.util.Map
            if (r8 == 0) goto L_0x0081
            r8 = r0
            r9 = r1
            java.util.Map r9 = (java.util.Map) r9
            r3 = r9
            r11 = r8
            r8 = r11
            r9 = r11
            r2 = r9
            r9 = r3
            if (r8 == r9) goto L_0x007f
            r8 = r2
            int r8 = r8.size()
            r9 = r3
            int r9 = r9.size()
            if (r8 == r9) goto L_0x0025
            r8 = 0
        L_0x0020:
            if (r8 == 0) goto L_0x0081
            r8 = 1
            r0 = r8
        L_0x0024:
            return r0
        L_0x0025:
            r8 = r2
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
            r4 = r8
        L_0x002f:
            r8 = r4
            boolean r8 = r8.hasNext()
            if (r8 == 0) goto L_0x007f
            r8 = r4
            java.lang.Object r8 = r8.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            r5 = r8
            r8 = r3
            r9 = r5
            java.lang.Object r9 = r9.getKey()
            boolean r8 = r8.containsKey(r9)
            if (r8 != 0) goto L_0x004c
            r8 = 0
            goto L_0x0020
        L_0x004c:
            r8 = r5
            java.lang.Object r8 = r8.getValue()
            r9 = r3
            r10 = r5
            java.lang.Object r10 = r10.getKey()
            java.lang.Object r9 = r9.get(r10)
            r7 = r9
            r11 = r8
            r8 = r11
            r9 = r11
            r6 = r9
            boolean r8 = r8 instanceof byte[]
            if (r8 == 0) goto L_0x0077
            r8 = r7
            boolean r8 = r8 instanceof byte[]
            if (r8 == 0) goto L_0x0077
            r8 = r6
            byte[] r8 = (byte[]) r8
            r9 = r7
            byte[] r9 = (byte[]) r9
            boolean r8 = java.util.Arrays.equals(r8, r9)
        L_0x0073:
            if (r8 != 0) goto L_0x007e
            r8 = 0
            goto L_0x0020
        L_0x0077:
            r8 = r6
            r9 = r7
            boolean r8 = r8.equals(r9)
            goto L_0x0073
        L_0x007e:
            goto L_0x002f
        L_0x007f:
            r8 = 1
            goto L_0x0020
        L_0x0081:
            r8 = 0
            r0 = r8
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_auth.zziw.equals(java.lang.Object):boolean");
    }

    private static int zzo(Object obj) {
        Throwable th;
        Object obj2 = obj;
        if (obj2 instanceof byte[]) {
            return zzht.hashCode((byte[]) obj2);
        }
        if (!(obj2 instanceof zzhw)) {
            return obj2.hashCode();
        }
        Throwable th2 = th;
        new UnsupportedOperationException();
        throw th2;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += zzo(entry.getKey()) ^ zzo(entry.getValue());
        }
        return i;
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.firebase_auth.zziw<K, V> zzjj() {
        /*
            r5 = this;
            r0 = r5
            r1 = r0
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0012
            com.google.android.gms.internal.firebase_auth.zziw r1 = new com.google.android.gms.internal.firebase_auth.zziw
            r4 = r1
            r1 = r4
            r2 = r4
            r2.<init>()
            r0 = r1
        L_0x0011:
            return r0
        L_0x0012:
            com.google.android.gms.internal.firebase_auth.zziw r1 = new com.google.android.gms.internal.firebase_auth.zziw
            r4 = r1
            r1 = r4
            r2 = r4
            r3 = r0
            r2.<init>(r3)
            r0 = r1
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_auth.zziw.zzjj():com.google.android.gms.internal.firebase_auth.zziw");
    }

    public final void zzfy() {
        this.zzvo = false;
    }

    public final boolean isMutable() {
        return this.zzvo;
    }

    private final void zzjk() {
        Throwable th;
        if (!this.zzvo) {
            Throwable th2 = th;
            new UnsupportedOperationException();
            throw th2;
        }
    }

    static {
        zziw zziw;
        new zziw();
        zziw zziw2 = zziw;
        zzaco = zziw2;
        zziw2.zzvo = false;
    }
}
