package com.google.android.gms.common.util.concurrent;

import android.os.Process;

/* renamed from: com.google.android.gms.common.util.concurrent.zza */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
final class C0622zza implements Runnable {
    private final Runnable zza;

    public C0622zza(Runnable runnable, int i) {
        int i2 = i;
        this.zza = runnable;
    }

    public final void run() {
        Process.setThreadPriority(0);
        this.zza.run();
    }
}
