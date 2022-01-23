package com.google.android.gms.internal.auth;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.auth.zzgh */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0946zzgh extends C0948zzgj {
    private int zza = 0;
    private final int zzb = this.zzc.zza();
    private final /* synthetic */ C0947zzgi zzc;

    C0946zzgh(C0947zzgi zzgi) {
        this.zzc = zzgi;
    }

    public final boolean hasNext() {
        return this.zza < this.zzb;
    }

    public final byte zza() {
        Throwable th;
        int i = this.zza;
        int i2 = i;
        if (i >= this.zzb) {
            Throwable th2 = th;
            new NoSuchElementException();
            throw th2;
        }
        this.zza = i2 + 1;
        return this.zzc.zzb(i2);
    }
}
