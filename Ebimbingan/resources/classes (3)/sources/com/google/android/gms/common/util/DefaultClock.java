package com.google.android.gms.common.util;

import android.os.SystemClock;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class DefaultClock implements Clock {
    private static final DefaultClock zza;

    static {
        DefaultClock defaultClock;
        new DefaultClock();
        zza = defaultClock;
    }

    private DefaultClock() {
    }

    @RecentlyNonNull
    @KeepForSdk
    public static Clock getInstance() {
        return zza;
    }

    public final long currentThreadTimeMillis() {
        return SystemClock.currentThreadTimeMillis();
    }

    public final long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    public final long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    public final long nanoTime() {
        return System.nanoTime();
    }
}
