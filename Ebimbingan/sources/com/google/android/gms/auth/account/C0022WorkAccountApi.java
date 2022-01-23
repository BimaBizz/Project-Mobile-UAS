package com.google.android.gms.auth.account;

import android.accounts.Account;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0225PendingResult;
import com.google.android.gms.common.api.C0231Result;

@Deprecated
/* renamed from: com.google.android.gms.auth.account.WorkAccountApi */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public interface C0022WorkAccountApi {

    @Deprecated
    /* renamed from: com.google.android.gms.auth.account.WorkAccountApi$AddAccountResult */
    /* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
    public interface AddAccountResult extends C0231Result {
        Account getAccount();
    }

    @Deprecated
    C0225PendingResult<AddAccountResult> addWorkAccount(C0222GoogleApiClient googleApiClient, String str);

    @Deprecated
    C0225PendingResult<C0231Result> removeWorkAccount(C0222GoogleApiClient googleApiClient, Account account);

    @Deprecated
    void setWorkAuthenticatorEnabled(C0222GoogleApiClient googleApiClient, boolean z);

    @Deprecated
    C0225PendingResult<C0231Result> setWorkAuthenticatorEnabledWithResult(C0222GoogleApiClient googleApiClient, boolean z);
}
