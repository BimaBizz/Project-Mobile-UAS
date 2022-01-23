package com.google.android.gms.internal.auth;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzkc extends zzka<zzkd, zzkd> {
    zzkc() {
    }

    private static void zza(Object obj, zzkd zzkd) {
        ((zzhm) obj).zzb = zzkd;
    }

    /* access modifiers changed from: package-private */
    public final void zzb(Object obj) {
        ((zzhm) obj).zzb.zzc();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ int zzd(Object obj) {
        return ((zzkd) obj).zze();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ int zzc(Object obj) {
        return ((zzkd) obj).zzd();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzc(Object obj, Object obj2) {
        zzkd zzkd = (zzkd) obj2;
        zzkd zzkd2 = (zzkd) obj;
        if (zzkd.equals(zzkd.zza())) {
            return zzkd2;
        }
        return zzkd.zza(zzkd2, zzkd);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(Object obj, zzkx zzkx) throws IOException {
        ((zzkd) obj).zza(zzkx);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Object obj, zzkx zzkx) throws IOException {
        ((zzkd) obj).zzb(zzkx);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(Object obj, Object obj2) {
        zzkd zzkd = (zzkd) obj2;
        zzkd zzkd2 = zzkd;
        zza(obj, zzkd);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zza(Object obj) {
        return ((zzhm) obj).zzb;
    }

    /* access modifiers changed from: package-private */
    public final /* bridge */ /* synthetic */ void zza(Object obj, Object obj2) {
        zza(obj, (zzkd) obj2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zza() {
        return zzkd.zzb();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Object obj, int i, zzgi zzgi) {
        ((zzkd) obj).zza((i << 3) | 2, (Object) zzgi);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Object obj, int i, long j) {
        ((zzkd) obj).zza(i << 3, (Object) Long.valueOf(j));
    }
}
