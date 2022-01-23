package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final /* synthetic */ class zzs implements RemoteCall {
    private final zzt zza;
    private final Account zzb;
    private final String zzc;
    private final Bundle zzd;

    zzs(zzt zzt, Account account, String str, Bundle bundle) {
        this.zza = zzt;
        this.zzb = account;
        this.zzc = str;
        this.zzd = bundle;
    }

    public final void accept(Object obj, Object obj2) {
        zzp zzp;
        Bundle bundle;
        Bundle bundle2;
        zzt zzt = this.zza;
        Account account = this.zzb;
        String str = this.zzc;
        Bundle bundle3 = this.zzd;
        String str2 = str;
        Account account2 = account;
        zzt zzt2 = zzt;
        zzr zzr = (zzr) ((zzi) obj).getService();
        zzp zzp2 = zzp;
        new zzy(zzt2, (TaskCompletionSource) obj2);
        Account account3 = account2;
        String str3 = str2;
        if (bundle3 == null) {
            bundle = bundle2;
            new Bundle();
        } else {
            bundle = bundle3;
        }
        zzr.zza(zzp2, account3, str3, bundle);
    }
}
