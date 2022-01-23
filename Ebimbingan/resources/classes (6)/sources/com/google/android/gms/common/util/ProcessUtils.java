package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import javax.annotation.Nullable;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class ProcessUtils {
    @Nullable
    private static String zza = null;
    private static int zzb = 0;

    private ProcessUtils() {
    }

    /* JADX WARNING: type inference failed for: r4v32, types: [java.io.BufferedReader] */
    /* JADX WARNING: Multi-variable type inference failed */
    @com.google.android.gms.common.annotation.KeepForSdk
    @androidx.annotation.RecentlyNullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getMyProcessName() {
        /*
            java.lang.String r4 = zza
            if (r4 != 0) goto L_0x0019
            int r4 = zzb
            if (r4 != 0) goto L_0x000e
            int r4 = android.os.Process.myPid()
            zzb = r4
        L_0x000e:
            int r4 = zzb
            r0 = r4
            r4 = r0
            if (r4 > 0) goto L_0x001d
            r4 = 0
            r0 = r4
        L_0x0016:
            r4 = r0
            zza = r4
        L_0x0019:
            java.lang.String r4 = zza
            r0 = r4
            return r0
        L_0x001d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0071, all -> 0x007b }
            r1 = r4
            r4 = r1
            r5 = 25
            r4.<init>(r5)     // Catch:{ IOException -> 0x0071, all -> 0x007b }
            r4 = r1
            java.lang.String r5 = "/proc/"
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch:{ IOException -> 0x0071, all -> 0x007b }
            r4 = r1
            r5 = r0
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch:{ IOException -> 0x0071, all -> 0x007b }
            r4 = r1
            java.lang.String r5 = "/cmdline"
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch:{ IOException -> 0x0071, all -> 0x007b }
            r4 = r1
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x0071, all -> 0x007b }
            r0 = r4
            android.os.StrictMode$ThreadPolicy r4 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ IOException -> 0x0071, all -> 0x007b }
            r1 = r4
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ all -> 0x0085 }
            r2 = r4
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ all -> 0x0085 }
            r3 = r4
            r4 = r3
            r5 = r0
            r4.<init>(r5)     // Catch:{ all -> 0x0085 }
            r4 = r2
            r5 = r3
            r4.<init>(r5)     // Catch:{ all -> 0x0085 }
            r4 = r1
            android.os.StrictMode.setThreadPolicy(r4)     // Catch:{ IOException -> 0x0071, all -> 0x007b }
            r4 = r2
            java.lang.String r4 = r4.readLine()     // Catch:{ IOException -> 0x008d, all -> 0x0091 }
            r0 = r4
            r4 = r0
            java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)     // Catch:{ IOException -> 0x008d, all -> 0x0091 }
            r4 = r0
            java.lang.String r4 = r4.trim()     // Catch:{ IOException -> 0x008d, all -> 0x0091 }
            r0 = r4
            r4 = r2
            com.google.android.gms.common.util.IOUtils.closeQuietly((java.io.Closeable) r4)
            goto L_0x0016
        L_0x0071:
            r4 = move-exception
            r4 = 0
            r0 = r4
        L_0x0074:
            r4 = r0
            com.google.android.gms.common.util.IOUtils.closeQuietly((java.io.Closeable) r4)
            r4 = 0
            r0 = r4
            goto L_0x0016
        L_0x007b:
            r4 = move-exception
            r0 = r4
            r4 = 0
            r1 = r4
        L_0x007f:
            r4 = r1
            com.google.android.gms.common.util.IOUtils.closeQuietly((java.io.Closeable) r4)
            r4 = r0
            throw r4
        L_0x0085:
            r4 = move-exception
            r0 = r4
            r4 = r1
            android.os.StrictMode.setThreadPolicy(r4)     // Catch:{ IOException -> 0x0071, all -> 0x007b }
            r4 = r0
            throw r4     // Catch:{ IOException -> 0x0071, all -> 0x007b }
        L_0x008d:
            r4 = move-exception
            r4 = r2
            r0 = r4
            goto L_0x0074
        L_0x0091:
            r4 = move-exception
            r0 = r4
            r4 = r2
            r1 = r4
            goto L_0x007f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.ProcessUtils.getMyProcessName():java.lang.String");
    }
}
