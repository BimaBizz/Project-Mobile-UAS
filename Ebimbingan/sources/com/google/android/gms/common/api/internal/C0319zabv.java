package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.internal.C0254ListenerHolder;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.internal.base.C1106zap;

/* renamed from: com.google.android.gms.common.api.internal.zabv */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C0319zabv extends C1106zap {
    final /* synthetic */ C0254ListenerHolder zaa;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0319zabv(C0254ListenerHolder listenerHolder, Looper looper) {
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
        C0446Preconditions.checkArgument(z);
        this.zaa.notifyListenerInternal((C0254ListenerHolder.Notifier) message2.obj);
    }
}
