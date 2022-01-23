package com.google.android.gms.internal.p000authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzr  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.0 */
final class zzr extends zzg {
    private final /* synthetic */ TaskCompletionSource zza;

    zzr(zzl zzl, TaskCompletionSource taskCompletionSource) {
        zzl zzl2 = zzl;
        this.zza = taskCompletionSource;
    }

    public final void zza(Status status, int i) {
        TaskUtil.setResultOrApiException(status, Integer.valueOf(i), this.zza);
    }
}
