package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.C0013AccountChangeEventsResponse;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth.zzad */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0780zzad extends C1077zzm {
    private final /* synthetic */ TaskCompletionSource zza;

    C0780zzad(C1084zzt zzt, TaskCompletionSource taskCompletionSource) {
        C1084zzt zzt2 = zzt;
        this.zza = taskCompletionSource;
    }

    public final void zza(C0236Status status, C0013AccountChangeEventsResponse accountChangeEventsResponse) {
        C1084zzt.zzb(status, accountChangeEventsResponse, this.zza);
    }
}
