package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.C0211Api;
import com.google.android.gms.common.api.C0222GoogleApiClient;
import com.google.android.gms.common.api.C0231Result;
import com.google.android.gms.common.api.C0236Status;

/* renamed from: com.google.android.gms.auth.api.signin.internal.zzl */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
final class C0146zzl extends C0148zzn<C0236Status> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0146zzl(C0222GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void doExecute(C0211Api.AnyClient anyClient) throws RemoteException {
        C0152zzr zzr;
        C0140zzf zzf = (C0140zzf) anyClient;
        new C0149zzo(this);
        ((C0154zzt) zzf.getService()).zze(zzr, zzf.zzo());
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ C0231Result createFailedResult(C0236Status status) {
        return status;
    }
}
