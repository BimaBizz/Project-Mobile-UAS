package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;

@C0206KeepForSdk
@Deprecated
/* renamed from: com.google.android.gms.common.stats.StatsUtils */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C0583StatsUtils {
    public C0583StatsUtils() {
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static String getEventKey(@RecentlyNonNull Context context, @RecentlyNonNull Intent intent) {
        return String.valueOf((((long) System.identityHashCode(context)) << 32) | ((long) System.identityHashCode(intent)));
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static String getEventKey(@RecentlyNonNull PowerManager.WakeLock wakeLock, @RecentlyNonNull String str) {
        String str2;
        String str3 = str;
        String valueOf = String.valueOf(String.valueOf((((long) Process.myPid()) << 32) | ((long) System.identityHashCode(wakeLock))));
        String valueOf2 = String.valueOf(true != TextUtils.isEmpty(str3) ? str3 : "");
        if (valueOf2.length() != 0) {
            str2 = valueOf.concat(valueOf2);
        } else {
            new String(valueOf);
        }
        return str2;
    }
}
