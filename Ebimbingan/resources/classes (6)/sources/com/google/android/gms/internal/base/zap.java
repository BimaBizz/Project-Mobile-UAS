package com.google.android.gms.internal.base;

import android.os.Handler;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class zap extends Handler {
    public zap() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zap(Looper looper) {
        super(looper);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zap(Looper looper, Handler.Callback callback) {
        super(looper, callback);
    }
}
