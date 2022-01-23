package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.zze;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzi implements zzl<Void> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ Bundle zzb;

    zzi(String str, Bundle bundle) {
        this.zza = str;
        this.zzb = bundle;
    }

    public final /* synthetic */ Object zza(IBinder iBinder) throws RemoteException, IOException, GoogleAuthException {
        Throwable th;
        Bundle bundle = (Bundle) zzg.zzb(zze.zza(iBinder).zza(this.zza, this.zzb));
        String string = bundle.getString("Error");
        if (bundle.getBoolean("booleanResult")) {
            return null;
        }
        Throwable th2 = th;
        new GoogleAuthException(string);
        throw th2;
    }
}
