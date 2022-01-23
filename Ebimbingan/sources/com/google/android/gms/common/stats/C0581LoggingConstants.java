package com.google.android.gms.common.stats;

import android.content.ComponentName;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.stats.LoggingConstants */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0581LoggingConstants {
    @RecentlyNonNull
    @C0206KeepForSdk
    @Deprecated
    public static final String EXTRA_WAKE_LOCK_KEY = "WAKE_LOCK_KEY";
    @RecentlyNonNull
    public static final ComponentName zza;

    static {
        ComponentName componentName;
        new ComponentName("com.google.android.gms", "com.google.android.gms.common.stats.GmsCoreStatsService");
        zza = componentName;
    }

    private C0581LoggingConstants() {
    }
}
