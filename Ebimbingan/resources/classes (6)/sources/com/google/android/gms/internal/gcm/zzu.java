package com.google.android.gms.internal.gcm;

final class zzu extends zzr {
    private final zzs zzdw;

    zzu() {
        zzs zzs;
        new zzs();
        this.zzdw = zzs;
    }

    public final void zzd(Throwable th, Throwable th2) {
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
            boolean add = this.zzdw.zzd(th5, true).add(th6);
        }
    }
}
