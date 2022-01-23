package com.google.android.gms.common.util;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class SharedPreferencesUtils {
    private SharedPreferencesUtils() {
    }

    @KeepForSdk
    @Deprecated
    public static void publishWorldReadableSharedPreferences(@RecentlyNonNull Context context, @RecentlyNonNull SharedPreferences.Editor editor, @RecentlyNonNull String str) {
        Throwable th;
        Context context2 = context;
        SharedPreferences.Editor editor2 = editor;
        String str2 = str;
        new IllegalStateException("world-readable shared preferences should only be used by apk");
        throw th;
    }
}
