package com.google.android.gms.internal.auth;

import android.database.ContentObserver;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzcq extends ContentObserver {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzcq(zzco zzco, Handler handler) {
        super((Handler) null);
        zzco zzco2 = zzco;
        Handler handler2 = handler;
    }

    public final void onChange(boolean z) {
        zzcx.zza();
    }
}
