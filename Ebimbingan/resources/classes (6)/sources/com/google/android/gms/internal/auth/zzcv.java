package com.google.android.gms.internal.auth;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class zzcv {
    private static volatile zzdr<Boolean> zza = zzdr.zzc();
    private static final Object zzb;

    private static boolean zza(Context context) {
        try {
            return (context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    public static boolean zza(Context context, Uri uri) {
        boolean z;
        StringBuilder sb;
        Context context2 = context;
        String authority = uri.getAuthority();
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            new StringBuilder(91 + String.valueOf(authority).length());
            int e = Log.e("PhenotypeClientHelper", sb.append(authority).append(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.").toString());
            return false;
        } else if (zza.zza()) {
            return zza.zzb().booleanValue();
        } else {
            Object obj = zzb;
            Object obj2 = obj;
            synchronized (obj) {
                try {
                    if (zza.zza()) {
                        boolean booleanValue = zza.zzb().booleanValue();
                        return booleanValue;
                    }
                    if ("com.google.android.gms".equals(context2.getPackageName())) {
                        z = true;
                    } else {
                        ProviderInfo resolveContentProvider = context2.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", 0);
                        z = resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName);
                    }
                    zza = zzdr.zza(Boolean.valueOf(z && zza(context2)));
                    return zza.zzb().booleanValue();
                } catch (Throwable th) {
                    Throwable th2 = th;
                    Object obj3 = obj2;
                    throw th2;
                }
            }
        }
    }

    static {
        Object obj;
        new Object();
        zzb = obj;
    }
}
