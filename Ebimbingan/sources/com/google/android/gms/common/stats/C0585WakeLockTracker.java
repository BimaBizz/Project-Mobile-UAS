package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import java.util.List;

@C0206KeepForSdk
@Deprecated
/* renamed from: com.google.android.gms.common.stats.WakeLockTracker */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C0585WakeLockTracker {
    private static C0585WakeLockTracker zza;

    static {
        C0585WakeLockTracker wakeLockTracker;
        new C0585WakeLockTracker();
        zza = wakeLockTracker;
    }

    public C0585WakeLockTracker() {
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static C0585WakeLockTracker getInstance() {
        return zza;
    }

    @C0206KeepForSdk
    public void registerAcquireEvent(@RecentlyNonNull Context context, @RecentlyNonNull Intent intent, @RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull String str3, int i, @RecentlyNonNull String str4) {
    }

    @C0206KeepForSdk
    public void registerDeadlineEvent(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull String str3, int i, @RecentlyNonNull List<String> list, boolean z, long j) {
    }

    @C0206KeepForSdk
    public void registerEvent(@RecentlyNonNull Context context, @RecentlyNonNull String str, int i, @RecentlyNonNull String str2, @RecentlyNonNull String str3, @RecentlyNonNull String str4, int i2, @RecentlyNonNull List<String> list) {
    }

    @C0206KeepForSdk
    public void registerEvent(@RecentlyNonNull Context context, @RecentlyNonNull String str, int i, @RecentlyNonNull String str2, @RecentlyNonNull String str3, @RecentlyNonNull String str4, int i2, @RecentlyNonNull List<String> list, long j) {
    }

    @C0206KeepForSdk
    public void registerReleaseEvent(@RecentlyNonNull Context context, @RecentlyNonNull Intent intent) {
    }
}
