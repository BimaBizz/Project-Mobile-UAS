package com.google.android.gms.internal.base;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.google.android.gms.internal.base.zap */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class C1106zap extends Handler {
    public C1106zap() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1106zap(Looper looper) {
        super(looper);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1106zap(Looper looper, Handler.Callback callback) {
        super(looper, callback);
    }
}
