package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final /* synthetic */ class zzw implements RemoteCall {
    private final zzt zza;
    private final Account zzb;

    zzw(zzt zzt, Account account) {
        this.zza = zzt;
        this.zzb = account;
    }

    public final void accept(Object obj, Object obj2) {
        zzl zzl;
        zzt zzt = this.zza;
        Account account = this.zzb;
        zzt zzt2 = zzt;
        new zzac(zzt2, (TaskCompletionSource) obj2);
        ((zzr) ((zzi) obj).getService()).zza(zzl, account);
    }
}
