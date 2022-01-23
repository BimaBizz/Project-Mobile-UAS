package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferClient;
import com.google.android.gms.internal.auth.zzav;
import com.google.android.gms.internal.auth.zzax;
import com.google.android.gms.internal.auth.zzbb;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzf extends AccountTransferClient.zza<byte[]> {
    private final /* synthetic */ zzbb zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzf(AccountTransferClient accountTransferClient, zzbb zzbb) {
        super((zzd) null);
        AccountTransferClient accountTransferClient2 = accountTransferClient;
        this.zza = zzbb;
    }

    /* access modifiers changed from: protected */
    public final void zza(zzax zzax) throws RemoteException {
        zzav zzav;
        new zze(this, this);
        zzax.zza(zzav, this.zza);
    }
}
