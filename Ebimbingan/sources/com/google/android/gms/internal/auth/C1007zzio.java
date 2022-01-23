package com.google.android.gms.internal.auth;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.auth.zzio */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C1007zzio implements C1008zzip {
    C1007zzio() {
    }

    public final Map<?, ?> zza(Object obj) {
        return (C1005zzim) obj;
    }

    public final C1006zzin<?, ?> zzb(Object obj) {
        Throwable th;
        C1003zzik zzik = (C1003zzik) obj;
        Throwable th2 = th;
        new NoSuchMethodError();
        throw th2;
    }

    public final Map<?, ?> zzc(Object obj) {
        return (C1005zzim) obj;
    }

    public final boolean zzd(Object obj) {
        return !((C1005zzim) obj).zzd();
    }

    public final Object zze(Object obj) {
        Object obj2 = obj;
        ((C1005zzim) obj2).zzc();
        return obj2;
    }

    public final Object zzf(Object obj) {
        Object obj2 = obj;
        return C1005zzim.zza().zzb();
    }

    public final Object zza(Object obj, Object obj2) {
        C1005zzim zzim = (C1005zzim) obj;
        C1005zzim zzim2 = (C1005zzim) obj2;
        C1005zzim zzim3 = zzim2;
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
        C1005zzim zzim = (C1005zzim) obj;
        C1003zzik zzik = (C1003zzik) obj2;
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
