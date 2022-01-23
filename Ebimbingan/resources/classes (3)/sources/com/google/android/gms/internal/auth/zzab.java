package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzab extends IStatusCallback.Stub {
    private final /* synthetic */ TaskCompletionSource zza;

    zzab(zzt zzt, TaskCompletionSource taskCompletionSource) {
        zzt zzt2 = zzt;
        this.zza = taskCompletionSource;
    }

    public final void onResult(Status status) {
        zzt.zzb(status, null, this.zza);
    }
}
