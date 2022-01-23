package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.C0115ProxyApi;
import com.google.android.gms.auth.api.proxy.C0118ProxyResponse;
import com.google.android.gms.common.api.C0236Status;

/* renamed from: com.google.android.gms.internal.auth.zzbz */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0829zzbz implements C0115ProxyApi.ProxyResult {
    private C0236Status zza;
    private C0118ProxyResponse zzb;

    public C0829zzbz(C0118ProxyResponse proxyResponse) {
        this.zzb = proxyResponse;
        this.zza = C0236Status.RESULT_SUCCESS;
    }

    public C0829zzbz(C0236Status status) {
        this.zza = status;
    }

    public final C0236Status getStatus() {
        return this.zza;
    }

    public final C0118ProxyResponse getResponse() {
        return this.zzb;
    }
}
