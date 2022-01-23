package com.google.android.gms.internal.auth;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzfj<K> extends zzez<K> {
    private final transient zzev<K, ?> zza;
    private final transient zzeq<K> zzb;

    zzfj(zzev<K, ?> zzev, zzeq<K> zzeq) {
        this.zza = zzev;
        this.zzb = zzeq;
    }

    public final zzfm<K> zzb() {
        return (zzfm) zzc().iterator();
    }

    /* access modifiers changed from: package-private */
    public final int zzb(Object[] objArr, int i) {
        return zzc().zzb(objArr, i);
    }

    public final zzeq<K> zzc() {
        return this.zzb;
    }

    public final boolean contains(@NullableDecl Object obj) {
        return this.zza.get(obj) != null;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzg() {
        return true;
    }

    public final int size() {
        return this.zza.size();
    }

    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
