package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final /* synthetic */ class zzx implements RemoteCall {
    private final zzt zza;
    private final AccountChangeEventsRequest zzb;

    zzx(zzt zzt, AccountChangeEventsRequest accountChangeEventsRequest) {
        this.zza = zzt;
        this.zzb = accountChangeEventsRequest;
    }

    public final void accept(Object obj, Object obj2) {
        zzn zzn;
        zzt zzt = this.zza;
        AccountChangeEventsRequest accountChangeEventsRequest = this.zzb;
        new zzad(zzt, (TaskCompletionSource) obj2);
        zzn zzn2 = zzn;
        ((zzr) ((zzi) obj).getService()).zza(zzn2, accountChangeEventsRequest);
    }
}
