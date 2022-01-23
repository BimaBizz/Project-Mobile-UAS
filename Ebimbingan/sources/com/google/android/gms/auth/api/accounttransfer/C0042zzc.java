package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.auth.api.accounttransfer.C0035AccountTransferClient;
import com.google.android.gms.internal.auth.C0798zzav;
import com.google.android.gms.internal.auth.C0800zzax;
import com.google.android.gms.internal.auth.C0807zzbd;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.zzc */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0042zzc extends C0035AccountTransferClient.zzc {
    private final /* synthetic */ C0807zzbd zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0042zzc(C0035AccountTransferClient accountTransferClient, C0807zzbd zzbd) {
        super((C0043zzd) null);
        C0035AccountTransferClient accountTransferClient2 = accountTransferClient;
        this.zzb = zzbd;
    }

    /* access modifiers changed from: protected */
    public final void zza(C0800zzax zzax) throws RemoteException {
        zzax.zza((C0798zzav) this.zza, this.zzb);
    }
}
