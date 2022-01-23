package com.google.android.gms.common.util;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class Hex {
    private static final char[] zza = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final char[] zzb = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public Hex() {
    }

    @RecentlyNonNull
    @KeepForSdk
    public static String bytesToStringLowercase(@RecentlyNonNull byte[] bArr) {
        String str;
        byte[] bArr2 = bArr;
        int length = bArr2.length;
        char[] cArr = new char[(length + length)];
        int i = 0;
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            byte b = bArr2[i2] & 255;
            int i3 = i + 1;
            cArr[i] = zzb[b >>> 4];
            i = i3 + 1;
            cArr[i3] = zzb[b & 15];
        }
        new String(cArr);
        return str;
    }

    @RecentlyNonNull
    @KeepForSdk
    public static String bytesToStringUppercase(@RecentlyNonNull byte[] bArr) {
        return bytesToStringUppercase(bArr, false);
    }

    @RecentlyNonNull
    @KeepForSdk
    public static byte[] stringToBytes(@RecentlyNonNull String str) throws IllegalArgumentException {
        Throwable th;
        String str2 = str;
        int length = str2.length();
        if (length % 2 != 0) {
            new IllegalArgumentException("Hex string has odd number of characters");
            throw th;
        }
        byte[] bArr = new byte[(length / 2)];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return bArr;
            }
            int i3 = i2 + 2;
            bArr[i2 / 2] = (byte) Integer.parseInt(str2.substring(i2, i3), 16);
            i = i3;
        }
    }

    @RecentlyNonNull
    @KeepForSdk
    public static String bytesToStringUppercase(@RecentlyNonNull byte[] bArr, boolean z) {
        StringBuilder sb;
        byte[] bArr2 = bArr;
        boolean z2 = z;
        int length = bArr2.length;
        new StringBuilder(length + length);
        int i = 0;
        while (i < length && (!z2 || i != length - 1 || (bArr2[i] & 255) != 0)) {
            StringBuilder append = sb.append(zza[(bArr2[i] & 240) >>> 4]);
            StringBuilder append2 = sb.append(zza[bArr2[i] & 15]);
            i++;
        }
        return sb.toString();
    }
}
