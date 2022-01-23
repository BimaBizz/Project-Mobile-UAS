package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

@ShowFirstParty
@CheckReturnValue
@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class GoogleSignatureVerifier {
    @Nullable
    private static GoogleSignatureVerifier zza;
    private final Context zzb;
    private volatile String zzc;

    public GoogleSignatureVerifier(@RecentlyNonNull Context context) {
        this.zzb = context.getApplicationContext();
    }

    @RecentlyNonNull
    @KeepForSdk
    public static GoogleSignatureVerifier getInstance(@RecentlyNonNull Context context) {
        GoogleSignatureVerifier googleSignatureVerifier;
        Context context2 = context;
        Object checkNotNull = Preconditions.checkNotNull(context2);
        Class<GoogleSignatureVerifier> cls = GoogleSignatureVerifier.class;
        synchronized (cls) {
            try {
                if (zza == null) {
                    zzm.zza(context2);
                    new GoogleSignatureVerifier(context2);
                    zza = googleSignatureVerifier;
                }
            } catch (Throwable th) {
                while (true) {
                    Throwable th2 = th;
                    Class<GoogleSignatureVerifier> cls2 = cls;
                    throw th2;
                }
            }
        }
        return zza;
    }

    @Nullable
    static final zzi zza(PackageInfo packageInfo, zzi... zziArr) {
        Object obj;
        PackageInfo packageInfo2 = packageInfo;
        zzi[] zziArr2 = zziArr;
        if (packageInfo2.signatures == null) {
            return null;
        }
        if (packageInfo2.signatures.length != 1) {
            int w = Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        new zzj(packageInfo2.signatures[0].toByteArray());
        for (int i = 0; i < zziArr2.length; i++) {
            if (zziArr2[i].equals(obj)) {
                return zziArr2[i];
            }
        }
        return null;
    }

    public static final boolean zzb(@RecentlyNonNull PackageInfo packageInfo, boolean z) {
        zzi zza2;
        PackageInfo packageInfo2 = packageInfo;
        boolean z2 = z;
        if (!(packageInfo2 == null || packageInfo2.signatures == null)) {
            if (z2) {
                zza2 = zza(packageInfo2, zzl.zza);
            } else {
                zza2 = zza(packageInfo2, zzl.zza[0]);
            }
            if (zza2 != null) {
                return true;
            }
        }
        return false;
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isPackageGoogleSigned(@RecentlyNonNull String str) {
        zzw zzc2 = zzc(str, false, false);
        zzc2.zzf();
        return zzc2.zza;
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isUidGoogleSigned(int i) {
        zzw zzw;
        int length;
        String[] packagesForUid = this.zzb.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            zzw zzw2 = null;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    Object checkNotNull = Preconditions.checkNotNull(zzw2);
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
            zzw = zzw.zzd("no pkgs");
        }
        zzw.zzf();
        return zzw.zza;
    }

    @KeepForSdk
    public boolean isGooglePublicSignedPackage(@RecentlyNonNull PackageInfo packageInfo) {
        PackageInfo packageInfo2 = packageInfo;
        if (packageInfo2 == null) {
            return false;
        }
        if (zzb(packageInfo2, false)) {
            return true;
        }
        if (zzb(packageInfo2, true)) {
            if (GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb)) {
                return true;
            }
            int w = Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    private final zzw zzc(String str, boolean z, boolean z2) {
        String str2;
        String str3;
        zzw zzd;
        zzi zzi;
        String str4 = str;
        boolean z3 = z;
        boolean z4 = z2;
        if (str4 == null) {
            return zzw.zzd("null pkg");
        }
        if (str4.equals(this.zzc)) {
            return zzw.zzb();
        }
        if (zzm.zzd()) {
            zzd = zzm.zzb(str4, GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.zzb.getPackageManager().getPackageInfo(str4, 64);
                boolean honorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb);
                if (packageInfo == null) {
                    zzd = zzw.zzd("null pkg");
                } else if (packageInfo.signatures == null || packageInfo.signatures.length != 1) {
                    zzd = zzw.zzd("single cert required");
                } else {
                    new zzj(packageInfo.signatures[0].toByteArray());
                    String str5 = packageInfo.packageName;
                    zzw zzc2 = zzm.zzc(str5, zzi, honorsDebugCertificates, false);
                    zzd = zzc2.zza ? packageInfo.applicationInfo != null ? (packageInfo.applicationInfo.flags & 2) != 0 ? zzm.zzc(str5, zzi, false, true).zza ? zzw.zzd("debuggable release cert app rejected") : zzc2 : zzc2 : zzc2 : zzc2;
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
                return zzw.zze(str3, nameNotFoundException);
            }
        }
        if (zzd.zza) {
            this.zzc = str4;
        }
        return zzd;
    }
}
