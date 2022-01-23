package com.google.android.gms.auth;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class CookieUtil {
    private CookieUtil() {
    }

    private static boolean zza(Boolean bool) {
        Boolean bool2 = bool;
        return bool2 != null && bool2.booleanValue();
    }

    public static String getCookieUrl(String str, Boolean bool) {
        StringBuilder sb;
        String str2 = str;
        String checkNotEmpty = Preconditions.checkNotEmpty(str2);
        String str3 = zza(bool) ? "https" : "http";
        new StringBuilder(3 + String.valueOf(str3).length() + String.valueOf(str2).length());
        return sb.append(str3).append("://").append(str2).toString();
    }

    public static String getCookieValue(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Long l) {
        StringBuilder sb;
        String str5 = str2;
        String str6 = str3;
        String str7 = str4;
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        Long l2 = l;
        new StringBuilder(str);
        StringBuilder append = sb.append('=');
        if (!TextUtils.isEmpty(str5)) {
            StringBuilder append2 = append.append(str5);
        }
        if (zza(bool3)) {
            StringBuilder append3 = append.append(";HttpOnly");
        }
        if (zza(bool4)) {
            StringBuilder append4 = append.append(";Secure");
        }
        if (!TextUtils.isEmpty(str6)) {
            StringBuilder append5 = append.append(";Domain=").append(str6);
        }
        if (!TextUtils.isEmpty(str7)) {
            StringBuilder append6 = append.append(";Path=").append(str7);
        }
        if (l2 != null && l2.longValue() > 0) {
            StringBuilder append7 = append.append(";Max-Age=").append(l2);
        }
        return append.toString();
    }
}
