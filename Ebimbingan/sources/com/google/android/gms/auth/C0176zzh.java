package com.google.android.gms.auth;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.C0884zze;
import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.auth.zzh */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0176zzh implements C0180zzl<List<C0011AccountChangeEvent>> {
    private final /* synthetic */ C0012AccountChangeEventsRequest zza;

    C0176zzh(C0012AccountChangeEventsRequest accountChangeEventsRequest) {
        this.zza = accountChangeEventsRequest;
    }

    public final /* synthetic */ Object zza(IBinder iBinder) throws RemoteException, IOException, C0015GoogleAuthException {
        return ((C0013AccountChangeEventsResponse) C0175zzg.zzb(C0884zze.zza(iBinder).zza(this.zza))).getEvents();
    }
}
