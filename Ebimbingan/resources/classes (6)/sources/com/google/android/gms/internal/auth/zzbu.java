package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.Result;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzbu extends zzbh {
    private final /* synthetic */ zzbv zza;

    zzbu(zzbv zzbv) {
        this.zza = zzbv;
    }

    public final void zza(ProxyResponse proxyResponse) {
        Result result;
        new zzbz(proxyResponse);
        this.zza.setResult(result);
    }
}
