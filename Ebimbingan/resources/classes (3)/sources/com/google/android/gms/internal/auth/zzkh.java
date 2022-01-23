package com.google.android.gms.internal.auth;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzkh implements Iterator<String> {
    private Iterator<String> zza = this.zzb.zza.iterator();
    private final /* synthetic */ zzkf zzb;

    zzkh(zzkf zzkf) {
        this.zzb = zzkf;
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final void remove() {
        Throwable th;
        Throwable th2 = th;
        new UnsupportedOperationException();
        throw th2;
    }

    public final /* synthetic */ Object next() {
        return this.zza.next();
    }
}
