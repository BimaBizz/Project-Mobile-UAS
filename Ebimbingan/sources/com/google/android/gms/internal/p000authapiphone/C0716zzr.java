package com.google.android.gms.internal.p000authapiphone;

import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.api.internal.C0268TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzr  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.0 */
final class C0716zzr extends C0705zzg {
    private final /* synthetic */ TaskCompletionSource zza;

    C0716zzr(C0710zzl zzl, TaskCompletionSource taskCompletionSource) {
        C0710zzl zzl2 = zzl;
        this.zza = taskCompletionSource;
    }

    public final void zza(C0236Status status, int i) {
        C0268TaskUtil.setResultOrApiException(status, Integer.valueOf(i), this.zza);
    }
}
