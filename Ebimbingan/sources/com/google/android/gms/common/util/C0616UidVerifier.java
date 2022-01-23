package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.C0198GoogleSignatureVerifier;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.wrappers.C0628Wrappers;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.util.UidVerifier */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0616UidVerifier {
    private C0616UidVerifier() {
    }

    @C0206KeepForSdk
    public static boolean isGooglePlayServicesUid(@RecentlyNonNull Context context, int i) {
        Context context2 = context;
        if (!uidHasPackageName(context2, i, "com.google.android.gms")) {
            return false;
        }
        try {
            return C0198GoogleSignatureVerifier.getInstance(context2).isGooglePublicSignedPackage(context2.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException e) {
            if (Log.isLoggable("UidVerifier", 3)) {
                int d = Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }

    @TargetApi(19)
    @C0206KeepForSdk
    public static boolean uidHasPackageName(@RecentlyNonNull Context context, int i, @RecentlyNonNull String str) {
        return C0628Wrappers.packageManager(context).zza(i, str);
    }
}
