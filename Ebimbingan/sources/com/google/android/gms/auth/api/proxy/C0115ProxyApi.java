package com.google.android.gms.auth.api.proxy;

import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0225PendingResult;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.internal.C0452ShowFirstParty;

@C0452ShowFirstParty
@C0206KeepForSdk
/* renamed from: com.google.android.gms.auth.api.proxy.ProxyApi */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public interface C0115ProxyApi {

    @C0452ShowFirstParty
    @C0206KeepForSdk
    /* renamed from: com.google.android.gms.auth.api.proxy.ProxyApi$ProxyResult */
    /* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
    public interface ProxyResult extends C0231Result {
        @C0206KeepForSdk
        C0118ProxyResponse getResponse();
    }

    @C0452ShowFirstParty
    @C0206KeepForSdk
    /* renamed from: com.google.android.gms.auth.api.proxy.ProxyApi$SpatulaHeaderResult */
    /* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
    public interface SpatulaHeaderResult extends C0231Result {
        @C0452ShowFirstParty
        @C0206KeepForSdk
        String getSpatulaHeader();
    }

    @C0452ShowFirstParty
    @C0206KeepForSdk
    @Deprecated
    C0225PendingResult<SpatulaHeaderResult> getSpatulaHeader(C0222GoogleApiClient googleApiClient);

    @C0206KeepForSdk
    @Deprecated
    C0225PendingResult<ProxyResult> performProxyRequest(C0222GoogleApiClient googleApiClient, C0117ProxyRequest proxyRequest);
}
