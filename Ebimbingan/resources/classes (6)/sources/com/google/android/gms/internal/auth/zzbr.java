package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final /* synthetic */ class zzbr implements RemoteCall {
    private final zzbp zza;

    zzbr(zzbp zzbp) {
        this.zza = zzbp;
    }

    public final void accept(Object obj, Object obj2) {
        zzbj zzbj;
        zzbp zzbp = this.zza;
        new zzbt(zzbp, (TaskCompletionSource) obj2);
        zzbj zzbj2 = zzbj;
        ((zzbl) ((zzbg) obj).getService()).zza(zzbj2);
    }
}
