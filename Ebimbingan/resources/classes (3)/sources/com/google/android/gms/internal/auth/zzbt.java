package com.google.android.gms.internal.auth;

import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzbt extends zzbh {
    private final /* synthetic */ TaskCompletionSource zza;

    zzbt(zzbp zzbp, TaskCompletionSource taskCompletionSource) {
        zzbp zzbp2 = zzbp;
        this.zza = taskCompletionSource;
    }

    public final void zza(String str) throws RemoteException {
        Status status;
        Status status2;
        String str2 = str;
        if (str2 != null) {
            status2 = Status.RESULT_SUCCESS;
        } else {
            status2 = status;
            new Status(AuthApiStatusCodes.AUTH_APP_CERT_ERROR);
        }
        TaskUtil.setResultOrApiException(status2, str2, this.zza);
    }
}
