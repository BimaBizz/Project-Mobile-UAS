package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.C0884zze;
import java.io.IOException;

/* renamed from: com.google.android.gms.auth.zzi */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0177zzi implements C0180zzl<Void> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ Bundle zzb;

    C0177zzi(String str, Bundle bundle) {
        this.zza = str;
        this.zzb = bundle;
    }

    public final /* synthetic */ Object zza(IBinder iBinder) throws RemoteException, IOException, C0015GoogleAuthException {
        Throwable th;
        Bundle bundle = (Bundle) C0175zzg.zzb(C0884zze.zza(iBinder).zza(this.zza, this.zzb));
        String string = bundle.getString("Error");
        if (bundle.getBoolean("booleanResult")) {
            return null;
        }
        Throwable th2 = th;
        new C0015GoogleAuthException(string);
        throw th2;
    }
}
