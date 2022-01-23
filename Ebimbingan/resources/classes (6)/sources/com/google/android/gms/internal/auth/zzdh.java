package com.google.android.gms.internal.auth;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class zzdh implements zzcn {
    @GuardedBy("SharedPreferencesLoader.class")
    private static final Map<String, zzdh> zza;
    private final SharedPreferences zzb;
    private final SharedPreferences.OnSharedPreferenceChangeListener zzc;
    private final Object zzd;
    private volatile Map<String, ?> zze;
    @GuardedBy("this")
    private final List<zzck> zzf;

    /* JADX INFO: finally extract failed */
    static zzdh zza(Context context, String str) {
        boolean z;
        zzdh zzdh;
        Context context2 = context;
        String str2 = str;
        String str3 = str2;
        Context context3 = context2;
        if (!zzch.zza() || str3.startsWith("direct_boot:")) {
            z = true;
        } else {
            z = zzch.zza(context3);
        }
        if (!z) {
            return null;
        }
        Class<zzdh> cls = zzdh.class;
        Class<zzdh> cls2 = cls;
        synchronized (cls) {
            try {
                zzdh zzdh2 = zza.get(str2);
                zzdh zzdh3 = zzdh2;
                if (zzdh2 == null) {
                    new zzdh(zzb(context2, str2));
                    zzdh3 = zzdh;
                    zzdh put = zza.put(str2, zzdh3);
                }
                zzdh zzdh4 = zzdh3;
                return zzdh4;
            } catch (Throwable th) {
                Throwable th2 = th;
                Class<zzdh> cls3 = cls2;
                throw th2;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    private static SharedPreferences zzb(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (str2.startsWith("direct_boot:")) {
                Context context3 = context2;
                if (zzch.zza()) {
                    context3 = context2.createDeviceProtectedStorageContext();
                }
                SharedPreferences sharedPreferences = context3.getSharedPreferences(str2.substring(12), 0);
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return sharedPreferences;
            }
            SharedPreferences sharedPreferences2 = context2.getSharedPreferences(str2, 0);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return sharedPreferences2;
        } catch (Throwable th) {
            Throwable th2 = th;
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th2;
        }
    }

    private zzdh(SharedPreferences sharedPreferences) {
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener;
        Object obj;
        List<zzck> list;
        new zzdg(this);
        this.zzc = onSharedPreferenceChangeListener;
        new Object();
        this.zzd = obj;
        new ArrayList();
        this.zzf = list;
        this.zzb = sharedPreferences;
        this.zzb.registerOnSharedPreferenceChangeListener(this.zzc);
    }

    /* JADX INFO: finally extract failed */
    public final Object zza(String str) {
        Throwable th;
        String str2 = str;
        Map<String, ?> map = this.zze;
        Map<String, ?> map2 = map;
        if (map == null) {
            Object obj = this.zzd;
            r3 = obj;
            synchronized (obj) {
                try {
                    Map<String, ?> map3 = this.zze;
                    map2 = map3;
                    if (map3 == null) {
                        th = StrictMode.allowThreadDiskReads();
                        map2 = this.zzb.getAll();
                        this.zze = map2;
                        StrictMode.setThreadPolicy(r4);
                    }
                } catch (Throwable th2) {
                    StrictMode.setThreadPolicy(r4);
                    throw th;
                } finally {
                    th = th2;
                    StrictMode.ThreadPolicy threadPolicy = r3;
                    Throwable th3 = th;
                }
            }
        }
        if (map2 != null) {
            return map2.get(str2);
        }
        return null;
    }

    static synchronized void zza() {
        synchronized (zzdh.class) {
            for (zzdh next : zza.values()) {
                next.zzb.unregisterOnSharedPreferenceChangeListener(next.zzc);
            }
            zza.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(SharedPreferences sharedPreferences, String str) {
        Throwable th;
        SharedPreferences sharedPreferences2 = sharedPreferences;
        String str2 = str;
        Object obj = this.zzd;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                this.zze = null;
                zzcx.zza();
                synchronized (this) {
                    try {
                        for (zzck zza2 : this.zzf) {
                            zza2.zza();
                        }
                    } catch (Throwable th2) {
                        throw th;
                    }
                }
            } finally {
                while (true) {
                    th = th2;
                    Object obj3 = obj2;
                    Throwable th3 = th;
                }
            }
        }
    }

    static {
        Map<String, zzdh> map;
        new ArrayMap();
        zza = map;
    }
}
