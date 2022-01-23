package com.google.android.gms.iid;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;

public final class zzr {
    /* access modifiers changed from: private */
    public final ScheduledExecutorService zzce;
    @GuardedBy("this")
    private zzt zzcf;
    @GuardedBy("this")
    private int zzcg;
    /* access modifiers changed from: private */
    public final Context zzl;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzr(android.content.Context r11) {
        /*
            r10 = this;
            r0 = r10
            r1 = r11
            r2 = r0
            r3 = r1
            com.google.android.gms.internal.gcm.zzf r4 = com.google.android.gms.internal.gcm.zzg.zzaa()
            r5 = 1
            com.google.android.gms.common.util.concurrent.NamedThreadFactory r6 = new com.google.android.gms.common.util.concurrent.NamedThreadFactory
            r9 = r6
            r6 = r9
            r7 = r9
            java.lang.String r8 = "MessengerIpcClient"
            r7.<init>(r8)
            r7 = 9
            java.util.concurrent.ScheduledExecutorService r4 = r4.zze(r5, r6, r7)
            r2.<init>(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.iid.zzr.<init>(android.content.Context):void");
    }

    @VisibleForTesting
    private zzr(Context context, ScheduledExecutorService scheduledExecutorService) {
        zzt zzt;
        new zzt(this, (zzs) null);
        this.zzcf = zzt;
        this.zzcg = 1;
        this.zzl = context.getApplicationContext();
        this.zzce = scheduledExecutorService;
    }

    public final Task<Bundle> zzd(int i, Bundle bundle) {
        zzz zzz;
        int i2 = i;
        new zzab(zzs(), 1, bundle);
        return zzd(zzz);
    }

    private final synchronized <T> Task<T> zzd(zzz<T> zzz) {
        Task<T> task;
        zzt zzt;
        StringBuilder sb;
        zzz<T> zzz2 = zzz;
        synchronized (this) {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String valueOf = String.valueOf(zzz2);
                new StringBuilder(9 + String.valueOf(valueOf).length());
                int d = Log.d("MessengerIpcClient", sb.append("Queueing ").append(valueOf).toString());
            }
            if (!this.zzcf.zze(zzz2)) {
                new zzt(this, (zzs) null);
                this.zzcf = zzt;
                boolean zze = this.zzcf.zze(zzz2);
            }
            task = zzz2.zzcq.getTask();
        }
        return task;
    }

    private final synchronized int zzs() {
        int i;
        synchronized (this) {
            int i2 = this.zzcg;
            int i3 = i2;
            this.zzcg = i2 + 1;
            i = i3;
        }
        return i;
    }
}
