package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zap;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zaax extends zap {
    final /* synthetic */ zaaz zaa;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zaax(zaaz zaaz, Looper looper) {
        super(looper);
        this.zaa = zaaz;
    }

    public final void handleMessage(Message message) {
        StringBuilder sb;
        Message message2 = message;
        switch (message2.what) {
            case 1:
                zaaz.zai(this.zaa);
                return;
            case 2:
                zaaz.zah(this.zaa);
                return;
            default:
                int i = message2.what;
                new StringBuilder(31);
                StringBuilder append = sb.append("Unknown message id: ");
                StringBuilder append2 = sb.append(i);
                int w = Log.w("GoogleApiClientImpl", sb.toString());
                return;
        }
    }
}
