package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0220GoogleApi;
import com.google.android.gms.common.internal.C0445PendingResultUtil;
import com.google.android.gms.internal.auth.C0782zzaf;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.android.gms.auth.account.WorkAccountClient */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public class C0023WorkAccountClient extends C0220GoogleApi<C0211Api.ApiOptions.NoOptions> {
    private final C0022WorkAccountApi zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0023WorkAccountClient(@NonNull Context context) {
        super(context, C0021WorkAccount.API, null, C0220GoogleApi.Settings.DEFAULT_SETTINGS);
        C0022WorkAccountApi workAccountApi;
        new C0782zzaf();
        this.zza = workAccountApi;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0023WorkAccountClient(@NonNull Activity activity) {
        super(activity, C0021WorkAccount.API, null, C0220GoogleApi.Settings.DEFAULT_SETTINGS);
        C0022WorkAccountApi workAccountApi;
        new C0782zzaf();
        this.zza = workAccountApi;
    }

    public Task<Void> setWorkAuthenticatorEnabled(boolean z) {
        return C0445PendingResultUtil.toVoidTask(this.zza.setWorkAuthenticatorEnabledWithResult(asGoogleApiClient(), z));
    }

    public Task<Account> addWorkAccount(String str) {
        C0445PendingResultUtil.ResultConverter resultConverter;
        new C0030zzg(this);
        return C0445PendingResultUtil.toTask(this.zza.addWorkAccount(asGoogleApiClient(), str), resultConverter);
    }

    public Task<Void> removeWorkAccount(Account account) {
        return C0445PendingResultUtil.toVoidTask(this.zza.removeWorkAccount(asGoogleApiClient(), account));
    }
}
