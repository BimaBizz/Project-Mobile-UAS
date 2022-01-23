package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.internal.flags.zze;
import java.util.concurrent.Callable;

public final class zzh extends zza<String> {
    public static String zza(SharedPreferences sharedPreferences, String str, String str2) {
        String str3;
        String str4;
        Callable callable;
        String str5 = str2;
        try {
            new zzi(sharedPreferences, str, str5);
            return (String) zze.zza(callable);
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            String str6 = valueOf;
            if (valueOf.length() != 0) {
                str4 = "Flag value not available, returning default: ".concat(str6);
            } else {
                str4 = str3;
                new String("Flag value not available, returning default: ");
            }
            int w = Log.w("FlagDataUtils", str4);
            return str5;
        }
    }
}
