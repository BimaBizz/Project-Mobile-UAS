package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.auth.account.WorkAccountApi;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzak implements WorkAccountApi.AddAccountResult {
    private final Status zza;
    private final Account zzb;

    public zzak(Status status, Account account) {
        this.zza = status;
        this.zzb = account;
    }

    public final Status getStatus() {
        return this.zza;
    }

    public final Account getAccount() {
        return this.zzb;
    }
}
