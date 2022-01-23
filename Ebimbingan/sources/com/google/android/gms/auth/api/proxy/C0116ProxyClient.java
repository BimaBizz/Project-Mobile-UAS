package com.google.android.gms.auth.api.proxy;

import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.C0033AuthProxyOptions;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.C0223HasApiKey;
import com.google.android.gms.common.internal.C0452ShowFirstParty;
import com.google.android.gms.tasks.Task;

@C0452ShowFirstParty
@C0206KeepForSdk
/* renamed from: com.google.android.gms.auth.api.proxy.ProxyClient */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public interface C0116ProxyClient extends C0223HasApiKey<C0033AuthProxyOptions> {
    @C0206KeepForSdk
    Task<String> getSpatulaHeader();

    @C0206KeepForSdk
    Task<C0118ProxyResponse> performProxyRequest(@NonNull C0117ProxyRequest proxyRequest);
}
