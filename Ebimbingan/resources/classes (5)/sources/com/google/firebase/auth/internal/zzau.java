package com.google.firebase.auth.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.firebase_auth.zzj;
import java.util.concurrent.Executor;

public final class zzau implements Executor {
    private static zzau zzva;
    private Handler handler;

    private zzau() {
        Handler handler2;
        new zzj(Looper.getMainLooper());
        this.handler = handler2;
    }

    public final void execute(Runnable runnable) {
        boolean post = this.handler.post(runnable);
    }

    public static zzau zzfs() {
        return zzva;
    }

    static {
        zzau zzau;
        new zzau();
        zzva = zzau;
    }
}
