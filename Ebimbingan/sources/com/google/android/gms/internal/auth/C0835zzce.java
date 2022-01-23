package com.google.android.gms.internal.auth;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.auth.zzce */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0835zzce extends ContentObserver {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0835zzce(Handler handler) {
        super((Handler) null);
        Handler handler2 = handler;
    }

    public final void onChange(boolean z) {
        boolean z2 = z;
        C0836zzcf.zze.set(true);
    }
}
