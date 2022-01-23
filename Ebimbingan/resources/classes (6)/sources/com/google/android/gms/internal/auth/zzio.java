package com.google.android.gms.internal.auth;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzio implements zzip {
    zzio() {
    }

    public final Map<?, ?> zza(Object obj) {
        return (zzim) obj;
    }

    public final zzin<?, ?> zzb(Object obj) {
        Throwable th;
        zzik zzik = (zzik) obj;
        Throwable th2 = th;
        new NoSuchMethodError();
        throw th2;
    }

    public final Map<?, ?> zzc(Object obj) {
        return (zzim) obj;
    }

    public final boolean zzd(Object obj) {
        return !((zzim) obj).zzd();
    }

    public final Object zze(Object obj) {
        Object obj2 = obj;
        ((zzim) obj2).zzc();
        return obj2;
    }

    public final Object zzf(Object obj) {
        Object obj2 = obj;
        return zzim.zza().zzb();
    }

    public final Object zza(Object obj, Object obj2) {
        zzim zzim = (zzim) obj;
        zzim zzim2 = (zzim) obj2;
        zzim zzim3 = zzim2;
        if (!zzim2.isEmpty()) {
            if (!zzim.zzd()) {
                zzim = zzim.zzb();
            }
            zzim.zza(zzim3);
        }
        return zzim;
    }

    public final int zza(int i, Object obj, Object obj2) {
        Throwable th;
        int i2 = i;
        zzim zzim = (zzim) obj;
        zzik zzik = (zzik) obj2;
        if (zzim.isEmpty()) {
            return 0;
        }
        Iterator it = zzim.entrySet().iterator();
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
