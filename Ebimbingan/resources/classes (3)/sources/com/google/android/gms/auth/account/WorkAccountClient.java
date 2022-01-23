package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.internal.auth.zzaf;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public class WorkAccountClient extends GoogleApi<Api.ApiOptions.NoOptions> {
    private final WorkAccountApi zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WorkAccountClient(@NonNull Context context) {
        super(context, WorkAccount.API, null, GoogleApi.Settings.DEFAULT_SETTINGS);
        WorkAccountApi workAccountApi;
        new zzaf();
        this.zza = workAccountApi;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WorkAccountClient(@NonNull Activity activity) {
        super(activity, WorkAccount.API, null, GoogleApi.Settings.DEFAULT_SETTINGS);
        WorkAccountApi workAccountApi;
        new zzaf();
        this.zza = workAccountApi;
    }

    public Task<Void> setWorkAuthenticatorEnabled(boolean z) {
        return PendingResultUtil.toVoidTask(this.zza.setWorkAuthenticatorEnabledWithResult(asGoogleApiClient(), z));
    }

    public Task<Account> addWorkAccount(String str) {
        PendingResultUtil.ResultConverter resultConverter;
        new zzg(this);
        return PendingResultUtil.toTask(this.zza.addWorkAccount(asGoogleApiClient(), str), resultConverter);
    }

    public Task<Void> removeWorkAccount(Account account) {
        return PendingResultUtil.toVoidTask(this.zza.removeWorkAccount(asGoogleApiClient(), account));
    }
}
