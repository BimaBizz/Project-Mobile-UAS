package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.internal.C0452ShowFirstParty;
import com.google.android.gms.common.wrappers.C0628Wrappers;
import com.google.android.gms.internal.common.C1115zzi;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@C0452ShowFirstParty
@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.util.AndroidUtilsLight */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C0587AndroidUtilsLight {
    private static volatile int zza = -1;

    public C0587AndroidUtilsLight() {
    }

    @RecentlyNonNull
    @TargetApi(24)
    @C0206KeepForSdk
    @Deprecated
    public static Context getDeviceProtectedStorageContext(@RecentlyNonNull Context context) {
        Context context2 = context;
        if (C1115zzi.zza() && !context2.isDeviceProtectedStorage()) {
            context2 = context2.createDeviceProtectedStorageContext();
        }
        return context2;
    }

    @RecentlyNullable
    @C0206KeepForSdk
    @Deprecated
    public static byte[] getPackageCertificateHashBytes(@RecentlyNonNull Context context, @RecentlyNonNull String str) throws PackageManager.NameNotFoundException {
        MessageDigest zza2;
        PackageInfo packageInfo = C0628Wrappers.packageManager(context).getPackageInfo(str, 64);
        if (packageInfo.signatures == null || packageInfo.signatures.length != 1 || (zza2 = zza("SHA1")) == null) {
            return null;
        }
        return zza2.digest(packageInfo.signatures[0].toByteArray());
    }

    @RecentlyNullable
    public static MessageDigest zza(@RecentlyNonNull String str) {
        String str2 = str;
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str2);
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException e) {
            }
        }
        return null;
    }
}
