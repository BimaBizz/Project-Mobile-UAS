package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final /* synthetic */ class zzbo implements RemoteCall {
    private final zzbp zza;
    private final ProxyRequest zzb;

    zzbo(zzbp zzbp, ProxyRequest proxyRequest) {
        this.zza = zzbp;
        this.zzb = proxyRequest;
    }

    public final void accept(Object obj, Object obj2) {
        zzbj zzbj;
        zzbp zzbp = this.zza;
        ProxyRequest proxyRequest = this.zzb;
        new zzbq(zzbp, (TaskCompletionSource) obj2);
        zzbj zzbj2 = zzbj;
        ((zzbl) ((zzbg) obj).getService()).zza(zzbj2, proxyRequest);
    }
}
