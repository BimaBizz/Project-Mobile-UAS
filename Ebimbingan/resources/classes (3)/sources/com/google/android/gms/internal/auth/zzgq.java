package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzgq {
    private final zzgv zza;
    private final byte[] zzb;

    private zzgq(int i) {
        this.zzb = new byte[i];
        this.zza = zzgv.zza(this.zzb);
    }

    public final zzgi zza() {
        zzgi zzgi;
        Throwable th;
        if (this.zza.zza() != 0) {
            Throwable th2 = th;
            new IllegalStateException("Did not write as much data as expected.");
            throw th2;
        }
        new zzgs(this.zzb);
        return zzgi;
    }

    public final zzgv zzb() {
        return this.zza;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ zzgq(int i, zzgh zzgh) {
        this(i);
        zzgh zzgh2 = zzgh;
    }
}
