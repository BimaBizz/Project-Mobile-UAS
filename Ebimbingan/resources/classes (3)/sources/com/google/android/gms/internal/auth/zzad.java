package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzad extends zzm {
    private final /* synthetic */ TaskCompletionSource zza;

    zzad(zzt zzt, TaskCompletionSource taskCompletionSource) {
        zzt zzt2 = zzt;
        this.zza = taskCompletionSource;
    }

    public final void zza(Status status, AccountChangeEventsResponse accountChangeEventsResponse) {
        zzt.zzb(status, accountChangeEventsResponse, this.zza);
    }
}
