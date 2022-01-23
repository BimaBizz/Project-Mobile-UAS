package com.google.android.gms.auth.account;

import android.accounts.Account;
import com.google.android.gms.auth.account.C0022WorkAccountApi;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.internal.C0445PendingResultUtil;

/* renamed from: com.google.android.gms.auth.account.zzg */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0030zzg implements C0445PendingResultUtil.ResultConverter<C0022WorkAccountApi.AddAccountResult, Account> {
    C0030zzg(C0023WorkAccountClient workAccountClient) {
        C0023WorkAccountClient workAccountClient2 = workAccountClient;
    }

    public final /* synthetic */ Object convert(C0231Result result) {
        return ((C0022WorkAccountApi.AddAccountResult) result).getAccount();
    }
}
