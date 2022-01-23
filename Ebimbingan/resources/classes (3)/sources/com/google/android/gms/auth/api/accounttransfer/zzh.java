package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferClient;
import com.google.android.gms.internal.auth.zzat;
import com.google.android.gms.internal.auth.zzav;
import com.google.android.gms.internal.auth.zzax;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzh extends AccountTransferClient.zza<DeviceMetaData> {
    private final /* synthetic */ zzat zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzh(AccountTransferClient accountTransferClient, zzat zzat) {
        super((zzd) null);
        AccountTransferClient accountTransferClient2 = accountTransferClient;
        this.zza = zzat;
    }

    /* access modifiers changed from: protected */
    public final void zza(zzax zzax) throws RemoteException {
        zzav zzav;
        new zzg(this, this);
        zzax.zza(zzav, this.zza);
    }
}
