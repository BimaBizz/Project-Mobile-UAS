package com.google.android.gms.internal.auth;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.auth.zzik */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class C1003zzik<K, V> {
    static <K, V> void zza(C0960zzgv zzgv, C1006zzin<K, V> zzin, K k, V v) throws IOException {
        C0960zzgv zzgv2 = zzgv;
        C1006zzin<K, V> zzin2 = zzin;
        C0970zzhe.zza(zzgv2, zzin2.zza, 1, k);
        C0970zzhe.zza(zzgv2, zzin2.zzc, 2, v);
    }

    static <K, V> int zza(C1006zzin<K, V> zzin, K k, V v) {
        C1006zzin<K, V> zzin2 = zzin;
        return C0970zzhe.zza(zzin2.zza, 1, k) + C0970zzhe.zza(zzin2.zzc, 2, v);
    }
}
