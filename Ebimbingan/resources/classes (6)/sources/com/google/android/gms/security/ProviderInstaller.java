package com.google.android.gms.security;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class ProviderInstaller {
    @RecentlyNonNull
    public static final String PROVIDER_NAME = "GmsCore_OpenSSL";
    /* access modifiers changed from: private */
    public static final GoogleApiAvailabilityLight zza = GoogleApiAvailabilityLight.getInstance();
    private static final Object zzb;
    @GuardedBy("ProviderInstaller.lock")
    private static Method zzc = null;
    @GuardedBy("ProviderInstaller.lock")
    private static Method zzd = null;

    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public interface ProviderInstallListener {
        void onProviderInstallFailed(int i, @Nullable Intent intent);

        void onProviderInstalled();
    }

    static {
        Object obj;
        new Object();
        zzb = obj;
    }

    public ProviderInstaller() {
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void installIfNeeded(@androidx.annotation.RecentlyNonNull android.content.Context r16) throws com.google.android.gms.common.GooglePlayServicesRepairableException, com.google.android.gms.common.GooglePlayServicesNotAvailableException {
        /*
            r1 = r16
            r12 = r1
            java.lang.String r13 = "Context must not be null"
            java.lang.Object r12 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r12, r13)
            com.google.android.gms.common.GoogleApiAvailabilityLight r12 = zza
            r13 = r1
            r14 = 11925000(0xb5f608, float:1.6710484E-38)
            r12.verifyGooglePlayServicesIsAvailable(r13, r14)
            java.lang.Object r12 = zzb
            r3 = r12
            r12 = r3
            monitor-enter(r12)
            long r12 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x00a7 }
            r4 = r12
            r12 = r1
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy r13 = com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING     // Catch:{ LoadingException -> 0x00ad }
            java.lang.String r14 = "com.google.android.gms.providerinstaller.dynamite"
            com.google.android.gms.dynamite.DynamiteModule r12 = com.google.android.gms.dynamite.DynamiteModule.load(r12, r13, r14)     // Catch:{ LoadingException -> 0x00ad }
            r2 = r12
            r12 = r2
            android.content.Context r12 = r12.getModuleContext()     // Catch:{ LoadingException -> 0x00ad }
            r2 = r12
        L_0x002e:
            r12 = r2
            if (r12 != 0) goto L_0x009c
            long r12 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x00a7 }
            r6 = r12
            r12 = r1
            android.content.Context r12 = com.google.android.gms.common.GooglePlayServicesUtilLight.getRemoteContext(r12)     // Catch:{ all -> 0x00a7 }
            r8 = r12
            r12 = r8
            if (r12 == 0) goto L_0x008e
            java.lang.reflect.Method r12 = zzd     // Catch:{ Exception -> 0x00db }
            r2 = r12
            r12 = r2
            if (r12 != 0) goto L_0x0069
            r12 = 3
            java.lang.Class[] r12 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x00db }
            r2 = r12
            r12 = r2
            r13 = 0
            java.lang.Class<android.content.Context> r14 = android.content.Context.class
            r12[r13] = r14     // Catch:{ Exception -> 0x00db }
            r12 = r2
            r13 = 1
            java.lang.Class r14 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x00db }
            r12[r13] = r14     // Catch:{ Exception -> 0x00db }
            r12 = r2
            r13 = 2
            java.lang.Class r14 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x00db }
            r12[r13] = r14     // Catch:{ Exception -> 0x00db }
            r12 = r8
            java.lang.String r13 = "com.google.android.gms.common.security.ProviderInstallerImpl"
            java.lang.String r14 = "reportRequestStats"
            r15 = r2
            java.lang.reflect.Method r12 = zzc(r12, r13, r14, r15)     // Catch:{ Exception -> 0x00db }
            zzd = r12     // Catch:{ Exception -> 0x00db }
        L_0x0069:
            java.lang.reflect.Method r12 = zzd     // Catch:{ Exception -> 0x00db }
            r2 = r12
            r12 = 3
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x00db }
            r9 = r12
            r12 = r9
            r13 = 0
            r14 = r1
            r12[r13] = r14     // Catch:{ Exception -> 0x00db }
            r12 = r9
            r13 = 1
            r14 = r4
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x00db }
            r12[r13] = r14     // Catch:{ Exception -> 0x00db }
            r12 = r9
            r13 = 2
            r14 = r6
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x00db }
            r12[r13] = r14     // Catch:{ Exception -> 0x00db }
            r12 = r2
            r13 = 0
            r14 = r9
            java.lang.Object r12 = r12.invoke(r13, r14)     // Catch:{ Exception -> 0x00db }
        L_0x008e:
            r12 = r8
            if (r12 == 0) goto L_0x0106
            r12 = r8
            r13 = r1
            java.lang.String r14 = "com.google.android.gms.common.security.ProviderInstallerImpl"
            zzb(r12, r13, r14)     // Catch:{ all -> 0x00a7 }
            r12 = r3
            monitor-exit(r12)     // Catch:{ all -> 0x00a7 }
        L_0x009b:
            return
        L_0x009c:
            r12 = r2
            r13 = r1
            java.lang.String r14 = "com.google.android.gms.providerinstaller.ProviderInstallerImpl"
            zzb(r12, r13, r14)     // Catch:{ all -> 0x00a7 }
            r12 = r3
            monitor-exit(r12)     // Catch:{ all -> 0x00a7 }
            goto L_0x009b
        L_0x00a7:
            r12 = move-exception
            r1 = r12
            r12 = r3
            monitor-exit(r12)     // Catch:{ all -> 0x00a7 }
            r12 = r1
            throw r12
        L_0x00ad:
            r12 = move-exception
            r2 = r12
            java.lang.String r12 = "ProviderInstaller"
            r8 = r12
            java.lang.String r12 = "Failed to load providerinstaller module: "
            r9 = r12
            r12 = r2
            java.lang.String r12 = r12.getMessage()     // Catch:{ all -> 0x00a7 }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x00a7 }
            r2 = r12
            r12 = r2
            int r12 = r12.length()     // Catch:{ all -> 0x00a7 }
            r10 = r12
            r12 = r10
            if (r12 == 0) goto L_0x011b
            r12 = r9
            r13 = r2
            java.lang.String r12 = r12.concat(r13)     // Catch:{ all -> 0x00a7 }
            r2 = r12
        L_0x00d1:
            r12 = r8
            r13 = r2
            int r12 = android.util.Log.w(r12, r13)     // Catch:{ all -> 0x00a7 }
            r12 = 0
            r2 = r12
            goto L_0x002e
        L_0x00db:
            r12 = move-exception
            r2 = r12
            java.lang.String r12 = "ProviderInstaller"
            r9 = r12
            java.lang.String r12 = "Failed to report request stats: "
            r10 = r12
            r12 = r2
            java.lang.String r12 = r12.getMessage()     // Catch:{ all -> 0x00a7 }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x00a7 }
            r2 = r12
            r12 = r2
            int r12 = r12.length()     // Catch:{ all -> 0x00a7 }
            r11 = r12
            r12 = r11
            if (r12 == 0) goto L_0x0124
            r12 = r10
            r13 = r2
            java.lang.String r12 = r12.concat(r13)     // Catch:{ all -> 0x00a7 }
            r2 = r12
        L_0x00ff:
            r12 = r9
            r13 = r2
            int r12 = android.util.Log.w(r12, r13)     // Catch:{ all -> 0x00a7 }
            goto L_0x008e
        L_0x0106:
            java.lang.String r12 = "ProviderInstaller"
            java.lang.String r13 = "Failed to get remote context"
            int r12 = android.util.Log.e(r12, r13)     // Catch:{ all -> 0x00a7 }
            com.google.android.gms.common.GooglePlayServicesNotAvailableException r12 = new com.google.android.gms.common.GooglePlayServicesNotAvailableException     // Catch:{ all -> 0x00a7 }
            r1 = r12
            r12 = r1
            r13 = 8
            r12.<init>(r13)     // Catch:{ all -> 0x00a7 }
            r12 = r1
            throw r12     // Catch:{ all -> 0x00a7 }
        L_0x011b:
            java.lang.String r12 = new java.lang.String     // Catch:{ all -> 0x00a7 }
            r2 = r12
            r12 = r2
            r13 = r9
            r12.<init>(r13)     // Catch:{ all -> 0x00a7 }
            goto L_0x00d1
        L_0x0124:
            java.lang.String r12 = new java.lang.String     // Catch:{ all -> 0x00a7 }
            r2 = r12
            r12 = r2
            r13 = r10
            r12.<init>(r13)     // Catch:{ all -> 0x00a7 }
            goto L_0x00ff
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.security.ProviderInstaller.installIfNeeded(android.content.Context):void");
    }

    public static void installIfNeededAsync(@RecentlyNonNull Context context, @RecentlyNonNull ProviderInstallListener providerInstallListener) {
        AsyncTask asyncTask;
        Context context2 = context;
        ProviderInstallListener providerInstallListener2 = providerInstallListener;
        Object checkNotNull = Preconditions.checkNotNull(context2, "Context must not be null");
        Object checkNotNull2 = Preconditions.checkNotNull(providerInstallListener2, "Listener must not be null");
        Preconditions.checkMainThread("Must be called on the UI thread");
        new zza(context2, providerInstallListener2);
        AsyncTask execute = asyncTask.execute(new Void[0]);
    }

    @GuardedBy("ProviderInstaller.lock")
    private static void zzb(Context context, Context context2, String str) throws GooglePlayServicesNotAvailableException {
        Throwable th;
        String str2;
        Context context3 = context;
        Context context4 = context2;
        String str3 = str;
        try {
            if (zzc == null) {
                zzc = zzc(context3, str3, "insertProvider", new Class[]{Context.class});
            }
            Object invoke = zzc.invoke((Object) null, new Object[]{context3});
        } catch (Exception e) {
            Exception exc = e;
            Throwable cause = exc.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                String valueOf = String.valueOf(cause == null ? exc.getMessage() : cause.getMessage());
                String str4 = "Failed to install provider: ";
                if (valueOf.length() != 0) {
                    str2 = str4.concat(valueOf);
                } else {
                    new String(str4);
                }
                int e2 = Log.e("ProviderInstaller", str2);
            }
            new GooglePlayServicesNotAvailableException(8);
            throw th;
        }
    }

    private static Method zzc(Context context, String str, String str2, Class[] clsArr) throws ClassNotFoundException, NoSuchMethodException {
        return context.getClassLoader().loadClass(str).getMethod(str2, clsArr);
    }
}
