package com.google.android.gms.common.util;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.regex.Pattern;

@KeepForSdk
@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class Strings {
    private static final Pattern zza = Pattern.compile("\\$\\{(.*?)\\}");

    private Strings() {
    }

    @KeepForSdk
    @RecentlyNullable
    public static String emptyToNull(@Nullable String str) {
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        return str2;
    }

    @KeepForSdk
    public static boolean isEmptyOrWhitespace(@Nullable String str) {
        String str2 = str;
        return str2 == null || str2.trim().isEmpty();
    }
}
