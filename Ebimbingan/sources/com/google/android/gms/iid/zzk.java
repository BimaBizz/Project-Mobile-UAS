package com.google.android.gms.iid;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;

public final class zzk implements ServiceConnection {
    private final Intent zzbp;
    private final ScheduledExecutorService zzbq;
    private final Queue<zzg> zzbr;
    private zzi zzbs;
    @GuardedBy("this")
    private boolean zzbt;
    private final Context zzl;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzk(android.content.Context r14, java.lang.String r15) {
        /*
            r13 = this;
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r0
            r4 = r1
            r5 = r2
            java.util.concurrent.ScheduledThreadPoolExecutor r6 = new java.util.concurrent.ScheduledThreadPoolExecutor
            r12 = r6
            r6 = r12
            r7 = r12
            r8 = 0
            com.google.android.gms.common.util.concurrent.NamedThreadFactory r9 = new com.google.android.gms.common.util.concurrent.NamedThreadFactory
            r12 = r9
            r9 = r12
            r10 = r12
            java.lang.String r11 = "EnhancedIntentService"
            r10.<init>(r11)
            r7.<init>(r8, r9)
            r3.<init>(r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.iid.zzk.<init>(android.content.Context, java.lang.String):void");
    }

    @VisibleForTesting
    private zzk(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        Queue<zzg> queue;
        Intent intent;
        new ArrayDeque();
        this.zzbr = queue;
        this.zzbt = false;
        this.zzl = context.getApplicationContext();
        new Intent(str);
        this.zzbp = intent.setPackage(this.zzl.getPackageName());
        this.zzbq = scheduledExecutorService;
    }

    public final synchronized void zzd(Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        Object obj;
        Intent intent2 = intent;
        BroadcastReceiver.PendingResult pendingResult2 = pendingResult;
        synchronized (this) {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                int d = Log.d("EnhancedIntentService", "new intent queued in the bind-strategy delivery");
            }
            new zzg(intent2, pendingResult2, this.zzbq);
            boolean add = this.zzbr.add(obj);
            zzm();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0072, code lost:
        if (android.util.Log.isLoggable("EnhancedIntentService", 3) == false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007a, code lost:
        if (r2.zzbt != false) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007c, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007d, code lost:
        new java.lang.StringBuilder(39);
        r4 = android.util.Log.d("EnhancedIntentService", r11.append("binder is dead. start connection? ").append(r5).toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a5, code lost:
        if (r2.zzbt != false) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a7, code lost:
        r2.zzbt = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bc, code lost:
        if (com.google.android.gms.common.stats.C0580ConnectionTracker.getInstance().bindService(r2.zzl, r2.zzbp, r2, 65) == false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c0, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r4 = android.util.Log.e("EnhancedIntentService", "binding to the service failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d5, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d6, code lost:
        r4 = android.util.Log.e("EnhancedIntentService", "Exception while binding the service", r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void zzm() {
        /*
            r12 = this;
            r0 = r12
            r9 = r12
            monitor-enter(r9)
            java.lang.String r4 = "EnhancedIntentService"
            r5 = 3
            boolean r4 = android.util.Log.isLoggable(r4, r5)     // Catch:{ all -> 0x00e4 }
            if (r4 == 0) goto L_0x0017
            java.lang.String r4 = "EnhancedIntentService"
            java.lang.String r5 = "flush queue called"
            int r4 = android.util.Log.d(r4, r5)     // Catch:{ all -> 0x00e4 }
        L_0x0017:
            r4 = r0
            java.util.Queue<com.google.android.gms.iid.zzg> r4 = r4.zzbr     // Catch:{ all -> 0x00e4 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x00e4 }
            if (r4 != 0) goto L_0x00e3
            java.lang.String r4 = "EnhancedIntentService"
            r5 = 3
            boolean r4 = android.util.Log.isLoggable(r4, r5)     // Catch:{ all -> 0x00e4 }
            if (r4 == 0) goto L_0x0034
            java.lang.String r4 = "EnhancedIntentService"
            java.lang.String r5 = "found intent to be delivered"
            int r4 = android.util.Log.d(r4, r5)     // Catch:{ all -> 0x00e4 }
        L_0x0034:
            r4 = r0
            com.google.android.gms.iid.zzi r4 = r4.zzbs     // Catch:{ all -> 0x00e4 }
            if (r4 == 0) goto L_0x0068
            r4 = r0
            com.google.android.gms.iid.zzi r4 = r4.zzbs     // Catch:{ all -> 0x00e4 }
            boolean r4 = r4.isBinderAlive()     // Catch:{ all -> 0x00e4 }
            if (r4 == 0) goto L_0x0068
            java.lang.String r4 = "EnhancedIntentService"
            r5 = 3
            boolean r4 = android.util.Log.isLoggable(r4, r5)     // Catch:{ all -> 0x00e4 }
            if (r4 == 0) goto L_0x0056
            java.lang.String r4 = "EnhancedIntentService"
            java.lang.String r5 = "binder is alive, sending the intent."
            int r4 = android.util.Log.d(r4, r5)     // Catch:{ all -> 0x00e4 }
        L_0x0056:
            r4 = r0
            java.util.Queue<com.google.android.gms.iid.zzg> r4 = r4.zzbr     // Catch:{ all -> 0x00e4 }
            java.lang.Object r4 = r4.poll()     // Catch:{ all -> 0x00e4 }
            com.google.android.gms.iid.zzg r4 = (com.google.android.gms.iid.zzg) r4     // Catch:{ all -> 0x00e4 }
            r1 = r4
            r4 = r0
            com.google.android.gms.iid.zzi r4 = r4.zzbs     // Catch:{ all -> 0x00e4 }
            r5 = r1
            r4.zzd((com.google.android.gms.iid.zzg) r5)     // Catch:{ all -> 0x00e4 }
            goto L_0x0017
        L_0x0068:
            r4 = r0
            r2 = r4
            java.lang.String r4 = "EnhancedIntentService"
            r5 = 3
            boolean r4 = android.util.Log.isLoggable(r4, r5)     // Catch:{ all -> 0x00e4 }
            if (r4 == 0) goto L_0x00a2
            java.lang.String r4 = "EnhancedIntentService"
            r5 = r2
            boolean r5 = r5.zzbt     // Catch:{ all -> 0x00e4 }
            if (r5 != 0) goto L_0x00c0
            r5 = 1
        L_0x007d:
            r3 = r5
            r5 = 39
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e4 }
            r10 = r5
            r11 = r6
            r5 = r11
            r6 = r10
            r7 = r11
            r10 = r6
            r11 = r7
            r6 = r11
            r7 = r10
            r6.<init>(r7)     // Catch:{ all -> 0x00e4 }
            java.lang.String r6 = "binder is dead. start connection? "
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch:{ all -> 0x00e4 }
            r6 = r3
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch:{ all -> 0x00e4 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00e4 }
            int r4 = android.util.Log.d(r4, r5)     // Catch:{ all -> 0x00e4 }
        L_0x00a2:
            r4 = r2
            boolean r4 = r4.zzbt     // Catch:{ all -> 0x00e4 }
            if (r4 != 0) goto L_0x00d4
            r4 = r2
            r5 = 1
            r4.zzbt = r5     // Catch:{ all -> 0x00e4 }
            com.google.android.gms.common.stats.ConnectionTracker r4 = com.google.android.gms.common.stats.C0580ConnectionTracker.getInstance()     // Catch:{ SecurityException -> 0x00d5 }
            r5 = r2
            android.content.Context r5 = r5.zzl     // Catch:{ SecurityException -> 0x00d5 }
            r6 = r2
            android.content.Intent r6 = r6.zzbp     // Catch:{ SecurityException -> 0x00d5 }
            r7 = r2
            r8 = 65
            boolean r4 = r4.bindService(r5, r6, r7, r8)     // Catch:{ SecurityException -> 0x00d5 }
            if (r4 == 0) goto L_0x00c2
        L_0x00be:
            monitor-exit(r9)
            return
        L_0x00c0:
            r5 = 0
            goto L_0x007d
        L_0x00c2:
            java.lang.String r4 = "EnhancedIntentService"
            java.lang.String r5 = "binding to the service failed"
            int r4 = android.util.Log.e(r4, r5)     // Catch:{ SecurityException -> 0x00d5 }
        L_0x00cc:
            r4 = r2
            r5 = 0
            r4.zzbt = r5     // Catch:{ all -> 0x00e4 }
            r4 = r2
            r4.zzn()     // Catch:{ all -> 0x00e4 }
        L_0x00d4:
            goto L_0x00be
        L_0x00d5:
            r4 = move-exception
            r3 = r4
            java.lang.String r4 = "EnhancedIntentService"
            java.lang.String r5 = "Exception while binding the service"
            r6 = r3
            int r4 = android.util.Log.e(r4, r5, r6)     // Catch:{ all -> 0x00e4 }
            goto L_0x00cc
        L_0x00e3:
            goto L_0x00be
        L_0x00e4:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.iid.zzk.zzm():void");
    }

    @GuardedBy("this")
    private final void zzn() {
        while (!this.zzbr.isEmpty()) {
            this.zzbr.poll().finish();
        }
    }

    /* JADX INFO: finally extract failed */
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        StringBuilder sb;
        ComponentName componentName2 = componentName;
        IBinder iBinder2 = iBinder;
        synchronized (this) {
            try {
                this.zzbt = false;
                this.zzbs = (zzi) iBinder2;
                if (Log.isLoggable("EnhancedIntentService", 3)) {
                    String valueOf = String.valueOf(componentName2);
                    new StringBuilder(20 + String.valueOf(valueOf).length());
                    int d = Log.d("EnhancedIntentService", sb.append("onServiceConnected: ").append(valueOf).toString());
                }
                if (iBinder2 == null) {
                    int e = Log.e("EnhancedIntentService", "Null service connection");
                    zzn();
                } else {
                    zzm();
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                throw th2;
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        StringBuilder sb;
        ComponentName componentName2 = componentName;
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            String valueOf = String.valueOf(componentName2);
            new StringBuilder(23 + String.valueOf(valueOf).length());
            int d = Log.d("EnhancedIntentService", sb.append("onServiceDisconnected: ").append(valueOf).toString());
        }
        zzm();
    }
}
