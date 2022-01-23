package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.common.zzv */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
final class C0653zzv extends C0654zzw {
    private final Callable<String> zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* synthetic */ C0653zzv(Callable callable, C0652zzu zzu) {
        super(false, (String) null, (Throwable) null);
        C0652zzu zzu2 = zzu;
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
