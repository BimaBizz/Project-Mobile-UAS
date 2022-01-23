package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferClient;
import com.google.android.gms.internal.auth.zzav;
import com.google.android.gms.internal.auth.zzax;
import com.google.android.gms.internal.auth.zzaz;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzi extends AccountTransferClient.zzc {
    private final /* synthetic */ zzaz zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzi(AccountTransferClient accountTransferClient, zzaz zzaz) {
        super((zzd) null);
        AccountTransferClient accountTransferClient2 = accountTransferClient;
        this.zzb = zzaz;
    }

    /* access modifiers changed from: protected */
    public final void zza(zzax zzax) throws RemoteException {
        zzax.zza((zzav) this.zza, this.zzb);
    }
}
