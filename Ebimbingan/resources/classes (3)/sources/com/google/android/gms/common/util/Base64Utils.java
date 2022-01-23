package com.google.android.gms.common.util;

import android.util.Base64;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class Base64Utils {
    public Base64Utils() {
    }

    @RecentlyNonNull
    @KeepForSdk
    public static byte[] decode(@RecentlyNonNull String str) {
        String str2 = str;
        if (str2 == null) {
            return null;
        }
        return Base64.decode(str2, 0);
    }

    @RecentlyNonNull
    @KeepForSdk
    public static byte[] decodeUrlSafe(@RecentlyNonNull String str) {
        String str2 = str;
        if (str2 == null) {
            return null;
        }
        return Base64.decode(str2, 10);
    }

    @RecentlyNonNull
    @KeepForSdk
    public static byte[] decodeUrlSafeNoPadding(@RecentlyNonNull String str) {
        String str2 = str;
        if (str2 == null) {
            return null;
        }
        return Base64.decode(str2, 11);
    }

    @RecentlyNonNull
    @KeepForSdk
    public static String encode(@RecentlyNonNull byte[] bArr) {
        byte[] bArr2 = bArr;
        if (bArr2 == null) {
            return null;
        }
        return Base64.encodeToString(bArr2, 0);
    }

    @RecentlyNonNull
    @KeepForSdk
    public static String encodeUrlSafe(@RecentlyNonNull byte[] bArr) {
        byte[] bArr2 = bArr;
        if (bArr2 == null) {
            return null;
        }
        return Base64.encodeToString(bArr2, 10);
    }

    @RecentlyNonNull
    @KeepForSdk
    public static String encodeUrlSafeNoPadding(@RecentlyNonNull byte[] bArr) {
        byte[] bArr2 = bArr;
        if (bArr2 == null) {
            return null;
        }
        return Base64.encodeToString(bArr2, 11);
    }
}
