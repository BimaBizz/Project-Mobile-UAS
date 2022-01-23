package com.google.android.gms.internal.auth;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.auth.zzek */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0895zzek extends C0886zzeb<K, V> {
    @NullableDecl
    private final K zza;
    private int zzb;
    private final /* synthetic */ C0890zzef zzc;

    C0895zzek(C0890zzef zzef, int i) {
        C0890zzef zzef2 = zzef;
        int i2 = i;
        this.zzc = zzef2;
        this.zza = zzef2.zzb[i2];
        this.zzb = i2;
    }

    @NullableDecl
    public final K getKey() {
        return this.zza;
    }

    private final void zza() {
        if (this.zzb == -1 || this.zzb >= this.zzc.size() || !C0872zzdo.zza(this.zza, this.zzc.zzb[this.zzb])) {
            this.zzb = this.zzc.zza((Object) this.zza);
        }
    }

    @NullableDecl
    public final V getValue() {
        Map zzb2 = this.zzc.zzb();
        Map map = zzb2;
        if (zzb2 != null) {
            return map.get(this.zza);
        }
        zza();
        if (this.zzb == -1) {
            return null;
        }
        return this.zzc.zzc[this.zzb];
    }

    public final V setValue(V v) {
        V v2 = v;
        Map zzb2 = this.zzc.zzb();
        Map map = zzb2;
        if (zzb2 != null) {
            return map.put(this.zza, v2);
        }
        zza();
        if (this.zzb == -1) {
            Object put = this.zzc.put(this.zza, v2);
            return null;
        }
        V v3 = this.zzc.zzc[this.zzb];
        this.zzc.zzc[this.zzb] = v2;
        return v3;
    }
}
