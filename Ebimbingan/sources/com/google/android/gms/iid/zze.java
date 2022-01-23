package com.google.android.gms.iid;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.C0620NamedThreadFactory;
import com.google.android.gms.internal.gcm.zzg;
import com.google.android.gms.stats.GCoreWakefulBroadcastReceiver;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

public abstract class zze extends Service {
    private final Object lock;
    @VisibleForTesting
    final ExecutorService zzbb;
    private Binder zzbc;
    private int zzbd;
    private int zzbe = 0;

    public zze() {
        ThreadFactory threadFactory;
        Object obj;
        new C0620NamedThreadFactory("EnhancedIntentService");
        this.zzbb = zzg.zzaa().zzd(threadFactory, 9);
        new Object();
        this.lock = obj;
    }

    public abstract void handleIntent(Intent intent);

    public final synchronized IBinder onBind(Intent intent) {
        Binder binder;
        Binder binder2;
        Intent intent2 = intent;
        synchronized (this) {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                int d = Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.zzbc == null) {
                new zzi(this);
                this.zzbc = binder2;
            }
            binder = this.zzbc;
        }
        return binder;
    }

    /* JADX INFO: finally extract failed */
    public final int onStartCommand(Intent intent, int i, int i2) {
        Runnable runnable;
        Intent intent2 = intent;
        int i3 = i;
        int i4 = i2;
        Object obj = this.lock;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                this.zzbd = i4;
                this.zzbe++;
                Intent intent3 = intent2;
                Intent intent4 = intent3;
                if (intent3 == null) {
                    zzf(intent2);
                    return 2;
                }
                new zzf(this, intent4, intent2);
                this.zzbb.execute(runnable);
                return 3;
            } catch (Throwable th) {
                while (true) {
                    Throwable th2 = th;
                    Object obj3 = obj2;
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    public final void zzf(Intent intent) {
        Intent intent2 = intent;
        if (intent2 != null) {
            boolean completeWakefulIntent = GCoreWakefulBroadcastReceiver.completeWakefulIntent(intent2);
        }
        Object obj = this.lock;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                this.zzbe--;
                if (this.zzbe == 0) {
                    int i = this.zzbd;
                    int i2 = i;
                    boolean stopSelfResult = stopSelfResult(i);
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj3 = obj2;
                throw th2;
            }
        }
    }
}
