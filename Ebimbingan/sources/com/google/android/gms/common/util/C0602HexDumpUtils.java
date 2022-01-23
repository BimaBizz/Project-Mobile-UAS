package com.google.android.gms.common.util;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.appinventor.components.runtime.util.Ev3Constants;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.util.HexDumpUtils */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0602HexDumpUtils {
    public C0602HexDumpUtils() {
    }

    @C0206KeepForSdk
    @RecentlyNullable
    public static String dump(@RecentlyNonNull byte[] bArr, int i, int i2, boolean z) {
        int length;
        int i3;
        StringBuilder sb;
        int i4;
        byte[] bArr2 = bArr;
        int i5 = i;
        int i6 = i2;
        boolean z2 = z;
        if (bArr2 == null || (length = bArr2.length) == 0 || i5 < 0 || i6 <= 0 || i5 + i6 > length) {
            return null;
        }
        if (z2) {
            i3 = 75;
        } else {
            i3 = 57;
        }
        new StringBuilder(i3 * ((i6 + 15) / 16));
        int i7 = 0;
        int i8 = 0;
        int i9 = i6;
        int i10 = i5;
        while (i9 > 0) {
            if (i7 == 0) {
                if (i6 < 65536) {
                    StringBuilder append = sb.append(String.format("%04X:", new Object[]{Integer.valueOf(i10)}));
                    i8 = i10;
                } else {
                    StringBuilder append2 = sb.append(String.format("%08X:", new Object[]{Integer.valueOf(i10)}));
                    i8 = i10;
                }
            } else if (i7 == 8) {
                StringBuilder append3 = sb.append(" -");
            }
            StringBuilder append4 = sb.append(String.format(" %02X", new Object[]{Integer.valueOf(bArr2[i10] & Ev3Constants.Opcode.TST)}));
            i9--;
            int i11 = i7 + 1;
            if (z2 && (i11 == 16 || i9 == 0)) {
                int i12 = 16 - i11;
                if (i12 > 0) {
                    for (int i13 = 0; i13 < i12; i13++) {
                        StringBuilder append5 = sb.append("   ");
                    }
                }
                if (i12 >= 8) {
                    StringBuilder append6 = sb.append("  ");
                }
                StringBuilder append7 = sb.append("  ");
                for (int i14 = 0; i14 < i11; i14++) {
                    char c = (char) bArr2[i8 + i14];
                    if (c < ' ') {
                        c = '.';
                    } else if (c > '~') {
                        c = '.';
                    }
                    StringBuilder append8 = sb.append(c);
                }
            }
            if (i11 == 16 || i9 == 0) {
                StringBuilder append9 = sb.append(10);
                i4 = 0;
            } else {
                i4 = i11;
            }
            i7 = i4;
            i10++;
        }
        return sb.toString();
    }
}
