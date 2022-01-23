package com.google.android.gms.common.util;

import android.database.CharArrayBuffer;
import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import java.io.ByteArrayOutputStream;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.util.DataUtils */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0596DataUtils {
    public C0596DataUtils() {
    }

    @C0206KeepForSdk
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
    @C0206KeepForSdk
    public static byte[] loadImageBytes(@RecentlyNonNull Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream;
        new ByteArrayOutputStream();
        boolean compress = bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
