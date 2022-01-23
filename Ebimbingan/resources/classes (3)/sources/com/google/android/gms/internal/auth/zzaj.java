package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.RemoteException;
import com.google.android.gms.auth.account.zzb;
import com.google.android.gms.auth.account.zzd;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzaj extends BaseImplementation.ApiMethodImpl<Result, zzao> {
    private final /* synthetic */ Account zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzaj(zzaf zzaf, Api api, GoogleApiClient googleApiClient, Account account) {
        super((Api<?>) api, googleApiClient);
        zzaf zzaf2 = zzaf;
        this.zza = account;
    }

    /* access modifiers changed from: protected */
    public final Result createFailedResult(Status status) {
        Result result;
        new zzam(status);
        return result;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        zzb zzb;
        new zzai(this);
        ((zzd) ((zzao) anyClient).getService()).zza(zzb, this.zza);
    }

    @KeepForSdk
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((Result) obj);
    }
}
