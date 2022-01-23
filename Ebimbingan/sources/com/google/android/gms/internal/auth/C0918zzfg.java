package com.google.android.gms.internal.auth;

import java.util.AbstractMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.auth.zzfg */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0918zzfg extends C0901zzeq<Map.Entry<K, V>> {
    private final /* synthetic */ C0919zzfh zza;

    C0918zzfg(C0919zzfh zzfh) {
        this.zza = zzfh;
    }

    public final int size() {
        return this.zza.zzd;
    }

    public final boolean zzg() {
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        Object obj;
        int i2 = i;
        int zza2 = C0874zzdq.zza(i2, this.zza.zzd);
        new AbstractMap.SimpleImmutableEntry(this.zza.zzb[2 * i2], this.zza.zzb[(2 * i2) + 1]);
        return obj;
    }
}
