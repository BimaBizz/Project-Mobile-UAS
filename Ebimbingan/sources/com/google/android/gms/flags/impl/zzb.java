package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.internal.flags.zze;
import java.util.concurrent.Callable;

public final class zzb extends zza<Boolean> {
    public static Boolean zza(SharedPreferences sharedPreferences, String str, Boolean bool) {
        String str2;
        String str3;
        Callable callable;
        Boolean bool2 = bool;
        try {
            new zzc(sharedPreferences, str, bool2);
            return (Boolean) zze.zza(callable);
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            String str4 = valueOf;
            if (valueOf.length() != 0) {
                str3 = "Flag value not available, returning default: ".concat(str4);
            } else {
                str3 = str2;
                new String("Flag value not available, returning default: ");
            }
            int w = Log.w("FlagDataUtils", str3);
            return bool2;
        }
    }
}
