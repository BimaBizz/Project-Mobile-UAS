package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.internal.flags.zze;
import java.util.concurrent.Callable;

public final class zzf extends zza<Long> {
    public static Long zza(SharedPreferences sharedPreferences, String str, Long l) {
        String str2;
        String str3;
        Callable callable;
        Long l2 = l;
        try {
            new zzg(sharedPreferences, str, l2);
            return (Long) zze.zza(callable);
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
            return l2;
        }
    }
}
