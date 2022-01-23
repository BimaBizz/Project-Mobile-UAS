package com.google.android.gms.internal.auth;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public class zzcf {
    public static final Uri zza = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Pattern zzb = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern zzc = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    private static final Uri zzd = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    /* access modifiers changed from: private */
    public static final AtomicBoolean zze;
    private static HashMap<String, String> zzf;
    private static final HashMap<String, Boolean> zzg;
    private static final HashMap<String, Integer> zzh;
    private static final HashMap<String, Long> zzi;
    private static final HashMap<String, Float> zzj;
    private static Object zzk;
    private static boolean zzl;
    private static String[] zzm = new String[0];

    public zzcf() {
    }

    /* JADX INFO: finally extract failed */
    public static String zza(ContentResolver contentResolver, String str, String str2) {
        Object obj;
        String str3;
        HashMap<String, String> hashMap;
        Object obj2;
        ContentObserver contentObserver;
        ContentResolver contentResolver2 = contentResolver;
        String str4 = str;
        String str5 = str2;
        Class<zzcf> cls = zzcf.class;
        Class<zzcf> cls2 = cls;
        synchronized (cls) {
            ContentResolver contentResolver3 = contentResolver2;
            try {
                if (zzf == null) {
                    zze.set(false);
                    new HashMap();
                    zzf = hashMap;
                    new Object();
                    zzk = obj2;
                    zzl = false;
                    new zzce((Handler) null);
                    contentResolver3.registerContentObserver(zza, true, contentObserver);
                } else if (zze.getAndSet(false)) {
                    zzf.clear();
                    zzg.clear();
                    zzh.clear();
                    zzi.clear();
                    zzj.clear();
                    new Object();
                    zzk = obj;
                    zzl = false;
                }
                Object obj3 = zzk;
                if (zzf.containsKey(str4)) {
                    String str6 = zzf.get(str4);
                    String str7 = str6;
                    if (str6 != null) {
                        str3 = str7;
                    } else {
                        str3 = null;
                    }
                    return str3;
                }
                String[] strArr = zzm;
                String[] strArr2 = strArr;
                int length = strArr.length;
                for (int i = 0; i < length; i++) {
                    if (str4.startsWith(strArr2[i])) {
                        if (!zzl || zzf.isEmpty()) {
                            zzf.putAll(zza(contentResolver2, zzm));
                            zzl = true;
                            if (zzf.containsKey(str4)) {
                                String str8 = zzf.get(str4);
                                String str9 = str8 != null ? str8 : null;
                                return str9;
                            }
                        }
                        return null;
                    }
                }
                Cursor query = contentResolver2.query(zza, (String[]) null, (String) null, new String[]{str4}, (String) null);
                Cursor cursor = query;
                if (query == null) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
                try {
                    if (!cursor.moveToFirst()) {
                        zza(obj3, str4, (String) null);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    String string = cursor.getString(1);
                    String str10 = string;
                    if (string != null && str10.equals((Object) null)) {
                        str10 = null;
                    }
                    zza(obj3, str4, str10);
                    String str11 = str10 != null ? str10 : null;
                    if (cursor != null) {
                        cursor.close();
                    }
                    return str11;
                } catch (Throwable th) {
                    Throwable th2 = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                Throwable th4 = th3;
                Class<zzcf> cls3 = cls2;
                throw th4;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    private static void zza(Object obj, String str, String str2) {
        Object obj2 = obj;
        String str3 = str;
        String str4 = str2;
        Class<zzcf> cls = zzcf.class;
        Class<zzcf> cls2 = cls;
        synchronized (cls) {
            try {
                if (obj2 == zzk) {
                    String put = zzf.put(str3, str4);
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                Class<zzcf> cls3 = cls2;
                throw th2;
            }
        }
    }

    private static Map<String, String> zza(ContentResolver contentResolver, String... strArr) {
        TreeMap treeMap;
        Cursor query = contentResolver.query(zzd, (String[]) null, (String) null, strArr, (String) null);
        new TreeMap();
        TreeMap treeMap2 = treeMap;
        if (query == null) {
            return treeMap2;
        }
        while (query.moveToNext()) {
            try {
                Object put = treeMap2.put(query.getString(0), query.getString(1));
            } catch (Throwable th) {
                Throwable th2 = th;
                query.close();
                throw th2;
            }
        }
        query.close();
        return treeMap2;
    }

    static {
        AtomicBoolean atomicBoolean;
        HashMap<String, Boolean> hashMap;
        HashMap<String, Integer> hashMap2;
        HashMap<String, Long> hashMap3;
        HashMap<String, Float> hashMap4;
        new AtomicBoolean();
        zze = atomicBoolean;
        new HashMap<>();
        zzg = hashMap;
        new HashMap<>();
        zzh = hashMap2;
        new HashMap<>();
        zzi = hashMap3;
        new HashMap<>();
        zzj = hashMap4;
    }
}
