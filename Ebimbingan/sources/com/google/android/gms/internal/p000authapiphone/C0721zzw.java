package com.google.android.gms.internal.p000authapiphone;

import com.google.android.gms.common.api.internal.C0250IStatusCallback;
import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzw  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.0 */
final /* synthetic */ class C0721zzw implements C0262RemoteCall {
    private final C0718zzt zza;

    C0721zzw(C0718zzt zzt) {
        this.zza = zzt;
    }

    public final void accept(Object obj, Object obj2) {
        C0250IStatusCallback iStatusCallback;
        C0718zzt zzt = this.zza;
        new C0723zzy(zzt, (TaskCompletionSource) obj2);
        C0250IStatusCallback iStatusCallback2 = iStatusCallback;
        ((C0706zzh) ((C0722zzx) obj).getService()).zzb(iStatusCallback2);
    }
}
