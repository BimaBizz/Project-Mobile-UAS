package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class BlockingServiceConnection implements ServiceConnection {
    boolean zza = false;
    private final BlockingQueue<IBinder> zzb;

    public BlockingServiceConnection() {
        BlockingQueue<IBinder> blockingQueue;
        new LinkedBlockingQueue();
        this.zzb = blockingQueue;
    }

    @RecentlyNonNull
    @KeepForSdk
    public IBinder getService() throws InterruptedException {
        Throwable th;
        Preconditions.checkNotMainThread("BlockingServiceConnection.getService() called on main thread");
        if (this.zza) {
            new IllegalStateException("Cannot call get on this connection more than once");
            throw th;
        }
        this.zza = true;
        return this.zzb.take();
    }

    @RecentlyNonNull
    @KeepForSdk
    public IBinder getServiceWithTimeout(long j, @RecentlyNonNull TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        Throwable th;
        Throwable th2;
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        Preconditions.checkNotMainThread("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.zza) {
            new IllegalStateException("Cannot call get on this connection more than once");
            throw th2;
        }
        this.zza = true;
        IBinder poll = this.zzb.poll(j2, timeUnit2);
        if (poll != null) {
            return poll;
        }
        new TimeoutException("Timed out waiting for the service connection");
        throw th;
    }

    public final void onServiceConnected(@RecentlyNonNull ComponentName componentName, @RecentlyNonNull IBinder iBinder) {
        ComponentName componentName2 = componentName;
        boolean add = this.zzb.add(iBinder);
    }

    public final void onServiceDisconnected(@RecentlyNonNull ComponentName componentName) {
    }
}
