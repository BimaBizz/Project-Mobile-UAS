package com.google.android.gms.common.util;

import android.content.Context;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.internal.C0446Preconditions;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.util.CrashUtils */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0595CrashUtils {
    private static final String[] zza = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    public C0595CrashUtils() {
    }

    @C0206KeepForSdk
    public static boolean addDynamiteErrorToDropBox(@RecentlyNonNull Context context, @RecentlyNonNull Throwable th) {
        Throwable th2 = th;
        try {
            Object checkNotNull = C0446Preconditions.checkNotNull(context);
            Object checkNotNull2 = C0446Preconditions.checkNotNull(th2);
        } catch (Exception e) {
            int e2 = Log.e("CrashUtils", "Error adding exception to DropBox!", e);
        }
        return false;
    }
}
