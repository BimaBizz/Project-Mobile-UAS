package com.google.android.gms.auth.api.proxy;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
@KeepForSdk
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public interface ProxyApi {

    @ShowFirstParty
    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
    public interface ProxyResult extends Result {
        @KeepForSdk
        ProxyResponse getResponse();
    }

    @ShowFirstParty
    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
    public interface SpatulaHeaderResult extends Result {
        @ShowFirstParty
        @KeepForSdk
        String getSpatulaHeader();
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    PendingResult<SpatulaHeaderResult> getSpatulaHeader(GoogleApiClient googleApiClient);

    @KeepForSdk
    @Deprecated
    PendingResult<ProxyResult> performProxyRequest(GoogleApiClient googleApiClient, ProxyRequest proxyRequest);
}
