package com.google.android.gms.internal.auth;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class zzik<K, V> {
    static <K, V> void zza(zzgv zzgv, zzin<K, V> zzin, K k, V v) throws IOException {
        zzgv zzgv2 = zzgv;
        zzin<K, V> zzin2 = zzin;
        zzhe.zza(zzgv2, zzin2.zza, 1, k);
        zzhe.zza(zzgv2, zzin2.zzc, 2, v);
    }

    static <K, V> int zza(zzin<K, V> zzin, K k, V v) {
        zzin<K, V> zzin2 = zzin;
        return zzhe.zza(zzin2.zza, 1, k) + zzhe.zza(zzin2.zzc, 2, v);
    }
}
