package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.internal.C0250IStatusCallback;
import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth.zzv */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final /* synthetic */ class C1086zzv implements C0262RemoteCall {
    private final C1084zzt zza;
    private final C0832zzcb zzb;

    C1086zzv(C1084zzt zzt, C0832zzcb zzcb) {
        this.zza = zzt;
        this.zzb = zzcb;
    }

    public final void accept(Object obj, Object obj2) {
        C0250IStatusCallback iStatusCallback;
        C1084zzt zzt = this.zza;
        C0832zzcb zzcb = this.zzb;
        C1084zzt zzt2 = zzt;
        new C0778zzab(zzt2, (TaskCompletionSource) obj2);
        ((C1082zzr) ((C0992zzi) obj).getService()).zza(iStatusCallback, zzcb);
    }
}
