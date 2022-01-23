package com.google.android.gms.internal.p000authapiphone;

import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.api.internal.C0268TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzab  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.0 */
final class C0696zzab extends C0711zzm {
    private final /* synthetic */ TaskCompletionSource zza;

    C0696zzab(C0695zzaa zzaa, TaskCompletionSource taskCompletionSource) {
        C0695zzaa zzaa2 = zzaa;
        this.zza = taskCompletionSource;
    }

    public final void zza(C0236Status status) {
        C0268TaskUtil.setResultOrApiException(status, this.zza);
    }
}
