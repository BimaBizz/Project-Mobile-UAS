package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.internal.flags.zze;
import java.util.concurrent.Callable;

public final class zzd extends zza<Integer> {
    public static Integer zza(SharedPreferences sharedPreferences, String str, Integer num) {
        String str2;
        String str3;
        Callable callable;
        Integer num2 = num;
        try {
            new zze(sharedPreferences, str, num2);
            return (Integer) zze.zza(callable);
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
            return num2;
        }
    }
}
