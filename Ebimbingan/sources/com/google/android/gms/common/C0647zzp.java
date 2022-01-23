package com.google.android.gms.common;

/* renamed from: com.google.android.gms.common.zzp */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
final class C0647zzp {
    static int zza(int i) {
        int i2 = i;
        int[] iArr = {1, 2, 3, 4, 5};
        int i3 = 0;
        while (i3 < 5) {
            int i4 = iArr[i3];
            int i5 = i4 - 1;
            if (i4 == 0) {
                throw null;
            } else if (i5 == i2) {
                return i4;
            } else {
                i3++;
            }
        }
        return 1;
    }
}
