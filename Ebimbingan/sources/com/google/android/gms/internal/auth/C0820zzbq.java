package com.google.android.gms.internal.auth;

import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.C0118ProxyResponse;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.api.internal.C0268TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth.zzbq */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0820zzbq extends C0811zzbh {
    private final /* synthetic */ TaskCompletionSource zza;

    C0820zzbq(C0819zzbp zzbp, TaskCompletionSource taskCompletionSource) {
        C0819zzbp zzbp2 = zzbp;
        this.zza = taskCompletionSource;
    }

    public final void zza(C0118ProxyResponse proxyResponse) throws RemoteException {
        C0236Status status;
        C0118ProxyResponse proxyResponse2 = proxyResponse;
        new C0236Status(proxyResponse2.googlePlayServicesStatusCode);
        C0268TaskUtil.setResultOrApiException(status, proxyResponse2, this.zza);
    }
}
