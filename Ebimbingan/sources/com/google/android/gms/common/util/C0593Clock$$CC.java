package com.google.android.gms.common.util;

import android.os.SystemClock;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;

/* renamed from: com.google.android.gms.common.util.Clock$$CC */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public abstract /* synthetic */ class C0593Clock$$CC {
    @C0206KeepForSdk
    public static long currentThreadTimeMillis$$dflt$$(@RecentlyNonNull C0592Clock clock) {
        C0592Clock clock2 = clock;
        return SystemClock.currentThreadTimeMillis();
    }
}
