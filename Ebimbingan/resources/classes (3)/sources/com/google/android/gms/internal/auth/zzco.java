package com.google.android.gms.internal.auth;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.core.content.PermissionChecker;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class zzco implements zzcn {
    @GuardedBy("GservicesLoader.class")
    private static zzco zza;
    @Nullable
    private final Context zzb;
    @Nullable
    private final ContentObserver zzc;

    static zzco zza(Context context) {
        zzco zzco;
        zzco zzco2;
        zzco zzco3;
        Context context2 = context;
        Class<zzco> cls = zzco.class;
        Class<zzco> cls2 = cls;
        synchronized (cls) {
            try {
                if (zza == null) {
                    if (PermissionChecker.checkSelfPermission(context2, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                        zzco2 = zzco3;
                        new zzco(context2);
                    } else {
                        zzco2 = zzco;
                        new zzco();
                    }
                    zza = zzco2;
                }
                zzco zzco4 = zza;
                return zzco4;
            } catch (Throwable th) {
                Throwable th2 = th;
                Class<zzco> cls3 = cls2;
                throw th2;
            }
        }
    }

    private zzco(Context context) {
        ContentObserver contentObserver;
        Context context2 = context;
        this.zzb = context2;
        new zzcq(this, (Handler) null);
        this.zzc = contentObserver;
        context2.getContentResolver().registerContentObserver(zzcf.zza, true, this.zzc);
    }

    private zzco() {
        this.zzb = null;
        this.zzc = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: zzc */
    public final String zza(String str) {
        String str2;
        String str3;
        zzcp zzcp;
        String str4 = str;
        if (this.zzb == null) {
            return null;
        }
        try {
            new zzcr(this, str4);
            return (String) zzcm.zza(zzcp);
        } catch (IllegalStateException | SecurityException e) {
            Throwable th = e;
            String valueOf = String.valueOf(str4);
            String str5 = valueOf;
            if (valueOf.length() != 0) {
                str3 = "Unable to read GServices for: ".concat(str5);
            } else {
                str3 = str2;
                new String("Unable to read GServices for: ");
            }
            int e2 = Log.e("GservicesLoader", str3, th);
            return null;
        }
    }

    static synchronized void zza() {
        synchronized (zzco.class) {
            if (!(zza == null || zza.zzb == null || zza.zzc == null)) {
                zza.zzb.getContentResolver().unregisterContentObserver(zza.zzc);
            }
            zza = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String zzb(String str) {
        return zzcf.zza(this.zzb.getContentResolver(), str, (String) null);
    }
}
