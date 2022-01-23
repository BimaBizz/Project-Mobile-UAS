package com.google.android.gms.common.api.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.api.internal.zabf */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final /* synthetic */ class C0303zabf implements Executor {
    private final Handler zaa;

    private C0303zabf(Handler handler) {
        this.zaa = handler;
    }

    static Executor zaa(Handler handler) {
        Executor executor;
        new C0303zabf(handler);
        return executor;
    }

    public final void execute(Runnable runnable) {
        boolean post = this.zaa.post(runnable);
    }
}
