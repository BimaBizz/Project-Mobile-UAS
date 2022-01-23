package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.auth.api.accounttransfer.C0035AccountTransferClient;
import com.google.android.gms.internal.auth.C0796zzat;
import com.google.android.gms.internal.auth.C0798zzav;
import com.google.android.gms.internal.auth.C0800zzax;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.zzh */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0047zzh extends C0035AccountTransferClient.zza<C0039DeviceMetaData> {
    private final /* synthetic */ C0796zzat zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0047zzh(C0035AccountTransferClient accountTransferClient, C0796zzat zzat) {
        super((C0043zzd) null);
        C0035AccountTransferClient accountTransferClient2 = accountTransferClient;
        this.zza = zzat;
    }

    /* access modifiers changed from: protected */
    public final void zza(C0800zzax zzax) throws RemoteException {
        C0798zzav zzav;
        new C0046zzg(this, this);
        zzax.zza(zzav, this.zza);
    }
}
