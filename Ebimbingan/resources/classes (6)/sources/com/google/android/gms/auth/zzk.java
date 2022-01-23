package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.zze;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzk implements zzl<Bundle> {
    private final /* synthetic */ Account zza;

    zzk(Account account) {
        this.zza = account;
    }

    public final /* synthetic */ Object zza(IBinder iBinder) throws RemoteException, IOException, GoogleAuthException {
        return (Bundle) zzg.zzb(zze.zza(iBinder).zza(this.zza));
    }
}
