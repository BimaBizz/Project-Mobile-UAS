package com.google.android.gms.internal.auth;

import android.database.ContentObserver;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzcl extends ContentObserver {
    private final /* synthetic */ zzcj zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzcl(zzcj zzcj, Handler handler) {
        super((Handler) null);
        Handler handler2 = handler;
        this.zza = zzcj;
    }

    public final void onChange(boolean z) {
        boolean z2 = z;
        this.zza.zza();
    }
}
