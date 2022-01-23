package com.google.android.gms.internal.auth;

import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzbq extends zzbh {
    private final /* synthetic */ TaskCompletionSource zza;

    zzbq(zzbp zzbp, TaskCompletionSource taskCompletionSource) {
        zzbp zzbp2 = zzbp;
        this.zza = taskCompletionSource;
    }

    public final void zza(ProxyResponse proxyResponse) throws RemoteException {
        Status status;
        ProxyResponse proxyResponse2 = proxyResponse;
        new Status(proxyResponse2.googlePlayServicesStatusCode);
        TaskUtil.setResultOrApiException(status, proxyResponse2, this.zza);
    }
}
