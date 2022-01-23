package com.google.android.gms.internal.p000authapiphone;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzz  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.0 */
final /* synthetic */ class zzz implements RemoteCall {
    private final zzaa zza;

    zzz(zzaa zzaa) {
        this.zza = zzaa;
    }

    public final void accept(Object obj, Object obj2) {
        zzj zzj;
        new zzab(this.zza, (TaskCompletionSource) obj2);
        ((zzh) ((zzx) obj).getService()).zza(zzj);
    }
}
