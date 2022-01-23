package com.google.android.gms.internal.auth;

import android.content.Context;
import android.net.Uri;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class zzdf {
    final String zza;
    final Uri zzb;
    final String zzc;
    final String zzd;
    final boolean zze;
    final boolean zzf;
    final boolean zzg;
    final boolean zzh;
    @Nullable
    final zzdp<Context, Boolean> zzi;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public zzdf(Uri uri) {
        this((String) null, uri, "", "", false, false, false, false, (zzdp<Context, Boolean>) null);
    }

    private zzdf(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, @Nullable zzdp<Context, Boolean> zzdp) {
        this.zza = str;
        this.zzb = uri;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = z;
        this.zzf = z2;
        this.zzg = z3;
        this.zzh = z4;
        this.zzi = zzdp;
    }

    public final zzdf zza() {
        zzdf zzdf;
        Throwable th;
        Throwable th2;
        if (!this.zzc.isEmpty()) {
            Throwable th3 = th2;
            new IllegalStateException("Cannot set GServices prefix and skip GServices");
            throw th3;
        } else if (this.zzi != null) {
            Throwable th4 = th;
            new IllegalStateException("Cannot skip gservices both always and conditionally");
            throw th4;
        } else {
            new zzdf(this.zza, this.zzb, this.zzc, this.zzd, true, this.zzf, this.zzg, this.zzh, this.zzi);
            return zzdf;
        }
    }

    public final zzcx<Long> zza(String str, long j) {
        return zzcx.zza(this, str, j, true);
    }

    public final zzcx<Boolean> zza(String str, boolean z) {
        return zzcx.zza(this, str, z, true);
    }

    public final zzcx<Double> zza(String str, double d) {
        double d2 = d;
        return zzcx.zza(this, str, 0.0d, true);
    }

    public final <T> zzcx<T> zza(String str, T t, zzdc<T> zzdc) {
        return zzcx.zza(this, str, t, zzdc, true);
    }
}
