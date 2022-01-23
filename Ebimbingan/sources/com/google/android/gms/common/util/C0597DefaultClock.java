package com.google.android.gms.common.util;

import android.os.SystemClock;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.util.DefaultClock */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C0597DefaultClock implements C0592Clock {
    private static final C0597DefaultClock zza;

    static {
        C0597DefaultClock defaultClock;
        new C0597DefaultClock();
        zza = defaultClock;
    }

    private C0597DefaultClock() {
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static C0592Clock getInstance() {
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
