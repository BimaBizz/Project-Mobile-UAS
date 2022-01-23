package com.google.android.gms.internal.p000authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzae  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.0 */
final class zzae extends zzm {
    private final /* synthetic */ TaskCompletionSource zza;

    zzae(zzaa zzaa, TaskCompletionSource taskCompletionSource) {
        zzaa zzaa2 = zzaa;
        this.zza = taskCompletionSource;
    }

    public final void zza(Status status) {
        TaskUtil.setResultOrApiException(status, this.zza);
    }
}
