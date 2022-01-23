package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zap;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zabc extends zap {
    final /* synthetic */ zabd zaa;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zabc(zabd zabd, Looper looper) {
        super(looper);
        this.zaa = zabd;
    }

    public final void handleMessage(Message message) {
        StringBuilder sb;
        Message message2 = message;
        switch (message2.what) {
            case 1:
                ((zabb) message2.obj).zab(this.zaa);
                return;
            case 2:
                throw ((RuntimeException) message2.obj);
            default:
                int i = message2.what;
                new StringBuilder(31);
                StringBuilder append = sb.append("Unknown message id: ");
                StringBuilder append2 = sb.append(i);
                int w = Log.w("GACStateManager", sb.toString());
                return;
        }
    }
}
