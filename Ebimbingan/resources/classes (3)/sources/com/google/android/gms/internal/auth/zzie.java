package com.google.android.gms.internal.auth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzie extends zzic {
    private static final Class<?> zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private zzie() {
        super((zzif) null);
    }

    /* access modifiers changed from: package-private */
    public final void zza(Object obj, long j) {
        zzid unmodifiableList;
        Object obj2 = obj;
        long j2 = j;
        List list = (List) zzkg.zzf(obj2, j2);
        List list2 = list;
        if (list instanceof zzid) {
            unmodifiableList = ((zzid) list2).zze();
        } else if (!zza.isAssignableFrom(list2.getClass())) {
            if (!(list2 instanceof zzje) || !(list2 instanceof zzht)) {
                unmodifiableList = Collections.unmodifiableList(list2);
            } else if (((zzht) list2).zza()) {
                ((zzht) list2).zzb();
                return;
            } else {
                return;
            }
        } else {
            return;
        }
        zzkg.zza(obj2, j2, (Object) unmodifiableList);
    }

    /* access modifiers changed from: package-private */
    public final <E> void zza(Object obj, Object obj2, long j) {
        zzgc zzgc;
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
        zzht zzht = zzb2;
        if (zzb2.isEmpty()) {
            if (zzht instanceof zzid) {
                new zzia(size);
                zzht = list2;
            } else if (!(zzht instanceof zzje) || !(zzht instanceof zzht)) {
                new ArrayList(size);
                zzht = list;
            } else {
                zzht = ((zzht) zzht).zza(size);
            }
            zzkg.zza(obj5, j3, (Object) zzht);
        } else if (zza.isAssignableFrom(zzht.getClass())) {
            new ArrayList(zzht.size() + size);
            ArrayList arrayList2 = arrayList;
            boolean addAll = arrayList2.addAll(zzht);
            zzht = arrayList2;
            zzkg.zza(obj5, j3, (Object) zzht);
        } else if (zzht instanceof zzkf) {
            new zzia(zzht.size() + size);
            zzgc zzgc2 = zzgc;
            boolean addAll2 = zzgc2.addAll((zzkf) zzht);
            zzht = zzgc2;
            zzkg.zza(obj5, j3, (Object) zzht);
        } else if ((zzht instanceof zzje) && (zzht instanceof zzht) && !((zzht) zzht).zza()) {
            zzht = ((zzht) zzht).zza(zzht.size() + size);
            zzkg.zza(obj5, j3, (Object) zzht);
        }
        List list3 = zzht;
        List list4 = list3;
        int size2 = list3.size();
        int size3 = zzb.size();
        if (size2 > 0 && size3 > 0) {
            boolean addAll3 = list4.addAll(zzb);
        }
        zzkg.zza(obj3, j2, (Object) size2 > 0 ? list4 : zzb);
    }

    private static <E> List<E> zzb(Object obj, long j) {
        return (List) zzkg.zzf(obj, j);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ zzie(zzif zzif) {
        this();
        zzif zzif2 = zzif;
    }
}
