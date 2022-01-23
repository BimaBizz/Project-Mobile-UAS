package com.google.android.gms.common.internal;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.ConcurrentHashMap;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class LibraryVersion {
    private static final GmsLogger zza;
    private static LibraryVersion zzb;
    private ConcurrentHashMap<String, String> zzc;

    static {
        GmsLogger gmsLogger;
        LibraryVersion libraryVersion;
        new GmsLogger("LibraryVersion", "");
        zza = gmsLogger;
        new LibraryVersion();
        zzb = libraryVersion;
    }

    /* JADX WARNING: Multi-variable type inference failed */
    @com.google.android.gms.common.util.VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected LibraryVersion() {
        /*
            r4 = this;
            r0 = r4
            r2 = r0
            r2.<init>()
            java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap
            r1 = r2
            r2 = r1
            r2.<init>()
            r2 = r0
            r3 = r1
            r2.zzc = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.LibraryVersion.<init>():void");
    }

    @RecentlyNonNull
    @KeepForSdk
    public static LibraryVersion getInstance() {
        return zzb;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x013b, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x013c, code lost:
        r2 = r10;
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0140, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0141, code lost:
        r0 = r10;
        r1 = r4;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0115 A[Catch:{ all -> 0x0148 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0140 A[ExcHandler: all (r10v48 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:9:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x014d A[SYNTHETIC, Splitter:B:54:0x014d] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0158  */
    @androidx.annotation.RecentlyNonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getVersion(@androidx.annotation.RecentlyNonNull java.lang.String r15) {
        /*
            r14 = this;
            r0 = r14
            r1 = r15
            r10 = r1
            java.lang.String r11 = "Please provide a valid libraryName"
            java.lang.String r10 = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r10, r11)
            r10 = r0
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r10 = r10.zzc
            r11 = r1
            boolean r10 = r10.containsKey(r11)
            if (r10 == 0) goto L_0x0020
            r10 = r0
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r10 = r10.zzc
            r11 = r1
            java.lang.Object r10 = r10.get(r11)
            java.lang.String r10 = (java.lang.String) r10
            r0 = r10
        L_0x001f:
            return r0
        L_0x0020:
            java.util.Properties r10 = new java.util.Properties
            r2 = r10
            r10 = r2
            r10.<init>()
            r10 = 1
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ IOException -> 0x00f5, all -> 0x012e }
            r3 = r10
            r10 = r3
            r11 = 0
            r12 = r1
            r10[r11] = r12     // Catch:{ IOException -> 0x00f5, all -> 0x012e }
            java.lang.Class<com.google.android.gms.common.internal.LibraryVersion> r10 = com.google.android.gms.common.internal.LibraryVersion.class
            java.lang.String r11 = "/%s.properties"
            r12 = r3
            java.lang.String r11 = java.lang.String.format(r11, r12)     // Catch:{ IOException -> 0x00f5, all -> 0x012e }
            java.io.InputStream r10 = r10.getResourceAsStream(r11)     // Catch:{ IOException -> 0x00f5, all -> 0x012e }
            r4 = r10
            r10 = r4
            if (r10 == 0) goto L_0x00c0
            r10 = r2
            r11 = r4
            r10.load(r11)     // Catch:{ IOException -> 0x013b, all -> 0x0140 }
            r10 = r2
            java.lang.String r11 = "version"
            r12 = 0
            java.lang.String r10 = r10.getProperty(r11, r12)     // Catch:{ IOException -> 0x013b, all -> 0x0140 }
            r3 = r10
            com.google.android.gms.common.internal.GmsLogger r10 = zza     // Catch:{ IOException -> 0x0145, all -> 0x0140 }
            r2 = r10
            java.lang.String r10 = "LibraryVersion"
            r5 = r10
            r10 = r1
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ IOException -> 0x0145, all -> 0x0140 }
            int r10 = r10.length()     // Catch:{ IOException -> 0x0145, all -> 0x0140 }
            r6 = r10
            int r6 = r6 + 12
            r10 = r3
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ IOException -> 0x0145, all -> 0x0140 }
            int r10 = r10.length()     // Catch:{ IOException -> 0x0145, all -> 0x0140 }
            r7 = r10
            r10 = r6
            r11 = r7
            int r10 = r10 + r11
            r6 = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0145, all -> 0x0140 }
            r7 = r10
            r10 = r7
            r11 = r6
            r10.<init>(r11)     // Catch:{ IOException -> 0x0145, all -> 0x0140 }
            r10 = r7
            r11 = r1
            java.lang.StringBuilder r10 = r10.append(r11)     // Catch:{ IOException -> 0x0145, all -> 0x0140 }
            r10 = r7
            java.lang.String r11 = " version is "
            java.lang.StringBuilder r10 = r10.append(r11)     // Catch:{ IOException -> 0x0145, all -> 0x0140 }
            r10 = r7
            r11 = r3
            java.lang.StringBuilder r10 = r10.append(r11)     // Catch:{ IOException -> 0x0145, all -> 0x0140 }
            r10 = r2
            r11 = r5
            r12 = r7
            java.lang.String r12 = r12.toString()     // Catch:{ IOException -> 0x0145, all -> 0x0140 }
            r10.v(r11, r12)     // Catch:{ IOException -> 0x0145, all -> 0x0140 }
            r10 = r3
            r2 = r10
        L_0x009a:
            r10 = r4
            if (r10 == 0) goto L_0x00a1
            r10 = r4
            com.google.android.gms.common.util.IOUtils.closeQuietly((java.io.Closeable) r10)
        L_0x00a1:
            r10 = r2
            if (r10 != 0) goto L_0x00b3
            com.google.android.gms.common.internal.GmsLogger r10 = zza
            java.lang.String r11 = "LibraryVersion"
            java.lang.String r12 = ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used"
            r10.d(r11, r12)
            java.lang.String r10 = "UNKNOWN"
            r2 = r10
        L_0x00b3:
            r10 = r0
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r10 = r10.zzc
            r11 = r1
            r12 = r2
            java.lang.Object r10 = r10.put(r11, r12)
            r10 = r2
            r0 = r10
            goto L_0x001f
        L_0x00c0:
            com.google.android.gms.common.internal.GmsLogger r10 = zza     // Catch:{ IOException -> 0x013b, all -> 0x0140 }
            r3 = r10
            java.lang.String r10 = "LibraryVersion"
            r5 = r10
            java.lang.String r10 = "Failed to get app version for libraryName: "
            r2 = r10
            r10 = r1
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ IOException -> 0x013b, all -> 0x0140 }
            r6 = r10
            r10 = r6
            int r10 = r10.length()     // Catch:{ IOException -> 0x013b, all -> 0x0140 }
            r7 = r10
            r10 = r7
            if (r10 == 0) goto L_0x00ea
            r10 = r2
            r11 = r6
            java.lang.String r10 = r10.concat(r11)     // Catch:{ IOException -> 0x013b, all -> 0x0140 }
            r2 = r10
        L_0x00e1:
            r10 = r3
            r11 = r5
            r12 = r2
            r10.w(r11, r12)     // Catch:{ IOException -> 0x013b, all -> 0x0140 }
            r10 = 0
            r2 = r10
            goto L_0x009a
        L_0x00ea:
            java.lang.String r10 = new java.lang.String     // Catch:{ IOException -> 0x013b, all -> 0x0140 }
            r6 = r10
            r10 = r6
            r11 = r2
            r10.<init>(r11)     // Catch:{ IOException -> 0x013b, all -> 0x0140 }
            r10 = r6
            r2 = r10
            goto L_0x00e1
        L_0x00f5:
            r10 = move-exception
            r2 = r10
            r10 = 0
            r3 = r10
            r10 = 0
            r4 = r10
        L_0x00fb:
            com.google.android.gms.common.internal.GmsLogger r10 = zza     // Catch:{ all -> 0x0148 }
            r6 = r10
            java.lang.String r10 = "LibraryVersion"
            r7 = r10
            java.lang.String r10 = "Failed to get app version for libraryName: "
            r5 = r10
            r10 = r1
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0148 }
            r8 = r10
            r10 = r8
            int r10 = r10.length()     // Catch:{ all -> 0x0148 }
            r9 = r10
            r10 = r9
            if (r10 == 0) goto L_0x014d
            r10 = r5
            r11 = r8
            java.lang.String r10 = r10.concat(r11)     // Catch:{ all -> 0x0148 }
            r5 = r10
        L_0x011c:
            r10 = r6
            r11 = r7
            r12 = r5
            r13 = r2
            r10.e(r11, r12, r13)     // Catch:{ all -> 0x0148 }
            r10 = r4
            if (r10 == 0) goto L_0x0158
            r10 = r4
            com.google.android.gms.common.util.IOUtils.closeQuietly((java.io.Closeable) r10)
            r10 = r3
            r2 = r10
            goto L_0x00a1
        L_0x012e:
            r10 = move-exception
            r0 = r10
            r10 = 0
            r1 = r10
        L_0x0132:
            r10 = r1
            if (r10 == 0) goto L_0x0139
            r10 = r1
            com.google.android.gms.common.util.IOUtils.closeQuietly((java.io.Closeable) r10)
        L_0x0139:
            r10 = r0
            throw r10
        L_0x013b:
            r10 = move-exception
            r2 = r10
            r10 = 0
            r3 = r10
            goto L_0x00fb
        L_0x0140:
            r10 = move-exception
            r0 = r10
            r10 = r4
            r1 = r10
            goto L_0x0132
        L_0x0145:
            r10 = move-exception
            r2 = r10
            goto L_0x00fb
        L_0x0148:
            r10 = move-exception
            r0 = r10
            r10 = r4
            r1 = r10
            goto L_0x0132
        L_0x014d:
            java.lang.String r10 = new java.lang.String     // Catch:{ all -> 0x0148 }
            r8 = r10
            r10 = r8
            r11 = r5
            r10.<init>(r11)     // Catch:{ all -> 0x0148 }
            r10 = r8
            r5 = r10
            goto L_0x011c
        L_0x0158:
            r10 = r3
            r2 = r10
            goto L_0x00a1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.LibraryVersion.getVersion(java.lang.String):java.lang.String");
    }
}
