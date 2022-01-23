package com.google.android.gms.internal.auth;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public class zzch {
    @GuardedBy("DirectBootUtils.class")
    private static UserManager zza;
    private static volatile boolean zzb = (!zza());
    @GuardedBy("DirectBootUtils.class")
    private static boolean zzc = false;

    private zzch() {
    }

    public static boolean zza() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean zza(Context context) {
        return !zza() || zzc(context);
    }

    @RequiresApi(24)
    @TargetApi(24)
    @GuardedBy("DirectBootUtils.class")
    private static boolean zzb(Context context) {
        Context context2 = context;
        boolean z = false;
        int i = 1;
        while (true) {
            if (i > 2) {
                break;
            }
            Context context3 = context2;
            if (zza == null) {
                zza = (UserManager) context3.getSystemService(UserManager.class);
            }
            UserManager userManager = zza;
            UserManager userManager2 = userManager;
            if (userManager == null) {
                return true;
            }
            try {
                z = userManager2.isUserUnlocked() || !userManager2.isUserRunning(Process.myUserHandle());
            } catch (NullPointerException e) {
                int w = Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
                zza = null;
                i++;
            }
        }
        if (z) {
            zza = null;
        }
        return z;
    }

    /* JADX INFO: finally extract failed */
    @RequiresApi(24)
    @TargetApi(24)
    private static boolean zzc(Context context) {
        Context context2 = context;
        if (zzb) {
            return true;
        }
        Class<zzch> cls = zzch.class;
        Class<zzch> cls2 = cls;
        synchronized (cls) {
            try {
                if (zzb) {
                    return true;
                }
                boolean zzb2 = zzb(context2);
                boolean z = zzb2;
                if (zzb2) {
                    zzb = z;
                }
                return z;
            } catch (Throwable th) {
                Throwable th2 = th;
                Class<zzch> cls3 = cls2;
                throw th2;
            }
        }
    }
}
