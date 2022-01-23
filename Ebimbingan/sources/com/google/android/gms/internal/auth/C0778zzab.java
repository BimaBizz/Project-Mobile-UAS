package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.api.internal.C0250IStatusCallback;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth.zzab */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0778zzab extends C0250IStatusCallback.Stub {
    private final /* synthetic */ TaskCompletionSource zza;

    C0778zzab(C1084zzt zzt, TaskCompletionSource taskCompletionSource) {
        C1084zzt zzt2 = zzt;
        this.zza = taskCompletionSource;
    }

    public final void onResult(C0236Status status) {
        C1084zzt.zzb(status, null, this.zza);
    }
}
