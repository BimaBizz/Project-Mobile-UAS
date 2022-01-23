package com.google.android.gms.common.wrappers;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Process;
import androidx.annotation.RecentlyNonNull;
import androidx.core.util.Pair;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.util.C0609PlatformVersion;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.wrappers.PackageManagerWrapper */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C0627PackageManagerWrapper {
    @RecentlyNonNull
    protected final Context zza;

    public C0627PackageManagerWrapper(@RecentlyNonNull Context context) {
        this.zza = context;
    }

    @C0206KeepForSdk
    public int checkCallingOrSelfPermission(@RecentlyNonNull String str) {
        return this.zza.checkCallingOrSelfPermission(str);
    }

    @C0206KeepForSdk
    public int checkPermission(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        return this.zza.getPackageManager().checkPermission(str, str2);
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public ApplicationInfo getApplicationInfo(@RecentlyNonNull String str, int i) throws PackageManager.NameNotFoundException {
        return this.zza.getPackageManager().getApplicationInfo(str, i);
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public CharSequence getApplicationLabel(@RecentlyNonNull String str) throws PackageManager.NameNotFoundException {
        return this.zza.getPackageManager().getApplicationLabel(this.zza.getPackageManager().getApplicationInfo(str, 0));
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public Pair<CharSequence, Drawable> getApplicationLabelAndIcon(@RecentlyNonNull String str) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo = this.zza.getPackageManager().getApplicationInfo(str, 0);
        return Pair.create(this.zza.getPackageManager().getApplicationLabel(applicationInfo), this.zza.getPackageManager().getApplicationIcon(applicationInfo));
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public PackageInfo getPackageInfo(@RecentlyNonNull String str, int i) throws PackageManager.NameNotFoundException {
        return this.zza.getPackageManager().getPackageInfo(str, i);
    }

    @C0206KeepForSdk
    public boolean isCallerInstantApp() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return C0626InstantApps.isInstantApp(this.zza);
        }
        if (!C0609PlatformVersion.isAtLeastO() || (nameForUid = this.zza.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.zza.getPackageManager().isInstantApp(nameForUid);
    }

    @TargetApi(19)
    public final boolean zza(int i, @RecentlyNonNull String str) {
        Throwable th;
        int i2 = i;
        String str2 = str;
        if (C0609PlatformVersion.isAtLeastKitKat()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.zza.getSystemService("appops");
                if (appOpsManager == null) {
                    new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
                    throw th;
                }
                appOpsManager.checkPackage(i2, str2);
                return true;
            } catch (SecurityException e) {
                return false;
            }
        } else {
            String[] packagesForUid = this.zza.getPackageManager().getPackagesForUid(i2);
            if (!(str2 == null || packagesForUid == null)) {
                for (int i3 = 0; i3 < packagesForUid.length; i3++) {
                    if (str2.equals(packagesForUid[i3])) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
