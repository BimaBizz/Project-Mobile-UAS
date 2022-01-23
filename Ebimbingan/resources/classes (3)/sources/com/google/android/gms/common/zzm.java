package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzad;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.concurrent.Callable;
import javax.annotation.CheckReturnValue;

@CheckReturnValue
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
final class zzm {
    static final zzk zza;
    static final zzk zzb;
    static final zzk zzc;
    static final zzk zzd;
    private static volatile zzae zze;
    private static final Object zzf;
    private static Context zzg;

    static {
        zzk zzk;
        zzk zzk2;
        zzk zzk3;
        zzk zzk4;
        Object obj;
        new zze(zzi.zzf("0\u0005È0\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010e\bsù/Qí"));
        zza = zzk;
        new zzf(zzi.zzf("0\u0006\u00040\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²­×árÊkì"));
        zzb = zzk2;
        new zzg(zzi.zzf("0\u0004C0\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000ÂàFdJ00"));
        zzc = zzk3;
        new zzh(zzi.zzf("0\u0004¨0\u0003 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ¸l}ÓNõ0"));
        zzd = zzk4;
        new Object();
        zzf = obj;
    }

    static synchronized void zza(Context context) {
        Context context2 = context;
        synchronized (zzm.class) {
            if (zzg != null) {
                int w = Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context2 != null) {
                zzg = context2.getApplicationContext();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [com.google.android.gms.dynamic.IObjectWrapper, android.os.IBinder] */
    static zzw zzb(String str, boolean z, boolean z2, boolean z3) {
        String str2;
        String str3;
        zzw zze2;
        zzn zzn;
        Throwable th;
        String str4 = str;
        boolean z4 = z;
        boolean z5 = z2;
        boolean z6 = z3;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Object checkNotNull = Preconditions.checkNotNull(zzg);
            zzf();
            new zzn(str4, z4, false, ObjectWrapper.wrap(zzg), false);
            try {
                zzq zzf2 = zze.zzf(zzn);
                if (zzf2.zza()) {
                    zze2 = zzw.zzb();
                } else {
                    String zzb2 = zzf2.zzb();
                    String str5 = "error checking package certificate";
                    if (zzb2 == null) {
                        zzb2 = str5;
                    }
                    if (zzf2.zzc() == 4) {
                        new PackageManager.NameNotFoundException();
                        zze2 = zzw.zze(zzb2, th);
                    } else {
                        zze2 = zzw.zzd(zzb2);
                    }
                }
            } catch (RemoteException e) {
                RemoteException remoteException = e;
                int e2 = Log.e("GoogleCertificates", "Failed to get Google certificates from remote", remoteException);
                zze2 = zzw.zze("module call", remoteException);
            }
        } catch (DynamiteModule.LoadingException e3) {
            DynamiteModule.LoadingException loadingException = e3;
            int e4 = Log.e("GoogleCertificates", "Failed to get Google certificates from remote", loadingException);
            String str6 = "module init: ";
            String valueOf = String.valueOf(loadingException.getMessage());
            if (valueOf.length() != 0) {
                str3 = str6.concat(valueOf);
            } else {
                new String(str6);
                str3 = str2;
            }
            zze2 = zzw.zze(str3, loadingException);
        } catch (Throwable th2) {
            Throwable th3 = th2;
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th3;
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return zze2;
    }

    /* JADX INFO: finally extract failed */
    static zzw zzc(String str, zzi zzi, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            zzw zzg2 = zzg(str, zzi, z, z2);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return zzg2;
        } catch (Throwable th) {
            Throwable th2 = th;
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th2;
        }
    }

    static boolean zzd() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            zzf();
            boolean zzg2 = zze.zzg();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return zzg2;
        } catch (RemoteException | DynamiteModule.LoadingException e) {
            int e2 = Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return false;
        } catch (Throwable th) {
            Throwable th2 = th;
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th2;
        }
    }

    static final /* synthetic */ String zze(boolean z, String str, zzi zzi) throws Exception {
        boolean z2 = z;
        String str2 = str;
        zzi zzi2 = zzi;
        return zzw.zzg(str2, zzi2, z2, !z2 ? zzg(str2, zzi2, true, false).zza : false);
    }

    private static zzw zzg(String str, zzi zzi, boolean z, boolean z2) {
        String str2;
        zzs zzs;
        Callable callable;
        String str3 = str;
        zzi zzi2 = zzi;
        boolean z3 = z;
        boolean z4 = z2;
        try {
            zzf();
            Object checkNotNull = Preconditions.checkNotNull(zzg);
            new zzs(str3, zzi2, z3, z4);
            try {
                if (zze.zze(zzs, ObjectWrapper.wrap(zzg.getPackageManager()))) {
                    return zzw.zzb();
                }
                new zzd(z3, str3, zzi2);
                return zzw.zzc(callable);
            } catch (RemoteException e) {
                RemoteException remoteException = e;
                int e2 = Log.e("GoogleCertificates", "Failed to get Google certificates from remote", remoteException);
                return zzw.zze("module call", remoteException);
            }
        } catch (DynamiteModule.LoadingException e3) {
            DynamiteModule.LoadingException loadingException = e3;
            int e4 = Log.e("GoogleCertificates", "Failed to get Google certificates from remote", loadingException);
            String valueOf = String.valueOf(loadingException.getMessage());
            String str4 = "module init: ";
            if (valueOf.length() != 0) {
                str2 = str4.concat(valueOf);
            } else {
                new String(str4);
            }
            return zzw.zze(str2, loadingException);
        }
    }

    /* JADX INFO: finally extract failed */
    private static void zzf() throws DynamiteModule.LoadingException {
        if (zze == null) {
            Object checkNotNull = Preconditions.checkNotNull(zzg);
            Object obj = zzf;
            synchronized (obj) {
                try {
                    if (zze == null) {
                        zze = zzad.zzb(DynamiteModule.load(zzg, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, "com.google.android.gms.googlecertificates").instantiate("com.google.android.gms.common.GoogleCertificatesImpl"));
                    }
                } catch (Throwable th) {
                    Throwable th2 = th;
                    Object obj2 = obj;
                    throw th2;
                }
            }
        }
    }
}
