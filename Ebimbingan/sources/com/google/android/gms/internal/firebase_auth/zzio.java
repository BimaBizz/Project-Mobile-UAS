package com.google.android.gms.internal.firebase_auth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class zzio extends zzim {
    private static final Class<?> zzace = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private zzio() {
        super((zzil) null);
    }

    /* access modifiers changed from: package-private */
    public final <L> List<L> zza(Object obj, long j) {
        return zza(obj, j, 10);
    }

    /* access modifiers changed from: package-private */
    public final void zzb(Object obj, long j) {
        zzij unmodifiableList;
        Object obj2 = obj;
        long j2 = j;
        List list = (List) zzkq.zzp(obj2, j2);
        List list2 = list;
        if (list instanceof zzij) {
            unmodifiableList = ((zzij) list2).zzje();
        } else if (!zzace.isAssignableFrom(list2.getClass())) {
            if (!(list2 instanceof zzjl) || !(list2 instanceof zzhz)) {
                unmodifiableList = Collections.unmodifiableList(list2);
            } else if (((zzhz) list2).zzfx()) {
                ((zzhz) list2).zzfy();
                return;
            } else {
                return;
            }
        } else {
            return;
        }
        zzkq.zza(obj2, j2, (Object) unmodifiableList);
    }

    private static <L> List<L> zza(Object obj, long j, int i) {
        zzgb zzgb;
        ArrayList arrayList;
        List list;
        List list2;
        Object obj2 = obj;
        long j2 = j;
        int i2 = i;
        List zzd = zzd(obj2, j2);
        zzhz zzhz = zzd;
        if (zzd.isEmpty()) {
            if (zzhz instanceof zzij) {
                new zzik(i2);
                zzhz = list2;
            } else if (!(zzhz instanceof zzjl) || !(zzhz instanceof zzhz)) {
                new ArrayList(i2);
                zzhz = list;
            } else {
                zzhz = ((zzhz) zzhz).zzo(i2);
            }
            zzkq.zza(obj2, j2, (Object) zzhz);
        } else if (zzace.isAssignableFrom(zzhz.getClass())) {
            new ArrayList(zzhz.size() + i2);
            ArrayList arrayList2 = arrayList;
            boolean addAll = arrayList2.addAll(zzhz);
            zzhz = arrayList2;
            zzkq.zza(obj2, j2, (Object) zzhz);
        } else if (zzhz instanceof zzkp) {
            new zzik(zzhz.size() + i2);
            zzgb zzgb2 = zzgb;
            boolean addAll2 = zzgb2.addAll((zzkp) zzhz);
            zzhz = zzgb2;
            zzkq.zza(obj2, j2, (Object) zzhz);
        } else if ((zzhz instanceof zzjl) && (zzhz instanceof zzhz) && !((zzhz) zzhz).zzfx()) {
            zzhz = ((zzhz) zzhz).zzo(zzhz.size() + i2);
            zzkq.zza(obj2, j2, (Object) zzhz);
        }
        return zzhz;
    }

    /* access modifiers changed from: package-private */
    public final <E> void zza(Object obj, Object obj2, long j) {
        Object obj3 = obj;
        long j2 = j;
        List zzd = zzd(obj2, j2);
        List zza = zza(obj3, j2, zzd.size());
        List list = zza;
        int size = zza.size();
        int size2 = zzd.size();
        if (size > 0 && size2 > 0) {
            boolean addAll = list.addAll(zzd);
        }
        zzkq.zza(obj3, j2, (Object) size > 0 ? list : zzd);
    }

    private static <E> List<E> zzd(Object obj, long j) {
        return (List) zzkq.zzp(obj, j);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ zzio(zzil zzil) {
        this();
        zzil zzil2 = zzil;
    }
}
