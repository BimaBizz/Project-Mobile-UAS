package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class BackgroundDetector implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    private static final BackgroundDetector zza;
    private final AtomicBoolean zzb;
    private final AtomicBoolean zzc;
    @GuardedBy("sInstance")
    private final ArrayList<BackgroundStateChangeListener> zzd;
    @GuardedBy("sInstance")
    private boolean zze = false;

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public interface BackgroundStateChangeListener {
        @KeepForSdk
        void onBackgroundStateChanged(boolean z);
    }

    static {
        BackgroundDetector backgroundDetector;
        new BackgroundDetector();
        zza = backgroundDetector;
    }

    /* JADX WARNING: Multi-variable type inference failed */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private BackgroundDetector() {
        /*
            r4 = this;
            r0 = r4
            r2 = r0
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = r2
            r2 = r1
            r2.<init>()
            r2 = r0
            r3 = r1
            r2.zzb = r3
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = r2
            r2 = r1
            r2.<init>()
            r2 = r0
            r3 = r1
            r2.zzc = r3
            java.util.ArrayList r2 = new java.util.ArrayList
            r1 = r2
            r2 = r1
            r2.<init>()
            r2 = r0
            r3 = r1
            r2.zzd = r3
            r2 = r0
            r3 = 0
            r2.zze = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BackgroundDetector.<init>():void");
    }

    @RecentlyNonNull
    @KeepForSdk
    public static BackgroundDetector getInstance() {
        return zza;
    }

    @KeepForSdk
    public static void initialize(@RecentlyNonNull Application application) {
        Application application2 = application;
        BackgroundDetector backgroundDetector = zza;
        synchronized (backgroundDetector) {
            try {
                if (!zza.zze) {
                    application2.registerActivityLifecycleCallbacks(zza);
                    application2.registerComponentCallbacks(zza);
                    zza.zze = true;
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                BackgroundDetector backgroundDetector2 = backgroundDetector;
                throw th2;
            }
        }
    }

    private final void zza(boolean z) {
        boolean z2 = z;
        BackgroundDetector backgroundDetector = zza;
        synchronized (backgroundDetector) {
            try {
                Iterator<BackgroundStateChangeListener> it = this.zzd.iterator();
                while (it.hasNext()) {
                    it.next().onBackgroundStateChanged(z2);
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                BackgroundDetector backgroundDetector2 = backgroundDetector;
                throw th2;
            }
        }
    }

    @KeepForSdk
    public void addListener(@RecentlyNonNull BackgroundStateChangeListener backgroundStateChangeListener) {
        BackgroundStateChangeListener backgroundStateChangeListener2 = backgroundStateChangeListener;
        BackgroundDetector backgroundDetector = zza;
        synchronized (backgroundDetector) {
            try {
                boolean add = this.zzd.add(backgroundStateChangeListener2);
            } catch (Throwable th) {
                Throwable th2 = th;
                BackgroundDetector backgroundDetector2 = backgroundDetector;
                throw th2;
            }
        }
    }

    @KeepForSdk
    public boolean isInBackground() {
        return this.zzb.get();
    }

    public final void onActivityCreated(@RecentlyNonNull Activity activity, @Nullable Bundle bundle) {
        Activity activity2 = activity;
        Bundle bundle2 = bundle;
        boolean compareAndSet = this.zzb.compareAndSet(true, false);
        this.zzc.set(true);
        if (compareAndSet) {
            zza(false);
        }
    }

    public final void onActivityDestroyed(@RecentlyNonNull Activity activity) {
    }

    public final void onActivityPaused(@RecentlyNonNull Activity activity) {
    }

    public final void onActivityResumed(@RecentlyNonNull Activity activity) {
        Activity activity2 = activity;
        boolean compareAndSet = this.zzb.compareAndSet(true, false);
        this.zzc.set(true);
        if (compareAndSet) {
            zza(false);
        }
    }

    public final void onActivitySaveInstanceState(@RecentlyNonNull Activity activity, @RecentlyNonNull Bundle bundle) {
    }

    public final void onActivityStarted(@RecentlyNonNull Activity activity) {
    }

    public final void onActivityStopped(@RecentlyNonNull Activity activity) {
    }

    public final void onConfigurationChanged(@RecentlyNonNull Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.zzb.compareAndSet(false, true)) {
            this.zzc.set(true);
            zza(true);
        }
    }

    @TargetApi(16)
    @KeepForSdk
    public boolean readCurrentStateIfPossible(boolean z) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo;
        boolean z2 = z;
        if (!this.zzc.get()) {
            if (!PlatformVersion.isAtLeastJellyBean()) {
                return z2;
            }
            new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.zzc.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.zzb.set(true);
            }
        }
        return isInBackground();
    }
}
