package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.api.internal.ActivityLifecycleObserver */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class C0239ActivityLifecycleObserver {
    public C0239ActivityLifecycleObserver() {
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static final C0239ActivityLifecycleObserver of(@RecentlyNonNull Activity activity) {
        C0239ActivityLifecycleObserver activityLifecycleObserver;
        new C0297zab(C0270zaa.zaa(activity));
        return activityLifecycleObserver;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public abstract C0239ActivityLifecycleObserver onStopCallOnce(@RecentlyNonNull Runnable runnable);
}
