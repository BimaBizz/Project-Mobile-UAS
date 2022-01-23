package com.google.android.gms.auth.api.signin;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.internal.zzv;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class RevocationBoundService extends Service {
    public RevocationBoundService() {
    }

    @Nullable
    public final IBinder onBind(Intent intent) {
        IBinder iBinder;
        String str;
        String str2;
        String str3;
        String str4;
        Intent intent2 = intent;
        if ("com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect".equals(intent2.getAction()) || "com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState".equals(intent2.getAction())) {
            if (Log.isLoggable("RevocationService", 2)) {
                String valueOf = String.valueOf(intent2.getAction());
                String str5 = valueOf;
                if (valueOf.length() != 0) {
                    str2 = "RevocationBoundService handling ".concat(str5);
                } else {
                    str2 = str;
                    new String("RevocationBoundService handling ");
                }
                int v = Log.v("RevocationService", str2);
            }
            new zzv(this);
            return iBinder;
        }
        String valueOf2 = String.valueOf(intent2.getAction());
        String str6 = valueOf2;
        if (valueOf2.length() != 0) {
            str4 = "Unknown action sent to RevocationBoundService: ".concat(str6);
        } else {
            str4 = str3;
            new String("Unknown action sent to RevocationBoundService: ");
        }
        int w = Log.w("RevocationService", str4);
        return null;
    }
}
