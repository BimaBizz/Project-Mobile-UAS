package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.common.api.internal.C0262RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth.zzs */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final /* synthetic */ class C1083zzs implements C0262RemoteCall {
    private final C1084zzt zza;
    private final Account zzb;
    private final String zzc;
    private final Bundle zzd;

    C1083zzs(C1084zzt zzt, Account account, String str, Bundle bundle) {
        this.zza = zzt;
        this.zzb = account;
        this.zzc = str;
        this.zzd = bundle;
    }

    public final void accept(Object obj, Object obj2) {
        C1080zzp zzp;
        Bundle bundle;
        Bundle bundle2;
        C1084zzt zzt = this.zza;
        Account account = this.zzb;
        String str = this.zzc;
        Bundle bundle3 = this.zzd;
        String str2 = str;
        Account account2 = account;
        C1084zzt zzt2 = zzt;
        C1082zzr zzr = (C1082zzr) ((C0992zzi) obj).getService();
        C1080zzp zzp2 = zzp;
        new C1089zzy(zzt2, (TaskCompletionSource) obj2);
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
