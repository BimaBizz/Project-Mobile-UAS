package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.C0515zzad;
import com.google.android.gms.common.internal.C0516zzae;
import com.google.android.gms.dynamic.C0663ObjectWrapper;
import com.google.android.gms.dynamite.C0677DynamiteModule;
import java.util.concurrent.Callable;
import javax.annotation.CheckReturnValue;

@CheckReturnValue
/* renamed from: com.google.android.gms.common.zzm */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
final class C0644zzm {
    static final C0642zzk zza;
    static final C0642zzk zzb;
    static final C0642zzk zzc;
    static final C0642zzk zzd;
    private static volatile C0516zzae zze;
    private static final Object zzf;
    private static Context zzg;

    static {
        C0642zzk zzk;
        C0642zzk zzk2;
        C0642zzk zzk3;
        C0642zzk zzk4;
        Object obj;
        new C0636zze(C0640zzi.zzf("0\u0005È0\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010e\bsù/Qí"));
        zza = zzk;
        new C0637zzf(C0640zzi.zzf("0\u0006\u00040\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²­×árÊkì"));
        zzb = zzk2;
        new C0638zzg(C0640zzi.zzf("0\u0004C0\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000ÂàFdJ00"));
        zzc = zzk3;
        new C0639zzh(C0640zzi.zzf("0\u0004¨0\u0003 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ¸l}ÓNõ0"));
        zzd = zzk4;
        new Object();
        zzf = obj;
    }

    static synchronized void zza(Context context) {
        Context context2 = context;
        synchronized (C0644zzm.class) {
            if (zzg != null) {
                int w = Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context2 != null) {
                zzg = context2.getApplicationContext();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [com.google.android.gms.dynamic.IObjectWrapper, android.os.IBinder] */
    static C0654zzw zzb(String str, boolean z, boolean z2, boolean z3) {
        String str2;
        String str3;
        C0654zzw zze2;
        C0645zzn zzn;
        Throwable th;
        String str4 = str;
        boolean z4 = z;
        boolean z5 = z2;
        boolean z6 = z3;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Object checkNotNull = C0446Preconditions.checkNotNull(zzg);
            zzf();
            new C0645zzn(str4, z4, false, C0663ObjectWrapper.wrap(zzg), false);
            try {
                C0648zzq zzf2 = zze.zzf(zzn);
                if (zzf2.zza()) {
                    zze2 = C0654zzw.zzb();
                } else {
                    String zzb2 = zzf2.zzb();
                    String str5 = "error checking package certificate";
                    if (zzb2 == null) {
                        zzb2 = str5;
                    }
                    if (zzf2.zzc() == 4) {
                        new PackageManager.NameNotFoundException();
                        zze2 = C0654zzw.zze(zzb2, th);
                    } else {
                        zze2 = C0654zzw.zzd(zzb2);
                    }
                }
            } catch (RemoteException e) {
                RemoteException remoteException = e;
                int e2 = Log.e("GoogleCertificates", "Failed to get Google certificates from remote", remoteException);
                zze2 = C0654zzw.zze("module call", remoteException);
            }
        } catch (C0677DynamiteModule.LoadingException e3) {
            C0677DynamiteModule.LoadingException loadingException = e3;
            int e4 = Log.e("GoogleCertificates", "Failed to get Google certificates from remote", loadingException);
            String str6 = "module init: ";
            String valueOf = String.valueOf(loadingException.getMessage());
            if (valueOf.length() != 0) {
                str3 = str6.concat(valueOf);
            } else {
                new String(str6);
                str3 = str2;
            }
            zze2 = C0654zzw.zze(str3, loadingException);
        } catch (Throwable th2) {
            Throwable th3 = th2;
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th3;
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return zze2;
    }

    /* JADX INFO: finally extract failed */
    static C0654zzw zzc(String str, C0640zzi zzi, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            C0654zzw zzg2 = zzg(str, zzi, z, z2);
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
        } catch (RemoteException | C0677DynamiteModule.LoadingException e) {
            int e2 = Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return false;
        } catch (Throwable th) {
            Throwable th2 = th;
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th2;
        }
    }

    static final /* synthetic */ String zze(boolean z, String str, C0640zzi zzi) throws Exception {
        boolean z2 = z;
        String str2 = str;
        C0640zzi zzi2 = zzi;
        return C0654zzw.zzg(str2, zzi2, z2, !z2 ? zzg(str2, zzi2, true, false).zza : false);
    }

    private static C0654zzw zzg(String str, C0640zzi zzi, boolean z, boolean z2) {
        String str2;
        C0650zzs zzs;
        Callable callable;
        String str3 = str;
        C0640zzi zzi2 = zzi;
        boolean z3 = z;
        boolean z4 = z2;
        try {
            zzf();
            Object checkNotNull = C0446Preconditions.checkNotNull(zzg);
            new C0650zzs(str3, zzi2, z3, z4);
            try {
                if (zze.zze(zzs, C0663ObjectWrapper.wrap(zzg.getPackageManager()))) {
                    return C0654zzw.zzb();
                }
                new C0635zzd(z3, str3, zzi2);
                return C0654zzw.zzc(callable);
            } catch (RemoteException e) {
                RemoteException remoteException = e;
                int e2 = Log.e("GoogleCertificates", "Failed to get Google certificates from remote", remoteException);
                return C0654zzw.zze("module call", remoteException);
            }
        } catch (C0677DynamiteModule.LoadingException e3) {
            C0677DynamiteModule.LoadingException loadingException = e3;
            int e4 = Log.e("GoogleCertificates", "Failed to get Google certificates from remote", loadingException);
            String valueOf = String.valueOf(loadingException.getMessage());
            String str4 = "module init: ";
            if (valueOf.length() != 0) {
                str2 = str4.concat(valueOf);
            } else {
                new String(str4);
            }
            return C0654zzw.zze(str2, loadingException);
        }
    }

    /* JADX INFO: finally extract failed */
    private static void zzf() throws C0677DynamiteModule.LoadingException {
        if (zze == null) {
            Object checkNotNull = C0446Preconditions.checkNotNull(zzg);
            Object obj = zzf;
            synchronized (obj) {
                try {
                    if (zze == null) {
                        zze = C0515zzad.zzb(C0677DynamiteModule.load(zzg, C0677DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, "com.google.android.gms.googlecertificates").instantiate("com.google.android.gms.common.GoogleCertificatesImpl"));
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
