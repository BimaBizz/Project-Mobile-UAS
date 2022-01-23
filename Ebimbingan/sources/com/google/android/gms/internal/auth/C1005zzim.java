package com.google.android.gms.internal.auth;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.auth.zzim */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class C1005zzim<K, V> extends LinkedHashMap<K, V> {
    private static final C1005zzim zzb;
    private boolean zza = true;

    private C1005zzim() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C1005zzim(Map<K, V> map) {
        super(map);
    }

    public static <K, V> C1005zzim<K, V> zza() {
        return zzb;
    }

    public final void zza(C1005zzim<K, V> zzim) {
        C1005zzim<K, V> zzim2 = zzim;
        zze();
        if (!zzim2.isEmpty()) {
            putAll(zzim2);
        }
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public final void clear() {
        zze();
        super.clear();
    }

    public final V put(K k, V v) {
        K k2 = k;
        V v2 = v;
        zze();
        Object zza2 = C0980zzho.zza(k2);
        Object zza3 = C0980zzho.zza(v2);
        return super.put(k2, v2);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        Map<? extends K, ? extends V> map2 = map;
        zze();
        Map<? extends K, ? extends V> map3 = map2;
        Map<? extends K, ? extends V> map4 = map3;
        for (Object next : map3.keySet()) {
            Object zza2 = C0980zzho.zza(next);
            Object zza3 = C0980zzho.zza(map4.get(next));
        }
        super.putAll(map2);
    }

    public final V remove(Object obj) {
        zze();
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.C1005zzim.equals(java.lang.Object):boolean");
    }

    private static int zza(Object obj) {
        Throwable th;
        Object obj2 = obj;
        if (obj2 instanceof byte[]) {
            return C0980zzho.zzc((byte[]) obj2);
        }
        if (!(obj2 instanceof C0983zzhr)) {
            return obj2.hashCode();
        }
        Throwable th2 = th;
        new UnsupportedOperationException();
        throw th2;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += zza(entry.getKey()) ^ zza(entry.getValue());
        }
        return i;
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.auth.C1005zzim<K, V> zzb() {
        /*
            r5 = this;
            r0 = r5
            r1 = r0
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0012
            com.google.android.gms.internal.auth.zzim r1 = new com.google.android.gms.internal.auth.zzim
            r4 = r1
            r1 = r4
            r2 = r4
            r2.<init>()
            r0 = r1
        L_0x0011:
            return r0
        L_0x0012:
            com.google.android.gms.internal.auth.zzim r1 = new com.google.android.gms.internal.auth.zzim
            r4 = r1
            r1 = r4
            r2 = r4
            r3 = r0
            r2.<init>(r3)
            r0 = r1
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.C1005zzim.zzb():com.google.android.gms.internal.auth.zzim");
    }

    public final void zzc() {
        this.zza = false;
    }

    public final boolean zzd() {
        return this.zza;
    }

    private final void zze() {
        Throwable th;
        if (!this.zza) {
            Throwable th2 = th;
            new UnsupportedOperationException();
            throw th2;
        }
    }

    static {
        C1005zzim zzim;
        new C1005zzim();
        C1005zzim zzim2 = zzim;
        zzb = zzim2;
        zzim2.zza = false;
    }
}
