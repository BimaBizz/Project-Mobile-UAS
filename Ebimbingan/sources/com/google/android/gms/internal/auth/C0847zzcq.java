package com.google.android.gms.internal.auth;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.auth.zzcq */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0847zzcq extends ContentObserver {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0847zzcq(C0845zzco zzco, Handler handler) {
        super((Handler) null);
        C0845zzco zzco2 = zzco;
        Handler handler2 = handler;
    }

    public final void onChange(boolean z) {
        C0854zzcx.zza();
    }
}
