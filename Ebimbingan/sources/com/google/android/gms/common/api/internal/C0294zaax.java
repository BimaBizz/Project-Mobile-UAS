package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.C1106zap;

/* renamed from: com.google.android.gms.common.api.internal.zaax */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0294zaax extends C1106zap {
    final /* synthetic */ C0296zaaz zaa;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0294zaax(C0296zaaz zaaz, Looper looper) {
        super(looper);
        this.zaa = zaaz;
    }

    public final void handleMessage(Message message) {
        StringBuilder sb;
        Message message2 = message;
        switch (message2.what) {
            case 1:
                C0296zaaz.zai(this.zaa);
                return;
            case 2:
                C0296zaaz.zah(this.zaa);
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
