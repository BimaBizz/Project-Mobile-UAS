package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.C0206KeepForSdk;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.util.MurmurHash3 */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C0607MurmurHash3 {
    private C0607MurmurHash3() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x00a2, code lost:
        r1 = r1 | ((r0[r5 + 1] & 255) << 8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00b4, code lost:
        r0 = (r1 | (r0[r5] & 255)) * -862048943;
        r0 = r3 ^ (((r0 << 15) | (r0 >>> 17)) * 461845907);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x007b, code lost:
        r0 = r0 ^ r2;
        r0 = (r0 ^ (r0 >>> 16)) * -2048144789;
        r0 = (r0 ^ (r0 >>> 13)) * -1028477387;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x009f, code lost:
        return r0 ^ (r0 >>> 16);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @com.google.android.gms.common.annotation.C0206KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int murmurhash3_x86_32(@androidx.annotation.RecentlyNonNull byte[] r10, int r11, int r12, int r13) {
        /*
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r6 = r1
            r7 = r2
            r8 = -4
            r7 = r7 & -4
            int r6 = r6 + r7
            r5 = r6
            r6 = r1
            r4 = r6
        L_0x000d:
            r6 = r4
            r7 = r5
            if (r6 >= r7) goto L_0x0072
            r6 = r0
            r7 = r4
            byte r6 = r6[r7]
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & 255(0xff, float:3.57E-43)
            r7 = r0
            r8 = r4
            r9 = 1
            int r8 = r8 + 1
            byte r7 = r7[r8]
            r8 = 255(0xff, float:3.57E-43)
            r7 = r7 & 255(0xff, float:3.57E-43)
            r8 = 8
            int r7 = r7 << 8
            r6 = r6 | r7
            r7 = r0
            r8 = r4
            r9 = 2
            int r8 = r8 + 2
            byte r7 = r7[r8]
            r8 = 255(0xff, float:3.57E-43)
            r7 = r7 & 255(0xff, float:3.57E-43)
            r8 = 16
            int r7 = r7 << 16
            r6 = r6 | r7
            r7 = r0
            r8 = r4
            r9 = 3
            int r8 = r8 + 3
            byte r7 = r7[r8]
            r8 = 24
            int r7 = r7 << 24
            r6 = r6 | r7
            r7 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r6 = r6 * r7
            r1 = r6
            r6 = r3
            r7 = r1
            r8 = 15
            int r7 = r7 << 15
            r8 = r1
            r9 = 17
            int r8 = r8 >>> 17
            r7 = r7 | r8
            r8 = 461845907(0x1b873593, float:2.2368498E-22)
            int r7 = r7 * r8
            r6 = r6 ^ r7
            r1 = r6
            r6 = r1
            r7 = 13
            int r6 = r6 << 13
            r7 = r1
            r8 = 19
            int r7 = r7 >>> 19
            r6 = r6 | r7
            r7 = 5
            int r6 = r6 * 5
            r7 = -430675100(0xffffffffe6546b64, float:-2.5078068E23)
            int r6 = r6 + r7
            r3 = r6
            int r4 = r4 + 4
            goto L_0x000d
        L_0x0072:
            r6 = r2
            r7 = 3
            r6 = r6 & 3
            switch(r6) {
                case 1: goto L_0x00d6;
                case 2: goto L_0x00a0;
                case 3: goto L_0x00d9;
                default: goto L_0x0079;
            }
        L_0x0079:
            r6 = r3
            r0 = r6
        L_0x007b:
            r6 = r0
            r7 = r2
            r6 = r6 ^ r7
            r0 = r6
            r6 = r0
            r7 = r0
            r8 = 16
            int r7 = r7 >>> 16
            r6 = r6 ^ r7
            r7 = -2048144789(0xffffffff85ebca6b, float:-2.217365E-35)
            int r6 = r6 * r7
            r0 = r6
            r6 = r0
            r7 = r0
            r8 = 13
            int r7 = r7 >>> 13
            r6 = r6 ^ r7
            r7 = -1028477387(0xffffffffc2b2ae35, float:-89.34025)
            int r6 = r6 * r7
            r0 = r6
            r6 = r0
            r7 = r0
            r8 = 16
            int r7 = r7 >>> 16
            r6 = r6 ^ r7
            r0 = r6
            return r0
        L_0x00a0:
            r6 = 0
            r1 = r6
        L_0x00a2:
            r6 = r1
            r7 = r0
            r8 = r5
            r9 = 1
            int r8 = r8 + 1
            byte r7 = r7[r8]
            r8 = 255(0xff, float:3.57E-43)
            r7 = r7 & 255(0xff, float:3.57E-43)
            r8 = 8
            int r7 = r7 << 8
            r6 = r6 | r7
            r1 = r6
        L_0x00b4:
            r6 = r1
            r7 = r0
            r8 = r5
            byte r7 = r7[r8]
            r8 = 255(0xff, float:3.57E-43)
            r7 = r7 & 255(0xff, float:3.57E-43)
            r6 = r6 | r7
            r7 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r6 = r6 * r7
            r0 = r6
            r6 = r3
            r7 = r0
            r8 = 15
            int r7 = r7 << 15
            r8 = r0
            r9 = 17
            int r8 = r8 >>> 17
            r7 = r7 | r8
            r8 = 461845907(0x1b873593, float:2.2368498E-22)
            int r7 = r7 * r8
            r6 = r6 ^ r7
            r0 = r6
            goto L_0x007b
        L_0x00d6:
            r6 = 0
            r1 = r6
            goto L_0x00b4
        L_0x00d9:
            r6 = r0
            r7 = r5
            r8 = 2
            int r7 = r7 + 2
            byte r6 = r6[r7]
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & 255(0xff, float:3.57E-43)
            r7 = 16
            int r6 = r6 << 16
            r1 = r6
            goto L_0x00a2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.C0607MurmurHash3.murmurhash3_x86_32(byte[], int, int, int):int");
    }
}
