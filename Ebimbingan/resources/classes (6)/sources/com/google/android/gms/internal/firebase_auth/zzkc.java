package com.google.android.gms.internal.firebase_auth;

import java.util.Map;

final class zzkc implements Comparable<zzkc>, Map.Entry<K, V> {
    private V value;
    private final /* synthetic */ zzjt zzaeb;
    private final K zzaef;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzkc(com.google.android.gms.internal.firebase_auth.zzjt r8, java.util.Map.Entry<K, V> r9) {
        /*
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r0
            r4 = r1
            r5 = r2
            java.lang.Object r5 = r5.getKey()
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            r6 = r2
            java.lang.Object r6 = r6.getValue()
            r3.<init>(r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_auth.zzkc.<init>(com.google.android.gms.internal.firebase_auth.zzjt, java.util.Map$Entry):void");
    }

    zzkc(zzjt zzjt, K k, V v) {
        this.zzaeb = zzjt;
        this.zzaef = k;
        this.value = v;
    }

    public final V getValue() {
        return this.value;
    }

    public final V setValue(V v) {
        this.zzaeb.zzkb();
        V v2 = this.value;
        this.value = v;
        return v2;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = r5
            r1 = r6
            r3 = r1
            r4 = r0
            if (r3 != r4) goto L_0x0009
            r3 = 1
            r0 = r3
        L_0x0008:
            return r0
        L_0x0009:
            r3 = r1
            boolean r3 = r3 instanceof java.util.Map.Entry
            if (r3 != 0) goto L_0x0011
            r3 = 0
            r0 = r3
            goto L_0x0008
        L_0x0011:
            r3 = r1
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            r2 = r3
            r3 = r0
            K r3 = r3.zzaef
            r4 = r2
            java.lang.Object r4 = r4.getKey()
            boolean r3 = equals(r3, r4)
            if (r3 == 0) goto L_0x0034
            r3 = r0
            V r3 = r3.value
            r4 = r2
            java.lang.Object r4 = r4.getValue()
            boolean r3 = equals(r3, r4)
            if (r3 == 0) goto L_0x0034
            r3 = 1
            r0 = r3
            goto L_0x0008
        L_0x0034:
            r3 = 0
            r0 = r3
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_auth.zzkc.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return (this.zzaef == null ? 0 : this.zzaef.hashCode()) ^ (this.value == null ? 0 : this.value.hashCode());
    }

    public final String toString() {
        StringBuilder sb;
        String valueOf = String.valueOf(this.zzaef);
        String valueOf2 = String.valueOf(this.value);
        new StringBuilder(1 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        return sb.append(valueOf).append("=").append(valueOf2).toString();
    }

    private static boolean equals(Object obj, Object obj2) {
        Object obj3 = obj;
        Object obj4 = obj2;
        if (obj3 == null) {
            return obj4 == null;
        }
        return obj3.equals(obj4);
    }

    public final /* synthetic */ Object getKey() {
        return this.zzaef;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((zzkc) obj).getKey());
    }
}
