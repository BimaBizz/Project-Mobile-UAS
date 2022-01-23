package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.C0115ProxyApi;
import com.google.android.gms.auth.api.proxy.C0117ProxyRequest;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0225PendingResult;
import com.google.android.gms.common.api.internal.C0243BaseImplementation;
import com.google.android.gms.common.internal.C0446Preconditions;

/* renamed from: com.google.android.gms.internal.auth.zzbs */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class C0822zzbs implements C0115ProxyApi {
    public C0822zzbs() {
    }

    public final C0225PendingResult<C0115ProxyApi.ProxyResult> performProxyRequest(C0222GoogleApiClient googleApiClient, C0117ProxyRequest proxyRequest) {
        C0243BaseImplementation.ApiMethodImpl apiMethodImpl;
        C0222GoogleApiClient googleApiClient2 = googleApiClient;
        C0117ProxyRequest proxyRequest2 = proxyRequest;
        Object checkNotNull = C0446Preconditions.checkNotNull(googleApiClient2);
        Object checkNotNull2 = C0446Preconditions.checkNotNull(proxyRequest2);
        new C0825zzbv(this, googleApiClient2, proxyRequest2);
        return googleApiClient2.execute(apiMethodImpl);
    }

    public final C0225PendingResult<C0115ProxyApi.SpatulaHeaderResult> getSpatulaHeader(C0222GoogleApiClient googleApiClient) {
        C0243BaseImplementation.ApiMethodImpl apiMethodImpl;
        C0222GoogleApiClient googleApiClient2 = googleApiClient;
        Object checkNotNull = C0446Preconditions.checkNotNull(googleApiClient2);
        new C0827zzbx(this, googleApiClient2);
        return googleApiClient2.execute(apiMethodImpl);
    }
}
