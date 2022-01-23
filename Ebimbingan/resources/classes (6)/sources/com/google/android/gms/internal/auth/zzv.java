package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final /* synthetic */ class zzv implements RemoteCall {
    private final zzt zza;
    private final zzcb zzb;

    zzv(zzt zzt, zzcb zzcb) {
        this.zza = zzt;
        this.zzb = zzcb;
    }

    public final void accept(Object obj, Object obj2) {
        IStatusCallback iStatusCallback;
        zzt zzt = this.zza;
        zzcb zzcb = this.zzb;
        zzt zzt2 = zzt;
        new zzab(zzt2, (TaskCompletionSource) obj2);
        ((zzr) ((zzi) obj).getService()).zza(iStatusCallback, zzcb);
    }
}
