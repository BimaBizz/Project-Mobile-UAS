package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzbz implements ProxyApi.ProxyResult {
    private Status zza;
    private ProxyResponse zzb;

    public zzbz(ProxyResponse proxyResponse) {
        this.zzb = proxyResponse;
        this.zza = Status.RESULT_SUCCESS;
    }

    public zzbz(Status status) {
        this.zza = status;
    }

    public final Status getStatus() {
        return this.zza;
    }

    public final ProxyResponse getResponse() {
        return this.zzb;
    }
}
