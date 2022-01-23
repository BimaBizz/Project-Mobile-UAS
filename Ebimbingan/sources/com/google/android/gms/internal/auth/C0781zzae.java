package com.google.android.gms.internal.auth;

import android.os.RemoteException;
import com.google.android.gms.auth.account.C0027zzd;
import com.google.android.gms.common.annotation.C0206KeepForSdk;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.C0236Status;
import com.google.android.gms.common.api.internal.C0243BaseImplementation;

/* renamed from: com.google.android.gms.internal.auth.zzae */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0781zzae extends C0243BaseImplementation.ApiMethodImpl<C0231Result, C0791zzao> {
    private final /* synthetic */ boolean zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0781zzae(C0782zzaf zzaf, C0211Api api, C0222GoogleApiClient googleApiClient, boolean z) {
        super((C0211Api<?>) api, googleApiClient);
        C0782zzaf zzaf2 = zzaf;
        this.zza = z;
    }

    /* access modifiers changed from: protected */
    public final C0231Result createFailedResult(C0236Status status) {
        C0231Result result;
        new C0790zzan(status);
        return result;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void doExecute(C0211Api.AnyClient anyClient) throws RemoteException {
        C0231Result result;
        ((C0027zzd) ((C0791zzao) anyClient).getService()).zza(this.zza);
        new C0790zzan(C0236Status.RESULT_SUCCESS);
        setResult(result);
    }

    @C0206KeepForSdk
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((C0231Result) obj);
    }
}
