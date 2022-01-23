package com.google.android.gms.internal.auth;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.auth.zzkc */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C1049zzkc extends C1047zzka<C1050zzkd, C1050zzkd> {
    C1049zzkc() {
    }

    private static void zza(Object obj, C1050zzkd zzkd) {
        ((C0978zzhm) obj).zzb = zzkd;
    }

    /* access modifiers changed from: package-private */
    public final void zzb(Object obj) {
        ((C0978zzhm) obj).zzb.zzc();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ int zzd(Object obj) {
        return ((C1050zzkd) obj).zze();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ int zzc(Object obj) {
        return ((C1050zzkd) obj).zzd();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzc(Object obj, Object obj2) {
        C1050zzkd zzkd = (C1050zzkd) obj2;
        C1050zzkd zzkd2 = (C1050zzkd) obj;
        if (zzkd.equals(C1050zzkd.zza())) {
            return zzkd2;
        }
        return C1050zzkd.zza(zzkd2, zzkd);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(Object obj, C1070zzkx zzkx) throws IOException {
        ((C1050zzkd) obj).zza(zzkx);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Object obj, C1070zzkx zzkx) throws IOException {
        ((C1050zzkd) obj).zzb(zzkx);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(Object obj, Object obj2) {
        C1050zzkd zzkd = (C1050zzkd) obj2;
        C1050zzkd zzkd2 = zzkd;
        zza(obj, zzkd);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zza(Object obj) {
        return ((C0978zzhm) obj).zzb;
    }

    /* access modifiers changed from: package-private */
    public final /* bridge */ /* synthetic */ void zza(Object obj, Object obj2) {
        zza(obj, (C1050zzkd) obj2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zza() {
        return C1050zzkd.zzb();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Object obj, int i, C0947zzgi zzgi) {
        ((C1050zzkd) obj).zza((i << 3) | 2, (Object) zzgi);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Object obj, int i, long j) {
        ((C1050zzkd) obj).zza(i << 3, (Object) Long.valueOf(j));
    }
}
