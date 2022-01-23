package com.google.android.gms.auth;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.zze;
import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzh implements zzl<List<AccountChangeEvent>> {
    private final /* synthetic */ AccountChangeEventsRequest zza;

    zzh(AccountChangeEventsRequest accountChangeEventsRequest) {
        this.zza = accountChangeEventsRequest;
    }

    public final /* synthetic */ Object zza(IBinder iBinder) throws RemoteException, IOException, GoogleAuthException {
        return ((AccountChangeEventsResponse) zzg.zzb(zze.zza(iBinder).zza(this.zza))).getEvents();
    }
}
