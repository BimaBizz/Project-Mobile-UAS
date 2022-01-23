package com.google.android.gms.internal.auth;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.auth.zzfa */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0912zzfa extends C0924zzfm<T> {
    private boolean zza;
    private final /* synthetic */ Object zzb;

    C0912zzfa(Object obj) {
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
