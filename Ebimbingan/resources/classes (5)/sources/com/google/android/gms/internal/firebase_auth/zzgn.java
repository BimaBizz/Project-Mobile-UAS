package com.google.android.gms.internal.firebase_auth;

final class zzgn {
    private final byte[] buffer;
    private final zzha zzwc;

    private zzgn(int i) {
        this.buffer = new byte[i];
        this.zzwc = zzha.zzc(this.buffer);
    }

    public final zzgf zzgg() {
        zzgf zzgf;
        this.zzwc.zzhj();
        new zzgp(this.buffer);
        return zzgf;
    }

    public final zzha zzgh() {
        return this.zzwc;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ zzgn(int i, zzgi zzgi) {
        this(i);
        zzgi zzgi2 = zzgi;
    }
}
