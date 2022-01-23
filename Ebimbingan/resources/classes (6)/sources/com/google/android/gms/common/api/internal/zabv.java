package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zap;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class zabv extends zap {
    final /* synthetic */ ListenerHolder zaa;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zabv(ListenerHolder listenerHolder, Looper looper) {
        super(looper);
        this.zaa = listenerHolder;
    }

    public final void handleMessage(Message message) {
        boolean z;
        Message message2 = message;
        if (message2.what == 1) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        this.zaa.notifyListenerInternal((ListenerHolder.Notifier) message2.obj);
    }
}
