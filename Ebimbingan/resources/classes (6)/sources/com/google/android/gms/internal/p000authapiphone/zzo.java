package com.google.android.gms.internal.p000authapiphone;

import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzo  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.0 */
final /* synthetic */ class zzo implements RemoteCall {
    private final zzl zza;

    zzo(zzl zzl) {
        this.zza = zzl;
    }

    public final void accept(Object obj, Object obj2) {
        IStatusCallback iStatusCallback;
        zzl zzl = this.zza;
        new zzs(zzl, (TaskCompletionSource) obj2);
        IStatusCallback iStatusCallback2 = iStatusCallback;
        ((zzh) ((zzx) obj).getService()).zza(iStatusCallback2);
    }
}
