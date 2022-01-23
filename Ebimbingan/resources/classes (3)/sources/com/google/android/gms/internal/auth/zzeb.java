package com.google.android.gms.internal.auth;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
abstract class zzeb<K, V> implements Map.Entry<K, V> {
    zzeb() {
    }

    public abstract K getKey();

    public abstract V getValue();

    public V setValue(V v) {
        Throwable th;
        V v2 = v;
        Throwable th2 = th;
        new UnsupportedOperationException();
        throw th2;
    }

    public boolean equals(@NullableDecl Object obj) {
        Object obj2 = obj;
        if (!(obj2 instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj2;
        if (!zzdo.zza(getKey(), entry.getKey()) || !zzdo.zza(getValue(), entry.getValue())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object key = getKey();
        Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value == null ? 0 : value.hashCode());
    }

    public String toString() {
        StringBuilder sb;
        String valueOf = String.valueOf(getKey());
        String valueOf2 = String.valueOf(getValue());
        new StringBuilder(1 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        return sb.append(valueOf).append("=").append(valueOf2).toString();
    }
}
