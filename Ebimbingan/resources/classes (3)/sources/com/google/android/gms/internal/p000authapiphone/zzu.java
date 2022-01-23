package com.google.android.gms.internal.p000authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzu  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.0 */
final class zzu extends zzi {
    private final /* synthetic */ TaskCompletionSource zza;

    zzu(zzl zzl, TaskCompletionSource taskCompletionSource) {
        zzl zzl2 = zzl;
        this.zza = taskCompletionSource;
    }

    public final void zza(Status status, boolean z) {
        TaskUtil.setResultOrApiException(status, Boolean.valueOf(z), this.zza);
    }
}
