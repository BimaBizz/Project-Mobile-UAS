package com.google.android.gms.common.api.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final /* synthetic */ class zabf implements Executor {
    private final Handler zaa;

    private zabf(Handler handler) {
        this.zaa = handler;
    }

    static Executor zaa(Handler handler) {
        Executor executor;
        new zabf(handler);
        return executor;
    }

    public final void execute(Runnable runnable) {
        boolean post = this.zaa.post(runnable);
    }
}
