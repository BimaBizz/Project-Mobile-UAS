package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.auth.account.WorkAccount;
import com.google.android.gms.auth.account.WorkAccountApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class zzaf implements WorkAccountApi {
    /* access modifiers changed from: private */
    public static final Status zza;

    public zzaf() {
    }

    public final void setWorkAuthenticatorEnabled(GoogleApiClient googleApiClient, boolean z) {
        PendingResult<Result> workAuthenticatorEnabledWithResult = setWorkAuthenticatorEnabledWithResult(googleApiClient, z);
    }

    public final PendingResult<Result> setWorkAuthenticatorEnabledWithResult(GoogleApiClient googleApiClient, boolean z) {
        BaseImplementation.ApiMethodImpl apiMethodImpl;
        GoogleApiClient googleApiClient2 = googleApiClient;
        new zzae(this, WorkAccount.API, googleApiClient2, z);
        return googleApiClient2.execute(apiMethodImpl);
    }

    public final PendingResult<WorkAccountApi.AddAccountResult> addWorkAccount(GoogleApiClient googleApiClient, String str) {
        BaseImplementation.ApiMethodImpl apiMethodImpl;
        GoogleApiClient googleApiClient2 = googleApiClient;
        new zzah(this, WorkAccount.API, googleApiClient2, str);
        return googleApiClient2.execute(apiMethodImpl);
    }

    public final PendingResult<Result> removeWorkAccount(GoogleApiClient googleApiClient, Account account) {
        BaseImplementation.ApiMethodImpl apiMethodImpl;
        GoogleApiClient googleApiClient2 = googleApiClient;
        new zzaj(this, WorkAccount.API, googleApiClient2, account);
        return googleApiClient2.execute(apiMethodImpl);
    }

    static {
        Status status;
        new Status(13);
        zza = status;
    }
}
