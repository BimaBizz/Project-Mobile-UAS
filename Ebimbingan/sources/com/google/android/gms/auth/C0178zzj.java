package com.google.android.gms.auth;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.logging.C0547Logger;
import com.google.android.gms.internal.auth.C0834zzcd;
import com.google.android.gms.internal.auth.C0884zze;
import java.io.IOException;

/* renamed from: com.google.android.gms.auth.zzj */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0178zzj implements C0180zzl<Boolean> {
    private final /* synthetic */ String zza;

    C0178zzj(String str) {
        this.zza = str;
    }

    public final /* synthetic */ Object zza(IBinder iBinder) throws RemoteException, IOException, C0015GoogleAuthException {
        Throwable th;
        StringBuilder sb;
        Throwable th2;
        Bundle bundle = (Bundle) C0175zzg.zzb(C0884zze.zza(iBinder).zza(this.zza));
        String string = bundle.getString("Error");
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        C0834zzcd zza2 = C0834zzcd.zza(string);
        if (C0834zzcd.zza.equals(zza2)) {
            return 1;
        }
        if (C0834zzcd.zza(zza2)) {
            C0547Logger zza3 = C0175zzg.zze;
            Object[] objArr = new Object[1];
            Object[] objArr2 = objArr;
            Object[] objArr3 = objArr;
            String valueOf = String.valueOf(zza2);
            new StringBuilder(31 + String.valueOf(valueOf).length());
            objArr3[0] = sb.append("isUserRecoverableError status: ").append(valueOf).toString();
            zza3.w("GoogleAuthUtil", objArr2);
            Throwable th3 = th2;
            new C0019UserRecoverableAuthException(string, intent);
            throw th3;
        }
        Throwable th4 = th;
        new C0015GoogleAuthException(string);
        throw th4;
    }
}
