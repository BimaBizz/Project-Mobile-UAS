package com.google.android.gms.internal.gcm;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public class zzj extends Handler {
    private static volatile zzk zzdj = null;

    public zzj() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzj(Looper looper) {
        super(looper);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzj(Looper looper, Handler.Callback callback) {
        super(looper, callback);
    }

    public final void dispatchMessage(Message message) {
        Message message2 = message;
        Message message3 = message2;
        super.dispatchMessage(message2);
    }
}
