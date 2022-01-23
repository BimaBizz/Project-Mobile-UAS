package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.C0012AccountChangeEventsRequest;
import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth.zzx */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final /* synthetic */ class C1088zzx implements C0262RemoteCall {
    private final C1084zzt zza;
    private final C0012AccountChangeEventsRequest zzb;

    C1088zzx(C1084zzt zzt, C0012AccountChangeEventsRequest accountChangeEventsRequest) {
        this.zza = zzt;
        this.zzb = accountChangeEventsRequest;
    }

    public final void accept(Object obj, Object obj2) {
        C1078zzn zzn;
        C1084zzt zzt = this.zza;
        C0012AccountChangeEventsRequest accountChangeEventsRequest = this.zzb;
        new C0780zzad(zzt, (TaskCompletionSource) obj2);
        C1078zzn zzn2 = zzn;
        ((C1082zzr) ((C0992zzi) obj).getService()).zza(zzn2, accountChangeEventsRequest);
    }
}
