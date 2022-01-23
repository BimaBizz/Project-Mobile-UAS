package com.google.android.gms.internal.auth;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzel extends AbstractSet<K> {
    private final /* synthetic */ zzef zza;

    zzel(zzef zzef) {
        this.zza = zzef;
    }

    public final int size() {
        return this.zza.size();
    }

    public final boolean contains(Object obj) {
        return this.zza.containsKey(obj);
    }

    public final boolean remove(@NullableDecl Object obj) {
        Object obj2 = obj;
        Map zzb = this.zza.zzb();
        Map map = zzb;
        if (zzb != null) {
            return map.keySet().remove(obj2);
        }
        if (this.zza.zzb(obj2) != zzef.zzd) {
            return true;
        }
        return false;
    }

    public final Iterator<K> iterator() {
        return this.zza.zze();
    }

    public final void clear() {
        this.zza.clear();
    }
}
