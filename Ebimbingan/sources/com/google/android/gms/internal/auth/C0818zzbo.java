package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.C0117ProxyRequest;
import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth.zzbo */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final /* synthetic */ class C0818zzbo implements C0262RemoteCall {
    private final C0819zzbp zza;
    private final C0117ProxyRequest zzb;

    C0818zzbo(C0819zzbp zzbp, C0117ProxyRequest proxyRequest) {
        this.zza = zzbp;
        this.zzb = proxyRequest;
    }

    public final void accept(Object obj, Object obj2) {
        C0813zzbj zzbj;
        C0819zzbp zzbp = this.zza;
        C0117ProxyRequest proxyRequest = this.zzb;
        new C0820zzbq(zzbp, (TaskCompletionSource) obj2);
        C0813zzbj zzbj2 = zzbj;
        ((C0815zzbl) ((C0810zzbg) obj).getService()).zza(zzbj2, proxyRequest);
    }
}
