package com.google.android.gms.common.internal;

import android.content.Context;
import androidx.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.internal.zzaf */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0517zzaf {
    private static final Object zza;
    @GuardedBy("sLock")
    private static boolean zzb;
    @Nullable
    private static String zzc;
    private static int zzd;

    static {
        Object obj;
        new Object();
        zza = obj;
    }

    @Nullable
    public static String zza(Context context) {
        zzc(context);
        return zzc;
    }

    public static int zzb(Context context) {
        zzc(context);
        return zzd;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void zzc(android.content.Context r6) {
        /*
            r0 = r6
            java.lang.Object r3 = zza
            r1 = r3
            r3 = r1
            monitor-enter(r3)
            boolean r3 = zzb     // Catch:{ all -> 0x0046 }
            r2 = r3
            r3 = r2
            if (r3 == 0) goto L_0x000f
            r3 = r1
            monitor-exit(r3)     // Catch:{ all -> 0x0046 }
        L_0x000e:
            return
        L_0x000f:
            r3 = 1
            zzb = r3     // Catch:{ all -> 0x0046 }
            r3 = r0
            java.lang.String r3 = r3.getPackageName()     // Catch:{ all -> 0x0046 }
            r2 = r3
            r3 = r0
            com.google.android.gms.common.wrappers.PackageManagerWrapper r3 = com.google.android.gms.common.wrappers.C0628Wrappers.packageManager(r3)     // Catch:{ all -> 0x0046 }
            r0 = r3
            r3 = r0
            r4 = r2
            r5 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo(r4, r5)     // Catch:{ NameNotFoundException -> 0x004c }
            android.os.Bundle r3 = r3.metaData     // Catch:{ NameNotFoundException -> 0x004c }
            r0 = r3
            r3 = r0
            if (r3 != 0) goto L_0x002f
            r3 = r1
            monitor-exit(r3)     // Catch:{ all -> 0x0046 }
            goto L_0x000e
        L_0x002f:
            r3 = r0
            java.lang.String r4 = "com.google.app.id"
            java.lang.String r3 = r3.getString(r4)     // Catch:{ NameNotFoundException -> 0x004c }
            zzc = r3     // Catch:{ NameNotFoundException -> 0x004c }
            r3 = r0
            java.lang.String r4 = "com.google.android.gms.version"
            int r3 = r3.getInt(r4)     // Catch:{ NameNotFoundException -> 0x004c }
            zzd = r3     // Catch:{ NameNotFoundException -> 0x004c }
        L_0x0043:
            r3 = r1
            monitor-exit(r3)     // Catch:{ all -> 0x0046 }
            goto L_0x000e
        L_0x0046:
            r3 = move-exception
            r0 = r3
            r3 = r1
            monitor-exit(r3)     // Catch:{ all -> 0x0046 }
            r3 = r0
            throw r3
        L_0x004c:
            r3 = move-exception
            r0 = r3
            java.lang.String r3 = "MetadataValueReader"
            java.lang.String r4 = "This should never happen."
            r5 = r0
            int r3 = android.util.Log.wtf(r3, r4, r5)     // Catch:{ all -> 0x0046 }
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C0517zzaf.zzc(android.content.Context):void");
    }
}
