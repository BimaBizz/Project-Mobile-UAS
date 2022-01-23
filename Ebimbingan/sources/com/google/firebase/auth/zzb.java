package com.google.firebase.auth;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0446Preconditions;
import com.google.android.gms.internal.firebase_auth.zzaz;
import java.util.Set;

public final class zzb {
    private static final zzaz<String, Integer> zzhz = zzaz.zzb("recoverEmail", 2, "resetPassword", 0, "signIn", 4, "verifyEmail", 1);
    private final String zzht;
    private final String zzhu;
    private final String zzhv;
    @Nullable
    private final String zzhw;
    @Nullable
    private final String zzhx;
    @Nullable
    private final String zzhy;

    private zzb(String str) {
        Throwable th;
        String str2 = str;
        this.zzht = zza(str2, "apiKey");
        this.zzhu = zza(str2, "oobCode");
        this.zzhv = zza(str2, "mode");
        if (this.zzht == null || this.zzhu == null || this.zzhv == null) {
            Throwable th2 = th;
            Object[] objArr = new Object[3];
            objArr[0] = "apiKey";
            Object[] objArr2 = objArr;
            objArr2[1] = "oobCode";
            Object[] objArr3 = objArr2;
            objArr3[2] = "mode";
            new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", objArr3));
            throw th2;
        }
        this.zzhw = zza(str2, "continueUrl");
        this.zzhx = zza(str2, "languageCode");
        this.zzhy = zza(str2, "tenantId");
    }

    @Nullable
    public static zzb zzbr(String str) {
        zzb zzb;
        String str2 = str;
        String checkNotEmpty = C0446Preconditions.checkNotEmpty(str2);
        try {
            zzb zzb2 = zzb;
            new zzb(str2);
            return zzb2;
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    public final int getOperation() {
        return zzhz.getOrDefault(this.zzhv, 3).intValue();
    }

    public final String zzcn() {
        return this.zzhu;
    }

    @Nullable
    public final String zzba() {
        return this.zzhy;
    }

    private static String zza(String str, String str2) {
        String str3 = str2;
        Uri parse = Uri.parse(str);
        try {
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            Set<String> set = queryParameterNames;
            if (queryParameterNames.contains(str3)) {
                return parse.getQueryParameter(str3);
            }
            if (set.contains("link")) {
                return Uri.parse(parse.getQueryParameter("link")).getQueryParameter(str3);
            }
            return null;
        } catch (UnsupportedOperationException e) {
        }
    }
}
