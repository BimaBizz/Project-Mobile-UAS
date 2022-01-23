package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.internal.C0452ShowFirstParty;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

@C0452ShowFirstParty
@CheckReturnValue
@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.GoogleSignatureVerifier */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C0198GoogleSignatureVerifier {
    @Nullable
    private static C0198GoogleSignatureVerifier zza;
    private final Context zzb;
    private volatile String zzc;

    public C0198GoogleSignatureVerifier(@RecentlyNonNull Context context) {
        this.zzb = context.getApplicationContext();
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static C0198GoogleSignatureVerifier getInstance(@RecentlyNonNull Context context) {
        C0198GoogleSignatureVerifier googleSignatureVerifier;
        Context context2 = context;
        Object checkNotNull = C0446Preconditions.checkNotNull(context2);
        Class<C0198GoogleSignatureVerifier> cls = C0198GoogleSignatureVerifier.class;
        synchronized (cls) {
            try {
                if (zza == null) {
                    C0644zzm.zza(context2);
                    new C0198GoogleSignatureVerifier(context2);
                    zza = googleSignatureVerifier;
                }
            } catch (Throwable th) {
                while (true) {
                    Throwable th2 = th;
                    Class<C0198GoogleSignatureVerifier> cls2 = cls;
                    throw th2;
                }
            }
        }
        return zza;
    }

    @Nullable
    static final C0640zzi zza(PackageInfo packageInfo, C0640zzi... zziArr) {
        Object obj;
        PackageInfo packageInfo2 = packageInfo;
        C0640zzi[] zziArr2 = zziArr;
        if (packageInfo2.signatures == null) {
            return null;
        }
        if (packageInfo2.signatures.length != 1) {
            int w = Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        new C0641zzj(packageInfo2.signatures[0].toByteArray());
        for (int i = 0; i < zziArr2.length; i++) {
            if (zziArr2[i].equals(obj)) {
                return zziArr2[i];
            }
        }
        return null;
    }

    public static final boolean zzb(@RecentlyNonNull PackageInfo packageInfo, boolean z) {
        C0640zzi zza2;
        PackageInfo packageInfo2 = packageInfo;
        boolean z2 = z;
        if (!(packageInfo2 == null || packageInfo2.signatures == null)) {
            if (z2) {
                zza2 = zza(packageInfo2, C0643zzl.zza);
            } else {
                zza2 = zza(packageInfo2, C0643zzl.zza[0]);
            }
            if (zza2 != null) {
                return true;
            }
        }
        return false;
    }

    @C0452ShowFirstParty
    @C0206KeepForSdk
    public boolean isPackageGoogleSigned(@RecentlyNonNull String str) {
        C0654zzw zzc2 = zzc(str, false, false);
        zzc2.zzf();
        return zzc2.zza;
    }

    @C0452ShowFirstParty
    @C0206KeepForSdk
    public boolean isUidGoogleSigned(int i) {
        C0654zzw zzw;
        int length;
        String[] packagesForUid = this.zzb.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            C0654zzw zzw2 = null;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    Object checkNotNull = C0446Preconditions.checkNotNull(zzw2);
                    zzw = zzw2;
                    break;
                }
                zzw2 = zzc(packagesForUid[i2], false, false);
                if (zzw2.zza) {
                    zzw = zzw2;
                    break;
                }
                i2++;
            }
        } else {
            zzw = C0654zzw.zzd("no pkgs");
        }
        zzw.zzf();
        return zzw.zza;
    }

    @C0206KeepForSdk
    public boolean isGooglePublicSignedPackage(@RecentlyNonNull PackageInfo packageInfo) {
        PackageInfo packageInfo2 = packageInfo;
        if (packageInfo2 == null) {
            return false;
        }
        if (zzb(packageInfo2, false)) {
            return true;
        }
        if (zzb(packageInfo2, true)) {
            if (C0197GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb)) {
                return true;
            }
            int w = Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    private final C0654zzw zzc(String str, boolean z, boolean z2) {
        String str2;
        String str3;
        C0654zzw zzd;
        C0640zzi zzi;
        String str4 = str;
        boolean z3 = z;
        boolean z4 = z2;
        if (str4 == null) {
            return C0654zzw.zzd("null pkg");
        }
        if (str4.equals(this.zzc)) {
            return C0654zzw.zzb();
        }
        if (C0644zzm.zzd()) {
            zzd = C0644zzm.zzb(str4, C0197GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.zzb.getPackageManager().getPackageInfo(str4, 64);
                boolean honorsDebugCertificates = C0197GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb);
                if (packageInfo == null) {
                    zzd = C0654zzw.zzd("null pkg");
                } else if (packageInfo.signatures == null || packageInfo.signatures.length != 1) {
                    zzd = C0654zzw.zzd("single cert required");
                } else {
                    new C0641zzj(packageInfo.signatures[0].toByteArray());
                    String str5 = packageInfo.packageName;
                    C0654zzw zzc2 = C0644zzm.zzc(str5, zzi, honorsDebugCertificates, false);
                    zzd = zzc2.zza ? packageInfo.applicationInfo != null ? (packageInfo.applicationInfo.flags & 2) != 0 ? C0644zzm.zzc(str5, zzi, false, true).zza ? C0654zzw.zzd("debuggable release cert app rejected") : zzc2 : zzc2 : zzc2 : zzc2;
                }
            } catch (PackageManager.NameNotFoundException e) {
                PackageManager.NameNotFoundException nameNotFoundException = e;
                String str6 = "no pkg ";
                if (str4.length() != 0) {
                    str3 = str6.concat(str4);
                } else {
                    new String(str6);
                    str3 = str2;
                }
                return C0654zzw.zze(str3, nameNotFoundException);
            }
        }
        if (zzd.zza) {
            this.zzc = str4;
        }
        return zzd;
    }
}
