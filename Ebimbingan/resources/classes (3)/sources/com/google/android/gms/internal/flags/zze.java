package com.google.android.gms.internal.flags;

import android.os.StrictMode;
import java.util.concurrent.Callable;

public final class zze {
    /* JADX INFO: finally extract failed */
    public static <T> T zza(Callable<T> callable) throws Exception {
        Callable<T> callable2 = callable;
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            T call = callable2.call();
            StrictMode.setThreadPolicy(threadPolicy);
            return call;
        } catch (Throwable th) {
            Throwable th2 = th;
            StrictMode.setThreadPolicy(threadPolicy);
            throw th2;
        }
    }
}
