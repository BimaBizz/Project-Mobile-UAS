package com.google.android.gms.internal.auth;

import android.os.RemoteException;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.api.internal.C0268TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth.zzbt */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0823zzbt extends C0811zzbh {
    private final /* synthetic */ TaskCompletionSource zza;

    C0823zzbt(C0819zzbp zzbp, TaskCompletionSource taskCompletionSource) {
        C0819zzbp zzbp2 = zzbp;
        this.zza = taskCompletionSource;
    }

    public final void zza(String str) throws RemoteException {
        C0236Status status;
        C0236Status status2;
        String str2 = str;
        if (str2 != null) {
            status2 = C0236Status.RESULT_SUCCESS;
        } else {
            status2 = status;
            new C0236Status(3006);
        }
        C0268TaskUtil.setResultOrApiException(status2, str2, this.zza);
    }
}
