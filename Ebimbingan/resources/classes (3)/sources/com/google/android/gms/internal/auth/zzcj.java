package com.google.android.gms.internal.auth;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Handler;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class zzcj implements zzcn {
    @GuardedBy("ConfigurationContentLoader.class")
    private static final Map<Uri, zzcj> zza;
    private static final String[] zzh;
    private final ContentResolver zzb;
    private final Uri zzc;
    private final ContentObserver zzd;
    private final Object zze;
    private volatile Map<String, String> zzf;
    @GuardedBy("this")
    private final List<zzck> zzg;

    private zzcj(ContentResolver contentResolver, Uri uri) {
        ContentObserver contentObserver;
        Object obj;
        List<zzck> list;
        ContentResolver contentResolver2 = contentResolver;
        Uri uri2 = uri;
        new zzcl(this, (Handler) null);
        this.zzd = contentObserver;
        new Object();
        this.zze = obj;
        new ArrayList();
        this.zzg = list;
        this.zzb = contentResolver2;
        this.zzc = uri2;
        contentResolver2.registerContentObserver(uri2, false, this.zzd);
    }

    public static zzcj zza(ContentResolver contentResolver, Uri uri) {
        zzcj zzcj;
        zzcj zzcj2;
        ContentResolver contentResolver2 = contentResolver;
        Uri uri2 = uri;
        Class<zzcj> cls = zzcj.class;
        Class<zzcj> cls2 = cls;
        synchronized (cls) {
            try {
                zzcj zzcj3 = zza.get(uri2);
                zzcj = zzcj3;
                if (zzcj3 == null) {
                    new zzcj(contentResolver2, uri2);
                    zzcj = zzcj2;
                    zzcj put = zza.put(uri2, zzcj);
                }
            } catch (SecurityException e) {
            } catch (Throwable th) {
                Throwable th2 = th;
                Class<zzcj> cls3 = cls2;
                throw th2;
            }
            zzcj zzcj4 = zzcj;
            return zzcj4;
        }
    }

    /* JADX INFO: finally extract failed */
    private final Map<String, String> zzd() {
        Map<String, String> map = this.zzf;
        Map<String, String> map2 = map;
        if (map == null) {
            Object obj = this.zze;
            Object obj2 = obj;
            synchronized (obj) {
                try {
                    Map<String, String> map3 = this.zzf;
                    map2 = map3;
                    if (map3 == null) {
                        map2 = zze();
                        this.zzf = map2;
                    }
                } catch (Throwable th) {
                    Throwable th2 = th;
                    Object obj3 = obj2;
                    throw th2;
                }
            }
        }
        return map2 != null ? map2 : Collections.emptyMap();
    }

    public final void zza() {
        Throwable th;
        Object obj = this.zze;
        Object obj2 = obj;
        synchronized (obj) {
            try {
                this.zzf = null;
                zzcx.zza();
                synchronized (this) {
                    try {
                        for (zzck zza2 : this.zzg) {
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

    private final Map<String, String> zze() {
        zzcp zzcp;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            new zzci(this);
            Map<String, String> map = (Map) zzcm.zza(zzcp);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return map;
        } catch (SQLiteException | IllegalStateException | SecurityException e) {
            int e2 = Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return null;
        } catch (Throwable th) {
            Throwable th2 = th;
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th2;
        }
    }

    static synchronized void zzb() {
        synchronized (zzcj.class) {
            for (zzcj next : zza.values()) {
                next.zzb.unregisterContentObserver(next.zzd);
            }
            zza.clear();
        }
    }

    public final /* synthetic */ Object zza(String str) {
        return zzd().get(str);
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public final /* synthetic */ Map zzc() {
        Map map;
        Map map2;
        Map map3;
        Cursor query = this.zzb.query(this.zzc, zzh, (String) null, (String[]) null, (String) null);
        Cursor cursor = query;
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = cursor.getCount();
            int i = count;
            if (count == 0) {
                Map emptyMap = Collections.emptyMap();
                cursor.close();
                return emptyMap;
            }
            if (i <= 256) {
                map2 = map3;
                new ArrayMap(i);
            } else {
                map2 = map;
                new HashMap(i, 1.0f);
            }
            Map map4 = map2;
            while (cursor.moveToNext()) {
                Object put = map4.put(cursor.getString(0), cursor.getString(1));
            }
            Map map5 = map4;
            cursor.close();
            return map5;
        } catch (Throwable th) {
            Throwable th2 = th;
            cursor.close();
            throw th2;
        }
    }

    static {
        Map<Uri, zzcj> map;
        new ArrayMap();
        zza = map;
        String[] strArr = new String[2];
        strArr[0] = "key";
        String[] strArr2 = strArr;
        strArr2[1] = "value";
        zzh = strArr2;
    }
}
