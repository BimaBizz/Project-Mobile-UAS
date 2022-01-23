package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
final class zzv extends zzw {
    private final Callable<String> zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* synthetic */ zzv(Callable callable, zzu zzu) {
        super(false, (String) null, (Throwable) null);
        zzu zzu2 = zzu;
        this.zzd = callable;
    }

    /* access modifiers changed from: package-private */
    public final String zza() {
        Throwable th;
        try {
            return this.zzd.call();
        } catch (Exception e) {
            new RuntimeException(e);
            throw th;
        }
    }
}
