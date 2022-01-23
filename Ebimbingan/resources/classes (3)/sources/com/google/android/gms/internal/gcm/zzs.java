package com.google.android.gms.internal.gcm;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

final class zzs {
    private final ConcurrentHashMap<zzt, List<Throwable>> zzdt;
    private final ReferenceQueue<Throwable> zzdu;

    zzs() {
        ConcurrentHashMap<zzt, List<Throwable>> concurrentHashMap;
        ReferenceQueue<Throwable> referenceQueue;
        new ConcurrentHashMap<>(16, 0.75f, 10);
        this.zzdt = concurrentHashMap;
        new ReferenceQueue<>();
        this.zzdu = referenceQueue;
    }

    public final List<Throwable> zzd(Throwable th, boolean z) {
        Object obj;
        List<Throwable> list;
        Object obj2;
        Throwable th2 = th;
        boolean z2 = z;
        Reference<? extends Throwable> poll = this.zzdu.poll();
        while (true) {
            Reference<? extends Throwable> reference = poll;
            if (reference == null) {
                break;
            }
            List<Throwable> remove = this.zzdt.remove(reference);
            poll = this.zzdu.poll();
        }
        new zzt(th2, (ReferenceQueue<Throwable>) null);
        List<Throwable> list2 = this.zzdt.get(obj);
        List<Throwable> list3 = list2;
        if (list2 != null) {
            return list3;
        }
        new Vector(2);
        List<Throwable> list4 = list;
        new zzt(th2, this.zzdu);
        List<Throwable> putIfAbsent = this.zzdt.putIfAbsent(obj2, list4);
        return putIfAbsent == null ? list4 : putIfAbsent;
    }
}
