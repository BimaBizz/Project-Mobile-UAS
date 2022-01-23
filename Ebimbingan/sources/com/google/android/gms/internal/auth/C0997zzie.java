package com.google.android.gms.internal.auth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.auth.zzie */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0997zzie extends C0995zzic {
    private static final Class<?> zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C0997zzie() {
        super((C0998zzif) null);
    }

    /* access modifiers changed from: package-private */
    public final void zza(Object obj, long j) {
        C0996zzid unmodifiableList;
        Object obj2 = obj;
        long j2 = j;
        List list = (List) C1053zzkg.zzf(obj2, j2);
        List list2 = list;
        if (list instanceof C0996zzid) {
            unmodifiableList = ((C0996zzid) list2).zze();
        } else if (!zza.isAssignableFrom(list2.getClass())) {
            if (!(list2 instanceof C1024zzje) || !(list2 instanceof C0985zzht)) {
                unmodifiableList = Collections.unmodifiableList(list2);
            } else if (((C0985zzht) list2).zza()) {
                ((C0985zzht) list2).zzb();
                return;
            } else {
                return;
            }
        } else {
            return;
        }
        C1053zzkg.zza(obj2, j2, (Object) unmodifiableList);
    }

    /* access modifiers changed from: package-private */
    public final <E> void zza(Object obj, Object obj2, long j) {
        C0941zzgc zzgc;
        ArrayList arrayList;
        List list;
        List list2;
        Object obj3 = obj;
        long j2 = j;
        List zzb = zzb(obj2, j2);
        int size = zzb.size();
        long j3 = j2;
        Object obj4 = obj3;
        Object obj5 = obj4;
        List zzb2 = zzb(obj4, j3);
        C0985zzht zzht = zzb2;
        if (zzb2.isEmpty()) {
            if (zzht instanceof C0996zzid) {
                new C0993zzia(size);
                zzht = list2;
            } else if (!(zzht instanceof C1024zzje) || !(zzht instanceof C0985zzht)) {
                new ArrayList(size);
                zzht = list;
            } else {
                zzht = ((C0985zzht) zzht).zza(size);
            }
            C1053zzkg.zza(obj5, j3, (Object) zzht);
        } else if (zza.isAssignableFrom(zzht.getClass())) {
            new ArrayList(zzht.size() + size);
            ArrayList arrayList2 = arrayList;
            boolean addAll = arrayList2.addAll(zzht);
            zzht = arrayList2;
            C1053zzkg.zza(obj5, j3, (Object) zzht);
        } else if (zzht instanceof C1052zzkf) {
            new C0993zzia(zzht.size() + size);
            C0941zzgc zzgc2 = zzgc;
            boolean addAll2 = zzgc2.addAll((C1052zzkf) zzht);
            zzht = zzgc2;
            C1053zzkg.zza(obj5, j3, (Object) zzht);
        } else if ((zzht instanceof C1024zzje) && (zzht instanceof C0985zzht) && !((C0985zzht) zzht).zza()) {
            zzht = ((C0985zzht) zzht).zza(zzht.size() + size);
            C1053zzkg.zza(obj5, j3, (Object) zzht);
        }
        List list3 = zzht;
        List list4 = list3;
        int size2 = list3.size();
        int size3 = zzb.size();
        if (size2 > 0 && size3 > 0) {
            boolean addAll3 = list4.addAll(zzb);
        }
        C1053zzkg.zza(obj3, j2, (Object) size2 > 0 ? list4 : zzb);
    }

    private static <E> List<E> zzb(Object obj, long j) {
        return (List) C1053zzkg.zzf(obj, j);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ C0997zzie(C0998zzif zzif) {
        this();
        C0998zzif zzif2 = zzif;
    }
}
