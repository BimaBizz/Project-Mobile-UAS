package com.google.android.gms.internal.auth;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.auth.zzfj */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0921zzfj<K> extends C0910zzez<K> {
    private final transient C0906zzev<K, ?> zza;
    private final transient C0901zzeq<K> zzb;

    C0921zzfj(C0906zzev<K, ?> zzev, C0901zzeq<K> zzeq) {
        this.zza = zzev;
        this.zzb = zzeq;
    }

    public final C0924zzfm<K> zzb() {
        return (C0924zzfm) zzc().iterator();
    }

    /* access modifiers changed from: package-private */
    public final int zzb(Object[] objArr, int i) {
        return zzc().zzb(objArr, i);
    }

    public final C0901zzeq<K> zzc() {
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
