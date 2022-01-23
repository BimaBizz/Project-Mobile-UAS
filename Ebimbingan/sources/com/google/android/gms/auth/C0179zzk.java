package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.C0884zze;
import java.io.IOException;

/* renamed from: com.google.android.gms.auth.zzk */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0179zzk implements C0180zzl<Bundle> {
    private final /* synthetic */ Account zza;

    C0179zzk(Account account) {
        this.zza = account;
    }

    public final /* synthetic */ Object zza(IBinder iBinder) throws RemoteException, IOException, C0015GoogleAuthException {
        return (Bundle) C0175zzg.zzb(C0884zze.zza(iBinder).zza(this.zza));
    }
}
