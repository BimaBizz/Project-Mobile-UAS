package com.google.android.gms.common.util;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import java.util.regex.Pattern;

@C0206KeepForSdk
@C0617VisibleForTesting
/* renamed from: com.google.android.gms.common.util.Strings */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C0615Strings {
    private static final Pattern zza = Pattern.compile("\\$\\{(.*?)\\}");

    private C0615Strings() {
    }

    @C0206KeepForSdk
    @RecentlyNullable
    public static String emptyToNull(@Nullable String str) {
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        return str2;
    }

    @C0206KeepForSdk
    public static boolean isEmptyOrWhitespace(@Nullable String str) {
        String str2 = str;
        return str2 == null || str2.trim().isEmpty();
    }
}
