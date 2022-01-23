package com.google.android.gms.internal.firebase_auth;

import java.util.List;

final class zzin extends zzim {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private zzin() {
        super((zzil) null);
    }

    /* access modifiers changed from: package-private */
    public final <L> List<L> zza(Object obj, long j) {
        Object obj2 = obj;
        long j2 = j;
        zzhz zzc = zzc(obj2, j2);
        zzhz zzhz = zzc;
        if (!zzc.zzfx()) {
            int size = zzhz.size();
            zzhz = zzhz.zzo(size == 0 ? 10 : size << 1);
            zzkq.zza(obj2, j2, (Object) zzhz);
        }
        return zzhz;
    }

    /* access modifiers changed from: package-private */
    public final void zzb(Object obj, long j) {
        zzc(obj, j).zzfy();
    }

    /* access modifiers changed from: package-private */
    public final <E> void zza(Object obj, Object obj2, long j) {
        Object obj3 = obj;
        long j2 = j;
        zzhz zzc = zzc(obj3, j2);
        zzhz zzc2 = zzc(obj2, j2);
        int size = zzc.size();
        int size2 = zzc2.size();
        if (size > 0 && size2 > 0) {
            if (!zzc.zzfx()) {
                zzc = zzc.zzo(size + size2);
            }
            boolean addAll = zzc.addAll(zzc2);
        }
        zzkq.zza(obj3, j2, (Object) size > 0 ? zzc : zzc2);
    }

    private static <E> zzhz<E> zzc(Object obj, long j) {
        return (zzhz) zzkq.zzp(obj, j);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ zzin(zzil zzil) {
        this();
        zzil zzil2 = zzil;
    }
}
