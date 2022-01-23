package com.google.android.gms.internal.p000authapiphone;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzac  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.0 */
final /* synthetic */ class zzac implements RemoteCall {
    private final zzaa zza;
    private final String zzb;

    zzac(zzaa zzaa, String str) {
        this.zza = zzaa;
        this.zzb = str;
    }

    public final void accept(Object obj, Object obj2) {
        zzj zzj;
        new zzae(this.zza, (TaskCompletionSource) obj2);
        ((zzh) ((zzx) obj).getService()).zza(this.zzb, zzj);
    }
}
