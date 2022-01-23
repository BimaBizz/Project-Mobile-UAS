package com.google.firebase.auth.internal;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.firebase_auth.zzj;
import com.google.firebase.FirebaseApp;

public final class zzv {
    /* access modifiers changed from: private */
    public static Logger zzjt;
    @VisibleForTesting
    private Handler handler;
    private final FirebaseApp zzik;
    @VisibleForTesting
    volatile long zztv;
    @VisibleForTesting
    volatile long zztw;
    @VisibleForTesting
    private long zztx = 300000;
    @VisibleForTesting
    private HandlerThread zzty;
    @VisibleForTesting
    private Runnable zztz;

    public zzv(FirebaseApp firebaseApp) {
        HandlerThread handlerThread;
        Handler handler2;
        Runnable runnable;
        zzjt.v("Initializing TokenRefresher", new Object[0]);
        this.zzik = (FirebaseApp) Preconditions.checkNotNull(firebaseApp);
        new HandlerThread("TokenRefresher", 10);
        this.zzty = handlerThread;
        this.zzty.start();
        new zzj(this.zzty.getLooper());
        this.handler = handler2;
        new zzy(this, this.zzik.getName());
        this.zztz = runnable;
    }

    public final void zzfh() {
        StringBuilder sb;
        Logger logger = zzjt;
        long j = this.zztv - this.zztx;
        new StringBuilder(43);
        logger.v(sb.append("Scheduling refresh for ").append(j).toString(), new Object[0]);
        cancel();
        this.zztw = Math.max((this.zztv - DefaultClock.getInstance().currentTimeMillis()) - this.zztx, 0) / 1000;
        boolean postDelayed = this.handler.postDelayed(this.zztz, this.zztw * 1000);
    }

    /* access modifiers changed from: package-private */
    public final void zzfi() {
        long j;
        StringBuilder sb;
        switch ((int) this.zztw) {
            case 30:
            case 60:
            case 120:
            case 240:
            case 480:
                j = 2 * this.zztw;
                break;
            case 960:
                j = 960;
                break;
            default:
                j = 30;
                break;
        }
        this.zztw = j;
        this.zztv = DefaultClock.getInstance().currentTimeMillis() + (this.zztw * 1000);
        Logger logger = zzjt;
        long j2 = this.zztv;
        new StringBuilder(43);
        logger.v(sb.append("Scheduling refresh for ").append(j2).toString(), new Object[0]);
        boolean postDelayed = this.handler.postDelayed(this.zztz, this.zztw * 1000);
    }

    public final void cancel() {
        this.handler.removeCallbacks(this.zztz);
    }

    static {
        Logger logger;
        Logger logger2 = logger;
        new Logger("TokenRefresher", new String[]{"FirebaseAuth:"});
        zzjt = logger2;
    }
}
