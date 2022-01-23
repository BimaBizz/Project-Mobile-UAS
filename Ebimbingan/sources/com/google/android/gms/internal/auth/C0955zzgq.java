package com.google.android.gms.internal.auth;

/* renamed from: com.google.android.gms.internal.auth.zzgq */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0955zzgq {
    private final C0960zzgv zza;
    private final byte[] zzb;

    private C0955zzgq(int i) {
        this.zzb = new byte[i];
        this.zza = C0960zzgv.zza(this.zzb);
    }

    public final C0947zzgi zza() {
        C0947zzgi zzgi;
        Throwable th;
        if (this.zza.zza() != 0) {
            Throwable th2 = th;
            new IllegalStateException("Did not write as much data as expected.");
            throw th2;
        }
        new C0957zzgs(this.zzb);
        return zzgi;
    }

    public final C0960zzgv zzb() {
        return this.zza;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ C0955zzgq(int i, C0946zzgh zzgh) {
        this(i);
        C0946zzgh zzgh2 = zzgh;
    }
}
