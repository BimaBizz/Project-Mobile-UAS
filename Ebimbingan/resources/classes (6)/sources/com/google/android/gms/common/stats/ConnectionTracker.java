package com.google.android.gms.common.stats;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzr;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.Nullable;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class ConnectionTracker {
    private static final Object zzb;
    @Nullable
    private static volatile ConnectionTracker zzc;
    @RecentlyNonNull
    @VisibleForTesting
    public ConcurrentHashMap<ServiceConnection, ServiceConnection> zza;

    static {
        Object obj;
        new Object();
        zzb = obj;
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private ConnectionTracker() {
        /*
            r4 = this;
            r0 = r4
            r2 = r0
            r2.<init>()
            java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap
            r1 = r2
            r2 = r1
            r2.<init>()
            r2 = r0
            r3 = r1
            r2.zza = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.stats.ConnectionTracker.<init>():void");
    }

    @RecentlyNonNull
    @KeepForSdk
    public static ConnectionTracker getInstance() {
        ConnectionTracker connectionTracker;
        if (zzc == null) {
            Object obj = zzb;
            synchronized (obj) {
                try {
                    if (zzc == null) {
                        new ConnectionTracker();
                        zzc = connectionTracker;
                    }
                } catch (Throwable th) {
                    while (true) {
                        Throwable th2 = th;
                        Object obj2 = obj;
                        throw th2;
                    }
                }
            }
        }
        ConnectionTracker connectionTracker2 = zzc;
        Object checkNotNull = Preconditions.checkNotNull(connectionTracker2);
        return connectionTracker2;
    }

    @SuppressLint({"UntrackedBindService"})
    private final boolean zzb(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, boolean z) {
        boolean bindService;
        Context context2 = context;
        String str2 = str;
        Intent intent2 = intent;
        ServiceConnection serviceConnection2 = serviceConnection;
        int i2 = i;
        boolean z2 = z;
        ComponentName component = intent2.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            boolean equals = "com.google.android.gms".equals(packageName);
            try {
                if ((Wrappers.packageManager(context2).getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    int w = Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        if (zzc(serviceConnection2)) {
            ServiceConnection putIfAbsent = this.zza.putIfAbsent(serviceConnection2, serviceConnection2);
            if (!(putIfAbsent == null || serviceConnection2 == putIfAbsent)) {
                int w2 = Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", new Object[]{serviceConnection2, str2, intent2.getAction()}));
            }
            try {
                boolean bindService2 = context2.bindService(intent2, serviceConnection2, i2);
                if (bindService2) {
                    bindService = bindService2;
                } else {
                    boolean remove = this.zza.remove(serviceConnection2, serviceConnection2);
                    return false;
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                boolean remove2 = this.zza.remove(serviceConnection2, serviceConnection2);
                throw th2;
            }
        } else {
            bindService = context2.bindService(intent2, serviceConnection2, i2);
        }
        return bindService;
    }

    private static boolean zzc(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof zzr);
    }

    @SuppressLint({"UntrackedBindService"})
    private static void zzd(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException e) {
        }
    }

    @KeepForSdk
    public boolean bindService(@RecentlyNonNull Context context, @RecentlyNonNull Intent intent, @RecentlyNonNull ServiceConnection serviceConnection, int i) {
        Context context2 = context;
        return zzb(context2, context2.getClass().getName(), intent, serviceConnection, i, true);
    }

    @SuppressLint({"UntrackedBindService"})
    @KeepForSdk
    public void unbindService(@RecentlyNonNull Context context, @RecentlyNonNull ServiceConnection serviceConnection) {
        Context context2 = context;
        ServiceConnection serviceConnection2 = serviceConnection;
        if (!zzc(serviceConnection2) || !this.zza.containsKey(serviceConnection2)) {
            zzd(context2, serviceConnection2);
            return;
        }
        try {
            zzd(context2, this.zza.get(serviceConnection2));
            ServiceConnection remove = this.zza.remove(serviceConnection2);
        } catch (Throwable th) {
            Throwable th2 = th;
            ServiceConnection remove2 = this.zza.remove(serviceConnection2);
            throw th2;
        }
    }

    @SuppressLint({"UntrackedBindService"})
    @KeepForSdk
    public void unbindServiceSafe(@RecentlyNonNull Context context, @RecentlyNonNull ServiceConnection serviceConnection) {
        try {
            unbindService(context, serviceConnection);
        } catch (IllegalArgumentException e) {
        }
    }

    public final boolean zza(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull Intent intent, @RecentlyNonNull ServiceConnection serviceConnection, int i) {
        return zzb(context, str, intent, serviceConnection, i, true);
    }
}
