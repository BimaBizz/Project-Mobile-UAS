package com.google.android.gms.internal.auth;

import java.util.AbstractCollection;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzen extends AbstractCollection<V> {
    private final /* synthetic */ zzef zza;

    zzen(zzef zzef) {
        this.zza = zzef;
    }

    public final int size() {
        return this.zza.size();
    }

    public final void clear() {
        this.zza.clear();
    }

    public final Iterator<V> iterator() {
        return this.zza.zzg();
    }
}
