package com.google.android.gms.internal.auth;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.auth.zzex */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public class C0908zzex<K, V> extends C0888zzed<K, V> implements Serializable {
    private final transient C0906zzev<K, ? extends C0902zzer<V>> zza;
    private final transient int zzb;

    C0908zzex(C0906zzev<K, ? extends C0902zzer<V>> zzev, int i) {
        this.zza = zzev;
        this.zzb = i;
    }

    public final boolean zza(@NullableDecl Object obj) {
        Object obj2 = obj;
        return obj2 != null && super.zza(obj2);
    }

    /* access modifiers changed from: package-private */
    public final Map<K, Collection<V>> zzb() {
        Throwable th;
        Throwable th2 = th;
        new AssertionError("should never be called");
        throw th2;
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    public final /* synthetic */ Map zza() {
        return this.zza;
    }
}
