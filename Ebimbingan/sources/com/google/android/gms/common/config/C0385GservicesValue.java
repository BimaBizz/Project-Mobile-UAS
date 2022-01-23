package com.google.android.gms.common.config;

import android.os.Binder;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.util.C0617VisibleForTesting;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.config.GservicesValue */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public abstract class C0385GservicesValue<T> {
    private static final Object zzc;
    @RecentlyNonNull
    protected final String zza;
    @RecentlyNonNull
    protected final T zzb;
    @Nullable
    private T zzd = null;

    static {
        Object obj;
        new Object();
        zzc = obj;
    }

    protected C0385GservicesValue(@RecentlyNonNull String str, @RecentlyNonNull T t) {
        this.zza = str;
        this.zzb = t;
    }

    @C0206KeepForSdk
    public static boolean isInitialized() {
        Object obj = zzc;
        synchronized (obj) {
            try {
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj2 = obj;
                throw th2;
            }
        }
        return false;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static C0385GservicesValue<Float> value(@RecentlyNonNull String str, @RecentlyNonNull Float f) {
        C0385GservicesValue<Float> gservicesValue;
        new C0389zzd(str, f);
        return gservicesValue;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    @Deprecated
    public final T getBinderSafe() {
        return get();
    }

    /* JADX INFO: finally extract failed */
    @C0206KeepForSdk
    @C0617VisibleForTesting
    public void override(@RecentlyNonNull T t) {
        Object obj;
        Throwable th;
        int w = Log.w("GservicesValue", "GservicesValue.override(): test should probably call initForTests() first");
        T t2 = t;
        this.zzd = t2;
        Object obj2 = zzc;
        synchronized (obj2) {
            try {
                obj = zzc;
                synchronized (obj) {
                }
            } catch (Throwable th2) {
                Throwable th3 = th2;
                Object obj3 = obj2;
                throw th3;
            }
        }
    }

    @C0206KeepForSdk
    @C0617VisibleForTesting
    public void resetOverride() {
        this.zzd = null;
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    public abstract T zza(@RecentlyNonNull String str);

    @RecentlyNonNull
    @C0206KeepForSdk
    public static C0385GservicesValue<Integer> value(@RecentlyNonNull String str, @RecentlyNonNull Integer num) {
        C0385GservicesValue<Integer> gservicesValue;
        new C0388zzc(str, num);
        return gservicesValue;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static C0385GservicesValue<Long> value(@RecentlyNonNull String str, @RecentlyNonNull Long l) {
        C0385GservicesValue<Long> gservicesValue;
        new C0387zzb(str, l);
        return gservicesValue;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static C0385GservicesValue<String> value(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        C0385GservicesValue<String> gservicesValue;
        new C0390zze(str, str2);
        return gservicesValue;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static C0385GservicesValue<Boolean> value(@RecentlyNonNull String str, boolean z) {
        C0385GservicesValue<Boolean> gservicesValue;
        new C0386zza(str, Boolean.valueOf(z));
        return gservicesValue;
    }

    /* JADX INFO: finally extract failed */
    @RecentlyNonNull
    @C0206KeepForSdk
    public final T get() {
        long clearCallingIdentity;
        T t = this.zzd;
        if (t != null) {
            return t;
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        Object obj = zzc;
        synchronized (obj) {
            try {
            } catch (Throwable th) {
                while (true) {
                    Throwable th2 = th;
                    Object obj2 = obj;
                    throw th2;
                }
            }
        }
        Object obj3 = zzc;
        synchronized (obj3) {
            try {
            } catch (Throwable th3) {
                while (true) {
                    Throwable th4 = th3;
                    Object obj4 = obj3;
                    throw th4;
                }
            }
        }
        try {
            T zza2 = zza(this.zza);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return zza2;
        } catch (SecurityException e) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            T zza3 = zza(this.zza);
            Binder.restoreCallingIdentity(clearCallingIdentity);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return zza3;
        } catch (Throwable th5) {
            Throwable th6 = th5;
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th6;
        }
    }
}
