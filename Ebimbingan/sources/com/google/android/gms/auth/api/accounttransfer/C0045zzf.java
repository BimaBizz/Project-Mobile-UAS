package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.auth.api.accounttransfer.C0035AccountTransferClient;
import com.google.android.gms.internal.auth.C0798zzav;
import com.google.android.gms.internal.auth.C0800zzax;
import com.google.android.gms.internal.auth.C0805zzbb;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.zzf */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0045zzf extends C0035AccountTransferClient.zza<byte[]> {
    private final /* synthetic */ C0805zzbb zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0045zzf(C0035AccountTransferClient accountTransferClient, C0805zzbb zzbb) {
        super((C0043zzd) null);
        C0035AccountTransferClient accountTransferClient2 = accountTransferClient;
        this.zza = zzbb;
    }

    /* access modifiers changed from: protected */
    public final void zza(C0800zzax zzax) throws RemoteException {
        C0798zzav zzav;
        new C0044zze(this, this);
        zzax.zza(zzav, this.zza);
    }
}
