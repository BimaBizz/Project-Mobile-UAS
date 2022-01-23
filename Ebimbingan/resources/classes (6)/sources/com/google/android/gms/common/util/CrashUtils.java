package com.google.android.gms.common.util;

import android.content.Context;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class CrashUtils {
    private static final String[] zza = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    public CrashUtils() {
    }

    @KeepForSdk
    public static boolean addDynamiteErrorToDropBox(@RecentlyNonNull Context context, @RecentlyNonNull Throwable th) {
        Throwable th2 = th;
        try {
            Object checkNotNull = Preconditions.checkNotNull(context);
            Object checkNotNull2 = Preconditions.checkNotNull(th2);
        } catch (Exception e) {
            int e2 = Log.e("CrashUtils", "Error adding exception to DropBox!", e);
        }
        return false;
    }
}
