package com.google.android.gms.common.util;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.internal.C0452ShowFirstParty;
import com.google.appinventor.components.runtime.util.Ev3Constants;
import gnu.bytecode.Access;

@C0452ShowFirstParty
@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.util.Hex */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C0601Hex {
    private static final char[] zza = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', Access.CLASS_CONTEXT, 'D', 'E', Access.FIELD_CONTEXT};
    private static final char[] zzb = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public C0601Hex() {
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static String bytesToStringLowercase(@RecentlyNonNull byte[] bArr) {
        String str;
        byte[] bArr2 = bArr;
        int length = bArr2.length;
        char[] cArr = new char[(length + length)];
        int i = 0;
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            byte b = bArr2[i2] & Ev3Constants.Opcode.TST;
            int i3 = i + 1;
            cArr[i] = zzb[b >>> 4];
            i = i3 + 1;
            cArr[i3] = zzb[b & 15];
        }
        new String(cArr);
        return str;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static String bytesToStringUppercase(@RecentlyNonNull byte[] bArr) {
        return bytesToStringUppercase(bArr, false);
    }

    @RecentlyNonNull
    @C0206KeepForSdk
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
    @C0206KeepForSdk
    public static String bytesToStringUppercase(@RecentlyNonNull byte[] bArr, boolean z) {
        StringBuilder sb;
        byte[] bArr2 = bArr;
        boolean z2 = z;
        int length = bArr2.length;
        new StringBuilder(length + length);
        int i = 0;
        while (i < length && (!z2 || i != length - 1 || (bArr2[i] & Ev3Constants.Opcode.TST) != 0)) {
            StringBuilder append = sb.append(zza[(bArr2[i] & 240) >>> 4]);
            StringBuilder append2 = sb.append(zza[bArr2[i] & 15]);
            i++;
        }
        return sb.toString();
    }
}
