package com.google.android.gms.common;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.common.util.C0587AndroidUtilsLight;
import com.google.android.gms.common.util.C0601Hex;
import java.security.MessageDigest;
import java.util.concurrent.Callable;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

@CheckReturnValue
/* renamed from: com.google.android.gms.common.zzw */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
class C0654zzw {
    private static final C0654zzw zzd;
    final boolean zza;
    @Nullable
    final String zzb;
    @Nullable
    final Throwable zzc;

    static {
        C0654zzw zzw;
        new C0654zzw(true, (String) null, (Throwable) null);
        zzd = zzw;
    }

    C0654zzw(boolean z, @Nullable String str, @Nullable Throwable th) {
        this.zza = z;
        this.zzb = str;
        this.zzc = th;
    }

    static C0654zzw zzb() {
        return zzd;
    }

    static C0654zzw zzc(Callable<String> callable) {
        C0654zzw zzw;
        new C0653zzv(callable, (C0652zzu) null);
        return zzw;
    }

    static C0654zzw zzd(@NonNull String str) {
        C0654zzw zzw;
        new C0654zzw(false, str, (Throwable) null);
        return zzw;
    }

    static C0654zzw zze(@NonNull String str, @NonNull Throwable th) {
        C0654zzw zzw;
        new C0654zzw(false, str, th);
        return zzw;
    }

    static String zzg(String str, C0640zzi zzi, boolean z, boolean z2) {
        Object obj;
        String str2 = str;
        C0640zzi zzi2 = zzi;
        boolean z3 = z;
        if (true != z2) {
            obj = "not allowed";
        } else {
            obj = "debug cert rejected";
        }
        MessageDigest zza2 = C0587AndroidUtilsLight.zza("SHA-1");
        Object checkNotNull = C0446Preconditions.checkNotNull(zza2);
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", new Object[]{obj, str2, C0601Hex.bytesToStringLowercase(zza2.digest(zzi2.zzc())), Boolean.valueOf(z3), "12451000.false"});
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
