package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.wrappers.C0628Wrappers;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.util.ClientLibraryUtils */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C0591ClientLibraryUtils {
    private C0591ClientLibraryUtils() {
    }

    @C0206KeepForSdk
    public static int getClientVersion(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        PackageInfo packageInfo;
        Bundle bundle;
        try {
            packageInfo = C0628Wrappers.packageManager(context).getPackageInfo(str, 128);
        } catch (PackageManager.NameNotFoundException e) {
            packageInfo = null;
        }
        if (packageInfo == null || packageInfo.applicationInfo == null || (bundle = packageInfo.applicationInfo.metaData) == null) {
            return -1;
        }
        return bundle.getInt("com.google.android.gms.version", -1);
    }

    @C0206KeepForSdk
    public static boolean isPackageSide() {
        return false;
    }
}
