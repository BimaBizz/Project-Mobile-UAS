package com.google.android.gms.internal.auth;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzfa extends zzfm<T> {
    private boolean zza;
    private final /* synthetic */ Object zzb;

    zzfa(Object obj) {
        this.zzb = obj;
    }

    public final boolean hasNext() {
        return !this.zza;
    }

    public final T next() {
        Throwable th;
        if (this.zza) {
            Throwable th2 = th;
            new NoSuchElementException();
            throw th2;
        }
        this.zza = true;
        return this.zzb;
    }
}
