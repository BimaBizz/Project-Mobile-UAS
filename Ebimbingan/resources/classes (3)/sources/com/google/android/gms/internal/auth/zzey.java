package com.google.android.gms.internal.auth;

import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public class zzey<K, V> extends zzex<K, V> implements zzfd<K, V> {
    private final transient zzez<V> zza = zzfl.zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzey(zzev<K, zzez<V>> zzev, int i, @NullableDecl Comparator<? super V> comparator) {
        super(zzev, i);
        Comparator<? super V> comparator2 = comparator;
    }
}
