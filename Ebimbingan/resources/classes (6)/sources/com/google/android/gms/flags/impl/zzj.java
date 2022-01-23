package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.internal.flags.zze;
import java.util.concurrent.Callable;

public final class zzj {
    private static SharedPreferences zzw = null;

    public static SharedPreferences zza(Context context) throws Exception {
        Callable callable;
        Context context2 = context;
        Class<SharedPreferences> cls = SharedPreferences.class;
        Class<SharedPreferences> cls2 = cls;
        synchronized (cls) {
            try {
                if (zzw == null) {
                    new zzk(context2);
                    zzw = (SharedPreferences) zze.zza(callable);
                }
                SharedPreferences sharedPreferences = zzw;
                return sharedPreferences;
            } catch (Throwable th) {
                Throwable th2 = th;
                Class<SharedPreferences> cls3 = cls2;
                throw th2;
            }
        }
    }
}
