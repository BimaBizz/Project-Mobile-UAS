package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.C1106zap;

/* renamed from: com.google.android.gms.common.api.internal.zabc */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0300zabc extends C1106zap {
    final /* synthetic */ C0301zabd zaa;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0300zabc(C0301zabd zabd, Looper looper) {
        super(looper);
        this.zaa = zabd;
    }

    public final void handleMessage(Message message) {
        StringBuilder sb;
        Message message2 = message;
        switch (message2.what) {
            case 1:
                ((C0299zabb) message2.obj).zab(this.zaa);
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
