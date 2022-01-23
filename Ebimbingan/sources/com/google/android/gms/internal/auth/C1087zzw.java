package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth.zzw */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final /* synthetic */ class C1087zzw implements C0262RemoteCall {
    private final C1084zzt zza;
    private final Account zzb;

    C1087zzw(C1084zzt zzt, Account account) {
        this.zza = zzt;
        this.zzb = account;
    }

    public final void accept(Object obj, Object obj2) {
        C1073zzl zzl;
        C1084zzt zzt = this.zza;
        Account account = this.zzb;
        C1084zzt zzt2 = zzt;
        new C0779zzac(zzt2, (TaskCompletionSource) obj2);
        ((C1082zzr) ((C0992zzi) obj).getService()).zza(zzl, account);
    }
}
