package com.google.android.gms.internal.auth;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzy extends zzo {
    private final /* synthetic */ TaskCompletionSource zza;

    zzy(zzt zzt, TaskCompletionSource taskCompletionSource) {
        zzt zzt2 = zzt;
        this.zza = taskCompletionSource;
    }

    public final void zza(Status status, Bundle bundle) {
        zzt.zzb(status, bundle, this.zza);
    }
}
