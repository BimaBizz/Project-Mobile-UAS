package com.google.android.gms.iid;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.stats.C0580ConnectionTracker;
import com.google.android.gms.internal.gcm.zzj;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

final class zzt implements ServiceConnection {
    @GuardedBy("this")
    int state;
    final Messenger zzch;
    zzy zzci;
    @GuardedBy("this")
    final Queue<zzz<?>> zzcj;
    @GuardedBy("this")
    final SparseArray<zzz<?>> zzck;
    final /* synthetic */ zzr zzcl;

    private zzt(zzr zzr) {
        Messenger messenger;
        Handler handler;
        Handler.Callback callback;
        Queue<zzz<?>> queue;
        SparseArray<zzz<?>> sparseArray;
        this.zzcl = zzr;
        this.state = 0;
        new zzu(this);
        new zzj(Looper.getMainLooper(), callback);
        new Messenger(handler);
        this.zzch = messenger;
        new ArrayDeque();
        this.zzcj = queue;
        new SparseArray<>();
        this.zzck = sparseArray;
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean zze(zzz zzz) {
        boolean z;
        Intent intent;
        Runnable runnable;
        Throwable th;
        StringBuilder sb;
        zzz zzz2 = zzz;
        synchronized (this) {
            switch (this.state) {
                case 0:
                    boolean add = this.zzcj.add(zzz2);
                    C0446Preconditions.checkState(this.state == 0);
                    if (Log.isLoggable("MessengerIpcClient", 2)) {
                        int v = Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                    }
                    this.state = 1;
                    new Intent("com.google.android.c2dm.intent.REGISTER");
                    Intent intent2 = intent;
                    Intent intent3 = intent2;
                    Intent intent4 = intent2.setPackage("com.google.android.gms");
                    if (!C0580ConnectionTracker.getInstance().bindService(this.zzcl.zzl, intent3, this, 1)) {
                        zzd(0, "Unable to bind to service");
                    } else {
                        new zzv(this);
                        ScheduledFuture<?> schedule = this.zzcl.zzce.schedule(runnable, 30, TimeUnit.SECONDS);
                    }
                    z = true;
                    break;
                case 1:
                    boolean add2 = this.zzcj.add(zzz2);
                    z = true;
                    break;
                case 2:
                    boolean add3 = this.zzcj.add(zzz2);
                    zzt();
                    z = true;
                    break;
                case 3:
                case 4:
                    z = false;
                    break;
                default:
                    Throwable th2 = th;
                    int i = this.state;
                    new StringBuilder(26);
                    new IllegalStateException(sb.append("Unknown state: ").append(i).toString());
                    throw th2;
            }
        }
        return z;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public final boolean zzd(Message message) {
        zzaa zzaa;
        StringBuilder sb;
        StringBuilder sb2;
        Message message2 = message;
        int i = message2.arg1;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            new StringBuilder(41);
            int d = Log.d("MessengerIpcClient", sb2.append("Received response to request: ").append(i).toString());
        }
        synchronized (this) {
            try {
                zzz zzz = this.zzck.get(i);
                zzz zzz2 = zzz;
                if (zzz == null) {
                    new StringBuilder(50);
                    int w = Log.w("MessengerIpcClient", sb.append("Received response for unknown request: ").append(i).toString());
                    return true;
                }
                this.zzck.remove(i);
                zzu();
                Bundle data = message2.getData();
                zzz zzz3 = zzz2;
                if (data.getBoolean("unsupported", false)) {
                    new zzaa(4, "Not supported by GmsCore");
                    zzz3.zzd(zzaa);
                } else {
                    zzz3.zzh(data);
                }
                return true;
            } catch (Throwable th) {
                while (true) {
                    Throwable th2 = th;
                    throw th2;
                }
            }
        }
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzy zzy;
        ComponentName componentName2 = componentName;
        IBinder iBinder2 = iBinder;
        synchronized (this) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                int v = Log.v("MessengerIpcClient", "Service connected");
            }
            if (iBinder2 == null) {
                zzd(0, "Null service connection");
            } else {
                try {
                    new zzy(iBinder2);
                    this.zzci = zzy;
                    this.state = 2;
                    zzt();
                } catch (RemoteException e) {
                    zzd(0, e.getMessage());
                }
            }
        }
    }

    private final void zzt() {
        Runnable runnable;
        new zzw(this);
        this.zzcl.zzce.execute(runnable);
    }

    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        ComponentName componentName2 = componentName;
        synchronized (this) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                int v = Log.v("MessengerIpcClient", "Service disconnected");
            }
            zzd(2, "Service disconnected");
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zzd(int i, String str) {
        zzaa zzaa;
        Throwable th;
        Throwable th2;
        StringBuilder sb;
        String str2;
        String str3;
        int i2 = i;
        String str4 = str;
        synchronized (this) {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String valueOf = String.valueOf(str4);
                String str5 = valueOf;
                if (valueOf.length() != 0) {
                    str3 = "Disconnected: ".concat(str5);
                } else {
                    str3 = str2;
                    new String("Disconnected: ");
                }
                int d = Log.d("MessengerIpcClient", str3);
            }
            switch (this.state) {
                case 0:
                    Throwable th3 = th;
                    new IllegalStateException();
                    throw th3;
                case 1:
                case 2:
                    if (Log.isLoggable("MessengerIpcClient", 2)) {
                        int v = Log.v("MessengerIpcClient", "Unbinding service");
                    }
                    this.state = 4;
                    C0580ConnectionTracker.getInstance().unbindService(this.zzcl.zzl, this);
                    new zzaa(i2, str4);
                    zzaa zzaa2 = zzaa;
                    for (zzz zzd : this.zzcj) {
                        zzd.zzd(zzaa2);
                    }
                    this.zzcj.clear();
                    for (int i3 = 0; i3 < this.zzck.size(); i3++) {
                        this.zzck.valueAt(i3).zzd(zzaa2);
                    }
                    this.zzck.clear();
                    break;
                case 3:
                    this.state = 4;
                    break;
                case 4:
                    break;
                default:
                    Throwable th4 = th2;
                    int i4 = this.state;
                    new StringBuilder(26);
                    new IllegalStateException(sb.append("Unknown state: ").append(i4).toString());
                    throw th4;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zzu() {
        synchronized (this) {
            if (this.state == 2 && this.zzcj.isEmpty() && this.zzck.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    int v = Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.state = 3;
                C0580ConnectionTracker.getInstance().unbindService(this.zzcl.zzl, this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zzv() {
        synchronized (this) {
            if (this.state == 1) {
                zzd(1, "Timed out while binding");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zzg(int i) {
        StringBuilder sb;
        zzaa zzaa;
        int i2 = i;
        synchronized (this) {
            zzz zzz = this.zzck.get(i2);
            zzz zzz2 = zzz;
            if (zzz != null) {
                new StringBuilder(31);
                int w = Log.w("MessengerIpcClient", sb.append("Timing out request: ").append(i2).toString());
                this.zzck.remove(i2);
                new zzaa(3, "Timed out waiting for response");
                zzz2.zzd(zzaa);
                zzu();
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ zzt(zzr zzr, zzs zzs) {
        this(zzr);
        zzs zzs2 = zzs;
    }
}
