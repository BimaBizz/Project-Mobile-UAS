package com.google.android.gms.internal.auth;

import java.util.Collection;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.auth.zzea */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
abstract class C0885zzea<K, V> implements C0915zzfd<K, V> {
    @NullableDecl
    private transient Map<K, Collection<V>> zza;

    C0885zzea() {
    }

    /* access modifiers changed from: package-private */
    public abstract Map<K, Collection<V>> zzb();

    public boolean zza(@NullableDecl Object obj) {
        Object obj2 = obj;
        for (Collection contains : zza().values()) {
            if (contains.contains(obj2)) {
                return true;
            }
        }
        return false;
    }

    public Map<K, Collection<V>> zza() {
        Map<K, Collection<V>> map = this.zza;
        Map<K, Collection<V>> map2 = map;
        if (map != null) {
            return map2;
        }
        Map<K, Collection<V>> zzb = zzb();
        Map<K, Collection<V>> map3 = zzb;
        this.zza = map3;
        return zzb;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r8) {
        /*
            r7 = this;
            r0 = r7
            r1 = r8
            r5 = r0
            r6 = r1
            r3 = r6
            r2 = r5
            r5 = r3
            r6 = r2
            if (r5 != r6) goto L_0x000d
            r5 = 1
            r0 = r5
        L_0x000c:
            return r0
        L_0x000d:
            r5 = r3
            boolean r5 = r5 instanceof com.google.android.gms.internal.auth.C0915zzfd
            if (r5 == 0) goto L_0x0026
            r5 = r3
            com.google.android.gms.internal.auth.zzfd r5 = (com.google.android.gms.internal.auth.C0915zzfd) r5
            r4 = r5
            r5 = r2
            java.util.Map r5 = r5.zza()
            r6 = r4
            java.util.Map r6 = r6.zza()
            boolean r5 = r5.equals(r6)
            r0 = r5
            goto L_0x000c
        L_0x0026:
            r5 = 0
            r0 = r5
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.C0885zzea.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return zza().hashCode();
    }

    public String toString() {
        return zza().toString();
    }
}
