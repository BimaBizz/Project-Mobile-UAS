package com.google.android.gms.iid;

import android.content.BroadcastReceiver;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class zzg {
    final Intent intent;
    private final BroadcastReceiver.PendingResult zzbi;
    private boolean zzbj = false;
    private final ScheduledFuture<?> zzbk;

    zzg(Intent intent2, BroadcastReceiver.PendingResult pendingResult, ScheduledExecutorService scheduledExecutorService) {
        Runnable runnable;
        Intent intent3 = intent2;
        this.intent = intent3;
        this.zzbi = pendingResult;
        new zzh(this, intent3);
        this.zzbk = scheduledExecutorService.schedule(runnable, 9500, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void finish() {
        synchronized (this) {
            if (!this.zzbj) {
                this.zzbi.finish();
                boolean cancel = this.zzbk.cancel(false);
                this.zzbj = true;
            }
        }
    }
}
