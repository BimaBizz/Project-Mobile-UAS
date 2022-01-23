package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzbw extends zzbh {
    private final /* synthetic */ zzbx zza;

    zzbw(zzbx zzbx) {
        this.zza = zzbx;
    }

    public final void zza(String str) {
        Status status;
        Result result;
        String str2 = str;
        if (str2 != null) {
            new zzby(str2);
            this.zza.setResult(result);
            return;
        }
        zzbx zzbx = this.zza;
        new Status(AuthApiStatusCodes.AUTH_APP_CERT_ERROR);
        zzbx.setResult(zzbx.zza(status));
    }
}
