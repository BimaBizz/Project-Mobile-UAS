package com.google.android.gms.common.util;

import android.database.CharArrayBuffer;
import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.io.ByteArrayOutputStream;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class DataUtils {
    public DataUtils() {
    }

    @KeepForSdk
    public static void copyStringToBuffer(@Nullable String str, @RecentlyNonNull CharArrayBuffer charArrayBuffer) {
        String str2 = str;
        CharArrayBuffer charArrayBuffer2 = charArrayBuffer;
        if (TextUtils.isEmpty(str2)) {
            charArrayBuffer2.sizeCopied = 0;
            return;
        }
        if (charArrayBuffer2.data == null || charArrayBuffer2.data.length < str2.length()) {
            charArrayBuffer2.data = str2.toCharArray();
        } else {
            str2.getChars(0, str2.length(), charArrayBuffer2.data, 0);
        }
        charArrayBuffer2.sizeCopied = str2.length();
    }

    @RecentlyNonNull
    @KeepForSdk
    public static byte[] loadImageBytes(@RecentlyNonNull Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream;
        new ByteArrayOutputStream();
        boolean compress = bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
