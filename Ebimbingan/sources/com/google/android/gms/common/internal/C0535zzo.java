package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.common.internal.zzo */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
final class C0535zzo implements ServiceConnection, C0538zzr {
    final /* synthetic */ C0537zzq zza;
    private final Map<ServiceConnection, ServiceConnection> zzb;
    private int zzc = 2;
    private boolean zzd;
    @Nullable
    private IBinder zze;
    private final C0533zzm zzf;
    private ComponentName zzg;

    public C0535zzo(C0537zzq zzq, C0533zzm zzm) {
        Map<ServiceConnection, ServiceConnection> map;
        this.zza = zzq;
        this.zzf = zzm;
        new HashMap();
        this.zzb = map;
    }

    /* JADX INFO: finally extract failed */
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ComponentName componentName2 = componentName;
        IBinder iBinder2 = iBinder;
        HashMap zzd2 = this.zza.zza;
        synchronized (zzd2) {
            try {
                this.zza.zzc.removeMessages(1, this.zzf);
                this.zze = iBinder2;
                this.zzg = componentName2;
                for (ServiceConnection onServiceConnected : this.zzb.values()) {
                    onServiceConnected.onServiceConnected(componentName2, iBinder2);
                }
                this.zzc = 1;
            } catch (Throwable th) {
                Throwable th2 = th;
                HashMap hashMap = zzd2;
                throw th2;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void onServiceDisconnected(ComponentName componentName) {
        ComponentName componentName2 = componentName;
        HashMap zzd2 = this.zza.zza;
        synchronized (zzd2) {
            try {
                this.zza.zzc.removeMessages(1, this.zzf);
                this.zze = null;
                this.zzg = componentName2;
                for (ServiceConnection onServiceDisconnected : this.zzb.values()) {
                    onServiceDisconnected.onServiceDisconnected(componentName2);
                }
                this.zzc = 2;
            } catch (Throwable th) {
                Throwable th2 = th;
                HashMap hashMap = zzd2;
                throw th2;
            }
        }
    }

    public final void zza(String str) {
        this.zzc = 3;
        boolean zza2 = this.zza.zzd.zza(this.zza.zzb, str, this.zzf.zzd(this.zza.zzb), this, this.zzf.zzc());
        this.zzd = zza2;
        if (zza2) {
            boolean sendMessageDelayed = this.zza.zzc.sendMessageDelayed(this.zza.zzc.obtainMessage(1, this.zzf), this.zza.zzf);
            return;
        }
        this.zzc = 2;
        try {
            this.zza.zzd.unbindService(this.zza.zzb, this);
        } catch (IllegalArgumentException e) {
        }
    }

    public final void zzb(String str) {
        String str2 = str;
        this.zza.zzc.removeMessages(1, this.zzf);
        this.zza.zzd.unbindService(this.zza.zzb, this);
        this.zzd = false;
        this.zzc = 2;
    }

    public final void zzc(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        String str2 = str;
        ServiceConnection put = this.zzb.put(serviceConnection, serviceConnection2);
    }

    public final void zzd(ServiceConnection serviceConnection, String str) {
        String str2 = str;
        ServiceConnection remove = this.zzb.remove(serviceConnection);
    }

    public final boolean zze() {
        return this.zzd;
    }

    public final int zzf() {
        return this.zzc;
    }

    public final boolean zzg(ServiceConnection serviceConnection) {
        return this.zzb.containsKey(serviceConnection);
    }

    public final boolean zzh() {
        return this.zzb.isEmpty();
    }

    @Nullable
    public final IBinder zzi() {
        return this.zze;
    }

    public final ComponentName zzj() {
        return this.zzg;
    }
}
