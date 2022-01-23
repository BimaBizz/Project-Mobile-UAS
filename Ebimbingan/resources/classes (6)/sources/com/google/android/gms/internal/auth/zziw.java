package com.google.android.gms.internal.auth;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zziw<T> implements zzji<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzkg.zzc();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzis zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final boolean zzk;
    private final int[] zzl;
    private final int zzm;
    private final int zzn;
    private final zzja zzo;
    private final zzic zzp;
    private final zzka<?, ?> zzq;
    private final zzhd<?> zzr;
    private final zzip zzs;

    private zziw(int[] iArr, Object[] objArr, int i, int i2, zzis zzis, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzja zzja, zzic zzic, zzka<?, ?> zzka, zzhd<?> zzhd, zzip zzip) {
        zzis zzis2 = zzis;
        boolean z3 = z2;
        int[] iArr3 = iArr2;
        int i5 = i3;
        int i6 = i4;
        zzja zzja2 = zzja;
        zzic zzic2 = zzic;
        zzka<?, ?> zzka2 = zzka;
        zzhd<?> zzhd2 = zzhd;
        zzip zzip2 = zzip;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzis2 instanceof zzhm;
        this.zzj = z;
        this.zzh = zzhd2 != null && zzhd2.zza(zzis2);
        this.zzk = false;
        this.zzl = iArr3;
        this.zzm = i5;
        this.zzn = i6;
        this.zzo = zzja2;
        this.zzp = zzic2;
        this.zzq = zzka2;
        this.zzr = zzhd2;
        this.zzg = zzis2;
        this.zzs = zzip2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v0, resolved type: char} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> com.google.android.gms.internal.auth.zziw<T> zza(java.lang.Class<T> r72, com.google.android.gms.internal.auth.zziq r73, com.google.android.gms.internal.auth.zzja r74, com.google.android.gms.internal.auth.zzic r75, com.google.android.gms.internal.auth.zzka<?, ?> r76, com.google.android.gms.internal.auth.zzhd<?> r77, com.google.android.gms.internal.auth.zzip r78) {
        /*
            r3 = r72
            r4 = r73
            r5 = r74
            r6 = r75
            r7 = r76
            r8 = r77
            r9 = r78
            r54 = r4
            r0 = r54
            boolean r0 = r0 instanceof com.google.android.gms.internal.auth.zzjj
            r54 = r0
            if (r54 == 0) goto L_0x0a3a
            r54 = r4
            com.google.android.gms.internal.auth.zzjj r54 = (com.google.android.gms.internal.auth.zzjj) r54
            r55 = r5
            r56 = r6
            r57 = r7
            r58 = r8
            r59 = r9
            r15 = r59
            r14 = r58
            r13 = r57
            r12 = r56
            r11 = r55
            r71 = r54
            r54 = r71
            r55 = r71
            r10 = r55
            int r54 = r54.zza()
            int r55 = com.google.android.gms.internal.auth.zzhm.zze.zzi
            r0 = r54
            r1 = r55
            if (r0 != r1) goto L_0x00bd
            r54 = 1
        L_0x0046:
            r16 = r54
            r54 = r10
            java.lang.String r54 = r54.zzd()
            r71 = r54
            r54 = r71
            r55 = r71
            r17 = r55
            int r54 = r54.length()
            r18 = r54
            r54 = 0
            r19 = r54
            r54 = r17
            r55 = 0
            int r19 = r19 + 1
            char r54 = r54.charAt(r55)
            r71 = r54
            r54 = r71
            r55 = r71
            r20 = r55
            r55 = 55296(0xd800, float:7.7486E-41)
            r0 = r54
            r1 = r55
            if (r0 < r1) goto L_0x00c0
            r54 = r20
            r55 = 8191(0x1fff, float:1.1478E-41)
            r0 = r54
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            r54 = r0
            r21 = r54
            r54 = 13
            r22 = r54
        L_0x008b:
            r54 = r17
            r55 = r19
            int r19 = r19 + 1
            char r54 = r54.charAt(r55)
            r71 = r54
            r54 = r71
            r55 = r71
            r20 = r55
            r55 = 55296(0xd800, float:7.7486E-41)
            r0 = r54
            r1 = r55
            if (r0 < r1) goto L_0x00c0
            r54 = r21
            r55 = r20
            r56 = 8191(0x1fff, float:1.1478E-41)
            r0 = r55
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            r55 = r0
            r56 = r22
            int r55 = r55 << r56
            r54 = r54 | r55
            r21 = r54
            int r22 = r22 + 13
            goto L_0x008b
        L_0x00bd:
            r54 = 0
            goto L_0x0046
        L_0x00c0:
            r54 = r17
            r55 = r19
            int r19 = r19 + 1
            char r54 = r54.charAt(r55)
            r71 = r54
            r54 = r71
            r55 = r71
            r20 = r55
            r55 = 55296(0xd800, float:7.7486E-41)
            r0 = r54
            r1 = r55
            if (r0 < r1) goto L_0x0129
            r54 = r20
            r55 = 8191(0x1fff, float:1.1478E-41)
            r0 = r54
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            r54 = r0
            r22 = r54
            r54 = 13
            r23 = r54
        L_0x00eb:
            r54 = r17
            r55 = r19
            int r19 = r19 + 1
            char r54 = r54.charAt(r55)
            r71 = r54
            r54 = r71
            r55 = r71
            r20 = r55
            r55 = 55296(0xd800, float:7.7486E-41)
            r0 = r54
            r1 = r55
            if (r0 < r1) goto L_0x011d
            r54 = r22
            r55 = r20
            r56 = 8191(0x1fff, float:1.1478E-41)
            r0 = r55
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            r55 = r0
            r56 = r23
            int r55 = r55 << r56
            r54 = r54 | r55
            r22 = r54
            int r23 = r23 + 13
            goto L_0x00eb
        L_0x011d:
            r54 = r22
            r55 = r20
            r56 = r23
            int r55 = r55 << r56
            r54 = r54 | r55
            r20 = r54
        L_0x0129:
            r54 = r20
            if (r54 != 0) goto L_0x01fc
            r54 = 0
            r23 = r54
            r54 = 0
            r25 = r54
            r54 = 0
            r26 = r54
            r54 = 0
            r27 = r54
            r54 = 0
            r28 = r54
            r54 = 0
            r30 = r54
            int[] r54 = zza
            r31 = r54
            r54 = 0
            r32 = r54
        L_0x014d:
            sun.misc.Unsafe r54 = zzb
            r33 = r54
            r54 = r10
            java.lang.Object[] r54 = r54.zze()
            r34 = r54
            r54 = 0
            r35 = r54
            r54 = r10
            com.google.android.gms.internal.auth.zzis r54 = r54.zzc()
            java.lang.Class r54 = r54.getClass()
            r36 = r54
            r54 = r27
            r55 = 3
            int r54 = r54 * 3
            r0 = r54
            int[] r0 = new int[r0]
            r54 = r0
            r37 = r54
            r54 = r27
            r55 = 1
            int r54 = r54 << 1
            r0 = r54
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r54 = r0
            r38 = r54
            r54 = r30
            r39 = r54
            r54 = r30
            r55 = r28
            int r54 = r54 + r55
            r40 = r54
            r54 = 0
            r41 = r54
        L_0x0195:
            r54 = r19
            r55 = r18
            r0 = r54
            r1 = r55
            if (r0 >= r1) goto L_0x0a06
            r54 = r17
            r55 = r19
            int r19 = r19 + 1
            char r54 = r54.charAt(r55)
            r71 = r54
            r54 = r71
            r55 = r71
            r20 = r55
            r55 = 55296(0xd800, float:7.7486E-41)
            r0 = r54
            r1 = r55
            if (r0 < r1) goto L_0x0594
            r54 = r20
            r55 = 8191(0x1fff, float:1.1478E-41)
            r0 = r54
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            r54 = r0
            r45 = r54
            r54 = 13
            r46 = r54
        L_0x01ca:
            r54 = r17
            r55 = r19
            int r19 = r19 + 1
            char r54 = r54.charAt(r55)
            r71 = r54
            r54 = r71
            r55 = r71
            r20 = r55
            r55 = 55296(0xd800, float:7.7486E-41)
            r0 = r54
            r1 = r55
            if (r0 < r1) goto L_0x0588
            r54 = r45
            r55 = r20
            r56 = 8191(0x1fff, float:1.1478E-41)
            r0 = r55
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            r55 = r0
            r56 = r46
            int r55 = r55 << r56
            r54 = r54 | r55
            r45 = r54
            int r46 = r46 + 13
            goto L_0x01ca
        L_0x01fc:
            r54 = r17
            r55 = r19
            int r19 = r19 + 1
            char r54 = r54.charAt(r55)
            r71 = r54
            r54 = r71
            r55 = r71
            r20 = r55
            r55 = 55296(0xd800, float:7.7486E-41)
            r0 = r54
            r1 = r55
            if (r0 < r1) goto L_0x0265
            r54 = r20
            r55 = 8191(0x1fff, float:1.1478E-41)
            r0 = r54
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            r54 = r0
            r33 = r54
            r54 = 13
            r34 = r54
        L_0x0227:
            r54 = r17
            r55 = r19
            int r19 = r19 + 1
            char r54 = r54.charAt(r55)
            r71 = r54
            r54 = r71
            r55 = r71
            r20 = r55
            r55 = 55296(0xd800, float:7.7486E-41)
            r0 = r54
            r1 = r55
            if (r0 < r1) goto L_0x0259
            r54 = r33
            r55 = r20
            r56 = 8191(0x1fff, float:1.1478E-41)
            r0 = r55
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            r55 = r0
            r56 = r34
            int r55 = r55 << r56
            r54 = r54 | r55
            r33 = r54
            int r34 = r34 + 13
            goto L_0x0227
        L_0x0259:
            r54 = r33
            r55 = r20
            r56 = r34
            int r55 = r55 << r56
            r54 = r54 | r55
            r20 = r54
        L_0x0265:
            r54 = r20
            r23 = r54
            r54 = r17
            r55 = r19
            int r19 = r19 + 1
            char r54 = r54.charAt(r55)
            r71 = r54
            r54 = r71
            r55 = r71
            r20 = r55
            r55 = 55296(0xd800, float:7.7486E-41)
            r0 = r54
            r1 = r55
            if (r0 < r1) goto L_0x02d2
            r54 = r20
            r55 = 8191(0x1fff, float:1.1478E-41)
            r0 = r54
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            r54 = r0
            r33 = r54
            r54 = 13
            r34 = r54
        L_0x0294:
            r54 = r17
            r55 = r19
            int r19 = r19 + 1
            char r54 = r54.charAt(r55)
            r71 = r54
            r54 = r71
            r55 = r71
            r20 = r55
            r55 = 55296(0xd800, float:7.7486E-41)
            r0 = r54
            r1 = r55
            if (r0 < r1) goto L_0x02c6
            r54 = r33
            r55 = r20
            r56 = 8191(0x1fff, float:1.1478E-41)
            r0 = r55
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            r55 = r0
            r56 = r34
            int r55 = r55 << r56
            r54 = r54 | r55
            r33 = r54
            int r34 = r34 + 13
            goto L_0x0294
        L_0x02c6:
            r54 = r33
            r55 = r20
            r56 = r34
            int r55 = r55 << r56
            r54 = r54 | r55
            r20 = r54
        L_0x02d2:
            r54 = r20
            r24 = r54
            r54 = r17
            r55 = r19
            int r19 = r19 + 1
            char r54 = r54.charAt(r55)
            r71 = r54
            r54 = r71
            r55 = r71
            r20 = r55
            r55 = 55296(0xd800, float:7.7486E-41)
            r0 = r54
            r1 = r55
            if (r0 < r1) goto L_0x033f
            r54 = r20
            r55 = 8191(0x1fff, float:1.1478E-41)
            r0 = r54
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            r54 = r0
            r33 = r54
            r54 = 13
            r34 = r54
        L_0x0301:
            r54 = r17
            r55 = r19
            int r19 = r19 + 1
            char r54 = r54.charAt(r55)
            r71 = r54
            r54 = r71
            r55 = r71
            r20 = r55
            r55 = 55296(0xd800, float:7.7486E-41)
            r0 = r54
            r1 = r55
            if (r0 < r1) goto L_0x0333
            r54 = r33
            r55 = r20
            r56 = 8191(0x1fff, float:1.1478E-41)
            r0 = r55
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            r55 = r0
            r56 = r34
            int r55 = r55 << r56
            r54 = r54 | r55
            r33 = r54
            int r34 = r34 + 13
            goto L_0x0301
        L_0x0333:
            r54 = r33
            r55 = r20
            r56 = r34
            int r55 = r55 << r56
            r54 = r54 | r55
            r20 = r54
        L_0x033f:
            r54 = r20
            r25 = r54
            r54 = r17
            r55 = r19
            int r19 = r19 + 1
            char r54 = r54.charAt(r55)
            r71 = r54
            r54 = r71
            r55 = r71
            r20 = r55
            r55 = 55296(0xd800, float:7.7486E-41)
            r0 = r54
            r1 = r55
            if (r0 < r1) goto L_0x03ac
            r54 = r20
            r55 = 8191(0x1fff, float:1.1478E-41)
            r0 = r54
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            r54 = r0
            r33 = r54
            r54 = 13
            r34 = r54
        L_0x036e:
            r54 = r17
            r55 = r19
            int r19 = r19 + 1
            char r54 = r54.charAt(r55)
            r71 = r54
            r54 = r71
            r55 = r71
            r20 = r55
            r55 = 55296(0xd800, float:7.7486E-41)
            r0 = r54
            r1 = r55
            if (r0 < r1) goto L_0x03a0
            r54 = r33
            r55 = r20
            r56 = 8191(0x1fff, float:1.1478E-41)
            r0 = r55
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            r55 = r0
            r56 = r34
            int r55 = r55 << r56
            r54 = r54 | r55
            r33 = r54
            int r34 = r34 + 13
            goto L_0x036e
        L_0x03a0:
            r54 = r33
            r55 = r20
            r56 = r34
            int r55 = r55 << r56
            r54 = r54 | r55
            r20 = r54
        L_0x03ac:
            r54 = r20
            r26 = r54
            r54 = r17
            r55 = r19
            int r19 = r19 + 1
            char r54 = r54.charAt(r55)
            r71 = r54
            r54 = r71
            r55 = r71
            r20 = r55
            r55 = 55296(0xd800, float:7.7486E-41)
            r0 = r54
            r1 = r55
            if (r0 < r1) goto L_0x0419
            r54 = r20
            r55 = 8191(0x1fff, float:1.1478E-41)
            r0 = r54
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            r54 = r0
            r33 = r54
            r54 = 13
            r34 = r54
        L_0x03db:
            r54 = r17
            r55 = r19
            int r19 = r19 + 1
            char r54 = r54.charAt(r55)
            r71 = r54
            r54 = r71
            r55 = r71
            r20 = r55
            r55 = 55296(0xd800, float:7.7486E-41)
            r0 = r54
            r1 = r55
            if (r0 < r1) goto L_0x040d
            r54 = r33
            r55 = r20
            r56 = 8191(0x1fff, float:1.1478E-41)
            r0 = r55
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            r55 = r0
            r56 = r34
            int r55 = r55 << r56
            r54 = r54 | r55
            r33 = r54
            int r34 = r34 + 13
            goto L_0x03db
        L_0x040d:
            r54 = r33
            r55 = r20
            r56 = r34
            int r55 = r55 << r56
            r54 = r54 | r55
            r20 = r54
        L_0x0419:
            r54 = r20
            r27 = r54
            r54 = r17
            r55 = r19
            int r19 = r19 + 1
            char r54 = r54.charAt(r55)
            r71 = r54
            r54 = r71
            r55 = r71
            r20 = r55
            r55 = 55296(0xd800, float:7.7486E-41)
            r0 = r54
            r1 = r55
            if (r0 < r1) goto L_0x0486
            r54 = r20
            r55 = 8191(0x1fff, float:1.1478E-41)
            r0 = r54
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            r54 = r0
            r33 = r54
            r54 = 13
            r34 = r54
        L_0x0448:
            r54 = r17
            r55 = r19
            int r19 = r19 + 1
            char r54 = r54.charAt(r55)
            r71 = r54
            r54 = r71
            r55 = r71
            r20 = r55
            r55 = 55296(0xd800, float:7.7486E-41)
            r0 = r54
            r1 = r55
            if (r0 < r1) goto L_0x047a
            r54 = r33
            r55 = r20
            r56 = 8191(0x1fff, float:1.1478E-41)
            r0 = r55
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            r55 = r0
            r56 = r34
            int r55 = r55 << r56
            r54 = r54 | r55
            r33 = r54
            int r34 = r34 + 13
            goto L_0x0448
        L_0x047a:
            r54 = r33
            r55 = r20
            r56 = r34
            int r55 = r55 << r56
            r54 = r54 | r55
            r20 = r54
        L_0x0486:
            r54 = r20
            r28 = r54
            r54 = r17
            r55 = r19
            int r19 = r19 + 1
            char r54 = r54.charAt(r55)
            r71 = r54
            r54 = r71
            r55 = r71
            r20 = r55
            r55 = 55296(0xd800, float:7.7486E-41)
            r0 = r54
            r1 = r55
            if (r0 < r1) goto L_0x04f3
            r54 = r20
            r55 = 8191(0x1fff, float:1.1478E-41)
            r0 = r54
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            r54 = r0
            r33 = r54
            r54 = 13
            r34 = r54
        L_0x04b5:
            r54 = r17
            r55 = r19
            int r19 = r19 + 1
            char r54 = r54.charAt(r55)
            r71 = r54
            r54 = r71
            r55 = r71
            r20 = r55
            r55 = 55296(0xd800, float:7.7486E-41)
            r0 = r54
            r1 = r55
            if (r0 < r1) goto L_0x04e7
            r54 = r33
            r55 = r20
            r56 = 8191(0x1fff, float:1.1478E-41)
            r0 = r55
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            r55 = r0
            r56 = r34
            int r55 = r55 << r56
            r54 = r54 | r55
            r33 = r54
            int r34 = r34 + 13
            goto L_0x04b5
        L_0x04e7:
            r54 = r33
            r55 = r20
            r56 = r34
            int r55 = r55 << r56
            r54 = r54 | r55
            r20 = r54
        L_0x04f3:
            r54 = r20
            r29 = r54
            r54 = r17
            r55 = r19
            int r19 = r19 + 1
            char r54 = r54.charAt(r55)
            r71 = r54
            r54 = r71
            r55 = r71
            r20 = r55
            r55 = 55296(0xd800, float:7.7486E-41)
            r0 = r54
            r1 = r55
            if (r0 < r1) goto L_0x0560
            r54 = r20
            r55 = 8191(0x1fff, float:1.1478E-41)
            r0 = r54
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            r54 = r0
            r33 = r54
            r54 = 13
            r34 = r54
        L_0x0522:
            r54 = r17
            r55 = r19
            int r19 = r19 + 1
            char r54 = r54.charAt(r55)
            r71 = r54
            r54 = r71
            r55 = r71
            r20 = r55
            r55 = 55296(0xd800, float:7.7486E-41)
            r0 = r54
            r1 = r55
            if (r0 < r1) goto L_0x0554
            r54 = r33
            r55 = r20
            r56 = 8191(0x1fff, float:1.1478E-41)
            r0 = r55
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            r55 = r0
            r56 = r34
            int r55 = r55 << r56
            r54 = r54 | r55
            r33 = r54
            int r34 = r34 + 13
            goto L_0x0522
        L_0x0554:
            r54 = r33
            r55 = r20
            r56 = r34
            int r55 = r55 << r56
            r54 = r54 | r55
            r20 = r54
        L_0x0560:
            r54 = r20
            r71 = r54
            r54 = r71
            r55 = r71
            r30 = r55
            r55 = r28
            int r54 = r54 + r55
            r55 = r29
            int r54 = r54 + r55
            r0 = r54
            int[] r0 = new int[r0]
            r54 = r0
            r31 = r54
            r54 = r23
            r55 = 1
            int r54 = r54 << 1
            r55 = r24
            int r54 = r54 + r55
            r32 = r54
            goto L_0x014d
        L_0x0588:
            r54 = r45
            r55 = r20
            r56 = r46
            int r55 = r55 << r56
            r54 = r54 | r55
            r20 = r54
        L_0x0594:
            r54 = r20
            r42 = r54
            r54 = r17
            r55 = r19
            int r19 = r19 + 1
            char r54 = r54.charAt(r55)
            r71 = r54
            r54 = r71
            r55 = r71
            r20 = r55
            r55 = 55296(0xd800, float:7.7486E-41)
            r0 = r54
            r1 = r55
            if (r0 < r1) goto L_0x0601
            r54 = r20
            r55 = 8191(0x1fff, float:1.1478E-41)
            r0 = r54
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            r54 = r0
            r45 = r54
            r54 = 13
            r46 = r54
        L_0x05c3:
            r54 = r17
            r55 = r19
            int r19 = r19 + 1
            char r54 = r54.charAt(r55)
            r71 = r54
            r54 = r71
            r55 = r71
            r20 = r55
            r55 = 55296(0xd800, float:7.7486E-41)
            r0 = r54
            r1 = r55
            if (r0 < r1) goto L_0x05f5
            r54 = r45
            r55 = r20
            r56 = 8191(0x1fff, float:1.1478E-41)
            r0 = r55
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            r55 = r0
            r56 = r46
            int r55 = r55 << r56
            r54 = r54 | r55
            r45 = r54
            int r46 = r46 + 13
            goto L_0x05c3
        L_0x05f5:
            r54 = r45
            r55 = r20
            r56 = r46
            int r55 = r55 << r56
            r54 = r54 | r55
            r20 = r54
        L_0x0601:
            r54 = r20
            r71 = r54
            r54 = r71
            r55 = r71
            r43 = r55
            r55 = 255(0xff, float:3.57E-43)
            r0 = r54
            r0 = r0 & 255(0xff, float:3.57E-43)
            r54 = r0
            r44 = r54
            r54 = r43
            r55 = 1024(0x400, float:1.435E-42)
            r0 = r54
            r0 = r0 & 1024(0x400, float:1.435E-42)
            r54 = r0
            if (r54 == 0) goto L_0x062b
            r54 = r31
            r55 = r35
            int r35 = r35 + 1
            r56 = r41
            r54[r55] = r56
        L_0x062b:
            r54 = r44
            r55 = 51
            r0 = r54
            r1 = r55
            if (r0 < r1) goto L_0x07e6
            r54 = r17
            r55 = r19
            int r19 = r19 + 1
            char r54 = r54.charAt(r55)
            r71 = r54
            r54 = r71
            r55 = r71
            r20 = r55
            r55 = 55296(0xd800, float:7.7486E-41)
            r0 = r54
            r1 = r55
            if (r0 < r1) goto L_0x069e
            r54 = r20
            r55 = 8191(0x1fff, float:1.1478E-41)
            r0 = r54
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            r54 = r0
            r48 = r54
            r54 = 13
            r49 = r54
        L_0x0660:
            r54 = r17
            r55 = r19
            int r19 = r19 + 1
            char r54 = r54.charAt(r55)
            r71 = r54
            r54 = r71
            r55 = r71
            r20 = r55
            r55 = 55296(0xd800, float:7.7486E-41)
            r0 = r54
            r1 = r55
            if (r0 < r1) goto L_0x0692
            r54 = r48
            r55 = r20
            r56 = 8191(0x1fff, float:1.1478E-41)
            r0 = r55
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            r55 = r0
            r56 = r49
            int r55 = r55 << r56
            r54 = r54 | r55
            r48 = r54
            int r49 = r49 + 13
            goto L_0x0660
        L_0x0692:
            r54 = r48
            r55 = r20
            r56 = r49
            int r55 = r55 << r56
            r54 = r54 | r55
            r20 = r54
        L_0x069e:
            r54 = r20
            r48 = r54
            r54 = r44
            r55 = 51
            int r54 = r54 + -51
            r71 = r54
            r54 = r71
            r55 = r71
            r49 = r55
            r55 = 9
            r0 = r54
            r1 = r55
            if (r0 == r1) goto L_0x06c2
            r54 = r49
            r55 = 17
            r0 = r54
            r1 = r55
            if (r0 != r1) goto L_0x0790
        L_0x06c2:
            r54 = r38
            r55 = r41
            r56 = 3
            int r55 = r55 / 3
            r56 = 1
            int r55 = r55 << 1
            r56 = 1
            int r55 = r55 + 1
            r56 = r34
            r57 = r32
            int r32 = r32 + 1
            r56 = r56[r57]
            r54[r55] = r56
        L_0x06dc:
            r54 = r48
            r55 = 1
            int r54 = r54 << 1
            r51 = r54
            r54 = r34
            r55 = r51
            r54 = r54[r55]
            r71 = r54
            r54 = r71
            r55 = r71
            r52 = r55
            r0 = r54
            boolean r0 = r0 instanceof java.lang.reflect.Field
            r54 = r0
            if (r54 == 0) goto L_0x07ba
            r54 = r52
            java.lang.reflect.Field r54 = (java.lang.reflect.Field) r54
            r50 = r54
        L_0x0700:
            r54 = r33
            r55 = r50
            long r54 = r54.objectFieldOffset(r55)
            r0 = r54
            int r0 = (int) r0
            r54 = r0
            r45 = r54
            int r51 = r51 + 1
            r54 = r34
            r55 = r51
            r54 = r54[r55]
            r71 = r54
            r54 = r71
            r55 = r71
            r52 = r55
            r0 = r54
            boolean r0 = r0 instanceof java.lang.reflect.Field
            r54 = r0
            if (r54 == 0) goto L_0x07d0
            r54 = r52
            java.lang.reflect.Field r54 = (java.lang.reflect.Field) r54
            r53 = r54
        L_0x072d:
            r54 = r33
            r55 = r53
            long r54 = r54.objectFieldOffset(r55)
            r0 = r54
            int r0 = (int) r0
            r54 = r0
            r47 = r54
            r54 = 0
            r46 = r54
        L_0x0740:
            r54 = r37
            r55 = r41
            int r41 = r41 + 1
            r56 = r42
            r54[r55] = r56
            r54 = r37
            r55 = r41
            int r41 = r41 + 1
            r56 = r43
            r57 = 512(0x200, float:7.175E-43)
            r0 = r56
            r0 = r0 & 512(0x200, float:7.175E-43)
            r56 = r0
            if (r56 == 0) goto L_0x09fe
            r56 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x075e:
            r57 = r43
            r58 = 256(0x100, float:3.59E-43)
            r0 = r57
            r0 = r0 & 256(0x100, float:3.59E-43)
            r57 = r0
            if (r57 == 0) goto L_0x0a02
            r57 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x076c:
            r56 = r56 | r57
            r57 = r44
            r58 = 20
            int r57 = r57 << 20
            r56 = r56 | r57
            r57 = r45
            r56 = r56 | r57
            r54[r55] = r56
            r54 = r37
            r55 = r41
            int r41 = r41 + 1
            r56 = r46
            r57 = 20
            int r56 = r56 << 20
            r57 = r47
            r56 = r56 | r57
            r54[r55] = r56
            goto L_0x0195
        L_0x0790:
            r54 = r49
            r55 = 12
            r0 = r54
            r1 = r55
            if (r0 != r1) goto L_0x06dc
            r54 = r16
            if (r54 != 0) goto L_0x06dc
            r54 = r38
            r55 = r41
            r56 = 3
            int r55 = r55 / 3
            r56 = 1
            int r55 = r55 << 1
            r56 = 1
            int r55 = r55 + 1
            r56 = r34
            r57 = r32
            int r32 = r32 + 1
            r56 = r56[r57]
            r54[r55] = r56
            goto L_0x06dc
        L_0x07ba:
            r54 = r36
            r55 = r52
            java.lang.String r55 = (java.lang.String) r55
            java.lang.reflect.Field r54 = zza((java.lang.Class<?>) r54, (java.lang.String) r55)
            r50 = r54
            r54 = r34
            r55 = r51
            r56 = r50
            r54[r55] = r56
            goto L_0x0700
        L_0x07d0:
            r54 = r36
            r55 = r52
            java.lang.String r55 = (java.lang.String) r55
            java.lang.reflect.Field r54 = zza((java.lang.Class<?>) r54, (java.lang.String) r55)
            r53 = r54
            r54 = r34
            r55 = r51
            r56 = r53
            r54[r55] = r56
            goto L_0x072d
        L_0x07e6:
            r54 = r36
            r55 = r34
            r56 = r32
            int r32 = r32 + 1
            r55 = r55[r56]
            java.lang.String r55 = (java.lang.String) r55
            java.lang.reflect.Field r54 = zza((java.lang.Class<?>) r54, (java.lang.String) r55)
            r48 = r54
            r54 = r44
            r55 = 9
            r0 = r54
            r1 = r55
            if (r0 == r1) goto L_0x080c
            r54 = r44
            r55 = 17
            r0 = r54
            r1 = r55
            if (r0 != r1) goto L_0x08ac
        L_0x080c:
            r54 = r38
            r55 = r41
            r56 = 3
            int r55 = r55 / 3
            r56 = 1
            int r55 = r55 << 1
            r56 = 1
            int r55 = r55 + 1
            r56 = r48
            java.lang.Class r56 = r56.getType()
            r54[r55] = r56
        L_0x0824:
            r54 = r33
            r55 = r48
            long r54 = r54.objectFieldOffset(r55)
            r0 = r54
            int r0 = (int) r0
            r54 = r0
            r45 = r54
            r54 = r43
            r55 = 4096(0x1000, float:5.74E-42)
            r0 = r54
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            r54 = r0
            r55 = 4096(0x1000, float:5.74E-42)
            r0 = r54
            r1 = r55
            if (r0 != r1) goto L_0x09f4
            r54 = r44
            r55 = 17
            r0 = r54
            r1 = r55
            if (r0 > r1) goto L_0x09f4
            r54 = r17
            r55 = r19
            int r19 = r19 + 1
            char r54 = r54.charAt(r55)
            r71 = r54
            r54 = r71
            r55 = r71
            r20 = r55
            r55 = 55296(0xd800, float:7.7486E-41)
            r0 = r54
            r1 = r55
            if (r0 < r1) goto L_0x0978
            r54 = r20
            r55 = 8191(0x1fff, float:1.1478E-41)
            r0 = r54
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            r54 = r0
            r50 = r54
            r54 = 13
            r51 = r54
        L_0x087a:
            r54 = r17
            r55 = r19
            int r19 = r19 + 1
            char r54 = r54.charAt(r55)
            r71 = r54
            r54 = r71
            r55 = r71
            r20 = r55
            r55 = 55296(0xd800, float:7.7486E-41)
            r0 = r54
            r1 = r55
            if (r0 < r1) goto L_0x096c
            r54 = r50
            r55 = r20
            r56 = 8191(0x1fff, float:1.1478E-41)
            r0 = r55
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            r55 = r0
            r56 = r51
            int r55 = r55 << r56
            r54 = r54 | r55
            r50 = r54
            int r51 = r51 + 13
            goto L_0x087a
        L_0x08ac:
            r54 = r44
            r55 = 27
            r0 = r54
            r1 = r55
            if (r0 == r1) goto L_0x08c0
            r54 = r44
            r55 = 49
            r0 = r54
            r1 = r55
            if (r0 != r1) goto L_0x08dc
        L_0x08c0:
            r54 = r38
            r55 = r41
            r56 = 3
            int r55 = r55 / 3
            r56 = 1
            int r55 = r55 << 1
            r56 = 1
            int r55 = r55 + 1
            r56 = r34
            r57 = r32
            int r32 = r32 + 1
            r56 = r56[r57]
            r54[r55] = r56
            goto L_0x0824
        L_0x08dc:
            r54 = r44
            r55 = 12
            r0 = r54
            r1 = r55
            if (r0 == r1) goto L_0x08fa
            r54 = r44
            r55 = 30
            r0 = r54
            r1 = r55
            if (r0 == r1) goto L_0x08fa
            r54 = r44
            r55 = 44
            r0 = r54
            r1 = r55
            if (r0 != r1) goto L_0x091a
        L_0x08fa:
            r54 = r16
            if (r54 != 0) goto L_0x0824
            r54 = r38
            r55 = r41
            r56 = 3
            int r55 = r55 / 3
            r56 = 1
            int r55 = r55 << 1
            r56 = 1
            int r55 = r55 + 1
            r56 = r34
            r57 = r32
            int r32 = r32 + 1
            r56 = r56[r57]
            r54[r55] = r56
            goto L_0x0824
        L_0x091a:
            r54 = r44
            r55 = 50
            r0 = r54
            r1 = r55
            if (r0 != r1) goto L_0x0824
            r54 = r31
            r55 = r39
            int r39 = r39 + 1
            r56 = r41
            r54[r55] = r56
            r54 = r38
            r55 = r41
            r56 = 3
            int r55 = r55 / 3
            r56 = 1
            int r55 = r55 << 1
            r56 = r34
            r57 = r32
            int r32 = r32 + 1
            r56 = r56[r57]
            r54[r55] = r56
            r54 = r43
            r55 = 2048(0x800, float:2.87E-42)
            r0 = r54
            r0 = r0 & 2048(0x800, float:2.87E-42)
            r54 = r0
            if (r54 == 0) goto L_0x0824
            r54 = r38
            r55 = r41
            r56 = 3
            int r55 = r55 / 3
            r56 = 1
            int r55 = r55 << 1
            r56 = 1
            int r55 = r55 + 1
            r56 = r34
            r57 = r32
            int r32 = r32 + 1
            r56 = r56[r57]
            r54[r55] = r56
            goto L_0x0824
        L_0x096c:
            r54 = r50
            r55 = r20
            r56 = r51
            int r55 = r55 << r56
            r54 = r54 | r55
            r20 = r54
        L_0x0978:
            r54 = r20
            r50 = r54
            r54 = r23
            r55 = 1
            int r54 = r54 << 1
            r55 = r50
            r56 = 32
            int r55 = r55 / 32
            int r54 = r54 + r55
            r52 = r54
            r54 = r34
            r55 = r52
            r54 = r54[r55]
            r71 = r54
            r54 = r71
            r55 = r71
            r53 = r55
            r0 = r54
            boolean r0 = r0 instanceof java.lang.reflect.Field
            r54 = r0
            if (r54 == 0) goto L_0x09df
            r54 = r53
            java.lang.reflect.Field r54 = (java.lang.reflect.Field) r54
            r51 = r54
        L_0x09a8:
            r54 = r33
            r55 = r51
            long r54 = r54.objectFieldOffset(r55)
            r0 = r54
            int r0 = (int) r0
            r54 = r0
            r47 = r54
            r54 = r50
            r55 = 32
            int r54 = r54 % 32
            r46 = r54
        L_0x09bf:
            r54 = r44
            r55 = 18
            r0 = r54
            r1 = r55
            if (r0 < r1) goto L_0x0740
            r54 = r44
            r55 = 49
            r0 = r54
            r1 = r55
            if (r0 > r1) goto L_0x0740
            r54 = r31
            r55 = r40
            int r40 = r40 + 1
            r56 = r45
            r54[r55] = r56
            goto L_0x0740
        L_0x09df:
            r54 = r36
            r55 = r53
            java.lang.String r55 = (java.lang.String) r55
            java.lang.reflect.Field r54 = zza((java.lang.Class<?>) r54, (java.lang.String) r55)
            r51 = r54
            r54 = r34
            r55 = r52
            r56 = r51
            r54[r55] = r56
            goto L_0x09a8
        L_0x09f4:
            r54 = 1048575(0xfffff, float:1.469367E-39)
            r47 = r54
            r54 = 0
            r46 = r54
            goto L_0x09bf
        L_0x09fe:
            r56 = 0
            goto L_0x075e
        L_0x0a02:
            r57 = 0
            goto L_0x076c
        L_0x0a06:
            com.google.android.gms.internal.auth.zziw r54 = new com.google.android.gms.internal.auth.zziw
            r71 = r54
            r54 = r71
            r55 = r71
            r56 = r37
            r57 = r38
            r58 = r25
            r59 = r26
            r60 = r10
            com.google.android.gms.internal.auth.zzis r60 = r60.zzc()
            r61 = r16
            r62 = 0
            r63 = r31
            r64 = r30
            r65 = r30
            r66 = r28
            int r65 = r65 + r66
            r66 = r11
            r67 = r12
            r68 = r13
            r69 = r14
            r70 = r15
            r55.<init>(r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70)
            r3 = r54
            return r3
        L_0x0a3a:
            r54 = r4
            com.google.android.gms.internal.auth.zzjx r54 = (com.google.android.gms.internal.auth.zzjx) r54
            int r54 = r54.zza()
            int r55 = com.google.android.gms.internal.auth.zzhm.zze.zzi
            r0 = r54
            r1 = r55
            if (r0 != r1) goto L_0x0a5a
            r54 = 1
        L_0x0a4c:
            r16 = r54
            java.lang.NoSuchMethodError r54 = new java.lang.NoSuchMethodError
            r71 = r54
            r54 = r71
            r55 = r71
            r55.<init>()
            throw r54
        L_0x0a5a:
            r54 = 0
            goto L_0x0a4c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zziw.zza(java.lang.Class, com.google.android.gms.internal.auth.zziq, com.google.android.gms.internal.auth.zzja, com.google.android.gms.internal.auth.zzic, com.google.android.gms.internal.auth.zzka, com.google.android.gms.internal.auth.zzhd, com.google.android.gms.internal.auth.zzip):com.google.android.gms.internal.auth.zziw");
    }

    private static Field zza(Class<?> cls, String str) {
        Throwable th;
        StringBuilder sb;
        Class<?> cls2 = cls;
        String str2 = str;
        try {
            return cls2.getDeclaredField(str2);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls2.getDeclaredFields();
            Field[] fieldArr = declaredFields;
            Field[] fieldArr2 = declaredFields;
            Field[] fieldArr3 = fieldArr2;
            int length = fieldArr2.length;
            for (int i = 0; i < length; i++) {
                Field field = fieldArr3[i];
                if (str2.equals(field.getName())) {
                    return field;
                }
            }
            Throwable th2 = th;
            String name = cls2.getName();
            String arrays = Arrays.toString(fieldArr);
            new StringBuilder(40 + String.valueOf(str2).length() + String.valueOf(name).length() + String.valueOf(arrays).length());
            new RuntimeException(sb.append("Field ").append(str2).append(" for ").append(name).append(" not found. Known fields are ").append(arrays).toString());
            throw th2;
        }
    }

    public final T zza() {
        return this.zzo.zza(this.zzg);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(T r29, T r30) {
        /*
            r28 = this;
            r3 = r28
            r4 = r29
            r5 = r30
            r22 = r3
            r0 = r22
            int[] r0 = r0.zzc
            r22 = r0
            r0 = r22
            int r0 = r0.length
            r22 = r0
            r6 = r22
            r22 = 0
            r7 = r22
        L_0x0019:
            r22 = r7
            r23 = r6
            r0 = r22
            r1 = r23
            if (r0 >= r1) goto L_0x03c5
            r22 = r3
            r23 = r4
            r24 = r5
            r25 = r7
            r14 = r25
            r13 = r24
            r12 = r23
            r27 = r22
            r22 = r27
            r23 = r27
            r11 = r23
            r23 = r14
            int r22 = r22.zzd((int) r23)
            r27 = r22
            r22 = r27
            r23 = r27
            r15 = r23
            r23 = 1048575(0xfffff, float:1.469367E-39)
            r22 = r22 & r23
            r0 = r22
            long r0 = (long) r0
            r22 = r0
            r16 = r22
            r22 = r15
            r23 = 267386880(0xff00000, float:2.3665827E-29)
            r22 = r22 & r23
            r23 = 20
            int r22 = r22 >>> 20
            switch(r22) {
                case 0: goto L_0x0069;
                case 1: goto L_0x0096;
                case 2: goto L_0x00c5;
                case 3: goto L_0x00eb;
                case 4: goto L_0x0111;
                case 5: goto L_0x0139;
                case 6: goto L_0x015f;
                case 7: goto L_0x0187;
                case 8: goto L_0x01af;
                case 9: goto L_0x01d7;
                case 10: goto L_0x01ff;
                case 11: goto L_0x0227;
                case 12: goto L_0x024f;
                case 13: goto L_0x0277;
                case 14: goto L_0x029f;
                case 15: goto L_0x02c5;
                case 16: goto L_0x02ed;
                case 17: goto L_0x0313;
                case 18: goto L_0x033b;
                case 19: goto L_0x033b;
                case 20: goto L_0x033b;
                case 21: goto L_0x033b;
                case 22: goto L_0x033b;
                case 23: goto L_0x033b;
                case 24: goto L_0x033b;
                case 25: goto L_0x033b;
                case 26: goto L_0x033b;
                case 27: goto L_0x033b;
                case 28: goto L_0x033b;
                case 29: goto L_0x033b;
                case 30: goto L_0x033b;
                case 31: goto L_0x033b;
                case 32: goto L_0x033b;
                case 33: goto L_0x033b;
                case 34: goto L_0x033b;
                case 35: goto L_0x033b;
                case 36: goto L_0x033b;
                case 37: goto L_0x033b;
                case 38: goto L_0x033b;
                case 39: goto L_0x033b;
                case 40: goto L_0x033b;
                case 41: goto L_0x033b;
                case 42: goto L_0x033b;
                case 43: goto L_0x033b;
                case 44: goto L_0x033b;
                case 45: goto L_0x033b;
                case 46: goto L_0x033b;
                case 47: goto L_0x033b;
                case 48: goto L_0x033b;
                case 49: goto L_0x033b;
                case 50: goto L_0x0351;
                case 51: goto L_0x0367;
                case 52: goto L_0x0367;
                case 53: goto L_0x0367;
                case 54: goto L_0x0367;
                case 55: goto L_0x0367;
                case 56: goto L_0x0367;
                case 57: goto L_0x0367;
                case 58: goto L_0x0367;
                case 59: goto L_0x0367;
                case 60: goto L_0x0367;
                case 61: goto L_0x0367;
                case 62: goto L_0x0367;
                case 63: goto L_0x0367;
                case 64: goto L_0x0367;
                case 65: goto L_0x0367;
                case 66: goto L_0x0367;
                case 67: goto L_0x0367;
                case 68: goto L_0x0367;
                default: goto L_0x0060;
            }
        L_0x0060:
            r22 = 1
        L_0x0062:
            if (r22 != 0) goto L_0x03c1
            r22 = 0
            r3 = r22
        L_0x0068:
            return r3
        L_0x0069:
            r22 = r11
            r23 = r12
            r24 = r13
            r25 = r14
            boolean r22 = r22.zzc(r23, r24, r25)
            if (r22 == 0) goto L_0x0093
            r22 = r12
            r23 = r16
            double r22 = com.google.android.gms.internal.auth.zzkg.zze(r22, r23)
            long r22 = java.lang.Double.doubleToLongBits(r22)
            r24 = r13
            r25 = r16
            double r24 = com.google.android.gms.internal.auth.zzkg.zze(r24, r25)
            long r24 = java.lang.Double.doubleToLongBits(r24)
            int r22 = (r22 > r24 ? 1 : (r22 == r24 ? 0 : -1))
            if (r22 == 0) goto L_0x0060
        L_0x0093:
            r22 = 0
            goto L_0x0062
        L_0x0096:
            r22 = r11
            r23 = r12
            r24 = r13
            r25 = r14
            boolean r22 = r22.zzc(r23, r24, r25)
            if (r22 == 0) goto L_0x00c2
            r22 = r12
            r23 = r16
            float r22 = com.google.android.gms.internal.auth.zzkg.zzd(r22, r23)
            int r22 = java.lang.Float.floatToIntBits(r22)
            r23 = r13
            r24 = r16
            float r23 = com.google.android.gms.internal.auth.zzkg.zzd(r23, r24)
            int r23 = java.lang.Float.floatToIntBits(r23)
            r0 = r22
            r1 = r23
            if (r0 == r1) goto L_0x0060
        L_0x00c2:
            r22 = 0
            goto L_0x0062
        L_0x00c5:
            r22 = r11
            r23 = r12
            r24 = r13
            r25 = r14
            boolean r22 = r22.zzc(r23, r24, r25)
            if (r22 == 0) goto L_0x00e7
            r22 = r12
            r23 = r16
            long r22 = com.google.android.gms.internal.auth.zzkg.zzb(r22, r23)
            r24 = r13
            r25 = r16
            long r24 = com.google.android.gms.internal.auth.zzkg.zzb(r24, r25)
            int r22 = (r22 > r24 ? 1 : (r22 == r24 ? 0 : -1))
            if (r22 == 0) goto L_0x0060
        L_0x00e7:
            r22 = 0
            goto L_0x0062
        L_0x00eb:
            r22 = r11
            r23 = r12
            r24 = r13
            r25 = r14
            boolean r22 = r22.zzc(r23, r24, r25)
            if (r22 == 0) goto L_0x010d
            r22 = r12
            r23 = r16
            long r22 = com.google.android.gms.internal.auth.zzkg.zzb(r22, r23)
            r24 = r13
            r25 = r16
            long r24 = com.google.android.gms.internal.auth.zzkg.zzb(r24, r25)
            int r22 = (r22 > r24 ? 1 : (r22 == r24 ? 0 : -1))
            if (r22 == 0) goto L_0x0060
        L_0x010d:
            r22 = 0
            goto L_0x0062
        L_0x0111:
            r22 = r11
            r23 = r12
            r24 = r13
            r25 = r14
            boolean r22 = r22.zzc(r23, r24, r25)
            if (r22 == 0) goto L_0x0135
            r22 = r12
            r23 = r16
            int r22 = com.google.android.gms.internal.auth.zzkg.zza((java.lang.Object) r22, (long) r23)
            r23 = r13
            r24 = r16
            int r23 = com.google.android.gms.internal.auth.zzkg.zza((java.lang.Object) r23, (long) r24)
            r0 = r22
            r1 = r23
            if (r0 == r1) goto L_0x0060
        L_0x0135:
            r22 = 0
            goto L_0x0062
        L_0x0139:
            r22 = r11
            r23 = r12
            r24 = r13
            r25 = r14
            boolean r22 = r22.zzc(r23, r24, r25)
            if (r22 == 0) goto L_0x015b
            r22 = r12
            r23 = r16
            long r22 = com.google.android.gms.internal.auth.zzkg.zzb(r22, r23)
            r24 = r13
            r25 = r16
            long r24 = com.google.android.gms.internal.auth.zzkg.zzb(r24, r25)
            int r22 = (r22 > r24 ? 1 : (r22 == r24 ? 0 : -1))
            if (r22 == 0) goto L_0x0060
        L_0x015b:
            r22 = 0
            goto L_0x0062
        L_0x015f:
            r22 = r11
            r23 = r12
            r24 = r13
            r25 = r14
            boolean r22 = r22.zzc(r23, r24, r25)
            if (r22 == 0) goto L_0x0183
            r22 = r12
            r23 = r16
            int r22 = com.google.android.gms.internal.auth.zzkg.zza((java.lang.Object) r22, (long) r23)
            r23 = r13
            r24 = r16
            int r23 = com.google.android.gms.internal.auth.zzkg.zza((java.lang.Object) r23, (long) r24)
            r0 = r22
            r1 = r23
            if (r0 == r1) goto L_0x0060
        L_0x0183:
            r22 = 0
            goto L_0x0062
        L_0x0187:
            r22 = r11
            r23 = r12
            r24 = r13
            r25 = r14
            boolean r22 = r22.zzc(r23, r24, r25)
            if (r22 == 0) goto L_0x01ab
            r22 = r12
            r23 = r16
            boolean r22 = com.google.android.gms.internal.auth.zzkg.zzc(r22, r23)
            r23 = r13
            r24 = r16
            boolean r23 = com.google.android.gms.internal.auth.zzkg.zzc(r23, r24)
            r0 = r22
            r1 = r23
            if (r0 == r1) goto L_0x0060
        L_0x01ab:
            r22 = 0
            goto L_0x0062
        L_0x01af:
            r22 = r11
            r23 = r12
            r24 = r13
            r25 = r14
            boolean r22 = r22.zzc(r23, r24, r25)
            if (r22 == 0) goto L_0x01d3
            r22 = r12
            r23 = r16
            java.lang.Object r22 = com.google.android.gms.internal.auth.zzkg.zzf(r22, r23)
            r23 = r13
            r24 = r16
            java.lang.Object r23 = com.google.android.gms.internal.auth.zzkg.zzf(r23, r24)
            boolean r22 = com.google.android.gms.internal.auth.zzjk.zza((java.lang.Object) r22, (java.lang.Object) r23)
            if (r22 != 0) goto L_0x0060
        L_0x01d3:
            r22 = 0
            goto L_0x0062
        L_0x01d7:
            r22 = r11
            r23 = r12
            r24 = r13
            r25 = r14
            boolean r22 = r22.zzc(r23, r24, r25)
            if (r22 == 0) goto L_0x01fb
            r22 = r12
            r23 = r16
            java.lang.Object r22 = com.google.android.gms.internal.auth.zzkg.zzf(r22, r23)
            r23 = r13
            r24 = r16
            java.lang.Object r23 = com.google.android.gms.internal.auth.zzkg.zzf(r23, r24)
            boolean r22 = com.google.android.gms.internal.auth.zzjk.zza((java.lang.Object) r22, (java.lang.Object) r23)
            if (r22 != 0) goto L_0x0060
        L_0x01fb:
            r22 = 0
            goto L_0x0062
        L_0x01ff:
            r22 = r11
            r23 = r12
            r24 = r13
            r25 = r14
            boolean r22 = r22.zzc(r23, r24, r25)
            if (r22 == 0) goto L_0x0223
            r22 = r12
            r23 = r16
            java.lang.Object r22 = com.google.android.gms.internal.auth.zzkg.zzf(r22, r23)
            r23 = r13
            r24 = r16
            java.lang.Object r23 = com.google.android.gms.internal.auth.zzkg.zzf(r23, r24)
            boolean r22 = com.google.android.gms.internal.auth.zzjk.zza((java.lang.Object) r22, (java.lang.Object) r23)
            if (r22 != 0) goto L_0x0060
        L_0x0223:
            r22 = 0
            goto L_0x0062
        L_0x0227:
            r22 = r11
            r23 = r12
            r24 = r13
            r25 = r14
            boolean r22 = r22.zzc(r23, r24, r25)
            if (r22 == 0) goto L_0x024b
            r22 = r12
            r23 = r16
            int r22 = com.google.android.gms.internal.auth.zzkg.zza((java.lang.Object) r22, (long) r23)
            r23 = r13
            r24 = r16
            int r23 = com.google.android.gms.internal.auth.zzkg.zza((java.lang.Object) r23, (long) r24)
            r0 = r22
            r1 = r23
            if (r0 == r1) goto L_0x0060
        L_0x024b:
            r22 = 0
            goto L_0x0062
        L_0x024f:
            r22 = r11
            r23 = r12
            r24 = r13
            r25 = r14
            boolean r22 = r22.zzc(r23, r24, r25)
            if (r22 == 0) goto L_0x0273
            r22 = r12
            r23 = r16
            int r22 = com.google.android.gms.internal.auth.zzkg.zza((java.lang.Object) r22, (long) r23)
            r23 = r13
            r24 = r16
            int r23 = com.google.android.gms.internal.auth.zzkg.zza((java.lang.Object) r23, (long) r24)
            r0 = r22
            r1 = r23
            if (r0 == r1) goto L_0x0060
        L_0x0273:
            r22 = 0
            goto L_0x0062
        L_0x0277:
            r22 = r11
            r23 = r12
            r24 = r13
            r25 = r14
            boolean r22 = r22.zzc(r23, r24, r25)
            if (r22 == 0) goto L_0x029b
            r22 = r12
            r23 = r16
            int r22 = com.google.android.gms.internal.auth.zzkg.zza((java.lang.Object) r22, (long) r23)
            r23 = r13
            r24 = r16
            int r23 = com.google.android.gms.internal.auth.zzkg.zza((java.lang.Object) r23, (long) r24)
            r0 = r22
            r1 = r23
            if (r0 == r1) goto L_0x0060
        L_0x029b:
            r22 = 0
            goto L_0x0062
        L_0x029f:
            r22 = r11
            r23 = r12
            r24 = r13
            r25 = r14
            boolean r22 = r22.zzc(r23, r24, r25)
            if (r22 == 0) goto L_0x02c1
            r22 = r12
            r23 = r16
            long r22 = com.google.android.gms.internal.auth.zzkg.zzb(r22, r23)
            r24 = r13
            r25 = r16
            long r24 = com.google.android.gms.internal.auth.zzkg.zzb(r24, r25)
            int r22 = (r22 > r24 ? 1 : (r22 == r24 ? 0 : -1))
            if (r22 == 0) goto L_0x0060
        L_0x02c1:
            r22 = 0
            goto L_0x0062
        L_0x02c5:
            r22 = r11
            r23 = r12
            r24 = r13
            r25 = r14
            boolean r22 = r22.zzc(r23, r24, r25)
            if (r22 == 0) goto L_0x02e9
            r22 = r12
            r23 = r16
            int r22 = com.google.android.gms.internal.auth.zzkg.zza((java.lang.Object) r22, (long) r23)
            r23 = r13
            r24 = r16
            int r23 = com.google.android.gms.internal.auth.zzkg.zza((java.lang.Object) r23, (long) r24)
            r0 = r22
            r1 = r23
            if (r0 == r1) goto L_0x0060
        L_0x02e9:
            r22 = 0
            goto L_0x0062
        L_0x02ed:
            r22 = r11
            r23 = r12
            r24 = r13
            r25 = r14
            boolean r22 = r22.zzc(r23, r24, r25)
            if (r22 == 0) goto L_0x030f
            r22 = r12
            r23 = r16
            long r22 = com.google.android.gms.internal.auth.zzkg.zzb(r22, r23)
            r24 = r13
            r25 = r16
            long r24 = com.google.android.gms.internal.auth.zzkg.zzb(r24, r25)
            int r22 = (r22 > r24 ? 1 : (r22 == r24 ? 0 : -1))
            if (r22 == 0) goto L_0x0060
        L_0x030f:
            r22 = 0
            goto L_0x0062
        L_0x0313:
            r22 = r11
            r23 = r12
            r24 = r13
            r25 = r14
            boolean r22 = r22.zzc(r23, r24, r25)
            if (r22 == 0) goto L_0x0337
            r22 = r12
            r23 = r16
            java.lang.Object r22 = com.google.android.gms.internal.auth.zzkg.zzf(r22, r23)
            r23 = r13
            r24 = r16
            java.lang.Object r23 = com.google.android.gms.internal.auth.zzkg.zzf(r23, r24)
            boolean r22 = com.google.android.gms.internal.auth.zzjk.zza((java.lang.Object) r22, (java.lang.Object) r23)
            if (r22 != 0) goto L_0x0060
        L_0x0337:
            r22 = 0
            goto L_0x0062
        L_0x033b:
            r22 = r12
            r23 = r16
            java.lang.Object r22 = com.google.android.gms.internal.auth.zzkg.zzf(r22, r23)
            r23 = r13
            r24 = r16
            java.lang.Object r23 = com.google.android.gms.internal.auth.zzkg.zzf(r23, r24)
            boolean r22 = com.google.android.gms.internal.auth.zzjk.zza((java.lang.Object) r22, (java.lang.Object) r23)
            goto L_0x0062
        L_0x0351:
            r22 = r12
            r23 = r16
            java.lang.Object r22 = com.google.android.gms.internal.auth.zzkg.zzf(r22, r23)
            r23 = r13
            r24 = r16
            java.lang.Object r23 = com.google.android.gms.internal.auth.zzkg.zzf(r23, r24)
            boolean r22 = com.google.android.gms.internal.auth.zzjk.zza((java.lang.Object) r22, (java.lang.Object) r23)
            goto L_0x0062
        L_0x0367:
            r22 = r11
            r23 = r12
            r24 = r13
            r25 = r14
            r20 = r25
            r19 = r24
            r18 = r23
            r23 = r20
            int r22 = r22.zze((int) r23)
            r21 = r22
            r22 = r18
            r23 = r21
            r24 = 1048575(0xfffff, float:1.469367E-39)
            r23 = r23 & r24
            r0 = r23
            long r0 = (long) r0
            r23 = r0
            int r22 = com.google.android.gms.internal.auth.zzkg.zza((java.lang.Object) r22, (long) r23)
            r23 = r19
            r24 = r21
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r24 = r24 & r25
            r0 = r24
            long r0 = (long) r0
            r24 = r0
            int r23 = com.google.android.gms.internal.auth.zzkg.zza((java.lang.Object) r23, (long) r24)
            r0 = r22
            r1 = r23
            if (r0 != r1) goto L_0x03bd
            r22 = r12
            r23 = r16
            java.lang.Object r22 = com.google.android.gms.internal.auth.zzkg.zzf(r22, r23)
            r23 = r13
            r24 = r16
            java.lang.Object r23 = com.google.android.gms.internal.auth.zzkg.zzf(r23, r24)
            boolean r22 = com.google.android.gms.internal.auth.zzjk.zza((java.lang.Object) r22, (java.lang.Object) r23)
            if (r22 != 0) goto L_0x0060
        L_0x03bd:
            r22 = 0
            goto L_0x0062
        L_0x03c1:
            int r7 = r7 + 3
            goto L_0x0019
        L_0x03c5:
            r22 = r3
            r0 = r22
            com.google.android.gms.internal.auth.zzka<?, ?> r0 = r0.zzq
            r22 = r0
            r23 = r4
            java.lang.Object r22 = r22.zza(r23)
            r7 = r22
            r22 = r3
            r0 = r22
            com.google.android.gms.internal.auth.zzka<?, ?> r0 = r0.zzq
            r22 = r0
            r23 = r5
            java.lang.Object r22 = r22.zza(r23)
            r8 = r22
            r22 = r7
            r23 = r8
            boolean r22 = r22.equals(r23)
            if (r22 != 0) goto L_0x03f5
            r22 = 0
            r3 = r22
            goto L_0x0068
        L_0x03f5:
            r22 = r3
            r0 = r22
            boolean r0 = r0.zzh
            r22 = r0
            if (r22 == 0) goto L_0x042b
            r22 = r3
            r0 = r22
            com.google.android.gms.internal.auth.zzhd<?> r0 = r0.zzr
            r22 = r0
            r23 = r4
            com.google.android.gms.internal.auth.zzhe r22 = r22.zza((java.lang.Object) r23)
            r9 = r22
            r22 = r3
            r0 = r22
            com.google.android.gms.internal.auth.zzhd<?> r0 = r0.zzr
            r22 = r0
            r23 = r5
            com.google.android.gms.internal.auth.zzhe r22 = r22.zza((java.lang.Object) r23)
            r10 = r22
            r22 = r9
            r23 = r10
            boolean r22 = r22.equals(r23)
            r3 = r22
            goto L_0x0068
        L_0x042b:
            r22 = 1
            r3 = r22
            goto L_0x0068
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zziw.zza(java.lang.Object, java.lang.Object):boolean");
    }

    public final int zza(T t) {
        T t2 = t;
        int i = 0;
        int length = this.zzc.length;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int zzd2 = zzd(i2);
            int i3 = this.zzc[i2];
            long j = (long) (zzd2 & 1048575);
            switch ((zzd2 & 267386880) >>> 20) {
                case 0:
                    i = (i * 53) + zzho.zza(Double.doubleToLongBits(zzkg.zze(t2, j)));
                    break;
                case 1:
                    i = (i * 53) + Float.floatToIntBits(zzkg.zzd(t2, j));
                    break;
                case 2:
                    i = (i * 53) + zzho.zza(zzkg.zzb(t2, j));
                    break;
                case 3:
                    i = (i * 53) + zzho.zza(zzkg.zzb(t2, j));
                    break;
                case 4:
                    i = (i * 53) + zzkg.zza((Object) t2, j);
                    break;
                case 5:
                    i = (i * 53) + zzho.zza(zzkg.zzb(t2, j));
                    break;
                case 6:
                    i = (i * 53) + zzkg.zza((Object) t2, j);
                    break;
                case 7:
                    i = (i * 53) + zzho.zza(zzkg.zzc(t2, j));
                    break;
                case 8:
                    i = (i * 53) + ((String) zzkg.zzf(t2, j)).hashCode();
                    break;
                case ConnectionResult.SERVICE_INVALID:
                    int i4 = 37;
                    Object zzf2 = zzkg.zzf(t2, j);
                    Object obj = zzf2;
                    if (zzf2 != null) {
                        i4 = obj.hashCode();
                    }
                    i = (i * 53) + i4;
                    break;
                case 10:
                    i = (i * 53) + zzkg.zzf(t2, j).hashCode();
                    break;
                case ConnectionResult.LICENSE_CHECK_FAILED:
                    i = (i * 53) + zzkg.zza((Object) t2, j);
                    break;
                case 12:
                    i = (i * 53) + zzkg.zza((Object) t2, j);
                    break;
                case 13:
                    i = (i * 53) + zzkg.zza((Object) t2, j);
                    break;
                case 14:
                    i = (i * 53) + zzho.zza(zzkg.zzb(t2, j));
                    break;
                case 15:
                    i = (i * 53) + zzkg.zza((Object) t2, j);
                    break;
                case 16:
                    i = (i * 53) + zzho.zza(zzkg.zzb(t2, j));
                    break;
                case 17:
                    int i5 = 37;
                    Object zzf3 = zzkg.zzf(t2, j);
                    Object obj2 = zzf3;
                    if (zzf3 != null) {
                        i5 = obj2.hashCode();
                    }
                    i = (i * 53) + i5;
                    break;
                case ConnectionResult.SERVICE_UPDATING:
                case 19:
                case 20:
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                case 22:
                case ConnectionResult.API_DISABLED:
                case ConnectionResult.API_DISABLED_FOR_CONNECTION:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = (i * 53) + zzkg.zzf(t2, j).hashCode();
                    break;
                case 50:
                    i = (i * 53) + zzkg.zzf(t2, j).hashCode();
                    break;
                case 51:
                    if (!zza(t2, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzho.zza(Double.doubleToLongBits(zzb(t2, j)));
                        break;
                    }
                case 52:
                    if (!zza(t2, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + Float.floatToIntBits(zzc(t2, j));
                        break;
                    }
                case 53:
                    if (!zza(t2, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzho.zza(zze(t2, j));
                        break;
                    }
                case 54:
                    if (!zza(t2, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzho.zza(zze(t2, j));
                        break;
                    }
                case 55:
                    if (!zza(t2, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzd(t2, j);
                        break;
                    }
                case 56:
                    if (!zza(t2, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzho.zza(zze(t2, j));
                        break;
                    }
                case 57:
                    if (!zza(t2, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzd(t2, j);
                        break;
                    }
                case 58:
                    if (!zza(t2, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzho.zza(zzf(t2, j));
                        break;
                    }
                case 59:
                    if (!zza(t2, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + ((String) zzkg.zzf(t2, j)).hashCode();
                        break;
                    }
                case 60:
                    if (!zza(t2, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzkg.zzf(t2, j).hashCode();
                        break;
                    }
                case 61:
                    if (!zza(t2, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzkg.zzf(t2, j).hashCode();
                        break;
                    }
                case 62:
                    if (!zza(t2, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzd(t2, j);
                        break;
                    }
                case 63:
                    if (!zza(t2, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzd(t2, j);
                        break;
                    }
                case 64:
                    if (!zza(t2, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzd(t2, j);
                        break;
                    }
                case 65:
                    if (!zza(t2, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzho.zza(zze(t2, j));
                        break;
                    }
                case 66:
                    if (!zza(t2, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzd(t2, j);
                        break;
                    }
                case 67:
                    if (!zza(t2, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzho.zza(zze(t2, j));
                        break;
                    }
                case 68:
                    if (!zza(t2, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzkg.zzf(t2, j).hashCode();
                        break;
                    }
            }
        }
        int hashCode = (i * 53) + this.zzq.zza(t2).hashCode();
        if (this.zzh) {
            hashCode = (hashCode * 53) + this.zzr.zza((Object) t2).hashCode();
        }
        return hashCode;
    }

    public final void zzb(T t, T t2) {
        Throwable th;
        T t3 = t;
        T t4 = t2;
        if (t4 == null) {
            Throwable th2 = th;
            new NullPointerException();
            throw th2;
        }
        for (int i = 0; i < this.zzc.length; i += 3) {
            int i2 = i;
            T t5 = t4;
            T t6 = t3;
            int zzd2 = zzd(i2);
            int i3 = zzd2;
            long j = (long) (zzd2 & 1048575);
            int i4 = this.zzc[i2];
            switch ((i3 & 267386880) >>> 20) {
                case 0:
                    if (!zza(t5, i2)) {
                        break;
                    } else {
                        zzkg.zza((Object) t6, j, zzkg.zze(t5, j));
                        zzb(t6, i2);
                        break;
                    }
                case 1:
                    if (!zza(t5, i2)) {
                        break;
                    } else {
                        zzkg.zza((Object) t6, j, zzkg.zzd(t5, j));
                        zzb(t6, i2);
                        break;
                    }
                case 2:
                    if (!zza(t5, i2)) {
                        break;
                    } else {
                        zzkg.zza((Object) t6, j, zzkg.zzb(t5, j));
                        zzb(t6, i2);
                        break;
                    }
                case 3:
                    if (!zza(t5, i2)) {
                        break;
                    } else {
                        zzkg.zza((Object) t6, j, zzkg.zzb(t5, j));
                        zzb(t6, i2);
                        break;
                    }
                case 4:
                    if (!zza(t5, i2)) {
                        break;
                    } else {
                        zzkg.zza((Object) t6, j, zzkg.zza((Object) t5, j));
                        zzb(t6, i2);
                        break;
                    }
                case 5:
                    if (!zza(t5, i2)) {
                        break;
                    } else {
                        zzkg.zza((Object) t6, j, zzkg.zzb(t5, j));
                        zzb(t6, i2);
                        break;
                    }
                case 6:
                    if (!zza(t5, i2)) {
                        break;
                    } else {
                        zzkg.zza((Object) t6, j, zzkg.zza((Object) t5, j));
                        zzb(t6, i2);
                        break;
                    }
                case 7:
                    if (!zza(t5, i2)) {
                        break;
                    } else {
                        zzkg.zza((Object) t6, j, zzkg.zzc(t5, j));
                        zzb(t6, i2);
                        break;
                    }
                case 8:
                    if (!zza(t5, i2)) {
                        break;
                    } else {
                        zzkg.zza((Object) t6, j, zzkg.zzf(t5, j));
                        zzb(t6, i2);
                        break;
                    }
                case ConnectionResult.SERVICE_INVALID:
                    zza(t6, t5, i2);
                    break;
                case 10:
                    if (!zza(t5, i2)) {
                        break;
                    } else {
                        zzkg.zza((Object) t6, j, zzkg.zzf(t5, j));
                        zzb(t6, i2);
                        break;
                    }
                case ConnectionResult.LICENSE_CHECK_FAILED:
                    if (!zza(t5, i2)) {
                        break;
                    } else {
                        zzkg.zza((Object) t6, j, zzkg.zza((Object) t5, j));
                        zzb(t6, i2);
                        break;
                    }
                case 12:
                    if (!zza(t5, i2)) {
                        break;
                    } else {
                        zzkg.zza((Object) t6, j, zzkg.zza((Object) t5, j));
                        zzb(t6, i2);
                        break;
                    }
                case 13:
                    if (!zza(t5, i2)) {
                        break;
                    } else {
                        zzkg.zza((Object) t6, j, zzkg.zza((Object) t5, j));
                        zzb(t6, i2);
                        break;
                    }
                case 14:
                    if (!zza(t5, i2)) {
                        break;
                    } else {
                        zzkg.zza((Object) t6, j, zzkg.zzb(t5, j));
                        zzb(t6, i2);
                        break;
                    }
                case 15:
                    if (!zza(t5, i2)) {
                        break;
                    } else {
                        zzkg.zza((Object) t6, j, zzkg.zza((Object) t5, j));
                        zzb(t6, i2);
                        break;
                    }
                case 16:
                    if (!zza(t5, i2)) {
                        break;
                    } else {
                        zzkg.zza((Object) t6, j, zzkg.zzb(t5, j));
                        zzb(t6, i2);
                        break;
                    }
                case 17:
                    zza(t6, t5, i2);
                    break;
                case ConnectionResult.SERVICE_UPDATING:
                case 19:
                case 20:
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                case 22:
                case ConnectionResult.API_DISABLED:
                case ConnectionResult.API_DISABLED_FOR_CONNECTION:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzp.zza(t6, t5, j);
                    break;
                case 50:
                    zzjk.zza(this.zzs, t6, t5, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!zza(t5, i4, i2)) {
                        break;
                    } else {
                        zzkg.zza((Object) t6, j, zzkg.zzf(t5, j));
                        zzb(t6, i4, i2);
                        break;
                    }
                case 60:
                    zzb(t6, t5, i2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zza(t5, i4, i2)) {
                        break;
                    } else {
                        zzkg.zza((Object) t6, j, zzkg.zzf(t5, j));
                        zzb(t6, i4, i2);
                        break;
                    }
                case 68:
                    zzb(t6, t5, i2);
                    break;
            }
        }
        zzjk.zza(this.zzq, t3, t4);
        if (this.zzh) {
            zzjk.zza(this.zzr, t3, t4);
        }
    }

    private final void zza(T t, T t2, int i) {
        T t3 = t;
        T t4 = t2;
        int i2 = i;
        long zzd2 = (long) (zzd(i2) & 1048575);
        if (zza(t4, i2)) {
            Object zzf2 = zzkg.zzf(t3, zzd2);
            Object zzf3 = zzkg.zzf(t4, zzd2);
            if (zzf2 != null && zzf3 != null) {
                zzkg.zza((Object) t3, zzd2, zzho.zza(zzf2, zzf3));
                zzb(t3, i2);
            } else if (zzf3 != null) {
                zzkg.zza((Object) t3, zzd2, zzf3);
                zzb(t3, i2);
            }
        }
    }

    private final void zzb(T t, T t2, int i) {
        T t3 = t;
        T t4 = t2;
        int i2 = i;
        int zzd2 = zzd(i2);
        int i3 = this.zzc[i2];
        long j = (long) (zzd2 & 1048575);
        if (zza(t4, i3, i2)) {
            Object zzf2 = zzkg.zzf(t3, j);
            Object zzf3 = zzkg.zzf(t4, j);
            if (zzf2 != null && zzf3 != null) {
                zzkg.zza((Object) t3, j, zzho.zza(zzf2, zzf3));
                zzb(t3, i3, i2);
            } else if (zzf3 != null) {
                zzkg.zza((Object) t3, j, zzf3);
                zzb(t3, i3, i2);
            }
        }
    }

    public final int zzb(T t) {
        int i;
        T t2 = t;
        if (this.zzj) {
            T t3 = t2;
            Unsafe unsafe = zzb;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 < this.zzc.length) {
                    int zzd2 = zzd(i3);
                    int i4 = (zzd2 & 267386880) >>> 20;
                    int i5 = this.zzc[i3];
                    long j = (long) (zzd2 & 1048575);
                    if (i4 < zzhj.zza.zza() || i4 > zzhj.zzb.zza()) {
                        i = 0;
                    } else {
                        i = this.zzc[i3 + 2] & 1048575;
                    }
                    int i6 = i;
                    switch (i4) {
                        case 0:
                            if (!zza(t3, i3)) {
                                break;
                            } else {
                                i2 += zzgv.zzb(i5, 0.0d);
                                break;
                            }
                        case 1:
                            if (!zza(t3, i3)) {
                                break;
                            } else {
                                i2 += zzgv.zzb(i5, 0.0f);
                                break;
                            }
                        case 2:
                            if (!zza(t3, i3)) {
                                break;
                            } else {
                                i2 += zzgv.zzd(i5, zzkg.zzb(t3, j));
                                break;
                            }
                        case 3:
                            if (!zza(t3, i3)) {
                                break;
                            } else {
                                i2 += zzgv.zze(i5, zzkg.zzb(t3, j));
                                break;
                            }
                        case 4:
                            if (!zza(t3, i3)) {
                                break;
                            } else {
                                i2 += zzgv.zzf(i5, zzkg.zza((Object) t3, j));
                                break;
                            }
                        case 5:
                            if (!zza(t3, i3)) {
                                break;
                            } else {
                                i2 += zzgv.zzg(i5, 0);
                                break;
                            }
                        case 6:
                            if (!zza(t3, i3)) {
                                break;
                            } else {
                                i2 += zzgv.zzi(i5, 0);
                                break;
                            }
                        case 7:
                            if (!zza(t3, i3)) {
                                break;
                            } else {
                                i2 += zzgv.zzb(i5, true);
                                break;
                            }
                        case 8:
                            if (!zza(t3, i3)) {
                                break;
                            } else {
                                Object zzf2 = zzkg.zzf(t3, j);
                                Object obj = zzf2;
                                if (!(zzf2 instanceof zzgi)) {
                                    i2 += zzgv.zzb(i5, (String) obj);
                                    break;
                                } else {
                                    i2 += zzgv.zzc(i5, (zzgi) obj);
                                    break;
                                }
                            }
                        case ConnectionResult.SERVICE_INVALID:
                            if (!zza(t3, i3)) {
                                break;
                            } else {
                                i2 += zzjk.zza(i5, zzkg.zzf(t3, j), zza(i3));
                                break;
                            }
                        case 10:
                            if (!zza(t3, i3)) {
                                break;
                            } else {
                                i2 += zzgv.zzc(i5, (zzgi) zzkg.zzf(t3, j));
                                break;
                            }
                        case ConnectionResult.LICENSE_CHECK_FAILED:
                            if (!zza(t3, i3)) {
                                break;
                            } else {
                                i2 += zzgv.zzg(i5, zzkg.zza((Object) t3, j));
                                break;
                            }
                        case 12:
                            if (!zza(t3, i3)) {
                                break;
                            } else {
                                i2 += zzgv.zzk(i5, zzkg.zza((Object) t3, j));
                                break;
                            }
                        case 13:
                            if (!zza(t3, i3)) {
                                break;
                            } else {
                                i2 += zzgv.zzj(i5, 0);
                                break;
                            }
                        case 14:
                            if (!zza(t3, i3)) {
                                break;
                            } else {
                                i2 += zzgv.zzh(i5, 0);
                                break;
                            }
                        case 15:
                            if (!zza(t3, i3)) {
                                break;
                            } else {
                                i2 += zzgv.zzh(i5, zzkg.zza((Object) t3, j));
                                break;
                            }
                        case 16:
                            if (!zza(t3, i3)) {
                                break;
                            } else {
                                i2 += zzgv.zzf(i5, zzkg.zzb(t3, j));
                                break;
                            }
                        case 17:
                            if (!zza(t3, i3)) {
                                break;
                            } else {
                                i2 += zzgv.zzc(i5, (zzis) zzkg.zzf(t3, j), zza(i3));
                                break;
                            }
                        case ConnectionResult.SERVICE_UPDATING:
                            i2 += zzjk.zzi(i5, zza((Object) t3, j), false);
                            break;
                        case 19:
                            i2 += zzjk.zzh(i5, zza((Object) t3, j), false);
                            break;
                        case 20:
                            i2 += zzjk.zza(i5, (List<Long>) zza((Object) t3, j), false);
                            break;
                        case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                            i2 += zzjk.zzb(i5, (List<Long>) zza((Object) t3, j), false);
                            break;
                        case 22:
                            i2 += zzjk.zze(i5, zza((Object) t3, j), false);
                            break;
                        case ConnectionResult.API_DISABLED:
                            i2 += zzjk.zzi(i5, zza((Object) t3, j), false);
                            break;
                        case ConnectionResult.API_DISABLED_FOR_CONNECTION:
                            i2 += zzjk.zzh(i5, zza((Object) t3, j), false);
                            break;
                        case 25:
                            i2 += zzjk.zzj(i5, zza((Object) t3, j), false);
                            break;
                        case 26:
                            i2 += zzjk.zza(i5, zza((Object) t3, j));
                            break;
                        case 27:
                            i2 += zzjk.zza(i5, zza((Object) t3, j), zza(i3));
                            break;
                        case 28:
                            i2 += zzjk.zzb(i5, zza((Object) t3, j));
                            break;
                        case 29:
                            i2 += zzjk.zzf(i5, zza((Object) t3, j), false);
                            break;
                        case 30:
                            i2 += zzjk.zzd(i5, zza((Object) t3, j), false);
                            break;
                        case 31:
                            i2 += zzjk.zzh(i5, zza((Object) t3, j), false);
                            break;
                        case 32:
                            i2 += zzjk.zzi(i5, zza((Object) t3, j), false);
                            break;
                        case 33:
                            i2 += zzjk.zzg(i5, zza((Object) t3, j), false);
                            break;
                        case 34:
                            i2 += zzjk.zzc(i5, zza((Object) t3, j), false);
                            break;
                        case 35:
                            int zzi2 = zzjk.zzi((List) unsafe.getObject(t3, j));
                            int i7 = zzi2;
                            if (zzi2 <= 0) {
                                break;
                            } else {
                                i2 += zzgv.zze(i5) + zzgv.zzg(i7) + i7;
                                break;
                            }
                        case 36:
                            int zzh2 = zzjk.zzh((List) unsafe.getObject(t3, j));
                            int i8 = zzh2;
                            if (zzh2 <= 0) {
                                break;
                            } else {
                                i2 += zzgv.zze(i5) + zzgv.zzg(i8) + i8;
                                break;
                            }
                        case 37:
                            int zza2 = zzjk.zza((List<Long>) (List) unsafe.getObject(t3, j));
                            int i9 = zza2;
                            if (zza2 <= 0) {
                                break;
                            } else {
                                i2 += zzgv.zze(i5) + zzgv.zzg(i9) + i9;
                                break;
                            }
                        case 38:
                            int zzb2 = zzjk.zzb((List) unsafe.getObject(t3, j));
                            int i10 = zzb2;
                            if (zzb2 <= 0) {
                                break;
                            } else {
                                i2 += zzgv.zze(i5) + zzgv.zzg(i10) + i10;
                                break;
                            }
                        case 39:
                            int zze2 = zzjk.zze((List) unsafe.getObject(t3, j));
                            int i11 = zze2;
                            if (zze2 <= 0) {
                                break;
                            } else {
                                i2 += zzgv.zze(i5) + zzgv.zzg(i11) + i11;
                                break;
                            }
                        case 40:
                            int zzi3 = zzjk.zzi((List) unsafe.getObject(t3, j));
                            int i12 = zzi3;
                            if (zzi3 <= 0) {
                                break;
                            } else {
                                i2 += zzgv.zze(i5) + zzgv.zzg(i12) + i12;
                                break;
                            }
                        case 41:
                            int zzh3 = zzjk.zzh((List) unsafe.getObject(t3, j));
                            int i13 = zzh3;
                            if (zzh3 <= 0) {
                                break;
                            } else {
                                i2 += zzgv.zze(i5) + zzgv.zzg(i13) + i13;
                                break;
                            }
                        case 42:
                            int zzj2 = zzjk.zzj((List) unsafe.getObject(t3, j));
                            int i14 = zzj2;
                            if (zzj2 <= 0) {
                                break;
                            } else {
                                i2 += zzgv.zze(i5) + zzgv.zzg(i14) + i14;
                                break;
                            }
                        case 43:
                            int zzf3 = zzjk.zzf((List) unsafe.getObject(t3, j));
                            int i15 = zzf3;
                            if (zzf3 <= 0) {
                                break;
                            } else {
                                i2 += zzgv.zze(i5) + zzgv.zzg(i15) + i15;
                                break;
                            }
                        case 44:
                            int zzd3 = zzjk.zzd((List) unsafe.getObject(t3, j));
                            int i16 = zzd3;
                            if (zzd3 <= 0) {
                                break;
                            } else {
                                i2 += zzgv.zze(i5) + zzgv.zzg(i16) + i16;
                                break;
                            }
                        case 45:
                            int zzh4 = zzjk.zzh((List) unsafe.getObject(t3, j));
                            int i17 = zzh4;
                            if (zzh4 <= 0) {
                                break;
                            } else {
                                i2 += zzgv.zze(i5) + zzgv.zzg(i17) + i17;
                                break;
                            }
                        case 46:
                            int zzi4 = zzjk.zzi((List) unsafe.getObject(t3, j));
                            int i18 = zzi4;
                            if (zzi4 <= 0) {
                                break;
                            } else {
                                i2 += zzgv.zze(i5) + zzgv.zzg(i18) + i18;
                                break;
                            }
                        case 47:
                            int zzg2 = zzjk.zzg((List) unsafe.getObject(t3, j));
                            int i19 = zzg2;
                            if (zzg2 <= 0) {
                                break;
                            } else {
                                i2 += zzgv.zze(i5) + zzgv.zzg(i19) + i19;
                                break;
                            }
                        case 48:
                            int zzc2 = zzjk.zzc((List) unsafe.getObject(t3, j));
                            int i20 = zzc2;
                            if (zzc2 <= 0) {
                                break;
                            } else {
                                i2 += zzgv.zze(i5) + zzgv.zzg(i20) + i20;
                                break;
                            }
                        case 49:
                            i2 += zzjk.zzb(i5, (List<zzis>) zza((Object) t3, j), zza(i3));
                            break;
                        case 50:
                            i2 += this.zzs.zza(i5, zzkg.zzf(t3, j), zzb(i3));
                            break;
                        case 51:
                            if (!zza(t3, i5, i3)) {
                                break;
                            } else {
                                i2 += zzgv.zzb(i5, 0.0d);
                                break;
                            }
                        case 52:
                            if (!zza(t3, i5, i3)) {
                                break;
                            } else {
                                i2 += zzgv.zzb(i5, 0.0f);
                                break;
                            }
                        case 53:
                            if (!zza(t3, i5, i3)) {
                                break;
                            } else {
                                i2 += zzgv.zzd(i5, zze(t3, j));
                                break;
                            }
                        case 54:
                            if (!zza(t3, i5, i3)) {
                                break;
                            } else {
                                i2 += zzgv.zze(i5, zze(t3, j));
                                break;
                            }
                        case 55:
                            if (!zza(t3, i5, i3)) {
                                break;
                            } else {
                                i2 += zzgv.zzf(i5, zzd(t3, j));
                                break;
                            }
                        case 56:
                            if (!zza(t3, i5, i3)) {
                                break;
                            } else {
                                i2 += zzgv.zzg(i5, 0);
                                break;
                            }
                        case 57:
                            if (!zza(t3, i5, i3)) {
                                break;
                            } else {
                                i2 += zzgv.zzi(i5, 0);
                                break;
                            }
                        case 58:
                            if (!zza(t3, i5, i3)) {
                                break;
                            } else {
                                i2 += zzgv.zzb(i5, true);
                                break;
                            }
                        case 59:
                            if (!zza(t3, i5, i3)) {
                                break;
                            } else {
                                Object zzf4 = zzkg.zzf(t3, j);
                                Object obj2 = zzf4;
                                if (!(zzf4 instanceof zzgi)) {
                                    i2 += zzgv.zzb(i5, (String) obj2);
                                    break;
                                } else {
                                    i2 += zzgv.zzc(i5, (zzgi) obj2);
                                    break;
                                }
                            }
                        case 60:
                            if (!zza(t3, i5, i3)) {
                                break;
                            } else {
                                i2 += zzjk.zza(i5, zzkg.zzf(t3, j), zza(i3));
                                break;
                            }
                        case 61:
                            if (!zza(t3, i5, i3)) {
                                break;
                            } else {
                                i2 += zzgv.zzc(i5, (zzgi) zzkg.zzf(t3, j));
                                break;
                            }
                        case 62:
                            if (!zza(t3, i5, i3)) {
                                break;
                            } else {
                                i2 += zzgv.zzg(i5, zzd(t3, j));
                                break;
                            }
                        case 63:
                            if (!zza(t3, i5, i3)) {
                                break;
                            } else {
                                i2 += zzgv.zzk(i5, zzd(t3, j));
                                break;
                            }
                        case 64:
                            if (!zza(t3, i5, i3)) {
                                break;
                            } else {
                                i2 += zzgv.zzj(i5, 0);
                                break;
                            }
                        case 65:
                            if (!zza(t3, i5, i3)) {
                                break;
                            } else {
                                i2 += zzgv.zzh(i5, 0);
                                break;
                            }
                        case 66:
                            if (!zza(t3, i5, i3)) {
                                break;
                            } else {
                                i2 += zzgv.zzh(i5, zzd(t3, j));
                                break;
                            }
                        case 67:
                            if (!zza(t3, i5, i3)) {
                                break;
                            } else {
                                i2 += zzgv.zzf(i5, zze(t3, j));
                                break;
                            }
                        case 68:
                            if (!zza(t3, i5, i3)) {
                                break;
                            } else {
                                i2 += zzgv.zzc(i5, (zzis) zzkg.zzf(t3, j), zza(i3));
                                break;
                            }
                    }
                    i3 += 3;
                } else {
                    return i2 + zza(this.zzq, t3);
                }
            }
        } else {
            T t4 = t2;
            int i21 = 0;
            Unsafe unsafe2 = zzb;
            int i22 = 1048575;
            int i23 = 0;
            int i24 = 0;
            while (true) {
                if (i24 < this.zzc.length) {
                    int zzd4 = zzd(i24);
                    int i25 = this.zzc[i24];
                    int i26 = (zzd4 & 267386880) >>> 20;
                    int i27 = 0;
                    if (i26 <= 17) {
                        int i28 = this.zzc[i24 + 2];
                        int i29 = i28 & 1048575;
                        i27 = 1 << (i28 >>> 20);
                        if (i29 != i22) {
                            i22 = i29;
                            i23 = unsafe2.getInt(t4, (long) i29);
                        }
                    }
                    long j2 = (long) (zzd4 & 1048575);
                    switch (i26) {
                        case 0:
                            if ((i23 & i27) == 0) {
                                break;
                            } else {
                                i21 += zzgv.zzb(i25, 0.0d);
                                break;
                            }
                        case 1:
                            if ((i23 & i27) == 0) {
                                break;
                            } else {
                                i21 += zzgv.zzb(i25, 0.0f);
                                break;
                            }
                        case 2:
                            if ((i23 & i27) == 0) {
                                break;
                            } else {
                                i21 += zzgv.zzd(i25, unsafe2.getLong(t4, j2));
                                break;
                            }
                        case 3:
                            if ((i23 & i27) == 0) {
                                break;
                            } else {
                                i21 += zzgv.zze(i25, unsafe2.getLong(t4, j2));
                                break;
                            }
                        case 4:
                            if ((i23 & i27) == 0) {
                                break;
                            } else {
                                i21 += zzgv.zzf(i25, unsafe2.getInt(t4, j2));
                                break;
                            }
                        case 5:
                            if ((i23 & i27) == 0) {
                                break;
                            } else {
                                i21 += zzgv.zzg(i25, 0);
                                break;
                            }
                        case 6:
                            if ((i23 & i27) == 0) {
                                break;
                            } else {
                                i21 += zzgv.zzi(i25, 0);
                                break;
                            }
                        case 7:
                            if ((i23 & i27) == 0) {
                                break;
                            } else {
                                i21 += zzgv.zzb(i25, true);
                                break;
                            }
                        case 8:
                            if ((i23 & i27) == 0) {
                                break;
                            } else {
                                Object object = unsafe2.getObject(t4, j2);
                                Object obj3 = object;
                                if (!(object instanceof zzgi)) {
                                    i21 += zzgv.zzb(i25, (String) obj3);
                                    break;
                                } else {
                                    i21 += zzgv.zzc(i25, (zzgi) obj3);
                                    break;
                                }
                            }
                        case ConnectionResult.SERVICE_INVALID:
                            if ((i23 & i27) == 0) {
                                break;
                            } else {
                                i21 += zzjk.zza(i25, unsafe2.getObject(t4, j2), zza(i24));
                                break;
                            }
                        case 10:
                            if ((i23 & i27) == 0) {
                                break;
                            } else {
                                i21 += zzgv.zzc(i25, (zzgi) unsafe2.getObject(t4, j2));
                                break;
                            }
                        case ConnectionResult.LICENSE_CHECK_FAILED:
                            if ((i23 & i27) == 0) {
                                break;
                            } else {
                                i21 += zzgv.zzg(i25, unsafe2.getInt(t4, j2));
                                break;
                            }
                        case 12:
                            if ((i23 & i27) == 0) {
                                break;
                            } else {
                                i21 += zzgv.zzk(i25, unsafe2.getInt(t4, j2));
                                break;
                            }
                        case 13:
                            if ((i23 & i27) == 0) {
                                break;
                            } else {
                                i21 += zzgv.zzj(i25, 0);
                                break;
                            }
                        case 14:
                            if ((i23 & i27) == 0) {
                                break;
                            } else {
                                i21 += zzgv.zzh(i25, 0);
                                break;
                            }
                        case 15:
                            if ((i23 & i27) == 0) {
                                break;
                            } else {
                                i21 += zzgv.zzh(i25, unsafe2.getInt(t4, j2));
                                break;
                            }
                        case 16:
                            if ((i23 & i27) == 0) {
                                break;
                            } else {
                                i21 += zzgv.zzf(i25, unsafe2.getLong(t4, j2));
                                break;
                            }
                        case 17:
                            if ((i23 & i27) == 0) {
                                break;
                            } else {
                                i21 += zzgv.zzc(i25, (zzis) unsafe2.getObject(t4, j2), zza(i24));
                                break;
                            }
                        case ConnectionResult.SERVICE_UPDATING:
                            i21 += zzjk.zzi(i25, (List) unsafe2.getObject(t4, j2), false);
                            break;
                        case 19:
                            i21 += zzjk.zzh(i25, (List) unsafe2.getObject(t4, j2), false);
                            break;
                        case 20:
                            i21 += zzjk.zza(i25, (List<Long>) (List) unsafe2.getObject(t4, j2), false);
                            break;
                        case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                            i21 += zzjk.zzb(i25, (List<Long>) (List) unsafe2.getObject(t4, j2), false);
                            break;
                        case 22:
                            i21 += zzjk.zze(i25, (List) unsafe2.getObject(t4, j2), false);
                            break;
                        case ConnectionResult.API_DISABLED:
                            i21 += zzjk.zzi(i25, (List) unsafe2.getObject(t4, j2), false);
                            break;
                        case ConnectionResult.API_DISABLED_FOR_CONNECTION:
                            i21 += zzjk.zzh(i25, (List) unsafe2.getObject(t4, j2), false);
                            break;
                        case 25:
                            i21 += zzjk.zzj(i25, (List) unsafe2.getObject(t4, j2), false);
                            break;
                        case 26:
                            i21 += zzjk.zza(i25, (List<?>) (List) unsafe2.getObject(t4, j2));
                            break;
                        case 27:
                            i21 += zzjk.zza(i25, (List<?>) (List) unsafe2.getObject(t4, j2), zza(i24));
                            break;
                        case 28:
                            i21 += zzjk.zzb(i25, (List) unsafe2.getObject(t4, j2));
                            break;
                        case 29:
                            i21 += zzjk.zzf(i25, (List) unsafe2.getObject(t4, j2), false);
                            break;
                        case 30:
                            i21 += zzjk.zzd(i25, (List) unsafe2.getObject(t4, j2), false);
                            break;
                        case 31:
                            i21 += zzjk.zzh(i25, (List) unsafe2.getObject(t4, j2), false);
                            break;
                        case 32:
                            i21 += zzjk.zzi(i25, (List) unsafe2.getObject(t4, j2), false);
                            break;
                        case 33:
                            i21 += zzjk.zzg(i25, (List) unsafe2.getObject(t4, j2), false);
                            break;
                        case 34:
                            i21 += zzjk.zzc(i25, (List) unsafe2.getObject(t4, j2), false);
                            break;
                        case 35:
                            int zzi5 = zzjk.zzi((List) unsafe2.getObject(t4, j2));
                            int i30 = zzi5;
                            if (zzi5 <= 0) {
                                break;
                            } else {
                                i21 += zzgv.zze(i25) + zzgv.zzg(i30) + i30;
                                break;
                            }
                        case 36:
                            int zzh5 = zzjk.zzh((List) unsafe2.getObject(t4, j2));
                            int i31 = zzh5;
                            if (zzh5 <= 0) {
                                break;
                            } else {
                                i21 += zzgv.zze(i25) + zzgv.zzg(i31) + i31;
                                break;
                            }
                        case 37:
                            int zza3 = zzjk.zza((List<Long>) (List) unsafe2.getObject(t4, j2));
                            int i32 = zza3;
                            if (zza3 <= 0) {
                                break;
                            } else {
                                i21 += zzgv.zze(i25) + zzgv.zzg(i32) + i32;
                                break;
                            }
                        case 38:
                            int zzb3 = zzjk.zzb((List) unsafe2.getObject(t4, j2));
                            int i33 = zzb3;
                            if (zzb3 <= 0) {
                                break;
                            } else {
                                i21 += zzgv.zze(i25) + zzgv.zzg(i33) + i33;
                                break;
                            }
                        case 39:
                            int zze3 = zzjk.zze((List) unsafe2.getObject(t4, j2));
                            int i34 = zze3;
                            if (zze3 <= 0) {
                                break;
                            } else {
                                i21 += zzgv.zze(i25) + zzgv.zzg(i34) + i34;
                                break;
                            }
                        case 40:
                            int zzi6 = zzjk.zzi((List) unsafe2.getObject(t4, j2));
                            int i35 = zzi6;
                            if (zzi6 <= 0) {
                                break;
                            } else {
                                i21 += zzgv.zze(i25) + zzgv.zzg(i35) + i35;
                                break;
                            }
                        case 41:
                            int zzh6 = zzjk.zzh((List) unsafe2.getObject(t4, j2));
                            int i36 = zzh6;
                            if (zzh6 <= 0) {
                                break;
                            } else {
                                i21 += zzgv.zze(i25) + zzgv.zzg(i36) + i36;
                                break;
                            }
                        case 42:
                            int zzj3 = zzjk.zzj((List) unsafe2.getObject(t4, j2));
                            int i37 = zzj3;
                            if (zzj3 <= 0) {
                                break;
                            } else {
                                i21 += zzgv.zze(i25) + zzgv.zzg(i37) + i37;
                                break;
                            }
                        case 43:
                            int zzf5 = zzjk.zzf((List) unsafe2.getObject(t4, j2));
                            int i38 = zzf5;
                            if (zzf5 <= 0) {
                                break;
                            } else {
                                i21 += zzgv.zze(i25) + zzgv.zzg(i38) + i38;
                                break;
                            }
                        case 44:
                            int zzd5 = zzjk.zzd((List) unsafe2.getObject(t4, j2));
                            int i39 = zzd5;
                            if (zzd5 <= 0) {
                                break;
                            } else {
                                i21 += zzgv.zze(i25) + zzgv.zzg(i39) + i39;
                                break;
                            }
                        case 45:
                            int zzh7 = zzjk.zzh((List) unsafe2.getObject(t4, j2));
                            int i40 = zzh7;
                            if (zzh7 <= 0) {
                                break;
                            } else {
                                i21 += zzgv.zze(i25) + zzgv.zzg(i40) + i40;
                                break;
                            }
                        case 46:
                            int zzi7 = zzjk.zzi((List) unsafe2.getObject(t4, j2));
                            int i41 = zzi7;
                            if (zzi7 <= 0) {
                                break;
                            } else {
                                i21 += zzgv.zze(i25) + zzgv.zzg(i41) + i41;
                                break;
                            }
                        case 47:
                            int zzg3 = zzjk.zzg((List) unsafe2.getObject(t4, j2));
                            int i42 = zzg3;
                            if (zzg3 <= 0) {
                                break;
                            } else {
                                i21 += zzgv.zze(i25) + zzgv.zzg(i42) + i42;
                                break;
                            }
                        case 48:
                            int zzc3 = zzjk.zzc((List) unsafe2.getObject(t4, j2));
                            int i43 = zzc3;
                            if (zzc3 <= 0) {
                                break;
                            } else {
                                i21 += zzgv.zze(i25) + zzgv.zzg(i43) + i43;
                                break;
                            }
                        case 49:
                            i21 += zzjk.zzb(i25, (List<zzis>) (List) unsafe2.getObject(t4, j2), zza(i24));
                            break;
                        case 50:
                            i21 += this.zzs.zza(i25, unsafe2.getObject(t4, j2), zzb(i24));
                            break;
                        case 51:
                            if (!zza(t4, i25, i24)) {
                                break;
                            } else {
                                i21 += zzgv.zzb(i25, 0.0d);
                                break;
                            }
                        case 52:
                            if (!zza(t4, i25, i24)) {
                                break;
                            } else {
                                i21 += zzgv.zzb(i25, 0.0f);
                                break;
                            }
                        case 53:
                            if (!zza(t4, i25, i24)) {
                                break;
                            } else {
                                i21 += zzgv.zzd(i25, zze(t4, j2));
                                break;
                            }
                        case 54:
                            if (!zza(t4, i25, i24)) {
                                break;
                            } else {
                                i21 += zzgv.zze(i25, zze(t4, j2));
                                break;
                            }
                        case 55:
                            if (!zza(t4, i25, i24)) {
                                break;
                            } else {
                                i21 += zzgv.zzf(i25, zzd(t4, j2));
                                break;
                            }
                        case 56:
                            if (!zza(t4, i25, i24)) {
                                break;
                            } else {
                                i21 += zzgv.zzg(i25, 0);
                                break;
                            }
                        case 57:
                            if (!zza(t4, i25, i24)) {
                                break;
                            } else {
                                i21 += zzgv.zzi(i25, 0);
                                break;
                            }
                        case 58:
                            if (!zza(t4, i25, i24)) {
                                break;
                            } else {
                                i21 += zzgv.zzb(i25, true);
                                break;
                            }
                        case 59:
                            if (!zza(t4, i25, i24)) {
                                break;
                            } else {
                                Object object2 = unsafe2.getObject(t4, j2);
                                Object obj4 = object2;
                                if (!(object2 instanceof zzgi)) {
                                    i21 += zzgv.zzb(i25, (String) obj4);
                                    break;
                                } else {
                                    i21 += zzgv.zzc(i25, (zzgi) obj4);
                                    break;
                                }
                            }
                        case 60:
                            if (!zza(t4, i25, i24)) {
                                break;
                            } else {
                                i21 += zzjk.zza(i25, unsafe2.getObject(t4, j2), zza(i24));
                                break;
                            }
                        case 61:
                            if (!zza(t4, i25, i24)) {
                                break;
                            } else {
                                i21 += zzgv.zzc(i25, (zzgi) unsafe2.getObject(t4, j2));
                                break;
                            }
                        case 62:
                            if (!zza(t4, i25, i24)) {
                                break;
                            } else {
                                i21 += zzgv.zzg(i25, zzd(t4, j2));
                                break;
                            }
                        case 63:
                            if (!zza(t4, i25, i24)) {
                                break;
                            } else {
                                i21 += zzgv.zzk(i25, zzd(t4, j2));
                                break;
                            }
                        case 64:
                            if (!zza(t4, i25, i24)) {
                                break;
                            } else {
                                i21 += zzgv.zzj(i25, 0);
                                break;
                            }
                        case 65:
                            if (!zza(t4, i25, i24)) {
                                break;
                            } else {
                                i21 += zzgv.zzh(i25, 0);
                                break;
                            }
                        case 66:
                            if (!zza(t4, i25, i24)) {
                                break;
                            } else {
                                i21 += zzgv.zzh(i25, zzd(t4, j2));
                                break;
                            }
                        case 67:
                            if (!zza(t4, i25, i24)) {
                                break;
                            } else {
                                i21 += zzgv.zzf(i25, zze(t4, j2));
                                break;
                            }
                        case 68:
                            if (!zza(t4, i25, i24)) {
                                break;
                            } else {
                                i21 += zzgv.zzc(i25, (zzis) unsafe2.getObject(t4, j2), zza(i24));
                                break;
                            }
                    }
                    i24 += 3;
                } else {
                    int zza4 = i21 + zza(this.zzq, t4);
                    if (this.zzh) {
                        int i44 = zza4;
                        zzhe<?> zza5 = this.zzr.zza((Object) t4);
                        int i45 = 0;
                        for (int i46 = 0; i46 < zza5.zza.zzc(); i46++) {
                            Map.Entry<T, Object> zzb4 = zza5.zza.zzb(i46);
                            i45 += zzhe.zza((zzhg<?>) (zzhg) zzb4.getKey(), zzb4.getValue());
                        }
                        for (Map.Entry next : zza5.zza.zzd()) {
                            i45 += zzhe.zza((zzhg<?>) (zzhg) next.getKey(), next.getValue());
                        }
                        zza4 = i44 + i45;
                    }
                    return zza4;
                }
            }
        }
    }

    private static <UT, UB> int zza(zzka<UT, UB> zzka, T t) {
        zzka<UT, UB> zzka2 = zzka;
        return zzka2.zzd(zzka2.zza(t));
    }

    private static List<?> zza(Object obj, long j) {
        return (List) zzkg.zzf(obj, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x07dd  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x080a  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0837  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0864  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0891  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x08be  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x08eb  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0918  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0945  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0978  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0997  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x09c0  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x09e9  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0a12  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0a3b  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0a64  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0a8d  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0ab6  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0adf  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0b08  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0b3d  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0b68  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0b91  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0bba  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0be3  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0c0c  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0c35  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0c5e  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0da1  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0dc7  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0ded  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0e13  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0e3a  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0e61  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0e88  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0eaf  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0ed6  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0efd  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0f30  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0f59  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0f80  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0fa7  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0fce  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0ff5  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x101c  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x1043  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x1072  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x109f  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x10cc  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x10f9  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x1126  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x1153  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x1180  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x11ad  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x11da  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x1205  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x1238  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x1263  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x1290  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x12bd  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x12ea  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x1317  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x1344  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x1371  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x139e  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x13cb  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x13f8  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x1425  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x1452  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x147f  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x14ac  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x14d9  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x1506  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x1533  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x1560  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x158d  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x15ba  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x15e7  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x161a  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x1639  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x1662  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x168b  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x16b4  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x16dd  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x1706  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x172f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x1758  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x1781  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x17aa  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x17df  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x180a  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x1833  */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x185c  */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x1885  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x18ae  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x18d7  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x1900  */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x00fc A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:459:0x0d9e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0353  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x03a1  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x03d0  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x03fd  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x042a  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0457  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0484  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x04b1  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x04de  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x050b  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0538  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0563  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0596  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x05c1  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x05ee  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x061b  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0648  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0675  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x06a2  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x06cf  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x06fc  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0729  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0756  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0783  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x07b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(T r26, com.google.android.gms.internal.auth.zzkx r27) throws java.io.IOException {
        /*
            r25 = this;
            r3 = r25
            r4 = r26
            r5 = r27
            r18 = r5
            int r18 = r18.zza()
            int r19 = com.google.android.gms.internal.auth.zzhm.zze.zzk
            r0 = r18
            r1 = r19
            if (r0 != r1) goto L_0x0cb9
            r18 = r3
            r19 = r4
            r20 = r5
            r8 = r20
            r7 = r19
            r24 = r18
            r18 = r24
            r19 = r24
            r6 = r19
            r0 = r18
            com.google.android.gms.internal.auth.zzka<?, ?> r0 = r0.zzq
            r18 = r0
            r19 = r7
            r20 = r8
            zza(r18, r19, (com.google.android.gms.internal.auth.zzkx) r20)
            r18 = 0
            r9 = r18
            r18 = 0
            r10 = r18
            r18 = r6
            r0 = r18
            boolean r0 = r0.zzh
            r18 = r0
            if (r18 == 0) goto L_0x007d
            r18 = r6
            r0 = r18
            com.google.android.gms.internal.auth.zzhd<?> r0 = r0.zzr
            r18 = r0
            r19 = r7
            com.google.android.gms.internal.auth.zzhe r18 = r18.zza((java.lang.Object) r19)
            r24 = r18
            r18 = r24
            r19 = r24
            r11 = r19
            r0 = r18
            com.google.android.gms.internal.auth.zzjn<T, java.lang.Object> r0 = r0.zza
            r18 = r0
            boolean r18 = r18.isEmpty()
            if (r18 != 0) goto L_0x007d
            r18 = r11
            java.util.Iterator r18 = r18.zze()
            r24 = r18
            r18 = r24
            r19 = r24
            r9 = r19
            java.lang.Object r18 = r18.next()
            java.util.Map$Entry r18 = (java.util.Map.Entry) r18
            r10 = r18
        L_0x007d:
            r18 = r6
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r0 = r18
            int r0 = r0.length
            r18 = r0
            r19 = 3
            int r18 = r18 + -3
            r11 = r18
        L_0x0090:
            r18 = r11
            if (r18 < 0) goto L_0x0c8f
            r18 = r6
            r19 = r11
            int r18 = r18.zzd((int) r19)
            r12 = r18
            r18 = r6
            r19 = r11
            r16 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r16
            r18 = r18[r19]
            r13 = r18
        L_0x00b0:
            r18 = r10
            if (r18 == 0) goto L_0x00ef
            r18 = r6
            r0 = r18
            com.google.android.gms.internal.auth.zzhd<?> r0 = r0.zzr
            r18 = r0
            r19 = r10
            int r18 = r18.zza((java.util.Map.Entry<?, ?>) r19)
            r19 = r13
            r0 = r18
            r1 = r19
            if (r0 <= r1) goto L_0x00ef
            r18 = r6
            r0 = r18
            com.google.android.gms.internal.auth.zzhd<?> r0 = r0.zzr
            r18 = r0
            r19 = r8
            r20 = r10
            r18.zza(r19, r20)
            r18 = r9
            boolean r18 = r18.hasNext()
            if (r18 == 0) goto L_0x00ec
            r18 = r9
            java.lang.Object r18 = r18.next()
            java.util.Map$Entry r18 = (java.util.Map.Entry) r18
        L_0x00e9:
            r10 = r18
            goto L_0x00b0
        L_0x00ec:
            r18 = 0
            goto L_0x00e9
        L_0x00ef:
            r18 = r12
            r19 = 267386880(0xff00000, float:2.3665827E-29)
            r18 = r18 & r19
            r19 = 20
            int r18 = r18 >>> 20
            switch(r18) {
                case 0: goto L_0x00ff;
                case 1: goto L_0x0125;
                case 2: goto L_0x014b;
                case 3: goto L_0x0171;
                case 4: goto L_0x0198;
                case 5: goto L_0x01bf;
                case 6: goto L_0x01e6;
                case 7: goto L_0x020d;
                case 8: goto L_0x0234;
                case 9: goto L_0x025b;
                case 10: goto L_0x028e;
                case 11: goto L_0x02b7;
                case 12: goto L_0x02de;
                case 13: goto L_0x0305;
                case 14: goto L_0x032c;
                case 15: goto L_0x0353;
                case 16: goto L_0x037a;
                case 17: goto L_0x03a1;
                case 18: goto L_0x03d0;
                case 19: goto L_0x03fd;
                case 20: goto L_0x042a;
                case 21: goto L_0x0457;
                case 22: goto L_0x0484;
                case 23: goto L_0x04b1;
                case 24: goto L_0x04de;
                case 25: goto L_0x050b;
                case 26: goto L_0x0538;
                case 27: goto L_0x0563;
                case 28: goto L_0x0596;
                case 29: goto L_0x05c1;
                case 30: goto L_0x05ee;
                case 31: goto L_0x061b;
                case 32: goto L_0x0648;
                case 33: goto L_0x0675;
                case 34: goto L_0x06a2;
                case 35: goto L_0x06cf;
                case 36: goto L_0x06fc;
                case 37: goto L_0x0729;
                case 38: goto L_0x0756;
                case 39: goto L_0x0783;
                case 40: goto L_0x07b0;
                case 41: goto L_0x07dd;
                case 42: goto L_0x080a;
                case 43: goto L_0x0837;
                case 44: goto L_0x0864;
                case 45: goto L_0x0891;
                case 46: goto L_0x08be;
                case 47: goto L_0x08eb;
                case 48: goto L_0x0918;
                case 49: goto L_0x0945;
                case 50: goto L_0x0978;
                case 51: goto L_0x0997;
                case 52: goto L_0x09c0;
                case 53: goto L_0x09e9;
                case 54: goto L_0x0a12;
                case 55: goto L_0x0a3b;
                case 56: goto L_0x0a64;
                case 57: goto L_0x0a8d;
                case 58: goto L_0x0ab6;
                case 59: goto L_0x0adf;
                case 60: goto L_0x0b08;
                case 61: goto L_0x0b3d;
                case 62: goto L_0x0b68;
                case 63: goto L_0x0b91;
                case 64: goto L_0x0bba;
                case 65: goto L_0x0be3;
                case 66: goto L_0x0c0c;
                case 67: goto L_0x0c35;
                case 68: goto L_0x0c5e;
                default: goto L_0x00fc;
            }
        L_0x00fc:
            int r11 = r11 + -3
            goto L_0x0090
        L_0x00ff:
            r18 = r6
            r19 = r7
            r20 = r11
            boolean r18 = r18.zza(r19, (int) r20)
            if (r18 == 0) goto L_0x00fc
            r18 = r8
            r19 = r13
            r20 = r7
            r21 = r12
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            double r20 = com.google.android.gms.internal.auth.zzkg.zze(r20, r21)
            r18.zza((int) r19, (double) r20)
            goto L_0x00fc
        L_0x0125:
            r18 = r6
            r19 = r7
            r20 = r11
            boolean r18 = r18.zza(r19, (int) r20)
            if (r18 == 0) goto L_0x00fc
            r18 = r8
            r19 = r13
            r20 = r7
            r21 = r12
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            float r20 = com.google.android.gms.internal.auth.zzkg.zzd(r20, r21)
            r18.zza((int) r19, (float) r20)
            goto L_0x00fc
        L_0x014b:
            r18 = r6
            r19 = r7
            r20 = r11
            boolean r18 = r18.zza(r19, (int) r20)
            if (r18 == 0) goto L_0x00fc
            r18 = r8
            r19 = r13
            r20 = r7
            r21 = r12
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            long r20 = com.google.android.gms.internal.auth.zzkg.zzb(r20, r21)
            r18.zza((int) r19, (long) r20)
            goto L_0x00fc
        L_0x0171:
            r18 = r6
            r19 = r7
            r20 = r11
            boolean r18 = r18.zza(r19, (int) r20)
            if (r18 == 0) goto L_0x00fc
            r18 = r8
            r19 = r13
            r20 = r7
            r21 = r12
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            long r20 = com.google.android.gms.internal.auth.zzkg.zzb(r20, r21)
            r18.zzc((int) r19, (long) r20)
            goto L_0x00fc
        L_0x0198:
            r18 = r6
            r19 = r7
            r20 = r11
            boolean r18 = r18.zza(r19, (int) r20)
            if (r18 == 0) goto L_0x00fc
            r18 = r8
            r19 = r13
            r20 = r7
            r21 = r12
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            int r20 = com.google.android.gms.internal.auth.zzkg.zza((java.lang.Object) r20, (long) r21)
            r18.zzc((int) r19, (int) r20)
            goto L_0x00fc
        L_0x01bf:
            r18 = r6
            r19 = r7
            r20 = r11
            boolean r18 = r18.zza(r19, (int) r20)
            if (r18 == 0) goto L_0x00fc
            r18 = r8
            r19 = r13
            r20 = r7
            r21 = r12
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            long r20 = com.google.android.gms.internal.auth.zzkg.zzb(r20, r21)
            r18.zzd((int) r19, (long) r20)
            goto L_0x00fc
        L_0x01e6:
            r18 = r6
            r19 = r7
            r20 = r11
            boolean r18 = r18.zza(r19, (int) r20)
            if (r18 == 0) goto L_0x00fc
            r18 = r8
            r19 = r13
            r20 = r7
            r21 = r12
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            int r20 = com.google.android.gms.internal.auth.zzkg.zza((java.lang.Object) r20, (long) r21)
            r18.zzd((int) r19, (int) r20)
            goto L_0x00fc
        L_0x020d:
            r18 = r6
            r19 = r7
            r20 = r11
            boolean r18 = r18.zza(r19, (int) r20)
            if (r18 == 0) goto L_0x00fc
            r18 = r8
            r19 = r13
            r20 = r7
            r21 = r12
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            boolean r20 = com.google.android.gms.internal.auth.zzkg.zzc(r20, r21)
            r18.zza((int) r19, (boolean) r20)
            goto L_0x00fc
        L_0x0234:
            r18 = r6
            r19 = r7
            r20 = r11
            boolean r18 = r18.zza(r19, (int) r20)
            if (r18 == 0) goto L_0x00fc
            r18 = r13
            r19 = r7
            r20 = r12
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            r20 = r8
            zza((int) r18, (java.lang.Object) r19, (com.google.android.gms.internal.auth.zzkx) r20)
            goto L_0x00fc
        L_0x025b:
            r18 = r6
            r19 = r7
            r20 = r11
            boolean r18 = r18.zza(r19, (int) r20)
            if (r18 == 0) goto L_0x00fc
            r18 = r7
            r19 = r12
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r19 & r20
            r0 = r19
            long r0 = (long) r0
            r19 = r0
            java.lang.Object r18 = com.google.android.gms.internal.auth.zzkg.zzf(r18, r19)
            r14 = r18
            r18 = r8
            r19 = r13
            r20 = r14
            r21 = r6
            r22 = r11
            com.google.android.gms.internal.auth.zzji r21 = r21.zza((int) r22)
            r18.zza((int) r19, (java.lang.Object) r20, (com.google.android.gms.internal.auth.zzji) r21)
            goto L_0x00fc
        L_0x028e:
            r18 = r6
            r19 = r7
            r20 = r11
            boolean r18 = r18.zza(r19, (int) r20)
            if (r18 == 0) goto L_0x00fc
            r18 = r8
            r19 = r13
            r20 = r7
            r21 = r12
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            java.lang.Object r20 = com.google.android.gms.internal.auth.zzkg.zzf(r20, r21)
            com.google.android.gms.internal.auth.zzgi r20 = (com.google.android.gms.internal.auth.zzgi) r20
            r18.zza((int) r19, (com.google.android.gms.internal.auth.zzgi) r20)
            goto L_0x00fc
        L_0x02b7:
            r18 = r6
            r19 = r7
            r20 = r11
            boolean r18 = r18.zza(r19, (int) r20)
            if (r18 == 0) goto L_0x00fc
            r18 = r8
            r19 = r13
            r20 = r7
            r21 = r12
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            int r20 = com.google.android.gms.internal.auth.zzkg.zza((java.lang.Object) r20, (long) r21)
            r18.zze((int) r19, (int) r20)
            goto L_0x00fc
        L_0x02de:
            r18 = r6
            r19 = r7
            r20 = r11
            boolean r18 = r18.zza(r19, (int) r20)
            if (r18 == 0) goto L_0x00fc
            r18 = r8
            r19 = r13
            r20 = r7
            r21 = r12
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            int r20 = com.google.android.gms.internal.auth.zzkg.zza((java.lang.Object) r20, (long) r21)
            r18.zzb((int) r19, (int) r20)
            goto L_0x00fc
        L_0x0305:
            r18 = r6
            r19 = r7
            r20 = r11
            boolean r18 = r18.zza(r19, (int) r20)
            if (r18 == 0) goto L_0x00fc
            r18 = r8
            r19 = r13
            r20 = r7
            r21 = r12
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            int r20 = com.google.android.gms.internal.auth.zzkg.zza((java.lang.Object) r20, (long) r21)
            r18.zza((int) r19, (int) r20)
            goto L_0x00fc
        L_0x032c:
            r18 = r6
            r19 = r7
            r20 = r11
            boolean r18 = r18.zza(r19, (int) r20)
            if (r18 == 0) goto L_0x00fc
            r18 = r8
            r19 = r13
            r20 = r7
            r21 = r12
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            long r20 = com.google.android.gms.internal.auth.zzkg.zzb(r20, r21)
            r18.zzb((int) r19, (long) r20)
            goto L_0x00fc
        L_0x0353:
            r18 = r6
            r19 = r7
            r20 = r11
            boolean r18 = r18.zza(r19, (int) r20)
            if (r18 == 0) goto L_0x00fc
            r18 = r8
            r19 = r13
            r20 = r7
            r21 = r12
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            int r20 = com.google.android.gms.internal.auth.zzkg.zza((java.lang.Object) r20, (long) r21)
            r18.zzf(r19, r20)
            goto L_0x00fc
        L_0x037a:
            r18 = r6
            r19 = r7
            r20 = r11
            boolean r18 = r18.zza(r19, (int) r20)
            if (r18 == 0) goto L_0x00fc
            r18 = r8
            r19 = r13
            r20 = r7
            r21 = r12
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            long r20 = com.google.android.gms.internal.auth.zzkg.zzb(r20, r21)
            r18.zze((int) r19, (long) r20)
            goto L_0x00fc
        L_0x03a1:
            r18 = r6
            r19 = r7
            r20 = r11
            boolean r18 = r18.zza(r19, (int) r20)
            if (r18 == 0) goto L_0x00fc
            r18 = r8
            r19 = r13
            r20 = r7
            r21 = r12
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            java.lang.Object r20 = com.google.android.gms.internal.auth.zzkg.zzf(r20, r21)
            r21 = r6
            r22 = r11
            com.google.android.gms.internal.auth.zzji r21 = r21.zza((int) r22)
            r18.zzb((int) r19, (java.lang.Object) r20, (com.google.android.gms.internal.auth.zzji) r21)
            goto L_0x00fc
        L_0x03d0:
            r18 = r6
            r19 = r11
            r16 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r16
            r18 = r18[r19]
            r19 = r7
            r20 = r12
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 0
            com.google.android.gms.internal.auth.zzjk.zza((int) r18, (java.util.List<java.lang.Double>) r19, (com.google.android.gms.internal.auth.zzkx) r20, (boolean) r21)
            goto L_0x00fc
        L_0x03fd:
            r18 = r6
            r19 = r11
            r16 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r16
            r18 = r18[r19]
            r19 = r7
            r20 = r12
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 0
            com.google.android.gms.internal.auth.zzjk.zzb((int) r18, (java.util.List<java.lang.Float>) r19, (com.google.android.gms.internal.auth.zzkx) r20, (boolean) r21)
            goto L_0x00fc
        L_0x042a:
            r18 = r6
            r19 = r11
            r16 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r16
            r18 = r18[r19]
            r19 = r7
            r20 = r12
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 0
            com.google.android.gms.internal.auth.zzjk.zzc(r18, r19, r20, r21)
            goto L_0x00fc
        L_0x0457:
            r18 = r6
            r19 = r11
            r16 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r16
            r18 = r18[r19]
            r19 = r7
            r20 = r12
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 0
            com.google.android.gms.internal.auth.zzjk.zzd(r18, r19, r20, r21)
            goto L_0x00fc
        L_0x0484:
            r18 = r6
            r19 = r11
            r16 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r16
            r18 = r18[r19]
            r19 = r7
            r20 = r12
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 0
            com.google.android.gms.internal.auth.zzjk.zzh(r18, r19, r20, r21)
            goto L_0x00fc
        L_0x04b1:
            r18 = r6
            r19 = r11
            r16 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r16
            r18 = r18[r19]
            r19 = r7
            r20 = r12
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 0
            com.google.android.gms.internal.auth.zzjk.zzf(r18, r19, r20, r21)
            goto L_0x00fc
        L_0x04de:
            r18 = r6
            r19 = r11
            r16 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r16
            r18 = r18[r19]
            r19 = r7
            r20 = r12
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 0
            com.google.android.gms.internal.auth.zzjk.zzk(r18, r19, r20, r21)
            goto L_0x00fc
        L_0x050b:
            r18 = r6
            r19 = r11
            r16 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r16
            r18 = r18[r19]
            r19 = r7
            r20 = r12
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 0
            com.google.android.gms.internal.auth.zzjk.zzn(r18, r19, r20, r21)
            goto L_0x00fc
        L_0x0538:
            r18 = r6
            r19 = r11
            r16 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r16
            r18 = r18[r19]
            r19 = r7
            r20 = r12
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            com.google.android.gms.internal.auth.zzjk.zza((int) r18, (java.util.List<java.lang.String>) r19, (com.google.android.gms.internal.auth.zzkx) r20)
            goto L_0x00fc
        L_0x0563:
            r18 = r6
            r19 = r11
            r16 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r16
            r18 = r18[r19]
            r19 = r7
            r20 = r12
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = r6
            r22 = r11
            com.google.android.gms.internal.auth.zzji r21 = r21.zza((int) r22)
            com.google.android.gms.internal.auth.zzjk.zza((int) r18, (java.util.List<?>) r19, (com.google.android.gms.internal.auth.zzkx) r20, (com.google.android.gms.internal.auth.zzji) r21)
            goto L_0x00fc
        L_0x0596:
            r18 = r6
            r19 = r11
            r16 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r16
            r18 = r18[r19]
            r19 = r7
            r20 = r12
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            com.google.android.gms.internal.auth.zzjk.zzb((int) r18, (java.util.List<com.google.android.gms.internal.auth.zzgi>) r19, (com.google.android.gms.internal.auth.zzkx) r20)
            goto L_0x00fc
        L_0x05c1:
            r18 = r6
            r19 = r11
            r16 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r16
            r18 = r18[r19]
            r19 = r7
            r20 = r12
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 0
            com.google.android.gms.internal.auth.zzjk.zzi(r18, r19, r20, r21)
            goto L_0x00fc
        L_0x05ee:
            r18 = r6
            r19 = r11
            r16 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r16
            r18 = r18[r19]
            r19 = r7
            r20 = r12
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 0
            com.google.android.gms.internal.auth.zzjk.zzm(r18, r19, r20, r21)
            goto L_0x00fc
        L_0x061b:
            r18 = r6
            r19 = r11
            r16 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r16
            r18 = r18[r19]
            r19 = r7
            r20 = r12
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 0
            com.google.android.gms.internal.auth.zzjk.zzl(r18, r19, r20, r21)
            goto L_0x00fc
        L_0x0648:
            r18 = r6
            r19 = r11
            r16 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r16
            r18 = r18[r19]
            r19 = r7
            r20 = r12
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 0
            com.google.android.gms.internal.auth.zzjk.zzg(r18, r19, r20, r21)
            goto L_0x00fc
        L_0x0675:
            r18 = r6
            r19 = r11
            r16 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r16
            r18 = r18[r19]
            r19 = r7
            r20 = r12
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 0
            com.google.android.gms.internal.auth.zzjk.zzj(r18, r19, r20, r21)
            goto L_0x00fc
        L_0x06a2:
            r18 = r6
            r19 = r11
            r16 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r16
            r18 = r18[r19]
            r19 = r7
            r20 = r12
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 0
            com.google.android.gms.internal.auth.zzjk.zze(r18, r19, r20, r21)
            goto L_0x00fc
        L_0x06cf:
            r18 = r6
            r19 = r11
            r16 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r16
            r18 = r18[r19]
            r19 = r7
            r20 = r12
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 1
            com.google.android.gms.internal.auth.zzjk.zza((int) r18, (java.util.List<java.lang.Double>) r19, (com.google.android.gms.internal.auth.zzkx) r20, (boolean) r21)
            goto L_0x00fc
        L_0x06fc:
            r18 = r6
            r19 = r11
            r16 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r16
            r18 = r18[r19]
            r19 = r7
            r20 = r12
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 1
            com.google.android.gms.internal.auth.zzjk.zzb((int) r18, (java.util.List<java.lang.Float>) r19, (com.google.android.gms.internal.auth.zzkx) r20, (boolean) r21)
            goto L_0x00fc
        L_0x0729:
            r18 = r6
            r19 = r11
            r16 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r16
            r18 = r18[r19]
            r19 = r7
            r20 = r12
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 1
            com.google.android.gms.internal.auth.zzjk.zzc(r18, r19, r20, r21)
            goto L_0x00fc
        L_0x0756:
            r18 = r6
            r19 = r11
            r16 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r16
            r18 = r18[r19]
            r19 = r7
            r20 = r12
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 1
            com.google.android.gms.internal.auth.zzjk.zzd(r18, r19, r20, r21)
            goto L_0x00fc
        L_0x0783:
            r18 = r6
            r19 = r11
            r16 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r16
            r18 = r18[r19]
            r19 = r7
            r20 = r12
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 1
            com.google.android.gms.internal.auth.zzjk.zzh(r18, r19, r20, r21)
            goto L_0x00fc
        L_0x07b0:
            r18 = r6
            r19 = r11
            r16 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r16
            r18 = r18[r19]
            r19 = r7
            r20 = r12
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 1
            com.google.android.gms.internal.auth.zzjk.zzf(r18, r19, r20, r21)
            goto L_0x00fc
        L_0x07dd:
            r18 = r6
            r19 = r11
            r16 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r16
            r18 = r18[r19]
            r19 = r7
            r20 = r12
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 1
            com.google.android.gms.internal.auth.zzjk.zzk(r18, r19, r20, r21)
            goto L_0x00fc
        L_0x080a:
            r18 = r6
            r19 = r11
            r16 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r16
            r18 = r18[r19]
            r19 = r7
            r20 = r12
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 1
            com.google.android.gms.internal.auth.zzjk.zzn(r18, r19, r20, r21)
            goto L_0x00fc
        L_0x0837:
            r18 = r6
            r19 = r11
            r16 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r16
            r18 = r18[r19]
            r19 = r7
            r20 = r12
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 1
            com.google.android.gms.internal.auth.zzjk.zzi(r18, r19, r20, r21)
            goto L_0x00fc
        L_0x0864:
            r18 = r6
            r19 = r11
            r16 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r16
            r18 = r18[r19]
            r19 = r7
            r20 = r12
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 1
            com.google.android.gms.internal.auth.zzjk.zzm(r18, r19, r20, r21)
            goto L_0x00fc
        L_0x0891:
            r18 = r6
            r19 = r11
            r16 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r16
            r18 = r18[r19]
            r19 = r7
            r20 = r12
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 1
            com.google.android.gms.internal.auth.zzjk.zzl(r18, r19, r20, r21)
            goto L_0x00fc
        L_0x08be:
            r18 = r6
            r19 = r11
            r16 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r16
            r18 = r18[r19]
            r19 = r7
            r20 = r12
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 1
            com.google.android.gms.internal.auth.zzjk.zzg(r18, r19, r20, r21)
            goto L_0x00fc
        L_0x08eb:
            r18 = r6
            r19 = r11
            r16 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r16
            r18 = r18[r19]
            r19 = r7
            r20 = r12
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 1
            com.google.android.gms.internal.auth.zzjk.zzj(r18, r19, r20, r21)
            goto L_0x00fc
        L_0x0918:
            r18 = r6
            r19 = r11
            r16 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r16
            r18 = r18[r19]
            r19 = r7
            r20 = r12
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 1
            com.google.android.gms.internal.auth.zzjk.zze(r18, r19, r20, r21)
            goto L_0x00fc
        L_0x0945:
            r18 = r6
            r19 = r11
            r16 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r16
            r18 = r18[r19]
            r19 = r7
            r20 = r12
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = r6
            r22 = r11
            com.google.android.gms.internal.auth.zzji r21 = r21.zza((int) r22)
            com.google.android.gms.internal.auth.zzjk.zzb((int) r18, (java.util.List<?>) r19, (com.google.android.gms.internal.auth.zzkx) r20, (com.google.android.gms.internal.auth.zzji) r21)
            goto L_0x00fc
        L_0x0978:
            r18 = r6
            r19 = r8
            r20 = r13
            r21 = r7
            r22 = r12
            r23 = 1048575(0xfffff, float:1.469367E-39)
            r22 = r22 & r23
            r0 = r22
            long r0 = (long) r0
            r22 = r0
            java.lang.Object r21 = com.google.android.gms.internal.auth.zzkg.zzf(r21, r22)
            r22 = r11
            r18.zza(r19, r20, r21, r22)
            goto L_0x00fc
        L_0x0997:
            r18 = r6
            r19 = r7
            r20 = r13
            r21 = r11
            boolean r18 = r18.zza(r19, (int) r20, (int) r21)
            if (r18 == 0) goto L_0x00fc
            r18 = r8
            r19 = r13
            r20 = r7
            r21 = r12
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            double r20 = zzb(r20, (long) r21)
            r18.zza((int) r19, (double) r20)
            goto L_0x00fc
        L_0x09c0:
            r18 = r6
            r19 = r7
            r20 = r13
            r21 = r11
            boolean r18 = r18.zza(r19, (int) r20, (int) r21)
            if (r18 == 0) goto L_0x00fc
            r18 = r8
            r19 = r13
            r20 = r7
            r21 = r12
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            float r20 = zzc(r20, r21)
            r18.zza((int) r19, (float) r20)
            goto L_0x00fc
        L_0x09e9:
            r18 = r6
            r19 = r7
            r20 = r13
            r21 = r11
            boolean r18 = r18.zza(r19, (int) r20, (int) r21)
            if (r18 == 0) goto L_0x00fc
            r18 = r8
            r19 = r13
            r20 = r7
            r21 = r12
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            long r20 = zze(r20, r21)
            r18.zza((int) r19, (long) r20)
            goto L_0x00fc
        L_0x0a12:
            r18 = r6
            r19 = r7
            r20 = r13
            r21 = r11
            boolean r18 = r18.zza(r19, (int) r20, (int) r21)
            if (r18 == 0) goto L_0x00fc
            r18 = r8
            r19 = r13
            r20 = r7
            r21 = r12
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            long r20 = zze(r20, r21)
            r18.zzc((int) r19, (long) r20)
            goto L_0x00fc
        L_0x0a3b:
            r18 = r6
            r19 = r7
            r20 = r13
            r21 = r11
            boolean r18 = r18.zza(r19, (int) r20, (int) r21)
            if (r18 == 0) goto L_0x00fc
            r18 = r8
            r19 = r13
            r20 = r7
            r21 = r12
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            int r20 = zzd(r20, r21)
            r18.zzc((int) r19, (int) r20)
            goto L_0x00fc
        L_0x0a64:
            r18 = r6
            r19 = r7
            r20 = r13
            r21 = r11
            boolean r18 = r18.zza(r19, (int) r20, (int) r21)
            if (r18 == 0) goto L_0x00fc
            r18 = r8
            r19 = r13
            r20 = r7
            r21 = r12
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            long r20 = zze(r20, r21)
            r18.zzd((int) r19, (long) r20)
            goto L_0x00fc
        L_0x0a8d:
            r18 = r6
            r19 = r7
            r20 = r13
            r21 = r11
            boolean r18 = r18.zza(r19, (int) r20, (int) r21)
            if (r18 == 0) goto L_0x00fc
            r18 = r8
            r19 = r13
            r20 = r7
            r21 = r12
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            int r20 = zzd(r20, r21)
            r18.zzd((int) r19, (int) r20)
            goto L_0x00fc
        L_0x0ab6:
            r18 = r6
            r19 = r7
            r20 = r13
            r21 = r11
            boolean r18 = r18.zza(r19, (int) r20, (int) r21)
            if (r18 == 0) goto L_0x00fc
            r18 = r8
            r19 = r13
            r20 = r7
            r21 = r12
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            boolean r20 = zzf(r20, r21)
            r18.zza((int) r19, (boolean) r20)
            goto L_0x00fc
        L_0x0adf:
            r18 = r6
            r19 = r7
            r20 = r13
            r21 = r11
            boolean r18 = r18.zza(r19, (int) r20, (int) r21)
            if (r18 == 0) goto L_0x00fc
            r18 = r13
            r19 = r7
            r20 = r12
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            r20 = r8
            zza((int) r18, (java.lang.Object) r19, (com.google.android.gms.internal.auth.zzkx) r20)
            goto L_0x00fc
        L_0x0b08:
            r18 = r6
            r19 = r7
            r20 = r13
            r21 = r11
            boolean r18 = r18.zza(r19, (int) r20, (int) r21)
            if (r18 == 0) goto L_0x00fc
            r18 = r7
            r19 = r12
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r19 & r20
            r0 = r19
            long r0 = (long) r0
            r19 = r0
            java.lang.Object r18 = com.google.android.gms.internal.auth.zzkg.zzf(r18, r19)
            r14 = r18
            r18 = r8
            r19 = r13
            r20 = r14
            r21 = r6
            r22 = r11
            com.google.android.gms.internal.auth.zzji r21 = r21.zza((int) r22)
            r18.zza((int) r19, (java.lang.Object) r20, (com.google.android.gms.internal.auth.zzji) r21)
            goto L_0x00fc
        L_0x0b3d:
            r18 = r6
            r19 = r7
            r20 = r13
            r21 = r11
            boolean r18 = r18.zza(r19, (int) r20, (int) r21)
            if (r18 == 0) goto L_0x00fc
            r18 = r8
            r19 = r13
            r20 = r7
            r21 = r12
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            java.lang.Object r20 = com.google.android.gms.internal.auth.zzkg.zzf(r20, r21)
            com.google.android.gms.internal.auth.zzgi r20 = (com.google.android.gms.internal.auth.zzgi) r20
            r18.zza((int) r19, (com.google.android.gms.internal.auth.zzgi) r20)
            goto L_0x00fc
        L_0x0b68:
            r18 = r6
            r19 = r7
            r20 = r13
            r21 = r11
            boolean r18 = r18.zza(r19, (int) r20, (int) r21)
            if (r18 == 0) goto L_0x00fc
            r18 = r8
            r19 = r13
            r20 = r7
            r21 = r12
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            int r20 = zzd(r20, r21)
            r18.zze((int) r19, (int) r20)
            goto L_0x00fc
        L_0x0b91:
            r18 = r6
            r19 = r7
            r20 = r13
            r21 = r11
            boolean r18 = r18.zza(r19, (int) r20, (int) r21)
            if (r18 == 0) goto L_0x00fc
            r18 = r8
            r19 = r13
            r20 = r7
            r21 = r12
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            int r20 = zzd(r20, r21)
            r18.zzb((int) r19, (int) r20)
            goto L_0x00fc
        L_0x0bba:
            r18 = r6
            r19 = r7
            r20 = r13
            r21 = r11
            boolean r18 = r18.zza(r19, (int) r20, (int) r21)
            if (r18 == 0) goto L_0x00fc
            r18 = r8
            r19 = r13
            r20 = r7
            r21 = r12
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            int r20 = zzd(r20, r21)
            r18.zza((int) r19, (int) r20)
            goto L_0x00fc
        L_0x0be3:
            r18 = r6
            r19 = r7
            r20 = r13
            r21 = r11
            boolean r18 = r18.zza(r19, (int) r20, (int) r21)
            if (r18 == 0) goto L_0x00fc
            r18 = r8
            r19 = r13
            r20 = r7
            r21 = r12
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            long r20 = zze(r20, r21)
            r18.zzb((int) r19, (long) r20)
            goto L_0x00fc
        L_0x0c0c:
            r18 = r6
            r19 = r7
            r20 = r13
            r21 = r11
            boolean r18 = r18.zza(r19, (int) r20, (int) r21)
            if (r18 == 0) goto L_0x00fc
            r18 = r8
            r19 = r13
            r20 = r7
            r21 = r12
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            int r20 = zzd(r20, r21)
            r18.zzf(r19, r20)
            goto L_0x00fc
        L_0x0c35:
            r18 = r6
            r19 = r7
            r20 = r13
            r21 = r11
            boolean r18 = r18.zza(r19, (int) r20, (int) r21)
            if (r18 == 0) goto L_0x00fc
            r18 = r8
            r19 = r13
            r20 = r7
            r21 = r12
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            long r20 = zze(r20, r21)
            r18.zze((int) r19, (long) r20)
            goto L_0x00fc
        L_0x0c5e:
            r18 = r6
            r19 = r7
            r20 = r13
            r21 = r11
            boolean r18 = r18.zza(r19, (int) r20, (int) r21)
            if (r18 == 0) goto L_0x00fc
            r18 = r8
            r19 = r13
            r20 = r7
            r21 = r12
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            java.lang.Object r20 = com.google.android.gms.internal.auth.zzkg.zzf(r20, r21)
            r21 = r6
            r22 = r11
            com.google.android.gms.internal.auth.zzji r21 = r21.zza((int) r22)
            r18.zzb((int) r19, (java.lang.Object) r20, (com.google.android.gms.internal.auth.zzji) r21)
            goto L_0x00fc
        L_0x0c8f:
            r18 = r10
            if (r18 == 0) goto L_0x0cb8
            r18 = r6
            r0 = r18
            com.google.android.gms.internal.auth.zzhd<?> r0 = r0.zzr
            r18 = r0
            r19 = r8
            r20 = r10
            r18.zza(r19, r20)
            r18 = r9
            boolean r18 = r18.hasNext()
            if (r18 == 0) goto L_0x0cb5
            r18 = r9
            java.lang.Object r18 = r18.next()
            java.util.Map$Entry r18 = (java.util.Map.Entry) r18
        L_0x0cb2:
            r10 = r18
            goto L_0x0c8f
        L_0x0cb5:
            r18 = 0
            goto L_0x0cb2
        L_0x0cb8:
            return
        L_0x0cb9:
            r18 = r3
            r0 = r18
            boolean r0 = r0.zzj
            r18 = r0
            if (r18 == 0) goto L_0x196b
            r18 = r3
            r19 = r4
            r20 = r5
            r8 = r20
            r7 = r19
            r6 = r18
            r18 = 0
            r9 = r18
            r18 = 0
            r10 = r18
            r18 = r6
            r0 = r18
            boolean r0 = r0.zzh
            r18 = r0
            if (r18 == 0) goto L_0x0d19
            r18 = r6
            r0 = r18
            com.google.android.gms.internal.auth.zzhd<?> r0 = r0.zzr
            r18 = r0
            r19 = r7
            com.google.android.gms.internal.auth.zzhe r18 = r18.zza((java.lang.Object) r19)
            r24 = r18
            r18 = r24
            r19 = r24
            r11 = r19
            r0 = r18
            com.google.android.gms.internal.auth.zzjn<T, java.lang.Object> r0 = r0.zza
            r18 = r0
            boolean r18 = r18.isEmpty()
            if (r18 != 0) goto L_0x0d19
            r18 = r11
            java.util.Iterator r18 = r18.zzd()
            r24 = r18
            r18 = r24
            r19 = r24
            r9 = r19
            java.lang.Object r18 = r18.next()
            java.util.Map$Entry r18 = (java.util.Map.Entry) r18
            r10 = r18
        L_0x0d19:
            r18 = r6
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r0 = r18
            int r0 = r0.length
            r18 = r0
            r11 = r18
            r18 = 0
            r12 = r18
        L_0x0d2c:
            r18 = r12
            r19 = r11
            r0 = r18
            r1 = r19
            if (r0 >= r1) goto L_0x1931
            r18 = r6
            r19 = r12
            int r18 = r18.zzd((int) r19)
            r13 = r18
            r18 = r6
            r19 = r12
            r17 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r17
            r18 = r18[r19]
            r14 = r18
        L_0x0d52:
            r18 = r10
            if (r18 == 0) goto L_0x0d91
            r18 = r6
            r0 = r18
            com.google.android.gms.internal.auth.zzhd<?> r0 = r0.zzr
            r18 = r0
            r19 = r10
            int r18 = r18.zza((java.util.Map.Entry<?, ?>) r19)
            r19 = r14
            r0 = r18
            r1 = r19
            if (r0 > r1) goto L_0x0d91
            r18 = r6
            r0 = r18
            com.google.android.gms.internal.auth.zzhd<?> r0 = r0.zzr
            r18 = r0
            r19 = r8
            r20 = r10
            r18.zza(r19, r20)
            r18 = r9
            boolean r18 = r18.hasNext()
            if (r18 == 0) goto L_0x0d8e
            r18 = r9
            java.lang.Object r18 = r18.next()
            java.util.Map$Entry r18 = (java.util.Map.Entry) r18
        L_0x0d8b:
            r10 = r18
            goto L_0x0d52
        L_0x0d8e:
            r18 = 0
            goto L_0x0d8b
        L_0x0d91:
            r18 = r13
            r19 = 267386880(0xff00000, float:2.3665827E-29)
            r18 = r18 & r19
            r19 = 20
            int r18 = r18 >>> 20
            switch(r18) {
                case 0: goto L_0x0da1;
                case 1: goto L_0x0dc7;
                case 2: goto L_0x0ded;
                case 3: goto L_0x0e13;
                case 4: goto L_0x0e3a;
                case 5: goto L_0x0e61;
                case 6: goto L_0x0e88;
                case 7: goto L_0x0eaf;
                case 8: goto L_0x0ed6;
                case 9: goto L_0x0efd;
                case 10: goto L_0x0f30;
                case 11: goto L_0x0f59;
                case 12: goto L_0x0f80;
                case 13: goto L_0x0fa7;
                case 14: goto L_0x0fce;
                case 15: goto L_0x0ff5;
                case 16: goto L_0x101c;
                case 17: goto L_0x1043;
                case 18: goto L_0x1072;
                case 19: goto L_0x109f;
                case 20: goto L_0x10cc;
                case 21: goto L_0x10f9;
                case 22: goto L_0x1126;
                case 23: goto L_0x1153;
                case 24: goto L_0x1180;
                case 25: goto L_0x11ad;
                case 26: goto L_0x11da;
                case 27: goto L_0x1205;
                case 28: goto L_0x1238;
                case 29: goto L_0x1263;
                case 30: goto L_0x1290;
                case 31: goto L_0x12bd;
                case 32: goto L_0x12ea;
                case 33: goto L_0x1317;
                case 34: goto L_0x1344;
                case 35: goto L_0x1371;
                case 36: goto L_0x139e;
                case 37: goto L_0x13cb;
                case 38: goto L_0x13f8;
                case 39: goto L_0x1425;
                case 40: goto L_0x1452;
                case 41: goto L_0x147f;
                case 42: goto L_0x14ac;
                case 43: goto L_0x14d9;
                case 44: goto L_0x1506;
                case 45: goto L_0x1533;
                case 46: goto L_0x1560;
                case 47: goto L_0x158d;
                case 48: goto L_0x15ba;
                case 49: goto L_0x15e7;
                case 50: goto L_0x161a;
                case 51: goto L_0x1639;
                case 52: goto L_0x1662;
                case 53: goto L_0x168b;
                case 54: goto L_0x16b4;
                case 55: goto L_0x16dd;
                case 56: goto L_0x1706;
                case 57: goto L_0x172f;
                case 58: goto L_0x1758;
                case 59: goto L_0x1781;
                case 60: goto L_0x17aa;
                case 61: goto L_0x17df;
                case 62: goto L_0x180a;
                case 63: goto L_0x1833;
                case 64: goto L_0x185c;
                case 65: goto L_0x1885;
                case 66: goto L_0x18ae;
                case 67: goto L_0x18d7;
                case 68: goto L_0x1900;
                default: goto L_0x0d9e;
            }
        L_0x0d9e:
            int r12 = r12 + 3
            goto L_0x0d2c
        L_0x0da1:
            r18 = r6
            r19 = r7
            r20 = r12
            boolean r18 = r18.zza(r19, (int) r20)
            if (r18 == 0) goto L_0x0d9e
            r18 = r8
            r19 = r14
            r20 = r7
            r21 = r13
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            double r20 = com.google.android.gms.internal.auth.zzkg.zze(r20, r21)
            r18.zza((int) r19, (double) r20)
            goto L_0x0d9e
        L_0x0dc7:
            r18 = r6
            r19 = r7
            r20 = r12
            boolean r18 = r18.zza(r19, (int) r20)
            if (r18 == 0) goto L_0x0d9e
            r18 = r8
            r19 = r14
            r20 = r7
            r21 = r13
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            float r20 = com.google.android.gms.internal.auth.zzkg.zzd(r20, r21)
            r18.zza((int) r19, (float) r20)
            goto L_0x0d9e
        L_0x0ded:
            r18 = r6
            r19 = r7
            r20 = r12
            boolean r18 = r18.zza(r19, (int) r20)
            if (r18 == 0) goto L_0x0d9e
            r18 = r8
            r19 = r14
            r20 = r7
            r21 = r13
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            long r20 = com.google.android.gms.internal.auth.zzkg.zzb(r20, r21)
            r18.zza((int) r19, (long) r20)
            goto L_0x0d9e
        L_0x0e13:
            r18 = r6
            r19 = r7
            r20 = r12
            boolean r18 = r18.zza(r19, (int) r20)
            if (r18 == 0) goto L_0x0d9e
            r18 = r8
            r19 = r14
            r20 = r7
            r21 = r13
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            long r20 = com.google.android.gms.internal.auth.zzkg.zzb(r20, r21)
            r18.zzc((int) r19, (long) r20)
            goto L_0x0d9e
        L_0x0e3a:
            r18 = r6
            r19 = r7
            r20 = r12
            boolean r18 = r18.zza(r19, (int) r20)
            if (r18 == 0) goto L_0x0d9e
            r18 = r8
            r19 = r14
            r20 = r7
            r21 = r13
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            int r20 = com.google.android.gms.internal.auth.zzkg.zza((java.lang.Object) r20, (long) r21)
            r18.zzc((int) r19, (int) r20)
            goto L_0x0d9e
        L_0x0e61:
            r18 = r6
            r19 = r7
            r20 = r12
            boolean r18 = r18.zza(r19, (int) r20)
            if (r18 == 0) goto L_0x0d9e
            r18 = r8
            r19 = r14
            r20 = r7
            r21 = r13
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            long r20 = com.google.android.gms.internal.auth.zzkg.zzb(r20, r21)
            r18.zzd((int) r19, (long) r20)
            goto L_0x0d9e
        L_0x0e88:
            r18 = r6
            r19 = r7
            r20 = r12
            boolean r18 = r18.zza(r19, (int) r20)
            if (r18 == 0) goto L_0x0d9e
            r18 = r8
            r19 = r14
            r20 = r7
            r21 = r13
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            int r20 = com.google.android.gms.internal.auth.zzkg.zza((java.lang.Object) r20, (long) r21)
            r18.zzd((int) r19, (int) r20)
            goto L_0x0d9e
        L_0x0eaf:
            r18 = r6
            r19 = r7
            r20 = r12
            boolean r18 = r18.zza(r19, (int) r20)
            if (r18 == 0) goto L_0x0d9e
            r18 = r8
            r19 = r14
            r20 = r7
            r21 = r13
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            boolean r20 = com.google.android.gms.internal.auth.zzkg.zzc(r20, r21)
            r18.zza((int) r19, (boolean) r20)
            goto L_0x0d9e
        L_0x0ed6:
            r18 = r6
            r19 = r7
            r20 = r12
            boolean r18 = r18.zza(r19, (int) r20)
            if (r18 == 0) goto L_0x0d9e
            r18 = r14
            r19 = r7
            r20 = r13
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            r20 = r8
            zza((int) r18, (java.lang.Object) r19, (com.google.android.gms.internal.auth.zzkx) r20)
            goto L_0x0d9e
        L_0x0efd:
            r18 = r6
            r19 = r7
            r20 = r12
            boolean r18 = r18.zza(r19, (int) r20)
            if (r18 == 0) goto L_0x0d9e
            r18 = r7
            r19 = r13
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r19 & r20
            r0 = r19
            long r0 = (long) r0
            r19 = r0
            java.lang.Object r18 = com.google.android.gms.internal.auth.zzkg.zzf(r18, r19)
            r15 = r18
            r18 = r8
            r19 = r14
            r20 = r15
            r21 = r6
            r22 = r12
            com.google.android.gms.internal.auth.zzji r21 = r21.zza((int) r22)
            r18.zza((int) r19, (java.lang.Object) r20, (com.google.android.gms.internal.auth.zzji) r21)
            goto L_0x0d9e
        L_0x0f30:
            r18 = r6
            r19 = r7
            r20 = r12
            boolean r18 = r18.zza(r19, (int) r20)
            if (r18 == 0) goto L_0x0d9e
            r18 = r8
            r19 = r14
            r20 = r7
            r21 = r13
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            java.lang.Object r20 = com.google.android.gms.internal.auth.zzkg.zzf(r20, r21)
            com.google.android.gms.internal.auth.zzgi r20 = (com.google.android.gms.internal.auth.zzgi) r20
            r18.zza((int) r19, (com.google.android.gms.internal.auth.zzgi) r20)
            goto L_0x0d9e
        L_0x0f59:
            r18 = r6
            r19 = r7
            r20 = r12
            boolean r18 = r18.zza(r19, (int) r20)
            if (r18 == 0) goto L_0x0d9e
            r18 = r8
            r19 = r14
            r20 = r7
            r21 = r13
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            int r20 = com.google.android.gms.internal.auth.zzkg.zza((java.lang.Object) r20, (long) r21)
            r18.zze((int) r19, (int) r20)
            goto L_0x0d9e
        L_0x0f80:
            r18 = r6
            r19 = r7
            r20 = r12
            boolean r18 = r18.zza(r19, (int) r20)
            if (r18 == 0) goto L_0x0d9e
            r18 = r8
            r19 = r14
            r20 = r7
            r21 = r13
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            int r20 = com.google.android.gms.internal.auth.zzkg.zza((java.lang.Object) r20, (long) r21)
            r18.zzb((int) r19, (int) r20)
            goto L_0x0d9e
        L_0x0fa7:
            r18 = r6
            r19 = r7
            r20 = r12
            boolean r18 = r18.zza(r19, (int) r20)
            if (r18 == 0) goto L_0x0d9e
            r18 = r8
            r19 = r14
            r20 = r7
            r21 = r13
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            int r20 = com.google.android.gms.internal.auth.zzkg.zza((java.lang.Object) r20, (long) r21)
            r18.zza((int) r19, (int) r20)
            goto L_0x0d9e
        L_0x0fce:
            r18 = r6
            r19 = r7
            r20 = r12
            boolean r18 = r18.zza(r19, (int) r20)
            if (r18 == 0) goto L_0x0d9e
            r18 = r8
            r19 = r14
            r20 = r7
            r21 = r13
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            long r20 = com.google.android.gms.internal.auth.zzkg.zzb(r20, r21)
            r18.zzb((int) r19, (long) r20)
            goto L_0x0d9e
        L_0x0ff5:
            r18 = r6
            r19 = r7
            r20 = r12
            boolean r18 = r18.zza(r19, (int) r20)
            if (r18 == 0) goto L_0x0d9e
            r18 = r8
            r19 = r14
            r20 = r7
            r21 = r13
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            int r20 = com.google.android.gms.internal.auth.zzkg.zza((java.lang.Object) r20, (long) r21)
            r18.zzf(r19, r20)
            goto L_0x0d9e
        L_0x101c:
            r18 = r6
            r19 = r7
            r20 = r12
            boolean r18 = r18.zza(r19, (int) r20)
            if (r18 == 0) goto L_0x0d9e
            r18 = r8
            r19 = r14
            r20 = r7
            r21 = r13
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            long r20 = com.google.android.gms.internal.auth.zzkg.zzb(r20, r21)
            r18.zze((int) r19, (long) r20)
            goto L_0x0d9e
        L_0x1043:
            r18 = r6
            r19 = r7
            r20 = r12
            boolean r18 = r18.zza(r19, (int) r20)
            if (r18 == 0) goto L_0x0d9e
            r18 = r8
            r19 = r14
            r20 = r7
            r21 = r13
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            java.lang.Object r20 = com.google.android.gms.internal.auth.zzkg.zzf(r20, r21)
            r21 = r6
            r22 = r12
            com.google.android.gms.internal.auth.zzji r21 = r21.zza((int) r22)
            r18.zzb((int) r19, (java.lang.Object) r20, (com.google.android.gms.internal.auth.zzji) r21)
            goto L_0x0d9e
        L_0x1072:
            r18 = r6
            r19 = r12
            r17 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r17
            r18 = r18[r19]
            r19 = r7
            r20 = r13
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 0
            com.google.android.gms.internal.auth.zzjk.zza((int) r18, (java.util.List<java.lang.Double>) r19, (com.google.android.gms.internal.auth.zzkx) r20, (boolean) r21)
            goto L_0x0d9e
        L_0x109f:
            r18 = r6
            r19 = r12
            r17 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r17
            r18 = r18[r19]
            r19 = r7
            r20 = r13
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 0
            com.google.android.gms.internal.auth.zzjk.zzb((int) r18, (java.util.List<java.lang.Float>) r19, (com.google.android.gms.internal.auth.zzkx) r20, (boolean) r21)
            goto L_0x0d9e
        L_0x10cc:
            r18 = r6
            r19 = r12
            r17 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r17
            r18 = r18[r19]
            r19 = r7
            r20 = r13
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 0
            com.google.android.gms.internal.auth.zzjk.zzc(r18, r19, r20, r21)
            goto L_0x0d9e
        L_0x10f9:
            r18 = r6
            r19 = r12
            r17 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r17
            r18 = r18[r19]
            r19 = r7
            r20 = r13
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 0
            com.google.android.gms.internal.auth.zzjk.zzd(r18, r19, r20, r21)
            goto L_0x0d9e
        L_0x1126:
            r18 = r6
            r19 = r12
            r17 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r17
            r18 = r18[r19]
            r19 = r7
            r20 = r13
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 0
            com.google.android.gms.internal.auth.zzjk.zzh(r18, r19, r20, r21)
            goto L_0x0d9e
        L_0x1153:
            r18 = r6
            r19 = r12
            r17 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r17
            r18 = r18[r19]
            r19 = r7
            r20 = r13
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 0
            com.google.android.gms.internal.auth.zzjk.zzf(r18, r19, r20, r21)
            goto L_0x0d9e
        L_0x1180:
            r18 = r6
            r19 = r12
            r17 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r17
            r18 = r18[r19]
            r19 = r7
            r20 = r13
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 0
            com.google.android.gms.internal.auth.zzjk.zzk(r18, r19, r20, r21)
            goto L_0x0d9e
        L_0x11ad:
            r18 = r6
            r19 = r12
            r17 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r17
            r18 = r18[r19]
            r19 = r7
            r20 = r13
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 0
            com.google.android.gms.internal.auth.zzjk.zzn(r18, r19, r20, r21)
            goto L_0x0d9e
        L_0x11da:
            r18 = r6
            r19 = r12
            r17 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r17
            r18 = r18[r19]
            r19 = r7
            r20 = r13
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            com.google.android.gms.internal.auth.zzjk.zza((int) r18, (java.util.List<java.lang.String>) r19, (com.google.android.gms.internal.auth.zzkx) r20)
            goto L_0x0d9e
        L_0x1205:
            r18 = r6
            r19 = r12
            r17 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r17
            r18 = r18[r19]
            r19 = r7
            r20 = r13
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = r6
            r22 = r12
            com.google.android.gms.internal.auth.zzji r21 = r21.zza((int) r22)
            com.google.android.gms.internal.auth.zzjk.zza((int) r18, (java.util.List<?>) r19, (com.google.android.gms.internal.auth.zzkx) r20, (com.google.android.gms.internal.auth.zzji) r21)
            goto L_0x0d9e
        L_0x1238:
            r18 = r6
            r19 = r12
            r17 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r17
            r18 = r18[r19]
            r19 = r7
            r20 = r13
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            com.google.android.gms.internal.auth.zzjk.zzb((int) r18, (java.util.List<com.google.android.gms.internal.auth.zzgi>) r19, (com.google.android.gms.internal.auth.zzkx) r20)
            goto L_0x0d9e
        L_0x1263:
            r18 = r6
            r19 = r12
            r17 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r17
            r18 = r18[r19]
            r19 = r7
            r20 = r13
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 0
            com.google.android.gms.internal.auth.zzjk.zzi(r18, r19, r20, r21)
            goto L_0x0d9e
        L_0x1290:
            r18 = r6
            r19 = r12
            r17 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r17
            r18 = r18[r19]
            r19 = r7
            r20 = r13
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 0
            com.google.android.gms.internal.auth.zzjk.zzm(r18, r19, r20, r21)
            goto L_0x0d9e
        L_0x12bd:
            r18 = r6
            r19 = r12
            r17 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r17
            r18 = r18[r19]
            r19 = r7
            r20 = r13
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 0
            com.google.android.gms.internal.auth.zzjk.zzl(r18, r19, r20, r21)
            goto L_0x0d9e
        L_0x12ea:
            r18 = r6
            r19 = r12
            r17 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r17
            r18 = r18[r19]
            r19 = r7
            r20 = r13
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 0
            com.google.android.gms.internal.auth.zzjk.zzg(r18, r19, r20, r21)
            goto L_0x0d9e
        L_0x1317:
            r18 = r6
            r19 = r12
            r17 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r17
            r18 = r18[r19]
            r19 = r7
            r20 = r13
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 0
            com.google.android.gms.internal.auth.zzjk.zzj(r18, r19, r20, r21)
            goto L_0x0d9e
        L_0x1344:
            r18 = r6
            r19 = r12
            r17 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r17
            r18 = r18[r19]
            r19 = r7
            r20 = r13
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 0
            com.google.android.gms.internal.auth.zzjk.zze(r18, r19, r20, r21)
            goto L_0x0d9e
        L_0x1371:
            r18 = r6
            r19 = r12
            r17 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r17
            r18 = r18[r19]
            r19 = r7
            r20 = r13
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 1
            com.google.android.gms.internal.auth.zzjk.zza((int) r18, (java.util.List<java.lang.Double>) r19, (com.google.android.gms.internal.auth.zzkx) r20, (boolean) r21)
            goto L_0x0d9e
        L_0x139e:
            r18 = r6
            r19 = r12
            r17 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r17
            r18 = r18[r19]
            r19 = r7
            r20 = r13
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 1
            com.google.android.gms.internal.auth.zzjk.zzb((int) r18, (java.util.List<java.lang.Float>) r19, (com.google.android.gms.internal.auth.zzkx) r20, (boolean) r21)
            goto L_0x0d9e
        L_0x13cb:
            r18 = r6
            r19 = r12
            r17 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r17
            r18 = r18[r19]
            r19 = r7
            r20 = r13
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 1
            com.google.android.gms.internal.auth.zzjk.zzc(r18, r19, r20, r21)
            goto L_0x0d9e
        L_0x13f8:
            r18 = r6
            r19 = r12
            r17 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r17
            r18 = r18[r19]
            r19 = r7
            r20 = r13
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 1
            com.google.android.gms.internal.auth.zzjk.zzd(r18, r19, r20, r21)
            goto L_0x0d9e
        L_0x1425:
            r18 = r6
            r19 = r12
            r17 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r17
            r18 = r18[r19]
            r19 = r7
            r20 = r13
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 1
            com.google.android.gms.internal.auth.zzjk.zzh(r18, r19, r20, r21)
            goto L_0x0d9e
        L_0x1452:
            r18 = r6
            r19 = r12
            r17 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r17
            r18 = r18[r19]
            r19 = r7
            r20 = r13
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 1
            com.google.android.gms.internal.auth.zzjk.zzf(r18, r19, r20, r21)
            goto L_0x0d9e
        L_0x147f:
            r18 = r6
            r19 = r12
            r17 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r17
            r18 = r18[r19]
            r19 = r7
            r20 = r13
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 1
            com.google.android.gms.internal.auth.zzjk.zzk(r18, r19, r20, r21)
            goto L_0x0d9e
        L_0x14ac:
            r18 = r6
            r19 = r12
            r17 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r17
            r18 = r18[r19]
            r19 = r7
            r20 = r13
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 1
            com.google.android.gms.internal.auth.zzjk.zzn(r18, r19, r20, r21)
            goto L_0x0d9e
        L_0x14d9:
            r18 = r6
            r19 = r12
            r17 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r17
            r18 = r18[r19]
            r19 = r7
            r20 = r13
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 1
            com.google.android.gms.internal.auth.zzjk.zzi(r18, r19, r20, r21)
            goto L_0x0d9e
        L_0x1506:
            r18 = r6
            r19 = r12
            r17 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r17
            r18 = r18[r19]
            r19 = r7
            r20 = r13
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 1
            com.google.android.gms.internal.auth.zzjk.zzm(r18, r19, r20, r21)
            goto L_0x0d9e
        L_0x1533:
            r18 = r6
            r19 = r12
            r17 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r17
            r18 = r18[r19]
            r19 = r7
            r20 = r13
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 1
            com.google.android.gms.internal.auth.zzjk.zzl(r18, r19, r20, r21)
            goto L_0x0d9e
        L_0x1560:
            r18 = r6
            r19 = r12
            r17 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r17
            r18 = r18[r19]
            r19 = r7
            r20 = r13
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 1
            com.google.android.gms.internal.auth.zzjk.zzg(r18, r19, r20, r21)
            goto L_0x0d9e
        L_0x158d:
            r18 = r6
            r19 = r12
            r17 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r17
            r18 = r18[r19]
            r19 = r7
            r20 = r13
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 1
            com.google.android.gms.internal.auth.zzjk.zzj(r18, r19, r20, r21)
            goto L_0x0d9e
        L_0x15ba:
            r18 = r6
            r19 = r12
            r17 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r17
            r18 = r18[r19]
            r19 = r7
            r20 = r13
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = 1
            com.google.android.gms.internal.auth.zzjk.zze(r18, r19, r20, r21)
            goto L_0x0d9e
        L_0x15e7:
            r18 = r6
            r19 = r12
            r17 = r19
            r0 = r18
            int[] r0 = r0.zzc
            r18 = r0
            r19 = r17
            r18 = r18[r19]
            r19 = r7
            r20 = r13
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            java.util.List r19 = (java.util.List) r19
            r20 = r8
            r21 = r6
            r22 = r12
            com.google.android.gms.internal.auth.zzji r21 = r21.zza((int) r22)
            com.google.android.gms.internal.auth.zzjk.zzb((int) r18, (java.util.List<?>) r19, (com.google.android.gms.internal.auth.zzkx) r20, (com.google.android.gms.internal.auth.zzji) r21)
            goto L_0x0d9e
        L_0x161a:
            r18 = r6
            r19 = r8
            r20 = r14
            r21 = r7
            r22 = r13
            r23 = 1048575(0xfffff, float:1.469367E-39)
            r22 = r22 & r23
            r0 = r22
            long r0 = (long) r0
            r22 = r0
            java.lang.Object r21 = com.google.android.gms.internal.auth.zzkg.zzf(r21, r22)
            r22 = r12
            r18.zza(r19, r20, r21, r22)
            goto L_0x0d9e
        L_0x1639:
            r18 = r6
            r19 = r7
            r20 = r14
            r21 = r12
            boolean r18 = r18.zza(r19, (int) r20, (int) r21)
            if (r18 == 0) goto L_0x0d9e
            r18 = r8
            r19 = r14
            r20 = r7
            r21 = r13
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            double r20 = zzb(r20, (long) r21)
            r18.zza((int) r19, (double) r20)
            goto L_0x0d9e
        L_0x1662:
            r18 = r6
            r19 = r7
            r20 = r14
            r21 = r12
            boolean r18 = r18.zza(r19, (int) r20, (int) r21)
            if (r18 == 0) goto L_0x0d9e
            r18 = r8
            r19 = r14
            r20 = r7
            r21 = r13
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            float r20 = zzc(r20, r21)
            r18.zza((int) r19, (float) r20)
            goto L_0x0d9e
        L_0x168b:
            r18 = r6
            r19 = r7
            r20 = r14
            r21 = r12
            boolean r18 = r18.zza(r19, (int) r20, (int) r21)
            if (r18 == 0) goto L_0x0d9e
            r18 = r8
            r19 = r14
            r20 = r7
            r21 = r13
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            long r20 = zze(r20, r21)
            r18.zza((int) r19, (long) r20)
            goto L_0x0d9e
        L_0x16b4:
            r18 = r6
            r19 = r7
            r20 = r14
            r21 = r12
            boolean r18 = r18.zza(r19, (int) r20, (int) r21)
            if (r18 == 0) goto L_0x0d9e
            r18 = r8
            r19 = r14
            r20 = r7
            r21 = r13
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            long r20 = zze(r20, r21)
            r18.zzc((int) r19, (long) r20)
            goto L_0x0d9e
        L_0x16dd:
            r18 = r6
            r19 = r7
            r20 = r14
            r21 = r12
            boolean r18 = r18.zza(r19, (int) r20, (int) r21)
            if (r18 == 0) goto L_0x0d9e
            r18 = r8
            r19 = r14
            r20 = r7
            r21 = r13
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            int r20 = zzd(r20, r21)
            r18.zzc((int) r19, (int) r20)
            goto L_0x0d9e
        L_0x1706:
            r18 = r6
            r19 = r7
            r20 = r14
            r21 = r12
            boolean r18 = r18.zza(r19, (int) r20, (int) r21)
            if (r18 == 0) goto L_0x0d9e
            r18 = r8
            r19 = r14
            r20 = r7
            r21 = r13
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            long r20 = zze(r20, r21)
            r18.zzd((int) r19, (long) r20)
            goto L_0x0d9e
        L_0x172f:
            r18 = r6
            r19 = r7
            r20 = r14
            r21 = r12
            boolean r18 = r18.zza(r19, (int) r20, (int) r21)
            if (r18 == 0) goto L_0x0d9e
            r18 = r8
            r19 = r14
            r20 = r7
            r21 = r13
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            int r20 = zzd(r20, r21)
            r18.zzd((int) r19, (int) r20)
            goto L_0x0d9e
        L_0x1758:
            r18 = r6
            r19 = r7
            r20 = r14
            r21 = r12
            boolean r18 = r18.zza(r19, (int) r20, (int) r21)
            if (r18 == 0) goto L_0x0d9e
            r18 = r8
            r19 = r14
            r20 = r7
            r21 = r13
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            boolean r20 = zzf(r20, r21)
            r18.zza((int) r19, (boolean) r20)
            goto L_0x0d9e
        L_0x1781:
            r18 = r6
            r19 = r7
            r20 = r14
            r21 = r12
            boolean r18 = r18.zza(r19, (int) r20, (int) r21)
            if (r18 == 0) goto L_0x0d9e
            r18 = r14
            r19 = r7
            r20 = r13
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r20 & r21
            r0 = r20
            long r0 = (long) r0
            r20 = r0
            java.lang.Object r19 = com.google.android.gms.internal.auth.zzkg.zzf(r19, r20)
            r20 = r8
            zza((int) r18, (java.lang.Object) r19, (com.google.android.gms.internal.auth.zzkx) r20)
            goto L_0x0d9e
        L_0x17aa:
            r18 = r6
            r19 = r7
            r20 = r14
            r21 = r12
            boolean r18 = r18.zza(r19, (int) r20, (int) r21)
            if (r18 == 0) goto L_0x0d9e
            r18 = r7
            r19 = r13
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r19 & r20
            r0 = r19
            long r0 = (long) r0
            r19 = r0
            java.lang.Object r18 = com.google.android.gms.internal.auth.zzkg.zzf(r18, r19)
            r15 = r18
            r18 = r8
            r19 = r14
            r20 = r15
            r21 = r6
            r22 = r12
            com.google.android.gms.internal.auth.zzji r21 = r21.zza((int) r22)
            r18.zza((int) r19, (java.lang.Object) r20, (com.google.android.gms.internal.auth.zzji) r21)
            goto L_0x0d9e
        L_0x17df:
            r18 = r6
            r19 = r7
            r20 = r14
            r21 = r12
            boolean r18 = r18.zza(r19, (int) r20, (int) r21)
            if (r18 == 0) goto L_0x0d9e
            r18 = r8
            r19 = r14
            r20 = r7
            r21 = r13
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            java.lang.Object r20 = com.google.android.gms.internal.auth.zzkg.zzf(r20, r21)
            com.google.android.gms.internal.auth.zzgi r20 = (com.google.android.gms.internal.auth.zzgi) r20
            r18.zza((int) r19, (com.google.android.gms.internal.auth.zzgi) r20)
            goto L_0x0d9e
        L_0x180a:
            r18 = r6
            r19 = r7
            r20 = r14
            r21 = r12
            boolean r18 = r18.zza(r19, (int) r20, (int) r21)
            if (r18 == 0) goto L_0x0d9e
            r18 = r8
            r19 = r14
            r20 = r7
            r21 = r13
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            int r20 = zzd(r20, r21)
            r18.zze((int) r19, (int) r20)
            goto L_0x0d9e
        L_0x1833:
            r18 = r6
            r19 = r7
            r20 = r14
            r21 = r12
            boolean r18 = r18.zza(r19, (int) r20, (int) r21)
            if (r18 == 0) goto L_0x0d9e
            r18 = r8
            r19 = r14
            r20 = r7
            r21 = r13
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            int r20 = zzd(r20, r21)
            r18.zzb((int) r19, (int) r20)
            goto L_0x0d9e
        L_0x185c:
            r18 = r6
            r19 = r7
            r20 = r14
            r21 = r12
            boolean r18 = r18.zza(r19, (int) r20, (int) r21)
            if (r18 == 0) goto L_0x0d9e
            r18 = r8
            r19 = r14
            r20 = r7
            r21 = r13
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            int r20 = zzd(r20, r21)
            r18.zza((int) r19, (int) r20)
            goto L_0x0d9e
        L_0x1885:
            r18 = r6
            r19 = r7
            r20 = r14
            r21 = r12
            boolean r18 = r18.zza(r19, (int) r20, (int) r21)
            if (r18 == 0) goto L_0x0d9e
            r18 = r8
            r19 = r14
            r20 = r7
            r21 = r13
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            long r20 = zze(r20, r21)
            r18.zzb((int) r19, (long) r20)
            goto L_0x0d9e
        L_0x18ae:
            r18 = r6
            r19 = r7
            r20 = r14
            r21 = r12
            boolean r18 = r18.zza(r19, (int) r20, (int) r21)
            if (r18 == 0) goto L_0x0d9e
            r18 = r8
            r19 = r14
            r20 = r7
            r21 = r13
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            int r20 = zzd(r20, r21)
            r18.zzf(r19, r20)
            goto L_0x0d9e
        L_0x18d7:
            r18 = r6
            r19 = r7
            r20 = r14
            r21 = r12
            boolean r18 = r18.zza(r19, (int) r20, (int) r21)
            if (r18 == 0) goto L_0x0d9e
            r18 = r8
            r19 = r14
            r20 = r7
            r21 = r13
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            long r20 = zze(r20, r21)
            r18.zze((int) r19, (long) r20)
            goto L_0x0d9e
        L_0x1900:
            r18 = r6
            r19 = r7
            r20 = r14
            r21 = r12
            boolean r18 = r18.zza(r19, (int) r20, (int) r21)
            if (r18 == 0) goto L_0x0d9e
            r18 = r8
            r19 = r14
            r20 = r7
            r21 = r13
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r21 & r22
            r0 = r21
            long r0 = (long) r0
            r21 = r0
            java.lang.Object r20 = com.google.android.gms.internal.auth.zzkg.zzf(r20, r21)
            r21 = r6
            r22 = r12
            com.google.android.gms.internal.auth.zzji r21 = r21.zza((int) r22)
            r18.zzb((int) r19, (java.lang.Object) r20, (com.google.android.gms.internal.auth.zzji) r21)
            goto L_0x0d9e
        L_0x1931:
            r18 = r10
            if (r18 == 0) goto L_0x195a
            r18 = r6
            r0 = r18
            com.google.android.gms.internal.auth.zzhd<?> r0 = r0.zzr
            r18 = r0
            r19 = r8
            r20 = r10
            r18.zza(r19, r20)
            r18 = r9
            boolean r18 = r18.hasNext()
            if (r18 == 0) goto L_0x1957
            r18 = r9
            java.lang.Object r18 = r18.next()
            java.util.Map$Entry r18 = (java.util.Map.Entry) r18
        L_0x1954:
            r10 = r18
            goto L_0x1931
        L_0x1957:
            r18 = 0
            goto L_0x1954
        L_0x195a:
            r18 = r6
            r0 = r18
            com.google.android.gms.internal.auth.zzka<?, ?> r0 = r0.zzq
            r18 = r0
            r19 = r7
            r20 = r8
            zza(r18, r19, (com.google.android.gms.internal.auth.zzkx) r20)
            goto L_0x0cb8
        L_0x196b:
            r18 = r3
            r19 = r4
            r20 = r5
            r18.zzb(r19, (com.google.android.gms.internal.auth.zzkx) r20)
            goto L_0x0cb8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zziw.zza(java.lang.Object, com.google.android.gms.internal.auth.zzkx):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x05ec  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0611  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0636  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x065b  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0680  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x06a5  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x06ca  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x06ef  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0714  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0739  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x075e  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0783  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x07a8  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x07cd  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x07f8  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x080f  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x082e  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x084d  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x086c  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x088b  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x08aa  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x08c9  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x08e8  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0907  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0928  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0955  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0978  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0997  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x09b6  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x09d5  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x09f4  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0a13  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0a32  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x015a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x02dc  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x02f7  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0375  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x039a  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x03bf  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0409  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x042e  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0453  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0478  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x049b  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x04c6  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x04e9  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x050e  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0533  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0558  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x057d  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x05a2  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x05c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzb(T r31, com.google.android.gms.internal.auth.zzkx r32) throws java.io.IOException {
        /*
            r30 = this;
            r3 = r30
            r4 = r31
            r5 = r32
            r22 = 0
            r6 = r22
            r22 = 0
            r7 = r22
            r22 = r3
            r0 = r22
            boolean r0 = r0.zzh
            r22 = r0
            if (r22 == 0) goto L_0x0050
            r22 = r3
            r0 = r22
            com.google.android.gms.internal.auth.zzhd<?> r0 = r0.zzr
            r22 = r0
            r23 = r4
            com.google.android.gms.internal.auth.zzhe r22 = r22.zza((java.lang.Object) r23)
            r29 = r22
            r22 = r29
            r23 = r29
            r8 = r23
            r0 = r22
            com.google.android.gms.internal.auth.zzjn<T, java.lang.Object> r0 = r0.zza
            r22 = r0
            boolean r22 = r22.isEmpty()
            if (r22 != 0) goto L_0x0050
            r22 = r8
            java.util.Iterator r22 = r22.zzd()
            r29 = r22
            r22 = r29
            r23 = r29
            r6 = r23
            java.lang.Object r22 = r22.next()
            java.util.Map$Entry r22 = (java.util.Map.Entry) r22
            r7 = r22
        L_0x0050:
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r22
            r22 = 0
            r9 = r22
            r22 = r3
            r0 = r22
            int[] r0 = r0.zzc
            r22 = r0
            r0 = r22
            int r0 = r0.length
            r22 = r0
            r10 = r22
            sun.misc.Unsafe r22 = zzb
            r11 = r22
            r22 = 0
            r12 = r22
        L_0x0070:
            r22 = r12
            r23 = r10
            r0 = r22
            r1 = r23
            if (r0 >= r1) goto L_0x0a5b
            r22 = r3
            r23 = r12
            int r22 = r22.zzd((int) r23)
            r13 = r22
            r22 = r3
            r23 = r12
            r21 = r23
            r0 = r22
            int[] r0 = r0.zzc
            r22 = r0
            r23 = r21
            r22 = r22[r23]
            r14 = r22
            r22 = r13
            r23 = 267386880(0xff00000, float:2.3665827E-29)
            r22 = r22 & r23
            r23 = 20
            int r22 = r22 >>> 20
            r15 = r22
            r22 = 0
            r17 = r22
            r22 = r3
            r0 = r22
            boolean r0 = r0.zzj
            r22 = r0
            if (r22 != 0) goto L_0x0108
            r22 = r15
            r23 = 17
            r0 = r22
            r1 = r23
            if (r0 > r1) goto L_0x0108
            r22 = r3
            r0 = r22
            int[] r0 = r0.zzc
            r22 = r0
            r23 = r12
            r24 = 2
            int r23 = r23 + 2
            r22 = r22[r23]
            r29 = r22
            r22 = r29
            r23 = r29
            r16 = r23
            r23 = 1048575(0xfffff, float:1.469367E-39)
            r22 = r22 & r23
            r29 = r22
            r22 = r29
            r23 = r29
            r18 = r23
            r23 = r8
            r0 = r22
            r1 = r23
            if (r0 == r1) goto L_0x00fc
            r22 = r18
            r8 = r22
            r22 = r11
            r23 = r4
            r24 = r18
            r0 = r24
            long r0 = (long) r0
            r24 = r0
            int r22 = r22.getInt(r23, r24)
            r9 = r22
        L_0x00fc:
            r22 = 1
            r23 = r16
            r24 = 20
            int r23 = r23 >>> 20
            int r22 = r22 << r23
            r17 = r22
        L_0x0108:
            r22 = r7
            if (r22 == 0) goto L_0x0147
            r22 = r3
            r0 = r22
            com.google.android.gms.internal.auth.zzhd<?> r0 = r0.zzr
            r22 = r0
            r23 = r7
            int r22 = r22.zza((java.util.Map.Entry<?, ?>) r23)
            r23 = r14
            r0 = r22
            r1 = r23
            if (r0 > r1) goto L_0x0147
            r22 = r3
            r0 = r22
            com.google.android.gms.internal.auth.zzhd<?> r0 = r0.zzr
            r22 = r0
            r23 = r5
            r24 = r7
            r22.zza(r23, r24)
            r22 = r6
            boolean r22 = r22.hasNext()
            if (r22 == 0) goto L_0x0144
            r22 = r6
            java.lang.Object r22 = r22.next()
            java.util.Map$Entry r22 = (java.util.Map.Entry) r22
        L_0x0141:
            r7 = r22
            goto L_0x0108
        L_0x0144:
            r22 = 0
            goto L_0x0141
        L_0x0147:
            r22 = r13
            r23 = 1048575(0xfffff, float:1.469367E-39)
            r22 = r22 & r23
            r0 = r22
            long r0 = (long) r0
            r22 = r0
            r18 = r22
            r22 = r15
            switch(r22) {
                case 0: goto L_0x015e;
                case 1: goto L_0x0176;
                case 2: goto L_0x018e;
                case 3: goto L_0x01a8;
                case 4: goto L_0x01c2;
                case 5: goto L_0x01dd;
                case 6: goto L_0x01f8;
                case 7: goto L_0x0213;
                case 8: goto L_0x022c;
                case 9: goto L_0x0247;
                case 10: goto L_0x026e;
                case 11: goto L_0x028b;
                case 12: goto L_0x02a6;
                case 13: goto L_0x02c1;
                case 14: goto L_0x02dc;
                case 15: goto L_0x02f7;
                case 16: goto L_0x0312;
                case 17: goto L_0x032d;
                case 18: goto L_0x0350;
                case 19: goto L_0x0375;
                case 20: goto L_0x039a;
                case 21: goto L_0x03bf;
                case 22: goto L_0x03e4;
                case 23: goto L_0x0409;
                case 24: goto L_0x042e;
                case 25: goto L_0x0453;
                case 26: goto L_0x0478;
                case 27: goto L_0x049b;
                case 28: goto L_0x04c6;
                case 29: goto L_0x04e9;
                case 30: goto L_0x050e;
                case 31: goto L_0x0533;
                case 32: goto L_0x0558;
                case 33: goto L_0x057d;
                case 34: goto L_0x05a2;
                case 35: goto L_0x05c7;
                case 36: goto L_0x05ec;
                case 37: goto L_0x0611;
                case 38: goto L_0x0636;
                case 39: goto L_0x065b;
                case 40: goto L_0x0680;
                case 41: goto L_0x06a5;
                case 42: goto L_0x06ca;
                case 43: goto L_0x06ef;
                case 44: goto L_0x0714;
                case 45: goto L_0x0739;
                case 46: goto L_0x075e;
                case 47: goto L_0x0783;
                case 48: goto L_0x07a8;
                case 49: goto L_0x07cd;
                case 50: goto L_0x07f8;
                case 51: goto L_0x080f;
                case 52: goto L_0x082e;
                case 53: goto L_0x084d;
                case 54: goto L_0x086c;
                case 55: goto L_0x088b;
                case 56: goto L_0x08aa;
                case 57: goto L_0x08c9;
                case 58: goto L_0x08e8;
                case 59: goto L_0x0907;
                case 60: goto L_0x0928;
                case 61: goto L_0x0955;
                case 62: goto L_0x0978;
                case 63: goto L_0x0997;
                case 64: goto L_0x09b6;
                case 65: goto L_0x09d5;
                case 66: goto L_0x09f4;
                case 67: goto L_0x0a13;
                case 68: goto L_0x0a32;
                default: goto L_0x015a;
            }
        L_0x015a:
            int r12 = r12 + 3
            goto L_0x0070
        L_0x015e:
            r22 = r9
            r23 = r17
            r22 = r22 & r23
            if (r22 == 0) goto L_0x015a
            r22 = r5
            r23 = r14
            r24 = r4
            r25 = r18
            double r24 = com.google.android.gms.internal.auth.zzkg.zze(r24, r25)
            r22.zza((int) r23, (double) r24)
            goto L_0x015a
        L_0x0176:
            r22 = r9
            r23 = r17
            r22 = r22 & r23
            if (r22 == 0) goto L_0x015a
            r22 = r5
            r23 = r14
            r24 = r4
            r25 = r18
            float r24 = com.google.android.gms.internal.auth.zzkg.zzd(r24, r25)
            r22.zza((int) r23, (float) r24)
            goto L_0x015a
        L_0x018e:
            r22 = r9
            r23 = r17
            r22 = r22 & r23
            if (r22 == 0) goto L_0x015a
            r22 = r5
            r23 = r14
            r24 = r11
            r25 = r4
            r26 = r18
            long r24 = r24.getLong(r25, r26)
            r22.zza((int) r23, (long) r24)
            goto L_0x015a
        L_0x01a8:
            r22 = r9
            r23 = r17
            r22 = r22 & r23
            if (r22 == 0) goto L_0x015a
            r22 = r5
            r23 = r14
            r24 = r11
            r25 = r4
            r26 = r18
            long r24 = r24.getLong(r25, r26)
            r22.zzc((int) r23, (long) r24)
            goto L_0x015a
        L_0x01c2:
            r22 = r9
            r23 = r17
            r22 = r22 & r23
            if (r22 == 0) goto L_0x015a
            r22 = r5
            r23 = r14
            r24 = r11
            r25 = r4
            r26 = r18
            int r24 = r24.getInt(r25, r26)
            r22.zzc((int) r23, (int) r24)
            goto L_0x015a
        L_0x01dd:
            r22 = r9
            r23 = r17
            r22 = r22 & r23
            if (r22 == 0) goto L_0x015a
            r22 = r5
            r23 = r14
            r24 = r11
            r25 = r4
            r26 = r18
            long r24 = r24.getLong(r25, r26)
            r22.zzd((int) r23, (long) r24)
            goto L_0x015a
        L_0x01f8:
            r22 = r9
            r23 = r17
            r22 = r22 & r23
            if (r22 == 0) goto L_0x015a
            r22 = r5
            r23 = r14
            r24 = r11
            r25 = r4
            r26 = r18
            int r24 = r24.getInt(r25, r26)
            r22.zzd((int) r23, (int) r24)
            goto L_0x015a
        L_0x0213:
            r22 = r9
            r23 = r17
            r22 = r22 & r23
            if (r22 == 0) goto L_0x015a
            r22 = r5
            r23 = r14
            r24 = r4
            r25 = r18
            boolean r24 = com.google.android.gms.internal.auth.zzkg.zzc(r24, r25)
            r22.zza((int) r23, (boolean) r24)
            goto L_0x015a
        L_0x022c:
            r22 = r9
            r23 = r17
            r22 = r22 & r23
            if (r22 == 0) goto L_0x015a
            r22 = r14
            r23 = r11
            r24 = r4
            r25 = r18
            java.lang.Object r23 = r23.getObject(r24, r25)
            r24 = r5
            zza((int) r22, (java.lang.Object) r23, (com.google.android.gms.internal.auth.zzkx) r24)
            goto L_0x015a
        L_0x0247:
            r22 = r9
            r23 = r17
            r22 = r22 & r23
            if (r22 == 0) goto L_0x015a
            r22 = r11
            r23 = r4
            r24 = r18
            java.lang.Object r22 = r22.getObject(r23, r24)
            r20 = r22
            r22 = r5
            r23 = r14
            r24 = r20
            r25 = r3
            r26 = r12
            com.google.android.gms.internal.auth.zzji r25 = r25.zza((int) r26)
            r22.zza((int) r23, (java.lang.Object) r24, (com.google.android.gms.internal.auth.zzji) r25)
            goto L_0x015a
        L_0x026e:
            r22 = r9
            r23 = r17
            r22 = r22 & r23
            if (r22 == 0) goto L_0x015a
            r22 = r5
            r23 = r14
            r24 = r11
            r25 = r4
            r26 = r18
            java.lang.Object r24 = r24.getObject(r25, r26)
            com.google.android.gms.internal.auth.zzgi r24 = (com.google.android.gms.internal.auth.zzgi) r24
            r22.zza((int) r23, (com.google.android.gms.internal.auth.zzgi) r24)
            goto L_0x015a
        L_0x028b:
            r22 = r9
            r23 = r17
            r22 = r22 & r23
            if (r22 == 0) goto L_0x015a
            r22 = r5
            r23 = r14
            r24 = r11
            r25 = r4
            r26 = r18
            int r24 = r24.getInt(r25, r26)
            r22.zze((int) r23, (int) r24)
            goto L_0x015a
        L_0x02a6:
            r22 = r9
            r23 = r17
            r22 = r22 & r23
            if (r22 == 0) goto L_0x015a
            r22 = r5
            r23 = r14
            r24 = r11
            r25 = r4
            r26 = r18
            int r24 = r24.getInt(r25, r26)
            r22.zzb((int) r23, (int) r24)
            goto L_0x015a
        L_0x02c1:
            r22 = r9
            r23 = r17
            r22 = r22 & r23
            if (r22 == 0) goto L_0x015a
            r22 = r5
            r23 = r14
            r24 = r11
            r25 = r4
            r26 = r18
            int r24 = r24.getInt(r25, r26)
            r22.zza((int) r23, (int) r24)
            goto L_0x015a
        L_0x02dc:
            r22 = r9
            r23 = r17
            r22 = r22 & r23
            if (r22 == 0) goto L_0x015a
            r22 = r5
            r23 = r14
            r24 = r11
            r25 = r4
            r26 = r18
            long r24 = r24.getLong(r25, r26)
            r22.zzb((int) r23, (long) r24)
            goto L_0x015a
        L_0x02f7:
            r22 = r9
            r23 = r17
            r22 = r22 & r23
            if (r22 == 0) goto L_0x015a
            r22 = r5
            r23 = r14
            r24 = r11
            r25 = r4
            r26 = r18
            int r24 = r24.getInt(r25, r26)
            r22.zzf(r23, r24)
            goto L_0x015a
        L_0x0312:
            r22 = r9
            r23 = r17
            r22 = r22 & r23
            if (r22 == 0) goto L_0x015a
            r22 = r5
            r23 = r14
            r24 = r11
            r25 = r4
            r26 = r18
            long r24 = r24.getLong(r25, r26)
            r22.zze((int) r23, (long) r24)
            goto L_0x015a
        L_0x032d:
            r22 = r9
            r23 = r17
            r22 = r22 & r23
            if (r22 == 0) goto L_0x015a
            r22 = r5
            r23 = r14
            r24 = r11
            r25 = r4
            r26 = r18
            java.lang.Object r24 = r24.getObject(r25, r26)
            r25 = r3
            r26 = r12
            com.google.android.gms.internal.auth.zzji r25 = r25.zza((int) r26)
            r22.zzb((int) r23, (java.lang.Object) r24, (com.google.android.gms.internal.auth.zzji) r25)
            goto L_0x015a
        L_0x0350:
            r22 = r3
            r23 = r12
            r21 = r23
            r0 = r22
            int[] r0 = r0.zzc
            r22 = r0
            r23 = r21
            r22 = r22[r23]
            r23 = r11
            r24 = r4
            r25 = r18
            java.lang.Object r23 = r23.getObject(r24, r25)
            java.util.List r23 = (java.util.List) r23
            r24 = r5
            r25 = 0
            com.google.android.gms.internal.auth.zzjk.zza((int) r22, (java.util.List<java.lang.Double>) r23, (com.google.android.gms.internal.auth.zzkx) r24, (boolean) r25)
            goto L_0x015a
        L_0x0375:
            r22 = r3
            r23 = r12
            r21 = r23
            r0 = r22
            int[] r0 = r0.zzc
            r22 = r0
            r23 = r21
            r22 = r22[r23]
            r23 = r11
            r24 = r4
            r25 = r18
            java.lang.Object r23 = r23.getObject(r24, r25)
            java.util.List r23 = (java.util.List) r23
            r24 = r5
            r25 = 0
            com.google.android.gms.internal.auth.zzjk.zzb((int) r22, (java.util.List<java.lang.Float>) r23, (com.google.android.gms.internal.auth.zzkx) r24, (boolean) r25)
            goto L_0x015a
        L_0x039a:
            r22 = r3
            r23 = r12
            r21 = r23
            r0 = r22
            int[] r0 = r0.zzc
            r22 = r0
            r23 = r21
            r22 = r22[r23]
            r23 = r11
            r24 = r4
            r25 = r18
            java.lang.Object r23 = r23.getObject(r24, r25)
            java.util.List r23 = (java.util.List) r23
            r24 = r5
            r25 = 0
            com.google.android.gms.internal.auth.zzjk.zzc(r22, r23, r24, r25)
            goto L_0x015a
        L_0x03bf:
            r22 = r3
            r23 = r12
            r21 = r23
            r0 = r22
            int[] r0 = r0.zzc
            r22 = r0
            r23 = r21
            r22 = r22[r23]
            r23 = r11
            r24 = r4
            r25 = r18
            java.lang.Object r23 = r23.getObject(r24, r25)
            java.util.List r23 = (java.util.List) r23
            r24 = r5
            r25 = 0
            com.google.android.gms.internal.auth.zzjk.zzd(r22, r23, r24, r25)
            goto L_0x015a
        L_0x03e4:
            r22 = r3
            r23 = r12
            r21 = r23
            r0 = r22
            int[] r0 = r0.zzc
            r22 = r0
            r23 = r21
            r22 = r22[r23]
            r23 = r11
            r24 = r4
            r25 = r18
            java.lang.Object r23 = r23.getObject(r24, r25)
            java.util.List r23 = (java.util.List) r23
            r24 = r5
            r25 = 0
            com.google.android.gms.internal.auth.zzjk.zzh(r22, r23, r24, r25)
            goto L_0x015a
        L_0x0409:
            r22 = r3
            r23 = r12
            r21 = r23
            r0 = r22
            int[] r0 = r0.zzc
            r22 = r0
            r23 = r21
            r22 = r22[r23]
            r23 = r11
            r24 = r4
            r25 = r18
            java.lang.Object r23 = r23.getObject(r24, r25)
            java.util.List r23 = (java.util.List) r23
            r24 = r5
            r25 = 0
            com.google.android.gms.internal.auth.zzjk.zzf(r22, r23, r24, r25)
            goto L_0x015a
        L_0x042e:
            r22 = r3
            r23 = r12
            r21 = r23
            r0 = r22
            int[] r0 = r0.zzc
            r22 = r0
            r23 = r21
            r22 = r22[r23]
            r23 = r11
            r24 = r4
            r25 = r18
            java.lang.Object r23 = r23.getObject(r24, r25)
            java.util.List r23 = (java.util.List) r23
            r24 = r5
            r25 = 0
            com.google.android.gms.internal.auth.zzjk.zzk(r22, r23, r24, r25)
            goto L_0x015a
        L_0x0453:
            r22 = r3
            r23 = r12
            r21 = r23
            r0 = r22
            int[] r0 = r0.zzc
            r22 = r0
            r23 = r21
            r22 = r22[r23]
            r23 = r11
            r24 = r4
            r25 = r18
            java.lang.Object r23 = r23.getObject(r24, r25)
            java.util.List r23 = (java.util.List) r23
            r24 = r5
            r25 = 0
            com.google.android.gms.internal.auth.zzjk.zzn(r22, r23, r24, r25)
            goto L_0x015a
        L_0x0478:
            r22 = r3
            r23 = r12
            r21 = r23
            r0 = r22
            int[] r0 = r0.zzc
            r22 = r0
            r23 = r21
            r22 = r22[r23]
            r23 = r11
            r24 = r4
            r25 = r18
            java.lang.Object r23 = r23.getObject(r24, r25)
            java.util.List r23 = (java.util.List) r23
            r24 = r5
            com.google.android.gms.internal.auth.zzjk.zza((int) r22, (java.util.List<java.lang.String>) r23, (com.google.android.gms.internal.auth.zzkx) r24)
            goto L_0x015a
        L_0x049b:
            r22 = r3
            r23 = r12
            r21 = r23
            r0 = r22
            int[] r0 = r0.zzc
            r22 = r0
            r23 = r21
            r22 = r22[r23]
            r23 = r11
            r24 = r4
            r25 = r18
            java.lang.Object r23 = r23.getObject(r24, r25)
            java.util.List r23 = (java.util.List) r23
            r24 = r5
            r25 = r3
            r26 = r12
            com.google.android.gms.internal.auth.zzji r25 = r25.zza((int) r26)
            com.google.android.gms.internal.auth.zzjk.zza((int) r22, (java.util.List<?>) r23, (com.google.android.gms.internal.auth.zzkx) r24, (com.google.android.gms.internal.auth.zzji) r25)
            goto L_0x015a
        L_0x04c6:
            r22 = r3
            r23 = r12
            r21 = r23
            r0 = r22
            int[] r0 = r0.zzc
            r22 = r0
            r23 = r21
            r22 = r22[r23]
            r23 = r11
            r24 = r4
            r25 = r18
            java.lang.Object r23 = r23.getObject(r24, r25)
            java.util.List r23 = (java.util.List) r23
            r24 = r5
            com.google.android.gms.internal.auth.zzjk.zzb((int) r22, (java.util.List<com.google.android.gms.internal.auth.zzgi>) r23, (com.google.android.gms.internal.auth.zzkx) r24)
            goto L_0x015a
        L_0x04e9:
            r22 = r3
            r23 = r12
            r21 = r23
            r0 = r22
            int[] r0 = r0.zzc
            r22 = r0
            r23 = r21
            r22 = r22[r23]
            r23 = r11
            r24 = r4
            r25 = r18
            java.lang.Object r23 = r23.getObject(r24, r25)
            java.util.List r23 = (java.util.List) r23
            r24 = r5
            r25 = 0
            com.google.android.gms.internal.auth.zzjk.zzi(r22, r23, r24, r25)
            goto L_0x015a
        L_0x050e:
            r22 = r3
            r23 = r12
            r21 = r23
            r0 = r22
            int[] r0 = r0.zzc
            r22 = r0
            r23 = r21
            r22 = r22[r23]
            r23 = r11
            r24 = r4
            r25 = r18
            java.lang.Object r23 = r23.getObject(r24, r25)
            java.util.List r23 = (java.util.List) r23
            r24 = r5
            r25 = 0
            com.google.android.gms.internal.auth.zzjk.zzm(r22, r23, r24, r25)
            goto L_0x015a
        L_0x0533:
            r22 = r3
            r23 = r12
            r21 = r23
            r0 = r22
            int[] r0 = r0.zzc
            r22 = r0
            r23 = r21
            r22 = r22[r23]
            r23 = r11
            r24 = r4
            r25 = r18
            java.lang.Object r23 = r23.getObject(r24, r25)
            java.util.List r23 = (java.util.List) r23
            r24 = r5
            r25 = 0
            com.google.android.gms.internal.auth.zzjk.zzl(r22, r23, r24, r25)
            goto L_0x015a
        L_0x0558:
            r22 = r3
            r23 = r12
            r21 = r23
            r0 = r22
            int[] r0 = r0.zzc
            r22 = r0
            r23 = r21
            r22 = r22[r23]
            r23 = r11
            r24 = r4
            r25 = r18
            java.lang.Object r23 = r23.getObject(r24, r25)
            java.util.List r23 = (java.util.List) r23
            r24 = r5
            r25 = 0
            com.google.android.gms.internal.auth.zzjk.zzg(r22, r23, r24, r25)
            goto L_0x015a
        L_0x057d:
            r22 = r3
            r23 = r12
            r21 = r23
            r0 = r22
            int[] r0 = r0.zzc
            r22 = r0
            r23 = r21
            r22 = r22[r23]
            r23 = r11
            r24 = r4
            r25 = r18
            java.lang.Object r23 = r23.getObject(r24, r25)
            java.util.List r23 = (java.util.List) r23
            r24 = r5
            r25 = 0
            com.google.android.gms.internal.auth.zzjk.zzj(r22, r23, r24, r25)
            goto L_0x015a
        L_0x05a2:
            r22 = r3
            r23 = r12
            r21 = r23
            r0 = r22
            int[] r0 = r0.zzc
            r22 = r0
            r23 = r21
            r22 = r22[r23]
            r23 = r11
            r24 = r4
            r25 = r18
            java.lang.Object r23 = r23.getObject(r24, r25)
            java.util.List r23 = (java.util.List) r23
            r24 = r5
            r25 = 0
            com.google.android.gms.internal.auth.zzjk.zze(r22, r23, r24, r25)
            goto L_0x015a
        L_0x05c7:
            r22 = r3
            r23 = r12
            r21 = r23
            r0 = r22
            int[] r0 = r0.zzc
            r22 = r0
            r23 = r21
            r22 = r22[r23]
            r23 = r11
            r24 = r4
            r25 = r18
            java.lang.Object r23 = r23.getObject(r24, r25)
            java.util.List r23 = (java.util.List) r23
            r24 = r5
            r25 = 1
            com.google.android.gms.internal.auth.zzjk.zza((int) r22, (java.util.List<java.lang.Double>) r23, (com.google.android.gms.internal.auth.zzkx) r24, (boolean) r25)
            goto L_0x015a
        L_0x05ec:
            r22 = r3
            r23 = r12
            r21 = r23
            r0 = r22
            int[] r0 = r0.zzc
            r22 = r0
            r23 = r21
            r22 = r22[r23]
            r23 = r11
            r24 = r4
            r25 = r18
            java.lang.Object r23 = r23.getObject(r24, r25)
            java.util.List r23 = (java.util.List) r23
            r24 = r5
            r25 = 1
            com.google.android.gms.internal.auth.zzjk.zzb((int) r22, (java.util.List<java.lang.Float>) r23, (com.google.android.gms.internal.auth.zzkx) r24, (boolean) r25)
            goto L_0x015a
        L_0x0611:
            r22 = r3
            r23 = r12
            r21 = r23
            r0 = r22
            int[] r0 = r0.zzc
            r22 = r0
            r23 = r21
            r22 = r22[r23]
            r23 = r11
            r24 = r4
            r25 = r18
            java.lang.Object r23 = r23.getObject(r24, r25)
            java.util.List r23 = (java.util.List) r23
            r24 = r5
            r25 = 1
            com.google.android.gms.internal.auth.zzjk.zzc(r22, r23, r24, r25)
            goto L_0x015a
        L_0x0636:
            r22 = r3
            r23 = r12
            r21 = r23
            r0 = r22
            int[] r0 = r0.zzc
            r22 = r0
            r23 = r21
            r22 = r22[r23]
            r23 = r11
            r24 = r4
            r25 = r18
            java.lang.Object r23 = r23.getObject(r24, r25)
            java.util.List r23 = (java.util.List) r23
            r24 = r5
            r25 = 1
            com.google.android.gms.internal.auth.zzjk.zzd(r22, r23, r24, r25)
            goto L_0x015a
        L_0x065b:
            r22 = r3
            r23 = r12
            r21 = r23
            r0 = r22
            int[] r0 = r0.zzc
            r22 = r0
            r23 = r21
            r22 = r22[r23]
            r23 = r11
            r24 = r4
            r25 = r18
            java.lang.Object r23 = r23.getObject(r24, r25)
            java.util.List r23 = (java.util.List) r23
            r24 = r5
            r25 = 1
            com.google.android.gms.internal.auth.zzjk.zzh(r22, r23, r24, r25)
            goto L_0x015a
        L_0x0680:
            r22 = r3
            r23 = r12
            r21 = r23
            r0 = r22
            int[] r0 = r0.zzc
            r22 = r0
            r23 = r21
            r22 = r22[r23]
            r23 = r11
            r24 = r4
            r25 = r18
            java.lang.Object r23 = r23.getObject(r24, r25)
            java.util.List r23 = (java.util.List) r23
            r24 = r5
            r25 = 1
            com.google.android.gms.internal.auth.zzjk.zzf(r22, r23, r24, r25)
            goto L_0x015a
        L_0x06a5:
            r22 = r3
            r23 = r12
            r21 = r23
            r0 = r22
            int[] r0 = r0.zzc
            r22 = r0
            r23 = r21
            r22 = r22[r23]
            r23 = r11
            r24 = r4
            r25 = r18
            java.lang.Object r23 = r23.getObject(r24, r25)
            java.util.List r23 = (java.util.List) r23
            r24 = r5
            r25 = 1
            com.google.android.gms.internal.auth.zzjk.zzk(r22, r23, r24, r25)
            goto L_0x015a
        L_0x06ca:
            r22 = r3
            r23 = r12
            r21 = r23
            r0 = r22
            int[] r0 = r0.zzc
            r22 = r0
            r23 = r21
            r22 = r22[r23]
            r23 = r11
            r24 = r4
            r25 = r18
            java.lang.Object r23 = r23.getObject(r24, r25)
            java.util.List r23 = (java.util.List) r23
            r24 = r5
            r25 = 1
            com.google.android.gms.internal.auth.zzjk.zzn(r22, r23, r24, r25)
            goto L_0x015a
        L_0x06ef:
            r22 = r3
            r23 = r12
            r21 = r23
            r0 = r22
            int[] r0 = r0.zzc
            r22 = r0
            r23 = r21
            r22 = r22[r23]
            r23 = r11
            r24 = r4
            r25 = r18
            java.lang.Object r23 = r23.getObject(r24, r25)
            java.util.List r23 = (java.util.List) r23
            r24 = r5
            r25 = 1
            com.google.android.gms.internal.auth.zzjk.zzi(r22, r23, r24, r25)
            goto L_0x015a
        L_0x0714:
            r22 = r3
            r23 = r12
            r21 = r23
            r0 = r22
            int[] r0 = r0.zzc
            r22 = r0
            r23 = r21
            r22 = r22[r23]
            r23 = r11
            r24 = r4
            r25 = r18
            java.lang.Object r23 = r23.getObject(r24, r25)
            java.util.List r23 = (java.util.List) r23
            r24 = r5
            r25 = 1
            com.google.android.gms.internal.auth.zzjk.zzm(r22, r23, r24, r25)
            goto L_0x015a
        L_0x0739:
            r22 = r3
            r23 = r12
            r21 = r23
            r0 = r22
            int[] r0 = r0.zzc
            r22 = r0
            r23 = r21
            r22 = r22[r23]
            r23 = r11
            r24 = r4
            r25 = r18
            java.lang.Object r23 = r23.getObject(r24, r25)
            java.util.List r23 = (java.util.List) r23
            r24 = r5
            r25 = 1
            com.google.android.gms.internal.auth.zzjk.zzl(r22, r23, r24, r25)
            goto L_0x015a
        L_0x075e:
            r22 = r3
            r23 = r12
            r21 = r23
            r0 = r22
            int[] r0 = r0.zzc
            r22 = r0
            r23 = r21
            r22 = r22[r23]
            r23 = r11
            r24 = r4
            r25 = r18
            java.lang.Object r23 = r23.getObject(r24, r25)
            java.util.List r23 = (java.util.List) r23
            r24 = r5
            r25 = 1
            com.google.android.gms.internal.auth.zzjk.zzg(r22, r23, r24, r25)
            goto L_0x015a
        L_0x0783:
            r22 = r3
            r23 = r12
            r21 = r23
            r0 = r22
            int[] r0 = r0.zzc
            r22 = r0
            r23 = r21
            r22 = r22[r23]
            r23 = r11
            r24 = r4
            r25 = r18
            java.lang.Object r23 = r23.getObject(r24, r25)
            java.util.List r23 = (java.util.List) r23
            r24 = r5
            r25 = 1
            com.google.android.gms.internal.auth.zzjk.zzj(r22, r23, r24, r25)
            goto L_0x015a
        L_0x07a8:
            r22 = r3
            r23 = r12
            r21 = r23
            r0 = r22
            int[] r0 = r0.zzc
            r22 = r0
            r23 = r21
            r22 = r22[r23]
            r23 = r11
            r24 = r4
            r25 = r18
            java.lang.Object r23 = r23.getObject(r24, r25)
            java.util.List r23 = (java.util.List) r23
            r24 = r5
            r25 = 1
            com.google.android.gms.internal.auth.zzjk.zze(r22, r23, r24, r25)
            goto L_0x015a
        L_0x07cd:
            r22 = r3
            r23 = r12
            r21 = r23
            r0 = r22
            int[] r0 = r0.zzc
            r22 = r0
            r23 = r21
            r22 = r22[r23]
            r23 = r11
            r24 = r4
            r25 = r18
            java.lang.Object r23 = r23.getObject(r24, r25)
            java.util.List r23 = (java.util.List) r23
            r24 = r5
            r25 = r3
            r26 = r12
            com.google.android.gms.internal.auth.zzji r25 = r25.zza((int) r26)
            com.google.android.gms.internal.auth.zzjk.zzb((int) r22, (java.util.List<?>) r23, (com.google.android.gms.internal.auth.zzkx) r24, (com.google.android.gms.internal.auth.zzji) r25)
            goto L_0x015a
        L_0x07f8:
            r22 = r3
            r23 = r5
            r24 = r14
            r25 = r11
            r26 = r4
            r27 = r18
            java.lang.Object r25 = r25.getObject(r26, r27)
            r26 = r12
            r22.zza(r23, r24, r25, r26)
            goto L_0x015a
        L_0x080f:
            r22 = r3
            r23 = r4
            r24 = r14
            r25 = r12
            boolean r22 = r22.zza(r23, (int) r24, (int) r25)
            if (r22 == 0) goto L_0x015a
            r22 = r5
            r23 = r14
            r24 = r4
            r25 = r18
            double r24 = zzb(r24, (long) r25)
            r22.zza((int) r23, (double) r24)
            goto L_0x015a
        L_0x082e:
            r22 = r3
            r23 = r4
            r24 = r14
            r25 = r12
            boolean r22 = r22.zza(r23, (int) r24, (int) r25)
            if (r22 == 0) goto L_0x015a
            r22 = r5
            r23 = r14
            r24 = r4
            r25 = r18
            float r24 = zzc(r24, r25)
            r22.zza((int) r23, (float) r24)
            goto L_0x015a
        L_0x084d:
            r22 = r3
            r23 = r4
            r24 = r14
            r25 = r12
            boolean r22 = r22.zza(r23, (int) r24, (int) r25)
            if (r22 == 0) goto L_0x015a
            r22 = r5
            r23 = r14
            r24 = r4
            r25 = r18
            long r24 = zze(r24, r25)
            r22.zza((int) r23, (long) r24)
            goto L_0x015a
        L_0x086c:
            r22 = r3
            r23 = r4
            r24 = r14
            r25 = r12
            boolean r22 = r22.zza(r23, (int) r24, (int) r25)
            if (r22 == 0) goto L_0x015a
            r22 = r5
            r23 = r14
            r24 = r4
            r25 = r18
            long r24 = zze(r24, r25)
            r22.zzc((int) r23, (long) r24)
            goto L_0x015a
        L_0x088b:
            r22 = r3
            r23 = r4
            r24 = r14
            r25 = r12
            boolean r22 = r22.zza(r23, (int) r24, (int) r25)
            if (r22 == 0) goto L_0x015a
            r22 = r5
            r23 = r14
            r24 = r4
            r25 = r18
            int r24 = zzd(r24, r25)
            r22.zzc((int) r23, (int) r24)
            goto L_0x015a
        L_0x08aa:
            r22 = r3
            r23 = r4
            r24 = r14
            r25 = r12
            boolean r22 = r22.zza(r23, (int) r24, (int) r25)
            if (r22 == 0) goto L_0x015a
            r22 = r5
            r23 = r14
            r24 = r4
            r25 = r18
            long r24 = zze(r24, r25)
            r22.zzd((int) r23, (long) r24)
            goto L_0x015a
        L_0x08c9:
            r22 = r3
            r23 = r4
            r24 = r14
            r25 = r12
            boolean r22 = r22.zza(r23, (int) r24, (int) r25)
            if (r22 == 0) goto L_0x015a
            r22 = r5
            r23 = r14
            r24 = r4
            r25 = r18
            int r24 = zzd(r24, r25)
            r22.zzd((int) r23, (int) r24)
            goto L_0x015a
        L_0x08e8:
            r22 = r3
            r23 = r4
            r24 = r14
            r25 = r12
            boolean r22 = r22.zza(r23, (int) r24, (int) r25)
            if (r22 == 0) goto L_0x015a
            r22 = r5
            r23 = r14
            r24 = r4
            r25 = r18
            boolean r24 = zzf(r24, r25)
            r22.zza((int) r23, (boolean) r24)
            goto L_0x015a
        L_0x0907:
            r22 = r3
            r23 = r4
            r24 = r14
            r25 = r12
            boolean r22 = r22.zza(r23, (int) r24, (int) r25)
            if (r22 == 0) goto L_0x015a
            r22 = r14
            r23 = r11
            r24 = r4
            r25 = r18
            java.lang.Object r23 = r23.getObject(r24, r25)
            r24 = r5
            zza((int) r22, (java.lang.Object) r23, (com.google.android.gms.internal.auth.zzkx) r24)
            goto L_0x015a
        L_0x0928:
            r22 = r3
            r23 = r4
            r24 = r14
            r25 = r12
            boolean r22 = r22.zza(r23, (int) r24, (int) r25)
            if (r22 == 0) goto L_0x015a
            r22 = r11
            r23 = r4
            r24 = r18
            java.lang.Object r22 = r22.getObject(r23, r24)
            r20 = r22
            r22 = r5
            r23 = r14
            r24 = r20
            r25 = r3
            r26 = r12
            com.google.android.gms.internal.auth.zzji r25 = r25.zza((int) r26)
            r22.zza((int) r23, (java.lang.Object) r24, (com.google.android.gms.internal.auth.zzji) r25)
            goto L_0x015a
        L_0x0955:
            r22 = r3
            r23 = r4
            r24 = r14
            r25 = r12
            boolean r22 = r22.zza(r23, (int) r24, (int) r25)
            if (r22 == 0) goto L_0x015a
            r22 = r5
            r23 = r14
            r24 = r11
            r25 = r4
            r26 = r18
            java.lang.Object r24 = r24.getObject(r25, r26)
            com.google.android.gms.internal.auth.zzgi r24 = (com.google.android.gms.internal.auth.zzgi) r24
            r22.zza((int) r23, (com.google.android.gms.internal.auth.zzgi) r24)
            goto L_0x015a
        L_0x0978:
            r22 = r3
            r23 = r4
            r24 = r14
            r25 = r12
            boolean r22 = r22.zza(r23, (int) r24, (int) r25)
            if (r22 == 0) goto L_0x015a
            r22 = r5
            r23 = r14
            r24 = r4
            r25 = r18
            int r24 = zzd(r24, r25)
            r22.zze((int) r23, (int) r24)
            goto L_0x015a
        L_0x0997:
            r22 = r3
            r23 = r4
            r24 = r14
            r25 = r12
            boolean r22 = r22.zza(r23, (int) r24, (int) r25)
            if (r22 == 0) goto L_0x015a
            r22 = r5
            r23 = r14
            r24 = r4
            r25 = r18
            int r24 = zzd(r24, r25)
            r22.zzb((int) r23, (int) r24)
            goto L_0x015a
        L_0x09b6:
            r22 = r3
            r23 = r4
            r24 = r14
            r25 = r12
            boolean r22 = r22.zza(r23, (int) r24, (int) r25)
            if (r22 == 0) goto L_0x015a
            r22 = r5
            r23 = r14
            r24 = r4
            r25 = r18
            int r24 = zzd(r24, r25)
            r22.zza((int) r23, (int) r24)
            goto L_0x015a
        L_0x09d5:
            r22 = r3
            r23 = r4
            r24 = r14
            r25 = r12
            boolean r22 = r22.zza(r23, (int) r24, (int) r25)
            if (r22 == 0) goto L_0x015a
            r22 = r5
            r23 = r14
            r24 = r4
            r25 = r18
            long r24 = zze(r24, r25)
            r22.zzb((int) r23, (long) r24)
            goto L_0x015a
        L_0x09f4:
            r22 = r3
            r23 = r4
            r24 = r14
            r25 = r12
            boolean r22 = r22.zza(r23, (int) r24, (int) r25)
            if (r22 == 0) goto L_0x015a
            r22 = r5
            r23 = r14
            r24 = r4
            r25 = r18
            int r24 = zzd(r24, r25)
            r22.zzf(r23, r24)
            goto L_0x015a
        L_0x0a13:
            r22 = r3
            r23 = r4
            r24 = r14
            r25 = r12
            boolean r22 = r22.zza(r23, (int) r24, (int) r25)
            if (r22 == 0) goto L_0x015a
            r22 = r5
            r23 = r14
            r24 = r4
            r25 = r18
            long r24 = zze(r24, r25)
            r22.zze((int) r23, (long) r24)
            goto L_0x015a
        L_0x0a32:
            r22 = r3
            r23 = r4
            r24 = r14
            r25 = r12
            boolean r22 = r22.zza(r23, (int) r24, (int) r25)
            if (r22 == 0) goto L_0x015a
            r22 = r5
            r23 = r14
            r24 = r11
            r25 = r4
            r26 = r18
            java.lang.Object r24 = r24.getObject(r25, r26)
            r25 = r3
            r26 = r12
            com.google.android.gms.internal.auth.zzji r25 = r25.zza((int) r26)
            r22.zzb((int) r23, (java.lang.Object) r24, (com.google.android.gms.internal.auth.zzji) r25)
            goto L_0x015a
        L_0x0a5b:
            r22 = r7
            if (r22 == 0) goto L_0x0a84
            r22 = r3
            r0 = r22
            com.google.android.gms.internal.auth.zzhd<?> r0 = r0.zzr
            r22 = r0
            r23 = r5
            r24 = r7
            r22.zza(r23, r24)
            r22 = r6
            boolean r22 = r22.hasNext()
            if (r22 == 0) goto L_0x0a81
            r22 = r6
            java.lang.Object r22 = r22.next()
            java.util.Map$Entry r22 = (java.util.Map.Entry) r22
        L_0x0a7e:
            r7 = r22
            goto L_0x0a5b
        L_0x0a81:
            r22 = 0
            goto L_0x0a7e
        L_0x0a84:
            r22 = r3
            r0 = r22
            com.google.android.gms.internal.auth.zzka<?, ?> r0 = r0.zzq
            r22 = r0
            r23 = r4
            r24 = r5
            zza(r22, r23, (com.google.android.gms.internal.auth.zzkx) r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zziw.zzb(java.lang.Object, com.google.android.gms.internal.auth.zzkx):void");
    }

    private final <K, V> void zza(zzkx zzkx, int i, Object obj, int i2) throws IOException {
        zzkx zzkx2 = zzkx;
        int i3 = i;
        Object obj2 = obj;
        int i4 = i2;
        if (obj2 != null) {
            zzkx2.zza(i3, this.zzs.zzb(zzb(i4)), this.zzs.zzc(obj2));
        }
    }

    private static <UT, UB> void zza(zzka<UT, UB> zzka, T t, zzkx zzkx) throws IOException {
        zzka<UT, UB> zzka2 = zzka;
        zzka2.zza(zzka2.zza(t), zzkx);
    }

    private static zzkd zze(Object obj) {
        Object obj2 = obj;
        zzkd zzkd = ((zzhm) obj2).zzb;
        zzkd zzkd2 = zzkd;
        if (zzkd == zzkd.zza()) {
            zzkd2 = zzkd.zzb();
            ((zzhm) obj2).zzb = zzkd2;
        }
        return zzkd2;
    }

    private static int zza(byte[] bArr, int i, int i2, zzkr zzkr, Class<?> cls, zzgd zzgd) throws IOException {
        int zzd2;
        Throwable th;
        byte[] bArr2 = bArr;
        int i3 = i;
        int i4 = i2;
        Class<?> cls2 = cls;
        zzgd zzgd2 = zzgd;
        switch (zziz.zza[zzkr.ordinal()]) {
            case 1:
                zzd2 = zzge.zzb(bArr2, i3, zzgd2);
                zzgd2.zzc = Boolean.valueOf(zzgd2.zzb != 0);
                break;
            case 2:
                zzd2 = zzge.zze(bArr2, i3, zzgd2);
                break;
            case 3:
                zzgd2.zzc = Double.valueOf(zzge.zzc(bArr2, i3));
                zzd2 = i3 + 8;
                break;
            case 4:
            case 5:
                zzgd2.zzc = Integer.valueOf(zzge.zza(bArr2, i3));
                zzd2 = i3 + 4;
                break;
            case 6:
            case 7:
                zzgd2.zzc = Long.valueOf(zzge.zzb(bArr2, i3));
                zzd2 = i3 + 8;
                break;
            case 8:
                zzgd2.zzc = Float.valueOf(zzge.zzd(bArr2, i3));
                zzd2 = i3 + 4;
                break;
            case ConnectionResult.SERVICE_INVALID:
            case 10:
            case ConnectionResult.LICENSE_CHECK_FAILED:
                zzd2 = zzge.zza(bArr2, i3, zzgd2);
                zzgd2.zzc = Integer.valueOf(zzgd2.zza);
                break;
            case 12:
            case 13:
                zzd2 = zzge.zzb(bArr2, i3, zzgd2);
                zzgd2.zzc = Long.valueOf(zzgd2.zzb);
                break;
            case 14:
                zzd2 = zzge.zza((zzji) zzjh.zza().zza(cls2), bArr2, i3, i4, zzgd2);
                break;
            case 15:
                zzd2 = zzge.zza(bArr2, i3, zzgd2);
                zzgd2.zzc = Integer.valueOf(zzgu.zzb(zzgd2.zza));
                break;
            case 16:
                zzd2 = zzge.zzb(bArr2, i3, zzgd2);
                zzgd2.zzc = Long.valueOf(zzgu.zza(zzgd2.zzb));
                break;
            case 17:
                zzd2 = zzge.zzd(bArr2, i3, zzgd2);
                break;
            default:
                Throwable th2 = th;
                new RuntimeException("unsupported field type.");
                throw th2;
        }
        return zzd2;
    }

    private final int zza(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, zzgd zzgd) throws IOException {
        int i8;
        int i9;
        Object obj;
        Object obj2;
        int i10;
        Object obj3;
        Object obj4;
        T t2 = t;
        byte[] bArr2 = bArr;
        int i11 = i;
        int i12 = i2;
        int i13 = i3;
        int i14 = i4;
        int i15 = i5;
        int i16 = i6;
        long j3 = j;
        int i17 = i7;
        long j4 = j2;
        zzgd zzgd2 = zzgd;
        zzht zzht = (zzht) zzb.getObject(t2, j4);
        zzht zzht2 = zzht;
        if (!zzht.zza()) {
            int size = zzht2.size();
            zzht2 = zzht2.zza(size == 0 ? 10 : size << 1);
            zzb.putObject(t2, j4, zzht2);
        }
        switch (i17) {
            case ConnectionResult.SERVICE_UPDATING:
            case 35:
                if (i15 == 2) {
                    zzgd zzgd3 = zzgd2;
                    byte[] bArr3 = bArr2;
                    zzha zzha = (zzha) zzht2;
                    int zza2 = zzge.zza(bArr3, i11, zzgd3);
                    int i18 = zza2;
                    int i19 = zza2 + zzgd3.zza;
                    while (i18 < i19) {
                        zzha.zza(zzge.zzc(bArr3, i18));
                        i18 += 8;
                    }
                    if (i18 == i19) {
                        i11 = i18;
                        break;
                    } else {
                        throw zzhs.zza();
                    }
                } else if (i15 == 1) {
                    zzgd zzgd4 = zzgd2;
                    int i20 = i12;
                    int i21 = i11;
                    byte[] bArr4 = bArr2;
                    int i22 = i13;
                    zzha zzha2 = (zzha) zzht2;
                    zzha zzha3 = zzha2;
                    zzha2.zza(zzge.zzc(bArr4, i21));
                    int i23 = i21 + 8;
                    while (i23 < i20) {
                        int zza3 = zzge.zza(bArr4, i23, zzgd4);
                        if (i22 != zzgd4.zza) {
                            i11 = i23;
                            break;
                        } else {
                            zzha3.zza(zzge.zzc(bArr4, zza3));
                            i23 = zza3 + 8;
                        }
                    }
                    i11 = i23;
                }
                break;
            case 19:
            case 36:
                if (i15 == 2) {
                    zzgd zzgd5 = zzgd2;
                    byte[] bArr5 = bArr2;
                    zzhk zzhk = (zzhk) zzht2;
                    int zza4 = zzge.zza(bArr5, i11, zzgd5);
                    int i24 = zza4;
                    int i25 = zza4 + zzgd5.zza;
                    while (i24 < i25) {
                        zzhk.zza(zzge.zzd(bArr5, i24));
                        i24 += 4;
                    }
                    if (i24 == i25) {
                        i11 = i24;
                        break;
                    } else {
                        throw zzhs.zza();
                    }
                } else if (i15 == 5) {
                    zzgd zzgd6 = zzgd2;
                    int i26 = i12;
                    int i27 = i11;
                    byte[] bArr6 = bArr2;
                    int i28 = i13;
                    zzhk zzhk2 = (zzhk) zzht2;
                    zzhk zzhk3 = zzhk2;
                    zzhk2.zza(zzge.zzd(bArr6, i27));
                    int i29 = i27 + 4;
                    while (i29 < i26) {
                        int zza5 = zzge.zza(bArr6, i29, zzgd6);
                        if (i28 != zzgd6.zza) {
                            i11 = i29;
                            break;
                        } else {
                            zzhk3.zza(zzge.zzd(bArr6, zza5));
                            i29 = zza5 + 4;
                        }
                    }
                    i11 = i29;
                }
                break;
            case 20:
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE:
            case 37:
            case 38:
                if (i15 == 2) {
                    zzgd zzgd7 = zzgd2;
                    byte[] bArr7 = bArr2;
                    zzig zzig = (zzig) zzht2;
                    int zza6 = zzge.zza(bArr7, i11, zzgd7);
                    int i30 = zza6;
                    int i31 = zza6 + zzgd7.zza;
                    while (i30 < i31) {
                        i30 = zzge.zzb(bArr7, i30, zzgd7);
                        zzig.zza(zzgd7.zzb);
                    }
                    if (i30 == i31) {
                        i11 = i30;
                        break;
                    } else {
                        throw zzhs.zza();
                    }
                } else if (i15 == 0) {
                    zzgd zzgd8 = zzgd2;
                    int i32 = i12;
                    byte[] bArr8 = bArr2;
                    int i33 = i13;
                    zzig zzig2 = (zzig) zzht2;
                    int zzb2 = zzge.zzb(bArr8, i11, zzgd8);
                    zzig2.zza(zzgd8.zzb);
                    while (zzb2 < i32) {
                        int zza7 = zzge.zza(bArr8, zzb2, zzgd8);
                        if (i33 != zzgd8.zza) {
                            i11 = zzb2;
                            break;
                        } else {
                            zzb2 = zzge.zzb(bArr8, zza7, zzgd8);
                            zzig2.zza(zzgd8.zzb);
                        }
                    }
                    i11 = zzb2;
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i15 != 2) {
                    if (i15 == 0) {
                        i11 = zzge.zza(i13, bArr2, i11, i12, (zzht<?>) zzht2, zzgd2);
                        break;
                    }
                } else {
                    i11 = zzge.zza(bArr2, i11, (zzht<?>) zzht2, zzgd2);
                    break;
                }
                break;
            case ConnectionResult.API_DISABLED:
            case 32:
            case 40:
            case 46:
                if (i15 == 2) {
                    zzgd zzgd9 = zzgd2;
                    byte[] bArr9 = bArr2;
                    zzig zzig3 = (zzig) zzht2;
                    int zza8 = zzge.zza(bArr9, i11, zzgd9);
                    int i34 = zza8;
                    int i35 = zza8 + zzgd9.zza;
                    while (i34 < i35) {
                        zzig3.zza(zzge.zzb(bArr9, i34));
                        i34 += 8;
                    }
                    if (i34 == i35) {
                        i11 = i34;
                        break;
                    } else {
                        throw zzhs.zza();
                    }
                } else if (i15 == 1) {
                    zzgd zzgd10 = zzgd2;
                    int i36 = i12;
                    int i37 = i11;
                    byte[] bArr10 = bArr2;
                    int i38 = i13;
                    zzig zzig4 = (zzig) zzht2;
                    zzig zzig5 = zzig4;
                    zzig4.zza(zzge.zzb(bArr10, i37));
                    int i39 = i37 + 8;
                    while (i39 < i36) {
                        int zza9 = zzge.zza(bArr10, i39, zzgd10);
                        if (i38 != zzgd10.zza) {
                            i11 = i39;
                            break;
                        } else {
                            zzig5.zza(zzge.zzb(bArr10, zza9));
                            i39 = zza9 + 8;
                        }
                    }
                    i11 = i39;
                }
                break;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION:
            case 31:
            case 41:
            case 45:
                if (i15 == 2) {
                    zzgd zzgd11 = zzgd2;
                    byte[] bArr11 = bArr2;
                    zzhp zzhp = (zzhp) zzht2;
                    int zza10 = zzge.zza(bArr11, i11, zzgd11);
                    int i40 = zza10;
                    int i41 = zza10 + zzgd11.zza;
                    while (i40 < i41) {
                        zzhp.zzc(zzge.zza(bArr11, i40));
                        i40 += 4;
                    }
                    if (i40 == i41) {
                        i11 = i40;
                        break;
                    } else {
                        throw zzhs.zza();
                    }
                } else if (i15 == 5) {
                    zzgd zzgd12 = zzgd2;
                    int i42 = i12;
                    int i43 = i11;
                    byte[] bArr12 = bArr2;
                    int i44 = i13;
                    zzhp zzhp2 = (zzhp) zzht2;
                    zzhp zzhp3 = zzhp2;
                    zzhp2.zzc(zzge.zza(bArr12, i43));
                    int i45 = i43 + 4;
                    while (i45 < i42) {
                        int zza11 = zzge.zza(bArr12, i45, zzgd12);
                        if (i44 != zzgd12.zza) {
                            i11 = i45;
                            break;
                        } else {
                            zzhp3.zzc(zzge.zza(bArr12, zza11));
                            i45 = zza11 + 4;
                        }
                    }
                    i11 = i45;
                }
                break;
            case 25:
            case 42:
                if (i15 == 2) {
                    zzgd zzgd13 = zzgd2;
                    byte[] bArr13 = bArr2;
                    zzgg zzgg = (zzgg) zzht2;
                    int zza12 = zzge.zza(bArr13, i11, zzgd13);
                    int i46 = zza12;
                    int i47 = zza12 + zzgd13.zza;
                    while (i46 < i47) {
                        i46 = zzge.zzb(bArr13, i46, zzgd13);
                        zzgg.zza(zzgd13.zzb != 0);
                    }
                    if (i46 == i47) {
                        i11 = i46;
                        break;
                    } else {
                        throw zzhs.zza();
                    }
                } else if (i15 == 0) {
                    zzgd zzgd14 = zzgd2;
                    int i48 = i12;
                    byte[] bArr14 = bArr2;
                    int i49 = i13;
                    zzgg zzgg2 = (zzgg) zzht2;
                    int zzb3 = zzge.zzb(bArr14, i11, zzgd14);
                    zzgg2.zza(zzgd14.zzb != 0);
                    while (zzb3 < i48) {
                        int zza13 = zzge.zza(bArr14, zzb3, zzgd14);
                        if (i49 != zzgd14.zza) {
                            i11 = zzb3;
                            break;
                        } else {
                            zzb3 = zzge.zzb(bArr14, zza13, zzgd14);
                            zzgg2.zza(zzgd14.zzb != 0);
                        }
                    }
                    i11 = zzb3;
                }
                break;
            case 26:
                if (i15 == 2) {
                    if ((j3 & 536870912) == 0) {
                        zzgd zzgd15 = zzgd2;
                        int i50 = i12;
                        byte[] bArr15 = bArr2;
                        int i51 = i13;
                        zzht zzht3 = zzht2;
                        int zza14 = zzge.zza(bArr15, i11, zzgd15);
                        int i52 = zzgd15.zza;
                        int i53 = i52;
                        if (i52 < 0) {
                            throw zzhs.zzb();
                        }
                        if (i53 == 0) {
                            boolean add = zzht3.add("");
                        } else {
                            new String(bArr15, zza14, i53, zzho.zza);
                            boolean add2 = zzht3.add(obj4);
                            zza14 += i53;
                        }
                        while (i10 < i50) {
                            int zza15 = zzge.zza(bArr15, i10, zzgd15);
                            if (i51 != zzgd15.zza) {
                                i11 = i10;
                                break;
                            } else {
                                i10 = zzge.zza(bArr15, zza15, zzgd15);
                                int i54 = zzgd15.zza;
                                int i55 = i54;
                                if (i54 < 0) {
                                    throw zzhs.zzb();
                                } else if (i55 == 0) {
                                    boolean add3 = zzht3.add("");
                                } else {
                                    new String(bArr15, i10, i55, zzho.zza);
                                    boolean add4 = zzht3.add(obj3);
                                    i10 += i55;
                                }
                            }
                        }
                        i11 = i10;
                    } else {
                        zzgd zzgd16 = zzgd2;
                        int i56 = i12;
                        byte[] bArr16 = bArr2;
                        int i57 = i13;
                        zzht zzht4 = zzht2;
                        int zza16 = zzge.zza(bArr16, i11, zzgd16);
                        int i58 = zzgd16.zza;
                        int i59 = i58;
                        if (i58 < 0) {
                            throw zzhs.zzb();
                        }
                        if (i59 == 0) {
                            boolean add5 = zzht4.add("");
                        } else if (!zzkj.zza(bArr16, zza16, zza16 + i59)) {
                            throw zzhs.zzf();
                        } else {
                            new String(bArr16, zza16, i59, zzho.zza);
                            boolean add6 = zzht4.add(obj2);
                            zza16 += i59;
                        }
                        while (i9 < i56) {
                            int zza17 = zzge.zza(bArr16, i9, zzgd16);
                            if (i57 != zzgd16.zza) {
                                i11 = i9;
                                break;
                            } else {
                                i9 = zzge.zza(bArr16, zza17, zzgd16);
                                int i60 = zzgd16.zza;
                                int i61 = i60;
                                if (i60 < 0) {
                                    throw zzhs.zzb();
                                } else if (i61 == 0) {
                                    boolean add7 = zzht4.add("");
                                } else if (!zzkj.zza(bArr16, i9, i9 + i61)) {
                                    throw zzhs.zzf();
                                } else {
                                    new String(bArr16, i9, i61, zzho.zza);
                                    boolean add8 = zzht4.add(obj);
                                    i9 += i61;
                                }
                            }
                        }
                        i11 = i9;
                    }
                }
                break;
            case 27:
                if (i15 == 2) {
                    i11 = zzge.zza(zza(i16), i13, bArr2, i11, i12, zzht2, zzgd2);
                    break;
                }
                break;
            case 28:
                if (i15 == 2) {
                    zzgd zzgd17 = zzgd2;
                    int i62 = i12;
                    byte[] bArr17 = bArr2;
                    int i63 = i13;
                    zzht zzht5 = zzht2;
                    int zza18 = zzge.zza(bArr17, i11, zzgd17);
                    int i64 = zzgd17.zza;
                    int i65 = i64;
                    if (i64 < 0) {
                        throw zzhs.zzb();
                    } else if (i65 > bArr17.length - zza18) {
                        throw zzhs.zza();
                    } else {
                        if (i65 == 0) {
                            boolean add9 = zzht5.add(zzgi.zza);
                        } else {
                            boolean add10 = zzht5.add(zzgi.zza(bArr17, zza18, i65));
                            zza18 += i65;
                        }
                        while (i8 < i62) {
                            int zza19 = zzge.zza(bArr17, i8, zzgd17);
                            if (i63 != zzgd17.zza) {
                                i11 = i8;
                                break;
                            } else {
                                i8 = zzge.zza(bArr17, zza19, zzgd17);
                                int i66 = zzgd17.zza;
                                int i67 = i66;
                                if (i66 < 0) {
                                    throw zzhs.zzb();
                                } else if (i67 > bArr17.length - i8) {
                                    throw zzhs.zza();
                                } else if (i67 == 0) {
                                    boolean add11 = zzht5.add(zzgi.zza);
                                } else {
                                    boolean add12 = zzht5.add(zzgi.zza(bArr17, i8, i67));
                                    i8 += i67;
                                }
                            }
                        }
                        i11 = i8;
                    }
                }
                break;
            case 30:
            case 44:
                if (i15 == 2) {
                    i11 = zzge.zza(bArr2, i11, (zzht<?>) zzht2, zzgd2);
                } else if (i15 == 0) {
                    i11 = zzge.zza(i13, bArr2, i11, i12, (zzht<?>) zzht2, zzgd2);
                }
                zzkd zzkd = ((zzhm) t2).zzb;
                zzkd zzkd2 = zzkd;
                if (zzkd == zzkd.zza()) {
                    zzkd2 = null;
                }
                zzkd zzkd3 = (zzkd) zzjk.zza(i14, zzht2, zzc(i16), zzkd2, this.zzq);
                zzkd zzkd4 = zzkd3;
                if (zzkd3 != null) {
                    ((zzhm) t2).zzb = zzkd4;
                    break;
                }
                break;
            case 33:
            case 47:
                if (i15 == 2) {
                    zzgd zzgd18 = zzgd2;
                    byte[] bArr18 = bArr2;
                    zzhp zzhp4 = (zzhp) zzht2;
                    int zza20 = zzge.zza(bArr18, i11, zzgd18);
                    int i68 = zza20;
                    int i69 = zza20 + zzgd18.zza;
                    while (i68 < i69) {
                        i68 = zzge.zza(bArr18, i68, zzgd18);
                        zzhp4.zzc(zzgu.zzb(zzgd18.zza));
                    }
                    if (i68 == i69) {
                        i11 = i68;
                        break;
                    } else {
                        throw zzhs.zza();
                    }
                } else if (i15 == 0) {
                    zzgd zzgd19 = zzgd2;
                    int i70 = i12;
                    byte[] bArr19 = bArr2;
                    int i71 = i13;
                    zzhp zzhp5 = (zzhp) zzht2;
                    int zza21 = zzge.zza(bArr19, i11, zzgd19);
                    zzhp5.zzc(zzgu.zzb(zzgd19.zza));
                    while (zza21 < i70) {
                        int zza22 = zzge.zza(bArr19, zza21, zzgd19);
                        if (i71 != zzgd19.zza) {
                            i11 = zza21;
                            break;
                        } else {
                            zza21 = zzge.zza(bArr19, zza22, zzgd19);
                            zzhp5.zzc(zzgu.zzb(zzgd19.zza));
                        }
                    }
                    i11 = zza21;
                }
                break;
            case 34:
            case 48:
                if (i15 == 2) {
                    zzgd zzgd20 = zzgd2;
                    byte[] bArr20 = bArr2;
                    zzig zzig6 = (zzig) zzht2;
                    int zza23 = zzge.zza(bArr20, i11, zzgd20);
                    int i72 = zza23;
                    int i73 = zza23 + zzgd20.zza;
                    while (i72 < i73) {
                        i72 = zzge.zzb(bArr20, i72, zzgd20);
                        zzig6.zza(zzgu.zza(zzgd20.zzb));
                    }
                    if (i72 == i73) {
                        i11 = i72;
                        break;
                    } else {
                        throw zzhs.zza();
                    }
                } else if (i15 == 0) {
                    zzgd zzgd21 = zzgd2;
                    int i74 = i12;
                    byte[] bArr21 = bArr2;
                    int i75 = i13;
                    zzig zzig7 = (zzig) zzht2;
                    int zzb4 = zzge.zzb(bArr21, i11, zzgd21);
                    zzig7.zza(zzgu.zza(zzgd21.zzb));
                    while (zzb4 < i74) {
                        int zza24 = zzge.zza(bArr21, zzb4, zzgd21);
                        if (i75 != zzgd21.zza) {
                            i11 = zzb4;
                            break;
                        } else {
                            zzb4 = zzge.zzb(bArr21, zza24, zzgd21);
                            zzig7.zza(zzgu.zza(zzgd21.zzb));
                        }
                    }
                    i11 = zzb4;
                }
                break;
            case 49:
                if (i15 == 3) {
                    zzgd zzgd22 = zzgd2;
                    int i76 = i12;
                    byte[] bArr22 = bArr2;
                    int i77 = i13;
                    zzji zza25 = zza(i16);
                    zzht zzht6 = zzht2;
                    int i78 = (i77 & -8) | 4;
                    int zza26 = zzge.zza(zza25, bArr22, i11, i76, i78, zzgd22);
                    boolean add13 = zzht6.add(zzgd22.zzc);
                    while (zza26 < i76) {
                        int zza27 = zzge.zza(bArr22, zza26, zzgd22);
                        if (i77 != zzgd22.zza) {
                            i11 = zza26;
                            break;
                        } else {
                            zza26 = zzge.zza(zza25, bArr22, zza27, i76, i78, zzgd22);
                            boolean add14 = zzht6.add(zzgd22.zzc);
                        }
                    }
                    i11 = zza26;
                }
                break;
        }
        return i11;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v51, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: byte} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <K, V> int zza(T r37, byte[] r38, int r39, int r40, int r41, long r42, com.google.android.gms.internal.auth.zzgd r44) throws java.io.IOException {
        /*
            r36 = this;
            r2 = r36
            r3 = r37
            r4 = r38
            r5 = r39
            r6 = r40
            r7 = r41
            r8 = r42
            r10 = r44
            sun.misc.Unsafe r28 = zzb
            r11 = r28
            r28 = r2
            r29 = r7
            java.lang.Object r28 = r28.zzb((int) r29)
            r12 = r28
            r28 = r11
            r29 = r3
            r30 = r8
            java.lang.Object r28 = r28.getObject(r29, r30)
            r13 = r28
            r28 = r2
            r0 = r28
            com.google.android.gms.internal.auth.zzip r0 = r0.zzs
            r28 = r0
            r29 = r13
            boolean r28 = r28.zzd(r29)
            if (r28 == 0) goto L_0x0069
            r28 = r13
            r14 = r28
            r28 = r2
            r0 = r28
            com.google.android.gms.internal.auth.zzip r0 = r0.zzs
            r28 = r0
            r29 = r12
            java.lang.Object r28 = r28.zzf(r29)
            r13 = r28
            r28 = r2
            r0 = r28
            com.google.android.gms.internal.auth.zzip r0 = r0.zzs
            r28 = r0
            r29 = r13
            r30 = r14
            java.lang.Object r28 = r28.zza(r29, r30)
            r28 = r11
            r29 = r3
            r30 = r8
            r32 = r13
            r28.putObject(r29, r30, r32)
        L_0x0069:
            r28 = r4
            r29 = r5
            r30 = r6
            r31 = r2
            r0 = r31
            com.google.android.gms.internal.auth.zzip r0 = r0.zzs
            r31 = r0
            r32 = r12
            com.google.android.gms.internal.auth.zzin r31 = r31.zzb(r32)
            r32 = r2
            r0 = r32
            com.google.android.gms.internal.auth.zzip r0 = r0.zzs
            r32 = r0
            r33 = r13
            java.util.Map r32 = r32.zza(r33)
            r33 = r10
            r20 = r33
            r19 = r32
            r18 = r31
            r17 = r30
            r16 = r29
            r34 = r28
            r28 = r34
            r29 = r34
            r15 = r29
            r29 = r16
            r30 = r20
            int r28 = com.google.android.gms.internal.auth.zzge.zza(r28, r29, r30)
            r16 = r28
            r28 = r20
            r0 = r28
            int r0 = r0.zza
            r28 = r0
            r34 = r28
            r28 = r34
            r29 = r34
            r21 = r29
            if (r28 < 0) goto L_0x00c9
            r28 = r21
            r29 = r17
            r30 = r16
            int r29 = r29 - r30
            r0 = r28
            r1 = r29
            if (r0 <= r1) goto L_0x00ce
        L_0x00c9:
            com.google.android.gms.internal.auth.zzhs r28 = com.google.android.gms.internal.auth.zzhs.zza()
            throw r28
        L_0x00ce:
            r28 = r16
            r29 = r21
            int r28 = r28 + r29
            r22 = r28
            r28 = r18
            r0 = r28
            K r0 = r0.zzb
            r28 = r0
            r23 = r28
            r28 = r18
            r0 = r28
            V r0 = r0.zzd
            r28 = r0
            r24 = r28
        L_0x00ea:
            r28 = r16
            r29 = r22
            r0 = r28
            r1 = r29
            if (r0 >= r1) goto L_0x01be
            r28 = r15
            r29 = r16
            int r16 = r16 + 1
            byte r28 = r28[r29]
            r34 = r28
            r28 = r34
            r29 = r34
            r25 = r29
            if (r28 >= 0) goto L_0x011e
            r28 = r25
            r29 = r15
            r30 = r16
            r31 = r20
            int r28 = com.google.android.gms.internal.auth.zzge.zza((int) r28, (byte[]) r29, (int) r30, (com.google.android.gms.internal.auth.zzgd) r31)
            r16 = r28
            r28 = r20
            r0 = r28
            int r0 = r0.zza
            r28 = r0
            r25 = r28
        L_0x011e:
            r28 = r25
            r29 = 3
            int r28 = r28 >>> 3
            r26 = r28
            r28 = r25
            r29 = 7
            r28 = r28 & 7
            r27 = r28
            r28 = r26
            switch(r28) {
                case 1: goto L_0x0144;
                case 2: goto L_0x017c;
                default: goto L_0x0133;
            }
        L_0x0133:
            r28 = r25
            r29 = r15
            r30 = r16
            r31 = r17
            r32 = r20
            int r28 = com.google.android.gms.internal.auth.zzge.zza((int) r28, (byte[]) r29, (int) r30, (int) r31, (com.google.android.gms.internal.auth.zzgd) r32)
            r16 = r28
            goto L_0x00ea
        L_0x0144:
            r28 = r27
            r29 = r18
            r0 = r29
            com.google.android.gms.internal.auth.zzkr r0 = r0.zza
            r29 = r0
            int r29 = r29.zzb()
            r0 = r28
            r1 = r29
            if (r0 != r1) goto L_0x0133
            r28 = r15
            r29 = r16
            r30 = r17
            r31 = r18
            r0 = r31
            com.google.android.gms.internal.auth.zzkr r0 = r0.zza
            r31 = r0
            r32 = 0
            r33 = r20
            int r28 = zza((byte[]) r28, (int) r29, (int) r30, (com.google.android.gms.internal.auth.zzkr) r31, (java.lang.Class<?>) r32, (com.google.android.gms.internal.auth.zzgd) r33)
            r16 = r28
            r28 = r20
            r0 = r28
            java.lang.Object r0 = r0.zzc
            r28 = r0
            r23 = r28
            goto L_0x00ea
        L_0x017c:
            r28 = r27
            r29 = r18
            r0 = r29
            com.google.android.gms.internal.auth.zzkr r0 = r0.zzc
            r29 = r0
            int r29 = r29.zzb()
            r0 = r28
            r1 = r29
            if (r0 != r1) goto L_0x0133
            r28 = r15
            r29 = r16
            r30 = r17
            r31 = r18
            r0 = r31
            com.google.android.gms.internal.auth.zzkr r0 = r0.zzc
            r31 = r0
            r32 = r18
            r0 = r32
            V r0 = r0.zzd
            r32 = r0
            java.lang.Class r32 = r32.getClass()
            r33 = r20
            int r28 = zza((byte[]) r28, (int) r29, (int) r30, (com.google.android.gms.internal.auth.zzkr) r31, (java.lang.Class<?>) r32, (com.google.android.gms.internal.auth.zzgd) r33)
            r16 = r28
            r28 = r20
            r0 = r28
            java.lang.Object r0 = r0.zzc
            r28 = r0
            r24 = r28
            goto L_0x00ea
        L_0x01be:
            r28 = r16
            r29 = r22
            r0 = r28
            r1 = r29
            if (r0 == r1) goto L_0x01cd
            com.google.android.gms.internal.auth.zzhs r28 = com.google.android.gms.internal.auth.zzhs.zze()
            throw r28
        L_0x01cd:
            r28 = r19
            r29 = r23
            r30 = r24
            java.lang.Object r28 = r28.put(r29, r30)
            r28 = r22
            r2 = r28
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zziw.zza(java.lang.Object, byte[], int, int, int, long, com.google.android.gms.internal.auth.zzgd):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0065, code lost:
        r17.putInt(r4, r18, r9);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zza(T r33, byte[] r34, int r35, int r36, int r37, int r38, int r39, int r40, int r41, long r42, int r44, com.google.android.gms.internal.auth.zzgd r45) throws java.io.IOException {
        /*
            r32 = this;
            r3 = r32
            r4 = r33
            r5 = r34
            r6 = r35
            r7 = r36
            r8 = r37
            r9 = r38
            r10 = r39
            r11 = r40
            r12 = r41
            r13 = r42
            r15 = r44
            r16 = r45
            sun.misc.Unsafe r22 = zzb
            r17 = r22
            r22 = r3
            r0 = r22
            int[] r0 = r0.zzc
            r22 = r0
            r23 = r15
            r24 = 2
            int r23 = r23 + 2
            r22 = r22[r23]
            r23 = 1048575(0xfffff, float:1.469367E-39)
            r22 = r22 & r23
            r0 = r22
            long r0 = (long) r0
            r22 = r0
            r18 = r22
            r22 = r12
            switch(r22) {
                case 51: goto L_0x0044;
                case 52: goto L_0x0071;
                case 53: goto L_0x0093;
                case 54: goto L_0x0093;
                case 55: goto L_0x00b9;
                case 56: goto L_0x00df;
                case 57: goto L_0x0102;
                case 58: goto L_0x0125;
                case 59: goto L_0x0157;
                case 60: goto L_0x01de;
                case 61: goto L_0x025d;
                case 62: goto L_0x00b9;
                case 63: goto L_0x0286;
                case 64: goto L_0x0102;
                case 65: goto L_0x00df;
                case 66: goto L_0x02e5;
                case 67: goto L_0x0310;
                case 68: goto L_0x033b;
                default: goto L_0x003f;
            }
        L_0x003f:
            r22 = r6
            r3 = r22
            return r3
        L_0x0044:
            r22 = r10
            r23 = 1
            r0 = r22
            r1 = r23
            if (r0 != r1) goto L_0x003f
            r22 = r17
            r23 = r4
            r24 = r13
            r26 = r5
            r27 = r6
            double r26 = com.google.android.gms.internal.auth.zzge.zzc(r26, r27)
            java.lang.Double r26 = java.lang.Double.valueOf(r26)
            r22.putObject(r23, r24, r26)
            int r6 = r6 + 8
        L_0x0065:
            r22 = r17
            r23 = r4
            r24 = r18
            r26 = r9
            r22.putInt(r23, r24, r26)
            goto L_0x003f
        L_0x0071:
            r22 = r10
            r23 = 5
            r0 = r22
            r1 = r23
            if (r0 != r1) goto L_0x003f
            r22 = r17
            r23 = r4
            r24 = r13
            r26 = r5
            r27 = r6
            float r26 = com.google.android.gms.internal.auth.zzge.zzd(r26, r27)
            java.lang.Float r26 = java.lang.Float.valueOf(r26)
            r22.putObject(r23, r24, r26)
            int r6 = r6 + 4
            goto L_0x0065
        L_0x0093:
            r22 = r10
            if (r22 != 0) goto L_0x003f
            r22 = r5
            r23 = r6
            r24 = r16
            int r22 = com.google.android.gms.internal.auth.zzge.zzb(r22, r23, r24)
            r6 = r22
            r22 = r17
            r23 = r4
            r24 = r13
            r26 = r16
            r0 = r26
            long r0 = r0.zzb
            r26 = r0
            java.lang.Long r26 = java.lang.Long.valueOf(r26)
            r22.putObject(r23, r24, r26)
            goto L_0x0065
        L_0x00b9:
            r22 = r10
            if (r22 != 0) goto L_0x003f
            r22 = r5
            r23 = r6
            r24 = r16
            int r22 = com.google.android.gms.internal.auth.zzge.zza(r22, r23, r24)
            r6 = r22
            r22 = r17
            r23 = r4
            r24 = r13
            r26 = r16
            r0 = r26
            int r0 = r0.zza
            r26 = r0
            java.lang.Integer r26 = java.lang.Integer.valueOf(r26)
            r22.putObject(r23, r24, r26)
            goto L_0x0065
        L_0x00df:
            r22 = r10
            r23 = 1
            r0 = r22
            r1 = r23
            if (r0 != r1) goto L_0x003f
            r22 = r17
            r23 = r4
            r24 = r13
            r26 = r5
            r27 = r6
            long r26 = com.google.android.gms.internal.auth.zzge.zzb(r26, r27)
            java.lang.Long r26 = java.lang.Long.valueOf(r26)
            r22.putObject(r23, r24, r26)
            int r6 = r6 + 8
            goto L_0x0065
        L_0x0102:
            r22 = r10
            r23 = 5
            r0 = r22
            r1 = r23
            if (r0 != r1) goto L_0x003f
            r22 = r17
            r23 = r4
            r24 = r13
            r26 = r5
            r27 = r6
            int r26 = com.google.android.gms.internal.auth.zzge.zza(r26, r27)
            java.lang.Integer r26 = java.lang.Integer.valueOf(r26)
            r22.putObject(r23, r24, r26)
            int r6 = r6 + 4
            goto L_0x0065
        L_0x0125:
            r22 = r10
            if (r22 != 0) goto L_0x003f
            r22 = r5
            r23 = r6
            r24 = r16
            int r22 = com.google.android.gms.internal.auth.zzge.zzb(r22, r23, r24)
            r6 = r22
            r22 = r17
            r23 = r4
            r24 = r13
            r26 = r16
            r0 = r26
            long r0 = r0.zzb
            r26 = r0
            r28 = 0
            int r26 = (r26 > r28 ? 1 : (r26 == r28 ? 0 : -1))
            if (r26 == 0) goto L_0x0154
            r26 = 1
        L_0x014b:
            java.lang.Boolean r26 = java.lang.Boolean.valueOf(r26)
            r22.putObject(r23, r24, r26)
            goto L_0x0065
        L_0x0154:
            r26 = 0
            goto L_0x014b
        L_0x0157:
            r22 = r10
            r23 = 2
            r0 = r22
            r1 = r23
            if (r0 != r1) goto L_0x003f
            r22 = r5
            r23 = r6
            r24 = r16
            int r22 = com.google.android.gms.internal.auth.zzge.zza(r22, r23, r24)
            r6 = r22
            r22 = r16
            r0 = r22
            int r0 = r0.zza
            r22 = r0
            r30 = r22
            r22 = r30
            r23 = r30
            r20 = r23
            if (r22 != 0) goto L_0x0198
            r22 = r17
            r23 = r4
            r24 = r13
            java.lang.String r26 = ""
            r22.putObject(r23, r24, r26)
        L_0x018b:
            r22 = r17
            r23 = r4
            r24 = r18
            r26 = r9
            r22.putInt(r23, r24, r26)
            goto L_0x003f
        L_0x0198:
            r22 = r11
            r23 = 536870912(0x20000000, float:1.0842022E-19)
            r22 = r22 & r23
            if (r22 == 0) goto L_0x01b5
            r22 = r5
            r23 = r6
            r24 = r6
            r25 = r20
            int r24 = r24 + r25
            boolean r22 = com.google.android.gms.internal.auth.zzkj.zza((byte[]) r22, (int) r23, (int) r24)
            if (r22 != 0) goto L_0x01b5
            com.google.android.gms.internal.auth.zzhs r22 = com.google.android.gms.internal.auth.zzhs.zzf()
            throw r22
        L_0x01b5:
            java.lang.String r22 = new java.lang.String
            r30 = r22
            r22 = r30
            r23 = r30
            r24 = r5
            r25 = r6
            r26 = r20
            java.nio.charset.Charset r27 = com.google.android.gms.internal.auth.zzho.zza
            r23.<init>(r24, r25, r26, r27)
            r21 = r22
            r22 = r17
            r23 = r4
            r24 = r13
            r26 = r21
            r22.putObject(r23, r24, r26)
            r22 = r6
            r23 = r20
            int r22 = r22 + r23
            r6 = r22
            goto L_0x018b
        L_0x01de:
            r22 = r10
            r23 = 2
            r0 = r22
            r1 = r23
            if (r0 != r1) goto L_0x003f
            r22 = r3
            r23 = r15
            com.google.android.gms.internal.auth.zzji r22 = r22.zza((int) r23)
            r23 = r5
            r24 = r6
            r25 = r7
            r26 = r16
            int r22 = com.google.android.gms.internal.auth.zzge.zza((com.google.android.gms.internal.auth.zzji) r22, (byte[]) r23, (int) r24, (int) r25, (com.google.android.gms.internal.auth.zzgd) r26)
            r6 = r22
            r22 = r17
            r23 = r4
            r24 = r18
            int r22 = r22.getInt(r23, r24)
            r23 = r9
            r0 = r22
            r1 = r23
            if (r0 != r1) goto L_0x0242
            r22 = r17
            r23 = r4
            r24 = r13
            java.lang.Object r22 = r22.getObject(r23, r24)
        L_0x021a:
            r30 = r22
            r22 = r30
            r23 = r30
            r20 = r23
            if (r22 != 0) goto L_0x0245
            r22 = r17
            r23 = r4
            r24 = r13
            r26 = r16
            r0 = r26
            java.lang.Object r0 = r0.zzc
            r26 = r0
            r22.putObject(r23, r24, r26)
        L_0x0235:
            r22 = r17
            r23 = r4
            r24 = r18
            r26 = r9
            r22.putInt(r23, r24, r26)
            goto L_0x003f
        L_0x0242:
            r22 = 0
            goto L_0x021a
        L_0x0245:
            r22 = r17
            r23 = r4
            r24 = r13
            r26 = r20
            r27 = r16
            r0 = r27
            java.lang.Object r0 = r0.zzc
            r27 = r0
            java.lang.Object r26 = com.google.android.gms.internal.auth.zzho.zza((java.lang.Object) r26, (java.lang.Object) r27)
            r22.putObject(r23, r24, r26)
            goto L_0x0235
        L_0x025d:
            r22 = r10
            r23 = 2
            r0 = r22
            r1 = r23
            if (r0 != r1) goto L_0x003f
            r22 = r5
            r23 = r6
            r24 = r16
            int r22 = com.google.android.gms.internal.auth.zzge.zze(r22, r23, r24)
            r6 = r22
            r22 = r17
            r23 = r4
            r24 = r13
            r26 = r16
            r0 = r26
            java.lang.Object r0 = r0.zzc
            r26 = r0
            r22.putObject(r23, r24, r26)
            goto L_0x0065
        L_0x0286:
            r22 = r10
            if (r22 != 0) goto L_0x003f
            r22 = r5
            r23 = r6
            r24 = r16
            int r22 = com.google.android.gms.internal.auth.zzge.zza(r22, r23, r24)
            r6 = r22
            r22 = r16
            r0 = r22
            int r0 = r0.zza
            r22 = r0
            r20 = r22
            r22 = r3
            r23 = r15
            com.google.android.gms.internal.auth.zzhq r22 = r22.zzc((int) r23)
            r30 = r22
            r22 = r30
            r23 = r30
            r21 = r23
            if (r22 == 0) goto L_0x02bc
            r22 = r21
            r23 = r20
            boolean r22 = r22.zza(r23)
            if (r22 == 0) goto L_0x02cd
        L_0x02bc:
            r22 = r17
            r23 = r4
            r24 = r13
            r26 = r20
            java.lang.Integer r26 = java.lang.Integer.valueOf(r26)
            r22.putObject(r23, r24, r26)
            goto L_0x0065
        L_0x02cd:
            r22 = r4
            com.google.android.gms.internal.auth.zzkd r22 = zze((java.lang.Object) r22)
            r23 = r8
            r24 = r20
            r0 = r24
            long r0 = (long) r0
            r24 = r0
            java.lang.Long r24 = java.lang.Long.valueOf(r24)
            r22.zza((int) r23, (java.lang.Object) r24)
            goto L_0x003f
        L_0x02e5:
            r22 = r10
            if (r22 != 0) goto L_0x003f
            r22 = r5
            r23 = r6
            r24 = r16
            int r22 = com.google.android.gms.internal.auth.zzge.zza(r22, r23, r24)
            r6 = r22
            r22 = r17
            r23 = r4
            r24 = r13
            r26 = r16
            r0 = r26
            int r0 = r0.zza
            r26 = r0
            int r26 = com.google.android.gms.internal.auth.zzgu.zzb(r26)
            java.lang.Integer r26 = java.lang.Integer.valueOf(r26)
            r22.putObject(r23, r24, r26)
            goto L_0x0065
        L_0x0310:
            r22 = r10
            if (r22 != 0) goto L_0x003f
            r22 = r5
            r23 = r6
            r24 = r16
            int r22 = com.google.android.gms.internal.auth.zzge.zzb(r22, r23, r24)
            r6 = r22
            r22 = r17
            r23 = r4
            r24 = r13
            r26 = r16
            r0 = r26
            long r0 = r0.zzb
            r26 = r0
            long r26 = com.google.android.gms.internal.auth.zzgu.zza((long) r26)
            java.lang.Long r26 = java.lang.Long.valueOf(r26)
            r22.putObject(r23, r24, r26)
            goto L_0x0065
        L_0x033b:
            r22 = r10
            r23 = 3
            r0 = r22
            r1 = r23
            if (r0 != r1) goto L_0x003f
            r22 = r8
            r23 = -8
            r22 = r22 & -8
            r23 = 4
            r22 = r22 | 4
            r20 = r22
            r22 = r3
            r23 = r15
            com.google.android.gms.internal.auth.zzji r22 = r22.zza((int) r23)
            r23 = r5
            r24 = r6
            r25 = r7
            r26 = r20
            r27 = r16
            int r22 = com.google.android.gms.internal.auth.zzge.zza((com.google.android.gms.internal.auth.zzji) r22, (byte[]) r23, (int) r24, (int) r25, (int) r26, (com.google.android.gms.internal.auth.zzgd) r27)
            r6 = r22
            r22 = r17
            r23 = r4
            r24 = r18
            int r22 = r22.getInt(r23, r24)
            r23 = r9
            r0 = r22
            r1 = r23
            if (r0 != r1) goto L_0x03a2
            r22 = r17
            r23 = r4
            r24 = r13
            java.lang.Object r22 = r22.getObject(r23, r24)
        L_0x0385:
            r30 = r22
            r22 = r30
            r23 = r30
            r21 = r23
            if (r22 != 0) goto L_0x03a5
            r22 = r17
            r23 = r4
            r24 = r13
            r26 = r16
            r0 = r26
            java.lang.Object r0 = r0.zzc
            r26 = r0
            r22.putObject(r23, r24, r26)
            goto L_0x0065
        L_0x03a2:
            r22 = 0
            goto L_0x0385
        L_0x03a5:
            r22 = r17
            r23 = r4
            r24 = r13
            r26 = r21
            r27 = r16
            r0 = r27
            java.lang.Object r0 = r0.zzc
            r27 = r0
            java.lang.Object r26 = com.google.android.gms.internal.auth.zzho.zza((java.lang.Object) r26, (java.lang.Object) r27)
            r22.putObject(r23, r24, r26)
            goto L_0x0065
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zziw.zza(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, com.google.android.gms.internal.auth.zzgd):int");
    }

    private final zzji zza(int i) {
        int i2 = (i / 3) << 1;
        zzji zzji = (zzji) this.zzd[i2];
        zzji zzji2 = zzji;
        if (zzji != null) {
            return zzji2;
        }
        zzji zza2 = zzjh.zza().zza((Class) this.zzd[i2 + 1]);
        this.zzd[i2] = zza2;
        return zza2;
    }

    private final Object zzb(int i) {
        return this.zzd[(i / 3) << 1];
    }

    private final zzhq zzc(int i) {
        return (zzhq) this.zzd[((i / 3) << 1) + 1];
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r46v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r46v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r46v49, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r46v51, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r51v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v129, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r46v234, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r46v236, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r46v240, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r46v243, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0661  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x068f  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0730 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(T r63, byte[] r64, int r65, int r66, int r67, com.google.android.gms.internal.auth.zzgd r68) throws java.io.IOException {
        /*
            r62 = this;
            r2 = r62
            r3 = r63
            r4 = r64
            r5 = r65
            r6 = r66
            r7 = r67
            r8 = r68
            sun.misc.Unsafe r46 = zzb
            r9 = r46
            r46 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r46
            r46 = 0
            r11 = r46
            r46 = 0
            r12 = r46
            r46 = -1
            r13 = r46
            r46 = 0
            r14 = r46
        L_0x0027:
            r46 = r5
            r47 = r6
            r0 = r46
            r1 = r47
            if (r0 >= r1) goto L_0x0656
            r46 = r4
            r47 = r5
            int r5 = r5 + 1
            byte r46 = r46[r47]
            r61 = r46
            r46 = r61
            r47 = r61
            r12 = r47
            if (r46 >= 0) goto L_0x005b
            r46 = r12
            r47 = r4
            r48 = r5
            r49 = r8
            int r46 = com.google.android.gms.internal.auth.zzge.zza((int) r46, (byte[]) r47, (int) r48, (com.google.android.gms.internal.auth.zzgd) r49)
            r5 = r46
            r46 = r8
            r0 = r46
            int r0 = r0.zza
            r46 = r0
            r12 = r46
        L_0x005b:
            r46 = r12
            r47 = 3
            int r46 = r46 >>> 3
            r15 = r46
            r46 = r12
            r47 = 7
            r46 = r46 & 7
            r16 = r46
            r46 = r15
            r47 = r13
            r0 = r46
            r1 = r47
            if (r0 <= r1) goto L_0x0119
            r46 = r2
            r47 = r15
            r48 = r14
            r49 = 3
            int r48 = r48 / 3
            int r46 = r46.zza((int) r47, (int) r48)
            r14 = r46
        L_0x0085:
            r46 = r15
            r13 = r46
            r46 = r14
            r47 = -1
            r0 = r46
            r1 = r47
            if (r0 != r1) goto L_0x0125
            r46 = 0
            r14 = r46
        L_0x0097:
            r46 = r12
            r47 = r7
            r0 = r46
            r1 = r47
            if (r0 != r1) goto L_0x00a5
            r46 = r7
            if (r46 != 0) goto L_0x0656
        L_0x00a5:
            r46 = r2
            r0 = r46
            boolean r0 = r0.zzh
            r46 = r0
            if (r46 == 0) goto L_0x063e
            r46 = r8
            r0 = r46
            com.google.android.gms.internal.auth.zzhb r0 = r0.zzd
            r46 = r0
            com.google.android.gms.internal.auth.zzhb r47 = com.google.android.gms.internal.auth.zzhb.zza()
            r0 = r46
            r1 = r47
            if (r0 == r1) goto L_0x063e
            r46 = r12
            r47 = r4
            r48 = r5
            r49 = r6
            r50 = r3
            r51 = r2
            r0 = r51
            com.google.android.gms.internal.auth.zzis r0 = r0.zzg
            r51 = r0
            r52 = r8
            r32 = r52
            r31 = r51
            r30 = r50
            r29 = r49
            r28 = r48
            r27 = r47
            r61 = r46
            r46 = r61
            r47 = r61
            r26 = r47
            r47 = 3
            int r46 = r46 >>> 3
            r33 = r46
            r46 = r32
            r0 = r46
            com.google.android.gms.internal.auth.zzhb r0 = r0.zzd
            r46 = r0
            r47 = r31
            r48 = r33
            com.google.android.gms.internal.auth.zzhm$zzf r46 = r46.zza(r47, r48)
            if (r46 != 0) goto L_0x0620
            r46 = r26
            r47 = r27
            r48 = r28
            r49 = r29
            r50 = r30
            com.google.android.gms.internal.auth.zzkd r50 = zze((java.lang.Object) r50)
            r51 = r32
            int r46 = com.google.android.gms.internal.auth.zzge.zza((int) r46, (byte[]) r47, (int) r48, (int) r49, (com.google.android.gms.internal.auth.zzkd) r50, (com.google.android.gms.internal.auth.zzgd) r51)
            r5 = r46
            goto L_0x0027
        L_0x0119:
            r46 = r2
            r47 = r15
            int r46 = r46.zzf(r47)
            r14 = r46
            goto L_0x0085
        L_0x0125:
            r46 = r2
            r0 = r46
            int[] r0 = r0.zzc
            r46 = r0
            r47 = r14
            r48 = 1
            int r47 = r47 + 1
            r46 = r46[r47]
            r61 = r46
            r46 = r61
            r47 = r61
            r17 = r47
            r47 = 267386880(0xff00000, float:2.3665827E-29)
            r46 = r46 & r47
            r47 = 20
            int r46 = r46 >>> 20
            r18 = r46
            r46 = r17
            r47 = 1048575(0xfffff, float:1.469367E-39)
            r46 = r46 & r47
            r0 = r46
            long r0 = (long) r0
            r46 = r0
            r19 = r46
            r46 = r18
            r47 = 17
            r0 = r46
            r1 = r47
            if (r0 > r1) goto L_0x04f9
            r46 = r2
            r0 = r46
            int[] r0 = r0.zzc
            r46 = r0
            r47 = r14
            r48 = 2
            int r47 = r47 + 2
            r46 = r46[r47]
            r21 = r46
            r46 = 1
            r47 = r21
            r48 = 20
            int r47 = r47 >>> 20
            int r46 = r46 << r47
            r22 = r46
            r46 = r21
            r47 = 1048575(0xfffff, float:1.469367E-39)
            r46 = r46 & r47
            r61 = r46
            r46 = r61
            r47 = r61
            r23 = r47
            r47 = r10
            r0 = r46
            r1 = r47
            if (r0 == r1) goto L_0x01c4
            r46 = r10
            r47 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r46
            r1 = r47
            if (r0 == r1) goto L_0x01af
            r46 = r9
            r47 = r3
            r48 = r10
            r0 = r48
            long r0 = (long) r0
            r48 = r0
            r50 = r11
            r46.putInt(r47, r48, r50)
        L_0x01af:
            r46 = r23
            r10 = r46
            r46 = r9
            r47 = r3
            r48 = r23
            r0 = r48
            long r0 = (long) r0
            r48 = r0
            int r46 = r46.getInt(r47, r48)
            r11 = r46
        L_0x01c4:
            r46 = r18
            switch(r46) {
                case 0: goto L_0x01cb;
                case 1: goto L_0x01f0;
                case 2: goto L_0x0215;
                case 3: goto L_0x0215;
                case 4: goto L_0x0240;
                case 5: goto L_0x026b;
                case 6: goto L_0x0292;
                case 7: goto L_0x02b9;
                case 8: goto L_0x02ed;
                case 9: goto L_0x0333;
                case 10: goto L_0x0396;
                case 11: goto L_0x0240;
                case 12: goto L_0x03c7;
                case 13: goto L_0x0292;
                case 14: goto L_0x026b;
                case 15: goto L_0x042a;
                case 16: goto L_0x0459;
                case 17: goto L_0x0488;
                default: goto L_0x01c9;
            }
        L_0x01c9:
            goto L_0x0097
        L_0x01cb:
            r46 = r16
            r47 = 1
            r0 = r46
            r1 = r47
            if (r0 != r1) goto L_0x01c9
            r46 = r3
            r47 = r19
            r49 = r4
            r50 = r5
            double r49 = com.google.android.gms.internal.auth.zzge.zzc(r49, r50)
            com.google.android.gms.internal.auth.zzkg.zza((java.lang.Object) r46, (long) r47, (double) r49)
            int r5 = r5 + 8
            r46 = r11
            r47 = r22
            r46 = r46 | r47
            r11 = r46
            goto L_0x0027
        L_0x01f0:
            r46 = r16
            r47 = 5
            r0 = r46
            r1 = r47
            if (r0 != r1) goto L_0x01c9
            r46 = r3
            r47 = r19
            r49 = r4
            r50 = r5
            float r49 = com.google.android.gms.internal.auth.zzge.zzd(r49, r50)
            com.google.android.gms.internal.auth.zzkg.zza((java.lang.Object) r46, (long) r47, (float) r49)
            int r5 = r5 + 4
            r46 = r11
            r47 = r22
            r46 = r46 | r47
            r11 = r46
            goto L_0x0027
        L_0x0215:
            r46 = r16
            if (r46 != 0) goto L_0x01c9
            r46 = r4
            r47 = r5
            r48 = r8
            int r46 = com.google.android.gms.internal.auth.zzge.zzb(r46, r47, r48)
            r5 = r46
            r46 = r9
            r47 = r3
            r48 = r19
            r50 = r8
            r0 = r50
            long r0 = r0.zzb
            r50 = r0
            r46.putLong(r47, r48, r50)
            r46 = r11
            r47 = r22
            r46 = r46 | r47
            r11 = r46
            goto L_0x0027
        L_0x0240:
            r46 = r16
            if (r46 != 0) goto L_0x01c9
            r46 = r4
            r47 = r5
            r48 = r8
            int r46 = com.google.android.gms.internal.auth.zzge.zza(r46, r47, r48)
            r5 = r46
            r46 = r9
            r47 = r3
            r48 = r19
            r50 = r8
            r0 = r50
            int r0 = r0.zza
            r50 = r0
            r46.putInt(r47, r48, r50)
            r46 = r11
            r47 = r22
            r46 = r46 | r47
            r11 = r46
            goto L_0x0027
        L_0x026b:
            r46 = r16
            r47 = 1
            r0 = r46
            r1 = r47
            if (r0 != r1) goto L_0x01c9
            r46 = r9
            r47 = r3
            r48 = r19
            r50 = r4
            r51 = r5
            long r50 = com.google.android.gms.internal.auth.zzge.zzb(r50, r51)
            r46.putLong(r47, r48, r50)
            int r5 = r5 + 8
            r46 = r11
            r47 = r22
            r46 = r46 | r47
            r11 = r46
            goto L_0x0027
        L_0x0292:
            r46 = r16
            r47 = 5
            r0 = r46
            r1 = r47
            if (r0 != r1) goto L_0x01c9
            r46 = r9
            r47 = r3
            r48 = r19
            r50 = r4
            r51 = r5
            int r50 = com.google.android.gms.internal.auth.zzge.zza(r50, r51)
            r46.putInt(r47, r48, r50)
            int r5 = r5 + 4
            r46 = r11
            r47 = r22
            r46 = r46 | r47
            r11 = r46
            goto L_0x0027
        L_0x02b9:
            r46 = r16
            if (r46 != 0) goto L_0x01c9
            r46 = r4
            r47 = r5
            r48 = r8
            int r46 = com.google.android.gms.internal.auth.zzge.zzb(r46, r47, r48)
            r5 = r46
            r46 = r3
            r47 = r19
            r49 = r8
            r0 = r49
            long r0 = r0.zzb
            r49 = r0
            r51 = 0
            int r49 = (r49 > r51 ? 1 : (r49 == r51 ? 0 : -1))
            if (r49 == 0) goto L_0x02ea
            r49 = 1
        L_0x02dd:
            com.google.android.gms.internal.auth.zzkg.zza((java.lang.Object) r46, (long) r47, (boolean) r49)
            r46 = r11
            r47 = r22
            r46 = r46 | r47
            r11 = r46
            goto L_0x0027
        L_0x02ea:
            r49 = 0
            goto L_0x02dd
        L_0x02ed:
            r46 = r16
            r47 = 2
            r0 = r46
            r1 = r47
            if (r0 != r1) goto L_0x01c9
            r46 = r17
            r47 = 536870912(0x20000000, float:1.0842022E-19)
            r46 = r46 & r47
            if (r46 != 0) goto L_0x0326
            r46 = r4
            r47 = r5
            r48 = r8
            int r46 = com.google.android.gms.internal.auth.zzge.zzc(r46, r47, r48)
            r5 = r46
        L_0x030b:
            r46 = r9
            r47 = r3
            r48 = r19
            r50 = r8
            r0 = r50
            java.lang.Object r0 = r0.zzc
            r50 = r0
            r46.putObject(r47, r48, r50)
            r46 = r11
            r47 = r22
            r46 = r46 | r47
            r11 = r46
            goto L_0x0027
        L_0x0326:
            r46 = r4
            r47 = r5
            r48 = r8
            int r46 = com.google.android.gms.internal.auth.zzge.zzd(r46, r47, r48)
            r5 = r46
            goto L_0x030b
        L_0x0333:
            r46 = r16
            r47 = 2
            r0 = r46
            r1 = r47
            if (r0 != r1) goto L_0x01c9
            r46 = r2
            r47 = r14
            com.google.android.gms.internal.auth.zzji r46 = r46.zza((int) r47)
            r47 = r4
            r48 = r5
            r49 = r6
            r50 = r8
            int r46 = com.google.android.gms.internal.auth.zzge.zza((com.google.android.gms.internal.auth.zzji) r46, (byte[]) r47, (int) r48, (int) r49, (com.google.android.gms.internal.auth.zzgd) r50)
            r5 = r46
            r46 = r11
            r47 = r22
            r46 = r46 & r47
            if (r46 != 0) goto L_0x0376
            r46 = r9
            r47 = r3
            r48 = r19
            r50 = r8
            r0 = r50
            java.lang.Object r0 = r0.zzc
            r50 = r0
            r46.putObject(r47, r48, r50)
        L_0x036c:
            r46 = r11
            r47 = r22
            r46 = r46 | r47
            r11 = r46
            goto L_0x0027
        L_0x0376:
            r46 = r9
            r47 = r3
            r48 = r19
            r50 = r9
            r51 = r3
            r52 = r19
            java.lang.Object r50 = r50.getObject(r51, r52)
            r51 = r8
            r0 = r51
            java.lang.Object r0 = r0.zzc
            r51 = r0
            java.lang.Object r50 = com.google.android.gms.internal.auth.zzho.zza((java.lang.Object) r50, (java.lang.Object) r51)
            r46.putObject(r47, r48, r50)
            goto L_0x036c
        L_0x0396:
            r46 = r16
            r47 = 2
            r0 = r46
            r1 = r47
            if (r0 != r1) goto L_0x01c9
            r46 = r4
            r47 = r5
            r48 = r8
            int r46 = com.google.android.gms.internal.auth.zzge.zze(r46, r47, r48)
            r5 = r46
            r46 = r9
            r47 = r3
            r48 = r19
            r50 = r8
            r0 = r50
            java.lang.Object r0 = r0.zzc
            r50 = r0
            r46.putObject(r47, r48, r50)
            r46 = r11
            r47 = r22
            r46 = r46 | r47
            r11 = r46
            goto L_0x0027
        L_0x03c7:
            r46 = r16
            if (r46 != 0) goto L_0x01c9
            r46 = r4
            r47 = r5
            r48 = r8
            int r46 = com.google.android.gms.internal.auth.zzge.zza(r46, r47, r48)
            r5 = r46
            r46 = r8
            r0 = r46
            int r0 = r0.zza
            r46 = r0
            r24 = r46
            r46 = r2
            r47 = r14
            com.google.android.gms.internal.auth.zzhq r46 = r46.zzc((int) r47)
            r61 = r46
            r46 = r61
            r47 = r61
            r25 = r47
            if (r46 == 0) goto L_0x03fd
            r46 = r25
            r47 = r24
            boolean r46 = r46.zza(r47)
            if (r46 == 0) goto L_0x0412
        L_0x03fd:
            r46 = r9
            r47 = r3
            r48 = r19
            r50 = r24
            r46.putInt(r47, r48, r50)
            r46 = r11
            r47 = r22
            r46 = r46 | r47
            r11 = r46
            goto L_0x0027
        L_0x0412:
            r46 = r3
            com.google.android.gms.internal.auth.zzkd r46 = zze((java.lang.Object) r46)
            r47 = r12
            r48 = r24
            r0 = r48
            long r0 = (long) r0
            r48 = r0
            java.lang.Long r48 = java.lang.Long.valueOf(r48)
            r46.zza((int) r47, (java.lang.Object) r48)
            goto L_0x0027
        L_0x042a:
            r46 = r16
            if (r46 != 0) goto L_0x01c9
            r46 = r4
            r47 = r5
            r48 = r8
            int r46 = com.google.android.gms.internal.auth.zzge.zza(r46, r47, r48)
            r5 = r46
            r46 = r9
            r47 = r3
            r48 = r19
            r50 = r8
            r0 = r50
            int r0 = r0.zza
            r50 = r0
            int r50 = com.google.android.gms.internal.auth.zzgu.zzb(r50)
            r46.putInt(r47, r48, r50)
            r46 = r11
            r47 = r22
            r46 = r46 | r47
            r11 = r46
            goto L_0x0027
        L_0x0459:
            r46 = r16
            if (r46 != 0) goto L_0x01c9
            r46 = r4
            r47 = r5
            r48 = r8
            int r46 = com.google.android.gms.internal.auth.zzge.zzb(r46, r47, r48)
            r5 = r46
            r46 = r9
            r47 = r3
            r48 = r19
            r50 = r8
            r0 = r50
            long r0 = r0.zzb
            r50 = r0
            long r50 = com.google.android.gms.internal.auth.zzgu.zza((long) r50)
            r46.putLong(r47, r48, r50)
            r46 = r11
            r47 = r22
            r46 = r46 | r47
            r11 = r46
            goto L_0x0027
        L_0x0488:
            r46 = r16
            r47 = 3
            r0 = r46
            r1 = r47
            if (r0 != r1) goto L_0x01c9
            r46 = r15
            r47 = 3
            int r46 = r46 << 3
            r47 = 4
            r46 = r46 | 4
            r24 = r46
            r46 = r2
            r47 = r14
            com.google.android.gms.internal.auth.zzji r46 = r46.zza((int) r47)
            r47 = r4
            r48 = r5
            r49 = r6
            r50 = r24
            r51 = r8
            int r46 = com.google.android.gms.internal.auth.zzge.zza((com.google.android.gms.internal.auth.zzji) r46, (byte[]) r47, (int) r48, (int) r49, (int) r50, (com.google.android.gms.internal.auth.zzgd) r51)
            r5 = r46
            r46 = r11
            r47 = r22
            r46 = r46 & r47
            if (r46 != 0) goto L_0x04d9
            r46 = r9
            r47 = r3
            r48 = r19
            r50 = r8
            r0 = r50
            java.lang.Object r0 = r0.zzc
            r50 = r0
            r46.putObject(r47, r48, r50)
        L_0x04cf:
            r46 = r11
            r47 = r22
            r46 = r46 | r47
            r11 = r46
            goto L_0x0027
        L_0x04d9:
            r46 = r9
            r47 = r3
            r48 = r19
            r50 = r9
            r51 = r3
            r52 = r19
            java.lang.Object r50 = r50.getObject(r51, r52)
            r51 = r8
            r0 = r51
            java.lang.Object r0 = r0.zzc
            r51 = r0
            java.lang.Object r50 = com.google.android.gms.internal.auth.zzho.zza((java.lang.Object) r50, (java.lang.Object) r51)
            r46.putObject(r47, r48, r50)
            goto L_0x04cf
        L_0x04f9:
            r46 = r18
            r47 = 27
            r0 = r46
            r1 = r47
            if (r0 != r1) goto L_0x056b
            r46 = r16
            r47 = 2
            r0 = r46
            r1 = r47
            if (r0 != r1) goto L_0x0097
            r46 = r9
            r47 = r3
            r48 = r19
            java.lang.Object r46 = r46.getObject(r47, r48)
            com.google.android.gms.internal.auth.zzht r46 = (com.google.android.gms.internal.auth.zzht) r46
            r61 = r46
            r46 = r61
            r47 = r61
            r21 = r47
            boolean r46 = r46.zza()
            if (r46 != 0) goto L_0x0548
            r46 = r21
            int r46 = r46.size()
            r22 = r46
            r46 = r21
            r47 = r22
            if (r47 != 0) goto L_0x0564
            r47 = 10
        L_0x0537:
            com.google.android.gms.internal.auth.zzht r46 = r46.zza(r47)
            r21 = r46
            r46 = r9
            r47 = r3
            r48 = r19
            r50 = r21
            r46.putObject(r47, r48, r50)
        L_0x0548:
            r46 = r2
            r47 = r14
            com.google.android.gms.internal.auth.zzji r46 = r46.zza((int) r47)
            r47 = r12
            r48 = r4
            r49 = r5
            r50 = r6
            r51 = r21
            r52 = r8
            int r46 = com.google.android.gms.internal.auth.zzge.zza(r46, r47, r48, r49, r50, r51, r52)
            r5 = r46
            goto L_0x0027
        L_0x0564:
            r47 = r22
            r48 = 1
            int r47 = r47 << 1
            goto L_0x0537
        L_0x056b:
            r46 = r18
            r47 = 49
            r0 = r46
            r1 = r47
            if (r0 > r1) goto L_0x05ae
            r46 = r5
            r21 = r46
            r46 = r2
            r47 = r3
            r48 = r4
            r49 = r5
            r50 = r6
            r51 = r12
            r52 = r15
            r53 = r16
            r54 = r14
            r55 = r17
            r0 = r55
            long r0 = (long) r0
            r55 = r0
            r57 = r18
            r58 = r19
            r60 = r8
            int r46 = r46.zza(r47, (byte[]) r48, (int) r49, (int) r50, (int) r51, (int) r52, (int) r53, (int) r54, (long) r55, (int) r57, (long) r58, (com.google.android.gms.internal.auth.zzgd) r60)
            r61 = r46
            r46 = r61
            r47 = r61
            r5 = r47
            r47 = r21
            r0 = r46
            r1 = r47
            if (r0 != r1) goto L_0x0027
            goto L_0x0097
        L_0x05ae:
            r46 = r18
            r47 = 50
            r0 = r46
            r1 = r47
            if (r0 != r1) goto L_0x05ec
            r46 = r16
            r47 = 2
            r0 = r46
            r1 = r47
            if (r0 != r1) goto L_0x0097
            r46 = r5
            r21 = r46
            r46 = r2
            r47 = r3
            r48 = r4
            r49 = r5
            r50 = r6
            r51 = r14
            r52 = r19
            r54 = r8
            int r46 = r46.zza(r47, (byte[]) r48, (int) r49, (int) r50, (int) r51, (long) r52, (com.google.android.gms.internal.auth.zzgd) r54)
            r61 = r46
            r46 = r61
            r47 = r61
            r5 = r47
            r47 = r21
            r0 = r46
            r1 = r47
            if (r0 != r1) goto L_0x0027
            goto L_0x0097
        L_0x05ec:
            r46 = r5
            r21 = r46
            r46 = r2
            r47 = r3
            r48 = r4
            r49 = r5
            r50 = r6
            r51 = r12
            r52 = r15
            r53 = r16
            r54 = r17
            r55 = r18
            r56 = r19
            r58 = r14
            r59 = r8
            int r46 = r46.zza(r47, (byte[]) r48, (int) r49, (int) r50, (int) r51, (int) r52, (int) r53, (int) r54, (int) r55, (long) r56, (int) r58, (com.google.android.gms.internal.auth.zzgd) r59)
            r61 = r46
            r46 = r61
            r47 = r61
            r5 = r47
            r47 = r21
            r0 = r46
            r1 = r47
            if (r0 != r1) goto L_0x0027
            goto L_0x0097
        L_0x0620:
            r46 = r30
            com.google.android.gms.internal.auth.zzhm$zzd r46 = (com.google.android.gms.internal.auth.zzhm.zzd) r46
            com.google.android.gms.internal.auth.zzhe r46 = r46.zzi()
            r46 = r30
            com.google.android.gms.internal.auth.zzhm$zzd r46 = (com.google.android.gms.internal.auth.zzhm.zzd) r46
            r0 = r46
            com.google.android.gms.internal.auth.zzhe<com.google.android.gms.internal.auth.zzhm$zzc> r0 = r0.zzc
            r46 = r0
            java.lang.NoSuchMethodError r46 = new java.lang.NoSuchMethodError
            r61 = r46
            r46 = r61
            r47 = r61
            r47.<init>()
            throw r46
        L_0x063e:
            r46 = r12
            r47 = r4
            r48 = r5
            r49 = r6
            r50 = r3
            com.google.android.gms.internal.auth.zzkd r50 = zze((java.lang.Object) r50)
            r51 = r8
            int r46 = com.google.android.gms.internal.auth.zzge.zza((int) r46, (byte[]) r47, (int) r48, (int) r49, (com.google.android.gms.internal.auth.zzkd) r50, (com.google.android.gms.internal.auth.zzgd) r51)
            r5 = r46
            goto L_0x0027
        L_0x0656:
            r46 = r10
            r47 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r46
            r1 = r47
            if (r0 == r1) goto L_0x0671
            r46 = r9
            r47 = r3
            r48 = r10
            r0 = r48
            long r0 = (long) r0
            r48 = r0
            r50 = r11
            r46.putInt(r47, r48, r50)
        L_0x0671:
            r46 = 0
            r15 = r46
            r46 = r2
            r0 = r46
            int r0 = r0.zzm
            r46 = r0
            r16 = r46
        L_0x067f:
            r46 = r16
            r47 = r2
            r0 = r47
            int r0 = r0.zzn
            r47 = r0
            r0 = r46
            r1 = r47
            if (r0 >= r1) goto L_0x0730
            r46 = r2
            r47 = r3
            r48 = r2
            r0 = r48
            int[] r0 = r0.zzl
            r48 = r0
            r49 = r16
            r48 = r48[r49]
            r49 = r15
            r50 = r2
            r0 = r50
            com.google.android.gms.internal.auth.zzka<?, ?> r0 = r0.zzq
            r50 = r0
            r38 = r50
            r37 = r49
            r36 = r48
            r35 = r47
            r61 = r46
            r46 = r61
            r47 = r61
            r34 = r47
            r47 = r36
            r45 = r47
            r0 = r46
            int[] r0 = r0.zzc
            r46 = r0
            r47 = r45
            r46 = r46[r47]
            r39 = r46
            r46 = r34
            r47 = r36
            int r46 = r46.zzd((int) r47)
            r47 = 1048575(0xfffff, float:1.469367E-39)
            r46 = r46 & r47
            r0 = r46
            long r0 = (long) r0
            r46 = r0
            r40 = r46
            r46 = r35
            r47 = r40
            java.lang.Object r46 = com.google.android.gms.internal.auth.zzkg.zzf(r46, r47)
            r61 = r46
            r46 = r61
            r47 = r61
            r42 = r47
            if (r46 != 0) goto L_0x06f8
            r46 = r37
        L_0x06f1:
            com.google.android.gms.internal.auth.zzkd r46 = (com.google.android.gms.internal.auth.zzkd) r46
            r15 = r46
            int r16 = r16 + 1
            goto L_0x067f
        L_0x06f8:
            r46 = r34
            r47 = r36
            com.google.android.gms.internal.auth.zzhq r46 = r46.zzc((int) r47)
            r61 = r46
            r46 = r61
            r47 = r61
            r43 = r47
            if (r46 != 0) goto L_0x070d
            r46 = r37
            goto L_0x06f1
        L_0x070d:
            r46 = r34
            r0 = r46
            com.google.android.gms.internal.auth.zzip r0 = r0.zzs
            r46 = r0
            r47 = r42
            java.util.Map r46 = r46.zza(r47)
            r44 = r46
            r46 = r34
            r47 = r36
            r48 = r39
            r49 = r44
            r50 = r43
            r51 = r37
            r52 = r38
            java.lang.Object r46 = r46.zza((int) r47, (int) r48, r49, (com.google.android.gms.internal.auth.zzhq) r50, r51, r52)
            goto L_0x06f1
        L_0x0730:
            r46 = r15
            if (r46 == 0) goto L_0x0743
            r46 = r2
            r0 = r46
            com.google.android.gms.internal.auth.zzka<?, ?> r0 = r0.zzq
            r46 = r0
            r47 = r3
            r48 = r15
            r46.zzb((java.lang.Object) r47, r48)
        L_0x0743:
            r46 = r7
            if (r46 != 0) goto L_0x0756
            r46 = r5
            r47 = r6
            r0 = r46
            r1 = r47
            if (r0 == r1) goto L_0x076f
            com.google.android.gms.internal.auth.zzhs r46 = com.google.android.gms.internal.auth.zzhs.zze()
            throw r46
        L_0x0756:
            r46 = r5
            r47 = r6
            r0 = r46
            r1 = r47
            if (r0 > r1) goto L_0x076a
            r46 = r12
            r47 = r7
            r0 = r46
            r1 = r47
            if (r0 == r1) goto L_0x076f
        L_0x076a:
            com.google.android.gms.internal.auth.zzhs r46 = com.google.android.gms.internal.auth.zzhs.zze()
            throw r46
        L_0x076f:
            r46 = r5
            r2 = r46
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zziw.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.auth.zzgd):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v167, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v170, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: byte} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(T r47, byte[] r48, int r49, int r50, com.google.android.gms.internal.auth.zzgd r51) throws java.io.IOException {
        /*
            r46 = this;
            r2 = r46
            r3 = r47
            r4 = r48
            r5 = r49
            r6 = r50
            r7 = r51
            r30 = r2
            r0 = r30
            boolean r0 = r0.zzj
            r30 = r0
            if (r30 == 0) goto L_0x0562
            r30 = r2
            r31 = r3
            r32 = r4
            r33 = r5
            r34 = r6
            r35 = r7
            r13 = r35
            r12 = r34
            r11 = r33
            r10 = r32
            r9 = r31
            r8 = r30
            sun.misc.Unsafe r30 = zzb
            r14 = r30
            r30 = 1048575(0xfffff, float:1.469367E-39)
            r15 = r30
            r30 = 0
            r16 = r30
            r30 = -1
            r18 = r30
            r30 = 0
            r19 = r30
        L_0x0043:
            r30 = r11
            r31 = r12
            r0 = r30
            r1 = r31
            if (r0 >= r1) goto L_0x0537
            r30 = r10
            r31 = r11
            int r11 = r11 + 1
            byte r30 = r30[r31]
            r45 = r30
            r30 = r45
            r31 = r45
            r17 = r31
            if (r30 >= 0) goto L_0x0077
            r30 = r17
            r31 = r10
            r32 = r11
            r33 = r13
            int r30 = com.google.android.gms.internal.auth.zzge.zza((int) r30, (byte[]) r31, (int) r32, (com.google.android.gms.internal.auth.zzgd) r33)
            r11 = r30
            r30 = r13
            r0 = r30
            int r0 = r0.zza
            r30 = r0
            r17 = r30
        L_0x0077:
            r30 = r17
            r31 = 3
            int r30 = r30 >>> 3
            r20 = r30
            r30 = r17
            r31 = 7
            r30 = r30 & 7
            r21 = r30
            r30 = r20
            r31 = r18
            r0 = r30
            r1 = r31
            if (r0 <= r1) goto L_0x00cb
            r30 = r8
            r31 = r20
            r32 = r19
            r33 = 3
            int r32 = r32 / 3
            int r30 = r30.zza((int) r31, (int) r32)
            r19 = r30
        L_0x00a1:
            r30 = r20
            r18 = r30
            r30 = r19
            r31 = -1
            r0 = r30
            r1 = r31
            if (r0 != r1) goto L_0x00d6
            r30 = 0
            r19 = r30
        L_0x00b3:
            r30 = r17
            r31 = r10
            r32 = r11
            r33 = r12
            r34 = r9
            com.google.android.gms.internal.auth.zzkd r34 = zze((java.lang.Object) r34)
            r35 = r13
            int r30 = com.google.android.gms.internal.auth.zzge.zza((int) r30, (byte[]) r31, (int) r32, (int) r33, (com.google.android.gms.internal.auth.zzkd) r34, (com.google.android.gms.internal.auth.zzgd) r35)
            r11 = r30
            goto L_0x0043
        L_0x00cb:
            r30 = r8
            r31 = r20
            int r30 = r30.zzf(r31)
            r19 = r30
            goto L_0x00a1
        L_0x00d6:
            r30 = r8
            r0 = r30
            int[] r0 = r0.zzc
            r30 = r0
            r31 = r19
            r32 = 1
            int r31 = r31 + 1
            r30 = r30[r31]
            r45 = r30
            r30 = r45
            r31 = r45
            r22 = r31
            r31 = 267386880(0xff00000, float:2.3665827E-29)
            r30 = r30 & r31
            r31 = 20
            int r30 = r30 >>> 20
            r23 = r30
            r30 = r22
            r31 = 1048575(0xfffff, float:1.469367E-39)
            r30 = r30 & r31
            r0 = r30
            long r0 = (long) r0
            r30 = r0
            r24 = r30
            r30 = r23
            r31 = 17
            r0 = r30
            r1 = r31
            if (r0 > r1) goto L_0x0410
            r30 = r8
            r0 = r30
            int[] r0 = r0.zzc
            r30 = r0
            r31 = r19
            r32 = 2
            int r31 = r31 + 2
            r30 = r30[r31]
            r26 = r30
            r30 = 1
            r31 = r26
            r32 = 20
            int r31 = r31 >>> 20
            int r30 = r30 << r31
            r27 = r30
            r30 = r26
            r31 = 1048575(0xfffff, float:1.469367E-39)
            r30 = r30 & r31
            r45 = r30
            r30 = r45
            r31 = r45
            r28 = r31
            r31 = r15
            r0 = r30
            r1 = r31
            if (r0 == r1) goto L_0x0180
            r30 = r15
            r31 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r30
            r1 = r31
            if (r0 == r1) goto L_0x0160
            r30 = r14
            r31 = r9
            r32 = r15
            r0 = r32
            long r0 = (long) r0
            r32 = r0
            r34 = r16
            r30.putInt(r31, r32, r34)
        L_0x0160:
            r30 = r28
            r31 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r30
            r1 = r31
            if (r0 == r1) goto L_0x017c
            r30 = r14
            r31 = r9
            r32 = r28
            r0 = r32
            long r0 = (long) r0
            r32 = r0
            int r30 = r30.getInt(r31, r32)
            r16 = r30
        L_0x017c:
            r30 = r28
            r15 = r30
        L_0x0180:
            r30 = r23
            switch(r30) {
                case 0: goto L_0x0187;
                case 1: goto L_0x01ac;
                case 2: goto L_0x01d1;
                case 3: goto L_0x01d1;
                case 4: goto L_0x01fc;
                case 5: goto L_0x0227;
                case 6: goto L_0x024e;
                case 7: goto L_0x0275;
                case 8: goto L_0x02a9;
                case 9: goto L_0x02ef;
                case 10: goto L_0x0356;
                case 11: goto L_0x01fc;
                case 12: goto L_0x0387;
                case 13: goto L_0x024e;
                case 14: goto L_0x0227;
                case 15: goto L_0x03b2;
                case 16: goto L_0x03e1;
                default: goto L_0x0185;
            }
        L_0x0185:
            goto L_0x00b3
        L_0x0187:
            r30 = r21
            r31 = 1
            r0 = r30
            r1 = r31
            if (r0 != r1) goto L_0x0185
            r30 = r9
            r31 = r24
            r33 = r10
            r34 = r11
            double r33 = com.google.android.gms.internal.auth.zzge.zzc(r33, r34)
            com.google.android.gms.internal.auth.zzkg.zza((java.lang.Object) r30, (long) r31, (double) r33)
            int r11 = r11 + 8
            r30 = r16
            r31 = r27
            r30 = r30 | r31
            r16 = r30
            goto L_0x0043
        L_0x01ac:
            r30 = r21
            r31 = 5
            r0 = r30
            r1 = r31
            if (r0 != r1) goto L_0x0185
            r30 = r9
            r31 = r24
            r33 = r10
            r34 = r11
            float r33 = com.google.android.gms.internal.auth.zzge.zzd(r33, r34)
            com.google.android.gms.internal.auth.zzkg.zza((java.lang.Object) r30, (long) r31, (float) r33)
            int r11 = r11 + 4
            r30 = r16
            r31 = r27
            r30 = r30 | r31
            r16 = r30
            goto L_0x0043
        L_0x01d1:
            r30 = r21
            if (r30 != 0) goto L_0x0185
            r30 = r10
            r31 = r11
            r32 = r13
            int r30 = com.google.android.gms.internal.auth.zzge.zzb(r30, r31, r32)
            r11 = r30
            r30 = r14
            r31 = r9
            r32 = r24
            r34 = r13
            r0 = r34
            long r0 = r0.zzb
            r34 = r0
            r30.putLong(r31, r32, r34)
            r30 = r16
            r31 = r27
            r30 = r30 | r31
            r16 = r30
            goto L_0x0043
        L_0x01fc:
            r30 = r21
            if (r30 != 0) goto L_0x0185
            r30 = r10
            r31 = r11
            r32 = r13
            int r30 = com.google.android.gms.internal.auth.zzge.zza(r30, r31, r32)
            r11 = r30
            r30 = r14
            r31 = r9
            r32 = r24
            r34 = r13
            r0 = r34
            int r0 = r0.zza
            r34 = r0
            r30.putInt(r31, r32, r34)
            r30 = r16
            r31 = r27
            r30 = r30 | r31
            r16 = r30
            goto L_0x0043
        L_0x0227:
            r30 = r21
            r31 = 1
            r0 = r30
            r1 = r31
            if (r0 != r1) goto L_0x0185
            r30 = r14
            r31 = r9
            r32 = r24
            r34 = r10
            r35 = r11
            long r34 = com.google.android.gms.internal.auth.zzge.zzb(r34, r35)
            r30.putLong(r31, r32, r34)
            int r11 = r11 + 8
            r30 = r16
            r31 = r27
            r30 = r30 | r31
            r16 = r30
            goto L_0x0043
        L_0x024e:
            r30 = r21
            r31 = 5
            r0 = r30
            r1 = r31
            if (r0 != r1) goto L_0x0185
            r30 = r14
            r31 = r9
            r32 = r24
            r34 = r10
            r35 = r11
            int r34 = com.google.android.gms.internal.auth.zzge.zza(r34, r35)
            r30.putInt(r31, r32, r34)
            int r11 = r11 + 4
            r30 = r16
            r31 = r27
            r30 = r30 | r31
            r16 = r30
            goto L_0x0043
        L_0x0275:
            r30 = r21
            if (r30 != 0) goto L_0x0185
            r30 = r10
            r31 = r11
            r32 = r13
            int r30 = com.google.android.gms.internal.auth.zzge.zzb(r30, r31, r32)
            r11 = r30
            r30 = r9
            r31 = r24
            r33 = r13
            r0 = r33
            long r0 = r0.zzb
            r33 = r0
            r35 = 0
            int r33 = (r33 > r35 ? 1 : (r33 == r35 ? 0 : -1))
            if (r33 == 0) goto L_0x02a6
            r33 = 1
        L_0x0299:
            com.google.android.gms.internal.auth.zzkg.zza((java.lang.Object) r30, (long) r31, (boolean) r33)
            r30 = r16
            r31 = r27
            r30 = r30 | r31
            r16 = r30
            goto L_0x0043
        L_0x02a6:
            r33 = 0
            goto L_0x0299
        L_0x02a9:
            r30 = r21
            r31 = 2
            r0 = r30
            r1 = r31
            if (r0 != r1) goto L_0x0185
            r30 = r22
            r31 = 536870912(0x20000000, float:1.0842022E-19)
            r30 = r30 & r31
            if (r30 != 0) goto L_0x02e2
            r30 = r10
            r31 = r11
            r32 = r13
            int r30 = com.google.android.gms.internal.auth.zzge.zzc(r30, r31, r32)
            r11 = r30
        L_0x02c7:
            r30 = r14
            r31 = r9
            r32 = r24
            r34 = r13
            r0 = r34
            java.lang.Object r0 = r0.zzc
            r34 = r0
            r30.putObject(r31, r32, r34)
            r30 = r16
            r31 = r27
            r30 = r30 | r31
            r16 = r30
            goto L_0x0043
        L_0x02e2:
            r30 = r10
            r31 = r11
            r32 = r13
            int r30 = com.google.android.gms.internal.auth.zzge.zzd(r30, r31, r32)
            r11 = r30
            goto L_0x02c7
        L_0x02ef:
            r30 = r21
            r31 = 2
            r0 = r30
            r1 = r31
            if (r0 != r1) goto L_0x0185
            r30 = r8
            r31 = r19
            com.google.android.gms.internal.auth.zzji r30 = r30.zza((int) r31)
            r31 = r10
            r32 = r11
            r33 = r12
            r34 = r13
            int r30 = com.google.android.gms.internal.auth.zzge.zza((com.google.android.gms.internal.auth.zzji) r30, (byte[]) r31, (int) r32, (int) r33, (com.google.android.gms.internal.auth.zzgd) r34)
            r11 = r30
            r30 = r14
            r31 = r9
            r32 = r24
            java.lang.Object r30 = r30.getObject(r31, r32)
            r45 = r30
            r30 = r45
            r31 = r45
            r29 = r31
            if (r30 != 0) goto L_0x033e
            r30 = r14
            r31 = r9
            r32 = r24
            r34 = r13
            r0 = r34
            java.lang.Object r0 = r0.zzc
            r34 = r0
            r30.putObject(r31, r32, r34)
        L_0x0334:
            r30 = r16
            r31 = r27
            r30 = r30 | r31
            r16 = r30
            goto L_0x0043
        L_0x033e:
            r30 = r14
            r31 = r9
            r32 = r24
            r34 = r29
            r35 = r13
            r0 = r35
            java.lang.Object r0 = r0.zzc
            r35 = r0
            java.lang.Object r34 = com.google.android.gms.internal.auth.zzho.zza((java.lang.Object) r34, (java.lang.Object) r35)
            r30.putObject(r31, r32, r34)
            goto L_0x0334
        L_0x0356:
            r30 = r21
            r31 = 2
            r0 = r30
            r1 = r31
            if (r0 != r1) goto L_0x0185
            r30 = r10
            r31 = r11
            r32 = r13
            int r30 = com.google.android.gms.internal.auth.zzge.zze(r30, r31, r32)
            r11 = r30
            r30 = r14
            r31 = r9
            r32 = r24
            r34 = r13
            r0 = r34
            java.lang.Object r0 = r0.zzc
            r34 = r0
            r30.putObject(r31, r32, r34)
            r30 = r16
            r31 = r27
            r30 = r30 | r31
            r16 = r30
            goto L_0x0043
        L_0x0387:
            r30 = r21
            if (r30 != 0) goto L_0x0185
            r30 = r10
            r31 = r11
            r32 = r13
            int r30 = com.google.android.gms.internal.auth.zzge.zza(r30, r31, r32)
            r11 = r30
            r30 = r14
            r31 = r9
            r32 = r24
            r34 = r13
            r0 = r34
            int r0 = r0.zza
            r34 = r0
            r30.putInt(r31, r32, r34)
            r30 = r16
            r31 = r27
            r30 = r30 | r31
            r16 = r30
            goto L_0x0043
        L_0x03b2:
            r30 = r21
            if (r30 != 0) goto L_0x0185
            r30 = r10
            r31 = r11
            r32 = r13
            int r30 = com.google.android.gms.internal.auth.zzge.zza(r30, r31, r32)
            r11 = r30
            r30 = r14
            r31 = r9
            r32 = r24
            r34 = r13
            r0 = r34
            int r0 = r0.zza
            r34 = r0
            int r34 = com.google.android.gms.internal.auth.zzgu.zzb(r34)
            r30.putInt(r31, r32, r34)
            r30 = r16
            r31 = r27
            r30 = r30 | r31
            r16 = r30
            goto L_0x0043
        L_0x03e1:
            r30 = r21
            if (r30 != 0) goto L_0x0185
            r30 = r10
            r31 = r11
            r32 = r13
            int r30 = com.google.android.gms.internal.auth.zzge.zzb(r30, r31, r32)
            r11 = r30
            r30 = r14
            r31 = r9
            r32 = r24
            r34 = r13
            r0 = r34
            long r0 = r0.zzb
            r34 = r0
            long r34 = com.google.android.gms.internal.auth.zzgu.zza((long) r34)
            r30.putLong(r31, r32, r34)
            r30 = r16
            r31 = r27
            r30 = r30 | r31
            r16 = r30
            goto L_0x0043
        L_0x0410:
            r30 = r23
            r31 = 27
            r0 = r30
            r1 = r31
            if (r0 != r1) goto L_0x0482
            r30 = r21
            r31 = 2
            r0 = r30
            r1 = r31
            if (r0 != r1) goto L_0x00b3
            r30 = r14
            r31 = r9
            r32 = r24
            java.lang.Object r30 = r30.getObject(r31, r32)
            com.google.android.gms.internal.auth.zzht r30 = (com.google.android.gms.internal.auth.zzht) r30
            r45 = r30
            r30 = r45
            r31 = r45
            r26 = r31
            boolean r30 = r30.zza()
            if (r30 != 0) goto L_0x045f
            r30 = r26
            int r30 = r30.size()
            r27 = r30
            r30 = r26
            r31 = r27
            if (r31 != 0) goto L_0x047b
            r31 = 10
        L_0x044e:
            com.google.android.gms.internal.auth.zzht r30 = r30.zza(r31)
            r26 = r30
            r30 = r14
            r31 = r9
            r32 = r24
            r34 = r26
            r30.putObject(r31, r32, r34)
        L_0x045f:
            r30 = r8
            r31 = r19
            com.google.android.gms.internal.auth.zzji r30 = r30.zza((int) r31)
            r31 = r17
            r32 = r10
            r33 = r11
            r34 = r12
            r35 = r26
            r36 = r13
            int r30 = com.google.android.gms.internal.auth.zzge.zza(r30, r31, r32, r33, r34, r35, r36)
            r11 = r30
            goto L_0x0043
        L_0x047b:
            r31 = r27
            r32 = 1
            int r31 = r31 << 1
            goto L_0x044e
        L_0x0482:
            r30 = r23
            r31 = 49
            r0 = r30
            r1 = r31
            if (r0 > r1) goto L_0x04c5
            r30 = r11
            r26 = r30
            r30 = r8
            r31 = r9
            r32 = r10
            r33 = r11
            r34 = r12
            r35 = r17
            r36 = r20
            r37 = r21
            r38 = r19
            r39 = r22
            r0 = r39
            long r0 = (long) r0
            r39 = r0
            r41 = r23
            r42 = r24
            r44 = r13
            int r30 = r30.zza(r31, (byte[]) r32, (int) r33, (int) r34, (int) r35, (int) r36, (int) r37, (int) r38, (long) r39, (int) r41, (long) r42, (com.google.android.gms.internal.auth.zzgd) r44)
            r45 = r30
            r30 = r45
            r31 = r45
            r11 = r31
            r31 = r26
            r0 = r30
            r1 = r31
            if (r0 != r1) goto L_0x0043
            goto L_0x00b3
        L_0x04c5:
            r30 = r23
            r31 = 50
            r0 = r30
            r1 = r31
            if (r0 != r1) goto L_0x0503
            r30 = r21
            r31 = 2
            r0 = r30
            r1 = r31
            if (r0 != r1) goto L_0x00b3
            r30 = r11
            r26 = r30
            r30 = r8
            r31 = r9
            r32 = r10
            r33 = r11
            r34 = r12
            r35 = r19
            r36 = r24
            r38 = r13
            int r30 = r30.zza(r31, (byte[]) r32, (int) r33, (int) r34, (int) r35, (long) r36, (com.google.android.gms.internal.auth.zzgd) r38)
            r45 = r30
            r30 = r45
            r31 = r45
            r11 = r31
            r31 = r26
            r0 = r30
            r1 = r31
            if (r0 != r1) goto L_0x0043
            goto L_0x00b3
        L_0x0503:
            r30 = r11
            r26 = r30
            r30 = r8
            r31 = r9
            r32 = r10
            r33 = r11
            r34 = r12
            r35 = r17
            r36 = r20
            r37 = r21
            r38 = r22
            r39 = r23
            r40 = r24
            r42 = r19
            r43 = r13
            int r30 = r30.zza(r31, (byte[]) r32, (int) r33, (int) r34, (int) r35, (int) r36, (int) r37, (int) r38, (int) r39, (long) r40, (int) r42, (com.google.android.gms.internal.auth.zzgd) r43)
            r45 = r30
            r30 = r45
            r31 = r45
            r11 = r31
            r31 = r26
            r0 = r30
            r1 = r31
            if (r0 != r1) goto L_0x0043
            goto L_0x00b3
        L_0x0537:
            r30 = r15
            r31 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r30
            r1 = r31
            if (r0 == r1) goto L_0x0552
            r30 = r14
            r31 = r9
            r32 = r15
            r0 = r32
            long r0 = (long) r0
            r32 = r0
            r34 = r16
            r30.putInt(r31, r32, r34)
        L_0x0552:
            r30 = r11
            r31 = r12
            r0 = r30
            r1 = r31
            if (r0 == r1) goto L_0x0561
            com.google.android.gms.internal.auth.zzhs r30 = com.google.android.gms.internal.auth.zzhs.zze()
            throw r30
        L_0x0561:
            return
        L_0x0562:
            r30 = r2
            r31 = r3
            r32 = r4
            r33 = r5
            r34 = r6
            r35 = 0
            r36 = r7
            int r30 = r30.zza(r31, (byte[]) r32, (int) r33, (int) r34, (int) r35, (com.google.android.gms.internal.auth.zzgd) r36)
            goto L_0x0561
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zziw.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.auth.zzgd):void");
    }

    public final void zzc(T t) {
        T t2 = t;
        for (int i = this.zzm; i < this.zzn; i++) {
            long zzd2 = (long) (zzd(this.zzl[i]) & 1048575);
            Object zzf2 = zzkg.zzf(t2, zzd2);
            Object obj = zzf2;
            if (zzf2 != null) {
                zzkg.zza((Object) t2, zzd2, this.zzs.zze(obj));
            }
        }
        int length = this.zzl.length;
        for (int i2 = this.zzn; i2 < length; i2++) {
            this.zzp.zza(t2, (long) this.zzl[i2]);
        }
        this.zzq.zzb(t2);
        if (this.zzh) {
            this.zzr.zzc(t2);
        }
    }

    private final <K, V, UT, UB> UB zza(int i, int i2, Map<K, V> map, zzhq zzhq, UB ub, zzka<UT, UB> zzka) {
        Throwable th;
        int i3 = i2;
        zzhq zzhq2 = zzhq;
        UB ub2 = ub;
        zzka<UT, UB> zzka2 = zzka;
        zzin<?, ?> zzb2 = this.zzs.zzb(zzb(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (!zzhq2.zza(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = zzka2.zza();
                }
                zzgq zzc2 = zzgi.zzc(zzik.zza(zzb2, next.getKey(), next.getValue()));
                zzgq zzgq = zzc2;
                try {
                    zzik.zza(zzc2.zzb(), zzb2, next.getKey(), next.getValue());
                    zzka2.zza(ub2, i3, zzgq.zza());
                    it.remove();
                } catch (IOException e) {
                    IOException iOException = e;
                    Throwable th2 = th;
                    new RuntimeException(iOException);
                    throw th2;
                }
            }
        }
        return ub2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x016a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00d7 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzd(T r32) {
        /*
            r31 = this;
            r3 = r31
            r4 = r32
            r24 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r24
            r24 = 0
            r6 = r24
            r24 = 0
            r7 = r24
        L_0x0011:
            r24 = r7
            r25 = r3
            r0 = r25
            int r0 = r0.zzm
            r25 = r0
            r0 = r24
            r1 = r25
            if (r0 >= r1) goto L_0x0252
            r24 = r3
            r0 = r24
            int[] r0 = r0.zzl
            r24 = r0
            r25 = r7
            r24 = r24[r25]
            r8 = r24
            r24 = r3
            r25 = r8
            r15 = r25
            r0 = r24
            int[] r0 = r0.zzc
            r24 = r0
            r25 = r15
            r24 = r24[r25]
            r9 = r24
            r24 = r3
            r25 = r8
            int r24 = r24.zzd((int) r25)
            r10 = r24
            r24 = r3
            r0 = r24
            int[] r0 = r0.zzc
            r24 = r0
            r25 = r8
            r26 = 2
            int r25 = r25 + 2
            r24 = r24[r25]
            r30 = r24
            r24 = r30
            r25 = r30
            r11 = r25
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r24 = r24 & r25
            r12 = r24
            r24 = 1
            r25 = r11
            r26 = 20
            int r25 = r25 >>> 20
            int r24 = r24 << r25
            r13 = r24
            r24 = r12
            r25 = r5
            r0 = r24
            r1 = r25
            if (r0 == r1) goto L_0x00a4
            r24 = r12
            r30 = r24
            r24 = r30
            r25 = r30
            r5 = r25
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r24
            r1 = r25
            if (r0 == r1) goto L_0x00a4
            sun.misc.Unsafe r24 = zzb
            r25 = r4
            r26 = r12
            r0 = r26
            long r0 = (long) r0
            r26 = r0
            int r24 = r24.getInt(r25, r26)
            r6 = r24
        L_0x00a4:
            r24 = r10
            r25 = 268435456(0x10000000, float:2.5243549E-29)
            r24 = r24 & r25
            if (r24 == 0) goto L_0x00c7
            r24 = 1
        L_0x00ae:
            if (r24 == 0) goto L_0x00ca
            r24 = r3
            r25 = r4
            r26 = r8
            r27 = r5
            r28 = r6
            r29 = r13
            boolean r24 = r24.zza(r25, (int) r26, (int) r27, (int) r28, (int) r29)
            if (r24 != 0) goto L_0x00ca
            r24 = 0
            r3 = r24
        L_0x00c6:
            return r3
        L_0x00c7:
            r24 = 0
            goto L_0x00ae
        L_0x00ca:
            r24 = r10
            r25 = 267386880(0xff00000, float:2.3665827E-29)
            r24 = r24 & r25
            r25 = 20
            int r24 = r24 >>> 20
            switch(r24) {
                case 9: goto L_0x00db;
                case 17: goto L_0x00db;
                case 27: goto L_0x0104;
                case 49: goto L_0x0104;
                case 50: goto L_0x019c;
                case 60: goto L_0x0176;
                case 68: goto L_0x0176;
                default: goto L_0x00d7;
            }
        L_0x00d7:
            int r7 = r7 + 1
            goto L_0x0011
        L_0x00db:
            r24 = r3
            r25 = r4
            r26 = r8
            r27 = r5
            r28 = r6
            r29 = r13
            boolean r24 = r24.zza(r25, (int) r26, (int) r27, (int) r28, (int) r29)
            if (r24 == 0) goto L_0x00d7
            r24 = r4
            r25 = r10
            r26 = r3
            r27 = r8
            com.google.android.gms.internal.auth.zzji r26 = r26.zza((int) r27)
            boolean r24 = zza((java.lang.Object) r24, (int) r25, (com.google.android.gms.internal.auth.zzji) r26)
            if (r24 != 0) goto L_0x00d7
            r24 = 0
            r3 = r24
            goto L_0x00c6
        L_0x0104:
            r24 = r3
            r25 = r4
            r26 = r10
            r27 = r8
            r17 = r27
            r16 = r26
            r15 = r25
            r14 = r24
            r24 = r15
            r25 = r16
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r25 = r25 & r26
            r0 = r25
            long r0 = (long) r0
            r25 = r0
            java.lang.Object r24 = com.google.android.gms.internal.auth.zzkg.zzf(r24, r25)
            java.util.List r24 = (java.util.List) r24
            r30 = r24
            r24 = r30
            r25 = r30
            r18 = r25
            boolean r24 = r24.isEmpty()
            if (r24 != 0) goto L_0x0173
            r24 = r14
            r25 = r17
            com.google.android.gms.internal.auth.zzji r24 = r24.zza((int) r25)
            r19 = r24
            r24 = 0
            r20 = r24
        L_0x0144:
            r24 = r20
            r25 = r18
            int r25 = r25.size()
            r0 = r24
            r1 = r25
            if (r0 >= r1) goto L_0x0173
            r24 = r18
            r25 = r20
            java.lang.Object r24 = r24.get(r25)
            r21 = r24
            r24 = r19
            r25 = r21
            boolean r24 = r24.zzd(r25)
            if (r24 != 0) goto L_0x0170
            r24 = 0
        L_0x0168:
            if (r24 != 0) goto L_0x00d7
            r24 = 0
            r3 = r24
            goto L_0x00c6
        L_0x0170:
            int r20 = r20 + 1
            goto L_0x0144
        L_0x0173:
            r24 = 1
            goto L_0x0168
        L_0x0176:
            r24 = r3
            r25 = r4
            r26 = r9
            r27 = r8
            boolean r24 = r24.zza(r25, (int) r26, (int) r27)
            if (r24 == 0) goto L_0x00d7
            r24 = r4
            r25 = r10
            r26 = r3
            r27 = r8
            com.google.android.gms.internal.auth.zzji r26 = r26.zza((int) r27)
            boolean r24 = zza((java.lang.Object) r24, (int) r25, (com.google.android.gms.internal.auth.zzji) r26)
            if (r24 != 0) goto L_0x00d7
            r24 = 0
            r3 = r24
            goto L_0x00c6
        L_0x019c:
            r24 = r3
            r25 = r4
            r26 = r10
            r27 = r8
            r17 = r27
            r16 = r26
            r15 = r25
            r30 = r24
            r24 = r30
            r25 = r30
            r14 = r25
            r0 = r24
            com.google.android.gms.internal.auth.zzip r0 = r0.zzs
            r24 = r0
            r25 = r15
            r26 = r16
            r27 = 1048575(0xfffff, float:1.469367E-39)
            r26 = r26 & r27
            r0 = r26
            long r0 = (long) r0
            r26 = r0
            java.lang.Object r25 = com.google.android.gms.internal.auth.zzkg.zzf(r25, r26)
            java.util.Map r24 = r24.zzc(r25)
            r30 = r24
            r24 = r30
            r25 = r30
            r18 = r25
            boolean r24 = r24.isEmpty()
            if (r24 != 0) goto L_0x024f
            r24 = r14
            r25 = r17
            java.lang.Object r24 = r24.zzb((int) r25)
            r19 = r24
            r24 = r14
            r0 = r24
            com.google.android.gms.internal.auth.zzip r0 = r0.zzs
            r24 = r0
            r25 = r19
            com.google.android.gms.internal.auth.zzin r24 = r24.zzb(r25)
            r0 = r24
            com.google.android.gms.internal.auth.zzkr r0 = r0.zzc
            r24 = r0
            com.google.android.gms.internal.auth.zzku r24 = r24.zza()
            com.google.android.gms.internal.auth.zzku r25 = com.google.android.gms.internal.auth.zzku.zzi
            r0 = r24
            r1 = r25
            if (r0 != r1) goto L_0x024f
            r24 = 0
            r21 = r24
            r24 = r18
            java.util.Collection r24 = r24.values()
            java.util.Iterator r24 = r24.iterator()
            r22 = r24
        L_0x0216:
            r24 = r22
            boolean r24 = r24.hasNext()
            if (r24 == 0) goto L_0x024f
            r24 = r22
            java.lang.Object r24 = r24.next()
            r23 = r24
            r24 = r21
            if (r24 != 0) goto L_0x023a
            com.google.android.gms.internal.auth.zzjh r24 = com.google.android.gms.internal.auth.zzjh.zza()
            r25 = r23
            java.lang.Class r25 = r25.getClass()
            com.google.android.gms.internal.auth.zzji r24 = r24.zza(r25)
            r21 = r24
        L_0x023a:
            r24 = r21
            r25 = r23
            boolean r24 = r24.zzd(r25)
            if (r24 != 0) goto L_0x024e
            r24 = 0
        L_0x0246:
            if (r24 != 0) goto L_0x00d7
            r24 = 0
            r3 = r24
            goto L_0x00c6
        L_0x024e:
            goto L_0x0216
        L_0x024f:
            r24 = 1
            goto L_0x0246
        L_0x0252:
            r24 = r3
            r0 = r24
            boolean r0 = r0.zzh
            r24 = r0
            if (r24 == 0) goto L_0x0276
            r24 = r3
            r0 = r24
            com.google.android.gms.internal.auth.zzhd<?> r0 = r0.zzr
            r24 = r0
            r25 = r4
            com.google.android.gms.internal.auth.zzhe r24 = r24.zza((java.lang.Object) r25)
            boolean r24 = r24.zzf()
            if (r24 != 0) goto L_0x0276
            r24 = 0
            r3 = r24
            goto L_0x00c6
        L_0x0276:
            r24 = 1
            r3 = r24
            goto L_0x00c6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zziw.zzd(java.lang.Object):boolean");
    }

    private static boolean zza(Object obj, int i, zzji zzji) {
        return zzji.zzd(zzkg.zzf(obj, (long) (i & 1048575)));
    }

    private static void zza(int i, Object obj, zzkx zzkx) throws IOException {
        int i2 = i;
        Object obj2 = obj;
        zzkx zzkx2 = zzkx;
        if (obj2 instanceof String) {
            zzkx2.zza(i2, (String) obj2);
        } else {
            zzkx2.zza(i2, (zzgi) obj2);
        }
    }

    private final int zzd(int i) {
        return this.zzc[i + 1];
    }

    private final int zze(int i) {
        return this.zzc[i + 2];
    }

    private static <T> double zzb(T t, long j) {
        return ((Double) zzkg.zzf(t, j)).doubleValue();
    }

    private static <T> float zzc(T t, long j) {
        return ((Float) zzkg.zzf(t, j)).floatValue();
    }

    private static <T> int zzd(T t, long j) {
        return ((Integer) zzkg.zzf(t, j)).intValue();
    }

    private static <T> long zze(T t, long j) {
        return ((Long) zzkg.zzf(t, j)).longValue();
    }

    private static <T> boolean zzf(T t, long j) {
        return ((Boolean) zzkg.zzf(t, j)).booleanValue();
    }

    private final boolean zzc(T t, T t2, int i) {
        int i2 = i;
        return zza(t, i2) == zza(t2, i2);
    }

    private final boolean zza(T t, int i, int i2, int i3, int i4) {
        T t2 = t;
        int i5 = i;
        int i6 = i3;
        int i7 = i4;
        if (i2 == 1048575) {
            return zza(t2, i5);
        }
        return (i6 & i7) != 0;
    }

    private final boolean zza(T t, int i) {
        Throwable th;
        Throwable th2;
        T t2 = t;
        int i2 = i;
        int zze2 = zze(i2);
        int i3 = zze2;
        if (((long) (zze2 & 1048575)) == 1048575) {
            int zzd2 = zzd(i2);
            long j = (long) (zzd2 & 1048575);
            switch ((zzd2 & 267386880) >>> 20) {
                case 0:
                    if (zzkg.zze(t2, j) != 0.0d) {
                        return true;
                    }
                    return false;
                case 1:
                    return zzkg.zzd(t2, j) != 0.0f;
                case 2:
                    return zzkg.zzb(t2, j) != 0;
                case 3:
                    return zzkg.zzb(t2, j) != 0;
                case 4:
                    return zzkg.zza((Object) t2, j) != 0;
                case 5:
                    return zzkg.zzb(t2, j) != 0;
                case 6:
                    return zzkg.zza((Object) t2, j) != 0;
                case 7:
                    return zzkg.zzc(t2, j);
                case 8:
                    Object zzf2 = zzkg.zzf(t2, j);
                    Object obj = zzf2;
                    if (zzf2 instanceof String) {
                        return !((String) obj).isEmpty();
                    }
                    if (obj instanceof zzgi) {
                        return !zzgi.zza.equals(obj);
                    }
                    Throwable th3 = th;
                    new IllegalArgumentException();
                    throw th3;
                case ConnectionResult.SERVICE_INVALID:
                    return zzkg.zzf(t2, j) != null;
                case 10:
                    return !zzgi.zza.equals(zzkg.zzf(t2, j));
                case ConnectionResult.LICENSE_CHECK_FAILED:
                    return zzkg.zza((Object) t2, j) != 0;
                case 12:
                    return zzkg.zza((Object) t2, j) != 0;
                case 13:
                    return zzkg.zza((Object) t2, j) != 0;
                case 14:
                    return zzkg.zzb(t2, j) != 0;
                case 15:
                    return zzkg.zza((Object) t2, j) != 0;
                case 16:
                    return zzkg.zzb(t2, j) != 0;
                case 17:
                    return zzkg.zzf(t2, j) != null;
                default:
                    Throwable th4 = th2;
                    new IllegalArgumentException();
                    throw th4;
            }
        } else {
            return (zzkg.zza((Object) t2, (long) (i3 & 1048575)) & (1 << (i3 >>> 20))) != 0;
        }
    }

    private final void zzb(T t, int i) {
        T t2 = t;
        int zze2 = zze(i);
        int i2 = zze2;
        long j = (long) (zze2 & 1048575);
        long j2 = j;
        if (j != 1048575) {
            zzkg.zza((Object) t2, j2, zzkg.zza((Object) t2, j2) | (1 << (i2 >>> 20)));
        }
    }

    private final boolean zza(T t, int i, int i2) {
        return zzkg.zza((Object) t, (long) (zze(i2) & 1048575)) == i;
    }

    private final void zzb(T t, int i, int i2) {
        zzkg.zza((Object) t, (long) (zze(i2) & 1048575), i);
    }

    private final int zzf(int i) {
        int i2 = i;
        if (i2 < this.zze || i2 > this.zzf) {
            return -1;
        }
        return zzb(i2, 0);
    }

    private final int zza(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        if (i3 < this.zze || i3 > this.zzf) {
            return -1;
        }
        return zzb(i3, i4);
    }

    private final int zzb(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        int length = (this.zzc.length / 3) - 1;
        while (i4 <= length) {
            int i5 = (length + i4) >>> 1;
            int i6 = i5;
            int i7 = i5 * 3;
            int i8 = this.zzc[i7];
            if (i3 == i8) {
                return i7;
            }
            if (i3 < i8) {
                length = i6 - 1;
            } else {
                i4 = i6 + 1;
            }
        }
        return -1;
    }
}
