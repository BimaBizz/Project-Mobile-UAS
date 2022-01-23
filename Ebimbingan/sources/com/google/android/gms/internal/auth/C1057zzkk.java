package com.google.android.gms.internal.auth;

/* renamed from: com.google.android.gms.internal.auth.zzkk */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
abstract class C1057zzkk {
    C1057zzkk() {
    }

    /* access modifiers changed from: package-private */
    public abstract int zza(int i, byte[] bArr, int i2, int i3);

    /* access modifiers changed from: package-private */
    public abstract int zza(CharSequence charSequence, byte[] bArr, int i, int i2);

    /* access modifiers changed from: package-private */
    public abstract String zzb(byte[] bArr, int i, int i2) throws C0984zzhs;

    /* access modifiers changed from: package-private */
    public final boolean zza(byte[] bArr, int i, int i2) {
        return zza(0, bArr, i, i2) == 0;
    }
}
