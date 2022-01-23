package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.auth.account.C0022WorkAccountApi;
import com.google.android.gms.common.api.C0236Status;

/* renamed from: com.google.android.gms.internal.auth.zzak */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0787zzak implements C0022WorkAccountApi.AddAccountResult {
    private final C0236Status zza;
    private final Account zzb;

    public C0787zzak(C0236Status status, Account account) {
        this.zza = status;
        this.zzb = account;
    }

    public final C0236Status getStatus() {
        return this.zza;
    }

    public final Account getAccount() {
        return this.zzb;
    }
}
