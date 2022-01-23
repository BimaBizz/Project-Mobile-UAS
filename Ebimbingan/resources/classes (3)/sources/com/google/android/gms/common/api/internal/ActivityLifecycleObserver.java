package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class ActivityLifecycleObserver {
    public ActivityLifecycleObserver() {
    }

    @RecentlyNonNull
    @KeepForSdk
    public static final ActivityLifecycleObserver of(@RecentlyNonNull Activity activity) {
        ActivityLifecycleObserver activityLifecycleObserver;
        new zab(zaa.zaa(activity));
        return activityLifecycleObserver;
    }

    @RecentlyNonNull
    @KeepForSdk
    public abstract ActivityLifecycleObserver onStopCallOnce(@RecentlyNonNull Runnable runnable);
}
