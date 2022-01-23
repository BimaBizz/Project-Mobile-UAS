package com.google.android.gms.auth;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.auth.zzcd;
import com.google.android.gms.internal.auth.zze;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzj implements zzl<Boolean> {
    private final /* synthetic */ String zza;

    zzj(String str) {
        this.zza = str;
    }

    public final /* synthetic */ Object zza(IBinder iBinder) throws RemoteException, IOException, GoogleAuthException {
        Throwable th;
        StringBuilder sb;
        Throwable th2;
        Bundle bundle = (Bundle) zzg.zzb(zze.zza(iBinder).zza(this.zza));
        String string = bundle.getString("Error");
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        zzcd zza2 = zzcd.zza(string);
        if (zzcd.zza.equals(zza2)) {
            return 1;
        }
        if (zzcd.zza(zza2)) {
            Logger zza3 = zzg.zze;
            Object[] objArr = new Object[1];
            Object[] objArr2 = objArr;
            Object[] objArr3 = objArr;
            String valueOf = String.valueOf(zza2);
            new StringBuilder(31 + String.valueOf(valueOf).length());
            objArr3[0] = sb.append("isUserRecoverableError status: ").append(valueOf).toString();
            zza3.w("GoogleAuthUtil", objArr2);
            Throwable th3 = th2;
            new UserRecoverableAuthException(string, intent);
            throw th3;
        }
        Throwable th4 = th;
        new GoogleAuthException(string);
        throw th4;
    }
}
