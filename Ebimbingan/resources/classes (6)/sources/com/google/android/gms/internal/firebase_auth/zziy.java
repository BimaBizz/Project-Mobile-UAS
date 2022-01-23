package com.google.android.gms.internal.firebase_auth;

import java.util.Iterator;
import java.util.Map;

final class zziy implements zziv {
    zziy() {
    }

    public final Map<?, ?> zzi(Object obj) {
        return (zziw) obj;
    }

    public final zzit<?, ?> zzn(Object obj) {
        Throwable th;
        Object obj2 = obj;
        Throwable th2 = th;
        new NoSuchMethodError();
        throw th2;
    }

    public final Map<?, ?> zzj(Object obj) {
        return (zziw) obj;
    }

    public final boolean zzk(Object obj) {
        return !((zziw) obj).isMutable();
    }

    public final Object zzl(Object obj) {
        Object obj2 = obj;
        ((zziw) obj2).zzfy();
        return obj2;
    }

    public final Object zzm(Object obj) {
        Object obj2 = obj;
        return zziw.zzji().zzjj();
    }

    public final Object zzc(Object obj, Object obj2) {
        zziw zziw = (zziw) obj;
        zziw zziw2 = (zziw) obj2;
        zziw zziw3 = zziw2;
        if (!zziw2.isEmpty()) {
            if (!zziw.isMutable()) {
                zziw = zziw.zzjj();
            }
            zziw.zza(zziw3);
        }
        return zziw;
    }

    public final int zzb(int i, Object obj, Object obj2) {
        Throwable th;
        int i2 = i;
        Object obj3 = obj2;
        Object obj4 = obj;
        Object obj5 = obj4;
        zziw zziw = (zziw) obj4;
        zziw zziw2 = zziw;
        if (zziw.isEmpty()) {
            return 0;
        }
        Iterator it = zziw2.entrySet().iterator();
        Iterator it2 = it;
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it2.next();
        Object key = entry.getKey();
        Object value = entry.getValue();
        Throwable th2 = th;
        new NoSuchMethodError();
        throw th2;
    }
}
