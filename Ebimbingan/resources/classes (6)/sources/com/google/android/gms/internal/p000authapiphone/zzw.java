package com.google.android.gms.internal.p000authapiphone;

import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzw  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.0 */
final /* synthetic */ class zzw implements RemoteCall {
    private final zzt zza;

    zzw(zzt zzt) {
        this.zza = zzt;
    }

    public final void accept(Object obj, Object obj2) {
        IStatusCallback iStatusCallback;
        zzt zzt = this.zza;
        new zzy(zzt, (TaskCompletionSource) obj2);
        IStatusCallback iStatusCallback2 = iStatusCallback;
        ((zzh) ((zzx) obj).getService()).zzb(iStatusCallback2);
    }
}
