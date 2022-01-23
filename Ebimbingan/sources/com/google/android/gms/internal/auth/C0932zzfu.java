package com.google.android.gms.internal.auth;

/* renamed from: com.google.android.gms.internal.auth.zzfu */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0932zzfu extends C0931zzft {
    private final C0930zzfs zza;

    C0932zzfu() {
        C0930zzfs zzfs;
        new C0930zzfs();
        this.zza = zzfs;
    }

    public final void zza(Throwable th, Throwable th2) {
        Throwable th3;
        Throwable th4;
        Throwable th5 = th;
        Throwable th6 = th2;
        if (th6 == th5) {
            Throwable th7 = th4;
            new IllegalArgumentException("Self suppression is not allowed.", th6);
            throw th7;
        } else if (th6 == null) {
            Throwable th8 = th3;
            new NullPointerException("The suppressed exception cannot be null.");
            throw th8;
        } else {
            boolean add = this.zza.zza(th5, true).add(th6);
        }
    }
}
