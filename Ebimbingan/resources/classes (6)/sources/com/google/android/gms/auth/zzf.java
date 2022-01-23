package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.zze;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzf implements zzl<TokenData> {
    private final /* synthetic */ Account zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ Bundle zzc;

    zzf(Account account, String str, Bundle bundle) {
        this.zza = account;
        this.zzb = str;
        this.zzc = bundle;
    }

    public final /* synthetic */ Object zza(IBinder iBinder) throws RemoteException, IOException, GoogleAuthException {
        return zzg.zzb((Bundle) zzg.zzb(zze.zza(iBinder).zza(this.zza, this.zzb, this.zzc)));
    }
}
