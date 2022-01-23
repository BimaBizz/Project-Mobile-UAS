package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.C0236Status;

/* renamed from: com.google.android.gms.internal.auth.zzag */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0783zzag extends C0788zzal {
    private final /* synthetic */ C0784zzah zza;

    C0783zzag(C0784zzah zzah) {
        this.zza = zzah;
    }

    public final void zza(Account account) {
        Account account2 = account;
        C0784zzah zzah = this.zza;
        C0787zzak zzak = r7;
        C0787zzak zzak2 = new C0787zzak(account2 != null ? C0236Status.RESULT_SUCCESS : C0782zzaf.zza, account2);
        zzah.setResult(zzak);
    }
}
