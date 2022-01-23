package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.common.zzi;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@ShowFirstParty
@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class AndroidUtilsLight {
    private static volatile int zza = -1;

    public AndroidUtilsLight() {
    }

    @RecentlyNonNull
    @TargetApi(24)
    @KeepForSdk
    @Deprecated
    public static Context getDeviceProtectedStorageContext(@RecentlyNonNull Context context) {
        Context context2 = context;
        if (zzi.zza() && !context2.isDeviceProtectedStorage()) {
            context2 = context2.createDeviceProtectedStorageContext();
        }
        return context2;
    }

    @RecentlyNullable
    @KeepForSdk
    @Deprecated
    public static byte[] getPackageCertificateHashBytes(@RecentlyNonNull Context context, @RecentlyNonNull String str) throws PackageManager.NameNotFoundException {
        MessageDigest zza2;
        PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(str, 64);
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
