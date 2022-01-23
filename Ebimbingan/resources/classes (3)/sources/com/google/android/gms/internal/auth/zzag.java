package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzag extends zzal {
    private final /* synthetic */ zzah zza;

    zzag(zzah zzah) {
        this.zza = zzah;
    }

    public final void zza(Account account) {
        Account account2 = account;
        zzah zzah = this.zza;
        zzak zzak = r7;
        zzak zzak2 = new zzak(account2 != null ? Status.RESULT_SUCCESS : zzaf.zza, account2);
        zzah.setResult(zzak);
    }
}
