package com.google.android.gms.iid;

import android.os.Binder;
import android.os.Process;
import android.util.Log;

public final class zzi extends Binder {
    /* access modifiers changed from: private */
    public final zze zzbm;

    zzi(zze zze) {
        this.zzbm = zze;
    }

    public final void zzd(zzg zzg) {
        Runnable runnable;
        Throwable th;
        zzg zzg2 = zzg;
        if (Binder.getCallingUid() != Process.myUid()) {
            Throwable th2 = th;
            new SecurityException("Binding only allowed within app");
            throw th2;
        }
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            int d = Log.d("EnhancedIntentService", "service received new intent via bind strategy");
        }
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            int d2 = Log.d("EnhancedIntentService", "intent being queued for bg execution");
        }
        new zzj(this, zzg2);
        this.zzbm.zzbb.execute(runnable);
    }
}
