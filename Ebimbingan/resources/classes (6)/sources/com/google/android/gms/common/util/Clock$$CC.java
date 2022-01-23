package com.google.android.gms.common.util;

import android.os.SystemClock;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public abstract /* synthetic */ class Clock$$CC {
    @KeepForSdk
    public static long currentThreadTimeMillis$$dflt$$(@RecentlyNonNull Clock clock) {
        Clock clock2 = clock;
        return SystemClock.currentThreadTimeMillis();
    }
}
