package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzih extends zzic {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private zzih() {
        super((zzif) null);
    }

    /* access modifiers changed from: package-private */
    public final void zza(Object obj, long j) {
        zzb(obj, j).zzb();
    }

    /* access modifiers changed from: package-private */
    public final <E> void zza(Object obj, Object obj2, long j) {
        Object obj3 = obj;
        long j2 = j;
        zzht zzb = zzb(obj3, j2);
        zzht zzb2 = zzb(obj2, j2);
        int size = zzb.size();
        int size2 = zzb2.size();
        if (size > 0 && size2 > 0) {
            if (!zzb.zza()) {
                zzb = zzb.zza(size + size2);
            }
            boolean addAll = zzb.addAll(zzb2);
        }
        zzkg.zza(obj3, j2, (Object) size > 0 ? zzb : zzb2);
    }

    private static <E> zzht<E> zzb(Object obj, long j) {
        return (zzht) zzkg.zzf(obj, j);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ zzih(zzif zzif) {
        this();
        zzif zzif2 = zzif;
    }
}
