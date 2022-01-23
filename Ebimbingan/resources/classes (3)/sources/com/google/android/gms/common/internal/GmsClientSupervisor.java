package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public abstract class GmsClientSupervisor {
    private static int zza = 4225;
    private static final Object zzb;
    private static GmsClientSupervisor zzc;

    static {
        Object obj;
        new Object();
        zzb = obj;
    }

    public GmsClientSupervisor() {
    }

    @KeepForSdk
    public static int getDefaultBindFlags() {
        return zza;
    }

    @RecentlyNonNull
    @KeepForSdk
    public static GmsClientSupervisor getInstance(@RecentlyNonNull Context context) {
        GmsClientSupervisor gmsClientSupervisor;
        Context context2 = context;
        Object obj = zzb;
        synchronized (obj) {
            try {
                if (zzc == null) {
                    new zzq(context2.getApplicationContext());
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

    @KeepForSdk
    public boolean bindService(@RecentlyNonNull ComponentName componentName, @RecentlyNonNull ServiceConnection serviceConnection, @RecentlyNonNull String str) {
        zzm zzm;
        new zzm(componentName, getDefaultBindFlags());
        return zzb(zzm, serviceConnection, str);
    }

    @KeepForSdk
    public void unbindService(@RecentlyNonNull ComponentName componentName, @RecentlyNonNull ServiceConnection serviceConnection, @RecentlyNonNull String str) {
        zzm zzm;
        new zzm(componentName, getDefaultBindFlags());
        zzc(zzm, serviceConnection, str);
    }

    public final void zza(@RecentlyNonNull String str, @RecentlyNonNull String str2, int i, @RecentlyNonNull ServiceConnection serviceConnection, @RecentlyNonNull String str3, boolean z) {
        zzm zzm;
        new zzm(str, str2, i, z);
        zzc(zzm, serviceConnection, str3);
    }

    /* access modifiers changed from: protected */
    public abstract boolean zzb(zzm zzm, ServiceConnection serviceConnection, String str);

    /* access modifiers changed from: protected */
    public abstract void zzc(zzm zzm, ServiceConnection serviceConnection, String str);

    @KeepForSdk
    public boolean bindService(@RecentlyNonNull String str, @RecentlyNonNull ServiceConnection serviceConnection, @RecentlyNonNull String str2) {
        zzm zzm;
        new zzm(str, "com.google.android.gms", getDefaultBindFlags());
        return zzb(zzm, serviceConnection, str2);
    }

    @KeepForSdk
    public void unbindService(@RecentlyNonNull String str, @RecentlyNonNull ServiceConnection serviceConnection, @RecentlyNonNull String str2) {
        zzm zzm;
        new zzm(str, "com.google.android.gms", getDefaultBindFlags());
        zzc(zzm, serviceConnection, str2);
    }
}
