package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.auth.account.C0021WorkAccount;
import com.google.android.gms.auth.account.C0022WorkAccountApi;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0225PendingResult;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.api.internal.C0243BaseImplementation;

/* renamed from: com.google.android.gms.internal.auth.zzaf */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
public final class C0782zzaf implements C0022WorkAccountApi {
    /* access modifiers changed from: private */
    public static final C0236Status zza;

    public C0782zzaf() {
    }

    public final void setWorkAuthenticatorEnabled(C0222GoogleApiClient googleApiClient, boolean z) {
        C0225PendingResult<C0231Result> workAuthenticatorEnabledWithResult = setWorkAuthenticatorEnabledWithResult(googleApiClient, z);
    }

    public final C0225PendingResult<C0231Result> setWorkAuthenticatorEnabledWithResult(C0222GoogleApiClient googleApiClient, boolean z) {
        C0243BaseImplementation.ApiMethodImpl apiMethodImpl;
        C0222GoogleApiClient googleApiClient2 = googleApiClient;
        new C0781zzae(this, C0021WorkAccount.API, googleApiClient2, z);
        return googleApiClient2.execute(apiMethodImpl);
    }

    public final C0225PendingResult<C0022WorkAccountApi.AddAccountResult> addWorkAccount(C0222GoogleApiClient googleApiClient, String str) {
        C0243BaseImplementation.ApiMethodImpl apiMethodImpl;
        C0222GoogleApiClient googleApiClient2 = googleApiClient;
        new C0784zzah(this, C0021WorkAccount.API, googleApiClient2, str);
        return googleApiClient2.execute(apiMethodImpl);
    }

    public final C0225PendingResult<C0231Result> removeWorkAccount(C0222GoogleApiClient googleApiClient, Account account) {
        C0243BaseImplementation.ApiMethodImpl apiMethodImpl;
        C0222GoogleApiClient googleApiClient2 = googleApiClient;
        new C0786zzaj(this, C0021WorkAccount.API, googleApiClient2, account);
        return googleApiClient2.execute(apiMethodImpl);
    }

    static {
        C0236Status status;
        new C0236Status(13);
        zza = status;
    }
}
