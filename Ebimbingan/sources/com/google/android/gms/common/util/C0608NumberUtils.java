package com.google.android.gms.common.util;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;

@C0206KeepForSdk
@C0617VisibleForTesting
/* renamed from: com.google.android.gms.common.util.NumberUtils */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C0608NumberUtils {
    private C0608NumberUtils() {
    }

    @C0206KeepForSdk
    public static long parseHexLong(@RecentlyNonNull String str) {
        Throwable th;
        StringBuilder sb;
        String str2 = str;
        if (str2.length() > 16) {
            new StringBuilder(String.valueOf(str2).length() + 37);
            StringBuilder append = sb.append("Invalid input: ");
            StringBuilder append2 = sb.append(str2);
            StringBuilder append3 = sb.append(" exceeds 16 characters");
            new NumberFormatException(sb.toString());
            throw th;
        } else if (str2.length() == 16) {
            return Long.parseLong(str2.substring(8), 16) | (Long.parseLong(str2.substring(0, 8), 16) << 32);
        } else {
            return Long.parseLong(str2, 16);
        }
    }
}
