package com.google.android.gms.internal.auth;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzej extends AbstractSet<Map.Entry<K, V>> {
    private final /* synthetic */ zzef zza;

    zzej(zzef zzef) {
        this.zza = zzef;
    }

    public final int size() {
        return this.zza.size();
    }

    public final void clear() {
        this.zza.clear();
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        return this.zza.zzf();
    }

    public final boolean contains(@NullableDecl Object obj) {
        Object obj2 = obj;
        Map zzb = this.zza.zzb();
        Map map = zzb;
        if (zzb != null) {
            return map.entrySet().contains(obj2);
        }
        if (!(obj2 instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj2;
        int zzb2 = this.zza.zza(entry.getKey());
        return zzb2 != -1 && zzdo.zza(this.zza.zzc[zzb2], entry.getValue());
    }

    public final boolean remove(@NullableDecl Object obj) {
        Object obj2 = obj;
        Map zzb = this.zza.zzb();
        Map map = zzb;
        if (zzb != null) {
            return map.entrySet().remove(obj2);
        }
        if (!(obj2 instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj2;
        if (this.zza.zza()) {
            return false;
        }
        int zzb2 = this.zza.zzi();
        int zza2 = zzem.zza(entry.getKey(), entry.getValue(), zzb2, this.zza.zze, this.zza.zza, this.zza.zzb, this.zza.zzc);
        int i = zza2;
        if (zza2 == -1) {
            return false;
        }
        this.zza.zza(i, zzb2);
        int zzd = zzef.zzd(this.zza);
        this.zza.zzc();
        return true;
    }
}
