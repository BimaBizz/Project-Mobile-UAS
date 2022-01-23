package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.wrappers.C0628Wrappers;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.Component;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.util.WorkSourceUtil */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C0618WorkSourceUtil {
    private static final int zza = Process.myUid();
    @Nullable
    private static final Method zzb;
    @Nullable
    private static final Method zzc;
    @Nullable
    private static final Method zzd;
    @Nullable
    private static final Method zze;
    @Nullable
    private static final Method zzf;
    @Nullable
    private static final Method zzg;
    @Nullable
    private static final Method zzh;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Method method7;
        try {
            method = WorkSource.class.getMethod(Component.DEFAULT_VALUE_FAB_ICON_NAME, new Class[]{Integer.TYPE});
        } catch (Exception e) {
            method = null;
        }
        zzb = method;
        if (C0609PlatformVersion.isAtLeastJellyBeanMR2()) {
            try {
                method2 = WorkSource.class.getMethod(Component.DEFAULT_VALUE_FAB_ICON_NAME, new Class[]{Integer.TYPE, String.class});
            } catch (Exception e2) {
                method2 = null;
            }
        } else {
            method2 = null;
        }
        zzc = method2;
        try {
            method3 = WorkSource.class.getMethod(PropertyTypeConstants.PROPERTY_TYPE_FAB_SIZE, new Class[0]);
        } catch (Exception e3) {
            method3 = null;
        }
        zzd = method3;
        try {
            method4 = WorkSource.class.getMethod("get", new Class[]{Integer.TYPE});
        } catch (Exception e4) {
            method4 = null;
        }
        zze = method4;
        if (C0609PlatformVersion.isAtLeastJellyBeanMR2()) {
            try {
                method5 = WorkSource.class.getMethod("getName", new Class[]{Integer.TYPE});
            } catch (Exception e5) {
                method5 = null;
            }
        } else {
            method5 = null;
        }
        zzf = method5;
        if (C0609PlatformVersion.isAtLeastP()) {
            try {
                method6 = WorkSource.class.getMethod("createWorkChain", new Class[0]);
            } catch (Exception e6) {
                int w = Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e6);
                method6 = null;
            }
        } else {
            method6 = null;
        }
        zzg = method6;
        if (C0609PlatformVersion.isAtLeastP()) {
            try {
                method7 = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", new Class[]{Integer.TYPE, String.class});
            } catch (Exception e7) {
                int w2 = Log.w("WorkSourceUtil", "Missing WorkChain class", e7);
                method7 = null;
            }
        } else {
            method7 = null;
        }
        zzh = method7;
    }

    private C0618WorkSourceUtil() {
    }

    @C0206KeepForSdk
    @RecentlyNullable
    public static WorkSource fromPackage(@RecentlyNonNull Context context, @Nullable String str) {
        String str2;
        String str3;
        WorkSource workSource;
        String str4;
        String str5;
        Context context2 = context;
        String str6 = str;
        if (context2 == null || context2.getPackageManager() == null || str6 == null) {
            return null;
        }
        try {
            ApplicationInfo applicationInfo = C0628Wrappers.packageManager(context2).getApplicationInfo(str6, 0);
            if (applicationInfo == null) {
                String str7 = "Could not get applicationInfo from package: ";
                if (str6.length() != 0) {
                    str5 = str7.concat(str6);
                } else {
                    new String(str7);
                    str5 = str4;
                }
                int e = Log.e("WorkSourceUtil", str5);
                return null;
            }
            int i = applicationInfo.uid;
            new WorkSource();
            zza(workSource, i, str6);
            return workSource;
        } catch (PackageManager.NameNotFoundException e2) {
            String str8 = "Could not find package: ";
            if (str6.length() != 0) {
                str3 = str8.concat(str6);
            } else {
                new String(str8);
                str3 = str2;
            }
            int e3 = Log.e("WorkSourceUtil", str3);
            return null;
        }
    }

    @C0206KeepForSdk
    @RecentlyNullable
    public static WorkSource fromPackageAndModuleExperimentalPi(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull String str2) {
        String str3;
        String str4;
        int i;
        WorkSource workSource;
        String str5;
        String str6;
        Context context2 = context;
        String str7 = str;
        String str8 = str2;
        if (context2 == null || context2.getPackageManager() == null || str8 == null || str7 == null) {
            int w = Log.w("WorkSourceUtil", "Unexpected null arguments");
            return null;
        }
        try {
            ApplicationInfo applicationInfo = C0628Wrappers.packageManager(context2).getApplicationInfo(str7, 0);
            if (applicationInfo == null) {
                String str9 = "Could not get applicationInfo from package: ";
                if (str7.length() != 0) {
                    str6 = str9.concat(str7);
                } else {
                    new String(str9);
                    str6 = str5;
                }
                int e = Log.e("WorkSourceUtil", str6);
                i = -1;
            } else {
                i = applicationInfo.uid;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            String str10 = "Could not find package: ";
            if (str7.length() != 0) {
                str4 = str10.concat(str7);
            } else {
                new String(str10);
                str4 = str3;
            }
            int e3 = Log.e("WorkSourceUtil", str4);
            i = -1;
        }
        if (i < 0) {
            return null;
        }
        new WorkSource();
        if (zzg == null || zzh == null) {
            zza(workSource, i, str7);
        } else {
            try {
                Object invoke = zzg.invoke(workSource, new Object[0]);
                if (i != zza) {
                    Object invoke2 = zzh.invoke(invoke, new Object[]{Integer.valueOf(i), str7});
                }
                Object invoke3 = zzh.invoke(invoke, new Object[]{Integer.valueOf(zza), str8});
            } catch (Exception e4) {
                int w2 = Log.w("WorkSourceUtil", "Unable to assign chained blame through WorkSource", e4);
            }
        }
        return workSource;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static List<String> getNames(@Nullable WorkSource workSource) {
        List<String> list;
        int i;
        String str;
        WorkSource workSource2 = workSource;
        new ArrayList();
        if (workSource2 == null) {
            i = 0;
        } else if (zzd != null) {
            try {
                Object invoke = zzd.invoke(workSource2, new Object[0]);
                Object checkNotNull = C0446Preconditions.checkNotNull(invoke);
                i = ((Integer) invoke).intValue();
            } catch (Exception e) {
                int wtf = Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                i = 0;
            }
        } else {
            i = 0;
        }
        if (i == 0) {
            return list;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (zzf != null) {
                try {
                    str = (String) zzf.invoke(workSource2, new Object[]{Integer.valueOf(i2)});
                } catch (Exception e2) {
                    int wtf2 = Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                    str = null;
                }
            } else {
                str = null;
            }
            if (!C0615Strings.isEmptyOrWhitespace(str)) {
                Object checkNotNull2 = C0446Preconditions.checkNotNull(str);
                boolean add = list.add(str);
            }
        }
        return list;
    }

    public static void zza(@RecentlyNonNull WorkSource workSource, int i, @Nullable String str) {
        WorkSource workSource2 = workSource;
        int i2 = i;
        String str2 = str;
        if (zzc != null) {
            try {
                Object invoke = zzc.invoke(workSource2, new Object[]{Integer.valueOf(i2), str2});
            } catch (Exception e) {
                int wtf = Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        } else if (zzb != null) {
            try {
                Object invoke2 = zzb.invoke(workSource2, new Object[]{Integer.valueOf(i2)});
            } catch (Exception e2) {
                int wtf2 = Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            }
        }
    }

    @C0206KeepForSdk
    public static boolean hasWorkSourcePermission(@RecentlyNonNull Context context) {
        Context context2 = context;
        if (context2 == null) {
            return false;
        }
        if (context2.getPackageManager() == null) {
            return false;
        }
        return C0628Wrappers.packageManager(context2).checkPermission("android.permission.UPDATE_DEVICE_STATS", context2.getPackageName()) == 0;
    }
}
