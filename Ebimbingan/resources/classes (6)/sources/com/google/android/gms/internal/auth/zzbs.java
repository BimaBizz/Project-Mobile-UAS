package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class zzbs implements ProxyApi {
    public zzbs() {
    }

    public final PendingResult<ProxyApi.ProxyResult> performProxyRequest(GoogleApiClient googleApiClient, ProxyRequest proxyRequest) {
        BaseImplementation.ApiMethodImpl apiMethodImpl;
        GoogleApiClient googleApiClient2 = googleApiClient;
        ProxyRequest proxyRequest2 = proxyRequest;
        Object checkNotNull = Preconditions.checkNotNull(googleApiClient2);
        Object checkNotNull2 = Preconditions.checkNotNull(proxyRequest2);
        new zzbv(this, googleApiClient2, proxyRequest2);
        return googleApiClient2.execute(apiMethodImpl);
    }

    public final PendingResult<ProxyApi.SpatulaHeaderResult> getSpatulaHeader(GoogleApiClient googleApiClient) {
        BaseImplementation.ApiMethodImpl apiMethodImpl;
        GoogleApiClient googleApiClient2 = googleApiClient;
        Object checkNotNull = Preconditions.checkNotNull(googleApiClient2);
        new zzbx(this, googleApiClient2);
        return googleApiClient2.execute(apiMethodImpl);
    }
}
