package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.List;

@KeepForSdk
@Deprecated
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class WakeLockTracker {
    private static WakeLockTracker zza;

    static {
        WakeLockTracker wakeLockTracker;
        new WakeLockTracker();
        zza = wakeLockTracker;
    }

    public WakeLockTracker() {
    }

    @RecentlyNonNull
    @KeepForSdk
    public static WakeLockTracker getInstance() {
        return zza;
    }

    @KeepForSdk
    public void registerAcquireEvent(@RecentlyNonNull Context context, @RecentlyNonNull Intent intent, @RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull String str3, int i, @RecentlyNonNull String str4) {
    }

    @KeepForSdk
    public void registerDeadlineEvent(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull String str3, int i, @RecentlyNonNull List<String> list, boolean z, long j) {
    }

    @KeepForSdk
    public void registerEvent(@RecentlyNonNull Context context, @RecentlyNonNull String str, int i, @RecentlyNonNull String str2, @RecentlyNonNull String str3, @RecentlyNonNull String str4, int i2, @RecentlyNonNull List<String> list) {
    }

    @KeepForSdk
    public void registerEvent(@RecentlyNonNull Context context, @RecentlyNonNull String str, int i, @RecentlyNonNull String str2, @RecentlyNonNull String str3, @RecentlyNonNull String str4, int i2, @RecentlyNonNull List<String> list, long j) {
    }

    @KeepForSdk
    public void registerReleaseEvent(@RecentlyNonNull Context context, @RecentlyNonNull Intent intent) {
    }
}
