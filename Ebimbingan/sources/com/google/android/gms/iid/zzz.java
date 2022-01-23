package com.google.android.gms.iid;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

abstract class zzz<T> {
    final int what;
    final int zzcp;
    final TaskCompletionSource<T> zzcq;
    final Bundle zzcr;

    zzz(int i, int i2, Bundle bundle) {
        TaskCompletionSource<T> taskCompletionSource;
        new TaskCompletionSource<>();
        this.zzcq = taskCompletionSource;
        this.zzcp = i;
        this.what = i2;
        this.zzcr = bundle;
    }

    /* access modifiers changed from: package-private */
    public abstract void zzh(Bundle bundle);

    /* access modifiers changed from: package-private */
    public abstract boolean zzw();

    /* access modifiers changed from: package-private */
    public final void zzd(zzaa zzaa) {
        StringBuilder sb;
        zzaa zzaa2 = zzaa;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(zzaa2);
            new StringBuilder(14 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
            int d = Log.d("MessengerIpcClient", sb.append("Failing ").append(valueOf).append(" with ").append(valueOf2).toString());
        }
        this.zzcq.setException(zzaa2);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.what;
        int i2 = this.zzcp;
        boolean zzw = zzw();
        new StringBuilder(55);
        return sb.append("Request { what=").append(i).append(" id=").append(i2).append(" oneWay=false}").toString();
    }
}
