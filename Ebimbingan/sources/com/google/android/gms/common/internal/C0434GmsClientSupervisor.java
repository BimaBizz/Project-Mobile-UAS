package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C0206KeepForSdk;

@C0206KeepForSdk
/* renamed from: com.google.android.gms.common.internal.GmsClientSupervisor */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public abstract class C0434GmsClientSupervisor {
    private static int zza = 4225;
    private static final Object zzb;
    private static C0434GmsClientSupervisor zzc;

    static {
        Object obj;
        new Object();
        zzb = obj;
    }

    public C0434GmsClientSupervisor() {
    }

    @C0206KeepForSdk
    public static int getDefaultBindFlags() {
        return zza;
    }

    @RecentlyNonNull
    @C0206KeepForSdk
    public static C0434GmsClientSupervisor getInstance(@RecentlyNonNull Context context) {
        C0434GmsClientSupervisor gmsClientSupervisor;
        Context context2 = context;
        Object obj = zzb;
        synchronized (obj) {
            try {
                if (zzc == null) {
                    new C0537zzq(context2.getApplicationContext());
                    zzc = gmsClientSupervisor;
                }
            } catch (Throwable th) {
                while (true) {
                    Throwable th2 = th;
                    Object obj2 = obj;
                    throw th2;
                }
            }
        }
        return zzc;
    }

    @C0206KeepForSdk
    public boolean bindService(@RecentlyNonNull ComponentName componentName, @RecentlyNonNull ServiceConnection serviceConnection, @RecentlyNonNull String str) {
        C0533zzm zzm;
        new C0533zzm(componentName, getDefaultBindFlags());
        return zzb(zzm, serviceConnection, str);
    }

    @C0206KeepForSdk
    public void unbindService(@RecentlyNonNull ComponentName componentName, @RecentlyNonNull ServiceConnection serviceConnection, @RecentlyNonNull String str) {
        C0533zzm zzm;
        new C0533zzm(componentName, getDefaultBindFlags());
        zzc(zzm, serviceConnection, str);
    }

    public final void zza(@RecentlyNonNull String str, @RecentlyNonNull String str2, int i, @RecentlyNonNull ServiceConnection serviceConnection, @RecentlyNonNull String str3, boolean z) {
        C0533zzm zzm;
        new C0533zzm(str, str2, i, z);
        zzc(zzm, serviceConnection, str3);
    }

    /* access modifiers changed from: protected */
    public abstract boolean zzb(C0533zzm zzm, ServiceConnection serviceConnection, String str);

    /* access modifiers changed from: protected */
    public abstract void zzc(C0533zzm zzm, ServiceConnection serviceConnection, String str);

    @C0206KeepForSdk
    public boolean bindService(@RecentlyNonNull String str, @RecentlyNonNull ServiceConnection serviceConnection, @RecentlyNonNull String str2) {
        C0533zzm zzm;
        new C0533zzm(str, "com.google.android.gms", getDefaultBindFlags());
        return zzb(zzm, serviceConnection, str2);
    }

    @C0206KeepForSdk
    public void unbindService(@RecentlyNonNull String str, @RecentlyNonNull ServiceConnection serviceConnection, @RecentlyNonNull String str2) {
        C0533zzm zzm;
        new C0533zzm(str, "com.google.android.gms", getDefaultBindFlags());
        zzc(zzm, serviceConnection, str2);
    }
}
