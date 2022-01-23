package com.google.android.gms.internal.auth;

import android.os.Bundle;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth.zzy */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C1089zzy extends C1079zzo {
    private final /* synthetic */ TaskCompletionSource zza;

    C1089zzy(C1084zzt zzt, TaskCompletionSource taskCompletionSource) {
        C1084zzt zzt2 = zzt;
        this.zza = taskCompletionSource;
    }

    public final void zza(C0236Status status, Bundle bundle) {
        C1084zzt.zzb(status, bundle, this.zza);
    }
}
