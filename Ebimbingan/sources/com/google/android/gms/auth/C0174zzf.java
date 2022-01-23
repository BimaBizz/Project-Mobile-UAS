package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.C0884zze;
import java.io.IOException;

/* renamed from: com.google.android.gms.auth.zzf */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0174zzf implements C0180zzl<C0018TokenData> {
    private final /* synthetic */ Account zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ Bundle zzc;

    C0174zzf(Account account, String str, Bundle bundle) {
        this.zza = account;
        this.zzb = str;
        this.zzc = bundle;
    }

    public final /* synthetic */ Object zza(IBinder iBinder) throws RemoteException, IOException, C0015GoogleAuthException {
        return C0175zzg.zzb((Bundle) C0175zzg.zzb(C0884zze.zza(iBinder).zza(this.zza, this.zzb, this.zzc)));
    }
}
