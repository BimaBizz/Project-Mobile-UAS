package com.google.android.gms.internal.auth;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.auth.zzfs */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0930zzfs {
    private final ConcurrentHashMap<C0933zzfv, List<Throwable>> zza;
    private final ReferenceQueue<Throwable> zzb;

    C0930zzfs() {
        ConcurrentHashMap<C0933zzfv, List<Throwable>> concurrentHashMap;
        ReferenceQueue<Throwable> referenceQueue;
        new ConcurrentHashMap<>(16, 0.75f, 10);
        this.zza = concurrentHashMap;
        new ReferenceQueue<>();
        this.zzb = referenceQueue;
    }

    public final List<Throwable> zza(Throwable th, boolean z) {
        Object obj;
        List<Throwable> list;
        Object obj2;
        Throwable th2 = th;
        boolean z2 = z;
        Reference<? extends Throwable> poll = this.zzb.poll();
        while (true) {
            Reference<? extends Throwable> reference = poll;
            if (reference == null) {
                break;
            }
            List<Throwable> remove = this.zza.remove(reference);
            poll = this.zzb.poll();
        }
        new C0933zzfv(th2, (ReferenceQueue<Throwable>) null);
        List<Throwable> list2 = this.zza.get(obj);
        List<Throwable> list3 = list2;
        if (list2 != null) {
            return list3;
        }
        new Vector(2);
        List<Throwable> list4 = list;
        new C0933zzfv(th2, this.zzb);
        List<Throwable> putIfAbsent = this.zza.putIfAbsent(obj2, list4);
        return putIfAbsent == null ? list4 : putIfAbsent;
    }
}
