package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.util.C0617VisibleForTesting;

@C0617VisibleForTesting
/* renamed from: com.google.android.gms.common.internal.zze */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C0525zze implements ServiceConnection {
    final /* synthetic */ C0424BaseGmsClient zza;
    private final int zzb;

    public C0525zze(C0424BaseGmsClient baseGmsClient, int i) {
        this.zza = baseGmsClient;
        this.zzb = i;
    }

    /* JADX INFO: finally extract failed */
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C0440IGmsServiceBroker iGmsServiceBroker;
        ComponentName componentName2 = componentName;
        IBinder iBinder2 = iBinder;
        if (iBinder2 == null) {
            C0424BaseGmsClient.zzc(this.zza, 16);
            return;
        }
        Object zzd = this.zza.zzq;
        synchronized (zzd) {
            try {
                C0424BaseGmsClient baseGmsClient = this.zza;
                IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof C0440IGmsServiceBroker)) {
                    new C0513zzab(iBinder2);
                } else {
                    iGmsServiceBroker = (C0440IGmsServiceBroker) queryLocalInterface;
                }
                C0440IGmsServiceBroker zze = C0424BaseGmsClient.zze(baseGmsClient, iGmsServiceBroker);
            } catch (Throwable th) {
                Throwable th2 = th;
                Object obj = zzd;
                throw th2;
            }
        }
        this.zza.zzb(0, (Bundle) null, this.zzb);
    }

    /* JADX INFO: finally extract failed */
    public final void onServiceDisconnected(ComponentName componentName) {
        ComponentName componentName2 = componentName;
        Object zzd = this.zza.zzq;
        synchronized (zzd) {
            try {
                C0440IGmsServiceBroker zze = C0424BaseGmsClient.zze(this.zza, (C0440IGmsServiceBroker) null);
            } catch (Throwable th) {
                while (true) {
                    Throwable th2 = th;
                    Object obj = zzd;
                    throw th2;
                }
            }
        }
        Handler handler = this.zza.zzb;
        boolean sendMessage = handler.sendMessage(handler.obtainMessage(6, this.zzb, 1));
    }
}
