package com.google.android.gms.internal.auth;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.core.content.PermissionChecker;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.internal.auth.zzco */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.2 */
final class C0845zzco implements C0844zzcn {
    @GuardedBy("GservicesLoader.class")
    private static C0845zzco zza;
    @Nullable
    private final Context zzb;
    @Nullable
    private final ContentObserver zzc;

    static C0845zzco zza(Context context) {
        C0845zzco zzco;
        C0845zzco zzco2;
        C0845zzco zzco3;
        Context context2 = context;
        Class<C0845zzco> cls = C0845zzco.class;
        Class<C0845zzco> cls2 = cls;
        synchronized (cls) {
            try {
                if (zza == null) {
                    if (PermissionChecker.checkSelfPermission(context2, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                        zzco2 = zzco3;
                        new C0845zzco(context2);
                    } else {
                        zzco2 = zzco;
                        new C0845zzco();
                    }
                    zza = zzco2;
                }
                C0845zzco zzco4 = zza;
                return zzco4;
            } catch (Throwable th) {
                Throwable th2 = th;
                Class<C0845zzco> cls3 = cls2;
                throw th2;
            }
        }
    }

    private C0845zzco(Context context) {
        ContentObserver contentObserver;
        Context context2 = context;
        this.zzb = context2;
        new C0847zzcq(this, (Handler) null);
        this.zzc = contentObserver;
        context2.getContentResolver().registerContentObserver(C0836zzcf.zza, true, this.zzc);
    }

    private C0845zzco() {
        this.zzb = null;
        this.zzc = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: zzc */
    public final String zza(String str) {
        String str2;
        String str3;
        C0846zzcp zzcp;
        String str4 = str;
        if (this.zzb == null) {
            return null;
        }
        try {
            new C0848zzcr(this, str4);
            return (String) C0843zzcm.zza(zzcp);
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
        synchronized (C0845zzco.class) {
            if (!(zza == null || zza.zzb == null || zza.zzc == null)) {
                zza.zzb.getContentResolver().unregisterContentObserver(zza.zzc);
            }
            zza = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String zzb(String str) {
        return C0836zzcf.zza(this.zzb.getContentResolver(), str, (String) null);
    }
}
