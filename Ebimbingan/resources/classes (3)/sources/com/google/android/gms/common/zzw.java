package com.google.android.gms.common;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import java.security.MessageDigest;
import java.util.concurrent.Callable;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

@CheckReturnValue
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
class zzw {
    private static final zzw zzd;
    final boolean zza;
    @Nullable
    final String zzb;
    @Nullable
    final Throwable zzc;

    static {
        zzw zzw;
        new zzw(true, (String) null, (Throwable) null);
        zzd = zzw;
    }

    zzw(boolean z, @Nullable String str, @Nullable Throwable th) {
        this.zza = z;
        this.zzb = str;
        this.zzc = th;
    }

    static zzw zzb() {
        return zzd;
    }

    static zzw zzc(Callable<String> callable) {
        zzw zzw;
        new zzv(callable, (zzu) null);
        return zzw;
    }

    static zzw zzd(@NonNull String str) {
        zzw zzw;
        new zzw(false, str, (Throwable) null);
        return zzw;
    }

    static zzw zze(@NonNull String str, @NonNull Throwable th) {
        zzw zzw;
        new zzw(false, str, th);
        return zzw;
    }

    static String zzg(String str, zzi zzi, boolean z, boolean z2) {
        Object obj;
        String str2 = str;
        zzi zzi2 = zzi;
        boolean z3 = z;
        if (true != z2) {
            obj = "not allowed";
        } else {
            obj = "debug cert rejected";
        }
        MessageDigest zza2 = AndroidUtilsLight.zza("SHA-1");
        Object checkNotNull = Preconditions.checkNotNull(zza2);
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", new Object[]{obj, str2, Hex.bytesToStringLowercase(zza2.digest(zzi2.zzc())), Boolean.valueOf(z3), "12451000.false"});
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public String zza() {
        return this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final void zzf() {
        if (!this.zza && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (this.zzc != null) {
                int d = Log.d("GoogleCertificatesRslt", zza(), this.zzc);
            } else {
                int d2 = Log.d("GoogleCertificatesRslt", zza());
            }
        }
    }
}
