package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.RemoteException;
import com.google.android.gms.auth.account.C0022WorkAccountApi;
import com.google.android.gms.auth.account.C0025zzb;
import com.google.android.gms.auth.account.C0027zzd;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.api.internal.C0243BaseImplementation;

/* renamed from: com.google.android.gms.internal.auth.zzah */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0784zzah extends C0243BaseImplementation.ApiMethodImpl<C0022WorkAccountApi.AddAccountResult, C0791zzao> {
    private final /* synthetic */ String zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0784zzah(C0782zzaf zzaf, C0211Api api, C0222GoogleApiClient googleApiClient, String str) {
        super((C0211Api<?>) api, googleApiClient);
        C0782zzaf zzaf2 = zzaf;
        this.zza = str;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void doExecute(C0211Api.AnyClient anyClient) throws RemoteException {
        C0025zzb zzb;
        new C0783zzag(this);
        ((C0027zzd) ((C0791zzao) anyClient).getService()).zza(zzb, this.zza);
    }

    @C0206KeepForSdk
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((C0231Result) obj);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ C0231Result createFailedResult(C0236Status status) {
        C0231Result result;
        new C0787zzak(status, (Account) null);
        return result;
    }
}
